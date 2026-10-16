package lf;

import Ef.A;
import Ef.C0502n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.C3104d;
import jf.InterfaceC3103c;
import jf.InterfaceC3105e;
import jf.InterfaceC3106f;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: lf.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3464c extends AbstractC3462a {

    @Nullable
    private final InterfaceC3108h _context;

    @Nullable
    private transient InterfaceC3103c<Object> intercepted;

    public AbstractC3464c(InterfaceC3103c interfaceC3103c, InterfaceC3108h interfaceC3108h) {
        super(interfaceC3103c);
        this._context = interfaceC3108h;
    }

    @Override // jf.InterfaceC3103c
    @NotNull
    public InterfaceC3108h getContext() {
        InterfaceC3108h interfaceC3108h = this._context;
        AbstractC3340k.b(interfaceC3108h);
        return interfaceC3108h;
    }

    @NotNull
    public final InterfaceC3103c<Object> intercepted() {
        InterfaceC3103c<Object> interfaceC3103c = this.intercepted;
        if (interfaceC3103c != null) {
            return interfaceC3103c;
        }
        InterfaceC3105e interfaceC3105e = (InterfaceC3105e) getContext().get(C3104d.f38758a);
        InterfaceC3103c<Object> fVar = interfaceC3105e != null ? new Jf.f((A) interfaceC3105e, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // lf.AbstractC3462a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC3103c<Object> interfaceC3103c = this.intercepted;
        if (interfaceC3103c != null && interfaceC3103c != this) {
            InterfaceC3106f interfaceC3106f = getContext().get(C3104d.f38758a);
            AbstractC3340k.b(interfaceC3106f);
            Jf.f fVar = (Jf.f) interfaceC3103c;
            do {
                atomicReferenceFieldUpdater = Jf.f.f6108h;
            } while (atomicReferenceFieldUpdater.get(fVar) == Jf.b.f6099c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0502n c0502n = obj instanceof C0502n ? (C0502n) obj : null;
            if (c0502n != null) {
                c0502n.p();
            }
        }
        this.intercepted = C3463b.f40278a;
    }

    public AbstractC3464c(InterfaceC3103c interfaceC3103c) {
        this(interfaceC3103c, interfaceC3103c != null ? interfaceC3103c.getContext() : null);
    }
}
