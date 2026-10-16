package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agog {
    private final List<agms> annotations;
    private final Map<String, byte[]> compilerPluginMetadata;
    private final List<agoq> contextParameters;
    private final List<agol> contextReceiverTypes;
    private agnx contract;
    private final List<agms> extensionReceiverParameterAnnotations;
    private final List<agpw> extensions;
    private int flags;
    private String name;
    private agol receiverParameterType;
    public agol returnType;
    private final List<agon> typeParameters;
    private final List<agoq> valueParameters;
    private final List<agot> versionRequirements;

    public agog(int i, String str) {
        str.getClass();
        this.flags = i;
        this.name = str;
        this.typeParameters = new ArrayList(0);
        this.extensionReceiverParameterAnnotations = new ArrayList(0);
        this.contextReceiverTypes = new ArrayList(0);
        this.valueParameters = new ArrayList();
        this.contextParameters = new ArrayList();
        this.versionRequirements = new ArrayList(0);
        this.compilerPluginMetadata = new LinkedHashMap(0);
        this.annotations = new ArrayList(0);
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList(woy.bp(iNSTANCES$org_jetbrains_kotlin_kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((agqf) it.next()).createFunctionExtension());
        }
        this.extensions = arrayList;
    }

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    public final Map<String, byte[]> getCompilerPluginMetadata() {
        return this.compilerPluginMetadata;
    }

    public final List<agoq> getContextParameters() {
        return this.contextParameters;
    }

    public final List<agms> getExtensionReceiverParameterAnnotations() {
        return this.extensionReceiverParameterAnnotations;
    }

    public final List<agpw> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final String getName() {
        return this.name;
    }

    public final agol getReceiverParameterType() {
        return this.receiverParameterType;
    }

    public final agol getReturnType() {
        agol agolVar = this.returnType;
        if (agolVar != null) {
            return agolVar;
        }
        affa.d("returnType");
        return null;
    }

    public final List<agon> getTypeParameters() {
        return this.typeParameters;
    }

    public final List<agoq> getValueParameters() {
        return this.valueParameters;
    }

    public final List<agot> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setContract(agnx agnxVar) {
        this.contract = agnxVar;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setReceiverParameterType(agol agolVar) {
        this.receiverParameterType = agolVar;
    }

    public final void setReturnType(agol agolVar) {
        agolVar.getClass();
        this.returnType = agolVar;
    }
}
