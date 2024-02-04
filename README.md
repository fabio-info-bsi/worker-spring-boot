# worker-spring-boot
Um exemplo de worker com spring boot usando @Scheduled ou qualquer outro tipo de consumidor (Aws SQS, JSM, Kafka, outros).

## Usou/Criou:
- @EnableScheduling & @Scheduled(fixedRate = 10_000, initialDelay = 10_000)
- Lombok (@Slf4j, @AllArgsConstructor, etc)
- @Service