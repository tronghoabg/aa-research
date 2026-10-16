package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ffo extends defpackage.fhk {
    public int a = 80;

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    @Override // defpackage.fgp
    public final long a(android.view.ViewGroup viewGroup, defpackage.fgj fgjVar, defpackage.fgv fgvVar, defpackage.fgv fgvVar2) {
        int i;
        defpackage.fgv fgvVar3;
        int iCenterX;
        int iCenterY;
        int iAbs;
        if (fgvVar == null && fgvVar2 == null) {
            return 0L;
        }
        android.graphics.Rect rectH = fgjVar.h();
        if (fgvVar2 == null || e(fgvVar) == 0) {
            i = -1;
            fgvVar3 = fgvVar;
        } else {
            fgvVar3 = fgvVar2;
            i = 1;
        }
        int iD = defpackage.fhk.d(fgvVar3, 0);
        int iD2 = defpackage.fhk.d(fgvVar3, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + java.lang.Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + java.lang.Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectH != null) {
            iCenterX = rectH.centerX();
            iCenterY = rectH.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        int i2 = this.a;
        if (i2 == 8388611) {
            if (viewGroup.getLayoutDirection() == 1) {
                i2 = 5;
            } else {
                i2 = 3;
            }
        } else if (i2 == 8388613) {
            if (viewGroup.getLayoutDirection() == 1) {
                i2 = 3;
            } else {
                i2 = 5;
            }
        }
        if (i2 == 3) {
            iAbs = java.lang.Math.abs(iCenterY - iD2) + (width - iD);
        } else if (i2 == 5) {
            iAbs = java.lang.Math.abs(iCenterY - iD2) + (iD - iRound);
        } else if (i2 == 48) {
            iAbs = java.lang.Math.abs(iCenterX - iD) + (height - iD2);
        } else if (i2 != 80) {
            iAbs = 0;
        } else {
            iAbs = java.lang.Math.abs(iCenterX - iD) + (iD2 - iRound2);
        }
        int i3 = this.a;
        int width2 = (i3 == 3 || i3 == 5 || i3 == 8388611 || i3 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
        float f = iAbs;
        long j = fgjVar.c;
        if (j < 0) {
            j = 300;
        }
        return java.lang.Math.round(((j * ((long) i)) / 3.0f) * (f / width2));
    }
}
