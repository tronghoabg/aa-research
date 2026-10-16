package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aewu extends aewz implements Iterator, aety {
    final /* synthetic */ aexc a;
    private final aewx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewu(aexc aexcVar) {
        super(aexcVar);
        this.a = aexcVar;
        this.h = new aewx(aexcVar, 0, (byte[]) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aewz
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        aewx aewxVar = this.h;
        aewxVar.a = i;
        obj.accept(aewxVar);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.c(consumer);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aewx aewxVar = this.h;
        aewxVar.a = b();
        return aewxVar;
    }
}
