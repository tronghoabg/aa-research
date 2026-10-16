package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dwa {
    public static final dwa a = b(new Locale[0]);
    private final dwb b;

    public dwa(dwb dwbVar) {
        this.b = dwbVar;
    }

    public static dwa b(Locale... localeArr) {
        return new dwa(new dwb(new LocaleList(localeArr)));
    }

    public static dwa c(String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new dwa(new dwb(new LocaleList(localeArr)));
    }

    public final int a() {
        return this.b.a.size();
    }

    public final String d() {
        return this.b.a.toLanguageTags();
    }

    public final Locale e(int i) {
        return this.b.a.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dwa) && this.b.equals(((dwa) obj).b);
    }

    public final boolean f() {
        return this.b.a.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
