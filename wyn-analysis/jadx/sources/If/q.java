package If;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class q extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f5500b;

    /* renamed from: c, reason: collision with root package name */
    public int f5501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5500b = rVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5499a = obj;
        this.f5501c |= Integer.MIN_VALUE;
        return this.f5500b.emit(null, this);
    }
}
