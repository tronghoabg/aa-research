package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agoj {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affh(agoj.class, "_hasSetter", "get_hasSetter()Z", 0), new affh(agoj.class, "_hasGetter", "get_hasGetter()Z", 0)};
    private final agpa _hasGetter$delegate;
    private final agpa _hasSetter$delegate;
    private final List<agms> annotations;
    private final List<agms> backingFieldAnnotations;
    private final Map<String, byte[]> compilerPluginMetadata;
    private final List<agoq> contextParameters;
    private final List<agol> contextReceiverTypes;
    private final List<agms> delegateFieldAnnotations;
    private final List<agms> extensionReceiverParameterAnnotations;
    private final List<agpy> extensions;
    private int flags;
    private final agok getter;
    private String name;
    private agol receiverParameterType;
    public agol returnType;
    private agok setter;
    private agoq setterParameter;
    private final List<agon> typeParameters;
    private final List<agot> versionRequirements;

    public agoj(int i, String str, int i2, int i3) {
        str.getClass();
        this.flags = i;
        this.name = str;
        ahkx ahkxVar = ahla.HAS_SETTER;
        ahkxVar.getClass();
        this._hasSetter$delegate = agpk.propertyBooleanFlag(new agpl(ahkxVar));
        ahkx ahkxVar2 = ahla.HAS_GETTER;
        ahkxVar2.getClass();
        this._hasGetter$delegate = agpk.propertyBooleanFlag(new agpl(ahkxVar2));
        agok agokVar = new agok(i2);
        set_hasGetter(true);
        this.getter = agokVar;
        this.setter = get_hasSetter() ? new agok(i3) : null;
        this.typeParameters = new ArrayList(0);
        this.extensionReceiverParameterAnnotations = new ArrayList(0);
        this.contextReceiverTypes = new ArrayList(0);
        this.contextParameters = new ArrayList();
        this.versionRequirements = new ArrayList(0);
        this.compilerPluginMetadata = new LinkedHashMap(0);
        this.annotations = new ArrayList(0);
        this.backingFieldAnnotations = new ArrayList(0);
        this.delegateFieldAnnotations = new ArrayList(0);
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList(woy.bp(iNSTANCES$org_jetbrains_kotlin_kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((agqf) it.next()).createPropertyExtension());
        }
        this.extensions = arrayList;
    }

    private final boolean get_hasSetter() {
        return this._hasSetter$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final void set_hasGetter(boolean z) {
        this._hasGetter$delegate.setValue(this, $$delegatedProperties[1], z);
    }

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    public final List<agms> getBackingFieldAnnotations() {
        return this.backingFieldAnnotations;
    }

    public final Map<String, byte[]> getCompilerPluginMetadata() {
        return this.compilerPluginMetadata;
    }

    public final List<agoq> getContextParameters() {
        return this.contextParameters;
    }

    public final List<agms> getDelegateFieldAnnotations() {
        return this.delegateFieldAnnotations;
    }

    public final List<agms> getExtensionReceiverParameterAnnotations() {
        return this.extensionReceiverParameterAnnotations;
    }

    public final List<agpy> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final agok getGetter() {
        return this.getter;
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

    public final agok getSetter() {
        return this.setter;
    }

    public final agoq getSetterParameter() {
        return this.setterParameter;
    }

    public final List<agon> getTypeParameters() {
        return this.typeParameters;
    }

    public final List<agot> getVersionRequirements() {
        return this.versionRequirements;
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

    public final void setSetterParameter(agoq agoqVar) {
        this.setterParameter = agoqVar;
    }
}
