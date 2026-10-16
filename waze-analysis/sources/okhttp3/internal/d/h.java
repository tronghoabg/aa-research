package okhttp3.internal.d;

import h.g.b.x;
import okhttp3.ae;
import okhttp3.at;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class h extends at {

    /* renamed from: a, reason: collision with root package name */
    private final String f56071a;

    /* renamed from: b, reason: collision with root package name */
    private final long f56072b;

    /* renamed from: c, reason: collision with root package name */
    private final k.j f56073c;

    public h(String str, long j2, k.j jVar) {
        x.f(jVar, "source");
        this.f56071a = str;
        this.f56072b = j2;
        this.f56073c = jVar;
    }

    @Override // okhttp3.at
    public final long a() {
        return this.f56072b;
    }

    @Override // okhttp3.at
    public final ae b() {
        String str = this.f56071a;
        if (str == null) {
            return null;
        }
        int i2 = ae.f55830a;
        return kotlinx.b.a.b.A(str);
    }

    @Override // okhttp3.at
    public final k.j c() {
        return this.f56073c;
    }
}
