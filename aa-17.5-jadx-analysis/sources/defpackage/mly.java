package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.UsbConfigFragment;

/* loaded from: classes2.dex */
public final class mly extends ClickableSpan {
    final /* synthetic */ UsbConfigFragment a;

    public mly(UsbConfigFragment usbConfigFragment) {
        this.a = usbConfigFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ohe oheVar = this.a.i;
        if (oheVar != null) {
            oheVar.f();
        }
    }
}
