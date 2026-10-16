package N2;

import Q1.o;
import S3.s;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8365a;

    /* renamed from: b, reason: collision with root package name */
    public long f8366b;

    /* renamed from: c, reason: collision with root package name */
    public long f8367c;

    /* renamed from: d, reason: collision with root package name */
    public long f8368d;

    /* renamed from: e, reason: collision with root package name */
    public int f8369e;

    /* renamed from: f, reason: collision with root package name */
    public int f8370f;

    /* renamed from: g, reason: collision with root package name */
    public long f8371g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8372h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8373i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8374j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f8375l;

    /* renamed from: m, reason: collision with root package name */
    public Object f8376m;

    /* renamed from: n, reason: collision with root package name */
    public Object f8377n;

    public i(int i5) {
        this.f8365a = i5;
        switch (i5) {
            case 1:
                this.f8374j = new e(2);
                this.f8377n = new s(21, (char) 0);
                break;
            default:
                this.f8374j = new e(0);
                this.f8377n = new S3.c(14, false);
                break;
        }
    }

    public void a(long j8) {
        switch (this.f8365a) {
            case 0:
                this.f8368d = j8;
                break;
            default:
                this.f8368d = j8;
                break;
        }
    }

    public abstract long b(o oVar);

    public abstract long c(Y4.b bVar);

    public abstract boolean d(o oVar, long j8, S3.c cVar);

    public abstract boolean e(Y4.b bVar, long j8, s sVar);

    public void f(boolean z2) {
        switch (this.f8365a) {
            case 0:
                if (z2) {
                    this.f8377n = new S3.c(14, false);
                    this.f8367c = 0L;
                    this.f8369e = 0;
                } else {
                    this.f8369e = 1;
                }
                this.f8366b = -1L;
                this.f8368d = 0L;
                break;
            default:
                if (z2) {
                    this.f8377n = new s(21, (char) 0);
                    this.f8367c = 0L;
                    this.f8369e = 0;
                } else {
                    this.f8369e = 1;
                }
                this.f8366b = -1L;
                this.f8368d = 0L;
                break;
        }
    }
}
