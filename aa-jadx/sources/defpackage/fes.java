package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fes extends defpackage.fhk {
    private static float f(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float f6 = f3 - f;
        return (float) java.lang.Math.sqrt((f6 * f6) + (f5 * f5));
    }

    @Override // defpackage.fgp
    public final long a(android.view.ViewGroup viewGroup, defpackage.fgj fgjVar, defpackage.fgv fgvVar, defpackage.fgv fgvVar2) {
        int iRound;
        int iRound2;
        if (fgvVar == null && fgvVar2 == null) {
            return 0L;
        }
        int i = -1;
        if (fgvVar2 != null && e(fgvVar) != 0) {
            fgvVar = fgvVar2;
            i = 1;
        }
        int iD = defpackage.fhk.d(fgvVar, 0);
        int iD2 = defpackage.fhk.d(fgvVar, 1);
        android.graphics.Rect rectH = fgjVar.h();
        if (rectH != null) {
            iRound = rectH.centerX();
            iRound2 = rectH.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            iRound = java.lang.Math.round(iArr[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound2 = java.lang.Math.round(iArr[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
        }
        float f = f(iD, iD2, iRound, iRound2) / f(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, viewGroup.getWidth(), viewGroup.getHeight());
        long j = fgjVar.c;
        if (j < 0) {
            j = 300;
        }
        return java.lang.Math.round(((j * ((long) i)) / 3.0f) * f);
    }
}
