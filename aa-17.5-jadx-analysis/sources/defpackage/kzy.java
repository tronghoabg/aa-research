package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kzy {
    public static final yph a = yph.c("GH.Assistant.Suggestion");
    public final Map b = new HashMap();
    public long c;

    @ResultIgnorabilityUnspecified
    public final boolean a(String str) {
        Long l = (Long) this.b.remove(str);
        if (l == null) {
            ((ype) ((ype) a.f()).ai((char) 3668)).y("Can't cancel suggestion %s because it wasn't posted", str);
            return false;
        }
        ((ype) a.l().ai((char) 3667)).M("Cancelling notification with ID %s for suggestion %s", l, str);
        nuj.b().g("GH.Assistant.Suggestion", l.longValue(), RemoteApiConstants.NOW_PACKAGE);
        return true;
    }
}
