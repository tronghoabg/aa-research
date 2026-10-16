package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class irn implements Consumer {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ irn(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            irt irtVar = (irt) obj;
            isc iscVar = irtVar.n;
            long j = this.a;
            iscVar.b(j);
            irtVar.w.c(j, 1);
            return;
        }
        if (i == 1) {
            ((irt) obj).o.b(this.a);
            return;
        }
        irt irtVar2 = (irt) obj;
        isc iscVar2 = irtVar2.m;
        long j2 = this.a;
        iscVar2.b(j2);
        irtVar2.v.c(j2, 1);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
