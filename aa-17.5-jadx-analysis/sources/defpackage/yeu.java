package defpackage;

/* loaded from: classes3.dex */
final class yeu extends yex {
    final /* synthetic */ yey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeu(yey yeyVar) {
        super(yeyVar);
        this.a = yeyVar;
    }

    @Override // defpackage.yex
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iX = wub.x(obj);
        yey yeyVar = this.a;
        int iC = yeyVar.c(obj, iX);
        if (iC == -1) {
            return false;
        }
        yeyVar.g(iC, iX);
        return true;
    }
}
