package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class xbd implements Consumer {
    public final /* synthetic */ xbo a;
    public final /* synthetic */ kqb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xbd(xbo xboVar, kqb kqbVar, boolean z) {
        this.a = xboVar;
        this.b = kqbVar;
        this.c = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        kqb kqbVar = this.b;
        xbo xboVar = this.a;
        kqbVar.l(xboVar);
        xboVar.u(new xbg(xboVar, (yfq) obj, this.c));
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
