package kd;

import E5.n0;
import J9.C0654m;
import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.moloco.sdk.internal.publisher.C1915d;
import com.vungle.ads.internal.w2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;
import ka.A0;
import ka.AbstractC3230e0;
import ka.B0;
import ka.C0;
import ka.C3258n1;
import ka.C3274u0;
import ka.C3276v0;
import ka.E0;
import ka.F0;
import ka.G0;
import ka.H0;
import ka.I0;
import ka.J0;
import ka.V0;
import ka.W0;
import m9.AbstractC3505d;
import m9.C3502a;
import m9.C3503b;
import m9.C3504c;
import p9.C3776A;
import q5.InterfaceC3873h;
import r5.C3925b;
import t5.C4113h;
import t5.C4114i;
import u5.InterfaceC4255f;
import w9.C4386e;
import y5.C4563a;

/* loaded from: classes5.dex */
public final /* synthetic */ class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39622c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39624e;

    public /* synthetic */ V(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f39620a = i5;
        this.f39621b = obj;
        this.f39622c = obj2;
        this.f39623d = obj3;
        this.f39624e = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [ef.i, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Task taskForException;
        C3776A c3776a;
        switch (this.f39620a) {
            case 0:
                C1915d c1915d = new C1915d(25);
                W w2 = (W) this.f39621b;
                w2.f39626a.j(w2, (WebView) this.f39622c, (WebResourceRequest) this.f39623d, (WebResourceResponse) this.f39624e, c1915d);
                return;
            case 1:
                tf.a aVar = (tf.a) this.f39621b;
                m5.c cVar = (m5.c) this.f39622c;
                final tc.g gVar = (tc.g) this.f39623d;
                try {
                    final double dDoubleValue = ((Number) aVar.invoke()).doubleValue();
                    cVar.f40368c.post(new Runnable() { // from class: m5.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            gVar.a(Double.valueOf(dDoubleValue));
                        }
                    });
                    return;
                } catch (Exception e7) {
                    cVar.f40368c.post(new com.applovin.impl.mediation.ads.f(gVar, (String) this.f39624e, e7, 24));
                    return;
                }
            case 2:
                p9.n nVar = (p9.n) this.f39621b;
                p9.u uVar = (p9.u) this.f39622c;
                m9.V v2 = (m9.V) this.f39623d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f39624e;
                n0 n0Var = nVar.f43387i.f43432b;
                if (n0Var.f3477g) {
                    v9.g gVar2 = (v9.g) n0Var.f3475e;
                    v9.o oVar = gVar2.f47066a;
                    synchronized (uVar) {
                        try {
                            if (uVar.f43413d == null) {
                                uVar.f43413d = uVar.j(uVar.f43410a);
                            }
                            c3776a = uVar.f43413d;
                        } finally {
                        }
                    }
                    C3258n1 c3258n1J = oVar.j(c3776a);
                    HashMap map = new HashMap();
                    I0 i0D = J0.d();
                    i0D.b(c3258n1J.f());
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet = new HashSet();
                    Iterator it = v2.iterator();
                    int i5 = 1;
                    while (it.hasNext()) {
                        AbstractC3505d abstractC3505d = (AbstractC3505d) it.next();
                        if (!hashSet.contains(abstractC3505d.f40472c)) {
                            String str = abstractC3505d.f40472c;
                            hashSet.add(str);
                            StringBuilder sb2 = new StringBuilder("aggregate_");
                            int i10 = i5 + 1;
                            sb2.append(i5);
                            String string = sb2.toString();
                            map.put(string, str);
                            C0 c0F = H0.f();
                            V0 v0E = W0.e();
                            v0E.a(abstractC3505d.a());
                            W0 w02 = (W0) v0E.build();
                            if (abstractC3505d instanceof C3503b) {
                                c0F.c(E0.b());
                            } else if (abstractC3505d instanceof C3504c) {
                                F0 f0C = G0.c();
                                f0C.a(w02);
                                c0F.d((G0) f0C.build());
                            } else {
                                if (!(abstractC3505d instanceof C3502a)) {
                                    throw new RuntimeException("Unsupported aggregation");
                                }
                                A0 a0C = B0.c();
                                a0C.a(w02);
                                c0F.b((B0) a0C.build());
                            }
                            c0F.a(string);
                            arrayList.add((H0) c0F.build());
                            i5 = i10;
                        }
                    }
                    i0D.a(arrayList);
                    J0 j02 = (J0) i0D.build();
                    C3274u0 c3274u0E = C3276v0.e();
                    c3274u0E.a(c3258n1J.e());
                    c3274u0E.b(j02);
                    v9.m mVar = gVar2.f47068c;
                    F6.r rVarS = AbstractC3230e0.s();
                    C3276v0 c3276v0 = (C3276v0) c3274u0E.build();
                    mVar.getClass();
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    X8.c cVar2 = mVar.f47095d;
                    ((Task) cVar2.f16184a).continueWithTask(((C4386e) cVar2.f16185b).f47427a, new aa.f(26, cVar2, rVarS)).addOnCompleteListener(mVar.f47092a.f47427a, new A5.g(mVar, taskCompletionSource2, c3276v0, 23));
                    taskForException = taskCompletionSource2.getTask().continueWith(gVar2.f47067b.f47427a, new aa.f(25, gVar2, map));
                } else {
                    taskForException = Tasks.forException(new m9.G("Failed to get result from server.", m9.F.UNAVAILABLE));
                }
                taskForException.addOnSuccessListener(new C0654m(taskCompletionSource)).addOnFailureListener(new C0654m(taskCompletionSource));
                return;
            case 3:
                C4114i c4114i = (C4114i) this.f39622c;
                String str2 = c4114i.f45776a;
                InterfaceC3873h interfaceC3873h = (InterfaceC3873h) this.f39623d;
                C4113h c4113h = (C4113h) this.f39624e;
                C4563a c4563a = (C4563a) this.f39621b;
                c4563a.getClass();
                Logger logger = C4563a.f48025f;
                try {
                    InterfaceC4255f interfaceC4255fA = c4563a.f48028c.a(str2);
                    if (interfaceC4255fA == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        interfaceC3873h.a(new IllegalArgumentException(str3));
                    } else {
                        ((A5.m) c4563a.f48030e).o(new A5.g(c4563a, c4114i, ((C3925b) interfaceC4255fA).a(c4113h)));
                        interfaceC3873h.a(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    interfaceC3873h.a(e10);
                    return;
                }
            default:
                w2.a((w2) this.f39621b, (Context) this.f39622c, (String) this.f39623d, this.f39624e);
                return;
        }
    }
}
