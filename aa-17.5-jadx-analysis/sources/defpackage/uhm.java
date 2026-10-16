package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uhm implements uhc {
    private static final yob b = yob.c("com/google/android/libraries/geo/mapcore/internal/legacy/vector/gl/drawable/GLRaster");
    public final abdl a;
    private int c;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected uhm(byte[] r24, int r25, defpackage.ukp r26, defpackage.roa r27, defpackage.utz r28, defpackage.utf r29, defpackage.tqa r30, defpackage.ujf r31, defpackage.uwl r32, com.google.android.libraries.geo.mapcore.internal.legacy.vector.gl.drawable.GmmTextureStyleIdShaderState r33, byte r34, defpackage.uwt r35, boolean r36, java.util.List r37, defpackage.uvg r38, defpackage.abdl r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhm.<init>(byte[], int, ukp, roa, utz, utf, tqa, ujf, uwl, com.google.android.libraries.geo.mapcore.internal.legacy.vector.gl.drawable.GmmTextureStyleIdShaderState, byte, uwt, boolean, java.util.List, uvg, abdl):void");
    }

    public static byte c(uhz uhzVar, uju ujuVar, int i) {
        uhx uhxVar = new uhx(ujuVar, i);
        acjs acjsVar = uhzVar.n;
        int iH = acjsVar.h(uhxVar);
        if (iH == 1) {
            uhzVar.h.add(new adut((byte[]) null));
        } else if (iH == 3) {
            ((ynz) ((ynz) ((ynz) uhz.a.g()).p(new uhy(uhzVar, "raster", 4))).ai(9370)).s();
            return (byte) 0;
        }
        return acjsVar.f(uhxVar);
    }

    private static uws d(float f, float f2, float f3, float f4, float f5, utz utzVar) {
        return new uws("raster", new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, f, f3, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f4, f5, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, f2, f3, f5, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, f4, f5}, 2065, utzVar);
    }

    @Override // defpackage.uhc
    public final int a() {
        return this.c;
    }

    @Override // defpackage.uhc
    public final int b() {
        return 96;
    }
}
