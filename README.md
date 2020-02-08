# mock-scheduled-requests
Was wondering if there was a way to schdule mock request calls without writing a new application but tinkering with an existing code.

@EnabledSchedule
- Ensures a background task executor is created.

@Scheduled
- Can only be applied on methods with input arguments, had to create a new method.
