package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
public final /* synthetic */ class oio implements afek {
    @Override // defpackage.afek
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Integer) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue5 = ((Boolean) obj6).booleanValue();
        afce afceVar = new afce();
        if (zBooleanValue2) {
            afceVar.add(oiq.e);
        }
        if (zBooleanValue3) {
            afceVar.add(oiq.d);
        }
        if (zBooleanValue4) {
            afceVar.add(oiq.b);
        }
        Display display = ((DisplayManager) mki.a.c.getSystemService(DisplayManager.class)).getDisplay(0);
        display.getClass();
        if (display.getState() == 2 || display.getState() == 6) {
            afceVar.add(oiq.f);
        }
        if (zBooleanValue5) {
            afceVar.add(oiq.c);
        }
        return new oir(iIntValue, zBooleanValue, woy.aN(afceVar));
    }
}
