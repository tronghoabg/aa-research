package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agnq implements agny {
    private String companionObject;
    private final List<agpr> extensions;
    private int flags;
    private String inlineClassUnderlyingPropertyName;
    private agol inlineClassUnderlyingType;
    public String name;
    private final List<agon> typeParameters = new ArrayList(0);
    private final List<agol> supertypes = new ArrayList(1);
    private final List<agog> functions = new ArrayList();
    private final List<agoj> properties = new ArrayList();
    private final List<agom> typeAliases = new ArrayList(0);
    private final List<agnw> constructors = new ArrayList(1);
    private final List<String> nestedClasses = new ArrayList(0);
    private final List<String> enumEntries = new ArrayList(0);
    private final List<agod> kmEnumEntries = new ArrayList(0);
    private final List<String> sealedSubclasses = new ArrayList(0);
    private final List<agms> annotations = new ArrayList(0);
    private final List<agol> contextReceiverTypes = new ArrayList(0);
    private final List<agot> versionRequirements = new ArrayList(0);
    private final Map<String, byte[]> compilerPluginMetadata = new LinkedHashMap(0);

    public agnq() {
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList(woy.bp(iNSTANCES$org_jetbrains_kotlin_kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((agqf) it.next()).createClassExtension());
        }
        this.extensions = arrayList;
    }

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    public final Map<String, byte[]> getCompilerPluginMetadata() {
        return this.compilerPluginMetadata;
    }

    public final List<agnw> getConstructors() {
        return this.constructors;
    }

    public final List<agol> getContextReceiverTypes() {
        return this.contextReceiverTypes;
    }

    public final List<String> getEnumEntries() {
        return this.enumEntries;
    }

    public final List<agpr> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    @Override // defpackage.agny
    public List<agog> getFunctions() {
        return this.functions;
    }

    public final String getInlineClassUnderlyingPropertyName() {
        return this.inlineClassUnderlyingPropertyName;
    }

    public final agol getInlineClassUnderlyingType() {
        return this.inlineClassUnderlyingType;
    }

    public final List<agod> getKmEnumEntries() {
        return this.kmEnumEntries;
    }

    public final String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        affa.d("name");
        return null;
    }

    public final List<String> getNestedClasses() {
        return this.nestedClasses;
    }

    @Override // defpackage.agny
    public List<agoj> getProperties() {
        return this.properties;
    }

    public final List<String> getSealedSubclasses() {
        return this.sealedSubclasses;
    }

    public final List<agol> getSupertypes() {
        return this.supertypes;
    }

    @Override // defpackage.agny
    public List<agom> getTypeAliases() {
        return this.typeAliases;
    }

    public final List<agon> getTypeParameters() {
        return this.typeParameters;
    }

    public final List<agot> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setCompanionObject(String str) {
        this.companionObject = str;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setInlineClassUnderlyingPropertyName(String str) {
        this.inlineClassUnderlyingPropertyName = str;
    }

    public final void setInlineClassUnderlyingType(agol agolVar) {
        this.inlineClassUnderlyingType = agolVar;
    }

    public final void setName(String str) {
        str.getClass();
        this.name = str;
    }
}
