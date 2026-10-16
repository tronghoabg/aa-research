package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aetd extends aeti implements Iterator, aety {
    final /* synthetic */ aetl a;
    private final aetg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetd(aetl aetlVar) {
        super(aetlVar);
        this.a = aetlVar;
        this.h = new aetg(aetlVar, 0, (byte[]) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aeti
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        aetg aetgVar = this.h;
        aetgVar.a = i;
        obj.accept(aetgVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.c(consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aetg aetgVar = this.h;
        aetgVar.a = b();
        return aetgVar;
    }
}
