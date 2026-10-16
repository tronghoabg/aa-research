package defpackage;

import android.companion.CompanionDeviceManager;
import java.util.List;

/* loaded from: classes.dex */
public final class jmg {
    public final CompanionDeviceManager a;

    public jmg(CompanionDeviceManager companionDeviceManager) {
        this.a = companionDeviceManager;
    }

    public final List a() {
        List myAssociations = this.a.getMyAssociations();
        myAssociations.getClass();
        return myAssociations;
    }

    public final void b(int i) {
        this.a.notifyDeviceDisappeared(i);
    }
}
