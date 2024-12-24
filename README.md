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
docker run -it --rm -v ${PWD}:/home/builder/rapidos -w /home/builder/rapidos rapidos-builder:latest /bin/bash
```

Fish:
```fish
docker run -it --rm -v {$PWD}:/home/builder/rapidos -w /home/builder/rapidos rapidos-builder:latest /bin/bash
```

### Building Image
#### Init Build for default machine
```bash
./init-build
```

#### Init Build for specific machine
```bash
./init-build  -m <machine>
```

Supported Machines:
* pi02w
* pi3

#### Build Production Image
```bash
bitbake rapid-image
```

#### Build Develop Image
```bash
bitbake rapid-develop-image
```
