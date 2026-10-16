package N;

import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class Z extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C0713a0 f7736a;

    /* renamed from: b, reason: collision with root package name */
    public tf.l f7737b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7738c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0713a0 f7739d;

    /* renamed from: e, reason: collision with root package name */
    public int f7740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0713a0 c0713a0, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f7739d = c0713a0;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f7738c = obj;
        this.f7740e |= Integer.MIN_VALUE;
        return this.f7739d.d(null, this);
    }
}
