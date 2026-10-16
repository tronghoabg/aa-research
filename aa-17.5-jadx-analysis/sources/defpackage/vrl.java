package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class vrl extends vmc {
    public vrl(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    public final String e() {
        Long lValueOf;
        Locale locale = Locale.US;
        ajgu ajguVar = this.a;
        ajem ajemVar = ajguVar.k;
        if (ajemVar == null) {
            ajemVar = ajem.a;
        }
        ajel ajelVar = ajemVar.c;
        if (ajelVar == null) {
            ajelVar = ajel.a;
        }
        if ((ajelVar.b & 64) != 0) {
            ajem ajemVar2 = ajguVar.k;
            if (ajemVar2 == null) {
                ajemVar2 = ajem.a;
            }
            ajel ajelVar2 = ajemVar2.c;
            if (ajelVar2 == null) {
                ajelVar2 = ajel.a;
            }
            lValueOf = Long.valueOf(ajelVar2.i);
        } else {
            lValueOf = null;
        }
        String strF = f(lValueOf);
        ajem ajemVar3 = ajguVar.k;
        if (ajemVar3 == null) {
            ajemVar3 = ajem.a;
        }
        ajel ajelVar3 = ajemVar3.c;
        if (ajelVar3 == null) {
            ajelVar3 = ajel.a;
        }
        ajeu ajeuVar = ajelVar3.j;
        if (ajeuVar == null) {
            ajeuVar = ajeu.a;
        }
        int i = ajeuVar.c;
        double d = (262144 & i) != 0 ? 0.0d + ajeuVar.ao : 0.0d;
        if ((i & 524288) != 0) {
            d += ajeuVar.ap;
        }
        return String.format(locale, "duration: %s, avgCpu: %.2f %%", strF, Double.valueOf(d / ajeuVar.d));
    }

    @Override // defpackage.vmc
    public final String g() {
        ajem ajemVar = this.a.k;
        if (ajemVar == null) {
            ajemVar = ajem.a;
        }
        ajel ajelVar = ajemVar.c;
        if (ajelVar == null) {
            ajelVar = ajel.a;
        }
        int iAs = a.as(ajelVar.c);
        if (iAs == 0) {
            iAs = 1;
        }
        StringBuilder sb = new StringBuilder("Battery - ");
        sb.append(iAs == 2 ? "Background" : "Foreground");
        sb.append(" measurement");
        return sb.toString();
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 256) != 0;
    }
}
