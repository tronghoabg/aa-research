package Hf;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class z0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public A0 f5237a;

    /* renamed from: b, reason: collision with root package name */
    public If.z f5238b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A0 f5240d;

    /* renamed from: e, reason: collision with root package name */
    public int f5241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(A0 a02, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f5240d = a02;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5239c = obj;
        this.f5241e |= Integer.MIN_VALUE;
        return this.f5240d.a(this);
    }
}
