package Ef;

import java.util.concurrent.CancellationException;
import jf.InterfaceC3103c;
import jf.InterfaceC3106f;

/* renamed from: Ef.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC0501m0 extends InterfaceC3106f {
    InterfaceC0508q attachChild(InterfaceC0511s interfaceC0511s);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    Af.k getChildren();

    U invokeOnCompletion(tf.l lVar);

    U invokeOnCompletion(boolean z2, boolean z10, tf.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(InterfaceC3103c interfaceC3103c);

    boolean start();
}
