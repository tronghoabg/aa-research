package g2;

import android.net.Uri;

/* renamed from: g2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2674D {

    /* renamed from: a, reason: collision with root package name */
    public final long f35519a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35520b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f35521c;

    public C2674D(int i5, long j8, Uri uri) {
        this.f35519a = j8;
        this.f35520b = i5;
        this.f35521c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l8.e0 a(android.net.Uri r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C2674D.a(android.net.Uri, java.lang.String):l8.e0");
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        Q1.k.c(scheme.equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        String host = uri3.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? uri3 : string.endsWith("/") ? Q1.k.u(string, str) : Q1.k.u(string.concat("/"), str);
    }
}
