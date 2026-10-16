package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class faz implements fbd {
    public final Set a = new LinkedHashSet();

    public faz(fbe fbeVar) {
        fbeVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.fbd
    public final Bundle a() {
        Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
        fbh.e(bundleZ, "classes_to_restore", woy.cf(this.a));
        return bundleZ;
    }
}
