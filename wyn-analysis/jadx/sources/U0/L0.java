package u0;

import N.C0718d;
import N.C0725g0;
import N.C0740o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.wynauto.wyn.R;
import ef.C2515C;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3343n;
import uf.InterfaceC4291a;
import uf.InterfaceC4296f;

/* loaded from: classes.dex */
public final class L0 extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46137i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M0 f46138j;
    public final /* synthetic */ V.d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(M0 m02, V.d dVar, int i5) {
        super(2);
        this.f46137i = i5;
        this.f46138j = m02;
        this.k = dVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2515C c2515c = C2515C.f34653a;
        V.d dVar = this.k;
        M0 m02 = this.f46138j;
        int i5 = 0;
        switch (this.f46137i) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0740o.x()) {
                    AndroidCompositionLocals_androidKt.a(m02.f46155a, dVar, c0740o, 8);
                    break;
                } else {
                    c0740o.I();
                    break;
                }
            default:
                C0740o c0740o2 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0740o2.x()) {
                    Object tag = m02.f46155a.getTag(R.id.inspection_slot_table_set);
                    Set set = (tag instanceof Set) && (!(tag instanceof InterfaceC4291a) || (tag instanceof InterfaceC4296f)) ? (Set) tag : null;
                    C4188n c4188n = m02.f46155a;
                    if (set == null) {
                        Object parent = c4188n.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC4291a) && !(tag2 instanceof InterfaceC4296f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0740o2.f7847c);
                        c0740o2.f7859p = true;
                        c0740o2.f7831B = true;
                        c0740o2.f7847c.c();
                        c0740o2.f7836G.c();
                        N.y0 y0Var = c0740o2.f7837H;
                        N.w0 w0Var = y0Var.f7966a;
                        y0Var.f7970e = w0Var.f7952i;
                        y0Var.f7971f = w0Var.f7953j;
                    }
                    C0718d.d(c0740o2, c4188n, new J0(m02, null));
                    C0718d.d(c0740o2, c4188n, new K0(m02, null));
                    C0718d.a(new C0725g0[]{Y.b.f16299a.a(set)}, V.e.b(c0740o2, -1193460702, new L0(m02, dVar, i5)), c0740o2, 56);
                    break;
                } else {
                    c0740o2.I();
                    break;
                }
                break;
        }
        return c2515c;
    }
}
