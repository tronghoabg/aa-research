package com.waze.sound;

import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cc implements ca {

    /* renamed from: a, reason: collision with root package name */
    private static final List f39646a = h.a.i.i(new cb(1500, new gl()), new cb(1000, new gl()), new cb(DisplayStrings.DS_STREETSROAD_WITHOUT_A_NAME, new gl()), new cb(DisplayStrings.DS_NIGHT, gm.f40096a), new cb(200, gm.f40096a));

    private static final List b(com.waze.modules.c.cs csVar) {
        ck ckVar;
        com.waze.gas.a aVarB = csVar.b();
        if (aVarB instanceof com.waze.modules.c.ac) {
            return h.a.i.d(ck.K);
        }
        if (aVarB instanceof com.waze.modules.c.ad) {
            return h.a.i.d(ck.L);
        }
        if (aVarB instanceof com.waze.modules.c.p) {
            return h.a.i.d(ck.w);
        }
        if (aVarB instanceof com.waze.modules.c.q) {
            return h.a.i.d(ck.x);
        }
        if (aVarB instanceof com.waze.modules.c.m) {
            return h.a.i.d(ck.H);
        }
        if (aVarB instanceof com.waze.modules.c.ae) {
            return h.a.i.d(ck.X);
        }
        if (aVarB instanceof com.waze.modules.c.n) {
            return h.a.i.d(ck.U);
        }
        if (aVarB instanceof com.waze.modules.c.o) {
            return h.a.i.d(ck.V);
        }
        if (aVarB instanceof com.waze.modules.c.y) {
            return h.a.i.i(ck.D, ck.U);
        }
        if (aVarB instanceof com.waze.modules.c.u) {
            return h.a.i.i(ck.D, ck.K);
        }
        if (aVarB instanceof com.waze.modules.c.z) {
            return h.a.i.i(ck.D, ck.L);
        }
        if (aVarB instanceof com.waze.modules.c.v) {
            return h.a.i.i(ck.D, ck.V);
        }
        if ((aVarB instanceof com.waze.modules.c.aa) || (aVarB instanceof com.waze.modules.c.w)) {
            return h.a.i.i(ck.D, ck.H);
        }
        if ((aVarB instanceof com.waze.modules.c.ab) || (aVarB instanceof com.waze.modules.c.x)) {
            return h.a.i.i(ck.D, ck.X);
        }
        if (!(aVarB instanceof com.waze.modules.c.s)) {
            if ((aVarB instanceof com.waze.modules.c.k) || h.g.b.x.n(aVarB, com.waze.modules.c.l.f30184a)) {
                return h.a.i.d(ck.n);
            }
            return null;
        }
        switch (((com.waze.modules.c.s) aVarB).f()) {
            case 1:
                ckVar = ck.t;
                break;
            case 2:
                ckVar = ck.E;
                break;
            case 3:
                ckVar = ck.I;
                break;
            case 4:
                ckVar = ck.u;
                break;
            case 5:
                ckVar = ck.s;
                break;
            case 6:
                ckVar = ck.G;
                break;
            case 7:
                ckVar = ck.F;
                break;
            default:
                ckVar = null;
                break;
        }
        if (ckVar == null) {
            return null;
        }
        return h.a.i.i(ck.D, ckVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    @Override // com.waze.sound.ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map a(java.util.List r32, com.waze.sound.bk r33) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.cc.a(java.util.List, com.waze.sound.bk):java.util.Map");
    }
}
