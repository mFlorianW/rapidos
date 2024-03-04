# LappyOS

## Building
### Docker
#### Build
```bash
docker build --tag lappyos-builder .
```

#### Start
Bash:
```bash
docker run -it --rm -v ${PWD}:/home/builder/lappyos -w /home/builder/lappyos lappyos-builder:latest /bin/bash
```

Fish:
```fish
docker run -it --rm -v {$PWD}:/home/builder/lappyos -w /home/builder/lappyos lappyos-builder:latest /bin/bash
```

### Building Image
