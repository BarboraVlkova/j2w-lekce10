package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.SkolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SkolaController {

    private final SkolaService skolaService;

    @Autowired
    public SkolaController(SkolaService skolaService) {
        this.skolaService = skolaService;
    }

    @GetMapping("/")
    public ModelAndView seznamTrid() {
        return new ModelAndView("uvodniStranka")
                .addObject("tridy", skolaService.seznamTrid());
    }

    @GetMapping("/{trida}")
    public Object detailTridy(@PathVariable short trida) {
        return new ModelAndView("detailTridy")
                .addObject("tridaJmeno", skolaService.detailJedneTridy(trida));
    }

    @GetMapping("/{student}/{id}")
    public Object detailStudenta(@PathVariable Integer id) {
        return new ModelAndView("detailStudenta")
                .addObject("studentJmeno", skolaService.detailJednohoStudenta(id));
    }


}