package defpackage;

import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class fvg implements fvf {
    private static final aisp b = new aisp("^[\\s\\p{Punct}]*(?>THE |AN |A )?");
    private final fvh c = new fvh();

    @Override // defpackage.fvf
    public final fvd a(String str) {
        str.getClass();
        return this.c.a(b(str));
    }

    @Override // defpackage.fvf
    public final String b(String str) {
        aisp aispVar = b;
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        String strReplaceFirst = aispVar.a.matcher(upperCase).replaceFirst("");
        strReplaceFirst.getClass();
        return strReplaceFirst;
    }

    @Override // defpackage.fvf
    public final List c() {
        return fvh.b;
    }
}
