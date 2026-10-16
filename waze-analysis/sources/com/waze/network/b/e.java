package com.waze.network.b;

import android.os.CancellationSignal;
import java.net.UnknownHostException;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.df;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f32041a;

    /* renamed from: b, reason: collision with root package name */
    Object f32042b;

    /* renamed from: c, reason: collision with root package name */
    Object f32043c;

    /* renamed from: d, reason: collision with root package name */
    Object f32044d;

    /* renamed from: e, reason: collision with root package name */
    Object f32045e;

    /* renamed from: f, reason: collision with root package name */
    Object f32046f;

    /* renamed from: g, reason: collision with root package name */
    int f32047g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ f f32048h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f32049i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ CancellationSignal f32050j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f32051k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f32052l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, String str, CancellationSignal cancellationSignal, h.g.b.aq aqVar, CompletableDeferred completableDeferred, h.c.e eVar) {
        super(2, eVar);
        this.f32048h = fVar;
        this.f32049i = str;
        this.f32050j = cancellationSignal;
        this.f32051k = aqVar;
        this.f32052l = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f32048h, this.f32049i, this.f32050j, this.f32051k, this.f32052l, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.c.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.waze.perf.tracer.f] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.waze.perf.tracer.f fVarA;
        f fVar;
        String str;
        CancellationSignal cancellationSignal;
        h.g.b.aq aqVar;
        String str2;
        long j2;
        Object objH;
        com.waze.perf.tracer.f fVar2;
        com.waze.perf.tracer.f fVar3;
        ?? r4 = h.c.a.a.f48038a;
        ?? r5 = this.f32047g;
        try {
            try {
                if (r5 == 0) {
                    e.b.c.b(obj);
                    fVar = this.f32048h;
                    str = this.f32049i;
                    cancellationSignal = this.f32050j;
                    aqVar = this.f32051k;
                    CompletableDeferred completableDeferred = this.f32052l;
                    fVarA = fVar.f32057f.a("WAZE_NETWORK_DNS_REQUEST");
                    try {
                        fVarA.c();
                        fVarA.a("HOSTNAME", str);
                        try {
                            try {
                                j2 = fVar.f32056e;
                                str2 = "DNS timeout hostname='";
                            } catch (df e2) {
                                e = e2;
                                str2 = "DNS timeout hostname='";
                            }
                            try {
                                d dVar = new d(completableDeferred, null);
                                this.f32041a = str;
                                this.f32042b = fVar;
                                this.f32043c = cancellationSignal;
                                this.f32044d = aqVar;
                                this.f32045e = fVarA;
                                this.f32046f = fVarA;
                                this.f32047g = 1;
                                objH = kotlinx.coroutines.aj.H(j2, dVar, this);
                                if (objH == r4) {
                                    return r4;
                                }
                                fVar2 = fVarA;
                                fVar3 = fVar2;
                                List list = (List) objH;
                                aqVar.f48105a = b.f31982a;
                                fVar2.a("STATUS", ((b) aqVar.f48105a).name());
                                fVar3.d();
                                return list;
                            } catch (df e3) {
                                e = e3;
                                cancellationSignal.cancel();
                                fVar.f32058g.g(str2 + str + "'");
                                aqVar.f48105a = b.f31983b;
                                throw new UnknownHostException(e.toString());
                            }
                        } catch (UnknownHostException e4) {
                            e = e4;
                            fVar.f32058g.g("DNS unknown host hostname='" + str + "', ex=" + e);
                            throw e;
                        } catch (Exception e5) {
                            e = e5;
                            fVar.f32058g.g("DNS other exception hostname='" + str + "', ex=" + e);
                            throw new UnknownHostException(e.toString());
                        } catch (Throwable th) {
                            th = th;
                            r4 = fVarA;
                            r4.a("STATUS", ((b) aqVar.f48105a).name());
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fVarA.d();
                        throw th;
                    }
                }
                fVar2 = (com.waze.perf.tracer.f) this.f32046f;
                fVar3 = (com.waze.perf.tracer.f) this.f32045e;
                aqVar = (h.g.b.aq) this.f32044d;
                cancellationSignal = (CancellationSignal) this.f32043c;
                fVar = (f) this.f32042b;
                str = (String) this.f32041a;
                try {
                    try {
                        e.b.c.b(obj);
                        objH = obj;
                        str2 = "DNS timeout hostname='";
                        try {
                            List list2 = (List) objH;
                            aqVar.f48105a = b.f31982a;
                            fVar2.a("STATUS", ((b) aqVar.f48105a).name());
                            fVar3.d();
                            return list2;
                        } catch (df e6) {
                            e = e6;
                        }
                    } catch (df e7) {
                        e = e7;
                        str2 = "DNS timeout hostname='";
                    }
                } catch (UnknownHostException e8) {
                    e = e8;
                    fVar.f32058g.g("DNS unknown host hostname='" + str + "', ex=" + e);
                    throw e;
                } catch (Exception e9) {
                    e = e9;
                    fVar.f32058g.g("DNS other exception hostname='" + str + "', ex=" + e);
                    throw new UnknownHostException(e.toString());
                }
                cancellationSignal.cancel();
                fVar.f32058g.g(str2 + str + "'");
                aqVar.f48105a = b.f31983b;
                throw new UnknownHostException(e.toString());
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            fVarA = r5;
        }
    }
}
