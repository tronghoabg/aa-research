package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class wap {
    public final Uri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public wap(Uri uri, String str, String str2, boolean z, boolean z2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final wap a() {
        return new wap(this.a, this.b, this.c, this.d, true);
    }

    public final wap b() {
        String str = this.b;
        if (str.isEmpty()) {
            return new wap(this.a, str, this.c, true, this.e);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final war c(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        boolean z = war.b;
        return new wah(this, str, lValueOf);
    }

    public final war d(String str, String str2) {
        boolean z = war.b;
        return new wal(this, str, str2, true);
    }

    public final war e(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean z2 = war.b;
        return new waj(this, str, boolValueOf, true);
    }

    public final war f(String str, wao waoVar, String str2) {
        boolean z = war.b;
        return new wan(this, str, str2, waoVar);
    }
}
