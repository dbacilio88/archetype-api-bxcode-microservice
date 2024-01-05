package com.bxcode.microservices.repositories.entities;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;


/**
 * DemoEntity
 * <p>
 * DemoEntity class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author bxcode
 * @author bacsystem.sac@gmail.com
 * @since 28/12/2023
 */


@Entity
@Table(name = "BC_DEMO",
    schema = "PUBLIC",
    indexes = {
        @Index(name = "BC_DEMO_UN_UUID", columnList = "DE_UUID", unique = true),
        @Index(name = "BC_DEMO_UN_CODE", columnList = "DE_CODE", unique = true),
    })
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BC_DEMO_SEQ")
    @SequenceGenerator(name = "BC_DEMO_SEQ", sequenceName = "BC_DEMO_SEQ", allocationSize = 1)
    @Column(name = "DE_ID", nullable = false)
    private Long id;

    @Column(name = "DE_UUID", nullable = false, length = 36)
    private UUID uuId;

    @Column(name = "DE_CODE", nullable = false, length = 20)
    private String code;

    @Column(name = "DE_NAME", nullable = false, length = 30)
    private String name;
}
