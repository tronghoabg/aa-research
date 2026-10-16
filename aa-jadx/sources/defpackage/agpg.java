package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agpg {
    private final java.util.List<defpackage.agns> annotations;
    private final java.util.Map<java.lang.String, byte[]> compilerPluginMetadata;
    private final java.util.List<defpackage.agpq> contextParameters;
    private final java.util.List<defpackage.agpl> contextReceiverTypes;
    private defpackage.agox contract;
    private final java.util.List<defpackage.agns> extensionReceiverParameterAnnotations;
    private final java.util.List<defpackage.agqw> extensions;
    private int flags;
    private java.lang.String name;
    private defpackage.agpl receiverParameterType;
    public defpackage.agpl returnType;
    private final java.util.List<defpackage.agpn> typeParameters;
    private final java.util.List<defpackage.agpq> valueParameters;
    private final java.util.List<defpackage.agpt> versionRequirements;

    public agpg(int i, java.lang.String str) {
        str.getClass();
        this.flags = i;
        this.name = str;
        this.typeParameters = new java.util.ArrayList(0);
        this.extensionReceiverParameterAnnotations = new java.util.ArrayList(0);
        this.contextReceiverTypes = new java.util.ArrayList(0);
        this.valueParameters = new java.util.ArrayList();
        this.contextParameters = new java.util.ArrayList();
        this.versionRequirements = new java.util.ArrayList(0);
        this.compilerPluginMetadata = new java.util.LinkedHashMap(0);
        this.annotations = new java.util.ArrayList(0);
        java.util.List<defpackage.agrf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = defpackage.agrf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(iNSTANCES$org_jetbrains_kotlin_kotlin_metadata, 10));
        java.util.Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.agrf) it.next()).createFunctionExtension());
        }
        this.extensions = arrayList;
    }

    public final java.util.List<defpackage.agns> getAnnotations() {
        return this.annotations;
    }

    public final java.util.Map<java.lang.String, byte[]> getCompilerPluginMetadata() {
        return this.compilerPluginMetadata;
    }

    public final java.util.List<defpackage.agpq> getContextParameters() {
        return this.contextParameters;
    }

    public final java.util.List<defpackage.agns> getExtensionReceiverParameterAnnotations() {
        return this.extensionReceiverParameterAnnotations;
    }

    public final java.util.List<defpackage.agqw> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final defpackage.agpl getReceiverParameterType() {
        return this.receiverParameterType;
    }

    public final defpackage.agpl getReturnType() {
        defpackage.agpl agplVar = this.returnType;
        if (agplVar != null) {
            return agplVar;
        }
        defpackage.afga.d("returnType");
        return null;
    }

    public final java.util.List<defpackage.agpn> getTypeParameters() {
        return this.typeParameters;
    }

    public final java.util.List<defpackage.agpq> getValueParameters() {
        return this.valueParameters;
    }

    public final java.util.List<defpackage.agpt> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setContract(defpackage.agox agoxVar) {
        this.contract = agoxVar;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setReceiverParameterType(defpackage.agpl agplVar) {
        this.receiverParameterType = agplVar;
    }

    public final void setReturnType(defpackage.agpl agplVar) {
        agplVar.getClass();
        this.returnType = agplVar;
    }
}
