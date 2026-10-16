package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class afyv extends aiek {
    final /* synthetic */ afyw this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyv(afyw afywVar) {
        super(afywVar.storageManager);
        this.this$0 = afywVar;
    }

    @Override // defpackage.aifc
    protected Collection<aigl> computeSupertypes() {
        List<ahnd> listBi;
        afzh functionTypeKind = this.this$0.getFunctionTypeKind();
        if (affa.f(functionTypeKind, afzd.INSTANCE)) {
            listBi = woy.bg(afyw.functionClassId);
        } else if (affa.f(functionTypeKind, afze.INSTANCE)) {
            listBi = woy.bi(afyw.kFunctionClassId, new ahnd(afyo.BUILT_INS_PACKAGE_FQ_NAME, afzd.INSTANCE.numberedClassName(this.this$0.getArity())));
        } else if (affa.f(functionTypeKind, afzg.INSTANCE)) {
            listBi = woy.bg(afyw.functionClassId);
        } else {
            if (!affa.f(functionTypeKind, afzf.INSTANCE)) {
                aiqa.shouldNotBeCalled$default(null, 1, null);
                throw new aezp();
            }
            listBi = woy.bi(afyw.kFunctionClassId, new ahnd(afyo.COROUTINES_PACKAGE_FQ_NAME, afzg.INSTANCE.numberedClassName(this.this$0.getArity())));
        }
        agcu containingDeclaration = this.this$0.containingDeclaration.getContainingDeclaration();
        ArrayList arrayList = new ArrayList(woy.bp(listBi, 10));
        for (ahnd ahndVar : listBi) {
            agba agbaVarFindClassAcrossModuleDependencies = agch.findClassAcrossModuleDependencies(containingDeclaration, ahndVar);
            if (agbaVarFindClassAcrossModuleDependencies == null) {
                throw new IllegalStateException(a.bm(ahndVar, "Built-in class ", " not found"));
            }
            List listCe = woy.ce(getParameters(), agbaVarFindClassAcrossModuleDependencies.getTypeConstructor().getParameters().size());
            ArrayList arrayList2 = new ArrayList(woy.bp(listCe, 10));
            Iterator it = listCe.iterator();
            while (it.hasNext()) {
                arrayList2.add(new aiip(((agee) it.next()).getDefaultType()));
            }
            arrayList.add(aigq.simpleNotNullType(aihr.Companion.getEmpty(), agbaVarFindClassAcrossModuleDependencies, arrayList2));
        }
        return woy.cf(arrayList);
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        return this.this$0.parameters;
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
        return getDeclarationDescriptor().toString();
    }

    @Override // defpackage.aiek, defpackage.aifk, defpackage.aiid
    public afyw getDeclarationDescriptor() {
        return this.this$0;
    }
}
