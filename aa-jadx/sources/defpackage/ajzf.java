package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajzf extends defpackage.ajyz implements defpackage.ajvh {
    private final /* synthetic */ int a;

    public ajzf(int i) {
        this.a = i;
    }

    @Override // defpackage.ajvh
    public final java.lang.String a() {
        return this.a != 0 ? "comment" : "max-age";
    }

    @Override // defpackage.ajvj
    public final void b(defpackage.ajvu ajvuVar, java.lang.String str) throws defpackage.ajvt {
        if (this.a != 0) {
            return;
        }
        if (str == null) {
            throw new defpackage.ajvt("Missing value for 'max-age' attribute");
        }
        try {
            int i = java.lang.Integer.parseInt(str);
            if (i < 0) {
                throw new defpackage.ajvt("Negative 'max-age' attribute: ".concat(str));
            }
            ajvuVar.k(new java.util.Date(java.lang.System.currentTimeMillis() + (((long) i) * 1000)));
        } catch (java.lang.NumberFormatException unused) {
            throw new defpackage.ajvt("Invalid 'max-age' attribute: ".concat(str));
        }
    }
}
