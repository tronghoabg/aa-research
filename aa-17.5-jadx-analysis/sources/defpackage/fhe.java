package defpackage;

import android.view.View;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class fhe extends fgi {
    private static final String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int d(fgo fgoVar, int i) {
        int[] iArr;
        if (fgoVar == null || (iArr = (int[]) fgoVar.a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    public static final int e(fgo fgoVar) {
        Integer num;
        if (fgoVar == null || (num = (Integer) fgoVar.a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    @Override // defpackage.fgi
    public final void b(fgo fgoVar) {
        Map map = fgoVar.a;
        View view = fgoVar.b;
        Integer numValueOf = (Integer) map.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        map.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        map.put("android:visibilityPropagation:center", iArr);
    }

    @Override // defpackage.fgi
    public final String[] c() {
        return a;
    }
}
