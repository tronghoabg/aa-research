package androidx.datastore.core;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.io.File;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.ax;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MulticastFileObserver$Companion$observe$1 extends g implements p<ad<? super ab>, e<? super ab>, Object> {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MulticastFileObserver$Companion$observe$1(File file, e<? super MulticastFileObserver$Companion$observe$1> eVar) {
        super(2, eVar);
        this.$file = file;
    }

    static final ab invokeSuspend$lambda$0(File file, ad adVar, String str) {
        if (x.n(str, file.getName())) {
            kotlinx.coroutines.a.ab.e(adVar, ab.f48028a);
        }
        return ab.f48028a;
    }

    static final ab invokeSuspend$lambda$1(ax axVar) {
        axVar.dispose();
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, eVar);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // h.g.a.p
    public final Object invoke(ad<? super ab> adVar, e<? super ab> eVar) {
        return ((MulticastFileObserver$Companion$observe$1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (kotlinx.coroutines.a.ab.a(r0, new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$$ExternalSyntheticLambda1(r2), r7) == r1) goto L17;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.a.ad r0 = (kotlinx.coroutines.a.ad) r0
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r7.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L31
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r0 = r7.L$2
            kotlinx.coroutines.ax r0 = (kotlinx.coroutines.ax) r0
            java.lang.Object r7 = r7.L$1
            h.g.a.l r7 = (h.g.a.l) r7
            e.b.c.b(r8)
            goto L72
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L25:
            java.lang.Object r2 = r7.L$2
            kotlinx.coroutines.ax r2 = (kotlinx.coroutines.ax) r2
            java.lang.Object r4 = r7.L$1
            h.g.a.l r4 = (h.g.a.l) r4
            e.b.c.b(r8)
            goto L5b
        L31:
            e.b.c.b(r8)
            java.io.File r8 = r7.$file
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$$ExternalSyntheticLambda0 r2 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$$ExternalSyntheticLambda0
            r2.<init>()
            androidx.datastore.core.MulticastFileObserver$Companion r6 = androidx.datastore.core.MulticastFileObserver.Companion
            java.io.File r8 = r8.getParentFile()
            h.g.b.x.c(r8)
            kotlinx.coroutines.ax r2 = androidx.datastore.core.MulticastFileObserver.Companion.access$observe(r6, r8, r2)
            h.ab r8 = h.ab.f48028a
            r6 = r7
            h.c.e r6 = (h.c.e) r6
            r7.L$0 = r0
            r7.L$1 = r5
            r7.L$2 = r2
            r7.label = r4
            java.lang.Object r8 = r0.g(r8, r6)
            if (r8 == r1) goto L75
        L5b:
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$$ExternalSyntheticLambda1 r8 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$$ExternalSyntheticLambda1
            r8.<init>()
            r2 = r7
            h.c.e r2 = (h.c.e) r2
            r7.L$0 = r5
            r7.L$1 = r5
            r7.L$2 = r5
            r7.label = r3
            java.lang.Object r7 = kotlinx.coroutines.a.ab.a(r0, r8, r2)
            if (r7 != r1) goto L72
            goto L75
        L72:
            h.ab r7 = h.ab.f48028a
            return r7
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MulticastFileObserver$Companion$observe$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
