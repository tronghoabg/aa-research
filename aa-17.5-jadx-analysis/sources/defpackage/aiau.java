package defpackage;

/* loaded from: classes3.dex */
public final class aiau extends ahzd implements afxr {
    public static final aiat Companion = new aiat(null);
    private final boolean isFallback;

    private aiau(ahnf ahnfVar, aiei aieiVar, agcu agcuVar, ahip ahipVar, ahkq ahkqVar, boolean z) {
        super(ahnfVar, aieiVar, agcuVar, ahipVar, ahkqVar, null);
        this.isFallback = z;
    }

    @Override // defpackage.agie, defpackage.aggy
    public String toString() {
        return "builtins package fragment for " + getFqName() + " from " + ahvz.getModule(this);
    }

    public /* synthetic */ aiau(ahnf ahnfVar, aiei aieiVar, agcu agcuVar, ahip ahipVar, ahkq ahkqVar, boolean z, afeu afeuVar) {
        this(ahnfVar, aieiVar, agcuVar, ahipVar, ahkqVar, z);
    }
}
