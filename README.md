# RapidOs

## Building

1. Setup docker environment
2. Build docker image
3. Start docker container
4. Setup build environment
5. Build image

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

#### Setup Build for default machine
Call bitbake-setup with config file and follow the instructions.
This only needs to be done once, after that you can just init the build environment and start building images.
```bash
bitbake/bin/bitbake-setup init ./conf/rapid-os.conf.json
```

#### Init build environement
```bash
. bitbake-builds/rapid-os-raspberrypi0-2w/build/init-build-env
```

#### Build Production Image
```bash
bitbake rapid-image
```

#### Build Develop Image
```bash
bitbake rapid-develop-image
```

### Updating Build Environment
If you need to update the build environment, for example to get the latest yocto changes, you can run the following command:
```bash
bitbake/bin/bitbake-setup update --setup-dir bitbake-builds/rapid-os-<machine>
```
