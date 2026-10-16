package defpackage;

/* loaded from: classes3.dex */
public final class agpa<Node> {
    private final agpl flag;
    private final afhm<Node, Integer> flags;
    private final int mask;

    public agpa(afhm<Node, Integer> afhmVar, agpl agplVar) {
        afhmVar.getClass();
        agplVar.getClass();
        this.flags = afhmVar;
        this.flag = agplVar;
        if (agplVar.getBitWidth$org_jetbrains_kotlin_kotlin_metadata() == 1 && agplVar.getValue$org_jetbrains_kotlin_kotlin_metadata() == 1) {
            this.mask = 1 << agplVar.getOffset$org_jetbrains_kotlin_kotlin_metadata();
            return;
        }
        throw new IllegalArgumentException("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but " + agplVar + " was passed");
    }

    public final boolean getValue(Node node, afia<?> afiaVar) {
        afiaVar.getClass();
        return this.flag.invoke(this.flags.get(node).intValue());
    }

    public final void setValue(Node node, afia<?> afiaVar, boolean z) {
        afiaVar.getClass();
        afhm<Node, Integer> afhmVar = this.flags;
        this.flags.set(node, Integer.valueOf(z ? afhmVar.get(node).intValue() | this.mask : afhmVar.get(node).intValue() & (~this.mask)));
    }
}
