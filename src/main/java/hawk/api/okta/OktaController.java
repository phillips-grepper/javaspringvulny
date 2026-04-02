package hawk.api.okta;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/okta")
public class OktaController {

    @GetMapping("/me/token")
    public ResponseEntity<OktaIdInfo> me() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        OktaIdInfo oktaInfo = new OktaIdInfo(username);
        return ResponseEntity.ok(oktaInfo);
    }

}

