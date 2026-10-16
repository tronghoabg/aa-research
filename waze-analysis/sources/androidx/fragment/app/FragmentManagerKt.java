package androidx.fragment.app;

import android.support.v4.app.bv;
import android.support.v4.app.ch;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentManagerKt {
    public static final void commit(bv bvVar, boolean z, l<? super ch, ab> lVar) {
        x.f(bvVar, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        ch chVarU = bvVar.u();
        x.e(chVarU, "beginTransaction(...)");
        lVar.invoke(chVarU);
        if (z) {
            chVarU.l();
        } else {
            chVarU.a();
        }
    }

    public static /* synthetic */ void commit$default(bv bvVar, boolean z, l lVar, int i2, Object obj) {
        x.f(bvVar, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        ch chVarU = bvVar.u();
        x.e(chVarU, "beginTransaction(...)");
        lVar.invoke(chVarU);
        if (((z ? 1 : 0) & ((i2 & 1) ^ 1)) != 0) {
            chVarU.l();
        } else {
            chVarU.a();
        }
    }

    public static final void commitNow(bv bvVar, boolean z, l<? super ch, ab> lVar) {
        x.f(bvVar, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        ch chVarU = bvVar.u();
        x.e(chVarU, "beginTransaction(...)");
        lVar.invoke(chVarU);
        if (z) {
            chVarU.g();
        } else {
            chVarU.f();
        }
    }

    public static /* synthetic */ void commitNow$default(bv bvVar, boolean z, l lVar, int i2, Object obj) {
        x.f(bvVar, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        ch chVarU = bvVar.u();
        x.e(chVarU, "beginTransaction(...)");
        lVar.invoke(chVarU);
        if (((z ? 1 : 0) & ((i2 & 1) ^ 1)) != 0) {
            chVarU.g();
        } else {
            chVarU.f();
        }
    }

    public static final void transaction(bv bvVar, boolean z, boolean z2, l<? super ch, ab> lVar) {
        x.f(bvVar, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        ch chVarU = bvVar.u();
        x.e(chVarU, "beginTransaction(...)");
        lVar.invoke(chVarU);
        if (z) {
            if (z2) {
                chVarU.g();
                return;
            } else {
                chVarU.f();
                return;
            }
        }
        if (z2) {
            chVarU.l();
        } else {
            chVarU.a();
        }
    }

    public static /* synthetic */ void transaction$default(bv bvVar, boolean z, boolean z2, l lVar, int i2, Object obj) {
        x.f(bvVar, "<this>");
        x.f(lVar, TtmlNode.TAG_BODY);
        ch chVarU = bvVar.u();
        x.e(chVarU, "beginTransaction(...)");
        lVar.invoke(chVarU);
        boolean z3 = z2 & ((i2 & 2) == 0);
        if (((z ? 1 : 0) & ((i2 & 1) ^ 1)) != 0) {
            if (z3) {
                chVarU.g();
                return;
            } else {
                chVarU.f();
                return;
            }
        }
        if (z3) {
            chVarU.l();
        } else {
            chVarU.a();
        }
    }
}
