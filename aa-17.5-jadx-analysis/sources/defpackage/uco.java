package defpackage;

/* loaded from: classes3.dex */
final class uco extends plf {
    private final utf c;
    private final ute d;

    public uco(utf utfVar, ute uteVar) {
        super(256, "SingleLabelPickEntityPool");
        this.c = utfVar;
        this.d = uteVar;
    }

    @Override // defpackage.plf
    protected final /* bridge */ /* synthetic */ Object c() {
        umq umqVar = new umq(this.c, this.d);
        umqVar.x = new umi(true, true, umqVar);
        return umqVar;
    }
}
