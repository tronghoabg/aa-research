package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ghy {
    public static final java.util.Map a = new java.util.LinkedHashMap();

    public static final defpackage.ghx a(defpackage.wi wiVar) {
        defpackage.ghx ghxVar;
        wiVar.getClass();
        defpackage.affc affcVar = (defpackage.affc) a.get(wiVar.getClass());
        return (affcVar == null || (ghxVar = (defpackage.ghx) affcVar.invoke(wiVar)) == null) ? new defpackage.ghx(true, false) : ghxVar;
    }
}
