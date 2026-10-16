package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class E extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5032a;

    /* renamed from: b, reason: collision with root package name */
    public int f5033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f5034c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f10, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5034c = f10;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5032a = obj;
        this.f5033b |= Integer.MIN_VALUE;
        return this.f5034c.collect(null, this);
    }
}
