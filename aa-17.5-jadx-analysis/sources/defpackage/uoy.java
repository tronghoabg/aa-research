package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class uoy implements Runnable {
    public final /* synthetic */ uoz a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    private final /* synthetic */ int d;

    public /* synthetic */ uoy(uoz uozVar, long j, long j2, int i) {
        this.d = i;
        this.a = uozVar;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        long j = this.c;
        long j2 = this.b;
        uoz uozVar = this.a;
        if (i != 0) {
            uozVar.g(j2, j);
        } else {
            uozVar.g(j2, j);
        }
    }
}
