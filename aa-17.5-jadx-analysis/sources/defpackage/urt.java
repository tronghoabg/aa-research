package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
final class urt {
    public final tqv a;
    public tqt c;
    private final int d;
    private int e = 0;
    public int b = 0;
    private final List f = new ArrayList();

    public urt(int i, tqv tqvVar) {
        this.d = i;
        this.a = tqvVar;
    }

    final synchronized int a(urp urpVar) {
        int iB;
        this.f.add(urpVar);
        iB = b() - 1;
        tqt tqtVar = this.c;
        if (tqtVar != null) {
            urpVar.a(tqtVar);
        }
        return iB;
    }

    final synchronized int b() {
        return this.f.size();
    }

    final synchronized uru c() {
        tqt tqtVar;
        if (this.c == null) {
            tqv tqvVar = this.a;
            int i = this.d;
            Locale locale = Locale.US;
            Integer numValueOf = Integer.valueOf(i);
            int i2 = this.e;
            this.e = i2 + 1;
            tqt tqtVarC = tqvVar.c(String.format(locale, "style_collection_%d_%d", numValueOf, Integer.valueOf(i2)));
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((urp) it.next()).a(tqtVarC);
            }
            this.c = tqtVarC;
        }
        this.b++;
        tqtVar = this.c;
        tqtVar.getClass();
        return new uru(tqtVar, this);
    }
}
