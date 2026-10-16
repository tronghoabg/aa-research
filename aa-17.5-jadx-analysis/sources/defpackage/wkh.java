package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes3.dex */
final class wkh extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ wki b;

    public wkh(wki wkiVar, String str) {
        this.a = str;
        this.b = wkiVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.a)));
    }
}
