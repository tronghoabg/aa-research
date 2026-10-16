package com.google.d.f.b.a;

import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.d.b.an;
import com.google.d.f.b.r;
import com.google.d.f.b.u;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f7722a;

    /* renamed from: b, reason: collision with root package name */
    private static final r f7723b;

    /* renamed from: c, reason: collision with root package name */
    private static final l f7724c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7725d;

    /* renamed from: e, reason: collision with root package name */
    private final Level f7726e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f7727f;

    /* renamed from: g, reason: collision with root package name */
    private final r f7728g;

    /* renamed from: h, reason: collision with root package name */
    private final int f7729h;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(com.google.d.f.m.f7848a, com.google.d.f.a.a.f7667a, com.google.d.f.a.b.f7668a)));
        f7722a = setUnmodifiableSet;
        f7723b = u.a(setUnmodifiableSet);
        f7724c = new l();
    }

    /* synthetic */ n(String str, int i2, Level level, Set set, r rVar) {
        super(str);
        this.f7725d = an.h(str);
        this.f7729h = 2;
        this.f7726e = level;
        this.f7727f = set;
        this.f7728g = rVar;
    }

    public static l f() {
        return f7724c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(com.google.d.f.b.f r3, java.lang.String r4, int r5, java.util.logging.Level r6, java.util.Set r7, com.google.d.f.b.r r8) {
        /*
            com.google.d.f.b.k r5 = r3.j()
            com.google.d.f.aa r0 = com.google.d.f.a.b.f7668a
            java.lang.Object r5 = r5.c(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L15
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L15
            return
        L15:
            com.google.d.f.b.k r5 = com.google.d.f.b.ae.f()
            com.google.d.f.b.k r0 = r3.j()
            com.google.d.f.b.ab r5 = com.google.d.f.b.ab.h(r5, r0)
            java.util.logging.Level r0 = r3.m()
            int r0 = r0.intValue()
            int r6 = r6.intValue()
            if (r0 >= r6) goto L31
            r6 = 1
            goto L32
        L31:
            r6 = 0
        L32:
            r0 = 2
            if (r6 != 0) goto L5b
            int r1 = com.google.d.f.b.af.f7737a
            com.google.d.f.b.ag r1 = r3.k()
            if (r1 != 0) goto L5b
            int r1 = r5.a()
            int r2 = r7.size()
            if (r1 > r2) goto L5b
            java.util.Set r1 = r5.b()
            boolean r7 = r7.containsAll(r1)
            if (r7 != 0) goto L52
            goto L5b
        L52:
            java.lang.Object r5 = r3.l()
            java.lang.String r5 = com.google.d.f.b.i.a(r5)
            goto L9c
        L5b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.google.d.f.r r1 = r3.f()
            boolean r1 = com.google.d.b.an.i(r0, r1, r7)
            if (r1 == 0) goto L6f
            java.lang.String r1 = " "
            r7.append(r1)
        L6f:
            if (r6 == 0) goto L88
            com.google.d.f.b.ag r6 = r3.k()
            if (r6 == 0) goto L88
            java.lang.String r5 = "(REDACTED) "
            r7.append(r5)
            com.google.d.f.b.ag r5 = r3.k()
            java.lang.String r5 = r5.b()
            r7.append(r5)
            goto L98
        L88:
            com.google.d.f.b.a.g(r3, r7)
            int r6 = com.google.d.f.b.af.f7737a
            com.google.d.f.b.e r6 = new com.google.d.f.b.e
            r6.<init>(r7)
            r5.c(r8, r6)
            r6.b()
        L98:
            java.lang.String r5 = r7.toString()
        L9c:
            com.google.d.f.b.k r6 = r3.j()
            com.google.d.f.aa r7 = com.google.d.f.m.f7848a
            java.lang.Object r6 = r6.c(r7)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.util.logging.Level r3 = r3.m()
            int r3 = com.google.d.b.an.g(r3)
            if (r3 == r0) goto Lcb
            r7 = 3
            if (r3 == r7) goto Lc7
            r7 = 4
            if (r3 == r7) goto Lc3
            r7 = 5
            if (r3 == r7) goto Lbf
            android.util.Log.e(r4, r5, r6)
            return
        Lbf:
            android.util.Log.w(r4, r5, r6)
            return
        Lc3:
            android.util.Log.i(r4, r5, r6)
            return
        Lc7:
            android.util.Log.d(r4, r5, r6)
            return
        Lcb:
            android.util.Log.v(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.b.a.n.i(com.google.d.f.b.f, java.lang.String, int, java.util.logging.Level, java.util.Set, com.google.d.f.b.r):void");
    }

    @Override // com.google.d.f.b.g
    public final void c(com.google.d.f.b.f fVar) {
        i(fVar, this.f7725d, 2, this.f7726e, this.f7727f, this.f7728g);
    }

    @Override // com.google.d.f.b.g
    public final boolean d(Level level) {
        String str = this.f7725d;
        int iG = an.g(level);
        return Log.isLoggable(str, iG) || Log.isLoggable(TtmlNode.COMBINE_ALL, iG);
    }
}
