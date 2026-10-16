package fa;

import java.util.Iterator;
import java.util.Map;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Map f35265a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f35266b;

    /* renamed from: c, reason: collision with root package name */
    public d f35267c;

    /* renamed from: d, reason: collision with root package name */
    public Nf.a f35268d;

    /* renamed from: e, reason: collision with root package name */
    public Map f35269e;

    /* renamed from: f, reason: collision with root package name */
    public Object f35270f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f35271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f35272h;

    /* renamed from: i, reason: collision with root package name */
    public int f35273i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f35272h = cVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35271g = obj;
        this.f35273i |= Integer.MIN_VALUE;
        return this.f35272h.b(this);
    }
}
