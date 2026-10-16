package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* renamed from: Hf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0587a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public If.z f5105a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f5107c;

    /* renamed from: d, reason: collision with root package name */
    public int f5108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587a(f0 f0Var, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f5107c = f0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5106b = obj;
        this.f5108d |= Integer.MIN_VALUE;
        return this.f5107c.collect(null, this);
    }
}
