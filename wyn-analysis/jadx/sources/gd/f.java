package Gd;

import S3.s;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class f extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f4729b;

    /* renamed from: c, reason: collision with root package name */
    public int f4730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s sVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f4729b = sVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f4728a = obj;
        this.f4730c |= Integer.MIN_VALUE;
        return this.f4729b.d(null, this);
    }
}
