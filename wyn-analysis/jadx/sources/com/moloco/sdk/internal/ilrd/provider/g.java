package com.moloco.sdk.internal.ilrd.provider;

import Hf.C0594d0;
import Hf.e0;
import Hf.g0;
import Hf.j0;
import Hf.k0;
import Hf.v0;
import Hf.x0;
import android.content.Context;
import com.moloco.sdk.internal.ilrd.B;
import com.moloco.sdk.internal.ilrd.C;
import com.moloco.sdk.internal.ilrd.D;
import com.moloco.sdk.internal.ilrd.u;
import com.unity3d.mediation.LevelPlay;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import ef.C2532p;

/* loaded from: classes4.dex */
public final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28626a;

    /* renamed from: c, reason: collision with root package name */
    public final C2532p f28628c;

    /* renamed from: d, reason: collision with root package name */
    public final C2532p f28629d;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.ilrd.model.a f28627b = com.moloco.sdk.internal.ilrd.model.a.f28599b;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f28630e = k0.c(D.f28541a);

    /* renamed from: f, reason: collision with root package name */
    public final j0 f28631f = k0.b(0, 0, 7);

    public g(Context context, Kd.a aVar) {
        this.f28626a = context;
        final int i5 = 0;
        this.f28628c = Fe.c.z(new tf.a(this) { // from class: com.moloco.sdk.internal.ilrd.provider.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f28625b;

            {
                this.f28625b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new e0(this.f28625b.f28630e);
                    default:
                        return new C0594d0(this.f28625b.f28631f);
                }
            }
        });
        final int i10 = 1;
        this.f28629d = Fe.c.z(new tf.a(this) { // from class: com.moloco.sdk.internal.ilrd.provider.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f28625b;

            {
                this.f28625b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new e0(this.f28625b.f28630e);
                    default:
                        return new C0594d0(this.f28625b.f28631f);
                }
            }
        });
    }

    public static Object d() {
        Object objZ;
        C2515C c2515c = C2515C.f34653a;
        try {
            Class.forName("com.unity3d.mediation.LevelPlay");
            Class.forName("com.unity3d.mediation.impression.LevelPlayImpressionData");
            LevelPlay.addImpressionDataListener(new f());
            objZ = c2515c;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        return thA == null ? c2515c : Fe.e.z(thA);
    }

    @Override // com.moloco.sdk.internal.ilrd.u
    public final com.moloco.sdk.internal.ilrd.model.a a() {
        return this.f28627b;
    }

    @Override // com.moloco.sdk.internal.ilrd.u
    public final synchronized Object b() {
        Object objD;
        try {
            objD = d();
            Throwable thA = C2530n.a(objD);
            if (thA != null) {
                x0 x0Var = this.f28630e;
                B b5 = new B(thA.toString());
                x0Var.getClass();
                x0Var.k(null, b5);
            }
            if (!(objD instanceof C2529m)) {
                x0 x0Var2 = this.f28630e;
                C c10 = C.f28540a;
                x0Var2.getClass();
                x0Var2.k(null, c10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return objD;
    }

    @Override // com.moloco.sdk.internal.ilrd.u
    public final g0 c() {
        return (g0) this.f28629d.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.u
    public final v0 getState() {
        return (v0) this.f28628c.getValue();
    }
}
