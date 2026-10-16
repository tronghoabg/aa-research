package defpackage;

import android.content.Context;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class ycg implements BiConsumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ycg(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            ((yfl) obj).i(obj2);
            return;
        }
        if (i == 1) {
            ldw.g((Context) obj, (lbk) obj2);
        } else if (i != 2) {
            ((oct) obj).n((ylp) obj2);
        } else {
            ((ygp) obj).c(obj2);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
