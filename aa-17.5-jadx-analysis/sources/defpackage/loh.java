package defpackage;

import android.content.ComponentName;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
public final class loh {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.MediaAppFinder");

    public static ComponentName a(qrn qrnVar, String str) {
        yfq yfqVarC = c(qrnVar, str);
        if (yfqVarC.isEmpty()) {
            return null;
        }
        ComponentName componentName = (ComponentName) Collection.EL.stream(yfqVarC).min(Comparator.CC.naturalOrder()).get();
        if (yfqVarC.size() > 1) {
            ((ype) ((ype) b.h()).ai(4100)).M("Multiple browser services %s, choosing %s", yfqVarC, componentName);
        }
        return componentName;
    }

    public static eqj b() {
        return tby.v((eqj) nfh.a().a, new lmv(5));
    }

    public static yfq c(qrn qrnVar, String str) {
        Stream streamFilter = d(qrnVar).filter(new koh(str, 17));
        int i = yfq.d;
        return (yfq) streamFilter.collect(ycm.a);
    }

    public static Stream d(qrn qrnVar) {
        return Collection.EL.stream(lem.a().b(qrnVar, nyj.d(nyi.a))).filter(new kxo(7)).map(new lka(10));
    }
}
