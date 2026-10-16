package g4;

import A.C0217j;
import Bf.r;
import android.graphics.Bitmap;
import com.google.android.gms.common.api.f;
import java.util.Date;
import k4.e;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.internal.http.DatesKt;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2701b {

    /* renamed from: a, reason: collision with root package name */
    public final Request f35709a;

    /* renamed from: b, reason: collision with root package name */
    public final C0217j f35710b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f35711c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35712d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f35713e;

    /* renamed from: f, reason: collision with root package name */
    public final String f35714f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f35715g;

    /* renamed from: h, reason: collision with root package name */
    public final long f35716h;

    /* renamed from: i, reason: collision with root package name */
    public final long f35717i;

    /* renamed from: j, reason: collision with root package name */
    public final String f35718j;
    public final int k;

    public C2701b(Request request, C0217j c0217j) {
        int i5;
        this.f35709a = request;
        this.f35710b = c0217j;
        this.k = -1;
        if (c0217j != null) {
            this.f35716h = c0217j.f166b;
            this.f35717i = c0217j.f167c;
            Headers headers = (Headers) c0217j.f171g;
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strC = headers.c(i10);
                if (r.c0(strC, "Date", true)) {
                    String strA = headers.a("Date");
                    this.f35711c = strA != null ? DatesKt.a(strA) : null;
                    this.f35712d = headers.f(i10);
                } else if (r.c0(strC, "Expires", true)) {
                    String strA2 = headers.a("Expires");
                    this.f35715g = strA2 != null ? DatesKt.a(strA2) : null;
                } else if (r.c0(strC, "Last-Modified", true)) {
                    String strA3 = headers.a("Last-Modified");
                    this.f35713e = strA3 != null ? DatesKt.a(strA3) : null;
                    this.f35714f = headers.f(i10);
                } else if (r.c0(strC, "ETag", true)) {
                    this.f35718j = headers.f(i10);
                } else if (r.c0(strC, "Age", true)) {
                    String strF = headers.f(i10);
                    Bitmap.Config config = e.f39264a;
                    Long lM0 = r.m0(strF);
                    if (lM0 != null) {
                        long jLongValue = lM0.longValue();
                        i5 = jLongValue > 2147483647L ? f.API_PRIORITY_OTHER : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i5 = -1;
                    }
                    this.k = i5;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ef.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g4.C2702c a() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.C2701b.a():g4.c");
    }
}
