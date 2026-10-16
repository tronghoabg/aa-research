package com.moloco.sdk.internal.publisher.nativead.parser;

import Ef.E;
import Ef.H;
import ef.C2515C;
import ef.C2532p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class g extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f29238a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f29240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2532p f29241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, C2532p c2532p, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29240c = list;
        this.f29241d = c2532p;
        this.f29242e = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        g gVar = new g(this.f29240c, this.f29241d, this.f29242e, interfaceC3103c);
        gVar.f29239b = obj;
        return gVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29238a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        E e7 = (E) this.f29239b;
        List list = this.f29240c;
        ArrayList arrayList = new ArrayList(ff.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(H.h(e7, null, new f((com.moloco.sdk.internal.publisher.nativead.model.e) it.next(), this.f29241d, this.f29242e, null), 3));
        }
        this.f29238a = 1;
        Object objI = H.i(arrayList, this);
        return objI == aVar ? aVar : objI;
    }
}
