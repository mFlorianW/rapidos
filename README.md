# RapidOs

## Building
### Docker
#### Build
```bash
docker build --tag rapidos-builder .
```

#### Start
Bash:
```bash
docker run -it --rm -v ${PWD}:/home/builder/rapidos -w /home/builder/rapidos lappyos-builder:latest /bin/bash
```

Fish:
```fish
docker run -it --rm -v {$PWD}:/home/builder/rapidos -w /home/builder/rapidos lappyos-builder:latest /bin/bash
```

### Building Image
