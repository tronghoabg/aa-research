package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajzm extends defpackage.ajyz implements defpackage.ajvh {
    @Override // defpackage.ajvh
    public final java.lang.String a() {
        return "version";
    }

    @Override // defpackage.ajvj
    public final void b(defpackage.ajvu ajvuVar, java.lang.String str) throws defpackage.ajvt {
        int i;
        if (str == null) {
            throw new defpackage.ajvt("Missing value for version attribute");
        }
        try {
            i = java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            i = 0;
        }
        ajvuVar.m(i);
    }
}
