package com.example.demo.Hellos.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Hellos.models.Model3;
import com.example.demo.Hellos.models.Model4;
import com.example.demo.Hellos.Controllers.*;
import com.example.demo.Hellos.reposorities.Repo3;
import com.example.demo.Hellos.reposorities.Repo4;

@Controller
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/star1")

public class Control4 {
@Autowired
Repo4 re;
@PostMapping("/st1")
public String mthd7(@RequestBody Model4 jk)
{
re.save(jk);
return "booking successfully done";

}
@GetMapping("/gm1")
List<Model4> getdata(){
return re.findAll();

}
@PutMapping("/ed1/{username}")
public String editdata
(@PathVariable String username,@RequestBody Model4 k)
{
Model4 m=re.findById(username).get();
if(m!=null) {
m.setUsername(k.getUsername());
re.save(m);
return "Updated";
}
else {
return "no update";
}
}
@DeleteMapping("/deletes1/{username}")
public String deletedata(@PathVariable String username)
{
re.deleteById(username);
return "cancelled";
}


}

