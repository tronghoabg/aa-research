package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ypg extends defpackage.yox {
    public static final ypg.a a = new ypg.a();

    final class a extends defpackage.ypt implements defpackage.ype {
    }

    @java.lang.Deprecated
    public static defpackage.ypg c(java.lang.String str) {
        return new defpackage.ypg(defpackage.yrs.d(str.replace('/', '.')));
    }

    @Override // defpackage.yox
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.ype a(java.util.logging.Level level) {
        boolean zK = k(level);
        defpackage.yrs.n(i(), level, zK);
        return !zK ? a : new defpackage.ypf(this, level);
    }
}
