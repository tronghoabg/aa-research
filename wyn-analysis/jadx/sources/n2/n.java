package n2;

import j$.util.Objects;
import l8.AbstractC3399A;
import l8.c0;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f40871e;

    /* renamed from: f, reason: collision with root package name */
    public final C3586i f40872f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f40873g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f40874h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f40875i;

    /* renamed from: j, reason: collision with root package name */
    public final int f40876j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f40877l;

    /* renamed from: m, reason: collision with root package name */
    public final int f40878m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f40879n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f40880o;

    /* renamed from: p, reason: collision with root package name */
    public final int f40881p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f40882q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f40883r;

    /* renamed from: s, reason: collision with root package name */
    public final int f40884s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(int r9, N1.O r10, int r11, n2.C3586i r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.n.<init>(int, N1.O, int, n2.i, int, int, boolean):void");
    }

    public static int c(n nVar, n nVar2) {
        AbstractC3399A abstractC3399AB = AbstractC3399A.f40038a.c(nVar.f40874h, nVar2.f40874h).a(nVar.f40878m, nVar2.f40878m).c(nVar.f40879n, nVar2.f40879n).c(nVar.f40875i, nVar2.f40875i).c(nVar.f40871e, nVar2.f40871e).c(nVar.f40873g, nVar2.f40873g).b(Integer.valueOf(nVar.f40877l), Integer.valueOf(nVar2.f40877l), c0.f40091c);
        boolean z2 = nVar2.f40882q;
        boolean z10 = nVar.f40882q;
        AbstractC3399A abstractC3399AC = abstractC3399AB.c(z10, z2);
        boolean z11 = nVar2.f40883r;
        boolean z12 = nVar.f40883r;
        AbstractC3399A abstractC3399AC2 = abstractC3399AC.c(z12, z11);
        if (z10 && z12) {
            abstractC3399AC2 = abstractC3399AC2.a(nVar.f40884s, nVar2.f40884s);
        }
        return abstractC3399AC2.e();
    }

    @Override // n2.m
    public final int a() {
        return this.f40881p;
    }

    @Override // n2.m
    public final boolean b(m mVar) {
        n nVar = (n) mVar;
        if (!this.f40880o && !Objects.equals(this.f40870d.f8232n, nVar.f40870d.f8232n)) {
            return false;
        }
        this.f40872f.getClass();
        return this.f40882q == nVar.f40882q && this.f40883r == nVar.f40883r;
    }
}
