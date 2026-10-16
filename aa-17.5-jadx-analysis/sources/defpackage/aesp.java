package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aesp extends aess implements Iterator, aeui {
    final /* synthetic */ aesu a;
    final aetg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesp(aesu aesuVar) {
        super(aesuVar);
        this.a = aesuVar;
        this.b = new aetg(aesuVar, 1, (byte[]) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aess
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        aetg aetgVar = this.b;
        aetgVar.a = i;
        obj.accept(aetgVar);
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        aess.f();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aetg next() {
        aetg aetgVar = this.b;
        aetgVar.a = c();
        return aetgVar;
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        super.e(consumer);
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* bridge */ /* synthetic */ Object previous() {
        aetg aetgVar = this.b;
        aetgVar.a = d();
        return aetgVar;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        aess.g();
    }
}
