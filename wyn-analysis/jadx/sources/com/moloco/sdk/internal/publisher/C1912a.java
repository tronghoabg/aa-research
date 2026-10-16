package com.moloco.sdk.internal.publisher;

import android.net.Uri;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.publisher.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1912a extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f28987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1913b f28988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f28990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1912a(C1913b c1913b, long j8, D d3, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28988b = c1913b;
        this.f28989c = j8;
        this.f28990d = d3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1912a(this.f28988b, this.f28989c, this.f28990d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1912a) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28987a;
        C1913b c1913b = this.f28988b;
        if (i5 == 0) {
            Fe.e.U(obj);
            com.moloco.sdk.internal.services.events.c cVar = c1913b.f28995c;
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.f fVar = com.moloco.sdk.xenoss.sdkdevkit.android.core.services.f.f32419j;
            D d3 = this.f28990d;
            this.f28987a = 1;
            obj = cVar.a(this.f28989c, fVar, d3.f28912a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        String burl = (String) obj;
        com.moloco.sdk.internal.j jVar = c1913b.f28999g;
        AbstractC3340k.e(burl, "burl");
        try {
            Uri uri = Uri.parse(burl);
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n nVar = jVar.f28658a;
            String string = uri.toString();
            AbstractC3340k.d(string, "toString(...)");
            nVar.a(string);
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BUrlTrackerImpl", e7.toString(), null, false, 12, null);
        }
        return C2515C.f34653a;
    }
}
