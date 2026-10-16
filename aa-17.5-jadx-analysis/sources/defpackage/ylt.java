package defpackage;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class ylt extends yfq {
    final /* synthetic */ ylu a;

    public ylt(ylu yluVar) {
        this.a = yluVar;
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        ylu yluVar = this.a;
        woy.ai(i, yluVar.c);
        Object[] objArr = yluVar.a;
        int i2 = i + i;
        int i3 = yluVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.yfq, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
