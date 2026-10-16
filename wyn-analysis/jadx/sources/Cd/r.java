package Cd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import wd.C4402c;

/* loaded from: classes5.dex */
public final class r extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2164a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f2165b;

    /* renamed from: c, reason: collision with root package name */
    public Ef.E f2166c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2167d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2168e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Long l10, Long l11, Long l12, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f2168e = l10;
        this.f2169f = l11;
        this.f2170g = l12;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2164a) {
            case 0:
                r rVar = new r((C4402c) this.f2170g, (InterfaceC3103c) obj3);
                rVar.f2167d = (Rd.e) obj;
                rVar.f2169f = (Gd.c) obj2;
                return rVar.invokeSuspend(C2515C.f34653a);
            default:
                r rVar2 = new r((Long) this.f2168e, (Long) this.f2169f, (Long) this.f2170g, (InterfaceC3103c) obj3);
                rVar2.f2166c = (Dd.h) obj;
                rVar2.f2167d = (Fd.c) obj2;
                return rVar2.invokeSuspend(C2515C.f34653a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0246  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C4402c c4402c, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f2170g = c4402c;
    }
}
