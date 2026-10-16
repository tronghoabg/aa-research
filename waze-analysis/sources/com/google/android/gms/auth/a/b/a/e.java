package com.google.android.gms.auth.a.b.a;

import android.content.Context;
import com.google.android.gms.common.api.internal.bm;
import com.google.android.gms.common.api.internal.bn;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.o.t;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends q implements com.google.android.gms.auth.a.b.f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4414a = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final d f4415c;

    /* renamed from: d, reason: collision with root package name */
    private static final u f4416d;

    static {
        d dVar = new d();
        f4415c = dVar;
        f4416d = new u("RestoreCredential.API", dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context, f4416d, com.google.android.gms.common.api.f.f4696g, p.f4878a);
        x.f(context, "context");
    }

    @Override // com.google.android.gms.auth.a.b.f
    public final t a(com.google.android.gms.auth.a.b.a aVar) {
        x.f(aVar, "request");
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.c.a.f4656i);
        bmVarB.c(new c(aVar, 0));
        bmVarB.f(DisplayStrings.DS_TOLL_INFO_DISABLED_BY_CONFIG_MESSAGE);
        t tVarO = o(bmVarB.b());
        x.e(tVarO, "doRead(...)");
        return tVarO;
    }

    @Override // com.google.android.gms.auth.a.b.f
    public final t b(com.google.android.gms.auth.a.b.b bVar) {
        x.f(bVar, "request");
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.c.a.f4657j);
        bmVarB.c(new c(bVar, 2));
        bmVarB.f(DisplayStrings.DS_TOLL_INFO_DISABLED_BY_CONFIG_HEADER);
        t tVarO = o(bmVarB.b());
        x.e(tVarO, "doRead(...)");
        return tVarO;
    }

    @Override // com.google.android.gms.auth.a.b.f
    public final t c(com.google.android.gms.auth.a.b.d dVar) {
        x.f(dVar, "request");
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.c.a.f4658k);
        bmVarB.c(new c(dVar, 3));
        bmVarB.f(DisplayStrings.DS_TOLL_INFO_DYNAMIC_PRICE_SHOWN_HEADER);
        t tVarO = o(bmVarB.b());
        x.e(tVarO, "doRead(...)");
        return tVarO;
    }
}
