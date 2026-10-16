package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ery {
    public static final defpackage.esh a = new defpackage.erl(4);
    public final defpackage.mku b;

    public ery(defpackage.erz erzVar, defpackage.erw erwVar, defpackage.esi esiVar) {
        erzVar.getClass();
        erwVar.getClass();
        esiVar.getClass();
        this.b = new defpackage.mku(erzVar, erwVar, esiVar);
    }

    public final defpackage.ers a(java.lang.Class cls) {
        return b(defpackage.afgw.a.getOrCreateKotlinClass(cls));
    }

    public final defpackage.ers b(defpackage.afie afieVar) {
        afieVar.getClass();
        java.lang.String qualifiedName = afieVar.getQualifiedName();
        if (qualifiedName != null) {
            return this.b.w(afieVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ery(defpackage.erz erzVar, defpackage.erw erwVar) {
        this(erzVar, erwVar, defpackage.esg.a);
        erzVar.getClass();
    }
}
