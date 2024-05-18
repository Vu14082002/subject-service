package vn.edu.iuh.fit.subjectservice.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SubjectConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(SubjectConsumer.class);

//    @RabbitListener(queues = {"${spring.rabbitmq.queue.student.auth}"})
//    public void receiveOrder(SinhVienEvent sinhVienEvent) {
//        LOGGER.info(String.format("Received order: %s", sinhVienEvent.getStudentId()));
//        LOGGER.info(String.format("Received order: %s", sinhVienEvent.getPassword()));
//    }
}

