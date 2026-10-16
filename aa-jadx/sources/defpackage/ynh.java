package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ynh extends defpackage.yik {
    public static defpackage.ynh p(defpackage.ygw ygwVar, defpackage.yhx yhxVar, defpackage.yhx yhxVar2) {
        return ((long) ygwVar.size()) > (((long) yhxVar.size()) * ((long) yhxVar2.size())) / 2 ? new defpackage.yfa(ygwVar, yhxVar, yhxVar2) : new defpackage.ynx(ygwVar, yhxVar, yhxVar2);
    }

    @Override // defpackage.ydf
    public final /* bridge */ /* synthetic */ java.util.Collection b() {
        if (!e()) {
            return new defpackage.yng(this);
        }
        int i = defpackage.ygw.d;
        return defpackage.ymx.a;
    }

    @Override // defpackage.ydf
    public final /* bridge */ /* synthetic */ java.util.Set d() {
        return e() ? defpackage.ynd.a : new defpackage.ynf(this);
    }

    public abstract defpackage.yon i(int i);

    public abstract java.lang.Object j(int i);

    @Override // defpackage.yik
    abstract java.lang.Object writeReplace();
}
