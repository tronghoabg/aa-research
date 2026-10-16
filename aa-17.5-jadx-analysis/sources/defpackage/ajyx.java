package defpackage;

/* loaded from: classes2.dex */
public final class ajyx extends ajxz implements ajuh {
    @Override // defpackage.ajuh
    public final String a() {
        return "version";
    }

    @Override // defpackage.ajuj
    public final void b(ajuu ajuuVar, String str) throws ajut {
        if (str == null) {
            throw new ajut("Missing value for version attribute");
        }
        if (str.trim().isEmpty()) {
            throw new ajut("Blank value for version attribute");
        }
        try {
            ajuuVar.m(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            throw new ajut("Invalid version: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.ajxz, defpackage.ajuj
    public final void c(ajui ajuiVar, ajul ajulVar) throws ajut {
        ahgm.e(ajuiVar, "Cookie");
        if (ajuiVar.a() < 0) {
            throw new ajun("Cookie version may not be negative");
        }
    }
}
