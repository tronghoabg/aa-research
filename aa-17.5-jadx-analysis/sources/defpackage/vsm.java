package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class vsm extends vmc {
    public vsm(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    public final String e() {
        Locale locale = Locale.US;
        ajgu ajguVar = this.a;
        ajev ajevVar = ajguVar.p;
        if (ajevVar == null) {
            ajevVar = ajev.a;
        }
        Integer numValueOf = Integer.valueOf(ajevVar.g);
        ajev ajevVar2 = ajguVar.p;
        if (ajevVar2 == null) {
            ajevVar2 = ajev.a;
        }
        String strF = f(Long.valueOf(ajevVar2.e));
        ajev ajevVar3 = ajguVar.p;
        if (ajevVar3 == null) {
            ajevVar3 = ajev.a;
        }
        String strF2 = f(Long.valueOf(ajevVar3.d));
        ajev ajevVar4 = ajguVar.p;
        if (ajevVar4 == null) {
            ajevVar4 = ajev.a;
        }
        Integer numValueOf2 = Integer.valueOf(ajevVar4.f);
        ajev ajevVar5 = ajguVar.p;
        if (ajevVar5 == null) {
            ajevVar5 = ajev.a;
        }
        return String.format(locale, "Method trace sample - bufferSize: %s,  actual duration: %s, scheduled duration: %s, sampling frequency: %s, samples per epoch: %s", numValueOf, strF, strF2, numValueOf2, Double.valueOf(ajevVar5.c));
    }

    @Override // defpackage.vmc
    public final String g() {
        return "CPU Profiling";
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 16384) != 0;
    }
}
