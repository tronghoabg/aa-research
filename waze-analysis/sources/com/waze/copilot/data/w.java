package com.waze.copilot.data;

import android.content.Context;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23073a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.utils.af f23074b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.aa f23075c;

    public w(Context context, com.waze.utils.af afVar, com.waze.aa aaVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(afVar, "downloader");
        h.g.b.x.f(aaVar, "resolutionSuffixProvider");
        this.f23073a = context;
        this.f23074b = afVar;
        this.f23075c = aaVar;
    }

    static final h.ab d(w wVar, String str, String str2, a aVar, d dVar, String str3) throws h, IOException {
        h.g.b.x.f(str3, "it");
        File file = new File(String.valueOf(str3).concat("/2D/x1.png"));
        File file2 = new File(wVar.k() + DomExceptionUtils.SEPARATOR + str + ".png");
        h.f.s.f(file, file2);
        if (!file2.isFile()) {
            throw h.f23032a;
        }
        File file3 = new File(String.valueOf(str3).concat("/2D/x2.png"));
        File file4 = new File(wVar.k() + DomExceptionUtils.SEPARATOR + str + "@2x.png");
        h.f.s.f(file3, file4);
        if (!file4.isFile()) {
            throw h.f23032a;
        }
        File file5 = new File(String.valueOf(str3).concat("/2D/x3.png"));
        File file6 = new File(wVar.k() + DomExceptionUtils.SEPARATOR + str + "@3x.png");
        h.f.s.f(file5, file6);
        if (!file6.isFile()) {
            throw h.f23032a;
        }
        String strValueOf = String.valueOf(str3);
        new File(wVar.k() + DomExceptionUtils.SEPARATOR + str + str2 + aVar.a()).createNewFile();
        File file7 = new File(strValueOf.concat("/3D/3D_x1.png"));
        File file8 = new File(wVar.k() + DomExceptionUtils.SEPARATOR + str + "_3D.png");
        h.f.s.f(file7, file8);
        if (!file8.isFile()) {
            throw h.f23032a;
        }
        File file9 = new File(String.valueOf(str3).concat("/3D/3D_x2.png"));
        File file10 = new File(wVar.k() + DomExceptionUtils.SEPARATOR + str + "_3D@2x.png");
        h.f.s.f(file9, file10);
        if (!file10.isFile()) {
            throw h.f23032a;
        }
        File file11 = new File(String.valueOf(str3).concat("/3D/3D_x3.png"));
        File file12 = new File(wVar.k() + DomExceptionUtils.SEPARATOR + str + "_3D@3x.png");
        h.f.s.f(file11, file12);
        if (!file12.isFile()) {
            throw h.f23032a;
        }
        if (dVar != d.f23025a) {
            int iOrdinal = dVar.ordinal();
            String str4 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "taxi" : "share" : "normal";
            String strValueOf2 = String.valueOf(str3);
            File file13 = new File(str3 + "/3D/texture_" + str4 + ".png");
            File file14 = new File(wVar.k() + DomExceptionUtils.SEPARATOR + str + "_texture_" + str4 + ".png");
            h.f.s.f(file13, file14);
            if (!file14.isFile()) {
                throw h.f23032a;
            }
            File file15 = new File(strValueOf2.concat("/3D/model.obj"));
            File file16 = new File(wVar.k() + DomExceptionUtils.SEPARATOR + str + "_model.obj");
            h.f.s.f(file15, file16);
            if (!file16.isFile()) {
                throw h.f23032a;
            }
        }
        return h.ab.f48028a;
    }

    static final h.ab e(w wVar, String str, a aVar, String str2) throws IOException {
        h.g.b.x.f(str2, "it");
        com.waze.aa aaVar = wVar.f23075c;
        h.g.b.x.f(aaVar, "<this>");
        String strA = aaVar.a();
        h.f.s.f(new File(str2 + "/x" + (h.g.b.x.n(strA, "@3x") ? 3 : h.g.b.x.n(strA, "@2x") ? 2 : 1) + ".png"), new File(str.concat(".png")));
        long jA = aVar.a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jA);
        new File(sb.toString()).createNewFile();
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, java.lang.String r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.copilot.data.p
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.copilot.data.p r0 = (com.waze.copilot.data.p) r0
            int r1 = r0.f23046c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23046c = r1
            goto L18
        L13:
            com.waze.copilot.data.p r0 = new com.waze.copilot.data.p
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f23044a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f23046c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r7)     // Catch: java.lang.Exception -> L5b
            h.m r7 = (h.m) r7     // Catch: java.lang.Exception -> L5b
            java.lang.Object r4 = r7.b()     // Catch: java.lang.Exception -> L5b
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r7)
            com.waze.utils.af r4 = r4.f23074b     // Catch: java.lang.Exception -> L5b
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> L5b
            java.lang.String r7 = "parse(...)"
            h.g.b.x.e(r5, r7)     // Catch: java.lang.Exception -> L5b
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L5b
            r7.<init>(r6)     // Catch: java.lang.Exception -> L5b
            android.net.Uri r6 = android.net.Uri.fromFile(r7)     // Catch: java.lang.Exception -> L5b
            java.lang.String r7 = "fromFile(...)"
            h.g.b.x.e(r6, r7)     // Catch: java.lang.Exception -> L5b
            r0.f23046c = r3     // Catch: java.lang.Exception -> L5b
            java.lang.Object r4 = r4.a(r5, r6, r0)     // Catch: java.lang.Exception -> L5b
            if (r4 != r1) goto L5a
            return r1
        L5a:
            return r4
        L5b:
            r4 = move-exception
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r4 = e.b.c.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.w.i(java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r5, java.lang.String r6, java.lang.String r7, h.g.a.l r8, h.c.e r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.w.j(java.lang.String, java.lang.String, java.lang.String, h.g.a.l, h.c.e):java.lang.Object");
    }

    private final String k() {
        return String.valueOf(com.waze.t.f(this.f23073a)).concat("/waze/skins/default/cars");
    }

    private final String l() {
        String absolutePath;
        File externalCacheDir = this.f23073a.getExternalCacheDir();
        if (externalCacheDir == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
            return null;
        }
        return absolutePath.concat("/marketplace_zips");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.copilot.data.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.copilot.data.ag r8, boolean r9, h.c.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.waze.copilot.data.v
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.copilot.data.v r0 = (com.waze.copilot.data.v) r0
            int r1 = r0.f23072c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23072c = r1
            goto L18
        L13:
            com.waze.copilot.data.v r0 = new com.waze.copilot.data.v
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f23070a
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f23072c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            e.b.c.b(r10)
            h.m r10 = (h.m) r10
            java.lang.Object r7 = r10.b()
            return r7
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            e.b.c.b(r10)
            android.content.Context r10 = r7.f23073a
            java.lang.String r10 = com.waze.t.f(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = r8.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "/waze/sound"
            java.lang.String r10 = r10.concat(r4)
            r3.append(r10)
            java.lang.String r10 = "/"
            r3.append(r10)
            r3.append(r1)
            java.lang.String r10 = r3.toString()
            com.waze.copilot.data.a r1 = r8.b()
            if (r9 != 0) goto L94
            java.io.File r9 = new java.io.File
            r9.<init>(r10)
            boolean r9 = r9.exists()
            if (r9 == 0) goto L94
            java.io.File r9 = new java.io.File
            long r3 = r1.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r9.<init>(r1)
            boolean r9 = r9.exists()
            if (r9 != 0) goto L91
            goto L94
        L91:
            h.ab r7 = h.ab.f48028a
            return r7
        L94:
            java.lang.String r9 = r7.l()
            if (r9 != 0) goto La3
            com.waze.copilot.data.f r7 = com.waze.copilot.data.f.f23030a
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r7 = e.b.c.a(r7)
            return r7
        La3:
            com.waze.copilot.data.a r1 = r8.b()
            java.lang.String r1 = r1.b()
            com.waze.asks.ak r5 = new com.waze.asks.ak
            r3 = 5
            r4 = 0
            r5.<init>(r10, r8, r3, r4)
            r6.f23072c = r2
            java.lang.String r8 = "/voice.zip"
            java.lang.String r3 = r9.concat(r8)
            java.lang.String r8 = "/unzippedVoice"
            java.lang.String r4 = r9.concat(r8)
            r2 = r1
            r1 = r7
            java.lang.Object r7 = r1.j(r2, r3, r4, r5, r6)
            if (r7 != r0) goto Lc9
            return r0
        Lc9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.w.a(com.waze.copilot.data.ag, boolean, h.c.e):java.lang.Object");
    }

    @Override // com.waze.copilot.data.l
    public final Object b(c cVar, ag agVar, af afVar, h.c.e eVar) {
        return aj.d(new s(cVar, afVar, agVar, this, null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.copilot.data.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.waze.copilot.data.c r14, h.c.e r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.w.c(com.waze.copilot.data.c, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(final com.waze.copilot.data.a r8, java.lang.String r9, h.c.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.waze.copilot.data.u
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.copilot.data.u r0 = (com.waze.copilot.data.u) r0
            int r1 = r0.f23069c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23069c = r1
            goto L18
        L13:
            com.waze.copilot.data.u r0 = new com.waze.copilot.data.u
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f23067a
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f23069c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            e.b.c.b(r10)
            h.m r10 = (h.m) r10
            java.lang.Object r7 = r10.b()
            return r7
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            e.b.c.b(r10)
            android.content.Context r10 = r7.f23073a
            java.lang.String r10 = com.waze.t.f(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            com.waze.aa r1 = r7.f23075c
            java.lang.String r1 = r1.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "/waze/skins/default/moods"
            java.lang.String r10 = r10.concat(r4)
            r3.append(r10)
            java.lang.String r10 = "/"
            r3.append(r10)
            r3.append(r9)
            r3.append(r1)
            java.lang.String r9 = r3.toString()
            java.lang.String r10 = ".png"
            java.lang.String r10 = r9.concat(r10)
            java.io.File r1 = new java.io.File
            r1.<init>(r10)
            boolean r10 = r1.exists()
            if (r10 == 0) goto L99
            java.io.File r10 = new java.io.File
            long r3 = r8.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r10.<init>(r1)
            boolean r10 = r10.exists()
            if (r10 != 0) goto L96
            goto L99
        L96:
            h.ab r7 = h.ab.f48028a
            return r7
        L99:
            java.lang.String r10 = r7.l()
            if (r10 != 0) goto La8
            com.waze.copilot.data.f r7 = com.waze.copilot.data.f.f23030a
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r7 = e.b.c.a(r7)
            return r7
        La8:
            r1 = r2
            java.lang.String r2 = r8.b()
            com.waze.copilot.data.m r5 = new com.waze.copilot.data.m
            r5.<init>()
            r6.f23069c = r1
            java.lang.String r8 = "/mood.zip"
            java.lang.String r3 = r10.concat(r8)
            java.lang.String r8 = "/unzippedMood"
            java.lang.String r4 = r10.concat(r8)
            r1 = r7
            java.lang.Object r7 = r1.j(r2, r3, r4, r5, r6)
            if (r7 != r0) goto Lc8
            return r0
        Lc8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.w.h(com.waze.copilot.data.a, java.lang.String, h.c.e):java.lang.Object");
    }
}
