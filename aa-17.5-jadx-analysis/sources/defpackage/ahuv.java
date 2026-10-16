package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahuv implements aiid {
    public static final ahuu Companion = new ahuu(null);
    private final agcu module;
    private final Set<aigl> possibleTypes;
    private final aezr supertypes$delegate;
    private final aigw type;
    private final long value;

    /* JADX WARN: Multi-variable type inference failed */
    private ahuv(long j, agcu agcuVar, Set<? extends aigl> set) {
        this.type = aigq.integerLiteralType(aihr.Companion.getEmpty(), this, false);
        this.supertypes$delegate = woy.dG(new ahur(this));
        this.value = j;
        this.module = agcuVar;
        this.possibleTypes = set;
    }

    private final List<aigl> getSupertypes() {
        return (List) this.supertypes$delegate.a();
    }

    private final boolean isContainsOnlyUnsignedTypes() {
        Collection<aigl> allSignedLiteralTypes = ahvf.getAllSignedLiteralTypes(this.module);
        if (allSignedLiteralTypes.isEmpty()) {
            return true;
        }
        Iterator<T> it = allSignedLiteralTypes.iterator();
        while (it.hasNext()) {
            if (this.possibleTypes.contains((aigl) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List supertypes_delegate$lambda$0(ahuv ahuvVar) {
        aigw defaultType = ahuvVar.getBuiltIns().getComparable().getDefaultType();
        defaultType.getClass();
        List listBk = woy.bk(aiiu.replace$default(defaultType, woy.bg(new aiip(aijg.IN_VARIANCE, ahuvVar.type)), null, 2, null));
        if (!ahuvVar.isContainsOnlyUnsignedTypes()) {
            listBk.add(ahuvVar.getBuiltIns().getNumberType());
        }
        return listBk;
    }

    private final String valueToString() {
        return "[" + woy.cu(this.possibleTypes, ",", null, null, ahus.INSTANCE, 30) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence valueToString$lambda$0(aigl aiglVar) {
        aiglVar.getClass();
        return aiglVar.toString();
    }

    @Override // defpackage.aiid
    public afye getBuiltIns() {
        return this.module.getBuiltIns();
    }

    @Override // defpackage.aiid
    public agbd getDeclarationDescriptor() {
        return null;
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        return afbe.a;
    }

    public final Set<aigl> getPossibleTypes() {
        return this.possibleTypes;
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return false;
    }

    @Override // defpackage.aiid
    public aiid refine(aiju aijuVar) {
        aijuVar.getClass();
        return this;
    }

    public String toString() {
        return "IntegerLiteralType".concat(valueToString());
    }

    @Override // defpackage.aiid
    /* renamed from: getSupertypes, reason: collision with other method in class */
    public Collection<aigl> mo89getSupertypes() {
        return getSupertypes();
    }

    public /* synthetic */ ahuv(long j, agcu agcuVar, Set set, afeu afeuVar) {
        this(j, agcuVar, set);
    }
}
