package defpackage;

import androidx.car.app.model.Action;
import java.util.List;

/* loaded from: classes2.dex */
public final class fur implements gmo {
    public final gml a;
    public final gru b;
    public final Action c;
    public final List d;
    public final String e;

    public fur(gml gmlVar, gru gruVar, Action action, List list, String str) {
        this.a = gmlVar;
        this.b = gruVar;
        this.c = action;
        this.d = list;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fur)) {
            return false;
        }
        fur furVar = (fur) obj;
        return this.a == furVar.a && affa.f(this.b, furVar.b) && affa.f(this.c, furVar.c) && affa.f(this.d, furVar.d) && affa.f(this.e, furVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        String str = this.e;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AlphaJumpInternalModel(state=" + this.a + ", listModel=" + this.b + ", alphaJumpAction=" + this.c + ", keyboardActions=" + this.d + ", jumpKey=" + this.e + ")";
    }
}
