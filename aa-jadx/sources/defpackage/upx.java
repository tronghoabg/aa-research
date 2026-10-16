package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class upx implements java.lang.Runnable {
    public final /* synthetic */ defpackage.upy a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    private final /* synthetic */ int d;

    public /* synthetic */ upx(defpackage.upy upyVar, long j, long j2, int i) {
        this.d = i;
        this.a = upyVar;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        long j = this.c;
        long j2 = this.b;
        defpackage.upy upyVar = this.a;
        if (i != 0) {
            upyVar.g(j2, j);
        } else {
            upyVar.g(j2, j);
        }
    }
}
