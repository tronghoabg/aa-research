package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class amg implements arr {
    final /* synthetic */ amv a;
    final /* synthetic */ afec b;
    final /* synthetic */ afdr c;

    public amg(amv amvVar, afec afecVar, afdr afdrVar) {
        this.a = amvVar;
        this.b = afecVar;
        this.c = afdrVar;
    }

    @Override // defpackage.arr
    public final float a(float f, float f2) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.arr
    public final float b(float f) {
        Object objC;
        amv amvVar = this.a;
        float fD = amvVar.d();
        anf anfVarN = amvVar.n();
        if (Float.isNaN(fD)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = Math.abs(f) > BitmapDescriptorFactory.HUE_RED;
        boolean z2 = z && f > BitmapDescriptorFactory.HUE_RED;
        if (z) {
            if (Math.abs(f) >= Math.abs(((Number) this.c.invoke()).floatValue())) {
                objC = anfVarN.c(fD, z2);
                objC.getClass();
            } else {
                afec afecVar = this.b;
                Object objC2 = anfVarN.c(fD, false);
                objC2.getClass();
                float fA = anfVarN.a(objC2);
                Object objC3 = anfVarN.c(fD, true);
                objC3.getClass();
                float fA2 = anfVarN.a(objC3);
                float fAbs = Math.abs(((Number) afecVar.invoke(Float.valueOf(Math.abs(fA - fA2)))).floatValue());
                if (true != z2) {
                    fA = fA2;
                }
                objC = (Math.abs(fA - fD) < fAbs ? !z2 : z2) ? objC3 : objC2;
            }
        } else {
            objC = anfVarN.b(fD);
            objC.getClass();
        }
        afec afecVar2 = amvVar.a;
        Boolean bool = true;
        bool.getClass();
        return amvVar.n().a(objC) - fD;
    }
}
