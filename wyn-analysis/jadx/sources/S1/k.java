package S1;

import A7.AbstractC0279p0;
import N1.AbstractC0774x;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10869i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f10870a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10871b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10872c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f10873d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10874e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10875f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10876g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10877h;

    static {
        AbstractC0774x.a("media3.datasource");
    }

    public k(Uri uri, int i5, byte[] bArr, Map map, long j8, long j10, String str, int i10) {
        Q1.k.c(j8 >= 0);
        Q1.k.c(j8 >= 0);
        Q1.k.c(j10 > 0 || j10 == -1);
        uri.getClass();
        this.f10870a = uri;
        this.f10871b = i5;
        this.f10872c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f10873d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f10874e = j8;
        this.f10875f = j10;
        this.f10876g = str;
        this.f10877h = i10;
    }

    public final k a(long j8) {
        long j10 = this.f10875f;
        long j11 = j10 != -1 ? j10 - j8 : -1L;
        if (j8 == 0 && j10 == j11) {
            return this;
        }
        return new k(this.f10870a, this.f10871b, this.f10872c, this.f10873d, this.f10874e + j8, j11, this.f10876g, this.f10877h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i5 = this.f10871b;
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
        sb2.append(this.f10870a);
        sb2.append(", ");
        sb2.append(this.f10874e);
        sb2.append(", ");
        sb2.append(this.f10875f);
        sb2.append(", ");
        sb2.append(this.f10876g);
        sb2.append(", ");
        return AbstractC0279p0.j(this.f10877h, "]", sb2);
    }
}
