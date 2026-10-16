package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ylz extends defpackage.ylp {
    final /* synthetic */ defpackage.yma a;

    public ylz(defpackage.yma ymaVar) {
        this.a = ymaVar;
    }

    @Override // defpackage.ylp
    public final java.util.Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry> iterator() {
        defpackage.ylx ylxVar = this.a.a;
        java.util.Set setX = ylxVar.x();
        ylxVar.getClass();
        return new defpackage.yll(setX.iterator(), new defpackage.rha(ylxVar, 17));
    }

    @Override // defpackage.ylp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (!contains(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        entry.getClass();
        defpackage.yma ymaVar = this.a;
        ymaVar.a.x().remove(entry.getKey());
        return true;
    }
}
