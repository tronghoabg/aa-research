package defpackage;

/* loaded from: classes.dex */
public final class ers {
    public static final esb a = new erf(4);
    public final mko b;

    public ers(ert ertVar, erq erqVar, esc escVar) {
        ertVar.getClass();
        erqVar.getClass();
        escVar.getClass();
        this.b = new mko(ertVar, erqVar, escVar);
    }

    public final erm a(Class cls) {
        return b(affw.a.getOrCreateKotlinClass(cls));
    }

    public final erm b(afhe afheVar) {
        afheVar.getClass();
        String qualifiedName = afheVar.getQualifiedName();
        if (qualifiedName != null) {
            return this.b.w(afheVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ers(ert ertVar, erq erqVar) {
        this(ertVar, erqVar, esa.a);
        ertVar.getClass();
    }
}
