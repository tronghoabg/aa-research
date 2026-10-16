package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class ti {
    public static final int a(duk dukVar) {
        if (dukVar == null) {
            return 0;
        }
        String str = dukVar.d;
        return str != null ? str.hashCode() : Objects.hash(dukVar.a, dukVar.c, Boolean.valueOf(dukVar.e), Boolean.valueOf(dukVar.f));
    }

    public static final boolean b(duk dukVar, duk dukVar2) {
        if (dukVar == null && dukVar2 == null) {
            return true;
        }
        if (dukVar == null || dukVar2 == null) {
            return false;
        }
        String str = dukVar.d;
        String str2 = dukVar2.d;
        if (str == null && str2 == null) {
            return affa.f(Objects.toString(dukVar.a), Objects.toString(dukVar2.a)) && affa.f(dukVar.c, dukVar2.c) && dukVar.e == dukVar2.e && dukVar.f == dukVar2.f;
        }
        return affa.f(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r25, defpackage.cfy r26, boolean r27, defpackage.bpa r28, defpackage.bux r29, int r30) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti.c(boolean, cfy, boolean, bpa, bux, int):void");
    }

    public static final void d(cmd cmdVar, int i, long j, float f, float f2) {
        if (a.Y(i, 1)) {
            float f3 = f / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (cmdVar.o() >> 32)) - f3) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L)) / 2.0f;
            czz.aH(cmdVar, j, f3, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2)), null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (cmdVar.o() >> 32)) - f) - f2;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L)) - f) / 2.0f;
        czz.I(cmdVar, j, (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L), (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f)), BitmapDescriptorFactory.HUE_RED, null, 120);
    }

    public static final cfy f(cfy cfyVar, cpt cptVar, tp tpVar) {
        return cfyVar.a(new cpw(cptVar, tpVar));
    }

    public static final long g(int i) {
        return i << 32;
    }

    public static final cfy h(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new cpp(afecVar, null));
    }
}
