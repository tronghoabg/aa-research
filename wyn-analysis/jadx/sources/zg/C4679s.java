package zg;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: zg.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4679s extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48638i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4664c f48639j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4679s(InterfaceC4664c interfaceC4664c, int i5) {
        super(1);
        this.f48638i = i5;
        this.f48639j = interfaceC4664c;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f48638i) {
            case 0:
                this.f48639j.cancel();
                break;
            default:
                this.f48639j.cancel();
                break;
        }
        return C2515C.f34653a;
    }
}
