package re;

import ae.f;
import ce.InterfaceC1606a;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: re.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC3978b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3979c f44804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f44805c;

    public /* synthetic */ RunnableC3978b(C3979c c3979c, f fVar, int i5) {
        this.f44803a = i5;
        this.f44804b = c3979c;
        this.f44805c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44803a) {
            case 0:
                C3979c this$0 = this.f44804b;
                AbstractC3340k.e(this$0, "this$0");
                f fVar = this.f44805c;
                InterfaceC1606a interfaceC1606a = (InterfaceC1606a) this$0.f44806a.get();
                if (interfaceC1606a != null) {
                    interfaceC1606a.f(fVar);
                    break;
                }
                break;
            case 1:
                C3979c this$02 = this.f44804b;
                AbstractC3340k.e(this$02, "this$0");
                f fVar2 = this.f44805c;
                InterfaceC1606a interfaceC1606a2 = (InterfaceC1606a) this$02.f44806a.get();
                if (interfaceC1606a2 != null) {
                    interfaceC1606a2.e(fVar2);
                    break;
                }
                break;
            default:
                C3979c this$03 = this.f44804b;
                AbstractC3340k.e(this$03, "this$0");
                f fVar3 = this.f44805c;
                InterfaceC1606a interfaceC1606a3 = (InterfaceC1606a) this$03.f44806a.get();
                if (interfaceC1606a3 != null) {
                    interfaceC1606a3.b(fVar3);
                    break;
                }
                break;
        }
    }
}
