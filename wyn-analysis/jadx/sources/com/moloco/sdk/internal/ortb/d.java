package com.moloco.sdk.internal.ortb;

import Ef.E;
import com.moloco.sdk.internal.ortb.model.C1910y;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.internal.z;
import ef.C2515C;
import java.util.concurrent.CancellationException;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f28676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28677b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28676a = eVar;
        this.f28677b = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new d(this.f28676a, this.f28677b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        try {
            Xf.c cVar = this.f28676a.f28678a;
            String str = this.f28677b;
            cVar.getClass();
            return new z(g.a((C1910y) cVar.a(str, C1910y.Companion.serializer())));
        } catch (Sf.b e7) {
            return new y(new b(e7.f11118a));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception e11) {
            return new y(new a(e11));
        }
    }
}
