package com.waze.sound;

import java.io.File;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class fb {
    public static Object c(fa faVar, String str, String str2, h.c.e eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        faVar.getFileForPromptType(str, str2, new com.waze.r.d(completableDeferredJ, 16));
        return completableDeferredJ.c(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object d(com.waze.navigate.NavigationInfoNativeManager r4, int r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.sound.ds
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sound.ds r0 = (com.waze.sound.ds) r0
            int r1 = r0.f39820b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39820b = r1
            goto L18
        L13:
            com.waze.sound.ds r0 = new com.waze.sound.ds
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39819a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39820b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.navigate.ds r4 = (com.waze.navigate.ds) r4
            r0.f39820b = r3
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.f.u r2 = new com.waze.car_lib.f.u
            r3 = 17
            r2.<init>(r6, r3)
            r4.getMetersElapsedSinceSegment(r5, r2)
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L58
            int r4 = r6.intValue()
            r5 = -1
            if (r4 != r5) goto L58
            r4 = 0
            return r4
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.fb.d(com.waze.navigate.NavigationInfoNativeManager, int, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e(com.waze.navigate.NavigationInfoNativeManager r4, int r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.sound.dt
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sound.dt r0 = (com.waze.sound.dt) r0
            int r1 = r0.f39822b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39822b = r1
            goto L18
        L13:
            com.waze.sound.dt r0 = new com.waze.sound.dt
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39821a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39822b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.navigate.ds r4 = (com.waze.navigate.ds) r4
            r0.f39822b = r3
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.f.u r2 = new com.waze.car_lib.f.u
            r3 = 18
            r2.<init>(r6, r3)
            r4.getMetersToCrossSegment(r5, r2)
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L58
            int r4 = r6.intValue()
            r5 = -1
            if (r4 != r5) goto L58
            r4 = 0
            return r4
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.fb.e(com.waze.navigate.NavigationInfoNativeManager, int, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(com.waze.sound.m r5, android.content.Context r6, java.lang.String r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.sound.n
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sound.n r0 = (com.waze.sound.n) r0
            int r1 = r0.f40409b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40409b = r1
            goto L18
        L13:
            com.waze.sound.n r0 = new com.waze.sound.n
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f40408a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40409b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.waze.sound.m r5 = r0.f40410c
            r6 = r5
            com.waze.sound.m r6 = (com.waze.sound.m) r6
            e.b.c.b(r8)
            goto L50
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            e.b.c.b(r8)
            boolean r8 = r5.h()
            if (r4 == r8) goto L40
            r8 = r3
            goto L41
        L40:
            r8 = r5
        L41:
            if (r8 != 0) goto L5b
            if (r6 == 0) goto L5a
            r0.f40410c = r5
            r0.f40409b = r4
            java.lang.Object r8 = r5.d(r6, r7, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r4 == r6) goto L59
            return r3
        L59:
            return r5
        L5a:
            return r3
        L5b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.fb.f(com.waze.sound.m, android.content.Context, java.lang.String, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ void g(File file) {
        try {
            file.delete();
        } catch (Throwable th) {
            e.b.c.a(th);
        }
    }

    public CompletableDeferred a() {
        throw null;
    }
}
