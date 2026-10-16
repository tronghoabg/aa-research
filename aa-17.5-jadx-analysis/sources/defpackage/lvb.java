package defpackage;

/* loaded from: classes.dex */
public final class lvb {
    private static final yph a = yph.c("GH.MsgAppNotifSuppr");
    private String b;

    public static lvb a() {
        return (lvb) mki.a.i(lvb.class);
    }

    public final void b() {
        ((ype) ((ype) a.f()).ai((char) 4280)).u("removeBlockingPackage");
        this.b = null;
    }

    public final void c(String str) {
        ((ype) ((ype) a.f()).ai((char) 4281)).y("setBlockingPackage %s", str);
        String str2 = this.b;
        woy.ad(str2 == null, "Blocking package is already set to %s", str2);
        this.b = str;
        mcb.b().a(str).b(ogb.k() ? nuo.h : null);
    }

    public final boolean d(String str) {
        return str.equals(this.b);
    }
}
