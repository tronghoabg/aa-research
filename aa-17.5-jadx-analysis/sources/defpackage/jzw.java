package defpackage;

import android.view.KeyEvent;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.RotaryDialpadView;

/* loaded from: classes2.dex */
public final class jzw extends ebf {
    final /* synthetic */ RotaryDialpadView a;

    public jzw(RotaryDialpadView rotaryDialpadView) {
        this.a = rotaryDialpadView;
    }

    @Override // defpackage.ebf
    public final void l(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 5 && keyEvent.getAction() == 1) {
            this.a.e();
        }
    }
}
