package kotlinx.b.a;

import androidx.autofill.HintConstants;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c implements q {

    /* renamed from: a, reason: collision with root package name */
    public final h.l.c f50906a;

    /* renamed from: b, reason: collision with root package name */
    private final q f50907b;

    /* renamed from: c, reason: collision with root package name */
    private final String f50908c;

    public c(q qVar, h.l.c cVar) {
        h.g.b.x.f(qVar, "original");
        h.g.b.x.f(cVar, "kClass");
        this.f50907b = qVar;
        this.f50906a = cVar;
        this.f50908c = qVar.d() + '<' + cVar.c() + '>';
    }

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return this.f50907b.a(str);
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return this.f50907b.b();
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        return this.f50907b.c(i2);
    }

    @Override // kotlinx.b.a.q
    public final String d() {
        return this.f50908c;
    }

    @Override // kotlinx.b.a.q
    public final List e() {
        return this.f50907b.e();
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && h.g.b.x.n(this.f50907b, cVar.f50907b) && h.g.b.x.n(cVar.f50906a, this.f50906a);
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        return this.f50907b.f(i2);
    }

    @Override // kotlinx.b.a.q
    public final q g(int i2) {
        return this.f50907b.g(i2);
    }

    @Override // kotlinx.b.a.q
    public final x h() {
        return this.f50907b.h();
    }

    public final int hashCode() {
        return (this.f50906a.hashCode() * 31) + this.f50908c.hashCode();
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        return this.f50907b.i(i2);
    }

    @Override // kotlinx.b.a.q
    public final boolean j() {
        return this.f50907b.j();
    }

    @Override // kotlinx.b.a.q
    public final boolean k() {
        return this.f50907b.k();
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f50906a + ", original: " + this.f50907b + ')';
    }
}
