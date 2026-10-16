package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes3.dex */
public final class whv extends ClickableSpan {
    final /* synthetic */ why a;

    public whv(why whyVar) {
        this.a = whyVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a();
    }
}
