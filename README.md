# WeatherSender
A tool to pull weather forecasts from various sources and then send it on


digraph {
Start -> "Perform task A";
"Perform task A" -> "Check condition X";
"Check condition X" -> "Continue with task B" [label="True"];
"Check condition X" -> "End the process" [label="False"];
}