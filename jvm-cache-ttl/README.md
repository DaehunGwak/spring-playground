# JVM networkaddress.cache.ttl Test

## Environments

- jdk temurin 21 (Eclipse Termurin version 21.0.1 - aarch64)

## InetAddress 를 이용한 테스트

### networkaddress.cache.ttl=null (default)

기본값은 30초 이후 host 가 변경됨을 확인

<details>
<summary>log</summary>

```log
16:58:18.690 [Test worker] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- networkaddress.cache.ttl: null
16:58:18.693 [Test worker] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- networkaddress.cache.stale.ttl: null
16:58:18.693 [Test worker] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- networkaddress.cache.negative.ttl: 10
16:58:18.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:19.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:20.700 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:21.700 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:22.694 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:23.695 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:24.697 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:25.695 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:26.695 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:27.695 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:28.701 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:29.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:30.701 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:31.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:32.700 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:33.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:34.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:35.700 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:36.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:37.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:38.701 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:39.697 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:40.698 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:41.698 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:42.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:43.696 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:44.696 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:45.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:46.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:47.703 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:48.698 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:58:49.698 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.4
16:58:50.698 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.4
16:58:51.699 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.4
16:58:52.696 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.4
16:58:53.700 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.4
```

</details>

### networkaddress.cache.ttl=60
의도한 대로 60초 이후에 변경되는 모습 확인

<details>
<summary>log</summary>

```log
16:53:51.835 [Test worker] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- networkaddress.cache.ttl: 60
16:53:51.837 [Test worker] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- networkaddress.cache.stale.ttl: null
16:53:51.838 [Test worker] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- networkaddress.cache.negative.ttl: 10
16:53:51.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:53:52.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:53:53.845 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:53:54.848 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:53:55.846 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:53:56.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:53:57.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:53:58.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:53:59.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:00.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:01.845 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:02.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:03.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:04.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:05.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:06.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:07.846 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:08.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:09.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:10.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:11.846 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:12.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:13.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:14.839 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:15.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:16.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:17.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:18.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:19.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:20.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:21.846 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:22.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:23.840 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:24.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:25.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:26.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:27.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:28.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:29.840 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:30.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:31.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:32.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:33.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:34.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:35.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:36.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:37.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:38.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:39.846 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:40.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:41.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:42.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:43.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:44.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:45.848 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:46.844 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:47.839 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:48.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:49.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:50.845 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:51.841 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.2
16:54:52.852 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:54:53.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:54:54.846 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:54:55.840 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:54:56.842 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3
16:54:57.843 [Timer-0] INFO io.ordi.spring.jvmcachettl.study.JvmCacheTtlScheduledTest -- HostName/IP: test.jvmcachettl.io/127.0.0.3```

</details>

## Commands to check host ip

```sh
# dns 서버를 통한 방법
host <host_name>
# local mac /etc/hosts 에 정상 등록되었는지 확인하는 방법
dscacheutil -q host -a name <host_name>
```

## References

- [네이버 페이 개발 블로그: JVM의 DNS Cache 설정에 따른 갱신시간 테스트](https://medium.com/naverfinancial/jvm%EC%9D%98-dns-cache-%EC%84%A4%EC%A0%95%EC%97%90-%EB%94%B0%EB%A5%B8-%EA%B0%B1%EC%8B%A0%EC%8B%9C%EA%B0%84-%ED%85%8C%EC%8A%A4%ED%8A%B8-c66d7b871302)
- [devkuma 님 블로그: MacOS hosts 파일 수정하기](https://www.devkuma.com/docs/mac-os/hosts/)