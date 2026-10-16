package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class ocm implements View.OnClickListener {
    public ocq a;
    final /* synthetic */ oco b;

    public ocm(oco ocoVar) {
        this.b = ocoVar;
    }

    public final void a() {
        if (this.a != null) {
            ((ype) ocq.h.l().ai((char) 5554)).u("Dismissing tooltip due to outside click");
            this.b.a(yzy.lO);
            this.a.a();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a != null) {
            ((ype) ocq.h.l().ai((char) 5555)).u("Dismissing tooltip due to click");
            this.b.a(yzy.lM);
            this.a.a();
        }
    }
}
