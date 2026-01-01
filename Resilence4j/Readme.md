### Resilence 4j 

The Repo contains basic experimentation/implementation of various
Resilence 4j offering.

1. CircuitBreaker Annotation : <br>
    Edge case : it doesn't together work with Retry annotation
    <br> Reason : `TODO`
    <br> Circuit Breaker provides a mechanism to fallback to predefined method in case of api failures over a period of time in case the failure persists over longer periods of time reducing the overhead of api calls for a interval of time until recovery.