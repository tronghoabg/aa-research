package u0;

import android.content.res.Configuration;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import x0.C4437g;

/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4186m extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final C4186m f46255j = new C4186m(1, 0);
    public static final C4186m k = new C4186m(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C4186m f46256l = new C4186m(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46257i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4186m(int i5, int i10) {
        super(i5);
        this.f46257i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f46257i) {
            case 0:
                Configuration it = (Configuration) obj;
                AbstractC3340k.e(it, "it");
                return C2515C.f34653a;
            case 1:
                C4437g $receiver = (C4437g) obj;
                AbstractC3340k.e($receiver, "$this$$receiver");
                return C2515C.f34653a;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                AbstractC3340k.e(null, "$this$null");
                return C2515C.f34653a;
        }
    }
}
