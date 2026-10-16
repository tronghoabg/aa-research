package j$.nio.file;

import j$.nio.file.spi.FileSystemProvider;
import java.io.Closeable;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class i implements Closeable {
    public abstract Set H();

    public abstract Iterable e();

    public abstract Path g(String str, String... strArr);

    public abstract x i(String str);

    public abstract boolean isOpen();

    public abstract Iterable j();

    public abstract String n();

    public abstract j$.com.android.tools.r8.a p();

    public abstract boolean q();

    public abstract p0 r();

    public abstract FileSystemProvider v();
}
