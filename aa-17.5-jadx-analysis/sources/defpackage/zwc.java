package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zwc {
    private static final HashMap a = new HashMap();

    @ResultIgnorabilityUnspecified
    public static synchronized zvz a(aabc aabcVar, gjt gjtVar, acbe acbeVar) {
        HashMap map = a;
        zvz zvzVar = (zvz) map.get(acbeVar);
        if (zvzVar != null) {
            return zvzVar;
        }
        zvz zvzVar2 = new zvz(gjtVar, acbeVar);
        ((zxs) aabcVar.m).d(zvzVar2.b, zvzVar2);
        ((zst) ((zuq) aabcVar.i).b.gu()).z(zvzVar2);
        map.put(acbeVar, zvzVar2);
        return zvzVar2;
    }
}
