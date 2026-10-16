package h3;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class f extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public g f36049a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f36051c;

    /* renamed from: d, reason: collision with root package name */
    public int f36052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f36051c = gVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f36050b = obj;
        this.f36052d |= Integer.MIN_VALUE;
        return g.c(this.f36051c, null, this);
    }
}
