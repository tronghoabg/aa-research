package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aehw extends aehu implements Iterator, aety {
    final /* synthetic */ aehy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehw(aehy aehyVar) {
        super(aehyVar);
        this.a = aehyVar;
    }

    @Override // defpackage.aehu
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m39m(obj).accept(this.a.b[i]);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b[b()];
    }
}
