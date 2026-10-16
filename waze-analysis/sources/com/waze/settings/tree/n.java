package com.waze.settings.tree;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import com.waze.settings.bk;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class n extends g {

    /* renamed from: a, reason: collision with root package name */
    private String f37579a;

    /* renamed from: b, reason: collision with root package name */
    private int f37580b;

    /* renamed from: c, reason: collision with root package name */
    private int f37581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2, com.waze.ui.ac.n nVar, d dVar, bk bkVar, List list) {
        super(str, bkVar, str2, nVar, dVar, list);
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(dVar, "iconSource");
        h.g.b.x.f(bkVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f37580b = R.string.ON;
        this.f37581c = R.string.OFF;
    }

    public final void C(String str) {
        this.f37579a = str;
    }

    public final void D(String str, int i2, int i3) {
        this.f37579a = str;
        this.f37580b = i2;
        this.f37581c = i3;
    }

    public final String g() {
        Object next;
        if (this.f37579a != null) {
            Iterator it = i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (h.g.b.x.n(((f) next).s(), this.f37579a)) {
                    break;
                }
            }
            f fVar = (f) next;
            if (fVar instanceof m) {
                com.waze.settings.tree.d.g gVarE = ((m) fVar).e();
                if (gVarE != null) {
                    return gVarE.t();
                }
            } else {
                if (fVar instanceof com.waze.settings.tree.d.s) {
                    return com.waze.shared_infra.o.b.a().c(((com.waze.settings.tree.d.s) fVar).B().Q() ? this.f37580b : this.f37581c, new Object[0]);
                }
                if (fVar instanceof com.waze.settings.tree.d.k) {
                    return ((com.waze.settings.tree.d.k) fVar).d().b();
                }
            }
        }
        return null;
    }
}
