package o2;

import Q1.x;
import java.util.Arrays;
import t6.C4133a;
import u6.v;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41280a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41282c;

    /* renamed from: d, reason: collision with root package name */
    public int f41283d;

    /* renamed from: e, reason: collision with root package name */
    public int f41284e;

    /* renamed from: f, reason: collision with root package name */
    public int f41285f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f41286g;

    public e(int i5) {
        this.f41280a = i5;
        switch (i5) {
            case 1:
                this.f41281b = true;
                this.f41282c = 65536;
                this.f41285f = 0;
                this.f41286g = new C4133a[100];
                break;
            default:
                this.f41281b = true;
                this.f41282c = 65536;
                this.f41285f = 0;
                this.f41286g = new C3643a[100];
                break;
        }
    }

    private final synchronized void b(int i5) {
        boolean z2 = i5 < this.f41283d;
        this.f41283d = i5;
        if (z2) {
            d();
        }
    }

    private final synchronized void c(int i5) {
        boolean z2 = i5 < this.f41283d;
        this.f41283d = i5;
        if (z2) {
            d();
        }
    }

    private final synchronized void e() {
        int iMax = Math.max(0, x.f(this.f41283d, this.f41282c) - this.f41284e);
        int i5 = this.f41285f;
        if (iMax >= i5) {
            return;
        }
        Arrays.fill((C3643a[]) this.f41286g, iMax, i5, (Object) null);
        this.f41285f = iMax;
    }

    private final synchronized void f() {
        int iMax = Math.max(0, v.f(this.f41283d, this.f41282c) - this.f41284e);
        int i5 = this.f41285f;
        if (iMax >= i5) {
            return;
        }
        Arrays.fill((C4133a[]) this.f41286g, iMax, i5, (Object) null);
        this.f41285f = iMax;
    }

    public final synchronized void a(int i5) {
        switch (this.f41280a) {
            case 0:
                b(i5);
                break;
            default:
                c(i5);
                break;
        }
    }

    public final synchronized void d() {
        switch (this.f41280a) {
            case 0:
                e();
                break;
            default:
                f();
                break;
        }
    }
}
