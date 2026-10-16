package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aevj extends aevp implements Iterator, aety {
    final /* synthetic */ aevt a;
    private final aevn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aevj(aevt aevtVar) {
        super(aevtVar);
        this.a = aevtVar;
        this.h = new aevn(aevtVar);
    }

    @Override // defpackage.aevp
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aevn aevnVar = this.h;
        aevnVar.a = i;
        consumerM39m.accept(aevnVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aevn aevnVar = this.h;
        aevnVar.a = b();
        return aevnVar;
    }
}
