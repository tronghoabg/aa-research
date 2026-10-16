package com.moloco.sdk.internal.ilrd.provider;

import Hf.C0594d0;
import Hf.e0;
import Hf.g0;
import Hf.j0;
import Hf.k0;
import Hf.v0;
import Hf.x0;
import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.moloco.sdk.internal.ilrd.B;
import com.moloco.sdk.internal.ilrd.C;
import com.moloco.sdk.internal.ilrd.D;
import com.moloco.sdk.internal.ilrd.u;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import ef.C2532p;

/* loaded from: classes4.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28617a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f28618b;

    /* renamed from: d, reason: collision with root package name */
    public final C2532p f28620d;

    /* renamed from: e, reason: collision with root package name */
    public final C2532p f28621e;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.ilrd.model.a f28619c = com.moloco.sdk.internal.ilrd.model.a.f28598a;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f28622f = k0.c(D.f28541a);

    /* renamed from: g, reason: collision with root package name */
    public final j0 f28623g = k0.b(0, 0, 7);

    public d(Context context, Kd.a aVar) {
        this.f28617a = context;
        this.f28618b = aVar;
        final int i5 = 0;
        this.f28620d = Fe.c.z(new tf.a(this) { // from class: com.moloco.sdk.internal.ilrd.provider.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f28612b;

            {
                this.f28612b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new e0(this.f28612b.f28622f);
                    default:
                        return new C0594d0(this.f28612b.f28623g);
                }
            }
        });
        final int i10 = 1;
        this.f28621e = Fe.c.z(new tf.a(this) { // from class: com.moloco.sdk.internal.ilrd.provider.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f28612b;

            {
                this.f28612b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new e0(this.f28612b.f28622f);
                    default:
                        return new C0594d0(this.f28612b.f28623g);
                }
            }
        });
    }

    @Override // com.moloco.sdk.internal.ilrd.u
    public final com.moloco.sdk.internal.ilrd.model.a a() {
        return this.f28619c;
    }

    @Override // com.moloco.sdk.internal.ilrd.u
    public final synchronized Object b() {
        Object objZ;
        Object objZ2;
        try {
            try {
                int i5 = AppLovinCommunicatorMessage.f20733b;
                try {
                    objZ = AppLovinCommunicator.getInstance();
                } catch (Throwable unused) {
                    objZ = AppLovinCommunicator.getInstance(this.f28617a);
                }
            } catch (Throwable th) {
            }
        } finally {
        }
        Throwable thA = C2530n.a(objZ);
        if (thA == null) {
            ((AppLovinCommunicator) objZ).subscribe(new c(this), "max_revenue_events");
            objZ2 = C2515C.f34653a;
        } else {
            objZ2 = Fe.e.z(thA);
        }
        Throwable thA2 = C2530n.a(objZ2);
        if (thA2 != null) {
            x0 x0Var = this.f28622f;
            B b5 = new B(thA2.toString());
            x0Var.getClass();
            x0Var.k(null, b5);
        }
        if (!(objZ2 instanceof C2529m)) {
            x0 x0Var2 = this.f28622f;
            C c10 = C.f28540a;
            x0Var2.getClass();
            x0Var2.k(null, c10);
        }
        return objZ2;
    }

    @Override // com.moloco.sdk.internal.ilrd.u
    public final g0 c() {
        return (g0) this.f28621e.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.u
    public final v0 getState() {
        return (v0) this.f28620d.getValue();
    }
}
