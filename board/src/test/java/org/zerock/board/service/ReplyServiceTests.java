package org.zerock.board.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.ReplyDTO;
import org.zerock.board.entity.Reply;

import java.util.List;

@SpringBootTest
public class ReplyServiceTests {
    @Autowired
    private ReplyService service;

    @Test
    public void testGetList() {
        Long bno = 2L;
        List<ReplyDTO> replyDTOList = service.getList(bno);
        replyDTOList.forEach(replyDTO -> System.out.println(replyDTO));
    }

    @Test
    public void removeTest() {
        Long rno = 2L;
        service.remove(rno);
    }
}
