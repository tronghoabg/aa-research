package H0;

import E0.f;
import E0.j;
import E0.k;
import E0.l;
import E0.o;
import N.C0740o;
import android.graphics.Typeface;
import ef.C2515C;
import i0.C2826d;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.r;

/* loaded from: classes.dex */
public final class b extends AbstractC3343n implements r {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4854i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i5) {
        super(4);
        this.f4854i = i5;
        this.f4855j = obj;
    }

    @Override // tf.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f4854i) {
            case 0:
                l fontWeight = (l) obj2;
                int i5 = ((j) obj3).f2794a;
                int i10 = ((k) obj4).f2795a;
                AbstractC3340k.e(fontWeight, "fontWeight");
                c cVar = (c) this.f4855j;
                e eVar = new e(((f) cVar.f4860e).b((o) obj, fontWeight, i5, i10));
                cVar.f4865j.add(eVar);
                return (Typeface) eVar.f4869b;
            default:
                ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                C0740o c0740o = (C0740o) obj3;
                if ((((Number) obj4).intValue() & 11) == 2 && c0740o.x()) {
                    c0740o.I();
                } else {
                    ic.d.b(((C2826d) this.f4855j).f36614f, null, c0740o, 0, 2);
                }
                return C2515C.f34653a;
        }
    }
}
