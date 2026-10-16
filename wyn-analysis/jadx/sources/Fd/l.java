package fd;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class l extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35346a;

    /* renamed from: b, reason: collision with root package name */
    public int f35347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f35348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f35348c = mVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35346a = obj;
        this.f35347b |= Integer.MIN_VALUE;
        return this.f35348c.emit(null, this);
    }
}
