package defpackage;

import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class nxt implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ nxt(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((ype) nxu.a.l().ai(5538)).y("movingToState: %s", (nxs) obj);
            return;
        }
        if (i == 1) {
            ((ype) ((ype) irg.a.f()).ai((char) 1238)).u("clearUsageAssistantFocusLoss");
            irg irgVar = (irg) ((izj) obj).a;
            irgVar.f = 0;
            irgVar.a(null);
            return;
        }
        if (i == 2) {
            return;
        }
        if (i == 3) {
        } else if (i != 4) {
            ((Map) obj).clear();
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
