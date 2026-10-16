package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class aigk implements aiid, aimd {
    private aigl alternative;
    private final int hashCode;
    private final LinkedHashSet<aigl> intersectedTypes;

    public aigk(Collection<? extends aigl> collection) {
        collection.getClass();
        collection.isEmpty();
        LinkedHashSet<aigl> linkedHashSet = new LinkedHashSet<>(collection);
        this.intersectedTypes = linkedHashSet;
        this.hashCode = linkedHashSet.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigw createType$lambda$0(aigk aigkVar, aiju aijuVar) {
        aijuVar.getClass();
        return aigkVar.refine(aijuVar).createType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String makeDebugNameForIntersectionType$default(aigk aigkVar, afec afecVar, int i, Object obj) {
        if ((i & 1) != 0) {
            afecVar = aigh.INSTANCE;
        }
        return aigkVar.makeDebugNameForIntersectionType(afecVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeDebugNameForIntersectionType$lambda$0(aigl aiglVar) {
        aiglVar.getClass();
        return aiglVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence makeDebugNameForIntersectionType$lambda$2(afec afecVar, aigl aiglVar) {
        aiglVar.getClass();
        return afecVar.invoke(aiglVar).toString();
    }

    public final ahxe createScopeForKotlinType() {
        return ahxt.Companion.create("member scope for intersection type", this.intersectedTypes);
    }

    public final aigw createType() {
        return aigq.simpleTypeWithNonTrivialMemberScope(aihr.Companion.getEmpty(), this, afbe.a, false, createScopeForKotlinType(), new aigi(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aigk) {
            return affa.f(this.intersectedTypes, ((aigk) obj).intersectedTypes);
        }
        return false;
    }

    public final aigl getAlternativeType() {
        return this.alternative;
    }

    @Override // defpackage.aiid
    public afye getBuiltIns() {
        afye builtIns = this.intersectedTypes.iterator().next().getConstructor().getBuiltIns();
        builtIns.getClass();
        return builtIns;
    }

    @Override // defpackage.aiid
    public agbd getDeclarationDescriptor() {
        return null;
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        return afbe.a;
    }

    @Override // defpackage.aiid
    /* renamed from: getSupertypes */
    public Collection<aigl> mo89getSupertypes() {
        return this.intersectedTypes;
    }

    public int hashCode() {
        return this.hashCode;
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return false;
    }

    public final String makeDebugNameForIntersectionType(afec<? super aigl, ? extends Object> afecVar) {
        afecVar.getClass();
        return woy.cu(woy.cc(this.intersectedTypes, new aigj(afecVar)), " & ", "{", "}", new aigg(afecVar), 24);
    }

    @Override // defpackage.aiid
    public aigk refine(aiju aijuVar) {
        aijuVar.getClass();
        Collection<aigl> collectionMo89getSupertypes = mo89getSupertypes();
        ArrayList arrayList = new ArrayList(woy.bp(collectionMo89getSupertypes, 10));
        Iterator<T> it = collectionMo89getSupertypes.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((aigl) it.next()).refine(aijuVar));
            z = true;
        }
        aigk alternative = null;
        if (z) {
            aigl alternativeType = getAlternativeType();
            alternative = new aigk(arrayList).setAlternative(alternativeType != null ? alternativeType.refine(aijuVar) : null);
        }
        return alternative == null ? this : alternative;
    }

    public final aigk setAlternative(aigl aiglVar) {
        return new aigk(this.intersectedTypes, aiglVar);
    }

    public String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    private aigk(Collection<? extends aigl> collection, aigl aiglVar) {
        this(collection);
        this.alternative = aiglVar;
    }
}
