package j$.nio.file;

import j$.nio.file.spi.FileSystemProvider;
import java.net.URI;
import java.security.AccessController;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final i f49755a = ((FileSystemProvider) AccessController.doPrivileged(new j(0))).j(URI.create("file:///"));
}
