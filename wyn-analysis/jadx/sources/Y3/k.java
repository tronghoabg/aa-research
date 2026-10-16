package Y3;

import Hf.C0596f;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class k extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16645a;

    /* renamed from: b, reason: collision with root package name */
    public int f16646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0596f f16647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0596f c0596f, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f16647c = c0596f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f16645a = obj;
        this.f16646b |= Integer.MIN_VALUE;
        return this.f16647c.emit(null, this);
    }
}
