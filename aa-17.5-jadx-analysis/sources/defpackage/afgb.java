package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes3.dex */
public final class afgb implements afib {
    public final afib a;
    public final int b;
    private final afhf c;
    private final List d;

    public afgb(afhf afhfVar, List list, afib afibVar, int i) {
        afhfVar.getClass();
        list.getClass();
        this.c = afhfVar;
        this.d = list;
        this.a = afibVar;
        this.b = i;
    }

    public final String a(boolean z) {
        afhf afhfVar = this.c;
        afhe afheVar = afhfVar instanceof afhe ? (afhe) afhfVar : null;
        Class clsH = afheVar != null ? affa.h(afheVar) : null;
        String string = clsH == null ? afhfVar.toString() : (this.b & 4) != 0 ? "kotlin.Nothing" : clsH.isArray() ? affa.f(clsH, boolean[].class) ? "kotlin.BooleanArray" : affa.f(clsH, char[].class) ? "kotlin.CharArray" : affa.f(clsH, byte[].class) ? "kotlin.ByteArray" : affa.f(clsH, short[].class) ? "kotlin.ShortArray" : affa.f(clsH, int[].class) ? "kotlin.IntArray" : affa.f(clsH, float[].class) ? "kotlin.FloatArray" : affa.f(clsH, long[].class) ? "kotlin.LongArray" : affa.f(clsH, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && clsH.isPrimitive()) ? affa.i((afhe) afhfVar).getName() : clsH.getName();
        List list = this.d;
        String str = string + (list.isEmpty() ? "" : woy.cu(list, ", ", "<", ">", new xrw(19), 24)) + (true == isMarkedNullable() ? "?" : "");
        afib afibVar = this.a;
        if (afibVar instanceof afgb) {
            String strA = ((afgb) afibVar).a(true);
            if (!affa.f(strA, str)) {
                return affa.f(strA, str.concat("?")) ? str.concat("!") : a.bC(strA, str, "(", "..", ")");
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afgb)) {
            return false;
        }
        afgb afgbVar = (afgb) obj;
        return affa.f(this.c, afgbVar.c) && affa.f(this.d, afgbVar.d) && affa.f(this.a, afgbVar.a) && this.b == afgbVar.b;
    }

    @Override // defpackage.afhc
    public final List<Annotation> getAnnotations() {
        return afbe.a;
    }

    @Override // defpackage.afib
    public final List<afid> getArguments() {
        return this.d;
    }

    @Override // defpackage.afib
    public final afhf getClassifier() {
        return this.c;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.b;
    }

    @Override // defpackage.afib
    public final boolean isMarkedNullable() {
        return (this.b & 1) != 0;
    }

    public final String toString() {
        return a(false).concat(" (Kotlin reflection is not available)");
    }
}
