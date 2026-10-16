package androidx.core.view;

import android.view.View;
import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.p;
import h.m.j;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ViewKt$allViews$1 extends f implements p<j<? super View>, e<? super ab>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewKt$allViews$1(View view, e<? super ViewKt$allViews$1> eVar) {
        super(2, eVar);
        this.$this_allViews = view;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, eVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // h.g.a.p
    public final Object invoke(j<? super View> jVar, e<? super ab> eVar) {
        return ((ViewKt$allViews$1) create(jVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r5 == r0) goto L21;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r6)
            goto L5a
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L18:
            java.lang.Object r1 = r5.L$0
            h.m.j r1 = (h.m.j) r1
            e.b.c.b(r6)
            goto L37
        L20:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            h.m.j r1 = (h.m.j) r1
            android.view.View r6 = r5.$this_allViews
            r4 = r5
            h.c.e r4 = (h.c.e) r4
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r1.a(r6, r4)
            if (r6 == r0) goto L5d
        L37:
            android.view.View r6 = r5.$this_allViews
            boolean r3 = r6 instanceof android.view.ViewGroup
            if (r3 == 0) goto L5a
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            h.m.h r6 = androidx.core.view.ViewGroupKt.getDescendants(r6)
            r3 = r5
            h.c.e r3 = (h.c.e) r3
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.util.Iterator r5 = r6.iterator()
            java.lang.Object r5 = r1.b(r5, r3)
            if (r5 == r0) goto L57
            h.ab r5 = h.ab.f48028a
        L57:
            if (r5 != r0) goto L5a
            goto L5d
        L5a:
            h.ab r5 = h.ab.f48028a
            return r5
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
