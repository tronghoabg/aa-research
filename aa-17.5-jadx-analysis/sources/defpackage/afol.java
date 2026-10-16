package defpackage;

/* loaded from: classes3.dex */
public final class afol extends aful {
    private final afnu<?> callable;
    private final int index;
    private final boolean isVararg;
    private final afhq kind;
    private final String name;
    private final afib type;

    public afol(afnu<?> afnuVar, String str, afib afibVar, int i, afhq afhqVar, boolean z) {
        afnuVar.getClass();
        afibVar.getClass();
        afhqVar.getClass();
        this.callable = afnuVar;
        this.name = str;
        this.type = afibVar;
        this.index = i;
        this.kind = afhqVar;
        this.isVararg = z;
    }

    @Override // defpackage.aful
    public boolean getDeclaresDefaultValue() {
        return false;
    }

    @Override // defpackage.afhr
    public int getIndex() {
        return this.index;
    }

    @Override // defpackage.afhr
    public afhq getKind() {
        return this.kind;
    }

    @Override // defpackage.afhr
    public String getName() {
        return this.name;
    }

    @Override // defpackage.afhr
    public afib getType() {
        return this.type;
    }

    @Override // defpackage.afhr
    public boolean isOptional() {
        return false;
    }

    @Override // defpackage.afhr
    public boolean isVararg() {
        return this.isVararg;
    }

    @Override // defpackage.aful
    public afnu<?> getCallable() {
        return this.callable;
    }
}
