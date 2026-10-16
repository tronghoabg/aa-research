package lf;

import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import org.jetbrains.annotations.NotNull;

/* renamed from: lf.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3469h extends AbstractC3462a {
    public AbstractC3469h(InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        if (interfaceC3103c != null && interfaceC3103c.getContext() != C3109i.f38759a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // jf.InterfaceC3103c
    @NotNull
    public InterfaceC3108h getContext() {
        return C3109i.f38759a;
    }
}
