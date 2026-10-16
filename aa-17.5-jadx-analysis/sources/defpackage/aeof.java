package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeof extends aeol implements Iterator, aety {
    final /* synthetic */ aeop a;
    private final aeoj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeof(aeop aeopVar) {
        super(aeopVar);
        this.a = aeopVar;
        this.h = new aeoj(aeopVar);
    }

    @Override // defpackage.aeol
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        Consumer consumerM39m = a$$ExternalSyntheticApiModelOutline3.m39m(obj);
        aeoj aeojVar = this.h;
        aeojVar.a = i;
        consumerM39m.accept(aeojVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aeoj aeojVar = this.h;
        aeojVar.a = b();
        return aeojVar;
    }
}
