package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class wyj {
    public final Context a;
    public volatile wyi b;
    public final ykd c;
    private final oht d;

    public wyj(Context context, oht ohtVar, ykd ykdVar) {
        this.a = context;
        this.c = ykdVar;
        this.d = ohtVar;
    }

    public final void a(yzy yzyVar) {
        this.d.F(rrc.h(yxy.FRX, yzz.VANAGON_FRX_COMPATIBILITY_CHECK, yzyVar).l());
    }

    public final synchronized void b() {
        this.b = new wyi(this);
        this.b.start();
    }
}
