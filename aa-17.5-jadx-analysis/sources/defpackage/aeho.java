package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeho extends aehu implements Iterator, aety {
    final /* synthetic */ aehy a;
    private final aehs h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeho(aehy aehyVar) {
        super(aehyVar);
        this.a = aehyVar;
        this.h = new aehs(aehyVar, 0, (byte[]) null);
    }

    @Override // defpackage.aehu
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aehs aehsVar = this.h;
        aehsVar.a = i;
        consumerM39m.accept(aehsVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aehs aehsVar = this.h;
        aehsVar.a = b();
        return aehsVar;
    }
}
