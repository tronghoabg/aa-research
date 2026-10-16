package i0;

import android.graphics.PathMeasure;
import e0.C2455g;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: i0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2827e extends AbstractC3343n implements tf.a {

    /* renamed from: j, reason: collision with root package name */
    public static final C2827e f36618j = new C2827e(0, 0);
    public static final C2827e k = new C2827e(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C2827e f36619l = new C2827e(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f36620i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2827e(int i5, int i10) {
        super(i5);
        this.f36620i = i10;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f36620i) {
            case 0:
                return new C2455g(new PathMeasure());
            case 1:
                return C2515C.f34653a;
            case 2:
                return new C2823a();
            default:
                return new C2828f();
        }
    }
}
