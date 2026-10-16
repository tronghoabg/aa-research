package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
final class uhy extends Exception {
    public uhy(uhz uhzVar, String str, int i) {
        super(String.format(Locale.US, "More %s styles in %s than limit (%d)", str, uhzVar.c, Integer.valueOf(i)));
    }
}
