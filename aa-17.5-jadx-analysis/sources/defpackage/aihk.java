package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aihk {
    public static final aihj Companion = new aihj(null);
    private final List<aiin> arguments;
    private final aged descriptor;
    private final Map<agee, aiin> mapping;
    private final aihk parent;

    /* JADX WARN: Multi-variable type inference failed */
    private aihk(aihk aihkVar, aged agedVar, List<? extends aiin> list, Map<agee, ? extends aiin> map) {
        this.parent = aihkVar;
        this.descriptor = agedVar;
        this.arguments = list;
        this.mapping = map;
    }

    public final List<aiin> getArguments() {
        return this.arguments;
    }

    public final aged getDescriptor() {
        return this.descriptor;
    }

    public final aiin getReplacement(aiid aiidVar) {
        aiidVar.getClass();
        agbd declarationDescriptor = aiidVar.getDeclarationDescriptor();
        if (declarationDescriptor instanceof agee) {
            return this.mapping.get(declarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(aged agedVar) {
        agedVar.getClass();
        if (affa.f(this.descriptor, agedVar)) {
            return true;
        }
        aihk aihkVar = this.parent;
        return aihkVar != null && aihkVar.isRecursion(agedVar);
    }

    public /* synthetic */ aihk(aihk aihkVar, aged agedVar, List list, Map map, afeu afeuVar) {
        this(aihkVar, agedVar, list, map);
    }
}
