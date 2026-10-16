package M0;

import E5.Q;
import androidx.lifecycle.InterfaceC1457v;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import t0.C4048M;
import t0.t;
import tf.p;

/* loaded from: classes.dex */
public final class k extends AbstractC3343n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7274i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C4048M f7275j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(C4048M c4048m, int i5) {
        super(2);
        this.f7274i = i5;
        this.f7275j = c4048m;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        int i5;
        switch (this.f7274i) {
            case 0:
                t set = (t) obj;
                Z.k it = (Z.k) obj2;
                AbstractC3340k.e(set, "$this$set");
                AbstractC3340k.e(it, "it");
                Object obj3 = this.f7275j.f45446a;
                AbstractC3340k.b(obj3);
                ((o) obj3).setModifier(it);
                return C2515C.f34653a;
            case 1:
                t set2 = (t) obj;
                L0.b it2 = (L0.b) obj2;
                AbstractC3340k.e(set2, "$this$set");
                AbstractC3340k.e(it2, "it");
                Object obj4 = this.f7275j.f45446a;
                AbstractC3340k.b(obj4);
                ((o) obj4).setDensity(it2);
                return C2515C.f34653a;
            case 2:
                t set3 = (t) obj;
                InterfaceC1457v it3 = (InterfaceC1457v) obj2;
                AbstractC3340k.e(set3, "$this$set");
                AbstractC3340k.e(it3, "it");
                Object obj5 = this.f7275j.f45446a;
                AbstractC3340k.b(obj5);
                ((o) obj5).setLifecycleOwner(it3);
                return C2515C.f34653a;
            case 3:
                t set4 = (t) obj;
                n3.f it4 = (n3.f) obj2;
                AbstractC3340k.e(set4, "$this$set");
                AbstractC3340k.e(it4, "it");
                Object obj6 = this.f7275j.f45446a;
                AbstractC3340k.b(obj6);
                ((o) obj6).setSavedStateRegistryOwner(it4);
                return C2515C.f34653a;
            case 4:
                t set5 = (t) obj;
                tf.l it5 = (tf.l) obj2;
                AbstractC3340k.e(set5, "$this$set");
                AbstractC3340k.e(it5, "it");
                Object obj7 = this.f7275j.f45446a;
                AbstractC3340k.b(obj7);
                ((o) obj7).setUpdateBlock(it5);
                return C2515C.f34653a;
            default:
                t set6 = (t) obj;
                L0.i it6 = (L0.i) obj2;
                AbstractC3340k.e(set6, "$this$set");
                AbstractC3340k.e(it6, "it");
                Object obj8 = this.f7275j.f45446a;
                AbstractC3340k.b(obj8);
                o oVar = (o) obj8;
                int iOrdinal = it6.ordinal();
                if (iOrdinal != 0) {
                    i5 = 1;
                    if (iOrdinal != 1) {
                        throw new Q((byte) 0, 9);
                    }
                } else {
                    i5 = 0;
                }
                oVar.setLayoutDirection(i5);
                return C2515C.f34653a;
        }
    }
}
