package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class B0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0 f5019b;

    /* renamed from: c, reason: collision with root package name */
    public int f5020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C0 c02, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5019b = c02;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5018a = obj;
        this.f5020c |= Integer.MIN_VALUE;
        this.f5019b.collect(null, this);
        return kf.a.f39711a;
    }
}
