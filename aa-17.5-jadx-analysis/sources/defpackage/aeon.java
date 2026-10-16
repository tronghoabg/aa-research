package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeon extends aeol implements Iterator, aety {
    final /* synthetic */ aeop a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeon(aeop aeopVar) {
        super(aeopVar);
        this.a = aeopVar;
    }

    @Override // defpackage.aeol
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
