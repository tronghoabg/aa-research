package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agel {
    private final java.util.List<defpackage.aijn> arguments;
    private final defpackage.agce classifierDescriptor;
    private final defpackage.agel outerType;

    /* JADX WARN: Multi-variable type inference failed */
    public agel(defpackage.agce agceVar, java.util.List<? extends defpackage.aijn> list, defpackage.agel agelVar) {
        agceVar.getClass();
        list.getClass();
        this.classifierDescriptor = agceVar;
        this.arguments = list;
        this.outerType = agelVar;
    }

    public final java.util.List<defpackage.aijn> getArguments() {
        return this.arguments;
    }

    public final defpackage.agce getClassifierDescriptor() {
        return this.classifierDescriptor;
    }

    public final defpackage.agel getOuterType() {
        return this.outerType;
    }
}
