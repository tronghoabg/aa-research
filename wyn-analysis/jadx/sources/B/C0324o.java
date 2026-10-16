package B;

import android.view.KeyEvent;
import d0.C2384c;
import ef.C2515C;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3343n;
import n0.C3563b;

/* renamed from: B.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324o extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1451i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1452j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0324o(int i5, Object obj, boolean z2) {
        super(1);
        this.f1451i = i5;
        this.f1452j = z2;
        this.k = obj;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        int iA;
        Object obj2 = this.k;
        boolean z2 = this.f1452j;
        switch (this.f1451i) {
            case 0:
                long j8 = ((C2384c) obj).f33935a;
                if (z2) {
                    ((tf.a) ((N.V) obj2).getValue()).invoke();
                }
                return C2515C.f34653a;
            default:
                KeyEvent keyEvent = ((C3563b) obj).f40751a;
                boolean z10 = false;
                if (z2) {
                    int i5 = AbstractC0329u.f1484b;
                    int action = keyEvent.getAction();
                    if ((action != 0 ? action != 1 ? (char) 0 : (char) 1 : (char) 2) == 1 && ((iA = (int) (AbstractC3230e0.a(keyEvent.getKeyCode()) >> 32)) == 23 || iA == 66 || iA == 160)) {
                        ((tf.a) obj2).invoke();
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
