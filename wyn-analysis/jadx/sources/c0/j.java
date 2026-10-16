package c0;

import N.C0718d;
import N.C0732k;
import N.C0740o;
import a2.v;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class j extends AbstractC3343n implements tf.q {

    /* renamed from: i, reason: collision with root package name */
    public static final j f19513i = new j(3);

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Z.k composed = (Z.k) obj;
        C0740o c0740o = (C0740o) obj2;
        ((Number) obj3).intValue();
        AbstractC3340k.e(composed, "$this$composed");
        c0740o.M(-326009031);
        c0740o.M(-492369756);
        Object objF = c0740o.F();
        if (objF == C0732k.f7800a) {
            objF = new C1542g();
            c0740o.U(objF);
        }
        c0740o.p(false);
        C1542g focusModifier = (C1542g) objF;
        C0718d.g(new C1544i(focusModifier, 0), c0740o);
        v vVar = k.f19514a;
        AbstractC3340k.e(focusModifier, "focusModifier");
        Z.k kVarG = composed.g(focusModifier).g(k.f19515b);
        c0740o.p(false);
        return kVarG;
    }
}
