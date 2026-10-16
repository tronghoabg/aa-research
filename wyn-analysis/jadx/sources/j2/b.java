package j2;

import N1.C0765n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f38580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38581b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38582c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38583d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38584e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38585f;

    /* renamed from: g, reason: collision with root package name */
    public final int f38586g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38587h;

    /* renamed from: i, reason: collision with root package name */
    public final String f38588i;

    /* renamed from: j, reason: collision with root package name */
    public final C0765n[] f38589j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final String f38590l;

    /* renamed from: m, reason: collision with root package name */
    public final String f38591m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f38592n;

    /* renamed from: o, reason: collision with root package name */
    public final long[] f38593o;

    /* renamed from: p, reason: collision with root package name */
    public final long f38594p;

    public b(String str, String str2, int i5, String str3, long j8, String str4, int i10, int i11, int i12, int i13, String str5, C0765n[] c0765nArr, ArrayList arrayList, long[] jArr, long j10) {
        this.f38590l = str;
        this.f38591m = str2;
        this.f38580a = i5;
        this.f38581b = str3;
        this.f38582c = j8;
        this.f38583d = str4;
        this.f38584e = i10;
        this.f38585f = i11;
        this.f38586g = i12;
        this.f38587h = i13;
        this.f38588i = str5;
        this.f38589j = c0765nArr;
        this.f38592n = arrayList;
        this.f38593o = jArr;
        this.f38594p = j10;
        this.k = arrayList.size();
    }

    public final b a(C0765n[] c0765nArr) {
        long[] jArr = this.f38593o;
        return new b(this.f38590l, this.f38591m, this.f38580a, this.f38581b, this.f38582c, this.f38583d, this.f38584e, this.f38585f, this.f38586g, this.f38587h, this.f38588i, c0765nArr, this.f38592n, jArr, this.f38594p);
    }

    public final long b(int i5) {
        if (i5 == this.k - 1) {
            return this.f38594p;
        }
        long[] jArr = this.f38593o;
        return jArr[i5 + 1] - jArr[i5];
    }
}
