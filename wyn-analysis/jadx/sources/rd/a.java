package Rd;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f10586b;

    /* renamed from: c, reason: collision with root package name */
    public int f10587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f10586b = bVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f10585a = obj;
        this.f10587c |= Integer.MIN_VALUE;
        return this.f10586b.f(this);
    }
}
