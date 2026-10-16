package r6;

import l8.AbstractC3399A;
import l8.c0;
import u6.v;

/* loaded from: classes3.dex */
public final class k extends j {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f44441e;

    /* renamed from: f, reason: collision with root package name */
    public final f f44442f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f44443g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f44444h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44445i;

    /* renamed from: j, reason: collision with root package name */
    public final int f44446j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f44447l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f44448m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f44449n;

    /* renamed from: o, reason: collision with root package name */
    public final int f44450o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f44451p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f44452q;

    /* renamed from: r, reason: collision with root package name */
    public final int f44453r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(int r9, f6.Z r10, int r11, r6.f r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.k.<init>(int, f6.Z, int, r6.f, int, int, boolean):void");
    }

    public static int c(k kVar, k kVar2) {
        AbstractC3399A abstractC3399AB = AbstractC3399A.f40038a.c(kVar.f44444h, kVar2.f44444h).a(kVar.f44447l, kVar2.f44447l).c(kVar.f44448m, kVar2.f44448m).c(kVar.f44441e, kVar2.f44441e).c(kVar.f44443g, kVar2.f44443g).b(Integer.valueOf(kVar.k), Integer.valueOf(kVar2.k), c0.f40091c);
        boolean z2 = kVar2.f44451p;
        boolean z10 = kVar.f44451p;
        AbstractC3399A abstractC3399AC = abstractC3399AB.c(z10, z2);
        boolean z11 = kVar2.f44452q;
        boolean z12 = kVar.f44452q;
        AbstractC3399A abstractC3399AC2 = abstractC3399AC.c(z12, z11);
        if (z10 && z12) {
            abstractC3399AC2 = abstractC3399AC2.a(kVar.f44453r, kVar2.f44453r);
        }
        return abstractC3399AC2.e();
    }

    @Override // r6.j
    public final int a() {
        return this.f44450o;
    }

    @Override // r6.j
    public final boolean b(j jVar) {
        k kVar = (k) jVar;
        if (!this.f44449n && !v.a(this.f44440d.f3238l, kVar.f44440d.f3238l)) {
            return false;
        }
        if (this.f44442f.f44418D) {
            return true;
        }
        return this.f44451p == kVar.f44451p && this.f44452q == kVar.f44452q;
    }
}
