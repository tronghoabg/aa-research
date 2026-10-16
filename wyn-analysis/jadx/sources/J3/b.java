package J3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import x9.C4504d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5544a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f5545b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* renamed from: c, reason: collision with root package name */
    public final y f5546c;

    /* renamed from: d, reason: collision with root package name */
    public final ya.b f5547d;

    /* renamed from: e, reason: collision with root package name */
    public final xa.d f5548e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5549f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5550g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5551h;

    public b(C4504d c4504d) {
        String str = z.f5591a;
        this.f5546c = new y();
        this.f5547d = new ya.b(19);
        this.f5548e = new xa.d(14);
        this.f5549f = 4;
        this.f5550g = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f5551h = 20;
    }
}
