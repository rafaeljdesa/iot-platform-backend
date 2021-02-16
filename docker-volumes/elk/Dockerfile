FROM sebp/elk

# overwrite existing config files
ADD /logstash/30-output.conf /etc/logstash/conf.d/30-output.conf
ADD /logstash/02-beats-input.conf /etc/logstash/conf.d/02-beats-input.conf