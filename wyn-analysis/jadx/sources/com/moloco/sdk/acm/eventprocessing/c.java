package com.moloco.sdk.acm.eventprocessing;

import Ef.E;
import ef.C2515C;
import java.util.ArrayList;
import java.util.Iterator;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f28380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S3.i f28381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.h f28382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(S3.i iVar, com.moloco.sdk.acm.h hVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28381b = iVar;
        this.f28382c = hVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new c(this.f28381b, this.f28382c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28380a;
        if (i5 == 0) {
            Fe.e.U(obj);
            com.moloco.sdk.acm.h hVar = this.f28382c;
            com.moloco.sdk.acm.db.b bVar = com.moloco.sdk.acm.db.b.f28353b;
            long j8 = hVar.f28419c;
            ArrayList arrayList = hVar.f28417a;
            ArrayList arrayList2 = new ArrayList(ff.p.a0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(android.support.v4.media.session.b.H((com.moloco.sdk.acm.i) it.next()));
            }
            this.f28380a = 1;
            if (S3.i.a(this.f28381b, hVar.f28418b, bVar, j8, arrayList2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
