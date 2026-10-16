package N1;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3406H;

/* renamed from: N1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770t {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f8264a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8265b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8266c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3409K f8267d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8268e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8269f;

    static {
        N0.a.k(0, 1, 2, 3, 4);
        Q1.x.E(5);
        Q1.x.E(6);
        Q1.x.E(7);
    }

    public C0770t(Uri uri, String str, ic.d dVar, List list, AbstractC3409K abstractC3409K, String str2, long j8) {
        this.f8264a = uri;
        this.f8265b = C.m(str);
        this.f8266c = list;
        this.f8267d = abstractC3409K;
        C3406H c3406hI = AbstractC3409K.i();
        for (int i5 = 0; i5 < abstractC3409K.size(); i5++) {
            ((C0772v) abstractC3409K.get(i5)).getClass();
            c3406hI.a(new C0772v());
        }
        c3406hI.g();
        this.f8268e = str2;
        this.f8269f = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0770t)) {
            return false;
        }
        C0770t c0770t = (C0770t) obj;
        return this.f8264a.equals(c0770t.f8264a) && Objects.equals(this.f8265b, c0770t.f8265b) && Objects.equals(null, null) && this.f8266c.equals(c0770t.f8266c) && this.f8267d.equals(c0770t.f8267d) && Objects.equals(this.f8268e, c0770t.f8268e) && Long.valueOf(this.f8269f).equals(Long.valueOf(c0770t.f8269f));
    }

    public final int hashCode() {
        int iHashCode = this.f8264a.hashCode() * 31;
        String str = this.f8265b;
        int iHashCode2 = (this.f8267d.hashCode() + ((this.f8266c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31;
        return (int) (((iHashCode2 + (this.f8268e != null ? r2.hashCode() : 0)) * 31) + this.f8269f);
    }
}
