package com.waze.settings.tree.d;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.bk;
import com.waze.settings.de;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends com.waze.settings.tree.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, com.waze.ui.ac.n nVar, List list) {
        super(str, bk.f36872b, null, nVar, com.waze.settings.tree.c.f37530a, list);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(list, "settings");
        this.f37553a = true;
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final void c() {
        this.f37553a = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[EDGE_INSN: B:23:0x0031->B:15:0x0031 BREAK  A[LOOP:0: B:8:0x001a->B:24:?]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // com.waze.settings.tree.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z() {
        /*
            r4 = this;
            java.util.List r0 = r4.i()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L2d
        L16:
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            com.waze.settings.tree.f r1 = (com.waze.settings.tree.f) r1
            boolean r1 = r1.z()
            if (r1 == 0) goto L1a
            goto L31
        L2d:
            boolean r0 = r4.f37553a
            if (r0 == 0) goto L33
        L31:
            r0 = r3
            goto L34
        L33:
            r0 = r2
        L34:
            boolean r4 = super.z()
            if (r4 == 0) goto L3d
            if (r0 == 0) goto L3d
            return r3
        L3d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.tree.d.m.z():boolean");
    }
}
