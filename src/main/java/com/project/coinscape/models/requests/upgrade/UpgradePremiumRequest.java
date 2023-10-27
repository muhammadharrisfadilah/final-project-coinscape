package com.project.coinscape.models.requests.upgrade;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UpgradePremiumRequest {
   private String userId;
   private String upgradeRequestId;
}
