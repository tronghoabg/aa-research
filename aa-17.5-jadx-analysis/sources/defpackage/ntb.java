package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.RotaryDialpadView;
import com.google.android.gearhead.appdecor.CarUiEntry;

/* loaded from: classes2.dex */
public final /* synthetic */ class ntb implements View.OnClickListener {
    private final /* synthetic */ int a;

    public /* synthetic */ ntb(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ComponentName componentNameA = null;
        switch (this.a) {
            case 0:
                yph yphVar = ntc.a;
                kio kioVarB = kio.b();
                if (kioVarB.r()) {
                    componentNameA = map.a(kioVarB.e(), true);
                } else {
                    ((ype) ((ype) ntc.a.h()).ai((char) 5423)).u("Retry clicked but car not connected");
                }
                if (componentNameA == null) {
                    componentNameA = mkn.s;
                }
                ((ype) ntc.a.l().ai((char) 5424)).y("Starting %s", componentNameA);
                mpe.a().i(new Intent().setComponent(componentNameA));
                return;
            case 1:
                yph yphVar2 = RotaryDialpadView.a;
                throw null;
            case 2:
                yph yphVar3 = com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView.a;
                throw null;
            case 3:
            case 5:
                return;
            case 4:
                int i = CarUiEntry.a;
                return;
            case 6:
                throw null;
            default:
                throw null;
        }
    }
}
