package com.project.coinscape.entities;

import com.project.coinscape.entities.constants.BaseEntity;
import com.project.coinscape.entities.constants.EStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "m_upgrade_request")
public class UpgradeRequest extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private EStatus status;
    private LocalDateTime requestDate;
    private LocalDateTime acceptDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
