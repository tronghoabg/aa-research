package defpackage;

@Deprecated
/* loaded from: classes2.dex */
public final class ajym extends ajxz implements ajuh {
    @Override // defpackage.ajuh
    public final String a() {
        return "version";
    }

    @Override // defpackage.ajuj
    public final void b(ajuu ajuuVar, String str) throws ajut, NumberFormatException {
        int i;
        if (str == null) {
            throw new ajut("Missing value for version attribute");
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        ajuuVar.m(i);
    }
}
