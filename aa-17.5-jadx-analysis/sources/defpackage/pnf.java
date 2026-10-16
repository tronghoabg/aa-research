package defpackage;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes2.dex */
public final class pnf {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/clientparam/api/ExternalInvocationParameters");
    private final List b;

    public pnf(accl acclVar) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        for (String str : acclVar.b) {
            try {
                yflVar.i(Pattern.compile(str));
            } catch (PatternSyntaxException e) {
                ((ynz) ((ynz) a.a(uys.a).p(e)).ai(6797)).y("Invalid denylist regex: %s", str);
            }
        }
        this.b = yflVar.g();
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("denylistedPatterns", this.b);
        return xxgVarAo.toString();
    }
}
