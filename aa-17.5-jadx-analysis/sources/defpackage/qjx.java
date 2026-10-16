package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qjx implements mns {
    private final Set a = new HashSet();

    static {
        yph.c("GH.StreamTelemImpl");
    }

    private static String e(moa moaVar) {
        return String.format(Locale.ENGLISH, "%s,%d", moaVar.J(), Long.valueOf(moaVar.A()));
    }

    @Override // defpackage.mns
    public final synchronized void a(moa moaVar) {
        Set set = this.a;
        String strE = e(moaVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(strE)) {
                it.remove();
            }
        }
    }

    @Override // defpackage.mns
    public final synchronized void b(moa moaVar, yzz yzzVar, yzy yzyVar) {
        if (this.a.add(String.format(Locale.ENGLISH, "%s,%d", e(moaVar), Integer.valueOf(yzyVar.a())))) {
            ebf.j().m(yzzVar, yzyVar, moaVar.I(), moaVar.H(), moaVar.O());
        }
    }

    @Override // defpackage.lhg
    public final synchronized void d() {
        this.a.clear();
    }

    @Override // defpackage.lhg
    public final void c() {
    }
}
