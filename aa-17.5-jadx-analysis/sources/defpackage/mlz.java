package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.UsbConfigFragment;

/* loaded from: classes2.dex */
public final class mlz extends ClickableSpan {
    final /* synthetic */ UsbConfigFragment a;

    public mlz(UsbConfigFragment usbConfigFragment) {
        this.a = usbConfigFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(acxj.d()));
        this.a.startActivity(intent);
    }
}
