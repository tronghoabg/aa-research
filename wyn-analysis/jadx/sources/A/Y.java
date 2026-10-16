package A;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class Y extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U f97j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(U u10, int i5) {
        super(1);
        this.f96i = i5;
        this.f97j = u10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f96i) {
            case 0:
                N.C DisposableEffect = (N.C) obj;
                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                return new X(this.f97j, 0);
            default:
                return Boolean.valueOf(!AbstractC3340k.a(obj, this.f97j.f81c.getValue()));
        }
    }
}
