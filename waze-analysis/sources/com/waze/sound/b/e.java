package com.waze.sound.b;

import com.waze.sound.bj;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final bj f39503a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.a.a f39504b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39505c;

    public e(bj bjVar, com.waze.sound.a.a aVar, com.waze.shared_infra.i.e eVar) {
        x.f(bjVar, "customPromptsRepository");
        x.f(aVar, "voiceConfigRepository");
        x.f(eVar, "logger");
        this.f39503a = bjVar;
        this.f39504b = aVar;
        this.f39505c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.c.e r8) {
        /*
            r7 = this;
            java.lang.String r0 = "downloads are ready for voice "
            boolean r1 = r8 instanceof com.waze.sound.b.b
            if (r1 == 0) goto L15
            r1 = r8
            com.waze.sound.b.b r1 = (com.waze.sound.b.b) r1
            int r2 = r1.f39496c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f39496c = r2
            goto L1a
        L15:
            com.waze.sound.b.b r1 = new com.waze.sound.b.b
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.f39494a
            h.c.a.a r2 = h.c.a.a.f48038a
            int r3 = r1.f39496c
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            java.lang.String r1 = r1.f39497d
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            e.b.c.b(r8)     // Catch: java.util.NoSuchElementException -> L2f
            goto L89
        L2f:
            r8 = move-exception
            goto La3
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            e.b.c.b(r8)
            com.waze.shared_infra.i.e r8 = r7.f39505c
            java.lang.String r3 = "invoke"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r8.a(r3)
            com.waze.sound.a.a r3 = r7.f39504b
            java.lang.String r3 = r3.a()
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L56
            boolean r6 = h.n.o.G(r6)
            if (r6 == 0) goto L57
        L56:
            r3 = r5
        L57:
            if (r3 == 0) goto Lb7
            java.lang.String r6 = "selectedRecordedVoiceId: "
            java.lang.String r6 = r6.concat(r3)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r8.a(r6)
            com.waze.sound.bj r8 = r7.f39503a     // Catch: java.util.NoSuchElementException -> L2f
            kotlinx.coroutines.b.ch r8 = r8.b()     // Catch: java.util.NoSuchElementException -> L2f
            kotlinx.coroutines.b.k r8 = (kotlinx.coroutines.b.k) r8     // Catch: java.util.NoSuchElementException -> L2f
            com.waze.sound.b.c r6 = new com.waze.sound.b.c     // Catch: java.util.NoSuchElementException -> L2f
            r6.<init>(r7, r3, r5)     // Catch: java.util.NoSuchElementException -> L2f
            h.g.a.p r6 = (h.g.a.p) r6     // Catch: java.util.NoSuchElementException -> L2f
            kotlinx.coroutines.b.k r8 = kotlinx.coroutines.b.ai.K(r8, r6)     // Catch: java.util.NoSuchElementException -> L2f
            com.waze.sound.b.d r6 = new com.waze.sound.b.d     // Catch: java.util.NoSuchElementException -> L2f
            r6.<init>(r3, r5)     // Catch: java.util.NoSuchElementException -> L2f
            h.g.a.p r6 = (h.g.a.p) r6     // Catch: java.util.NoSuchElementException -> L2f
            r1.f39497d = r3     // Catch: java.util.NoSuchElementException -> L2f
            r1.f39496c = r4     // Catch: java.util.NoSuchElementException -> L2f
            java.lang.Object r8 = kotlinx.coroutines.b.ai.i(r8, r6, r1)     // Catch: java.util.NoSuchElementException -> L2f
            if (r8 == r2) goto La2
            r1 = r3
        L89:
            com.waze.shared_infra.i.e r8 = r7.f39505c     // Catch: java.util.NoSuchElementException -> L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.util.NoSuchElementException -> L2f
            r2.<init>(r0)     // Catch: java.util.NoSuchElementException -> L2f
            r2.append(r1)     // Catch: java.util.NoSuchElementException -> L2f
            java.lang.String r0 = ", completing flow."
            r2.append(r0)     // Catch: java.util.NoSuchElementException -> L2f
            java.lang.String r0 = r2.toString()     // Catch: java.util.NoSuchElementException -> L2f
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.util.NoSuchElementException -> L2f
            r8.a(r0)     // Catch: java.util.NoSuchElementException -> L2f
            return r1
        La2:
            return r2
        La3:
            com.waze.shared_infra.i.e r7 = r7.f39505c
            r8.toString()
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "NoSuchElementException "
            java.lang.String r8 = r0.concat(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r7.b(r8)
        Lb7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.b.e.c(h.c.e):java.lang.Object");
    }
}
