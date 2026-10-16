package A3;

import A0.p;
import A7.AbstractC0279p0;
import Bf.k;
import R8.v;
import ef.C2532p;
import java.math.BigInteger;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final h f295f;

    /* renamed from: a, reason: collision with root package name */
    public final int f296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f298c;

    /* renamed from: d, reason: collision with root package name */
    public final String f299d;

    /* renamed from: e, reason: collision with root package name */
    public final C2532p f300e = Fe.c.z(new p(this, 1));

    static {
        new h(0, 0, 0, "");
        f295f = new h(0, 1, 0, "");
        new h(1, 0, 0, "");
    }

    public h(int i5, int i10, int i11, String str) {
        this.f296a = i5;
        this.f297b = i10;
        this.f298c = i11;
        this.f299d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h other = (h) obj;
        AbstractC3340k.e(other, "other");
        Object value = this.f300e.getValue();
        AbstractC3340k.d(value, "<get-bigInteger>(...)");
        Object value2 = other.f300e.getValue();
        AbstractC3340k.d(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f296a == hVar.f296a && this.f297b == hVar.f297b && this.f298c == hVar.f298c;
    }

    public final int hashCode() {
        return ((((527 + this.f296a) * 31) + this.f297b) * 31) + this.f298c;
    }

    public final String toString() {
        String str = this.f299d;
        String strF = !k.y0(str) ? v.f("-", str) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f296a);
        sb2.append('.');
        sb2.append(this.f297b);
        sb2.append('.');
        return AbstractC0279p0.j(this.f298c, strF, sb2);
    }
}
