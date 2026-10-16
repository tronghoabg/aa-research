package b2;

import N1.C0761j;

/* loaded from: classes.dex */
public abstract class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f19178a;

    /* renamed from: b, reason: collision with root package name */
    public final f f19179b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19180c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19181d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19182e;

    /* renamed from: f, reason: collision with root package name */
    public final C0761j f19183f;

    /* renamed from: g, reason: collision with root package name */
    public final String f19184g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19185h;

    /* renamed from: i, reason: collision with root package name */
    public final long f19186i;

    /* renamed from: j, reason: collision with root package name */
    public final long f19187j;
    public final boolean k;

    public g(String str, f fVar, long j8, int i5, long j10, C0761j c0761j, String str2, String str3, long j11, long j12, boolean z2) {
        this.f19178a = str;
        this.f19179b = fVar;
        this.f19180c = j8;
        this.f19181d = i5;
        this.f19182e = j10;
        this.f19183f = c0761j;
        this.f19184g = str2;
        this.f19185h = str3;
        this.f19186i = j11;
        this.f19187j = j12;
        this.k = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long jLongValue = l10.longValue();
        long j8 = this.f19182e;
        if (j8 > jLongValue) {
            return 1;
        }
        return j8 < l10.longValue() ? -1 : 0;
    }
}
