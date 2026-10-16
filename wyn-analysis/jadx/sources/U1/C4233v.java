package u1;

import Ef.C0514u;
import lf.AbstractC3464c;

/* renamed from: u1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4233v extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f46493a;

    /* renamed from: b, reason: collision with root package name */
    public C4209G f46494b;

    /* renamed from: c, reason: collision with root package name */
    public C0514u f46495c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f46496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4209G f46497e;

    /* renamed from: f, reason: collision with root package name */
    public int f46498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4233v(C4209G c4209g, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46497e = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46496d = obj;
        this.f46498f |= Integer.MIN_VALUE;
        return C4209G.b(this.f46497e, null, this);
    }
}
