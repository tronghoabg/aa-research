package kotlinx.b.a;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlinx.b.c.ca;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac implements q {

    /* renamed from: a, reason: collision with root package name */
    private final String f50904a;

    /* renamed from: b, reason: collision with root package name */
    private final q f50905b;

    public ac(String str, q qVar) {
        h.g.b.x.f(str, "serialName");
        h.g.b.x.f(qVar, "original");
        this.f50904a = str;
        this.f50905b = qVar;
    }

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return this.f50905b.a(str);
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return this.f50905b.b();
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        return this.f50905b.c(i2);
    }

    @Override // kotlinx.b.a.q
    public final String d() {
        return this.f50904a;
    }

    @Override // kotlinx.b.a.q
    public final List e() {
        return this.f50905b.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ac) {
            ac acVar = (ac) obj;
            if (h.g.b.x.n(this.f50904a, acVar.f50904a) && h.g.b.x.n(this.f50905b, acVar.f50905b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        return this.f50905b.f(i2);
    }

    @Override // kotlinx.b.a.q
    public final q g(int i2) {
        return this.f50905b.g(i2);
    }

    @Override // kotlinx.b.a.q
    public final x h() {
        return this.f50905b.h();
    }

    public final int hashCode() {
        return (this.f50904a.hashCode() * 31) + this.f50905b.hashCode();
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        return this.f50905b.i(i2);
    }

    @Override // kotlinx.b.a.q
    public final boolean j() {
        return this.f50905b.j();
    }

    @Override // kotlinx.b.a.q
    public final boolean k() {
        return this.f50905b.k();
    }

    public final String toString() {
        return ca.b(this);
    }
}
