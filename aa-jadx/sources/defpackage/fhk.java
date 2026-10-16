package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fhk extends defpackage.fgp {
    private static final java.lang.String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int d(defpackage.fgv fgvVar, int i) {
        int[] iArr;
        if (fgvVar == null || (iArr = (int[]) fgvVar.a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    public static final int e(defpackage.fgv fgvVar) {
        java.lang.Integer num;
        if (fgvVar == null || (num = (java.lang.Integer) fgvVar.a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    @Override // defpackage.fgp
    public final void b(defpackage.fgv fgvVar) {
        java.util.Map map = fgvVar.a;
        android.view.View view = fgvVar.b;
        java.lang.Integer numValueOf = (java.lang.Integer) map.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = java.lang.Integer.valueOf(view.getVisibility());
        }
        map.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + java.lang.Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + java.lang.Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        map.put("android:visibilityPropagation:center", iArr);
    }

    @Override // defpackage.fgp
    public final java.lang.String[] c() {
        return a;
    }
}
