package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lyr {
    public static final defpackage.lyq a = new defpackage.lyq();
    public static final defpackage.afhl b = new defpackage.lco(defpackage.mkp.b, 11);
    public final defpackage.yqm c = defpackage.yqm.c("GH.MessagingMetaCache");
    public final java.util.HashMap d = new java.util.HashMap();

    public static final defpackage.lyr a() {
        return a.a();
    }

    public final defpackage.ohy b(defpackage.lwi lwiVar) {
        java.lang.Long l = (java.lang.Long) this.d.get(lwiVar);
        if (l == null) {
            return null;
        }
        defpackage.lvn lvnVarA = defpackage.lnt.m().a(l.longValue());
        if (lvnVarA instanceof defpackage.lvp) {
            return new defpackage.ohy((defpackage.lvp) lvnVarA, lwiVar);
        }
        return null;
    }
}
