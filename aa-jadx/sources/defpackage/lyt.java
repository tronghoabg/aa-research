package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lyt {
    public static final defpackage.lys a = new defpackage.lys();
    public static final defpackage.afhl b = new defpackage.lco(defpackage.mkp.b, 12);
    public final defpackage.yqm c = defpackage.yqm.c("GH.MessagingMetaCache");
    public final java.util.HashMap d = new java.util.HashMap();

    public static final defpackage.lyt a() {
        return a.a();
    }

    public final defpackage.oht b(defpackage.lwi lwiVar) {
        java.lang.Long l = (java.lang.Long) this.d.get(lwiVar);
        if (l == null) {
            return null;
        }
        defpackage.mog mogVarA = defpackage.lxy.o().a(defpackage.zaw.IM_NOTIFICATION, l.longValue());
        if (mogVarA instanceof defpackage.lxg) {
            return new defpackage.oht((defpackage.lxg) mogVarA, lwiVar);
        }
        return null;
    }
}
