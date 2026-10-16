package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agom {
    private final List<agms> annotations;
    private final Map<String, byte[]> compilerPluginMetadata;
    public agol expandedType;
    private final List<agpz> extensions;
    private int flags;
    private String name;
    private final List<agon> typeParameters;
    public agol underlyingType;
    private final List<agot> versionRequirements;

    public agom(int i, String str) {
        str.getClass();
        this.flags = i;
        this.name = str;
        this.typeParameters = new ArrayList(0);
        this.annotations = new ArrayList(0);
        this.versionRequirements = new ArrayList(0);
        this.compilerPluginMetadata = new LinkedHashMap(0);
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            agpz agpzVarCreateTypeAliasExtension = ((agqf) it.next()).createTypeAliasExtension();
            if (agpzVarCreateTypeAliasExtension != null) {
                arrayList.add(agpzVarCreateTypeAliasExtension);
            }
        }
        this.extensions = arrayList;
    }

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    public final Map<String, byte[]> getCompilerPluginMetadata() {
        return this.compilerPluginMetadata;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final List<agon> getTypeParameters() {
        return this.typeParameters;
    }

    public final List<agot> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setExpandedType(agol agolVar) {
        agolVar.getClass();
        this.expandedType = agolVar;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setUnderlyingType(agol agolVar) {
        agolVar.getClass();
        this.underlyingType = agolVar;
    }
}
