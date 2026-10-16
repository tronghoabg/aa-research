package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public final class ady {
    public static final aft a;
    private static final aft b = new aft(1.0f, 1500.0f, null);
    private static final aft c;

    static {
        Map map = ahc.a;
        c = new aft(1.0f, 1500.0f, new dlj(0.4f));
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        a = new aft(1.0f, 1500.0f, new dlo(4294967297L));
    }

    public static final bym a(float f, aec aecVar, String str, afec afecVar, bux buxVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            aecVar = c;
        }
        aec aecVar2 = aecVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            afecVar = null;
        }
        int i3 = i << 6;
        return c(new dlj(f), agm.c, aecVar2, null, str2, afecVar, buxVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (458752 & i3), 8);
    }

    public static final bym b(float f, aec aecVar, String str, afec afecVar, bux buxVar, int i, int i2) {
        aec aecVar2 = (i2 & 2) != 0 ? b : aecVar;
        float f2 = (i2 & 4) != 0 ? 0.01f : BitmapDescriptorFactory.HUE_RED;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        afec afecVar2 = (i2 & 16) != 0 ? null : afecVar;
        if (aecVar2 != b || f2 == 0.01f) {
            buxVar.v(1144320933);
            buxVar.o();
        } else {
            buxVar.v(1144211007);
            boolean z = true;
            if ((((i & 896) ^ 384) <= 256 || !buxVar.z(f2)) && (i & 384) != 256) {
                z = false;
            }
            Object objG = buxVar.g();
            if (z || objG == buw.a) {
                aft aftVar = new aft(1.0f, 1500.0f, Float.valueOf(f2));
                buxVar.x(aftVar);
                objG = aftVar;
            }
            aecVar2 = (aft) objG;
            buxVar.o();
        }
        float f3 = f2;
        return c(Float.valueOf(f), agm.a, aecVar2, f2 != 0.01f ? Float.valueOf(f3) : null, str2, afecVar2, buxVar, (i & 14) | ((i << 3) & 57344), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3 A[PHI: r9
  0x00e3: PHI (r9v20 java.lang.String) = (r9v17 java.lang.String), (r9v21 java.lang.String) binds: [B:63:0x00e1, B:59:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ff A[PHI: r10
  0x00ff: PHI (r10v13 afec) = (r10v10 afec), (r10v14 afec) binds: [B:73:0x00fd, B:69:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.bym c(final java.lang.Object r16, final defpackage.bii r17, defpackage.aec r18, java.lang.Object r19, java.lang.String r20, defpackage.afec r21, defpackage.bux r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ady.c(java.lang.Object, bii, aec, java.lang.Object, java.lang.String, afec, bux, int, int):bym");
    }
}
