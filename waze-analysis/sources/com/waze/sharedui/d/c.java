package com.waze.sharedui.d;

import android.content.Context;
import com.waze.ab.o;
import com.waze.ab.s;
import com.waze.app_nav.hub.b.i;
import com.waze.app_nav.hub.b.j;
import com.waze.app_nav.hub.b.m;
import com.waze.design_components.d;
import com.waze.settings.gr;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f38861a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f38862b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f38862b = i2;
        this.f38861a = obj;
    }

    @Override // com.waze.app_nav.hub.b.j
    public final i create(Context context) {
        int i2 = this.f38862b;
        if (i2 == 0) {
            x.f(context, "context");
            return m.a(com.waze.sharedui.api.i.b(context, (String) this.f38861a));
        }
        if (i2 == 1) {
            return gr.a((gr) this.f38861a, context);
        }
        if (i2 == 2) {
            x.f(context, "context");
            return m.a(d.c(context, (com.waze.design_components.c.j) this.f38861a));
        }
        x.f(context, "context");
        s sVar = new s(context, (o) this.f38861a);
        sVar.show();
        return m.a(sVar);
    }
}
