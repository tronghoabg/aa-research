package fd;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import lf.AbstractC3464c;
import x1.C4452e;

/* loaded from: classes5.dex */
public final class u extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Set f35379a;

    /* renamed from: b, reason: collision with root package name */
    public Map f35380b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f35381c;

    /* renamed from: d, reason: collision with root package name */
    public C4452e f35382d;

    /* renamed from: e, reason: collision with root package name */
    public int f35383e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f35384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2628H f35385g;

    /* renamed from: h, reason: collision with root package name */
    public int f35386h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C2628H c2628h, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f35385g = c2628h;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35384f = obj;
        this.f35386h |= Integer.MIN_VALUE;
        return C2628H.b(this.f35385g, null, this);
    }
}
