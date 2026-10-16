package com.moloco.sdk.internal.publisher.nativead.parser;

import E5.Q;
import Ef.E;
import com.moloco.sdk.internal.A;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.internal.z;
import ef.C2515C;
import ef.C2527k;
import ef.C2532p;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class f extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f29234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.e f29235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2532p f29236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.moloco.sdk.internal.publisher.nativead.model.e eVar, C2532p c2532p, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29235b = eVar;
        this.f29236c = c2532p;
        this.f29237d = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new f(this.f29235b, this.f29236c, this.f29237d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws a {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29234a;
        com.moloco.sdk.internal.publisher.nativead.model.e eVar = this.f29235b;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f29234a = 1;
            obj = A6.c.d(eVar, this.f29236c, this.f29237d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        A a5 = (A) obj;
        if (a5 instanceof z) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Successfully prepared native asset: " + eVar.f29181a, null, false, 12, null);
            return new C2527k(eVar, a5);
        }
        if (!(a5 instanceof y)) {
            throw new Q((byte) 0, 9);
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to prepare required native asset: " + eVar.f29181a, null, false, 12, null);
        throw new a(eVar.f29181a, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((y) a5).f29793a);
    }
}
