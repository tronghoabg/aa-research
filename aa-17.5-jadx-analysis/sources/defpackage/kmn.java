package defpackage;

import android.content.ComponentName;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final /* synthetic */ class kmn implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ kmn(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                yzz yzzVarB = yzz.b(((abrd) obj).b);
                if (yzzVarB == null) {
                    yzzVarB = yzz.UNKNOWN_CONTEXT;
                }
                return yzzVarB.name();
            case 1:
                abrh abrhVar = (abrh) obj;
                abrhVar.getClass();
                return "{" + juw.k(abrhVar) + "}";
            case 2:
                dec decVar = (dec) obj;
                decVar.getClass();
                daq.g(decVar, 0);
                return afak.a;
            case 3:
                return loy.j().f((ComponentName) obj);
            case 4:
                lol lolVar = (lol) obj;
                if (lolVar != null) {
                    return lolVar.d();
                }
                return null;
            case 5:
                return roc.ap((cie) obj);
            case 6:
                osx osxVar = (osx) obj;
                yph yphVar = kyw.a;
                return Boolean.valueOf(osxVar == osx.LIVE_ACTIVE);
            case 7:
                yph yphVar2 = kyw.a;
                return kwz.a;
            case 8:
                yph yphVar3 = laa.a;
                return roc.az((lol) obj);
            case 9:
                osb osbVar = (osb) obj;
                yph yphVar4 = laa.a;
                if (osbVar.equals(osb.a)) {
                    return osbVar;
                }
                abnp abnpVarK = osbVar.K();
                abpt abptVarB = abqu.b(Instant.now().toEpochMilli());
                abnpVarK.t();
                osb osbVar2 = (osb) abnpVarK.b;
                abptVarB.getClass();
                osbVar2.c = abptVarB;
                osbVar2.b |= 1;
                return (osb) abnpVarK.q();
            case 10:
                yzy yzyVar = (yzy) obj;
                ConcurrentHashMap concurrentHashMap = lbt.a;
                yzyVar.getClass();
                if (affa.f(yzyVar, yzy.FR) || affa.f(yzyVar, yzy.FS)) {
                    return lbt.f;
                }
                return null;
            case 11:
                ConcurrentHashMap concurrentHashMap2 = lbt.a;
                ((yzy) obj).getClass();
                return lbt.i;
            case 12:
                ConcurrentHashMap concurrentHashMap3 = lbt.a;
                ((yzy) obj).getClass();
                return lbt.i;
            case 13:
                yzy yzyVar2 = (yzy) obj;
                ConcurrentHashMap concurrentHashMap4 = lbt.a;
                yzyVar2.getClass();
                if (affa.f(yzyVar2, yzy.GF) || affa.f(yzyVar2, yzy.GG)) {
                    return null;
                }
                lbt lbtVar = lbt.m;
                ynp ynpVarListIterator = lbtVar.t.b.listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    lcc lccVar = (lcc) ynpVarListIterator.next();
                    if (affa.f(lccVar.a, yzyVar2)) {
                        int i = lccVar.c;
                        lbt lbtVar2 = lbt.q;
                        lnm.R(lbtVar2, lbtVar.c(), yfq.q(Integer.valueOf(i)));
                        return lbtVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 14:
                yzy yzyVar3 = (yzy) obj;
                ConcurrentHashMap concurrentHashMap5 = lbt.a;
                yzyVar3.getClass();
                if (affa.f(yzyVar3, yzy.GF) || affa.f(yzyVar3, yzy.GG)) {
                    return null;
                }
                lbt lbtVar3 = lbt.n;
                ynp ynpVarListIterator2 = lbtVar3.t.b.listIterator(0);
                while (ynpVarListIterator2.hasNext()) {
                    lcc lccVar2 = (lcc) ynpVarListIterator2.next();
                    if (affa.f(lccVar2.a, yzyVar3)) {
                        int i2 = lccVar2.c;
                        lbt lbtVar4 = lbt.q;
                        lnm.R(lbtVar4, lbtVar3.c(), yfq.q(Integer.valueOf(i2)));
                        return lbtVar4;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 15:
                yzy yzyVar4 = (yzy) obj;
                ConcurrentHashMap concurrentHashMap6 = lbt.a;
                yzyVar4.getClass();
                if (affa.f(yzyVar4, yzy.GF) || affa.f(yzyVar4, yzy.GG)) {
                    return null;
                }
                lbt lbtVar5 = lbt.o;
                ynp ynpVarListIterator3 = lbtVar5.t.b.listIterator(0);
                while (ynpVarListIterator3.hasNext()) {
                    lcc lccVar3 = (lcc) ynpVarListIterator3.next();
                    if (affa.f(lccVar3.a, yzyVar4)) {
                        int i3 = lccVar3.c;
                        lbt lbtVar6 = lbt.q;
                        lnm.R(lbtVar6, lbtVar5.c(), yfq.q(Integer.valueOf(i3)));
                        return lbtVar6;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 16:
                yzy yzyVar5 = (yzy) obj;
                ConcurrentHashMap concurrentHashMap7 = lbt.a;
                yzyVar5.getClass();
                if (affa.f(yzyVar5, yzy.GF) || affa.f(yzyVar5, yzy.GG)) {
                    return null;
                }
                lbt lbtVar7 = lbt.p;
                ynp ynpVarListIterator4 = lbtVar7.t.b.listIterator(0);
                while (ynpVarListIterator4.hasNext()) {
                    lcc lccVar4 = (lcc) ynpVarListIterator4.next();
                    if (affa.f(lccVar4.a, yzyVar5)) {
                        int i4 = lccVar4.c;
                        lbt lbtVar8 = lbt.q;
                        lnm.R(lbtVar8, lbtVar7.c(), yfq.q(Integer.valueOf(i4)));
                        return lbtVar8;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 17:
                ConcurrentHashMap concurrentHashMap8 = lbt.a;
                ((yzy) obj).getClass();
                lbt lbtVar9 = lbt.r;
                lbt lbtVar10 = lbt.q;
                yzz yzzVarC = lbtVar10.c();
                yfq yfqVar = (yfq) lbt.b.get(lbtVar10);
                if (yfqVar == null) {
                    int i5 = yfq.d;
                    yfqVar = yls.a;
                    yfqVar.getClass();
                }
                lnm.R(lbtVar9, yzzVarC, yfqVar);
                return lbtVar9;
            case 18:
                ConcurrentHashMap concurrentHashMap9 = lbt.a;
                ((yzy) obj).getClass();
                return null;
            case 19:
                lcp lcpVar = lcq.a;
                kzd.j().a((lbt) obj);
                return afak.a;
            default:
                lcw lcwVar = lcy.a;
                ((eeq) obj).getClass();
                return abqw.a;
        }
    }
}
