package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import java.util.EnumMap;

/* loaded from: classes3.dex */
public final class ufc extends ufa {
    private static final yob b = yob.c("com/google/android/libraries/geo/mapcore/internal/label/texture/CalloutBackgroundTextureCreator");
    public final uer a;
    private final ues c;
    private final EnumMap d;
    private final Resources e;

    public ufc(uer uerVar, ues uesVar, Resources resources) {
        super(uerVar.g, uerVar.h);
        this.d = new EnumMap(abaf.class);
        this.a = uerVar;
        this.c = uesVar;
        this.e = resources;
    }

    private static float e(float f, float f2) {
        double dMin = Math.min(f2, f);
        float f3 = f / 2.0f;
        return f3 - ((float) Math.sqrt(Math.pow(f3, 2.0d) - (Math.pow(dMin, 2.0d) / 4.0d)));
    }

    private final int f(float f) {
        return Math.round(this.e.getDisplayMetrics().density * f);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0220 A[PHI: r19
  0x0220: PHI (r19v9 android.graphics.Bitmap) = (r19v8 android.graphics.Bitmap), (r19v8 android.graphics.Bitmap), (r19v10 android.graphics.Bitmap) binds: [B:55:0x0201, B:57:0x020d, B:51:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Bitmap g() {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufc.g():android.graphics.Bitmap");
    }

    private static void h(Path path, tpf tpfVar, tpf tpfVar2, tpf tpfVar3) {
        path.lineTo(tpfVar.b, tpfVar.c);
        path.lineTo(tpfVar2.b, tpfVar2.c);
        path.lineTo(tpfVar3.b, tpfVar3.c);
    }

    @Override // defpackage.ufg
    public final uwk a() {
        uwi uwiVarF;
        Bitmap bitmapG = g();
        if (bitmapG == null || (uwiVarF = this.c.f(bitmapG, 1.0f)) == null) {
            return null;
        }
        return new uwk(uwiVarF);
    }
}
