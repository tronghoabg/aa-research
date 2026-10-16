package defpackage;

import android.graphics.RenderNode;

/* loaded from: classes.dex */
final class all extends cwe implements cwk {
    private final aiu a;
    private final ajr b;
    private RenderNode c;

    public all(cwd cwdVar, aiu aiuVar, ajr ajrVar) {
        this.a = aiuVar;
        this.b = ajrVar;
        W(cwdVar);
    }

    private final RenderNode d() {
        RenderNode renderNode = this.c;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.c = renderNode2;
        return renderNode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01c1 A[PHI: r18
  0x01c1: PHI (r18v2 boolean) = (r18v1 boolean), (r18v11 boolean) binds: [B:77:0x018e, B:85:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.cwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.cxd r25) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.all.b(cxd):void");
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}
