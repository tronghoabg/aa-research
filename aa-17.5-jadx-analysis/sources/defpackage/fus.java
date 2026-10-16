package defpackage;

import com.android.car.libraries.apphost.internal.model.AlphaJumpTemplate;

/* loaded from: classes2.dex */
public final class fus implements gmw {
    public final AlphaJumpTemplate a;
    private final boolean b = true;

    public fus(AlphaJumpTemplate alphaJumpTemplate) {
        this.a = alphaJumpTemplate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fus)) {
            return false;
        }
        fus fusVar = (fus) obj;
        if (!affa.f(this.a, fusVar.a)) {
            return false;
        }
        boolean z = fusVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "AlphaJumpKeyboardInternalModel(alphaJumpTemplate=" + this.a + ", shouldHideTabs=true)";
    }
}
