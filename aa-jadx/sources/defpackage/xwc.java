package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xwc {
    public static final defpackage.xwb a = new defpackage.xwd(1);

    public static final defpackage.xwb a(defpackage.vlu vluVar) {
        return defpackage.fdp.b() ? defpackage.xwd.a(vluVar.a) : a;
    }

    public static final defpackage.xwb b(java.lang.String str) {
        return defpackage.fdp.b() ? defpackage.xwd.a(str) : a;
    }

    public static defpackage.xwb c(java.lang.String str, defpackage.vlu vluVar) {
        return defpackage.fdp.b() ? defpackage.xwd.a(str.concat(vluVar.a)) : a;
    }

    public static defpackage.xwb d(java.lang.String str, java.lang.Enum r2) {
        return defpackage.fdp.b() ? defpackage.xwd.a(str.concat(java.lang.String.valueOf(r2.name()))) : a;
    }
}
