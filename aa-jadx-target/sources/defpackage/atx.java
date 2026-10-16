package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class atx {
    public static final defpackage.atx a = new defpackage.atx();

    private atx() {
    }

    public static final defpackage.cgf a(defpackage.cgf cgfVar, defpackage.cft cftVar) {
        return cgfVar.a(new defpackage.aux(cftVar));
    }

    public static final defpackage.cgf b(defpackage.cgf cgfVar, float f, boolean z) {
        if (f <= 0.0d) {
            defpackage.axd.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return cgfVar.a(new defpackage.avk(f, z));
    }
}
