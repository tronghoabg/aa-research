package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class v implements z2 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ w c;
    public final /* synthetic */ Predicate d;

    public v(w wVar, Predicate predicate) {
        this.c = wVar;
        this.d = predicate;
        this.b = !wVar.b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        w wVar = this.c;
        if (zTest == wVar.a) {
            this.a = true;
            this.b = wVar.b;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.z2
    public final boolean s() {
        return this.a;
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }

    @Override // j$.util.stream.z2
    public final /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // j$.util.stream.z2
    public final void p(long j) {
    }

    @Override // j$.util.stream.z2
    public final void end() {
    }
}
