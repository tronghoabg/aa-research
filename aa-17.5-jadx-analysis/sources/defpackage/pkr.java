package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class pkr implements pkl {
    public static final yob a = yob.c("com/google/android/apps/gmm/recovery/crashloop/counters/MarkerFileBasedCounter");
    public static final Pattern b = Pattern.compile("_(\\d+)_[^\\d]+_(\\d+)$");
    public final String c;
    public volatile xxh d = xvy.a;
    public final int e;

    public pkr(String str, int i) {
        if (woy.am(str)) {
            ((ynz) a.a(uys.a).ai((char) 6753)).u("Prefix cannot be null or empty");
        }
        if (str.contains("_")) {
            ((ynz) a.a(uys.a).ai((char) 6752)).u("Prefix cannot have underscore (_) as it's used as a file parts separator.");
        }
        this.c = str;
        this.e = i;
    }

    public static int a(File file) throws pkm {
        String name = file.getName();
        try {
            return Integer.parseInt(name.substring(name.lastIndexOf("_") + 1));
        } catch (NumberFormatException e) {
            throw new pkm("Inconsistent marker file name ".concat(String.valueOf(name)), e, name);
        }
    }

    public static File b(Context context) {
        return new File(uym.a(context), "crash_markers");
    }

    public static boolean d(pkq pkqVar) {
        int i = 0;
        do {
            try {
                return pkqVar.a();
            } catch (Exception e) {
                ((ynz) ((ynz) a.a(uys.a).p(new IllegalStateException(e))).ai((char) 6755)).s();
                i++;
            }
        } while (i < 2);
        return false;
    }

    public final String c(long j) {
        return String.format(Locale.getDefault(), "crashloop_%s_attempted_%d_count_%d", this.c, Long.valueOf(j), 0);
    }
}
