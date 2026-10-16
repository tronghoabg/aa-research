package defpackage;

/* loaded from: classes2.dex */
public final class aie implements aew {
    private final aew a;
    private final int b;

    public aie(aew aewVar, int i) {
        this.a = aewVar;
        this.b = i;
    }

    @Override // defpackage.aec
    public final agr c(bii biiVar) {
        return new aii(this.a.c(biiVar), this.b * 1000000);
    }
}
