package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yqm extends defpackage.yqk {
    public yqm(defpackage.yqu yquVar) {
        super(yquVar);
    }

    public static defpackage.yqm c(java.lang.String str) {
        return new defpackage.yqm(defpackage.yrs.d(str));
    }

    public static defpackage.yqm m() {
        return new defpackage.yqm(defpackage.yrs.d(defpackage.yrs.g().b(defpackage.yqm.class)));
    }

    @Override // defpackage.yox
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.yqj a(java.util.logging.Level level) {
        boolean zK = k(level);
        defpackage.yrs.n(i(), level, zK);
        return !zK ? c : new defpackage.yql(this, level);
    }
}
