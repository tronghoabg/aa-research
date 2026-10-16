package E;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import vf.AbstractC4345a;

/* renamed from: E.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418h extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public static final C0418h f2742i = new C0418h(2);

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        L0.i layoutDirection = (L0.i) obj2;
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        return Integer.valueOf(AbstractC4345a.H((1 + (layoutDirection != L0.i.f6806a ? (-1.0f) * (-1) : -1.0f)) * (iIntValue / 2.0f)));
    }
}
