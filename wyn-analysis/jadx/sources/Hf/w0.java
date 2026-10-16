package Hf;

import Ef.InterfaceC0501m0;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class w0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public x0 f5216a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0603m f5217b;

    /* renamed from: c, reason: collision with root package name */
    public y0 f5218c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0501m0 f5219d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5220e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0 f5222g;

    /* renamed from: h, reason: collision with root package name */
    public int f5223h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5222g = x0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f5221f = obj;
        this.f5223h |= Integer.MIN_VALUE;
        this.f5222g.collect(null, this);
        return kf.a.f39711a;
    }
}
