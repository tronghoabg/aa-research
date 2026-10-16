package u0;

import N.C0740o;
import android.graphics.Matrix;
import android.view.View;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class J extends AbstractC3343n implements tf.p {

    /* renamed from: j, reason: collision with root package name */
    public static final J f46126j = new J(2, 0);
    public static final J k = new J(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final J f46127l = new J(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(int i5, int i10) {
        super(i5);
        this.f46128i = i10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46128i) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0740o.x()) {
                    c0740o.I();
                }
                break;
            case 1:
                N rn = (N) obj;
                Matrix matrix = (Matrix) obj2;
                AbstractC3340k.e(rn, "rn");
                AbstractC3340k.e(matrix, "matrix");
                rn.u(matrix);
                break;
            default:
                View view = (View) obj;
                Matrix matrix2 = (Matrix) obj2;
                AbstractC3340k.e(view, "view");
                AbstractC3340k.e(matrix2, "matrix");
                matrix2.set(view.getMatrix());
                break;
        }
        return C2515C.f34653a;
    }
}
