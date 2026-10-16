package U5;

import J5.h;
import Q1.k;
import Q1.o;
import s2.j;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f12344a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12345b;

    public /* synthetic */ f(long j8, int i5, boolean z2) {
        this.f12344a = i5;
        this.f12345b = j8;
    }

    public static f b(h hVar, Y4.b bVar) {
        hVar.c(bVar.f16679a, 0, 8, false);
        bVar.A(0);
        return new f(bVar.h(), bVar.d(), false);
    }

    public static f c(j jVar, o oVar) {
        jVar.c(oVar.f9702a, 0, 8, false);
        oVar.G(0);
        return new f(oVar.l(), oVar.h(), false);
    }

    public boolean a() {
        int i5 = this.f12344a;
        return i5 == 0 || i5 == 1;
    }

    public f(int i5, long j8) {
        k.c(j8 >= 0);
        this.f12344a = i5;
        this.f12345b = j8;
    }
}
