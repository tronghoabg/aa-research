package defpackage;

import android.content.Intent;
import android.util.Log;

/* loaded from: classes2.dex */
public final class gle implements gkw {
    public static final gle a = new gle();

    private gle() {
    }

    @Override // defpackage.gkw
    public final void a(gkw gkwVar, Intent intent) {
        Log.e("CarApp.H.Tem", a.bw(gkwVar, intent, "[INVALID] Wrongly transforming ", " intent from Waze Format to ", "."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gle)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1082068125;
    }

    public final String toString() {
        return "WazeFormat";
    }
}
