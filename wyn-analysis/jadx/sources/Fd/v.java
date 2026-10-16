package fd;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class v extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35387a;

    /* renamed from: b, reason: collision with root package name */
    public int f35388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f35389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(m mVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f35389c = mVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35387a = obj;
        this.f35388b |= Integer.MIN_VALUE;
        return this.f35389c.emit(null, this);
    }
}
