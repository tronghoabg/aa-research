package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajzx extends defpackage.ajyz implements defpackage.ajvh {
    @Override // defpackage.ajvh
    public final java.lang.String a() {
        return "version";
    }

    @Override // defpackage.ajvj
    public final void b(defpackage.ajvu ajvuVar, java.lang.String str) throws defpackage.ajvt {
        if (str == null) {
            throw new defpackage.ajvt("Missing value for version attribute");
        }
        if (str.trim().isEmpty()) {
            throw new defpackage.ajvt("Blank value for version attribute");
        }
        try {
            ajvuVar.m(java.lang.Integer.parseInt(str));
        } catch (java.lang.NumberFormatException e) {
            throw new defpackage.ajvt("Invalid version: ".concat(java.lang.String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.ajyz, defpackage.ajvj
    public final void c(defpackage.ajvi ajviVar, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
        defpackage.aguw.e(ajviVar, "Cookie");
        if (ajviVar.a() < 0) {
            throw new defpackage.ajvn("Cookie version may not be negative");
        }
    }
}
