package com.applovin.impl;

import G5.C0535p;
import J9.C0664x;
import U1.C0850u;
import com.bytedance.sdk.component.bcc.uef.ivm;

/* loaded from: classes.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f20857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20859d;

    public /* synthetic */ W(Object obj, Object obj2, long j8, int i5) {
        this.f20856a = i5;
        this.f20858c = obj;
        this.f20859d = obj2;
        this.f20857b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j8 = this.f20857b;
        Object obj = this.f20859d;
        int i5 = 26;
        Object obj2 = this.f20858c;
        switch (this.f20856a) {
            case 0:
                ((j5) obj2).a((Thread) obj, j8);
                break;
            case 1:
                ((ivm) obj2).oa((Runnable) obj, j8);
                break;
            case 2:
                X2.j jVar = (X2.j) obj2;
                jVar.getClass();
                int i10 = Q1.x.f9724a;
                C0850u c0850u = ((U1.r) jVar.f16076c).f12116a;
                V1.d dVar = c0850u.f12167r;
                V1.a aVarK = dVar.K();
                long j10 = this.f20857b;
                Object obj3 = this.f20859d;
                dVar.L(aVarK, 26, new F5.c(aVarK, obj3, j10, 2));
                if (c0850u.f12133N == obj3) {
                    c0850u.f12161l.e(26, new C0664x(i5));
                    break;
                }
                break;
            default:
                C0535p c0535p = (C0535p) obj2;
                c0535p.getClass();
                int i11 = u6.v.f46721a;
                E5.I i12 = c0535p.f4434c.f3030a;
                F5.f fVar = i12.f3098r;
                F5.a aVarN = fVar.N();
                long j11 = this.f20857b;
                Object obj4 = this.f20859d;
                fVar.O(aVarN, 26, new F5.c(aVarN, obj4, j11, 0));
                if (i12.f3062R == obj4) {
                    i12.f3091l.p(26, new A5.f(6));
                    break;
                }
                break;
        }
    }
}
