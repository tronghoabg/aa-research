package defpackage;

/* loaded from: classes3.dex */
final class yev extends yex {
    final /* synthetic */ yey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yev(yey yeyVar) {
        super(yeyVar);
        this.a = yeyVar;
    }

    @Override // defpackage.yex
    public final Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iX = wub.x(obj);
        yey yeyVar = this.a;
        int iE = yeyVar.e(obj, iX);
        if (iE == -1) {
            return false;
        }
        yeyVar.h(iE, iX);
        return true;
    }
}
