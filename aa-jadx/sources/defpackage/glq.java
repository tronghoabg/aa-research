package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class glq implements defpackage.afer {
    public final /* synthetic */ androidx.car.app.ISurfaceCallback a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    private final /* synthetic */ int d;

    public /* synthetic */ glq(androidx.car.app.ISurfaceCallback iSurfaceCallback, float f, float f2, int i) {
        this.d = i;
        this.a = iSurfaceCallback;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.afer
    public final java.lang.Object invoke() throws android.os.RemoteException {
        int i = this.d;
        if (i == 0) {
            float f = this.c;
            this.a.onFling(this.b, f);
            return defpackage.afbk.a;
        }
        float f2 = this.c;
        if (i != 1) {
            this.a.onClick(this.b, f2);
            return defpackage.afbk.a;
        }
        this.a.onScroll(this.b, f2);
        return defpackage.afbk.a;
    }
}
