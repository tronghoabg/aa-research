package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class hlw extends ClickableSpan {
    final /* synthetic */ geu a;
    final /* synthetic */ uq b;

    public hlw(geu geuVar, uq uqVar) {
        this.a = geuVar;
        this.b = uqVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        gca.e(this.a, this.b);
    }
}
