package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;

/* loaded from: classes3.dex */
public final class uwz implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final /* synthetic */ int d;

    public uwz(acku ackuVar, acku ackuVar2, acku ackuVar3, int i) {
        this.d = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.d;
        if (i == 0) {
            ((uxv) this.b).b();
            return xvy.a;
        }
        if (i != 1) {
            acku ackuVar = this.c;
            return new vzg((Context) ((acks) this.b).b, ((uyq) this.a).b(), ((vzd) ackuVar).a(), new ClearcutMetricSnapshotTransmitter());
        }
        return new ure((tuy) this.a.a(), ackq.b(this.b), (xxh) this.c.a());
    }

    public uwz(acku ackuVar, acku ackuVar2, acku ackuVar3, int i, char[] cArr) {
        this.d = i;
        this.b = ackuVar;
        this.a = ackuVar2;
        this.c = ackuVar3;
    }
}
