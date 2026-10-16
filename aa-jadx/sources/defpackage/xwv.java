package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xwv implements java.io.Serializable {
    public final defpackage.xwq a;
    public final java.util.Map b;

    private xwv(defpackage.xwq xwqVar, java.util.Map map) {
        this.a = xwqVar;
        this.b = map;
    }

    public static defpackage.xwv a(defpackage.xwq xwqVar, java.util.Map map) {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f("Authorization", defpackage.ygw.q("Bearer ".concat(java.lang.String.valueOf(xwqVar.a))));
        yhaVar.h(map);
        return new defpackage.xwv(xwqVar, yhaVar.d(true));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xwv)) {
            return false;
        }
        defpackage.xwv xwvVar = (defpackage.xwv) obj;
        return j$.util.Objects.equals(this.b, xwvVar.b) && j$.util.Objects.equals(this.a, xwvVar.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }
}
