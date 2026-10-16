package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class agmi implements defpackage.ahaw {
    public static final defpackage.agmh Factory = new defpackage.agmh(null);

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.agmi) && defpackage.afga.f(getReflectType(), ((defpackage.agmi) obj).getReflectType());
    }

    @Override // defpackage.ahah
    public defpackage.ahaf findAnnotation(defpackage.ahof ahofVar) {
        java.lang.Object obj;
        java.lang.Object next;
        defpackage.ahod classId;
        ahofVar.getClass();
        java.util.Iterator<T> it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                classId = ((defpackage.ahaf) next).getClassId();
            }
            return (defpackage.ahaf) obj;
        } while (!defpackage.afga.f(classId != null ? classId.asSingleFqName() : null, ahofVar));
        obj = next;
        return (defpackage.ahaf) obj;
    }

    protected abstract java.lang.reflect.Type getReflectType();

    public int hashCode() {
        return getReflectType().hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + getReflectType();
    }
}
