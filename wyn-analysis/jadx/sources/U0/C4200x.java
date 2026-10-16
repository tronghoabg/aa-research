package u0;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: u0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4200x extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C4188n f46407i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D f46408j;
    public final /* synthetic */ V.d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4200x(C4188n c4188n, D d3, V.d dVar, int i5) {
        super(2);
        this.f46407i = c4188n;
        this.f46408j = d3;
        this.k = dVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C0740o c0740o = (C0740o) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c0740o.x()) {
            c0740o.I();
        } else {
            M.a(this.f46407i, this.f46408j, this.k, c0740o, 72);
        }
        return C2515C.f34653a;
    }
}
