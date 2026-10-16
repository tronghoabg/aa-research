package b0;

import e0.C2439B;
import e0.InterfaceC2442E;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

/* loaded from: classes.dex */
public final class i extends AbstractC3343n implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f19116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2442E f19117j;
    public final /* synthetic */ long k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f19118l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(float f10, InterfaceC2442E interfaceC2442E, long j8, long j10) {
        super(1);
        this.f19116i = f10;
        this.f19117j = interfaceC2442E;
        this.k = j8;
        this.f19118l = j10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C2439B graphicsLayer = (C2439B) obj;
        AbstractC3340k.e(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.f34328d = graphicsLayer.k.b() * this.f19116i;
        InterfaceC2442E interfaceC2442E = this.f19117j;
        AbstractC3340k.e(interfaceC2442E, "<set-?>");
        graphicsLayer.f34333i = interfaceC2442E;
        graphicsLayer.f34334j = false;
        graphicsLayer.f34329e = this.k;
        graphicsLayer.f34330f = this.f19118l;
        return C2515C.f34653a;
    }
}
