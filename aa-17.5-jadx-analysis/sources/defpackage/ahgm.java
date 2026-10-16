package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final /* synthetic */ class ahgm {
    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(CharSequence charSequence, String str) {
        if (charSequence == null) {
            throw new IllegalArgumentException(str.concat(" may not be null"));
        }
        if (ahku.a(charSequence)) {
            throw new IllegalArgumentException(str.concat(" may not be blank"));
        }
    }

    public static void c(Collection collection, String str) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(str.concat(" may not be empty"));
        }
    }

    public static void d(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str.concat(" may not be negative"));
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str.concat(" may not be null"));
        }
    }

    public static final void f(akbh akbhVar, String str, boolean z) {
        if (!z) {
            for (int i = 0; i < str.length() && !z; i++) {
                z = " ;,:@()<>\\\"/[]?={}\t".indexOf(str.charAt(i)) >= 0;
            }
        }
        if (z) {
            akbhVar.e('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if ("\"\\".indexOf(cCharAt) >= 0) {
                akbhVar.e('\\');
            }
            akbhVar.e(cCharAt);
        }
        if (z) {
            akbhVar.e('\"');
        }
    }

    public static final int g(ajpp ajppVar) {
        if (ajppVar == null) {
            return 0;
        }
        int length = ajppVar.b().length();
        String strC = ajppVar.c();
        return strC != null ? length + strC.length() + 3 : length;
    }

    public static final void h(akbh akbhVar, ajpp ajppVar, boolean z) {
        e(ajppVar, "Name / value pair");
        akbhVar.j(g(ajppVar));
        akbhVar.f(ajppVar.b());
        String strC = ajppVar.c();
        if (strC != null) {
            akbhVar.e('=');
            f(akbhVar, strC, z);
        }
    }
}
