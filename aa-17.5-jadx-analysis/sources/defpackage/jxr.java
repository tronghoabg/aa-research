package defpackage;

import androidx.car.app.model.Action;
import java.util.List;

/* loaded from: classes2.dex */
public final class jxr implements hju {
    public final List a;
    public final Action b;
    public final Integer c;
    public afdr d = null;
    public final Integer e;

    public jxr(List list, Action action, Integer num, Integer num2) {
        this.a = list;
        this.b = action;
        this.c = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxr)) {
            return false;
        }
        jxr jxrVar = (jxr) obj;
        return affa.f(this.a, jxrVar.a) && affa.f(this.b, jxrVar.b) && affa.f(this.c, jxrVar.c) && affa.f(this.d, jxrVar.d) && affa.f(this.e, jxrVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Action action = this.b;
        int iHashCode2 = (((iHashCode + (action == null ? 0 : action.hashCode())) * 31) + this.c.hashCode()) * 31;
        afdr afdrVar = this.d;
        return ((iHashCode2 + (afdrVar != null ? afdrVar.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "WrapperMenuViewUiModel(wrappers=" + this.a + ", gutterAction=" + this.b + ", jumpPosition=" + this.c + ", hackyRequestFocus=" + this.d + ", id=" + this.e + ")";
    }
}
