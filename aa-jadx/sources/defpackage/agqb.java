package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agqb<Node, E extends java.lang.Enum<E>> {
    private final defpackage.afef<E> entries;
    private final java.util.List<defpackage.agql> flagValues;
    private final defpackage.afim<Node, java.lang.Integer> flags;
    private final defpackage.ahlz<? extends defpackage.ahpr> protoSet;

    public agqb(defpackage.afim<Node, java.lang.Integer> afimVar, defpackage.ahlz<? extends defpackage.ahpr> ahlzVar, defpackage.afef<E> afefVar, java.util.List<defpackage.agql> list) {
        afimVar.getClass();
        ahlzVar.getClass();
        afefVar.getClass();
        list.getClass();
        this.flags = afimVar;
        this.protoSet = ahlzVar;
        this.entries = afefVar;
        this.flagValues = list;
    }

    public final E getValue(Node node, defpackage.afja<?> afjaVar) {
        afjaVar.getClass();
        return this.entries.get(this.protoSet.get(this.flags.get(node).intValue()).getNumber());
    }

    public final void setValue(Node node, defpackage.afja<?> afjaVar, E e) {
        afjaVar.getClass();
        e.getClass();
        this.flags.set(node, java.lang.Integer.valueOf(this.flagValues.get(e.ordinal()).plus$org_jetbrains_kotlin_kotlin_metadata(this.flags.get(node).intValue())));
    }
}
