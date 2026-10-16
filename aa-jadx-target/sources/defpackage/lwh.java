package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lwh {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CarExtenderParser");
    public final java.lang.String b;
    public final defpackage.yjh c;
    private final boolean d;

    public lwh(defpackage.yjh yjhVar, java.lang.String str, boolean z) {
        this.c = yjhVar;
        this.b = str;
        this.d = z;
    }

    public final int a() {
        return this.c.a;
    }

    public final void b(defpackage.zab zabVar, java.lang.String str) {
        if (this.d) {
            defpackage.omf.u().z(defpackage.zaa.SI_CREATION_FAILED, str, zabVar);
            defpackage.lxy.e();
            defpackage.lxy.i(defpackage.zbe.MESSAGING_PARSING, defpackage.zbd.no, str, 0L);
        }
    }

    public final boolean c() {
        return this.c.a != 0;
    }
}
