package defpackage;

import java.lang.Enum;
import java.util.List;

/* loaded from: classes3.dex */
public final class agpb<Node, E extends Enum<E>> {
    private final afdf<E> entries;
    private final List<agpl> flagValues;
    private final afhm<Node, Integer> flags;
    private final ahkz<? extends ahor> protoSet;

    public agpb(afhm<Node, Integer> afhmVar, ahkz<? extends ahor> ahkzVar, afdf<E> afdfVar, List<agpl> list) {
        afhmVar.getClass();
        ahkzVar.getClass();
        afdfVar.getClass();
        list.getClass();
        this.flags = afhmVar;
        this.protoSet = ahkzVar;
        this.entries = afdfVar;
        this.flagValues = list;
    }

    public final E getValue(Node node, afia<?> afiaVar) {
        afiaVar.getClass();
        return this.entries.get(this.protoSet.get(this.flags.get(node).intValue()).getNumber());
    }

    public final void setValue(Node node, afia<?> afiaVar, E e) {
        afiaVar.getClass();
        e.getClass();
        this.flags.set(node, Integer.valueOf(this.flagValues.get(e.ordinal()).plus$org_jetbrains_kotlin_kotlin_metadata(this.flags.get(node).intValue())));
    }
}
