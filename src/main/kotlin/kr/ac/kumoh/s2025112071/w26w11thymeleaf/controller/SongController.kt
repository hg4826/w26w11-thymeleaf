package kr.ac.kumoh.s2025112071.w26w11thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandomSong(): String {
        return "random"
    }
}
