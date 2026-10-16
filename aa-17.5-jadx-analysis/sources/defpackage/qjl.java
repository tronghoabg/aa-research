package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class qjl {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final Uri f;

    public qjl(String str, String str2, String str3, long j, String str4, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        if (uri == null || str4 == null) {
            this.e = null;
            this.f = null;
        } else {
            this.e = str4;
            this.f = uri;
        }
    }

    public qjl(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = null;
        this.f = null;
    }
}
