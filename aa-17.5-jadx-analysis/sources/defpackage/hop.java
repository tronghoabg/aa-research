package defpackage;

import android.os.Bundle;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hop extends hnd {
    @Override // defpackage.hnd
    public final /* bridge */ /* synthetic */ hne a(Bundle bundle, Set set) {
        int i;
        String string = bundle.getString(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
        string.getClass();
        int iHashCode = string.hashCode();
        if (iHashCode == -1471810650) {
            if (string.equals("SCROLL_DELTA")) {
                i = 2;
                return new hoq(i, bundle.getInt("axes"), bundle.getFloat("x"), bundle.getFloat("y"), set);
            }
            throw new IllegalArgumentException();
        }
        if (iHashCode == -1457521584) {
            if (string.equals("SCROLL_START")) {
                i = 1;
                return new hoq(i, bundle.getInt("axes"), bundle.getFloat("x"), bundle.getFloat("y"), set);
            }
            throw new IllegalArgumentException();
        }
        if (iHashCode == -47016396 && string.equals("SCROLL_STOP")) {
            i = 3;
            return new hoq(i, bundle.getInt("axes"), bundle.getFloat("x"), bundle.getFloat("y"), set);
        }
        throw new IllegalArgumentException();
    }
}
