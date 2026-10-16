package e.a.d;

import java.net.URI;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ke implements kf {

    /* renamed from: a, reason: collision with root package name */
    private final URI f47277a;

    /* synthetic */ ke(URI uri) {
        com.google.d.b.an.B(uri);
        this.f47277a = uri;
    }

    @Override // e.a.d.kf
    public final e.a.dd a(e.a.cz czVar, e.a.cx cxVar) {
        return czVar.b(this.f47277a, cxVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ke) {
            return this.f47277a.equals(((ke) obj).f47277a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47277a.hashCode();
    }

    public final String toString() {
        return this.f47277a.toString();
    }
}
