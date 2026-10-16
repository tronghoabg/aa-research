package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class P extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C0615z f5067a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5068b;

    /* renamed from: c, reason: collision with root package name */
    public int f5069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0615z f5070d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C0615z c0615z, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5070d = c0615z;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5068b = obj;
        this.f5069c |= Integer.MIN_VALUE;
        return this.f5070d.emit(null, this);
    }
}
