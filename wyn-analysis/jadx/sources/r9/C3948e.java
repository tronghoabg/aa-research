package r9;

import java.util.concurrent.TimeUnit;
import ne.C3618a;
import p7.AbstractC3772b;
import w9.C4386e;

/* renamed from: r9.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3948e {

    /* renamed from: f, reason: collision with root package name */
    public static final long f44610f = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: g, reason: collision with root package name */
    public static final long f44611g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final C3618a f44612a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3772b f44613b;

    /* renamed from: c, reason: collision with root package name */
    public final C3947d f44614c;

    /* renamed from: d, reason: collision with root package name */
    public final C3947d f44615d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44616e;

    public C3948e(AbstractC3772b abstractC3772b, C4386e c4386e, C3955l c3955l) {
        C3947d c3947d = new C3947d(c3955l, 0);
        C3947d c3947d2 = new C3947d(c3955l, 1);
        this.f44616e = 50;
        this.f44613b = abstractC3772b;
        C3618a c3618a = new C3618a();
        c3618a.f41022c = this;
        c3618a.f41021b = c4386e;
        this.f44612a = c3618a;
        this.f44614c = c3947d;
        this.f44615d = c3947d2;
    }
}
