package z0;

import ff.v;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final b f48319a;

    /* renamed from: b, reason: collision with root package name */
    public final p f48320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48321c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48322d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48323e;

    /* renamed from: f, reason: collision with root package name */
    public final L0.b f48324f;

    /* renamed from: g, reason: collision with root package name */
    public final L0.i f48325g;

    /* renamed from: h, reason: collision with root package name */
    public final E0.e f48326h;

    /* renamed from: i, reason: collision with root package name */
    public final long f48327i;

    public m(b bVar, p pVar, int i5, boolean z2, int i10, L0.b bVar2, L0.i iVar, E0.e eVar, long j8) {
        this.f48319a = bVar;
        this.f48320b = pVar;
        this.f48321c = i5;
        this.f48322d = z2;
        this.f48323e = i10;
        this.f48324f = bVar2;
        this.f48325g = iVar;
        this.f48326h = eVar;
        this.f48327i = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f48319a.equals(mVar.f48319a) && AbstractC3340k.a(this.f48320b, mVar.f48320b)) {
                v vVar = v.f35432a;
                if (vVar.equals(vVar) && this.f48321c == mVar.f48321c && this.f48322d == mVar.f48322d && this.f48323e == mVar.f48323e && AbstractC3340k.a(this.f48324f, mVar.f48324f) && this.f48325g == mVar.f48325g && AbstractC3340k.a(this.f48326h, mVar.f48326h) && this.f48327i == mVar.f48327i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f48326h.hashCode() + ((this.f48325g.hashCode() + ((this.f48324f.hashCode() + ((((((((((this.f48320b.hashCode() + (this.f48319a.hashCode() * 31)) * 31) + 1) * 31) + this.f48321c) * 31) + (this.f48322d ? 1231 : 1237)) * 31) + this.f48323e) * 31)) * 31)) * 31)) * 31;
        long j8 = this.f48327i;
        return ((int) (j8 ^ (j8 >>> 32))) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f48319a);
        sb2.append(", style=");
        sb2.append(this.f48320b);
        sb2.append(", placeholders=");
        sb2.append(v.f35432a);
        sb2.append(", maxLines=");
        sb2.append(this.f48321c);
        sb2.append(", softWrap=");
        sb2.append(this.f48322d);
        sb2.append(", overflow=");
        int i5 = this.f48323e;
        sb2.append((Object) (i5 == 1 ? "Clip" : i5 == 2 ? "Ellipsis" : i5 == 3 ? "Visible" : "Invalid"));
        sb2.append(", density=");
        sb2.append(this.f48324f);
        sb2.append(", layoutDirection=");
        sb2.append(this.f48325g);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f48326h);
        sb2.append(", constraints=");
        sb2.append((Object) L0.a.h(this.f48327i));
        sb2.append(')');
        return sb2.toString();
    }
}
