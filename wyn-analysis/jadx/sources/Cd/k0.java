package Cd;

import Ef.I0;
import a.AbstractC1304a;
import ef.C2515C;
import ff.AbstractC2641B;
import io.ktor.utils.io.InterfaceC2886t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import lf.AbstractC3471j;
import wd.C4400a;
import wd.C4402c;
import xd.C4511c;

/* loaded from: classes5.dex */
public final class k0 extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2123a;

    /* renamed from: b, reason: collision with root package name */
    public int f2124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4402c f2125c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2126d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2128f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, C4402c c4402c, InterfaceC3103c interfaceC3103c, int i5) {
        super(3, interfaceC3103c);
        this.f2123a = i5;
        this.f2128f = obj;
        this.f2125c = c4402c;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2123a) {
            case 0:
                k0 k0Var = new k0((l0) this.f2128f, this.f2125c, (InterfaceC3103c) obj3, 0);
                k0Var.f2126d = (Rd.e) obj;
                k0Var.f2127e = obj2;
                return k0Var.invokeSuspend(C2515C.f34653a);
            case 1:
                k0 k0Var2 = new k0((tf.q) this.f2128f, this.f2125c, (InterfaceC3103c) obj3, 1);
                k0Var2.f2126d = (u0) obj;
                k0Var2.f2127e = (Fd.c) obj2;
                return k0Var2.invokeSuspend(C2515C.f34653a);
            default:
                Ad.e eVar = (Ad.e) this.f2128f;
                k0 k0Var3 = new k0(this.f2125c, eVar, (InterfaceC3103c) obj3);
                k0Var3.f2126d = (Rd.e) obj;
                k0Var3.f2127e = obj2;
                return k0Var3.invokeSuspend(C2515C.f34653a);
        }
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Rd.e eVar;
        KType kTypeB;
        Object objA;
        KType kTypeB2;
        KType kTypeB3;
        Ad.e eVar2;
        Object objI;
        Rd.e eVar3;
        Fd.d requestData;
        zd.f fVar;
        KType kTypeB4;
        switch (this.f2123a) {
            case 0:
                kf.a aVar = kf.a.f39711a;
                int i5 = this.f2124b;
                if (i5 == 0) {
                    Fe.e.U(obj);
                    eVar = (Rd.e) this.f2126d;
                    Object obj2 = this.f2127e;
                    if (!(obj2 instanceof Md.c)) {
                        throw new IllegalStateException(Bf.l.W("\n|Fail to prepare request body for sending. \n|The body type is: " + kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(obj2.getClass()) + ", with Content-Type: " + AbstractC2641B.i((Jd.r) eVar.f10601a) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
                    }
                    Fd.c cVar = (Fd.c) eVar.f10601a;
                    if (obj2 == null) {
                        Md.a aVar2 = Md.a.f7629a;
                        cVar.getClass();
                        cVar.f4048d = aVar2;
                        KClass orCreateKotlinClass = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(Md.c.class);
                        try {
                            kTypeB2 = kotlin.jvm.internal.H.b(Md.c.class);
                        } catch (Throwable unused) {
                            kTypeB2 = null;
                        }
                        cVar.b(new Sd.a(orCreateKotlinClass, kTypeB2));
                    } else if (obj2 instanceof Md.c) {
                        cVar.getClass();
                        AbstractC3340k.e(obj2, "<set-?>");
                        cVar.f4048d = obj2;
                        cVar.b(null);
                    } else {
                        cVar.getClass();
                        AbstractC3340k.e(obj2, "<set-?>");
                        cVar.f4048d = obj2;
                        KClass orCreateKotlinClass2 = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(Md.c.class);
                        try {
                            kTypeB = kotlin.jvm.internal.H.b(Md.c.class);
                        } catch (Throwable unused2) {
                            kTypeB = null;
                        }
                        cVar.b(new Sd.a(orCreateKotlinClass2, kTypeB));
                    }
                    l0 l0Var = (l0) this.f2128f;
                    l0Var.getClass();
                    u0 i0Var = new i0(this.f2125c);
                    Iterator it = ff.o.G0(l0Var.f2135a).iterator();
                    while (it.hasNext()) {
                        i0Var = new j0((tf.q) it.next(), i0Var);
                    }
                    Fd.c cVar2 = (Fd.c) eVar.f10601a;
                    this.f2126d = eVar;
                    this.f2124b = 1;
                    objA = i0Var.a(cVar2, this);
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Fe.e.U(obj);
                        return C2515C.f34653a;
                    }
                    eVar = (Rd.e) this.f2126d;
                    Fe.e.U(obj);
                    objA = obj;
                }
                this.f2126d = null;
                this.f2124b = 2;
                if (eVar.e((C4511c) objA, this) == aVar) {
                    return aVar;
                }
                return C2515C.f34653a;
            case 1:
                kf.a aVar3 = kf.a.f39711a;
                int i10 = this.f2124b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Fe.e.U(obj);
                    return obj;
                }
                Fe.e.U(obj);
                u0 u0Var = (u0) this.f2126d;
                Fd.c cVar3 = (Fd.c) this.f2127e;
                Dd.h hVar = new Dd.h(u0Var, this.f2125c.f47468d);
                this.f2126d = null;
                this.f2124b = 1;
                Object objInvoke = ((tf.q) this.f2128f).invoke(hVar, cVar3, this);
                return objInvoke == aVar3 ? aVar3 : objInvoke;
            default:
                kf.a aVar4 = kf.a.f39711a;
                int i11 = this.f2124b;
                C4402c client = this.f2125c;
                if (i11 == 0) {
                    Fe.e.U(obj);
                    Rd.e eVar4 = (Rd.e) this.f2126d;
                    Object obj3 = this.f2127e;
                    Fd.c cVar4 = new Fd.c();
                    Fd.c builder = (Fd.c) eVar4.f10601a;
                    AbstractC3340k.e(builder, "builder");
                    cVar4.f4049e = builder.f4049e;
                    cVar4.d(builder);
                    if (obj3 == null) {
                        cVar4.f4048d = Md.a.f7629a;
                        KClass orCreateKotlinClass3 = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(Object.class);
                        try {
                            kTypeB4 = kotlin.jvm.internal.H.b(Object.class);
                        } catch (Throwable unused3) {
                            kTypeB4 = null;
                        }
                        cVar4.b(new Sd.a(orCreateKotlinClass3, kTypeB4));
                    } else if (obj3 instanceof Md.c) {
                        cVar4.f4048d = obj3;
                        cVar4.b(null);
                    } else {
                        cVar4.f4048d = obj3;
                        KClass orCreateKotlinClass4 = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(Object.class);
                        try {
                            kTypeB3 = kotlin.jvm.internal.H.b(Object.class);
                        } catch (Throwable unused4) {
                            kTypeB3 = null;
                        }
                        cVar4.b(new Sd.a(orCreateKotlinClass4, kTypeB3));
                    }
                    client.f47474j.q(Hd.a.f5002b);
                    Jd.H hB = cVar4.f4045a.b();
                    Jd.s sVar = cVar4.f4046b;
                    Jd.o oVar = new Jd.o((Map) cVar4.f4047c.f421a);
                    Object obj4 = cVar4.f4048d;
                    Md.c cVar5 = obj4 instanceof Md.c ? (Md.c) obj4 : null;
                    if (cVar5 == null) {
                        throw new IllegalStateException(("No request transformation found: " + cVar4.f4048d).toString());
                    }
                    I0 i02 = cVar4.f4049e;
                    Nd.d dVar = cVar4.f4050f;
                    Fd.d dVar2 = new Fd.d(hB, sVar, oVar, cVar5, i02, dVar);
                    dVar.e(zd.h.f48489b, client.k);
                    Set setKeySet = oVar.f8669c.keySet();
                    AbstractC3340k.e(setKeySet, "<this>");
                    Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(setKeySet);
                    AbstractC3340k.d(setUnmodifiableSet, "unmodifiableSet(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : setUnmodifiableSet) {
                        if (Jd.p.f6064a.contains((String) obj5)) {
                            arrayList.add(obj5);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        String header = arrayList.toString();
                        AbstractC3340k.e(header, "header");
                        throw new Jd.w("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
                    }
                    Iterator it2 = dVar2.f4057g.iterator();
                    do {
                        boolean zHasNext = it2.hasNext();
                        eVar2 = (Ad.e) this.f2128f;
                        if (zHasNext) {
                            fVar = (zd.f) it2.next();
                        } else {
                            this.f2126d = eVar4;
                            this.f2127e = dVar2;
                            this.f2124b = 1;
                            objI = AbstractC1304a.i(eVar2, dVar2, this);
                            if (objI == aVar4) {
                                return aVar4;
                            }
                            eVar3 = eVar4;
                            requestData = dVar2;
                        }
                    } while (eVar2.f1276e.contains(fVar));
                    throw new IllegalArgumentException(("Engine doesn't support " + fVar).toString());
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Fe.e.U(obj);
                    return C2515C.f34653a;
                }
                requestData = (Fd.d) this.f2127e;
                Rd.e eVar5 = (Rd.e) this.f2126d;
                Fe.e.U(obj);
                eVar3 = eVar5;
                objI = obj;
                Fd.g responseData = (Fd.g) objI;
                AbstractC3340k.e(client, "client");
                AbstractC3340k.e(requestData, "requestData");
                AbstractC3340k.e(responseData, "responseData");
                C4511c c4511c = new C4511c(client);
                c4511c.f47886b = new Fd.a(c4511c, requestData);
                c4511c.f47887c = new Gd.a(c4511c, responseData);
                Nd.d dVarB = c4511c.b();
                Nd.a key = C4511c.f47884e;
                dVarB.getClass();
                AbstractC3340k.e(key, "key");
                dVarB.c().remove(key);
                InterfaceC2886t interfaceC2886t = responseData.f4074e;
                if (!(interfaceC2886t instanceof InterfaceC2886t)) {
                    c4511c.b().e(key, interfaceC2886t);
                }
                Gd.a aVarE = c4511c.e();
                client.f47474j.q(Hd.a.f5003c);
                Ef.H.u(aVarE.getCoroutineContext()).invokeOnCompletion(new C4400a(client, aVarE));
                this.f2126d = null;
                this.f2127e = null;
                this.f2124b = 2;
                if (eVar3.e(c4511c, this) == aVar4) {
                    return aVar4;
                }
                return C2515C.f34653a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(C4402c c4402c, Ad.e eVar, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f2123a = 2;
        this.f2125c = c4402c;
        this.f2128f = eVar;
    }
}
