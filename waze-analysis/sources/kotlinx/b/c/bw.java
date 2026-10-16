package kotlinx.b.c;

import androidx.autofill.HintConstants;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bw implements kotlinx.b.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final String f51022a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.a.p f51023b;

    public bw(String str, kotlinx.b.a.p pVar) {
        h.g.b.x.f(str, "serialName");
        h.g.b.x.f(pVar, "kind");
        this.f51022a = str;
        this.f51023b = pVar;
    }

    private final void l() {
        throw new IllegalStateException("Primitive descriptor " + this.f51022a + " does not have elements");
    }

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        l();
        throw new h.e();
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return 0;
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        l();
        throw new h.e();
    }

    @Override // kotlinx.b.a.q
    public final String d() {
        return this.f51022a;
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ List e() {
        return h.a.i.h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bw) {
            bw bwVar = (bw) obj;
            if (h.g.b.x.n(this.f51022a, bwVar.f51022a) && h.g.b.x.n(this.f51023b, bwVar.f51023b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        l();
        throw new h.e();
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.q g(int i2) {
        l();
        throw new h.e();
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ kotlinx.b.a.x h() {
        return this.f51023b;
    }

    public final int hashCode() {
        return this.f51022a.hashCode() + (this.f51023b.hashCode() * 31);
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        l();
        throw new h.e();
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
        return "PrimitiveDescriptor(" + this.f51022a + ')';
    }
}
