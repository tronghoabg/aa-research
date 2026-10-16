package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class adqy implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ adqy(defpackage.adqz adqzVar, int i, android.os.Parcel parcel, int i2) {
        this.d = i2;
        this.b = adqzVar;
        this.a = i;
        this.c = parcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b).M((android.view.View) this.c, this.a, false);
            return;
        }
        java.lang.Object obj = this.c;
        try {
            if (((defpackage.adrb) this.b).c(this.a, (android.os.Parcel) obj)) {
                return;
            }
            defpackage.adrb.a.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
        } catch (java.lang.Exception e) {
            defpackage.adrb.a.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (java.lang.Throwable) e);
        }
    }

    public adqy(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, android.view.View view, int i, int i2) {
        this.d = i2;
        this.c = view;
        this.a = i;
        this.b = bottomSheetBehavior;
    }
}
