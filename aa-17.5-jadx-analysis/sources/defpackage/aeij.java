package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeij extends aeip implements Iterator, aety {
    final /* synthetic */ aeit a;
    private final aein h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeij(aeit aeitVar) {
        super(aeitVar);
        this.a = aeitVar;
        this.h = new aein(aeitVar);
    }

    @Override // defpackage.aeip
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aein aeinVar = this.h;
        aeinVar.a = i;
        consumerM39m.accept(aeinVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aein aeinVar = this.h;
        aeinVar.a = b();
        return aeinVar;
    }
}
