package com.waze.uid;

import android.content.Context;
import com.waze.sharedui.views.an;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements an {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f44555a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f44556b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f44557c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f44558d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f44559e;

    q(h.g.a.a aVar, Context context, String str, String str2, int i2) {
        this.f44559e = i2;
        this.f44555a = aVar;
        this.f44556b = context;
        this.f44557c = str;
        this.f44558d = str2;
    }

    @Override // com.waze.sharedui.views.an
    public final void a(String str) {
        int i2 = this.f44559e;
        h.g.a.a aVar = this.f44555a;
        if (i2 != 0) {
            aVar.invoke();
            com.waze.uid.d.s sVar = com.waze.uid.d.q.f44463a.a().f44466d;
            com.waze.uid.d.r rVar = new com.waze.uid.d.r(this.f44557c, true);
            String str2 = this.f44558d;
            h.g.b.x.c(str2);
            Context context = this.f44556b;
            context.startActivity(sVar.a(context, rVar, str2));
            return;
        }
        aVar.invoke();
        com.waze.uid.d.s sVar2 = com.waze.uid.d.q.f44463a.a().f44466d;
        com.waze.uid.d.r rVar2 = new com.waze.uid.d.r(this.f44557c, true);
        String str3 = this.f44558d;
        h.g.b.x.c(str3);
        Context context2 = this.f44556b;
        context2.startActivity(sVar2.a(context2, rVar2, str3));
    }
}
