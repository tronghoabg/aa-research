package N1;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import za.C4658a;

/* renamed from: N1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773w {

    /* renamed from: a, reason: collision with root package name */
    public final String f8271a;

    /* renamed from: b, reason: collision with root package name */
    public final C0770t f8272b;

    /* renamed from: c, reason: collision with root package name */
    public final C0769s f8273c;

    /* renamed from: d, reason: collision with root package name */
    public final z f8274d;

    /* renamed from: e, reason: collision with root package name */
    public final r f8275e;

    /* renamed from: f, reason: collision with root package name */
    public final C0771u f8276f;

    static {
        J5.n nVar = new J5.n(3);
        C3407I c3407i = AbstractC3409K.f40056b;
        e0 e0Var = e0.f40101e;
        List list = Collections.EMPTY_LIST;
        e0 e0Var2 = e0.f40101e;
        E5.Y y10 = new E5.Y();
        C0771u c0771u = C0771u.f8270a;
        nVar.a();
        y10.b();
        z zVar = z.f8304B;
        N0.a.k(0, 1, 2, 3, 4);
        Q1.x.E(5);
    }

    public C0773w(String str, r rVar, C0770t c0770t, C0769s c0769s, z zVar, C0771u c0771u) {
        this.f8271a = str;
        this.f8272b = c0770t;
        this.f8273c = c0769s;
        this.f8274d = zVar;
        this.f8275e = rVar;
        this.f8276f = c0771u;
    }

    public final C0767p a() {
        C0767p c0767p = new C0767p();
        c0767p.f8250d = new J5.n(3);
        c0767p.f8251e = new C4658a();
        c0767p.f8252f = Collections.EMPTY_LIST;
        c0767p.f8253g = e0.f40101e;
        c0767p.k = new E5.Y();
        c0767p.f8257l = C0771u.f8270a;
        c0767p.f8255i = -9223372036854775807L;
        r rVar = this.f8275e;
        J5.n nVar = new J5.n();
        nVar.f5655a = rVar.f8258a;
        c0767p.f8250d = nVar;
        c0767p.f8247a = this.f8271a;
        c0767p.f8256j = this.f8274d;
        c0767p.k = this.f8273c.a();
        c0767p.f8257l = this.f8276f;
        C0770t c0770t = this.f8272b;
        if (c0770t != null) {
            c0767p.f8249c = c0770t.f8265b;
            c0767p.f8248b = c0770t.f8264a;
            c0767p.f8252f = c0770t.f8266c;
            c0767p.f8253g = c0770t.f8267d;
            c0767p.f8254h = c0770t.f8268e;
            c0767p.f8251e = new C4658a();
            c0767p.f8255i = c0770t.f8269f;
        }
        return c0767p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0773w)) {
            return false;
        }
        C0773w c0773w = (C0773w) obj;
        String str = c0773w.f8271a;
        int i5 = Q1.x.f9724a;
        return Objects.equals(this.f8271a, str) && this.f8275e.equals(c0773w.f8275e) && Objects.equals(this.f8272b, c0773w.f8272b) && this.f8273c.equals(c0773w.f8273c) && Objects.equals(this.f8274d, c0773w.f8274d) && Objects.equals(this.f8276f, c0773w.f8276f);
    }

    public final int hashCode() {
        int iHashCode = this.f8271a.hashCode() * 31;
        C0770t c0770t = this.f8272b;
        int iHashCode2 = (this.f8274d.hashCode() + ((this.f8275e.hashCode() + ((this.f8273c.hashCode() + ((iHashCode + (c0770t != null ? c0770t.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f8276f.getClass();
        return iHashCode2;
    }
}
