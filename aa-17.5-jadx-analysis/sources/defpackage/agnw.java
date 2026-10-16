package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agnw {
    private final List<agms> annotations;
    private final Map<String, byte[]> compilerPluginMetadata;
    private final List<agps> extensions;
    private int flags;
    private final List<agoq> valueParameters;
    private final List<agot> versionRequirements;

    public agnw(int i) {
        this.flags = i;
        this.valueParameters = new ArrayList();
        this.versionRequirements = new ArrayList(0);
        this.compilerPluginMetadata = new LinkedHashMap(0);
        this.annotations = new ArrayList(0);
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList(woy.bp(iNSTANCES$org_jetbrains_kotlin_kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((agqf) it.next()).createConstructorExtension());
        }
        this.extensions = arrayList;
    }

    public final List<agms> getAnnotations() {
        return this.annotations;
    }

    public final Map<String, byte[]> getCompilerPluginMetadata() {
        return this.compilerPluginMetadata;
    }

    public final List<agps> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final List<agoq> getValueParameters() {
        return this.valueParameters;
    }

    public final List<agot> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public agnw() {
        this(0);
    }
}
