package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ugq implements plg, uyl {
    public final Map e;
    private final tmb f;
    private final xyc h;
    private final int i;
    private final Map g = new HashMap();
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public final Runnable d = new ueh(this, 10);

    public ugq(pkx pkxVar, tmb tmbVar, xyc xycVar) {
        new HashMap();
        this.e = new HashMap();
        this.f = tmbVar;
        this.h = xycVar;
        this.i = 64;
        pkxVar.d(this, "GLTileCacheManager");
    }

    private final synchronized void j() {
        int i = this.a;
        String[] strArr = vaq.a;
        fdi.a("GLTileCacheManager - glDataSize (B)", i);
        fdi.a("GLTileCacheManager - javaAndNativeDataSize (B)", this.b);
    }

    private static boolean k(ogz ogzVar, long j) {
        if (ogzVar == null) {
            return false;
        }
        if (j != 0 && ((ugo) ogzVar.b).c > j) {
            return false;
        }
        Object obj = ((ugo) ogzVar.b).d;
        return true;
    }

    @Override // defpackage.plg
    public final synchronized String a() {
        int iC;
        StringBuilder sb;
        Iterator it = this.g.entrySet().iterator();
        iC = 0;
        while (it.hasNext()) {
            iC += ((ugp) ((Map.Entry) it.next()).getValue()).c();
        }
        int i = this.b * 10;
        int i2 = uzg.a;
        sb = new StringBuilder();
        int i3 = (i + 524288) / 1048576;
        sb.append(i3 / 10);
        sb.append(".");
        sb.append(i3 % 10);
        return a.bA(iC, sb.toString(), "javaAndNativeDataSize: ", " tileCount: ");
    }

    @ResultIgnorabilityUnspecified
    public final synchronized uih c(uij uijVar, ukp ukpVar, boolean z) {
        try {
            try {
                uii uiiVarD = d(uijVar, ukpVar, true, this.f.a());
                if (uiiVarD != null) {
                    uiiVarD.t();
                }
                return uiiVarD;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[Catch: all -> 0x005e, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000e, B:19:0x0058, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0044, B:17:0x004b), top: B:27:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000e, B:19:0x0058, B:8:0x001c, B:10:0x0024, B:12:0x0028, B:14:0x002e, B:15:0x0044, B:17:0x004b), top: B:27:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, uii] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, uii] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.uii d(defpackage.uij r5, defpackage.ukp r6, boolean r7, long r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Map r0 = r4.g     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L5e
            ugp r1 = (defpackage.ugp) r1     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            if (r1 != 0) goto L1c
            if (r7 == 0) goto L1a
            int r7 = r4.i     // Catch: java.lang.Throwable -> L5e
            ugp r1 = new ugp     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r4, r7)     // Catch: java.lang.Throwable -> L5e
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L5e
            r7 = 1
            goto L1c
        L1a:
            r0 = r2
            goto L56
        L1c:
            java.lang.Object r0 = r1.h(r6)     // Catch: java.lang.Throwable -> L5e
            ugo r0 = (defpackage.ugo) r0     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L49
            java.lang.Object r7 = r0.d     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L44
            boolean r3 = r7.z()     // Catch: java.lang.Throwable -> L5e
            if (r3 != 0) goto L44
            r7.t()     // Catch: java.lang.Throwable -> L5e
            r1.i(r6)     // Catch: java.lang.Throwable -> L5e
            java.util.Map r6 = r4.e     // Catch: java.lang.Throwable -> L5e
            tmb r7 = r4.f     // Catch: java.lang.Throwable -> L5e
            long r7 = r7.a()     // Catch: java.lang.Throwable -> L5e
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L5e
            r6.put(r5, r7)     // Catch: java.lang.Throwable -> L5e
            goto L1a
        L44:
            r0.c = r8     // Catch: java.lang.Throwable -> L5e
            r1.b = r8     // Catch: java.lang.Throwable -> L5e
            goto L56
        L49:
            if (r7 == 0) goto L1a
            ugo r5 = new ugo     // Catch: java.lang.Throwable -> L5e
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L5e
            r1.n(r6, r5)     // Catch: java.lang.Throwable -> L5e
            r1.b = r8     // Catch: java.lang.Throwable -> L5e
            goto L1a
        L56:
            if (r0 == 0) goto L5c
            java.lang.Object r5 = r0.d     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            return r5
        L5c:
            monitor-exit(r4)
            return r2
        L5e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugq.d(uij, ukp, boolean, long):uii");
    }

    public final synchronized void e(uij uijVar) {
        vaq.d();
        Map map = this.g;
        ugp ugpVar = (ugp) map.get(uijVar);
        if (ugpVar != null) {
            ugpVar.l();
            map.remove(uijVar);
            j();
        }
    }

    @Override // defpackage.plg
    @ResultIgnorabilityUnspecified
    public final synchronized void f(float f) {
        vaq.d();
        ArrayList arrayList = new ArrayList();
        Map map = this.g;
        for (Map.Entry entry : map.entrySet()) {
            ugp ugpVar = (ugp) entry.getValue();
            float fC = ugpVar.c() * f;
            while (ugpVar.c() > ((int) fC)) {
                ogz ogzVarT = ugpVar.t();
                if (!k(ogzVarT, 0L)) {
                    break;
                }
                ugpVar.i((ukp) ogzVarT.a);
                this.e.put((uij) entry.getKey(), Long.valueOf(this.f.a()));
            }
            if (ugpVar.s()) {
                arrayList.add((uij) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            map.remove(arrayList.get(i));
        }
        j();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, uii] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, uii] */
    public final synchronized void g(uij uijVar, ukp ukpVar, uii uiiVar) {
        vaq.d();
        uiiVar.q();
        Map map = this.g;
        ugp ugpVar = (ugp) map.get(uijVar);
        if (ugpVar == null) {
            ugpVar = new ugp(this, this.i);
            map.put(uijVar, ugpVar);
        }
        ugo ugoVar = (ugo) ugpVar.g(ukpVar);
        if (ugoVar == null) {
            uiiVar.t();
            return;
        }
        ?? r12 = ugoVar.d;
        if (r12 != 0) {
            this.a -= ugoVar.a;
            this.b -= ugoVar.b;
            r12.t();
            ugoVar.d.t();
        } else {
            this.c++;
        }
        ugoVar.d = uiiVar;
        ugoVar.a = uiiVar.i();
        int iJ = uiiVar.j();
        ugoVar.b = iJ;
        this.a += ugoVar.a;
        this.b += iJ;
        vaq.d();
        tmb tmbVar = this.f;
        long jA = tmbVar.a() - 500;
        boolean zBooleanValue = ((Boolean) this.h.gu()).booleanValue();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            ugp ugpVar2 = (ugp) entry.getValue();
            while (true) {
                if (ugpVar2.c() <= ugpVar2.c && !zBooleanValue) {
                    break;
                }
                ogz ogzVarT = ugpVar2.t();
                if (!k(ogzVarT, jA)) {
                    break;
                }
                ugpVar2.i((ukp) ogzVarT.a);
                this.e.put((uij) entry.getKey(), Long.valueOf(tmbVar.a()));
            }
            if (ugpVar2.s()) {
                arrayList.add((uij) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            map.remove(arrayList.get(i));
        }
        j();
    }

    @Override // defpackage.uyl
    public final synchronized void gt(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("GLTileCacheManager:"));
        int i = this.b;
        StringBuilder sb = new StringBuilder();
        String strConcat = str.concat("  ");
        sb.append(strConcat);
        sb.append("Java memory - used: ");
        sb.append(i);
        printWriter.println(sb.toString());
        printWriter.println(strConcat + "GL memory - used: " + this.a);
        printWriter.print(strConcat);
        Integer numValueOf = Integer.valueOf(this.c);
        Map map = this.g;
        boolean z = true;
        char c = 2;
        printWriter.printf("Tile count - used: %d, max: %d, (%.2f%%)%n", numValueOf, Integer.valueOf(map.size() * this.i), Float.valueOf((this.c / (map.size() * r6)) * 100.0f));
        for (Map.Entry entry : map.entrySet()) {
            ugp ugpVar = (ugp) entry.getValue();
            int i2 = 0;
            int i3 = 0;
            for (ugo ugoVar : ugpVar.j()) {
                i3 += ugoVar.a;
                i2 += ugoVar.b;
            }
            printWriter.print(strConcat);
            ogz ogzVarT = ugpVar.t();
            long j = ogzVarT != null ? ((ugo) ogzVarT.b).c : 0L;
            long jA = this.f.a();
            String strName = ((uij) entry.getKey()).a.c.name();
            Integer numValueOf2 = Integer.valueOf(((uij) entry.getKey()).hashCode());
            Integer numValueOf3 = Integer.valueOf(i3);
            Integer numValueOf4 = Integer.valueOf(i2);
            Integer numValueOf5 = Integer.valueOf(ugpVar.c());
            boolean z2 = z;
            Integer numValueOf6 = Integer.valueOf(ugpVar.c);
            char c2 = c;
            Long lValueOf = Long.valueOf(jA - ugpVar.b);
            Long lValueOf2 = Long.valueOf(jA - j);
            Object[] objArr = new Object[8];
            objArr[0] = strName;
            objArr[z2 ? 1 : 0] = numValueOf2;
            objArr[c2] = numValueOf3;
            objArr[3] = numValueOf4;
            objArr[4] = numValueOf5;
            objArr[5] = numValueOf6;
            objArr[6] = lValueOf;
            objArr[7] = lValueOf2;
            printWriter.printf("%s - key hash %d - gl bytes: %d, java bytes: %d, tiles: %d/%d, youngestMs: %d, oldestMs %d%n", objArr);
            ujk ujkVar = ((uij) entry.getKey()).d;
            Integer numValueOf7 = Integer.valueOf(((uij) entry.getKey()).e);
            Object[] objArr2 = new Object[3];
            objArr2[0] = strConcat;
            objArr2[z2 ? 1 : 0] = ujkVar;
            objArr2[c2] = numValueOf7;
            printWriter.printf("%s  CacheKey - legend %s, glStateToken: %s\n", objArr2);
            z = z2 ? 1 : 0;
            c = c2;
        }
    }

    public final synchronized void h() {
        ogz ogzVarT;
        vaq.d();
        tmb tmbVar = this.f;
        long jA = tmbVar.a() - 5000;
        ArrayList arrayList = new ArrayList();
        Map map = this.g;
        for (Map.Entry entry : map.entrySet()) {
            ugp ugpVar = (ugp) entry.getValue();
            long j = ugpVar.b;
            if (j > 0 && j < jA && (ogzVarT = ugpVar.t()) != null) {
                ugpVar.i((ukp) ogzVarT.a);
                this.e.put((uij) entry.getKey(), Long.valueOf(tmbVar.a()));
            }
            if (ugpVar.s()) {
                arrayList.add((uij) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            map.remove(arrayList.get(i));
        }
        j();
    }

    @ResultIgnorabilityUnspecified
    public final synchronized void i(uij uijVar, int i) {
        ugp ugpVar = (ugp) this.g.get(uijVar);
        if (ugpVar != null) {
            int i2 = this.i;
            if (i > 0) {
                float f = i;
                int iCeil = (int) Math.ceil(f + f);
                if (iCeil > ugpVar.c) {
                    ugpVar.c = iCeil;
                } else {
                    ugpVar.c -= (int) Math.ceil((r1 - iCeil) * 0.05f);
                }
            }
            int i3 = ugpVar.c;
            if (i3 < 16) {
                ugpVar.c = 16;
                i3 = 16;
            }
            if (i3 > i2) {
                ugpVar.c = i2;
            }
        }
    }
}
