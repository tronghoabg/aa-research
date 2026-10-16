package androidx.core.os;

import java.lang.Throwable;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface OutcomeReceiverCompat<R, E extends Throwable> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.core.os.OutcomeReceiverCompat$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onError(OutcomeReceiverCompat outcomeReceiverCompat, Throwable th) {
        }
    }

    void onError(E e2);

    void onResult(R r);
}
