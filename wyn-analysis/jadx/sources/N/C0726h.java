package N;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: N.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726h extends AbstractC3343n implements tf.p {

    /* renamed from: j, reason: collision with root package name */
    public static final C0726h f7779j = new C0726h(2, 0);
    public static final C0726h k = new C0726h(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7780i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0726h(int i5, int i10) {
        super(i5);
        this.f7780i = i10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7780i) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o.x()) {
                    c0740o.I();
                }
                break;
            default:
                C0740o c0740o2 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o2.x()) {
                    c0740o2.I();
                }
                break;
        }
        return C2515C.f34653a;
    }
}
