package X;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: X.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268a extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15682i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tf.l f15683j;
    public final /* synthetic */ tf.l k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1268a(tf.l lVar, tf.l lVar2, int i5) {
        super(1);
        this.f15682i = i5;
        this.f15683j = lVar;
        this.k = lVar2;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        int i5;
        switch (this.f15682i) {
            case 0:
                k kVar = (k) obj;
                synchronized (m.f15718b) {
                    i5 = m.f15720d;
                    m.f15720d = i5 + 1;
                }
                return new C1270c(i5, kVar, this.f15683j, this.k);
            case 1:
                this.f15683j.invoke(obj);
                this.k.invoke(obj);
                return C2515C.f34653a;
            default:
                this.f15683j.invoke(obj);
                this.k.invoke(obj);
                return C2515C.f34653a;
        }
    }
}
