package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import android.util.Log;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.m.a.bm;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6031a = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.d.b f6034d = new com.google.android.gms.d.b(f.getDefaultInstance());

    /* renamed from: b, reason: collision with root package name */
    private static final Object f6032b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.google.android.libraries.e.b.k f6033c = null;

    static bm a(com.google.android.libraries.phenotype.client.h hVar, String str) {
        return com.google.d.m.a.be.z(g(hVar).b()).A(new ac(str, 2), hVar.j());
    }

    static bm b(com.google.android.libraries.phenotype.client.h hVar, String str) {
        return com.google.d.m.a.be.z(g(hVar).b()).A(new ac(str, 3), hVar.j());
    }

    static bm c(com.google.android.libraries.phenotype.client.h hVar, String str) {
        return com.google.d.m.a.be.z(g(hVar).c(new ac(str, 0), hVar.j())).B(new ag(hVar, str, 1), hVar.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ bm d(com.google.android.libraries.phenotype.client.h hVar, String str) {
        int i2 = bn.f7456d;
        bi biVar = new bi();
        biVar.g(hVar.a());
        int i3 = com.google.android.libraries.a.c.f5792a;
        biVar.g(com.google.android.libraries.a.c.a(hVar.a()));
        bn bnVarF = biVar.f();
        int size = bnVarF.size();
        boolean zF = true;
        for (int i4 = 0; i4 < size; i4++) {
            File file = new File(String.valueOf(((Context) bnVarF.get(i4)).getFilesDir()) + "/phenotype/shared/" + str);
            Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
            if (file.exists()) {
                zF = f(file);
            }
        }
        return zF ? com.google.d.m.a.bd.i() : com.google.d.m.a.bd.g(new IOException("Unable to remove snapshots for removed user"));
    }

    static bm e(com.google.android.libraries.phenotype.client.h hVar, final String str) {
        return g(hVar).c(new com.google.d.b.t() { // from class: com.google.android.libraries.phenotype.client.stable.ad

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f6030b = "";

            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                f fVar = (f) obj;
                int i2 = ae.f6031a;
                String str2 = str;
                b builder = fVar.getAccountListsOrDefault(str2, c.getDefaultInstance()).toBuilder();
                List listA = builder.a();
                String str3 = this.f6030b;
                if (!listA.contains(str3)) {
                    builder.b(str3);
                }
                e builder2 = fVar.toBuilder();
                builder.c(str3);
                builder2.a(str2, builder.build());
                return builder2.build();
            }
        }, hVar.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean f(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            java.io.File[] r0 = r6.listFiles()
            if (r0 == 0) goto L25
            r4 = r1
            r3 = r2
        L10:
            int r5 = r0.length
            if (r3 >= r5) goto L23
            r5 = r0[r3]
            if (r4 == 0) goto L1f
            boolean r4 = f(r5)
            if (r4 == 0) goto L1f
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            int r3 = r3 + 1
            goto L10
        L23:
            if (r4 == 0) goto L2c
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2c
            return r1
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.ae.f(java.io.File):boolean");
    }

    private static com.google.android.libraries.e.b.x g(com.google.android.libraries.phenotype.client.h hVar) {
        com.google.android.libraries.e.b.h hVarA = com.google.android.libraries.e.b.i.a();
        com.google.android.libraries.e.a.a.d dVarA = com.google.android.libraries.e.a.a.e.a(hVar.a());
        dVarA.b();
        dVarA.c();
        hVarA.d(dVarA.a());
        hVarA.c(f.getDefaultInstance());
        hVarA.f(f6034d);
        hVarA.b();
        com.google.android.libraries.e.b.i iVarA = hVarA.a();
        com.google.android.libraries.e.b.k kVar = f6033c;
        if (kVar == null) {
            synchronized (f6032b) {
                kVar = f6033c;
                if (kVar == null) {
                    com.google.android.libraries.e.b.l lVar = new com.google.android.libraries.e.b.l();
                    lVar.c(hVar.j());
                    lVar.d(hVar.g());
                    lVar.b(com.google.android.libraries.e.b.r.a());
                    com.google.android.libraries.e.b.k kVarA = lVar.a();
                    f6033c = kVarA;
                    kVar = kVarA;
                }
            }
        }
        return kVar.a(iVarA);
    }
}
