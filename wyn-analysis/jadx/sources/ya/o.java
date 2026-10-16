package ya;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f48068b;

    public /* synthetic */ o(int i5, Runnable runnable) {
        this.f48067a = i5;
        this.f48068b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48067a) {
            case 0:
                Deque deque = (Deque) h.f48051b.get();
                AbstractC1732v.i(deque);
                Runnable runnable = this.f48068b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                h.f48051b.set(new ArrayDeque());
                this.f48068b.run();
                break;
        }
    }
}
