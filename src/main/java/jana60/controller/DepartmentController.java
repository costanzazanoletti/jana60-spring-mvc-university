package jana60.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jana60.repository.DepartmentRepository;

@Controller
@RequestMapping("/")
public class DepartmentController {

  @Autowired
  private DepartmentRepository repo;


  @GetMapping
  public String departments(Model model) {
    // List<Department> list = (List<Department>) repo.findAll();
    // for (Department d : list) {
    // System.out.println(d.getId() + " - " + d.getName());
    // }
    // model.addAttribute("departmentList", repo.findAll());
    model.addAttribute("departmentList", repo.findAllByOrderByNameDesc());
    return "departments";
  }
}
