package Hf;

import If.AbstractC0621b;
import If.AbstractC0622c;
import If.AbstractC0623d;
import java.util.concurrent.atomic.AtomicReference;
import jf.InterfaceC3103c;

/* loaded from: classes5.dex */
public final class y0 extends AbstractC0623d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5233a = new AtomicReference(null);

    @Override // If.AbstractC0623d
    public final boolean a(AbstractC0621b abstractC0621b) {
        AtomicReference atomicReference = this.f5233a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(k0.f5155b);
        return true;
    }

    @Override // If.AbstractC0623d
    public final InterfaceC3103c[] b(AbstractC0621b abstractC0621b) {
        this.f5233a.set(null);
        return AbstractC0622c.f5463a;
    }
}
