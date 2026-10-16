package x1;

import Hf.InterfaceC0602l;
import jf.InterfaceC3103c;
import tf.p;
import u1.C4209G;
import u1.InterfaceC4220i;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4451d implements InterfaceC4220i {

    /* renamed from: a, reason: collision with root package name */
    public final C4209G f47651a;

    public C4451d(C4209G c4209g) {
        this.f47651a = c4209g;
    }

    @Override // u1.InterfaceC4220i
    public final Object a(p pVar, InterfaceC3103c interfaceC3103c) {
        return this.f47651a.a(new C4450c(pVar, null), interfaceC3103c);
    }

    @Override // u1.InterfaceC4220i
    public final InterfaceC0602l getData() {
        return this.f47651a.f46447d;
    }
}
