package io.matoshri.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Calendar;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Message is required.")
    private String text;

    @NotEmpty(message = "Summary is required.")
    private String summary;

    private Calendar created = Calendar.getInstance();

    @OneToOne
    private User to;
}
