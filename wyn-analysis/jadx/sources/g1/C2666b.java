package g1;

import Ef.C0502n;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2666b extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C0502n f35494a;

    public C2666b(C0502n c0502n) {
        super(false);
        this.f35494a = c0502n;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f35494a.resumeWith(Fe.e.z(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f35494a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
