package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahyy {
    private final ahyv components;
    private final aibv containerSource;
    private final agbi containingDeclaration;
    private final ahzy memberDeserializer;
    private final ahkv metadataVersion;
    private final ahld nameResolver;
    private final aian typeDeserializer;
    private final ahlh typeTable;
    private final ahln versionRequirementTable;

    public ahyy(ahyv ahyvVar, ahld ahldVar, agbi agbiVar, ahlh ahlhVar, ahln ahlnVar, ahkv ahkvVar, aibv aibvVar, aian aianVar, List<ahjv> list) {
        String presentableString;
        ahyvVar.getClass();
        ahldVar.getClass();
        agbiVar.getClass();
        ahlhVar.getClass();
        ahlnVar.getClass();
        ahkvVar.getClass();
        list.getClass();
        this.components = ahyvVar;
        this.nameResolver = ahldVar;
        this.containingDeclaration = agbiVar;
        this.typeTable = ahlhVar;
        this.versionRequirementTable = ahlnVar;
        this.metadataVersion = ahkvVar;
        this.containerSource = aibvVar;
        this.typeDeserializer = new aian(this, aianVar, list, "Deserializer for \"" + agbiVar.getName() + '\"', (aibvVar == null || (presentableString = aibvVar.getPresentableString()) == null) ? "[container not found]" : presentableString);
        this.memberDeserializer = new ahzy(this);
    }

    public static /* synthetic */ ahyy childContext$default(ahyy ahyyVar, agbi agbiVar, List list, ahld ahldVar, ahlh ahlhVar, ahln ahlnVar, ahkv ahkvVar, int i, Object obj) {
        if ((i & 4) != 0) {
            ahldVar = ahyyVar.nameResolver;
        }
        ahld ahldVar2 = ahldVar;
        if ((i & 8) != 0) {
            ahlhVar = ahyyVar.typeTable;
        }
        ahlh ahlhVar2 = ahlhVar;
        if ((i & 16) != 0) {
            ahlnVar = ahyyVar.versionRequirementTable;
        }
        ahln ahlnVar2 = ahlnVar;
        if ((i & 32) != 0) {
            ahkvVar = ahyyVar.metadataVersion;
        }
        return ahyyVar.childContext(agbiVar, list, ahldVar2, ahlhVar2, ahlnVar2, ahkvVar);
    }

    public final ahyy childContext(agbi agbiVar, List<ahjv> list, ahld ahldVar, ahlh ahlhVar, ahln ahlnVar, ahkv ahkvVar) {
        agbiVar.getClass();
        list.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        ahlnVar.getClass();
        ahkvVar.getClass();
        if (!ahlo.isVersionRequirementTableWrittenCorrectly(ahkvVar)) {
            ahlnVar = this.versionRequirementTable;
        }
        return new ahyy(this.components, ahldVar, agbiVar, ahlhVar, ahlnVar, ahkvVar, this.containerSource, this.typeDeserializer, list);
    }

    public final ahyv getComponents() {
        return this.components;
    }

    public final aibv getContainerSource() {
        return this.containerSource;
    }

    public final agbi getContainingDeclaration() {
        return this.containingDeclaration;
    }

    public final ahzy getMemberDeserializer() {
        return this.memberDeserializer;
    }

    public final ahkv getMetadataVersion() {
        return this.metadataVersion;
    }

    public final ahld getNameResolver() {
        return this.nameResolver;
    }

    public final aiei getStorageManager() {
        return this.components.getStorageManager();
    }

    public final aian getTypeDeserializer() {
        return this.typeDeserializer;
    }

    public final ahlh getTypeTable() {
        return this.typeTable;
    }

    public final ahln getVersionRequirementTable() {
        return this.versionRequirementTable;
    }
}
