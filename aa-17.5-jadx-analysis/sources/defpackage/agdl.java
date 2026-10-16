package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agdl {
    private final List<aiin> arguments;
    private final agbe classifierDescriptor;
    private final agdl outerType;

    /* JADX WARN: Multi-variable type inference failed */
    public agdl(agbe agbeVar, List<? extends aiin> list, agdl agdlVar) {
        agbeVar.getClass();
        list.getClass();
        this.classifierDescriptor = agbeVar;
        this.arguments = list;
        this.outerType = agdlVar;
    }

    public final List<aiin> getArguments() {
        return this.arguments;
    }

    public final agbe getClassifierDescriptor() {
        return this.classifierDescriptor;
    }

    public final agdl getOuterType() {
        return this.outerType;
    }
}
