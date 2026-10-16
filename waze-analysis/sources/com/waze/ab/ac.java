package com.waze.ab;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.bd;
import com.waze.jy;
import com.waze.ka;
import com.waze.kc;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ac implements com.waze.app_nav.hub.b.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13762b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13763c;

    public /* synthetic */ ac(bd bdVar, jy jyVar, int i2) {
        this.f13763c = i2;
        this.f13761a = bdVar;
        this.f13762b = jyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.waze.app_nav.hub.b.j
    public final com.waze.app_nav.hub.b.i create(Context context) {
        int i2 = this.f13763c;
        kc kcVarB = null;
        Object[] objArr = 0;
        if (i2 == 0) {
            h.g.b.x.f(context, "it");
            Object obj = this.f13761a;
            Object obj2 = this.f13762b;
            if (obj != null) {
                kcVarB = ((bd) obj).b((ka) obj2);
            }
            return new com.waze.app_nav.hub.b.e(((jy) obj2).d(), kcVarB, ComposableLambdaKt.composableLambdaInstance(68391728, true, new com.waze.ads.c.a(obj2, 16)), 4);
        }
        if (i2 == 1) {
            h.g.b.x.f(context, "it");
            return new com.waze.app_nav.hub.b.e((h.g.a.a) null, (com.waze.app_nav.hub.b.f) null, ComposableLambdaKt.composableLambdaInstance(300236628, true, new com.waze.o.d.b.b.b(this.f13762b, this.f13761a, 5, objArr == true ? 1 : 0)), 7);
        }
        h.g.b.x.f(context, "context");
        s sVar = new s(context, (o) this.f13762b);
        sVar.setOnCancelListener(new com.waze.design_components.c.f(this.f13761a, 11));
        sVar.show();
        return com.waze.app_nav.hub.b.m.a(sVar);
    }

    public /* synthetic */ ac(Object obj, h.g.a.a aVar, int i2) {
        this.f13763c = i2;
        this.f13762b = obj;
        this.f13761a = aVar;
    }
}
