package M0;

import android.view.View;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class f extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7245i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f7246j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(o oVar, int i5) {
        super(0);
        this.f7245i = i5;
        this.f7246j = oVar;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f7245i) {
            case 0:
                o oVar = this.f7246j;
                if (oVar.f7253d) {
                    oVar.k.c(oVar, oVar.f7260l, oVar.getUpdate());
                }
                break;
            default:
                o oVar2 = this.f7246j;
                View typedView$ui_release = oVar2.getTypedView$ui_release();
                if (typedView$ui_release != null) {
                    oVar2.getUpdateBlock().invoke(typedView$ui_release);
                }
                break;
        }
        return C2515C.f34653a;
    }
}
