package j$.util.stream;

import java.security.AccessController;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class t8 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f50623a = ((Boolean) AccessController.doPrivileged(new j$.nio.file.j(5))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(j$.desugar.sun.nio.fs.h.a(String.valueOf(cls), " tripwire tripped but logging not supported: ", str));
    }
}
