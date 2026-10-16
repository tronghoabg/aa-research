package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aevk extends aevp implements Iterator, aety {
    final /* synthetic */ aevt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aevk(aevt aevtVar) {
        super(aevtVar);
        this.a = aevtVar;
    }

    @Override // defpackage.aevp
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        a$$ExternalSyntheticApiModelOutline3.m39m(obj).accept(this.a.a[i]);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.forEachRemaining((Object) consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.a[b()];
    }
}
