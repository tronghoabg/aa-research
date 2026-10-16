package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class q0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0615z f5182b;

    /* renamed from: c, reason: collision with root package name */
    public int f5183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(C0615z c0615z, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5182b = c0615z;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5181a = obj;
        this.f5183c |= Integer.MIN_VALUE;
        return this.f5182b.d(0, this);
    }
}
