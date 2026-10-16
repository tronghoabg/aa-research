package defpackage;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class qko {
    public final Set a = new HashSet();

    static {
        yph.c("GH.DismissCache");
    }

    public final String a(moa moaVar) {
        return String.format(Locale.US, "%s,%d,%d", moaVar.J(), Long.valueOf(moaVar.A()), Long.valueOf(moaVar.F().f == 3 ? moaVar.N().longValue() : 0L));
    }
}
