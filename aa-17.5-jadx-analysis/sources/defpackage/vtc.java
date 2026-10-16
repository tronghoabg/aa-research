package defpackage;

import android.os.StrictMode;
import java.lang.Thread;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
final class vtc implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ vtd a;
    private final Thread.UncaughtExceptionHandler b;

    public vtc(vtd vtdVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = vtdVar;
        this.b = uncaughtExceptionHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [aezk, java.lang.Object] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        oct octVarB;
        vty vtyVarB;
        oct octVarB2;
        int i;
        abnp abnpVarN;
        int i2;
        List list;
        Iterator it;
        zbz zbzVar;
        zbz zbzVar2;
        vtj vtjVar;
        Throwable th2;
        zby zbyVar;
        int i3;
        int i4;
        try {
            try {
                vtd vtdVar = this.a;
                String name = thread.getName();
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                vsy vsyVar = vtdVar.g;
                vky vkyVar = vtdVar.a;
                abnp abnpVarN2 = ajgh.a.n();
                abnpVarN2.t();
                ajgh ajghVar = (ajgh) abnpVarN2.b;
                ajghVar.b |= 1;
                ajghVar.c = true;
                String strE = vky.e(vkyVar);
                if (strE != null) {
                    abnpVarN2.t();
                    ajgh ajghVar2 = (ajgh) abnpVarN2.b;
                    ajghVar2.b |= 4;
                    ajghVar2.e = strE;
                }
                try {
                    abnp abnpVarN3 = ajfx.a.n();
                    ajfw ajfwVarA = vsyVar.b.A();
                    abnpVarN3.t();
                    ajfx ajfxVar = (ajfx) abnpVarN3.b;
                    ajfwVarA.getClass();
                    ajfxVar.c = ajfwVarA;
                    ajfxVar.b |= 1;
                    abnpVarN2.t();
                    ajgh ajghVar3 = (ajgh) abnpVarN2.b;
                    ajfx ajfxVar2 = (ajfx) abnpVarN3.q();
                    ajfxVar2.getClass();
                    ajghVar3.d = ajfxVar2;
                    ajghVar3.b |= 2;
                } catch (RuntimeException e) {
                    ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai((char) 9810)).u("Failed to get process stats.");
                }
                String name2 = th.getClass().getName();
                for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                    name2 = cause.getClass().getName();
                }
                abnp abnpVarN4 = zcb.a.n();
                zby zbyVar2 = zby.a;
                abnp abnpVarN5 = zbyVar2.n();
                abnpVarN5.t();
                zby zbyVar3 = (zby) abnpVarN5.b;
                zbyVar3.b |= 1;
                zbyVar3.c = "";
                abnpVarN4.t();
                zcb zcbVar = (zcb) abnpVarN4.b;
                zby zbyVar4 = (zby) abnpVarN5.q();
                zbyVar4.getClass();
                zcbVar.e = zbyVar4;
                zcbVar.b |= 1;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                ArrayList arrayList = new ArrayList();
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(th);
                int i5 = 0;
                identityHashMap.put(th, 0);
                arrayList.add(zeb.u(th, true));
                while (!arrayDeque.isEmpty()) {
                    Throwable th3 = (Throwable) arrayDeque.remove();
                    Integer num = (Integer) identityHashMap.get(th3);
                    num.getClass();
                    int iIntValue = num.intValue();
                    if (th3.getCause() != null) {
                        Throwable cause2 = th3.getCause();
                        if (identityHashMap.containsKey(cause2)) {
                            th2 = th3;
                            zbyVar = zbyVar2;
                        } else {
                            th2 = th3;
                            identityHashMap.put(cause2, Integer.valueOf(identityHashMap.size()));
                            zbyVar = zbyVar2;
                            arrayList.add(zeb.u(cause2, true));
                            arrayDeque.add(cause2);
                        }
                        abnp abnpVar = (abnp) arrayList.get(iIntValue);
                        int iIntValue2 = ((Integer) identityHashMap.get(cause2)).intValue();
                        abnpVar.t();
                        zca zcaVar = (zca) abnpVar.b;
                        zca zcaVar2 = zca.a;
                        zcaVar.b |= 2;
                        zcaVar.d = iIntValue2;
                    } else {
                        th2 = th3;
                        zbyVar = zbyVar2;
                    }
                    Throwable[] suppressed = th2.getSuppressed();
                    int length = suppressed.length;
                    int i6 = 0;
                    while (i6 < length) {
                        Throwable[] thArr = suppressed;
                        Throwable th4 = thArr[i6];
                        if (identityHashMap.containsKey(th4)) {
                            i3 = length;
                            i4 = i6;
                        } else {
                            i3 = length;
                            identityHashMap.put(th4, Integer.valueOf(identityHashMap.size()));
                            i4 = i6;
                            arrayList.add(zeb.u(th4, true));
                            arrayDeque.add(th4);
                        }
                        abnp abnpVar2 = (abnp) arrayList.get(iIntValue);
                        int iIntValue3 = ((Integer) identityHashMap.get(th4)).intValue();
                        abnpVar2.t();
                        zca zcaVar3 = (zca) abnpVar2.b;
                        zca zcaVar4 = zca.a;
                        abod abodVar = zcaVar3.e;
                        if (!abodVar.c()) {
                            zcaVar3.e = abnv.G(abodVar);
                        }
                        zcaVar3.e.g(iIntValue3);
                        i6 = i4 + 1;
                        suppressed = thArr;
                        length = i3;
                    }
                    zbyVar2 = zbyVar;
                }
                zby zbyVar5 = zbyVar2;
                zbz zbzVar3 = zbz.a;
                abnp abnpVarN6 = zbzVar3.n();
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    abnp abnpVar3 = (abnp) arrayList.get(i7);
                    abnpVarN6.t();
                    zbz zbzVar4 = (zbz) abnpVarN6.b;
                    zca zcaVar5 = (zca) abnpVar3.q();
                    zcaVar5.getClass();
                    zbzVar4.b();
                    zbzVar4.b.add(zcaVar5);
                }
                abnpVarN4.t();
                zcb zcbVar2 = (zcb) abnpVarN4.b;
                zbz zbzVar5 = (zbz) abnpVarN6.q();
                zbzVar5.getClass();
                zcbVar2.d = zbzVar5;
                zcbVar2.c = 4;
                Iterator it2 = ((Set) vsyVar.a.a()).iterator();
                while (it2.hasNext()) {
                    vtj vtjVar2 = (vtj) it2.next();
                    zby zbyVar6 = ((zcb) abnpVarN4.b).e;
                    if (zbyVar6 == null) {
                        zbyVar6 = zbyVar5;
                    }
                    if ((zbyVar6.b & 2) != 0) {
                        String str = zbyVar6.d;
                        String strB = vtjVar2.b();
                        if (!str.equals(strB)) {
                            abnp abnpVarK = zbyVar6.K();
                            abnpVarK.t();
                            zby zbyVar7 = (zby) abnpVarK.b;
                            strB.getClass();
                            zbyVar7.b |= 2;
                            zbyVar7.d = strB;
                            zby zbyVar8 = (zby) abnpVarK.q();
                            abnpVarN4.t();
                            zcb zcbVar3 = (zcb) abnpVarN4.b;
                            zbyVar8.getClass();
                            zcbVar3.e = zbyVar8;
                            zcbVar3.b |= 1;
                        }
                    }
                    zcb zcbVar4 = (zcb) abnpVarN4.b;
                    int i8 = zcbVar4.c;
                    if (i8 == 4) {
                        zbz zbzVar6 = i8 == 4 ? (zbz) zcbVar4.d : zbzVar3;
                        int i9 = 0;
                        abnp abnpVarK2 = null;
                        while (i9 < zbzVar6.b.size()) {
                            zca zcaVar6 = (zca) zbzVar6.b.get(i9);
                            zby zbyVar9 = zcaVar6.c;
                            if (zbyVar9 == null) {
                                zbyVar9 = zbyVar5;
                            }
                            Iterator it3 = it2;
                            if ((zbyVar9.b & 2) != 0) {
                                String str2 = zbyVar9.d;
                                zbzVar2 = zbzVar3;
                                String strB2 = vtjVar2.b();
                                if (!str2.equals(strB2)) {
                                    if (abnpVarK2 == null) {
                                        abnpVarK2 = zbzVar6.K();
                                    }
                                    abnp abnpVarK3 = zcaVar6.K();
                                    abnp abnpVarK4 = zbyVar9.K();
                                    abnpVarK4.t();
                                    zby zbyVar10 = (zby) abnpVarK4.b;
                                    strB2.getClass();
                                    vtjVar = vtjVar2;
                                    zbyVar10.b |= 2;
                                    zbyVar10.d = strB2;
                                    zby zbyVar11 = (zby) abnpVarK4.q();
                                    abnpVarK3.t();
                                    zca zcaVar7 = (zca) abnpVarK3.b;
                                    zbyVar11.getClass();
                                    zcaVar7.c = zbyVar11;
                                    zcaVar7.b |= 1;
                                    zca zcaVar8 = (zca) abnpVarK3.q();
                                    abnpVarK2.t();
                                    zbz zbzVar7 = (zbz) abnpVarK2.b;
                                    zcaVar8.getClass();
                                    zbzVar7.b();
                                    zbzVar7.b.set(i9, zcaVar8);
                                }
                                i9++;
                                it2 = it3;
                                zbzVar3 = zbzVar2;
                                vtjVar2 = vtjVar;
                            } else {
                                zbzVar2 = zbzVar3;
                            }
                            vtjVar = vtjVar2;
                            i9++;
                            it2 = it3;
                            zbzVar3 = zbzVar2;
                            vtjVar2 = vtjVar;
                        }
                        it = it2;
                        zbzVar = zbzVar3;
                        if (abnpVarK2 != null) {
                            zbz zbzVar8 = (zbz) abnpVarK2.q();
                            abnpVarN4.t();
                            zcb zcbVar5 = (zcb) abnpVarN4.b;
                            zbzVar8.getClass();
                            zcbVar5.d = zbzVar8;
                            zcbVar5.c = 4;
                        }
                    } else {
                        it = it2;
                        zbzVar = zbzVar3;
                        for (int i10 = 0; i10 < ((zcb) abnpVarN4.b).f.size(); i10++) {
                            zby zbyVar12 = (zby) ((zcb) abnpVarN4.b).f.get(i10);
                            if ((zbyVar12.b & 2) != 0) {
                                String str3 = zbyVar12.d;
                                String strB3 = vtjVar2.b();
                                if (!str3.equals(strB3)) {
                                    abnp abnpVarK5 = zbyVar12.K();
                                    abnpVarK5.t();
                                    zby zbyVar13 = (zby) abnpVarK5.b;
                                    strB3.getClass();
                                    zbyVar13.b |= 2;
                                    zbyVar13.d = strB3;
                                    zby zbyVar14 = (zby) abnpVarK5.q();
                                    abnpVarN4.t();
                                    zcb zcbVar6 = (zcb) abnpVarN4.b;
                                    zbyVar14.getClass();
                                    zcbVar6.b();
                                    zcbVar6.f.set(i10, zbyVar14);
                                }
                            }
                        }
                    }
                    it2 = it;
                    zbzVar3 = zbzVar;
                }
                abnpVarN2.t();
                ajgh ajghVar4 = (ajgh) abnpVarN2.b;
                name.getClass();
                ajghVar4.b |= 8;
                ajghVar4.f = name;
                Class<?> cls = th.getClass();
                int i11 = cls == OutOfMemoryError.class ? 3 : NullPointerException.class.isAssignableFrom(cls) ? 2 : RuntimeException.class.isAssignableFrom(cls) ? 4 : Error.class.isAssignableFrom(cls) ? 5 : 1;
                abnpVarN2.t();
                ajgh ajghVar5 = (ajgh) abnpVarN2.b;
                ajghVar5.g = i11 - 1;
                ajghVar5.b |= 16;
                abnpVarN2.t();
                ajgh ajghVar6 = (ajgh) abnpVarN2.b;
                name2.getClass();
                ajghVar6.b |= 128;
                ajghVar6.h = name2;
                zcb zcbVar7 = (zcb) abnpVarN4.q();
                abnpVarN2.t();
                ajgh ajghVar7 = (ajgh) abnpVarN2.b;
                zcbVar7.getClass();
                ajghVar7.i = zcbVar7;
                ajghVar7.b |= 256;
                int i12 = xto.a;
                vtg vtgVar = (vtg) vtdVar.d.a();
                if (vtgVar.b && (octVarB2 = xto.b(th)) != null) {
                    yfq yfqVar = ((xun) octVarB2.a).a;
                    int i13 = vtgVar.c;
                    int i14 = vtgVar.d;
                    int i15 = vtgVar.e;
                    List listU = yrm.U(yfqVar);
                    ArrayList arrayListS = yrm.S(Math.min(((yls) yfqVar).c, i14));
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i16 = 0;
                    int length2 = 0;
                    while (i16 < listU.size()) {
                        int i17 = i16 + 1;
                        if (i17 > i14) {
                            abnpVarN = ajgf.a.n();
                            int size2 = listU.size() - i16;
                            abnpVarN.t();
                            ajgf ajgfVar = (ajgf) abnpVarN.b;
                            ajgfVar.b |= 1;
                            ajgfVar.c = size2;
                        } else {
                            String str4 = (String) listU.get(i16);
                            int i18 = i14;
                            if (Math.min(str4.length(), i13) + length2 > i15) {
                                abnpVarN = ajgf.a.n();
                                int size3 = listU.size() - i16;
                                abnpVarN.t();
                                ajgf ajgfVar2 = (ajgf) abnpVarN.b;
                                ajgfVar2.b |= 2;
                                ajgfVar2.d = size3;
                            } else {
                                if (str4.length() > i13) {
                                    i2 = i5;
                                    list = listU;
                                    arrayListS.add(str4.substring(i2, i13));
                                    arrayList2.add(Integer.valueOf(i16));
                                    arrayList3.add(Integer.valueOf(str4.length() - i13));
                                    length2 += i13;
                                } else {
                                    i2 = i5;
                                    list = listU;
                                    arrayListS.add(str4);
                                    length2 += str4.length();
                                }
                                i16 = i17;
                                listU = list;
                                i5 = i2;
                                i14 = i18;
                            }
                        }
                        i = i5;
                    }
                    i = i5;
                    abnpVarN = null;
                    if (!arrayList2.isEmpty()) {
                        if (abnpVarN == null) {
                            abnpVarN = ajgf.a.n();
                        }
                        int size4 = arrayList2.size();
                        for (int i19 = i; i19 < size4; i19++) {
                            int size5 = (arrayListS.size() - ((Integer) arrayList2.get(i19)).intValue()) - 1;
                            abnpVarN.t();
                            ajgf ajgfVar3 = (ajgf) abnpVarN.b;
                            ajgf ajgfVar4 = ajgf.a;
                            abod abodVar2 = ajgfVar3.e;
                            if (!abodVar2.c()) {
                                ajgfVar3.e = abnv.G(abodVar2);
                            }
                            ajgfVar3.e.g(size5);
                        }
                        abnpVarN.t();
                        ajgf ajgfVar5 = (ajgf) abnpVarN.b;
                        ajgf ajgfVar6 = ajgf.a;
                        abod abodVar3 = ajgfVar5.f;
                        if (!abodVar3.c()) {
                            ajgfVar5.f = abnv.G(abodVar3);
                        }
                        abmc.i(arrayList3, ajgfVar5.f);
                    }
                    abnp abnpVarN7 = ajgg.a.n();
                    List listU2 = yrm.U(arrayListS);
                    abnpVarN7.t();
                    ajgg ajggVar = (ajgg) abnpVarN7.b;
                    aboh abohVar = ajggVar.c;
                    if (!abohVar.c()) {
                        ajggVar.c = abnv.I(abohVar);
                    }
                    abmc.i(listU2, ajggVar.c);
                    if (abnpVarN != null) {
                        ajgf ajgfVar7 = (ajgf) abnpVarN.q();
                        abnpVarN7.t();
                        ajgg ajggVar2 = (ajgg) abnpVarN7.b;
                        ajgfVar7.getClass();
                        ajggVar2.d = ajgfVar7;
                        ajggVar2.b |= 1;
                    }
                    ajgg ajggVar3 = (ajgg) abnpVarN7.q();
                    abnpVarN2.t();
                    ajgh ajghVar8 = (ajgh) abnpVarN2.b;
                    ajggVar3.getClass();
                    ajghVar8.j = ajggVar3;
                    ajghVar8.b |= 1024;
                }
                ajgh ajghVar9 = (ajgh) abnpVarN2.q();
                xxh xxhVarG = (!((Boolean) vtdVar.h.a.a()).booleanValue() || (octVarB = xto.b(th)) == null || (vtyVarB = vty.b(((xun) octVarB.a).b)) == null) ? xvy.a : xxh.g(vtyVarB.a());
                vtdVar.o(ajghVar9, (vtx) xxhVarG.e());
            } catch (Exception e2) {
                ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e2)).ai(9811)).u("Failed to record crash.");
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
