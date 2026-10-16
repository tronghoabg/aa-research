package fd;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class x extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35395a;

    /* renamed from: b, reason: collision with root package name */
    public int f35396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f35397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m mVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f35397c = mVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35395a = obj;
        this.f35396b |= Integer.MIN_VALUE;
        return this.f35397c.emit(null, this);
    }
}
