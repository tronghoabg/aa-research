package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agqa<Node> {
    private final defpackage.agql flag;
    private final defpackage.afim<Node, java.lang.Integer> flags;
    private final int mask;

    public agqa(defpackage.afim<Node, java.lang.Integer> afimVar, defpackage.agql agqlVar) {
        afimVar.getClass();
        agqlVar.getClass();
        this.flags = afimVar;
        this.flag = agqlVar;
        if (agqlVar.getBitWidth$org_jetbrains_kotlin_kotlin_metadata() == 1 && agqlVar.getValue$org_jetbrains_kotlin_kotlin_metadata() == 1) {
            this.mask = 1 << agqlVar.getOffset$org_jetbrains_kotlin_kotlin_metadata();
            return;
        }
        throw new java.lang.IllegalArgumentException("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but " + agqlVar + " was passed");
    }

    public final boolean getValue(Node node, defpackage.afja<?> afjaVar) {
        afjaVar.getClass();
        return this.flag.invoke(this.flags.get(node).intValue());
    }

    public final void setValue(Node node, defpackage.afja<?> afjaVar, boolean z) {
        afjaVar.getClass();
        defpackage.afim<Node, java.lang.Integer> afimVar = this.flags;
        this.flags.set(node, java.lang.Integer.valueOf(z ? afimVar.get(node).intValue() | this.mask : afimVar.get(node).intValue() & (~this.mask)));
    }
}
