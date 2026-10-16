package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends g implements p<l<? super Float>, e<? super ab>, Object> {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ o<ab> $channel;
    final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, o<ab> oVar, Context context, e<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> eVar) {
        super(2, eVar);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.$channel = oVar;
        this.$applicationContext = context;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, eVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(l<? super Float> lVar, e<? super ab> eVar) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(lVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:7:0x0014, B:16:0x0046, B:18:0x0055, B:20:0x005d, B:12:0x0028, B:15:0x0040), top: B:30:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0078 -> B:16:0x0046). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.a.q r1 = (kotlinx.coroutines.a.q) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.b.l r4 = (kotlinx.coroutines.b.l) r4
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L87
            goto L46
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L20:
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.a.q r1 = (kotlinx.coroutines.a.q) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.b.l r4 = (kotlinx.coroutines.b.l) r4
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L87
            goto L55
        L2c:
            e.b.c.b(r8)
            java.lang.Object r8 = r7.L$0
            r4 = r8
            kotlinx.coroutines.b.l r4 = (kotlinx.coroutines.b.l) r4
            android.content.ContentResolver r8 = r7.$resolver
            android.net.Uri r1 = r7.$animationScaleUri
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r5 = r7.$contentObserver
            android.database.ContentObserver r5 = (android.database.ContentObserver) r5
            r6 = 0
            r8.registerContentObserver(r1, r6, r5)
            kotlinx.coroutines.a.o<h.ab> r8 = r7.$channel     // Catch: java.lang.Throwable -> L87
            kotlinx.coroutines.a.q r1 = r8.p()     // Catch: java.lang.Throwable -> L87
        L46:
            r8 = r7
            h.c.e r8 = (h.c.e) r8     // Catch: java.lang.Throwable -> L87
            r7.L$0 = r4     // Catch: java.lang.Throwable -> L87
            r7.L$1 = r1     // Catch: java.lang.Throwable -> L87
            r7.label = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r8 = r1.a(r8)     // Catch: java.lang.Throwable -> L87
            if (r8 == r0) goto L89
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L87
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r8 == 0) goto L7b
            r1.b()     // Catch: java.lang.Throwable -> L87
            android.content.Context r8 = r7.$applicationContext     // Catch: java.lang.Throwable -> L87
            float r8 = androidx.compose.ui.platform.WindowRecomposer_androidKt.access$readAnimationScale(r8)     // Catch: java.lang.Throwable -> L87
            java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L87
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L87
            r8 = r7
            h.c.e r8 = (h.c.e) r8     // Catch: java.lang.Throwable -> L87
            r7.L$0 = r4     // Catch: java.lang.Throwable -> L87
            r7.L$1 = r1     // Catch: java.lang.Throwable -> L87
            r7.label = r2     // Catch: java.lang.Throwable -> L87
            java.lang.Object r8 = r4.emit(r5, r8)     // Catch: java.lang.Throwable -> L87
            if (r8 != r0) goto L46
            goto L89
        L7b:
            android.content.ContentResolver r8 = r7.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r7 = r7.$contentObserver
            android.database.ContentObserver r7 = (android.database.ContentObserver) r7
            r8.unregisterContentObserver(r7)
            h.ab r7 = h.ab.f48028a
            return r7
        L87:
            r8 = move-exception
            goto L8a
        L89:
            return r0
        L8a:
            android.content.ContentResolver r0 = r7.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r7 = r7.$contentObserver
            android.database.ContentObserver r7 = (android.database.ContentObserver) r7
            r0.unregisterContentObserver(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
