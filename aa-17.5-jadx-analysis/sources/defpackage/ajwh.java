package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ajwh implements ajss {
    @Override // defpackage.ajss
    public final long getKeepAliveDuration(ajpj ajpjVar, akba akbaVar) throws ajpr, NoSuchElementException {
        ajzz ajzzVar = new ajzz(ajpjVar.o("Keep-Alive"));
        while (ajzzVar.hasNext()) {
            ajzy ajzyVarA = ajzzVar.a();
            String str = ajzyVarA.a;
            String str2 = ajzyVarA.b;
            if (str2 != null && str.equalsIgnoreCase("timeout")) {
                try {
                    return Long.parseLong(str2) * 1000;
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        return -1L;
    }
}
