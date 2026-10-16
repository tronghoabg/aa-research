package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qlj {
    public final java.util.Set a = new java.util.HashSet();

    static {
        defpackage.yqm.c("GH.DismissCache");
    }

    public final java.lang.String a(defpackage.mog mogVar) {
        return java.lang.String.format(java.util.Locale.US, "%s,%d,%d", mogVar.J(), java.lang.Long.valueOf(mogVar.A()), java.lang.Long.valueOf(mogVar.F().f == 3 ? mogVar.N().longValue() : 0L));
    }
}
