package defpackage;

import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class yrj extends yrg {
    public static final yrg a = new yrj();

    @Override // defpackage.yrg
    public final ypp a(String str) {
        return new yrd(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
