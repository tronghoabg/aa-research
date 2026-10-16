package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aikb implements ahtw {
    private final aezr _supertypes$delegate;
    private final aikb original;
    private final aiin projection;
    private afdr<? extends List<? extends aijf>> supertypesComputation;
    private final agee typeParameter;

    public aikb(aiin aiinVar, afdr<? extends List<? extends aijf>> afdrVar, aikb aikbVar, agee ageeVar) {
        aiinVar.getClass();
        this.projection = aiinVar;
        this.supertypesComputation = afdrVar;
        this.original = aikbVar;
        this.typeParameter = ageeVar;
        this._supertypes$delegate = woy.dH(2, new aijx(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _supertypes_delegate$lambda$0(aikb aikbVar) {
        afdr<? extends List<? extends aijf>> afdrVar = aikbVar.supertypesComputation;
        if (afdrVar != null) {
            return afdrVar.invoke();
        }
        return null;
    }

    private final List<aijf> get_supertypes() {
        return (List) this._supertypes$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List refine$lambda$0$0(aikb aikbVar, aiju aijuVar) {
        List<aijf> listMo89getSupertypes = aikbVar.mo89getSupertypes();
        ArrayList arrayList = new ArrayList(woy.bp(listMo89getSupertypes, 10));
        Iterator<T> it = listMo89getSupertypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((aijf) it.next()).refine(aijuVar));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        aikb aikbVar = this.original;
        if (aikbVar != null) {
            this = aikbVar;
        }
        aikb aikbVar2 = ((aikb) obj).original;
        if (aikbVar2 != null) {
            obj = aikbVar2;
        }
        return this == obj;
    }

    @Override // defpackage.aiid
    public afye getBuiltIns() {
        aigl type = getProjection().getType();
        type.getClass();
        return aimr.getBuiltIns(type);
    }

    @Override // defpackage.aiid
    public agbd getDeclarationDescriptor() {
        return null;
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        return afbe.a;
    }

    @Override // defpackage.ahtw
    public aiin getProjection() {
        return this.projection;
    }

    @Override // defpackage.aiid
    /* renamed from: getSupertypes */
    public List<aijf> mo89getSupertypes() {
        List<aijf> list = get_supertypes();
        return list == null ? afbe.a : list;
    }

    public int hashCode() {
        aikb aikbVar = this.original;
        return aikbVar != null ? aikbVar.hashCode() : super.hashCode();
    }

    public final void initializeSupertypes(List<? extends aijf> list) {
        list.getClass();
        this.supertypesComputation = new aijz(list);
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return false;
    }

    @Override // defpackage.aiid
    public aikb refine(aiju aijuVar) {
        aijuVar.getClass();
        aiin aiinVarRefine = getProjection().refine(aijuVar);
        aiinVarRefine.getClass();
        aika aikaVar = this.supertypesComputation != null ? new aika(this, aijuVar) : null;
        aikb aikbVar = this.original;
        if (aikbVar == null) {
            aikbVar = this;
        }
        return new aikb(aiinVarRefine, aikaVar, aikbVar, this.typeParameter);
    }

    public String toString() {
        return "CapturedType(" + getProjection() + ')';
    }

    private static final List _init_$lambda$0(List list) {
        return list;
    }

    static /* synthetic */ List accessor$NewCapturedTypeConstructor$lambda1(List list) {
        return list;
    }

    static /* synthetic */ List accessor$NewCapturedTypeConstructor$lambda2(List list) {
        return list;
    }

    private static final List initializeSupertypes$lambda$1(List list) {
        return list;
    }

    public /* synthetic */ aikb(aiin aiinVar, List list, aikb aikbVar, int i, afeu afeuVar) {
        this(aiinVar, list, (i & 4) != 0 ? null : aikbVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aikb(aiin aiinVar, List<? extends aijf> list, aikb aikbVar) {
        this(aiinVar, new aijy(list), aikbVar, null, 8, null);
        aiinVar.getClass();
        list.getClass();
    }

    public /* synthetic */ aikb(aiin aiinVar, afdr afdrVar, aikb aikbVar, agee ageeVar, int i, afeu afeuVar) {
        this(aiinVar, (i & 2) != 0 ? null : afdrVar, (i & 4) != 0 ? null : aikbVar, (i & 8) != 0 ? null : ageeVar);
    }
}
