package defpackage;

/* loaded from: classes2.dex */
public final class lwe {
    public static final yph a = yph.c("GH.MsgStyleParser");
    public final dtm b;
    public final String c;
    public final String d;
    public final boolean e;

    public lwe(dtm dtmVar, String str, String str2, boolean z) {
        this.c = str;
        this.b = dtmVar;
        this.d = str2;
        this.e = z;
    }

    public final yfq a() {
        return yfq.o(this.b.a);
    }

    public final boolean b() {
        yfq yfqVarA = a();
        dtl dtlVar = yfqVarA != null ? (dtl) yrm.an(yfqVarA) : null;
        if (dtlVar == null || dtlVar.c != null) {
            return false;
        }
        ((ype) a.l().ai(4395)).M("The last message is self reply message. PackageName: %s, MessagingStyle: %s.", this.c, this.b);
        return true;
    }
}
