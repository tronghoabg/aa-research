package com.waze.sharedrive.e;

import android.graphics.Bitmap;
import com.waze.MoodManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bc implements av {

    /* renamed from: a, reason: collision with root package name */
    private final co f38399a;

    /* renamed from: b, reason: collision with root package name */
    private final a f38400b;

    /* renamed from: c, reason: collision with root package name */
    private final MoodManager f38401c;

    /* renamed from: d, reason: collision with root package name */
    private final h.c.j f38402d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38403e;

    /* renamed from: f, reason: collision with root package name */
    private final h.o.h f38404f;

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap f38405g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Bitmap f38406h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f38407i;

    public bc(co coVar, a aVar, MoodManager moodManager, h.c.j jVar, com.waze.shared_infra.i.e eVar, h.o.h hVar) {
        h.g.b.x.f(coVar, "viewBitmapRenderer");
        h.g.b.x.f(aVar, "avatarDownloader");
        h.g.b.x.f(moodManager, "moodManager");
        h.g.b.x.f(jVar, "backgroundContext");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(hVar, "timeSource");
        this.f38399a = coVar;
        this.f38400b = aVar;
        this.f38401c = moodManager;
        this.f38402d = jVar;
        this.f38403e = eVar;
        this.f38404f = hVar;
        this.f38405g = new ConcurrentHashMap();
        this.f38407i = h.g.a(new com.waze.settings.ao(12));
    }

    public static final /* synthetic */ Bitmap c(bc bcVar) {
        return (Bitmap) bcVar.f38407i.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.waze.sharedrive.e.bc r5, com.waze.sharedrive.c.a.l r6, android.graphics.Bitmap r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.sharedrive.e.bb
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sharedrive.e.bb r0 = (com.waze.sharedrive.e.bb) r0
            int r1 = r0.f38397c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38397c = r1
            goto L18
        L13:
            com.waze.sharedrive.e.bb r0 = new com.waze.sharedrive.e.bb
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f38395a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38397c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            android.graphics.Bitmap r7 = r0.f38398d
            r5 = r7
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            e.b.c.b(r8)
            goto L6c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            android.graphics.Bitmap r7 = r0.f38398d
            r5 = r7
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            e.b.c.b(r8)
            goto L58
        L40:
            e.b.c.b(r8)
            com.waze.sharedrive.c.a.e r8 = r6.b()
            boolean r2 = r8 instanceof com.waze.sharedrive.c.a.c
            if (r2 == 0) goto L5b
            com.waze.sharedrive.c.a.c r8 = (com.waze.sharedrive.c.a.c) r8
            r0.f38398d = r7
            r0.f38397c = r4
            java.lang.Object r8 = r5.k(r6, r8, r0)
            if (r8 != r1) goto L58
            goto L6b
        L58:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            goto L70
        L5b:
            boolean r6 = r8 instanceof com.waze.sharedrive.c.a.d
            if (r6 == 0) goto L6f
            com.waze.sharedrive.c.a.d r8 = (com.waze.sharedrive.c.a.d) r8
            r0.f38398d = r7
            r0.f38397c = r3
            java.lang.Object r8 = r5.l(r8, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            goto L70
        L6f:
            r8 = 0
        L70:
            if (r8 != 0) goto L73
            return r7
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.bc.e(com.waze.sharedrive.e.bc, com.waze.sharedrive.c.a.l, android.graphics.Bitmap, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object f(com.waze.sharedrive.e.bc r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.sharedrive.e.aw
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sharedrive.e.aw r0 = (com.waze.sharedrive.e.aw) r0
            int r1 = r0.f38368c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38368c = r1
            goto L18
        L13:
            com.waze.sharedrive.e.aw r0 = new com.waze.sharedrive.e.aw
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f38366a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38368c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.sharedrive.e.bc r5 = r0.f38369d
            r0 = r5
            com.waze.sharedrive.e.bc r0 = (com.waze.sharedrive.e.bc) r0
            e.b.c.b(r6)
            goto L50
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            e.b.c.b(r6)
            android.graphics.Bitmap r6 = r5.f38406h
            if (r6 == 0) goto L3c
            return r6
        L3c:
            com.waze.sharedrive.e.co r6 = r5.f38399a
            com.waze.perf.p r2 = new com.waze.perf.p
            r4 = 16
            r2.<init>(r4)
            r0.f38369d = r5
            r0.f38368c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto L57
            r5.f38406h = r6
            return r6
        L57:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.bc.f(com.waze.sharedrive.e.bc, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.waze.sharedrive.c.a.l r11, com.waze.sharedrive.c.a.c r12, h.c.e r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.bc.k(com.waze.sharedrive.c.a.l, com.waze.sharedrive.c.a.c, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.waze.sharedrive.c.a.d r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.sharedrive.e.ba
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sharedrive.e.ba r0 = (com.waze.sharedrive.e.ba) r0
            int r1 = r0.f38393c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38393c = r1
            goto L18
        L13:
            com.waze.sharedrive.e.ba r0 = new com.waze.sharedrive.e.ba
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f38391a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38393c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.sharedrive.c.a.d r7 = r0.f38394d
            r0 = r7
            com.waze.sharedrive.c.a.d r0 = (com.waze.sharedrive.c.a.d) r0
            e.b.c.b(r8)
            goto L85
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            e.b.c.b(r8)
            j$.util.concurrent.ConcurrentHashMap r8 = r6.f38405g
            int r2 = r7.a()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            java.lang.Object r8 = r8.get(r4)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L4b
            return r8
        L4b:
            com.waze.MoodManager r8 = r6.f38401c
            int r2 = r7.a()
            android.graphics.drawable.Drawable r8 = r8.getMoodDrawableById(r2)
            if (r8 != 0) goto L72
            com.waze.shared_infra.i.e r6 = r6.f38403e
            int r7 = r7.a()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Mood drawable not available for mood id "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.g(r7)
            r6 = 0
            return r6
        L72:
            com.waze.sharedrive.e.co r2 = r6.f38399a
            com.waze.r.d r4 = new com.waze.r.d
            r5 = 9
            r4.<init>(r8, r5)
            r0.f38394d = r7
            r0.f38393c = r3
            java.lang.Object r8 = r2.a(r4, r0)
            if (r8 == r1) goto L9a
        L85:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L99
            j$.util.concurrent.ConcurrentHashMap r6 = r6.f38405g
            java.util.Map r6 = (java.util.Map) r6
            int r7 = r7.a()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            r6.put(r0, r8)
        L99:
            return r8
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.bc.l(com.waze.sharedrive.c.a.d, h.c.e):java.lang.Object");
    }

    @Override // com.waze.sharedrive.e.av
    public final Object a(h.c.e eVar) {
        return f(this, eVar);
    }

    @Override // com.waze.sharedrive.e.av
    public final Object b(List list, h.c.e eVar) {
        return kotlinx.coroutines.aj.d(new ay(this, list, null), eVar);
    }
}
