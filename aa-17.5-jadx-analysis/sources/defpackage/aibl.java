package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class aibl extends aiek {
    private final aiec<List<agee>> parameters;
    final /* synthetic */ aibt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibl(aibt aibtVar) {
        super(aibtVar.getC().getStorageManager());
        this.this$0 = aibtVar;
        this.parameters = aibtVar.getC().getStorageManager().createLazyValue(new aibk(aibtVar));
    }

    @Override // defpackage.aifc
    protected Collection<aigl> computeSupertypes() {
        aibt aibtVar;
        String strAsString;
        ahnf ahnfVarAsSingleFqName;
        aibt aibtVar2 = this.this$0;
        List<ahjn> listSupertypes = ahlg.supertypes(aibtVar2.getClassProto(), aibtVar2.getC().getTypeTable());
        ArrayList arrayList = new ArrayList(woy.bp(listSupertypes, 10));
        Iterator<T> it = listSupertypes.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            aibtVar = this.this$0;
            if (!zHasNext) {
                break;
            }
            arrayList.add(aibtVar.getC().getTypeDeserializer().type((ahjn) it.next()));
        }
        List listBY = woy.bY(arrayList, aibtVar.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(this.this$0));
        ArrayList<agda> arrayList2 = new ArrayList();
        Iterator it2 = listBY.iterator();
        while (it2.hasNext()) {
            agbd declarationDescriptor = ((aigl) it2.next()).getConstructor().getDeclarationDescriptor();
            agda agdaVar = declarationDescriptor instanceof agda ? (agda) declarationDescriptor : null;
            if (agdaVar != null) {
                arrayList2.add(agdaVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            ahzh errorReporter = this.this$0.getC().getComponents().getErrorReporter();
            aibt aibtVar3 = this.this$0;
            ArrayList arrayList3 = new ArrayList(woy.bp(arrayList2, 10));
            for (agda agdaVar2 : arrayList2) {
                ahnd classId = ahvz.getClassId(agdaVar2);
                if (classId == null || (ahnfVarAsSingleFqName = classId.asSingleFqName()) == null || (strAsString = ahnfVarAsSingleFqName.asString()) == null) {
                    strAsString = agdaVar2.getName().asString();
                    strAsString.getClass();
                }
                arrayList3.add(strAsString);
            }
            errorReporter.reportIncompleteHierarchy(aibtVar3, arrayList3);
        }
        return woy.cf(listBY);
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        return this.parameters.invoke();
    }

    @Override // defpackage.aifc
    protected agec getSupertypeLoopChecker() {
        return ageb.INSTANCE;
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return true;
    }

    public String toString() {
        String string = this.this$0.getName().toString();
        string.getClass();
        return string;
    }

    @Override // defpackage.aiek, defpackage.aifk, defpackage.aiid
    public aibt getDeclarationDescriptor() {
        return this.this$0;
    }
}
