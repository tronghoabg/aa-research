package com.waze.settings.tree.views;

import android.content.Context;
import com.waze.config.cv;
import com.waze.settings.de;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends WazeSettingsView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context);
        h.g.b.x.f(context, "context");
    }

    public final void a(final com.waze.settings.tree.d.s sVar, final de deVar) {
        h.g.b.x.f(sVar, "setting");
        h.g.b.x.f(deVar, "page");
        A(sVar.t());
        com.waze.nightmode.e.q(this, sVar.m());
        if (sVar.P() != null) {
            P(sVar.P());
        }
        B(2);
        D(sVar.B().Q());
        setTag(sVar.s());
        Integer numO = sVar.o();
        if (numO != null) {
            o(numO.intValue());
        }
        C(new o(sVar, this));
        s(new com.waze.sharedui.views.w() { // from class: com.waze.settings.tree.views.n
            @Override // com.waze.sharedui.views.w
            public final void a(boolean z) {
                com.waze.settings.tree.c.f.c(sVar, z, deVar.c(), this);
            }
        });
    }

    public final void b(com.waze.settings.tree.d.r rVar, de deVar) {
        h.g.b.x.f(rVar, "setting");
        h.g.b.x.f(deVar, "page");
        A(rVar.t());
        com.waze.nightmode.e.q(this, rVar.m());
        B(4);
        setTag(rVar.s());
        int iIntValue = ((Number) rVar.c().invoke()).intValue();
        v(Integer.valueOf(iIntValue));
        t(new z(rVar, deVar, iIntValue));
    }

    public final void c(com.waze.settings.tree.d.n nVar, de deVar) {
        h.g.b.x.f(nVar, "setting");
        h.g.b.x.f(deVar, "page");
        A(nVar.t());
        com.waze.nightmode.e.q(this, nVar.m());
        B(0);
        setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(nVar, deVar, 8, null));
        P(nVar.g());
        setTag(nVar.s());
        Integer numO = nVar.o();
        if (numO != null) {
            o(numO.intValue());
        }
    }

    public final void d(com.waze.settings.tree.d.g gVar, de deVar) {
        h.g.b.x.f(gVar, "setting");
        h.g.b.x.f(deVar, "page");
        A(gVar.t());
        com.waze.nightmode.e.q(this, gVar.m());
        P(gVar.P());
        B(8);
        setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(deVar, gVar, 3));
        gVar.c().observe(deVar.h(), new f(new cv(this, 20), 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, char[] cArr, byte[] bArr) {
        super(context);
        h.g.b.x.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, byte[] bArr, char[] cArr) {
        super(context);
        h.g.b.x.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, short[] sArr) {
        super(context);
        h.g.b.x.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, byte[] bArr, byte[] bArr2) {
        super(context);
        h.g.b.x.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, char[] cArr) {
        super(context);
        h.g.b.x.f(context, "context");
    }

    public p(Context context, byte[] bArr) {
        super(context);
    }
}
