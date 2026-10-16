package Cd;

/* loaded from: classes5.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vg.b f2162a = vg.d.c("io.ktor.client.plugins.HttpTimeout");

    /* renamed from: b, reason: collision with root package name */
    public static final Dd.c f2163b = U8.v0.s("HttpTimeout", o0.f2149a, new Ad.g(14));

    public static final int a(long j8) {
        if (j8 == Long.MAX_VALUE) {
            return 0;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return j8 > 2147483647L ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : (int) j8;
    }
}
