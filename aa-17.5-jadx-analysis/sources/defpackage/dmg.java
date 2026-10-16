package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class dmg {
    public static final dmf a = new dmf();

    public static final float a(int i) {
        return -i;
    }

    public static final void b(View view, cxb cxbVar) {
        long j = cxbVar.p().j(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (j & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }
}
