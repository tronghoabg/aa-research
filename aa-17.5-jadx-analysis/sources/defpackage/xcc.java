package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes3.dex */
final class xcc extends ClickableSpan {
    final /* synthetic */ xce a;

    public xcc(xce xceVar) {
        this.a = xceVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        xce xceVar = this.a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", qtr.a(xceVar.getContext()), null));
        intent.addFlags(268435456);
        xceVar.startActivity(intent);
    }
}
