package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tdl implements java.util.Map.Entry, defpackage.afhf, defpackage.afhc {
    public final java.util.Map.Entry a;
    final /* synthetic */ defpackage.tdo b;

    public tdl(defpackage.tdo tdoVar, java.util.Map.Entry entry) {
        entry.getClass();
        this.b = tdoVar;
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        obj.getClass();
        defpackage.tdo tdoVar = this.b;
        java.lang.Object value = this.a.setValue(obj);
        tdoVar.b();
        return value;
    }
}
