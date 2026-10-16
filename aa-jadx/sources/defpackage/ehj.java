package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ehj implements defpackage.ehk {
    private final androidx.datastore.core.NativeSharedCounter b;
    private final long c;

    public ehj(androidx.datastore.core.NativeSharedCounter nativeSharedCounter, long j) {
        this.b = nativeSharedCounter;
        this.c = j;
    }

    @Override // defpackage.ehk
    public final int a() {
        return this.b.nativeGetCounterValue(this.c);
    }

    @Override // defpackage.ehk
    public final int b() {
        return this.b.nativeIncrementAndGetCounterValue(this.c);
    }
}
