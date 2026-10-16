package defpackage;

import java.util.Date;

/* loaded from: classes2.dex */
public final class ajyf extends ajxz implements ajuh {
    private final /* synthetic */ int a;

    public ajyf(int i) {
        this.a = i;
    }

    @Override // defpackage.ajuh
    public final String a() {
        return this.a != 0 ? "comment" : "max-age";
    }

    @Override // defpackage.ajuj
    public final void b(ajuu ajuuVar, String str) throws ajut, NumberFormatException {
        if (this.a != 0) {
            return;
        }
        if (str == null) {
            throw new ajut("Missing value for 'max-age' attribute");
        }
        try {
            int i = Integer.parseInt(str);
            if (i < 0) {
                throw new ajut("Negative 'max-age' attribute: ".concat(str));
            }
            ajuuVar.k(new Date(System.currentTimeMillis() + (i * 1000)));
        } catch (NumberFormatException unused) {
            throw new ajut("Invalid 'max-age' attribute: ".concat(str));
        }
    }
}
