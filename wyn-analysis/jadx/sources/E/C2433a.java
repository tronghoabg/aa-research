package e;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import tf.p;
import vf.AbstractC4345a;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2433a extends AbstractC3343n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f34319i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tf.a f34320j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2433a(boolean z2, tf.a aVar, int i5) {
        super(2);
        this.f34319i = z2;
        this.f34320j = aVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC4345a.a(this.f34319i, this.f34320j, (C0740o) obj, 1);
        return C2515C.f34653a;
    }
}
