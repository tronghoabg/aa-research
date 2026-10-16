package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afrt extends afrj {
    private final aezr<afrs> data;
    private final Class<?> jClass;

    public afrt(Class<?> cls) {
        cls.getClass();
        this.jClass = cls;
        this.data = woy.dH(2, new afrk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afrs data$lambda$0(afrt afrtVar) {
        return new afrs(afrtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdn getLocalPropertyDescriptor$lambda$0$0(ahzy ahzyVar, ahis ahisVar) {
        ahzyVar.getClass();
        ahisVar.getClass();
        return ahzyVar.loadProperty(ahisVar, true);
    }

    private final ahxe getScope() {
        return ((afrs) this.data.a()).getScope();
    }

    public boolean equals(Object obj) {
        return (obj instanceof afrt) && affa.f(getJClass(), ((afrt) obj).getJClass());
    }

    @Override // defpackage.afrj
    public Collection<agbh> getConstructorDescriptors() {
        return afbe.a;
    }

    @Override // defpackage.afrj
    public Collection<agnw> getConstructorsMetadata() {
        return afbe.a;
    }

    @Override // defpackage.afrj
    public Collection<agcj> getFunctions(ahnj ahnjVar) {
        ahnjVar.getClass();
        return getScope().getContributedFunctions(ahnjVar, aglr.FROM_REFLECTION);
    }

    public Collection<agog> getFunctionsMetadata() {
        List<agoi> kmPackages = ((afrs) this.data.a()).getKmPackages();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = kmPackages.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, ((agoi) it.next()).getFunctions());
        }
        return arrayList;
    }

    @Override // defpackage.afer
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // defpackage.afrj
    public agdn getLocalPropertyDescriptor(int i) {
        ahxe scope = getScope();
        aict aictVar = scope instanceof aict ? (aict) scope : null;
        if (aictVar != null) {
            ahim proto = aictVar.getProto();
            ahop<ahim, List<ahis>> ahopVar = ahmh.packageLocalVariable;
            ahopVar.getClass();
            ahis ahisVar = (ahis) ahlf.getExtensionOrNull(proto, ahopVar, i);
            if (ahisVar != null) {
                Class<?> jClass = getJClass();
                afuc afucVar = new afuc(this);
                ahld nameResolver = aictVar.getC().getNameResolver();
                ahjy typeTable = proto.getTypeTable();
                typeTable.getClass();
                return (agdn) afvu.deserializeToDescriptor(jClass, afucVar, ahisVar, nameResolver, new ahlh(typeTable), aictVar.getC().getMetadataVersion(), afrl.INSTANCE);
            }
        }
        return null;
    }

    @Override // defpackage.afrj
    public agoj getLocalPropertyMetadata(int i) {
        List<agoj> localDelegatedProperties;
        agoi agoiVar = (agoi) woy.bP(((afrs) this.data.a()).getKmPackages());
        if (agoiVar == null || (localDelegatedProperties = agqk.getLocalDelegatedProperties(agoiVar)) == null) {
            return null;
        }
        return (agoj) woy.bI(localDelegatedProperties, i);
    }

    public Collection<afhd<?>> getMembers() {
        return ((afrs) this.data.a()).getMembers();
    }

    @Override // defpackage.afrj
    protected Class<?> getMethodOwner() {
        Class<?> multifileFacade = ((afrs) this.data.a()).getMultifileFacade();
        return multifileFacade == null ? getJClass() : multifileFacade;
    }

    @Override // defpackage.afrj
    public Collection<agdn> getProperties(ahnj ahnjVar) {
        ahnjVar.getClass();
        return getScope().getContributedVariables(ahnjVar, aglr.FROM_REFLECTION);
    }

    public Collection<agoj> getPropertiesMetadata() {
        List<agoi> kmPackages = ((afrs) this.data.a()).getKmPackages();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = kmPackages.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, ((agoi) it.next()).getProperties());
        }
        return arrayList;
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    public final boolean isMultifilePart$kotlin_reflection() {
        ahgb classHeader;
        agjk kotlinClass = ((afrs) this.data.a()).getKotlinClass();
        ahga kind = null;
        if (kotlinClass != null && (classHeader = kotlinClass.getClassHeader()) != null) {
            kind = classHeader.getKind();
        }
        return kind == ahga.MULTIFILE_CLASS_PART;
    }

    public String toString() {
        ahnf ahnfVarAsSingleFqName = agkc.getClassId(getJClass()).asSingleFqName();
        Objects.toString(ahnfVarAsSingleFqName);
        return "file class ".concat(String.valueOf(ahnfVarAsSingleFqName));
    }
}
