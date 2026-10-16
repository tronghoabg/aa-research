package defpackage;

import j$.util.Iterator;
import java.util.AbstractCollection;

/* loaded from: classes3.dex */
final class aerj extends aeua implements Iterator {
    final /* synthetic */ AbstractCollection a;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aerj(AbstractCollection abstractCollection, int i, int i2) {
        super(i);
        this.d = i2;
        this.a = abstractCollection;
    }

    @Override // defpackage.aetz
    protected final int a() {
        int i;
        int i2;
        int i3 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i3 != 0) {
            aequ aequVar = (aequ) abstractCollection;
            i = aequVar.c;
            i2 = aequVar.b;
        } else {
            aerk aerkVar = (aerk) abstractCollection;
            i = aerkVar.c;
            i2 = aerkVar.b;
        }
        return i - i2;
    }

    @Override // defpackage.aetz
    protected final Object b(int i) {
        int i2 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            aequ aequVar = (aequ) abstractCollection;
            return aequVar.a.get(aequVar.b + i);
        }
        aerk aerkVar = (aerk) abstractCollection;
        return aerkVar.a.get(aerkVar.b + i);
    }

    @Override // defpackage.aeua
    protected final void c(int i, Object obj) {
        int i2 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            ((aeqv) abstractCollection).add(i, obj);
        } else {
            ((aerl) abstractCollection).add(i, obj);
        }
    }

    @Override // defpackage.aetz
    protected final void d(int i) {
        int i2 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            ((aeqv) abstractCollection).remove(i);
        } else {
            ((aerl) abstractCollection).remove(i);
        }
    }

    @Override // defpackage.aeua
    protected final void e(int i, Object obj) {
        int i2 = this.d;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            ((aeqv) abstractCollection).set(i, obj);
        } else {
            ((aerl) abstractCollection).set(i, obj);
        }
    }
}
