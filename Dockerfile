FROM ubuntu:22.04

ARG UID=1000
ARG GID=1000


RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get -y install gawk wget git-core \
    diffstat unzip texinfo gcc-multilib build-essential \
    chrpath socat cpio python3 python3-pip \
    python3-pexpect xz-utils debianutils iputils-ping \
    libsdl1.2-dev xterm tar locales sudo \
    file lz4 zstd

RUN locale-gen en_US.UTF-8 && update-locale LC_ALL=en_US.UTF-8 LANG=en_US.UTF-8
ENV LANG en_US.UTF-8
ENV LC_ALL en_US.UTF-8

ENV USER_NAME  builder
RUN echo "${USER_NAME} ALL=(ALL) NOPASSWD: ALL" > /etc/sudoers.d/${USER_NAME} && \
    chmod 0440 /etc/sudoers.d/${USER_NAME}

RUN groupadd -g ${GID} $USER_NAME && useradd -g ${GID} -m -s /bin/bash -u ${UID} $USER_NAME

USER $USER_NAME
