package Ld;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Wd.d f7093a;

    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        f7093a = property != null ? Boolean.parseBoolean(property) : false ? new d() : new Kd.e(4096, 2);
    }
}
