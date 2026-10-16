package S3;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: u, reason: collision with root package name */
    public static final String f10976u;

    /* renamed from: a, reason: collision with root package name */
    public final String f10977a;

    /* renamed from: b, reason: collision with root package name */
    public int f10978b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10979c;

    /* renamed from: d, reason: collision with root package name */
    public String f10980d;

    /* renamed from: e, reason: collision with root package name */
    public J3.h f10981e;

    /* renamed from: f, reason: collision with root package name */
    public final J3.h f10982f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10983g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10984h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10985i;

    /* renamed from: j, reason: collision with root package name */
    public J3.d f10986j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public int f10987l;

    /* renamed from: m, reason: collision with root package name */
    public long f10988m;

    /* renamed from: n, reason: collision with root package name */
    public long f10989n;

    /* renamed from: o, reason: collision with root package name */
    public final long f10990o;

    /* renamed from: p, reason: collision with root package name */
    public final long f10991p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10992q;

    /* renamed from: r, reason: collision with root package name */
    public final int f10993r;

    /* renamed from: s, reason: collision with root package name */
    public final int f10994s;

    /* renamed from: t, reason: collision with root package name */
    public final int f10995t;

    static {
        String strF = J3.r.f("WorkSpec");
        AbstractC3340k.d(strF, "tagWithPrefix(\"WorkSpec\")");
        f10976u = strF;
    }

    public p(String id2, int i5, String workerClassName, String str, J3.h input, J3.h output, long j8, long j10, long j11, J3.d constraints, int i10, int i11, long j12, long j13, long j14, long j15, boolean z2, int i12, int i13, int i14) {
        AbstractC3340k.e(id2, "id");
        AbstractC3256n.m(i5, "state");
        AbstractC3340k.e(workerClassName, "workerClassName");
        AbstractC3340k.e(input, "input");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(constraints, "constraints");
        AbstractC3256n.m(i11, "backoffPolicy");
        AbstractC3256n.m(i12, "outOfQuotaPolicy");
        this.f10977a = id2;
        this.f10978b = i5;
        this.f10979c = workerClassName;
        this.f10980d = str;
        this.f10981e = input;
        this.f10982f = output;
        this.f10983g = j8;
        this.f10984h = j10;
        this.f10985i = j11;
        this.f10986j = constraints;
        this.k = i10;
        this.f10987l = i11;
        this.f10988m = j12;
        this.f10989n = j13;
        this.f10990o = j14;
        this.f10991p = j15;
        this.f10992q = z2;
        this.f10993r = i12;
        this.f10994s = i13;
        this.f10995t = i14;
    }

    public final long a() {
        int i5;
        if (this.f10978b == 1 && (i5 = this.k) > 0) {
            long jScalb = this.f10987l == 2 ? this.f10988m * i5 : (long) Math.scalb(this.f10988m, i5 - 1);
            long j8 = this.f10989n;
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j8 + jScalb;
        }
        boolean zC = c();
        long j10 = this.f10983g;
        if (!zC) {
            long jCurrentTimeMillis = this.f10989n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + j10;
        }
        int i10 = this.f10994s;
        long j11 = this.f10989n;
        if (i10 == 0) {
            j11 += j10;
        }
        long j12 = this.f10985i;
        long j13 = this.f10984h;
        if (j12 != j13) {
            return j11 + j13 + (i10 == 0 ? (-1) * j12 : 0L);
        }
        return j11 + (i10 != 0 ? j13 : 0L);
    }

    public final boolean b() {
        return !AbstractC3340k.a(J3.d.f5554i, this.f10986j);
    }

    public final boolean c() {
        return this.f10984h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC3340k.a(this.f10977a, pVar.f10977a) && this.f10978b == pVar.f10978b && AbstractC3340k.a(this.f10979c, pVar.f10979c) && AbstractC3340k.a(this.f10980d, pVar.f10980d) && AbstractC3340k.a(this.f10981e, pVar.f10981e) && AbstractC3340k.a(this.f10982f, pVar.f10982f) && this.f10983g == pVar.f10983g && this.f10984h == pVar.f10984h && this.f10985i == pVar.f10985i && AbstractC3340k.a(this.f10986j, pVar.f10986j) && this.k == pVar.k && this.f10987l == pVar.f10987l && this.f10988m == pVar.f10988m && this.f10989n == pVar.f10989n && this.f10990o == pVar.f10990o && this.f10991p == pVar.f10991p && this.f10992q == pVar.f10992q && this.f10993r == pVar.f10993r && this.f10994s == pVar.f10994s && this.f10995t == pVar.f10995t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iC = N0.a.c(AbstractC0213f.d(this.f10978b, this.f10977a.hashCode() * 31, 31), 31, this.f10979c);
        String str = this.f10980d;
        int iHashCode = (this.f10982f.hashCode() + ((this.f10981e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        long j8 = this.f10983g;
        int i5 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f10984h;
        int i10 = (i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f10985i;
        int iD = AbstractC0213f.d(this.f10987l, (((this.f10986j.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.k) * 31, 31);
        long j12 = this.f10988m;
        int i11 = (iD + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f10989n;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f10990o;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f10991p;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        boolean z2 = this.f10992q;
        int i15 = z2;
        if (z2 != 0) {
            i15 = 1;
        }
        return ((AbstractC0213f.d(this.f10993r, (i14 + i15) * 31, 31) + this.f10994s) * 31) + this.f10995t;
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("{WorkSpec: "), this.f10977a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p(String str, int i5, String str2, String str3, J3.h hVar, J3.h hVar2, long j8, long j10, long j11, J3.d dVar, int i10, int i11, long j12, long j13, long j14, long j15, boolean z2, int i12, int i13, int i14, int i15) {
        J3.h hVar3;
        J3.h hVar4;
        int i16 = (i14 & 2) != 0 ? 1 : i5;
        String str4 = (i14 & 8) != 0 ? null : str3;
        if ((i14 & 16) != 0) {
            J3.h EMPTY = J3.h.f5571c;
            AbstractC3340k.d(EMPTY, "EMPTY");
            hVar3 = EMPTY;
        } else {
            hVar3 = hVar;
        }
        if ((i14 & 32) != 0) {
            J3.h EMPTY2 = J3.h.f5571c;
            AbstractC3340k.d(EMPTY2, "EMPTY");
            hVar4 = EMPTY2;
        } else {
            hVar4 = hVar2;
        }
        this(str, i16, str2, str4, hVar3, hVar4, (i14 & 64) != 0 ? 0L : j8, (i14 & 128) != 0 ? 0L : j10, (i14 & 256) != 0 ? 0L : j11, (i14 & 512) != 0 ? J3.d.f5554i : dVar, (i14 & Segment.SHARE_MINIMUM) != 0 ? 0 : i10, (i14 & 2048) != 0 ? 1 : i11, (i14 & 4096) != 0 ? 30000L : j12, (i14 & Segment.SIZE) != 0 ? 0L : j13, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0L : j14, (32768 & i14) != 0 ? -1L : j15, (65536 & i14) != 0 ? false : z2, (131072 & i14) != 0 ? 1 : i12, (i14 & 262144) != 0 ? 0 : i13, 0);
    }
}
