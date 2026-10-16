package Ef;

import java.util.concurrent.CancellationException;
import jf.AbstractC3101a;
import jf.InterfaceC3103c;

/* loaded from: classes5.dex */
public final class D0 extends AbstractC3101a implements InterfaceC0501m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final D0 f3661a = new D0(C0499l0.f3748a);

    @Override // Ef.InterfaceC0501m0
    public final InterfaceC0508q attachChild(InterfaceC0511s interfaceC0511s) {
        return E0.f3662a;
    }

    @Override // Ef.InterfaceC0501m0
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // Ef.InterfaceC0501m0
    public final Af.k getChildren() {
        return Af.e.f1294a;
    }

    @Override // Ef.InterfaceC0501m0
    public final U invokeOnCompletion(tf.l lVar) {
        return E0.f3662a;
    }

    @Override // Ef.InterfaceC0501m0
    public final boolean isActive() {
        return true;
    }

    @Override // Ef.InterfaceC0501m0
    public final boolean isCancelled() {
        return false;
    }

    @Override // Ef.InterfaceC0501m0
    public final Object join(InterfaceC3103c interfaceC3103c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Ef.InterfaceC0501m0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // Ef.InterfaceC0501m0
    public final U invokeOnCompletion(boolean z2, boolean z10, tf.l lVar) {
        return E0.f3662a;
    }

    @Override // Ef.InterfaceC0501m0
    public final void cancel(CancellationException cancellationException) {
    }
}
