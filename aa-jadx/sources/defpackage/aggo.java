package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aggo implements defpackage.aggc {
    private final java.util.Map<defpackage.ahoj, defpackage.ahvh<?>> allValueArguments;
    private final defpackage.afze builtIns;
    private final boolean forcePropagationDeprecationToOverrides;
    private final defpackage.ahof fqName;
    private final defpackage.afar type$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public aggo(defpackage.afze afzeVar, defpackage.ahof ahofVar, java.util.Map<defpackage.ahoj, ? extends defpackage.ahvh<?>> map, boolean z) {
        afzeVar.getClass();
        ahofVar.getClass();
        map.getClass();
        this.builtIns = afzeVar;
        this.fqName = ahofVar;
        this.allValueArguments = map;
        this.forcePropagationDeprecationToOverrides = z;
        this.type$delegate = defpackage.afga.cB(2, new defpackage.aggn(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aihw type_delegate$lambda$0(defpackage.aggo aggoVar) {
        return aggoVar.builtIns.getBuiltInClassByFqName(aggoVar.getFqName()).getDefaultType();
    }

    @Override // defpackage.aggc
    public java.util.Map<defpackage.ahoj, defpackage.ahvh<?>> getAllValueArguments() {
        return this.allValueArguments;
    }

    @Override // defpackage.aggc
    public defpackage.ahof getFqName() {
        return this.fqName;
    }

    @Override // defpackage.aggc
    public defpackage.agex getSource() {
        defpackage.agex agexVar = defpackage.agex.NO_SOURCE;
        agexVar.getClass();
        return agexVar;
    }

    @Override // defpackage.aggc
    public defpackage.aihl getType() {
        java.lang.Object objA = this.type$delegate.a();
        objA.getClass();
        return (defpackage.aihl) objA;
    }

    public /* synthetic */ aggo(defpackage.afze afzeVar, defpackage.ahof ahofVar, java.util.Map map, boolean z, int i, defpackage.affu affuVar) {
        this(afzeVar, ahofVar, map, z & ((i & 8) == 0));
    }
}
