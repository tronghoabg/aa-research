package fd;

import Hf.C0600j;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class p extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35360a;

    /* renamed from: b, reason: collision with root package name */
    public int f35361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0600j f35362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C0600j c0600j, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f35362c = c0600j;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35360a = obj;
        this.f35361b |= Integer.MIN_VALUE;
        return this.f35362c.emit(null, this);
    }
}
