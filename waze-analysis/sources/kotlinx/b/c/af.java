package kotlinx.b.c;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af extends br {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.x f50954a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f50955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(String str, int i2) {
        super(str, null, i2);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f50954a = kotlinx.b.a.w.f50939a;
        this.f50955b = h.g.a(new ae(i2, str, this, 0));
    }

    @Override // kotlinx.b.c.br
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kotlinx.b.a.q)) {
            return false;
        }
        kotlinx.b.a.q qVar = (kotlinx.b.a.q) obj;
        return qVar.h() == kotlinx.b.a.w.f50939a && h.g.b.x.n(d(), qVar.d()) && h.g.b.x.n(bp.a(this), bp.a(qVar));
    }

    @Override // kotlinx.b.c.br, kotlinx.b.a.q
    public final kotlinx.b.a.q g(int i2) {
        return ((kotlinx.b.a.q[]) this.f50955b.getValue())[i2];
    }

    @Override // kotlinx.b.c.br, kotlinx.b.a.q
    public final kotlinx.b.a.x h() {
        return this.f50954a;
    }

    @Override // kotlinx.b.c.br
    public final int hashCode() {
        int iHashCode = d().hashCode();
        int iHashCode2 = 1;
        for (String str : h.k.n.C(this)) {
            int i2 = iHashCode2 * 31;
            iHashCode2 = i2 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // kotlinx.b.c.br
    public final String toString() {
        return h.a.i.aM(h.k.n.C(this), ", ", d() + '(', ")", 0, null, 56);
    }
}
