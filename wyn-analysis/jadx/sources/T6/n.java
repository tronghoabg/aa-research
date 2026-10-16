package t6;

import A7.AbstractC0279p0;
import E5.P;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f45878h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f45879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45880b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f45881c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f45882d;

    /* renamed from: e, reason: collision with root package name */
    public final long f45883e;

    /* renamed from: f, reason: collision with root package name */
    public final long f45884f;

    /* renamed from: g, reason: collision with root package name */
    public final int f45885g;

    static {
        P.a("goog.exo.datasource");
    }

    public n(Uri uri, int i5, byte[] bArr, Map map, long j8, long j10, int i10) {
        AbstractC4256a.e(j8 >= 0);
        AbstractC4256a.e(j8 >= 0);
        AbstractC4256a.e(j10 > 0 || j10 == -1);
        this.f45879a = uri;
        this.f45880b = i5;
        this.f45881c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f45882d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f45883e = j8;
        this.f45884f = j10;
        this.f45885g = i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i5 = this.f45880b;
        if (i5 == 1) {
            str = "GET";
        } else if (i5 == 2) {
            str = "POST";
        } else {
            if (i5 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(StringUtils.SPACE);
        sb2.append(this.f45879a);
        sb2.append(", ");
        sb2.append(this.f45883e);
        sb2.append(", ");
        sb2.append(this.f45884f);
        sb2.append(", null, ");
        return AbstractC0279p0.j(this.f45885g, "]", sb2);
    }
}
