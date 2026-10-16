package u1;

import java.io.Serializable;
import java.util.Iterator;
import lf.AbstractC3464c;

/* renamed from: u1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4234w extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C4209G f46499a;

    /* renamed from: b, reason: collision with root package name */
    public Object f46500b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f46501c;

    /* renamed from: d, reason: collision with root package name */
    public Object f46502d;

    /* renamed from: e, reason: collision with root package name */
    public C4236y f46503e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f46504f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f46505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4209G f46506h;

    /* renamed from: i, reason: collision with root package name */
    public int f46507i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4234w(C4209G c4209g, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46506h = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46505g = obj;
        this.f46507i |= Integer.MIN_VALUE;
        return this.f46506h.d(this);
    }
}
