package Ad;

import java.net.HttpURLConnection;
import jf.InterfaceC3108h;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class c extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Fd.d f1264a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3108h f1265b;

    /* renamed from: c, reason: collision with root package name */
    public Qd.d f1266c;

    /* renamed from: d, reason: collision with root package name */
    public Md.c f1267d;

    /* renamed from: e, reason: collision with root package name */
    public HttpURLConnection f1268e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f1270g;

    /* renamed from: h, reason: collision with root package name */
    public int f1271h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f1270g = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f1269f = obj;
        this.f1271h |= Integer.MIN_VALUE;
        return this.f1270g.a(null, this);
    }
}
