package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
final class wzc implements View.OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ wzd c;

    public wzc(wzd wzdVar, View view, View view2) {
        this.a = view;
        this.b = view2;
        this.c = wzdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wpq.f(this.a, 8);
        wpq.f(this.b, 0);
        this.c.s.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aclr.d())).putExtra("force_fullscreen", true).putExtra("finish_on_ended", true));
    }
}
