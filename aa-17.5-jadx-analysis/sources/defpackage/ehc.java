package defpackage;

import androidx.datastore.core.NativeSharedCounter;

/* loaded from: classes2.dex */
public final class ehc implements ehd {
    private final NativeSharedCounter b;
    private final long c;

    public ehc(NativeSharedCounter nativeSharedCounter, long j) {
        this.b = nativeSharedCounter;
        this.c = j;
    }

    @Override // defpackage.ehd
    public final int a() {
        return this.b.nativeGetCounterValue(this.c);
    }

    @Override // defpackage.ehd
    public final int b() {
        return this.b.nativeIncrementAndGetCounterValue(this.c);
    }
}
