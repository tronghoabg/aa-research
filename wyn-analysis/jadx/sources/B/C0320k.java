package B;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: B.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320k extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1438i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N.V f1439j;
    public final /* synthetic */ D.i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0320k(N.V v2, D.i iVar, int i5) {
        super(1);
        this.f1438i = i5;
        this.f1439j = v2;
        this.k = iVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f1438i) {
            case 0:
                N.C DisposableEffect = (N.C) obj;
                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                return new C0319j(this.f1439j, this.k, 0);
            case 1:
                N.C DisposableEffect2 = (N.C) obj;
                AbstractC3340k.e(DisposableEffect2, "$this$DisposableEffect");
                return new C0319j(this.f1439j, this.k, 1);
            default:
                N.C DisposableEffect3 = (N.C) obj;
                AbstractC3340k.e(DisposableEffect3, "$this$DisposableEffect");
                return new C0319j(this.f1439j, this.k, 2);
        }
    }
}
