package androidx.compose.foundation;

import android.view.Surface;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.s;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {
    private br job;
    private s<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super e<? super ab>, ? extends Object> onSurface;
    private q<? super Surface, ? super Integer, ? super Integer, ab> onSurfaceChanged;
    private l<? super Surface, ab> onSurfaceDestroyed;
    private final af scope;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ Surface $surface;
        final /* synthetic */ int $width;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Surface surface, int i2, int i3, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$surface = surface;
            this.$width = i2;
            this.$height = i3;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = BaseAndroidExternalSurfaceState.this.new AnonymousClass1(this.$surface, this.$width, this.$height, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
        
            if (r3.invoke(r4, r5, r6, r7, r9) == r0) goto L18;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r10)
                goto L67
            L10:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L18:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
                e.b.c.b(r10)
                goto L3d
            L20:
                e.b.c.b(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                kotlinx.coroutines.br r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getJob$p(r10)
                if (r10 == 0) goto L3d
                r4 = r9
                h.c.e r4 = (h.c.e) r4
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = h.g.b.o.b(r10, r4)
                if (r10 == r0) goto L66
            L3d:
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 r4 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1
                r4.<init>(r10, r1)
                h.g.a.s r3 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getOnSurface$p(r10)
                if (r3 == 0) goto L67
                android.view.Surface r5 = r9.$surface
                int r10 = r9.$width
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r10)
                int r10 = r9.$height
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r10)
                r10 = 0
                r9.L$0 = r10
                r9.label = r2
                r8 = r9
                java.lang.Object r9 = r3.invoke(r4, r5, r6, r7, r8)
                if (r9 != r0) goto L67
            L66:
                return r0
            L67:
                h.ab r9 = h.ab.f48028a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BaseAndroidExternalSurfaceState.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BaseAndroidExternalSurfaceState(af afVar) {
        this.scope = afVar;
    }

    public final void dispatchSurfaceChanged(Surface surface, int i2, int i3) {
        q<? super Surface, ? super Integer, ? super Integer, ab> qVar = this.onSurfaceChanged;
        if (qVar != null) {
            qVar.invoke(surface, Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public final void dispatchSurfaceCreated(Surface surface, int i2, int i3) {
        if (this.onSurface != null) {
            this.job = aj.z(this.scope, null, ag.f51345d, new AnonymousClass1(surface, i2, i3, null), 1);
        }
    }

    public final void dispatchSurfaceDestroyed(Surface surface) {
        l<? super Surface, ab> lVar = this.onSurfaceDestroyed;
        if (lVar != null) {
            lVar.invoke(surface);
        }
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(null);
        }
    }

    public final af getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, q<? super Surface, ? super Integer, ? super Integer, ab> qVar) {
        this.onSurfaceChanged = qVar;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, l<? super Surface, ab> lVar) {
        this.onSurfaceDestroyed = lVar;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(s<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super e<? super ab>, ? extends Object> sVar) {
        this.onSurface = sVar;
    }
}
