package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class xtb {
    private static final ygr c;
    private static final ygr d;
    private static final xtb e;
    public final ygr a;
    public final boolean b;

    static {
        ygr ygrVarP = ygr.p("google.com", "www.google.com");
        c = ygrVarP;
        ygr ygrVarP2 = ygr.p("gmail.com", "www.gmail.com");
        d = ygrVarP2;
        ygr.p("googlemail.com", "www.googlemail.com");
        xtb xtbVar = new xtb(ygrVarP, false);
        e = xtbVar;
        new xtb(ygrVarP2, false);
        new xtb(yeb.a(ygrVarP2, xtbVar.a), xtbVar.b);
    }

    public xtb(Iterable iterable, boolean z) {
        ygp ygpVar = new ygp();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String strSubstring = (String) it.next();
            if (strSubstring.startsWith(".")) {
                strSubstring = strSubstring.substring(1);
            }
            ygpVar.c(woy.ar(strSubstring));
        }
        this.a = ygpVar.g();
        this.b = z;
    }
}
