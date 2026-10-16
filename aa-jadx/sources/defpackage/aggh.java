package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aggh implements defpackage.aggk {
    /* JADX INFO: renamed from: findAnnotation, reason: collision with other method in class */
    public java.lang.Void m78findAnnotation(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return null;
    }

    @Override // defpackage.aggk
    public /* bridge */ boolean hasAnnotation(defpackage.ahof ahofVar) {
        return defpackage.aggj.hasAnnotation(this, ahofVar);
    }

    @Override // defpackage.aggk
    public boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<defpackage.aggc> iterator() {
        return defpackage.afcd.a;
    }

    public java.lang.String toString() {
        return "EMPTY";
    }

    @Override // defpackage.aggk
    public /* bridge */ /* synthetic */ defpackage.aggc findAnnotation(defpackage.ahof ahofVar) {
        m78findAnnotation(ahofVar);
        return null;
    }
}
