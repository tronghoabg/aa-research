package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wnd extends defpackage.ece {
    private final android.view.View a;
    private int b;
    private int c;
    private final int[] d;

    public wnd(android.view.View view) {
        super(0);
        this.d = new int[2];
        this.a = view;
    }

    @Override // defpackage.ece
    public final defpackage.edf b(defpackage.edf edfVar, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.kwv kwvVar = (defpackage.kwv) it.next();
            if ((kwvVar.E() & 8) != 0) {
                this.a.setTranslationY(wlm.b(this.c, 0, kwvVar.D()));
                break;
            }
        }
        return edfVar;
    }

    @Override // defpackage.ece
    public final ecd c(defpackage.kwv kwvVar, ecd ecdVar) {
        android.view.View view = this.a;
        int[] iArr = this.d;
        view.getLocationOnScreen(iArr);
        int i = this.b - iArr[1];
        this.c = i;
        view.setTranslationY(i);
        return ecdVar;
    }

    @Override // defpackage.ece
    public final void d(defpackage.kwv kwvVar) {
        this.a.setTranslationY(0.0f);
    }

    @Override // defpackage.ece
    public final void e(defpackage.kwv kwvVar) {
        android.view.View view = this.a;
        int[] iArr = this.d;
        view.getLocationOnScreen(iArr);
        this.b = iArr[1];
    }
}
