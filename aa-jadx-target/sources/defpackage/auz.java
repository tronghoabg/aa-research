package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class auz extends defpackage.ece implements java.lang.Runnable, android.view.View.OnAttachStateChangeListener, defpackage.eap {
    public boolean a;
    public boolean b;
    public defpackage.edf c;
    private final defpackage.awv d;

    public auz(defpackage.awv awvVar) {
        super(!awvVar.n ? 1 : 0);
        this.d = awvVar;
    }

    @Override // defpackage.eap
    public final defpackage.edf a(android.view.View view, defpackage.edf edfVar) {
        this.c = edfVar;
        defpackage.awv awvVar = this.d;
        awvVar.d(edfVar);
        if (this.a) {
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.b) {
            awvVar.c(edfVar);
            awvVar.e(edfVar);
        }
        return awvVar.n ? defpackage.edf.a : edfVar;
    }

    @Override // defpackage.ece
    public final defpackage.edf b(defpackage.edf edfVar, java.util.List list) {
        defpackage.awv awvVar = this.d;
        awvVar.e(edfVar);
        return awvVar.n ? defpackage.edf.a : edfVar;
    }

    @Override // defpackage.ece
    public final ecd c(defpackage.kwv kwvVar, ecd ecdVar) {
        this.a = false;
        return ecdVar;
    }

    @Override // defpackage.ece
    public final void d(defpackage.kwv kwvVar) {
        this.a = false;
        this.b = false;
        defpackage.edf edfVar = this.c;
        if (kwvVar.F() > 0 && edfVar != null) {
            defpackage.awv awvVar = this.d;
            awvVar.c(edfVar);
            awvVar.d(edfVar);
            awvVar.e(edfVar);
        }
        this.c = null;
    }

    @Override // defpackage.ece
    public final void e(defpackage.kwv kwvVar) {
        this.a = true;
        this.b = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            this.a = false;
            this.b = false;
            defpackage.edf edfVar = this.c;
            if (edfVar != null) {
                defpackage.awv awvVar = this.d;
                awvVar.c(edfVar);
                awvVar.e(edfVar);
                this.c = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
