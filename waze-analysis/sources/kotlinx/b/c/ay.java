package kotlinx.b.c;

import androidx.autofill.HintConstants;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class ay implements kotlinx.b.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.a.q f50977a;

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        Integer numF = h.n.o.f(str);
        if (numF != null) {
            return numF.intValue();
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" is not a valid list index"));
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return 1;
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        return String.valueOf(i2);
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ List e() {
        return h.a.i.h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        return h.g.b.x.n(this.f50977a, ayVar.f50977a) && h.g.b.x.n(d(), ayVar.d());
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        if (i2 >= 0) {
            return h.a.i.h();
        }
        throw new IllegalArgumentException("Illegal index " + i2 + ", " + d() + " expects only non-negative indices");
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.q g(int i2) {
        if (i2 >= 0) {
            return this.f50977a;
        }
        throw new IllegalArgumentException("Illegal index " + i2 + ", " + d() + " expects only non-negative indices");
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.x h() {
        return kotlinx.b.a.z.f50941a;
    }

    public final int hashCode() {
        return (this.f50977a.hashCode() * 31) + d().hashCode();
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        if (i2 >= 0) {
            return false;
        }
        throw new IllegalArgumentException("Illegal index " + i2 + ", " + d() + " expects only non-negative indices");
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
        return d() + '(' + this.f50977a + ')';
    }
}
