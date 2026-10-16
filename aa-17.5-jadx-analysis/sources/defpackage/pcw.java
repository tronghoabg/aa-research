package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class pcw implements BiConsumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pcw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((ycl) this.a).a((Enum) obj, obj2);
                return;
            } else {
                ((kyw) this.a).S((Throwable) obj, (ywj) obj2);
                return;
            }
        }
        yph yphVar = pdh.a;
        ((StringBuilder) this.a).append("callback: " + String.valueOf((pdd) obj) + " " + String.valueOf((pdf) obj2));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
