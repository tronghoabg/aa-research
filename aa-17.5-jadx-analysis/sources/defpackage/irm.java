package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class irm implements Consumer {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ irm(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((irt) obj).p.b(this.a);
            return;
        }
        if (i != 1) {
            ((irt) obj).f = this.a;
        } else {
            yph yphVar = imj.a;
            rrb rrbVarH = rrc.h(yxy.FRX, yzz.PREFLIGHT, yzy.uo);
            rrbVarH.k(this.a);
            ((jfg) obj).b(rrbVarH.l());
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
