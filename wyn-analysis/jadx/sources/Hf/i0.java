package Hf;

import Ef.InterfaceC0501m0;
import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class i0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public j0 f5135a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0603m f5136b;

    /* renamed from: c, reason: collision with root package name */
    public l0 f5137c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0501m0 f5138d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f5140f;

    /* renamed from: g, reason: collision with root package name */
    public int f5141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5140f = j0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f5139e = obj;
        this.f5141g |= Integer.MIN_VALUE;
        j0.k(this.f5140f, null, this);
        return kf.a.f39711a;
    }
}
