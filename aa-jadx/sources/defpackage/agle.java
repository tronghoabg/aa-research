package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agle {
    private agle() {
    }

    public final defpackage.aglf create(java.lang.Object obj, defpackage.ahoj ahojVar) {
        obj.getClass();
        if (defpackage.aglc.isEnumClassOrSpecializedEnumEntryClass(obj.getClass())) {
            return new defpackage.agly(ahojVar, (java.lang.Enum) obj);
        }
        if (obj instanceof java.lang.annotation.Annotation) {
            return new defpackage.aglg(ahojVar, (java.lang.annotation.Annotation) obj);
        }
        if (obj instanceof java.lang.Object[]) {
            return new defpackage.aglj(ahojVar, (java.lang.Object[]) obj);
        }
        return obj instanceof java.lang.Class ? new defpackage.aglu(ahojVar, (java.lang.Class) obj) : new defpackage.agma(ahojVar, obj);
    }

    public /* synthetic */ agle(defpackage.affu affuVar) {
        this();
    }
}
