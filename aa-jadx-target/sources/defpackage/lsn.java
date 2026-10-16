package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lsn implements defpackage.pu {
    private final /* synthetic */ int a;

    public /* synthetic */ lsn(int i) {
        this.a = i;
    }

    @Override // defpackage.pu
    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            return ((lok) obj).e;
        }
        if (i == 1) {
            java.util.List list = (java.util.List) obj;
            defpackage.yqm yqmVar = defpackage.lpx.a;
            return list;
        }
        if (i == 2) {
            return ((lok) obj).f;
        }
        if (i == 3) {
            return ((lok) obj).g;
        }
        if (i == 4) {
            return ((lok) obj).h;
        }
        if (i != 5) {
            return java.lang.Boolean.valueOf(((java.lang.Integer) obj).intValue() == 2);
        }
        return ((android.support.v4.app.Fragment) obj).getHost();
    }
}
