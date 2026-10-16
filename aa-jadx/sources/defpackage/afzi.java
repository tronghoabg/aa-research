package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 afzi, still in use, count: 1, list:
  (r0v1 afzi) from 0x0076: FILLED_NEW_ARRAY (r0v1 afzi), (r1v2 afzi), (r4v2 afzi), (r6v2 afzi), (r8v2 afzi), (r10v2 afzi), (r12v2 afzi) A[WRAPPED] (LINE:119) elemType: afzi
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class afzi {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    private final defpackage.afar arrayTypeFqName$delegate;
    private final defpackage.ahoj arrayTypeName;
    private final defpackage.afar typeFqName$delegate;
    private final defpackage.ahoj typeName;
    private static final /* synthetic */ defpackage.afef $ENTRIES = defpackage.afga.p(values());
    public static final defpackage.afzh Companion = new defpackage.afzh(null);
    public static final java.util.Set<defpackage.afzi> NUMBER_TYPES = defpackage.afga.cc(new defpackage.afzi[]{new defpackage.afzi("Char"), new defpackage.afzi("Byte"), new defpackage.afzi("Short"), new defpackage.afzi("Int"), new defpackage.afzi("Float"), new defpackage.afzi("Long"), new defpackage.afzi("Double")});

    static {
    }

    private afzi(java.lang.String str) {
        super(str, i);
        this.typeName = defpackage.ahoj.identifier(str);
        this.arrayTypeName = defpackage.ahoj.identifier(java.lang.String.valueOf(str).concat("Array"));
        this.typeFqName$delegate = defpackage.afga.cB(2, new defpackage.afzf(this));
        this.arrayTypeFqName$delegate = defpackage.afga.cB(2, new defpackage.afzg(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ahof arrayTypeFqName_delegate$lambda$0(defpackage.afzi afziVar) {
        return defpackage.afzo.BUILT_INS_PACKAGE_FQ_NAME.child(afziVar.arrayTypeName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ahof typeFqName_delegate$lambda$0(defpackage.afzi afziVar) {
        return defpackage.afzo.BUILT_INS_PACKAGE_FQ_NAME.child(afziVar.typeName);
    }

    public static defpackage.afzi valueOf(java.lang.String str) {
        return (defpackage.afzi) java.lang.Enum.valueOf(defpackage.afzi.class, str);
    }

    public static defpackage.afzi[] values() {
        return (defpackage.afzi[]) $VALUES.clone();
    }

    public final defpackage.ahof getArrayTypeFqName() {
        return (defpackage.ahof) this.arrayTypeFqName$delegate.a();
    }

    public final defpackage.ahoj getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final defpackage.ahof getTypeFqName() {
        return (defpackage.ahof) this.typeFqName$delegate.a();
    }

    public final defpackage.ahoj getTypeName() {
        return this.typeName;
    }
}
