package If;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class l extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public m f5484a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5485b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f5487d;

    /* renamed from: e, reason: collision with root package name */
    public int f5488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5487d = mVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5486c = obj;
        this.f5488e |= Integer.MIN_VALUE;
        return this.f5487d.emit(null, this);
    }
}
