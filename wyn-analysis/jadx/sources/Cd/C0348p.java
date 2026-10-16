package Cd;

import Hf.InterfaceC0603m;
import Jd.AbstractC0671e;
import Jd.C0672f;
import Va.M6;
import android.util.Log;
import ef.C2515C;
import ff.AbstractC2641B;
import io.ktor.utils.io.InterfaceC2886t;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import wa.C4398a;
import wd.C4402c;
import x1.C4449b;
import xd.C4511c;
import y3.C4552j;

/* renamed from: Cd.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0348p extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2150a;

    /* renamed from: b, reason: collision with root package name */
    public int f2151b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2152c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0348p(int i5, InterfaceC3103c interfaceC3103c, int i10) {
        super(i5, interfaceC3103c);
        this.f2150a = i10;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2150a) {
            case 0:
                C0348p c0348p = new C0348p(3, (InterfaceC3103c) obj3, 0);
                c0348p.f2152c = (Rd.e) obj;
                c0348p.f2153d = obj2;
                return c0348p.invokeSuspend(C2515C.f34653a);
            case 1:
                C0348p c0348p2 = new C0348p(3, (InterfaceC3103c) obj3, 1);
                c0348p2.f2152c = (Rd.e) obj;
                c0348p2.f2153d = (Gd.c) obj2;
                return c0348p2.invokeSuspend(C2515C.f34653a);
            case 2:
                C0348p c0348p3 = new C0348p((tf.r) this.f2153d, (InterfaceC3103c) obj3, 2);
                c0348p3.f2152c = (Rd.e) obj;
                return c0348p3.invokeSuspend(C2515C.f34653a);
            case 3:
                C0348p c0348p4 = new C0348p((tf.p) this.f2153d, (InterfaceC3103c) obj3, 3);
                c0348p4.f2152c = (Rd.e) obj;
                return c0348p4.invokeSuspend(C2515C.f34653a);
            case 4:
                C0348p c0348p5 = new C0348p(3, (InterfaceC3103c) obj3, 4);
                c0348p5.f2152c = (InterfaceC0603m) obj;
                c0348p5.f2153d = (Throwable) obj2;
                return c0348p5.invokeSuspend(C2515C.f34653a);
            default:
                C0348p c0348p6 = new C0348p((C4402c) this.f2153d, (InterfaceC3103c) obj3, 5);
                c0348p6.f2152c = (Rd.e) obj;
                return c0348p6.invokeSuspend(C2515C.f34653a);
        }
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Md.c c0347o;
        Rd.e eVar;
        Throwable th;
        C2515C c2515c = C2515C.f34653a;
        int i5 = 1;
        switch (this.f2150a) {
            case 0:
                kf.a aVar = kf.a.f39711a;
                int i10 = this.f2151b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Fe.e.U(obj);
                    return c2515c;
                }
                Fe.e.U(obj);
                Rd.e eVar2 = (Rd.e) this.f2152c;
                Object body = this.f2153d;
                Jd.n nVar = ((Fd.c) eVar2.f10601a).f4047c;
                List list = Jd.p.f6064a;
                String strE = nVar.E("Accept");
                Object obj2 = eVar2.f10601a;
                if (strE == null) {
                    ((Fd.c) obj2).f4047c.z("Accept", "*/*");
                }
                C0672f c0672fI = AbstractC2641B.i((Jd.r) obj2);
                if (body instanceof String) {
                    String str = (String) body;
                    if (c0672fI == null) {
                        c0672fI = AbstractC0671e.f6050a;
                    }
                    c0347o = new Md.d(str, c0672fI);
                } else if (body instanceof byte[]) {
                    c0347o = new C0346n(c0672fI, body);
                } else if (body instanceof InterfaceC2886t) {
                    c0347o = new C0347o(eVar2, c0672fI, body);
                } else if (body instanceof Md.c) {
                    c0347o = (Md.c) body;
                } else {
                    Fd.c context = (Fd.c) obj2;
                    AbstractC3340k.e(context, "context");
                    AbstractC3340k.e(body, "body");
                    c0347o = body instanceof InputStream ? new C0347o(context, c0672fI, body) : null;
                }
                if ((c0347o != null ? c0347o.b() : null) == null) {
                    return c2515c;
                }
                Fd.c cVar = (Fd.c) obj2;
                ((Map) cVar.f4047c.f421a).remove("Content-Type");
                AbstractC0350s.f2175a.s("Transformed with default transformers request body for " + cVar.f4045a + " from " + kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(body.getClass()));
                this.f2152c = null;
                this.f2151b = 1;
                return eVar2.e(c0347o, this) == aVar ? aVar : c2515c;
            case 1:
                kf.a aVar2 = kf.a.f39711a;
                int i11 = this.f2151b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Fe.e.U(obj);
                    return c2515c;
                }
                Fe.e.U(obj);
                Rd.e eVar3 = (Rd.e) this.f2152c;
                Gd.c cVar2 = (Gd.c) this.f2153d;
                Sd.a aVar3 = cVar2.f4721a;
                Object obj3 = cVar2.f4722b;
                if (!(obj3 instanceof InterfaceC2886t) || !AbstractC3340k.a(aVar3.f11061a, kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(InputStream.class))) {
                    return c2515c;
                }
                InterfaceC2886t interfaceC2886t = (InterfaceC2886t) obj3;
                AbstractC3340k.e(interfaceC2886t, "<this>");
                Gd.c cVar3 = new Gd.c(aVar3, new C0351t(new C0351t(interfaceC2886t, i5), 0));
                this.f2152c = null;
                this.f2151b = 1;
                return eVar3.e(cVar3, this) == aVar2 ? aVar2 : c2515c;
            case 2:
                kf.a aVar4 = kf.a.f39711a;
                int i12 = this.f2151b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Fe.e.U(obj);
                    return c2515c;
                }
                Fe.e.U(obj);
                Rd.e eVar4 = (Rd.e) this.f2152c;
                Dd.f fVar = new Dd.f();
                Object obj4 = eVar4.f10601a;
                Object objC = eVar4.c();
                this.f2151b = 1;
                return ((tf.r) this.f2153d).invoke(fVar, obj4, objC, this) == aVar4 ? aVar4 : c2515c;
            case 3:
                kf.a aVar5 = kf.a.f39711a;
                int i13 = this.f2151b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Fe.e.U(obj);
                    return c2515c;
                }
                Fe.e.U(obj);
                Object obj5 = ((Rd.e) this.f2152c).f10601a;
                this.f2151b = 1;
                return ((tf.p) this.f2153d).invoke(obj5, this) == aVar5 ? aVar5 : c2515c;
            case 4:
                kf.a aVar6 = kf.a.f39711a;
                int i14 = this.f2151b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Fe.e.U(obj);
                    return c2515c;
                }
                Fe.e.U(obj);
                InterfaceC0603m interfaceC0603m = (InterfaceC0603m) this.f2152c;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f2153d);
                C4449b c4449b = new C4449b(true);
                this.f2152c = null;
                this.f2151b = 1;
                return interfaceC0603m.emit(c4449b, this) == aVar6 ? aVar6 : c2515c;
            default:
                kf.a aVar7 = kf.a.f39711a;
                int i15 = this.f2151b;
                if (i15 == 0) {
                    Fe.e.U(obj);
                    Rd.e eVar5 = (Rd.e) this.f2152c;
                    try {
                        this.f2152c = eVar5;
                        this.f2151b = 1;
                        Object objD = eVar5.d(this);
                        if (objD == aVar7) {
                            return aVar7;
                        }
                        eVar = eVar5;
                        obj = objD;
                    } catch (Throwable th2) {
                        eVar = eVar5;
                        th = th2;
                        C4552j c4552j = ((C4402c) this.f2153d).f47474j;
                        C4398a c4398a = Hd.a.f5004d;
                        ((C4511c) eVar.f10601a).e();
                        c4552j.getClass();
                        M6.z(((Pd.b) c4552j.f48001b).a(c4398a));
                        throw th;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (Rd.e) this.f2152c;
                    try {
                        Fe.e.U(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        C4552j c4552j2 = ((C4402c) this.f2153d).f47474j;
                        C4398a c4398a2 = Hd.a.f5004d;
                        ((C4511c) eVar.f10601a).e();
                        c4552j2.getClass();
                        M6.z(((Pd.b) c4552j2.f48001b).a(c4398a2));
                        throw th;
                    }
                }
                return c2515c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0348p(Object obj, InterfaceC3103c interfaceC3103c, int i5) {
        super(3, interfaceC3103c);
        this.f2150a = i5;
        this.f2153d = obj;
    }
}
