package F0;

import W9.u;
import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class f extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public u f3803a;

    /* renamed from: b, reason: collision with root package name */
    public Gf.b f3804b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3806d;

    /* renamed from: e, reason: collision with root package name */
    public int f3807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u uVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f3806d = uVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f3805c = obj;
        this.f3807e |= Integer.MIN_VALUE;
        return this.f3806d.k(this);
    }
}
