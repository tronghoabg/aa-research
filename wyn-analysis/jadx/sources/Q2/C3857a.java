package q2;

import java.util.Arrays;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3857a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43973a;

    /* renamed from: b, reason: collision with root package name */
    public long f43974b;

    /* renamed from: c, reason: collision with root package name */
    public long f43975c;

    /* renamed from: d, reason: collision with root package name */
    public long f43976d;

    /* renamed from: e, reason: collision with root package name */
    public long f43977e;

    /* renamed from: f, reason: collision with root package name */
    public long f43978f;

    /* renamed from: g, reason: collision with root package name */
    public long f43979g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f43980h;

    /* renamed from: i, reason: collision with root package name */
    public int f43981i;

    public C3857a(int i5) {
        this.f43973a = i5;
        switch (i5) {
            case 1:
                this.f43980h = new boolean[15];
                break;
            default:
                this.f43980h = new boolean[15];
                break;
        }
    }

    public final boolean a() {
        switch (this.f43973a) {
            case 0:
                if (this.f43977e <= 15 || this.f43981i != 0) {
                }
                break;
            default:
                if (this.f43977e <= 15 || this.f43981i != 0) {
                }
                break;
        }
        return false;
    }

    public final void b(long j8) {
        switch (this.f43973a) {
            case 0:
                long j10 = this.f43977e;
                if (j10 == 0) {
                    this.f43974b = j8;
                } else if (j10 == 1) {
                    long j11 = j8 - this.f43974b;
                    this.f43975c = j11;
                    this.f43979g = j11;
                    this.f43978f = 1L;
                } else {
                    long j12 = j8 - this.f43976d;
                    int i5 = (int) (j10 % 15);
                    long jAbs = Math.abs(j12 - this.f43975c);
                    boolean[] zArr = this.f43980h;
                    if (jAbs <= 1000000) {
                        this.f43978f++;
                        this.f43979g += j12;
                        if (zArr[i5]) {
                            zArr[i5] = false;
                            this.f43981i--;
                        }
                    } else if (!zArr[i5]) {
                        zArr[i5] = true;
                        this.f43981i++;
                    }
                }
                this.f43977e++;
                this.f43976d = j8;
                break;
            default:
                long j13 = this.f43977e;
                if (j13 == 0) {
                    this.f43974b = j8;
                } else if (j13 == 1) {
                    long j14 = j8 - this.f43974b;
                    this.f43975c = j14;
                    this.f43979g = j14;
                    this.f43978f = 1L;
                } else {
                    long j15 = j8 - this.f43976d;
                    int i10 = (int) (j13 % 15);
                    long jAbs2 = Math.abs(j15 - this.f43975c);
                    boolean[] zArr2 = this.f43980h;
                    if (jAbs2 <= 1000000) {
                        this.f43978f++;
                        this.f43979g += j15;
                        if (zArr2[i10]) {
                            zArr2[i10] = false;
                            this.f43981i--;
                        }
                    } else if (!zArr2[i10]) {
                        zArr2[i10] = true;
                        this.f43981i++;
                    }
                }
                this.f43977e++;
                this.f43976d = j8;
                break;
        }
    }

    public final void c() {
        switch (this.f43973a) {
            case 0:
                this.f43977e = 0L;
                this.f43978f = 0L;
                this.f43979g = 0L;
                this.f43981i = 0;
                Arrays.fill(this.f43980h, false);
                break;
            default:
                this.f43977e = 0L;
                this.f43978f = 0L;
                this.f43979g = 0L;
                this.f43981i = 0;
                Arrays.fill(this.f43980h, false);
                break;
        }
    }
}
