package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class fel extends fhe {
    private static float f(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float f6 = f3 - f;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    @Override // defpackage.fgi
    public final long a(ViewGroup viewGroup, fgc fgcVar, fgo fgoVar, fgo fgoVar2) {
        int iRound;
        int iRound2;
        if (fgoVar == null && fgoVar2 == null) {
            return 0L;
        }
        int i = -1;
        if (fgoVar2 != null && e(fgoVar) != 0) {
            fgoVar = fgoVar2;
            i = 1;
        }
        int iD = fhe.d(fgoVar, 0);
        int iD2 = fhe.d(fgoVar, 1);
        Rect rectH = fgcVar.h();
        if (rectH != null) {
            iRound = rectH.centerX();
            iRound2 = rectH.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            iRound = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound2 = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
        }
        float f = f(iD, iD2, iRound, iRound2) / f(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, viewGroup.getWidth(), viewGroup.getHeight());
        long j = fgcVar.c;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * i) / 3.0f) * f);
    }
}
