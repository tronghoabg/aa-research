package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agpm {
    private final List<Object> contextExtensions;
    private final List<agqf> extensions;
    private final boolean ignoreUnknownVersionRequirements;
    private final agpm parent;
    private final ahld strings;
    private final Map<Integer, Integer> typeParameterNameToId;
    private final ahlh types;
    private final ahln versionRequirements;

    public agpm(ahld ahldVar, ahlh ahlhVar, ahln ahlnVar, boolean z, agpm agpmVar, List<? extends Object> list) {
        ahldVar.getClass();
        ahlhVar.getClass();
        ahlnVar.getClass();
        list.getClass();
        this.strings = ahldVar;
        this.types = ahlhVar;
        this.versionRequirements = ahlnVar;
        this.ignoreUnknownVersionRequirements = z;
        this.parent = agpmVar;
        this.contextExtensions = list;
        this.typeParameterNameToId = new LinkedHashMap();
        this.extensions = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
    }

    public final String className$org_jetbrains_kotlin_kotlin_metadata(int i) {
        return agpn.getClassName(this.strings, i);
    }

    public final String get(int i) {
        return this.strings.getString(i);
    }

    public final List<agqf> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    public final boolean getIgnoreUnknownVersionRequirements$org_jetbrains_kotlin_kotlin_metadata() {
        return this.ignoreUnknownVersionRequirements;
    }

    public final ahld getStrings() {
        return this.strings;
    }

    public final Integer getTypeParameterId$org_jetbrains_kotlin_kotlin_metadata(int i) {
        Integer num = this.typeParameterNameToId.get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        agpm agpmVar = this.parent;
        if (agpmVar == null) {
            return null;
        }
        return agpmVar.getTypeParameterId$org_jetbrains_kotlin_kotlin_metadata(i);
    }

    public final ahlh getTypes() {
        return this.types;
    }

    public final ahln getVersionRequirements$org_jetbrains_kotlin_kotlin_metadata() {
        return this.versionRequirements;
    }

    public final agpm withTypeParameters$org_jetbrains_kotlin_kotlin_metadata(List<ahjv> list) {
        list.getClass();
        agpm agpmVar = new agpm(this.strings, this.types, this.versionRequirements, this.ignoreUnknownVersionRequirements, this, this.contextExtensions);
        for (ahjv ahjvVar : list) {
            agpmVar.typeParameterNameToId.put(Integer.valueOf(ahjvVar.getName()), Integer.valueOf(ahjvVar.getId()));
        }
        return agpmVar;
    }

    public /* synthetic */ agpm(ahld ahldVar, ahlh ahlhVar, ahln ahlnVar, boolean z, agpm agpmVar, List list, int i, afeu afeuVar) {
        this(ahldVar, ahlhVar, ahlnVar, z, (i & 16) != 0 ? null : agpmVar, (i & 32) != 0 ? afbe.a : list);
    }
}
