package A0;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class d extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f204i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f205j;
    public final /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f206l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i5) {
        super(0);
        this.f204i = i5;
        this.f205j = obj;
        this.k = obj2;
        this.f206l = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Type inference failed for: r0v3, types: [ef.i, java.lang.Object] */
    @Override // tf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.f204i
            switch(r0) {
                case 0: goto L37;
                case 1: goto L25;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f205j
            u0.a r0 = (u0.AbstractC4162a) r0
            java.lang.Object r1 = r5.k
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T) r1
            r0.removeOnAttachStateChangeListener(r1)
            java.lang.Object r1 = r5.f206l
            u0.V r1 = (u0.V) r1
            java.lang.String r2 = "listener"
            kotlin.jvm.internal.AbstractC3340k.e(r1, r2)
            r1.a r0 = android.support.v4.media.session.b.g0(r0)
            java.util.ArrayList r0 = r0.f44318a
            r0.remove(r1)
            ef.C r0 = ef.C2515C.f34653a
            return r0
        L25:
            java.lang.Object r0 = r5.f205j
            androidx.fragment.app.m r0 = (androidx.fragment.app.C1424m) r0
            androidx.fragment.app.v0 r0 = r0.f18486f
            java.lang.Object r1 = r5.k
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Object r2 = r5.f206l
            r0.c(r1, r2)
            ef.C r0 = ef.C2515C.f34653a
            return r0
        L37:
            java.lang.Object r0 = r5.f205j
            Dd.c r0 = (Dd.c) r0
            java.lang.Object r0 = r0.f2642b
            java.lang.Object r0 = r0.getValue()
            android.text.BoringLayout$Metrics r0 = (android.text.BoringLayout.Metrics) r0
            java.lang.Object r1 = r5.f206l
            android.text.TextPaint r1 = (android.text.TextPaint) r1
            java.lang.Object r2 = r5.k
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r0 == 0) goto L51
            int r0 = r0.width
            float r0 = (float) r0
            goto L5a
        L51:
            int r0 = r2.length()
            r3 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r3, r0, r1)
        L5a:
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L98
        L60:
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L98
            float r1 = r1.getLetterSpacing()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L95
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r2, r1)
            int r1 = r2.length()
            r3 = -1
            java.lang.Class<C0.d> r4 = C0.d.class
            int r1 = r2.nextSpanTransition(r3, r1, r4)
            int r4 = r2.length()
            if (r1 == r4) goto L85
            goto L95
        L85:
            int r1 = r2.length()
            java.lang.Class<C0.c> r4 = C0.c.class
            int r1 = r2.nextSpanTransition(r3, r1, r4)
            int r2 = r2.length()
            if (r1 == r2) goto L98
        L95:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L98:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.d.invoke():java.lang.Object");
    }
}
