package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private String f46610a = "unknown-authority";

    /* renamed from: b, reason: collision with root package name */
    private e.a.c f46611b = e.a.c.f46513a;

    /* renamed from: c, reason: collision with root package name */
    private String f46612c;

    /* renamed from: d, reason: collision with root package name */
    private e.a.aq f46613d;

    public al() {
        new ak(this);
    }

    public final e.a.c a() {
        return this.f46611b;
    }

    public final e.a.aq b() {
        return this.f46613d;
    }

    public final String c() {
        return this.f46610a;
    }

    public final void d(String str) {
        com.google.d.b.an.C(str, "authority");
        this.f46610a = str;
    }

    public final void e(e.a.c cVar) {
        this.f46611b = cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (this.f46610a.equals(alVar.f46610a) && this.f46611b.equals(alVar.f46611b)) {
            String str = alVar.f46612c;
            if (Objects.equals(null, null) && Objects.equals(this.f46613d, alVar.f46613d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(e.a.aq aqVar) {
        this.f46613d = aqVar;
    }

    public final void g() {
        this.f46612c = null;
    }

    public final int hashCode() {
        return Objects.hash(this.f46610a, this.f46611b, null, this.f46613d);
    }
}
