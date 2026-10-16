package com.waze.av.d;

import com.waze.modules.navigation.am;
import com.waze.modules.navigation.an;
import com.waze.modules.navigation.ao;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class t {
    public static List a(List list, List list2) {
        Float fA;
        x.f(list2, "categoryProducts");
        List list3 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((s) obj).c(), obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            com.waze.av.c.c cVar = (com.waze.av.c.c) it.next();
            s sVar = (s) linkedHashMap.get(cVar.b());
            i iVar = null;
            if (sVar != null && (fA = sVar.a()) != null) {
                iVar = new i(sVar.c(), fA.floatValue(), cVar.c(), cVar.d(), cVar.a(), sVar.d(), sVar.b());
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.waze.av.d.h b(com.waze.av.d.k r10, java.util.List r11, java.lang.String r12, com.waze.shared_infra.q.r r13, com.waze.shared_infra.o.a r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.d.t.b(com.waze.av.d.k, java.util.List, java.lang.String, com.waze.shared_infra.q.r, com.waze.shared_infra.o.a, boolean):com.waze.av.d.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(com.waze.av.d.k r14, com.waze.search.b.d r15, java.lang.String r16, com.waze.shared_infra.q.r r17, com.waze.shared_infra.o.a r18, boolean r19, h.c.e r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof com.waze.av.d.m
            if (r1 == 0) goto L15
            r1 = r0
            com.waze.av.d.m r1 = (com.waze.av.d.m) r1
            int r2 = r1.f16099b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16099b = r2
            goto L1a
        L15:
            com.waze.av.d.m r1 = new com.waze.av.d.m
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f16098a
            h.c.a.a r2 = h.c.a.a.f48038a
            int r3 = r1.f16099b
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L35
            if (r3 != r5) goto L2d
            e.b.c.b(r0)     // Catch: java.lang.Throwable -> L2a
            goto L66
        L2a:
            r0 = move-exception
            r14 = r0
            goto L6a
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            e.b.c.b(r0)
            java.util.List r0 = r14.H()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L85
            java.lang.String r0 = r14.q()
            if (r0 == 0) goto L85
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.bo.j()
            com.waze.ui.p.q r6 = new com.waze.ui.p.q
            r13 = 1
            r8 = r14
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r15.a(r6)
            r1.f16099b = r5     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = r7.c(r1)     // Catch: java.lang.Throwable -> L2a
            if (r0 == r2) goto L69
        L66:
            com.waze.av.d.h r0 = (com.waze.av.d.h) r0     // Catch: java.lang.Throwable -> L2a
            goto L6e
        L69:
            return r2
        L6a:
            java.lang.Object r0 = e.b.c.a(r14)
        L6e:
            java.lang.Throwable r14 = h.m.c(r0)
            if (r14 != 0) goto L75
            return r0
        L75:
            java.util.Objects.toString(r14)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "Failed to get gas prices: "
            java.lang.String r14 = r15.concat(r14)
            com.waze.shared_infra.i.h.c(r14)
        L85:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.d.t.c(com.waze.av.d.k, com.waze.search.b.d, java.lang.String, com.waze.shared_infra.q.r, com.waze.shared_infra.o.a, boolean, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(com.waze.av.d.k r9, h.c.e r10) {
        /*
            boolean r0 = r10 instanceof com.waze.av.d.n
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.av.d.n r0 = (com.waze.av.d.n) r0
            int r1 = r0.f16101b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16101b = r1
            goto L18
        L13:
            com.waze.av.d.n r0 = new com.waze.av.d.n
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16100a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16101b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L28
            goto L60
        L28:
            r9 = move-exception
            goto L64
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            e.b.c.b(r10)
            java.lang.String r9 = r9.v()
            if (r9 == 0) goto L6e
            kotlinx.coroutines.CompletableDeferred r10 = kotlinx.coroutines.bo.j()
            com.waze.lx r2 = com.waze.mg.f29780a
            android.content.Context r2 = r2.a()
            android.content.res.Resources r2 = r2.getResources()
            com.waze.resources.ResourcesNativeManager r5 = com.waze.resources.ResourcesNativeManager.getInstance()
            com.waze.ResourceDownloadType r6 = com.waze.ResourceDownloadType.RES_DOWNLOAD_IMAGE
            com.waze.destination_cell.b.b r7 = new com.waze.destination_cell.b.b
            r8 = 3
            r7.<init>(r10, r8)
            r5.getOrDownloadSkinDrawable(r2, r9, r6, r7)
            r0.f16101b = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = r10.c(r0)     // Catch: java.lang.Throwable -> L28
            if (r10 == r1) goto L63
        L60:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10     // Catch: java.lang.Throwable -> L28
            goto L68
        L63:
            return r1
        L64:
            java.lang.Object r10 = e.b.c.a(r9)
        L68:
            boolean r9 = r10 instanceof h.l
            if (r9 == 0) goto L6d
            return r3
        L6d:
            return r10
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.d.t.d(com.waze.av.d.k, h.c.e):java.lang.Object");
    }

    public static com.waze.shared_infra.h.c f(com.waze.modules.navigation.j jVar) {
        com.waze.shared_infra.h.c cVarB;
        x.f(jVar, "<this>");
        if (jVar instanceof an) {
            return ((an) jVar).c().b();
        }
        if (!(jVar instanceof am)) {
            throw new h.i();
        }
        am amVar = (am) jVar;
        com.waze.sharedui.e.a aVarG = amVar.c().g();
        return (aVarG == null || (cVarB = aVarG.b()) == null) ? amVar.c().f() : cVarB;
    }

    public static Long g(com.waze.modules.navigation.j jVar) {
        com.waze.sharedui.e.b bVarC;
        x.f(jVar, "<this>");
        if (jVar instanceof an) {
            return null;
        }
        if (!(jVar instanceof am)) {
            throw new h.i();
        }
        com.waze.sharedui.e.a aVarG = ((am) jVar).c().g();
        if (aVarG == null || (bVarC = aVarG.c()) == null) {
            return null;
        }
        return Long.valueOf(bVarC.a());
    }

    public static Long h(com.waze.modules.navigation.j jVar) {
        com.waze.sharedui.e.b bVarC;
        x.f(jVar, "<this>");
        if (jVar instanceof an) {
            return null;
        }
        if (!(jVar instanceof am)) {
            throw new h.i();
        }
        com.waze.sharedui.e.a aVarG = ((am) jVar).c().g();
        if (aVarG == null || (bVarC = aVarG.c()) == null) {
            return null;
        }
        return Long.valueOf(bVarC.b());
    }

    public ao e() {
        throw null;
    }
}
