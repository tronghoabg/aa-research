package kotlinx.b.c;

import androidx.autofill.HintConstants;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends br {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f50965a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(String str, ak akVar) {
        super(str, akVar, 1);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(akVar, "generatedSerializer");
        this.f50965a = true;
    }

    @Override // kotlinx.b.c.br
    public final boolean equals(Object obj) {
        ao aoVar = this;
        if (aoVar == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        kotlinx.b.a.q qVar = (kotlinx.b.a.q) obj;
        if (!h.g.b.x.n(aoVar.d(), qVar.d())) {
            return false;
        }
        ao aoVar2 = (ao) obj;
        if (!aoVar2.f50965a || !Arrays.equals(o(), aoVar2.o()) || aoVar.b() != qVar.b()) {
            return false;
        }
        int iB = aoVar.b();
        for (int i2 = 0; i2 < iB; i2++) {
            if (!h.g.b.x.n(aoVar.g(i2).d(), qVar.g(i2).d()) || !h.g.b.x.n(aoVar.g(i2).h(), qVar.g(i2).h())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.b.c.br
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.b.c.br, kotlinx.b.a.q
    public final boolean j() {
        return this.f50965a;
    }
}
