package M;

import A.AbstractC0213f;
import A7.B0;
import B.Q;
import B.S;
import N.C0718d;
import N.C0732k;
import N.C0740o;
import N.V;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e0.C2465q;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class e implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7163a;

    /* renamed from: b, reason: collision with root package name */
    public final V f7164b;

    public e(boolean z2, V v2) {
        this.f7163a = z2;
        this.f7164b = v2;
    }

    @Override // B.Q
    public final S a(D.i interactionSource, C0740o c0740o) {
        View qVar;
        B0 b02;
        AbstractC3340k.e(interactionSource, "interactionSource");
        c0740o.M(988743187);
        t tVar = (t) c0740o.j(v.f7215a);
        c0740o.M(-1524341038);
        V v2 = this.f7164b;
        long jA = ((C2465q) v2.getValue()).f34382a != C2465q.f34380i ? ((C2465q) v2.getValue()).f34382a : tVar.a(c0740o);
        c0740o.p(false);
        V vI = C0718d.I(new C2465q(jA), c0740o);
        V vI2 = C0718d.I(tVar.b(c0740o), c0740o);
        c0740o.M(331259447);
        c0740o.M(-1737891121);
        Object objJ = c0740o.j(AndroidCompositionLocals_androidKt.f18016f);
        while (!(objJ instanceof ViewGroup)) {
            Object parent = ((View) objJ).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objJ + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            AbstractC3340k.d(parent, "parent");
            objJ = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objJ;
        c0740o.p(false);
        c0740o.M(1643267286);
        boolean zIsInEditMode = viewGroup.isInEditMode();
        Object obj = C0732k.f7800a;
        boolean z2 = this.f7163a;
        if (zIsInEditMode) {
            c0740o.M(-3686552);
            boolean zE = c0740o.e(interactionSource) | c0740o.e(this);
            Object objF = c0740o.F();
            if (zE || objF == obj) {
                objF = new c(z2, vI, vI2);
                c0740o.U(objF);
            }
            c0740o.p(false);
            b02 = (c) objF;
            c0740o.p(false);
            c0740o.p(false);
        } else {
            c0740o.p(false);
            int childCount = viewGroup.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    qVar = null;
                    break;
                }
                qVar = viewGroup.getChildAt(i5);
                if (qVar instanceof q) {
                    break;
                }
                i5++;
            }
            if (qVar == null) {
                Context context = viewGroup.getContext();
                AbstractC3340k.d(context, "view.context");
                qVar = new q(context);
                viewGroup.addView(qVar);
            }
            c0740o.M(-3686095);
            boolean zE2 = c0740o.e(interactionSource) | c0740o.e(this) | c0740o.e(qVar);
            Object objF2 = c0740o.F();
            if (zE2 || objF2 == obj) {
                objF2 = new C0711a(z2, vI, vI2, (q) qVar);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            b02 = (C0711a) objF2;
            c0740o.p(false);
        }
        C0718d.f(b02, interactionSource, new f(interactionSource, b02, null), c0740o);
        c0740o.p(false);
        return b02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7163a == eVar.f7163a && L0.d.a(Float.NaN, Float.NaN) && this.f7164b.equals(eVar.f7164b);
    }

    public final int hashCode() {
        return this.f7164b.hashCode() + AbstractC0213f.c(Float.NaN, (this.f7163a ? 1231 : 1237) * 31, 31);
    }
}
