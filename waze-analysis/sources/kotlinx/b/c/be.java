package kotlinx.b.c;

import androidx.autofill.HintConstants;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class be implements kotlinx.b.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final String f50986a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.a.q f50987b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.b.a.q f50988c;

    public /* synthetic */ be(String str, kotlinx.b.a.q qVar, kotlinx.b.a.q qVar2) {
        this.f50986a = str;
        this.f50987b = qVar;
        this.f50988c = qVar2;
    }

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        Integer numF = h.n.o.f(str);
        if (numF != null) {
            return numF.intValue();
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" is not a valid map index"));
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return 2;
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        return String.valueOf(i2);
    }

    @Override // kotlinx.b.a.q
    public final String d() {
        return this.f50986a;
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ List e() {
        return h.a.i.h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return h.g.b.x.n(this.f50986a, beVar.f50986a) && h.g.b.x.n(this.f50987b, beVar.f50987b) && h.g.b.x.n(this.f50988c, beVar.f50988c);
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        if (i2 >= 0) {
            return h.a.i.h();
        }
        throw new IllegalArgumentException("Illegal index " + i2 + ", " + this.f50986a + " expects only non-negative indices");
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.q g(int i2) {
        if (i2 >= 0) {
            return (i2 & 1) != 0 ? this.f50988c : this.f50987b;
        }
        throw new IllegalArgumentException("Illegal index " + i2 + ", " + this.f50986a + " expects only non-negative indices");
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.x h() {
        return kotlinx.b.a.aa.f50902a;
    }

    public final int hashCode() {
        return (((this.f50986a.hashCode() * 31) + this.f50987b.hashCode()) * 31) + this.f50988c.hashCode();
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        if (i2 >= 0) {
            return false;
        }
        throw new IllegalArgumentException("Illegal index " + i2 + ", " + this.f50986a + " expects only non-negative indices");
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ boolean k() {
        return false;
    }

    public final String toString() {
        return this.f50986a + '(' + this.f50987b + ", " + this.f50988c + ')';
    }
}
