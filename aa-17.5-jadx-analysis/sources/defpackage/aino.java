package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class aino {
    private final afec<agcj, String> additionalCheck;
    private final aing[] checks;
    private final ahnj name;
    private final Collection<ahnj> nameList;
    private final aisp regex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aino(ahnj ahnjVar, aing[] aingVarArr, afec<? super agcj, String> afecVar) {
        this(ahnjVar, (aisp) null, (Collection<ahnj>) null, afecVar, (aing[]) Arrays.copyOf(aingVarArr, aingVarArr.length));
        ahnjVar.getClass();
        aingVarArr.getClass();
        afecVar.getClass();
    }

    public final aink checkAll(agcj agcjVar) {
        agcjVar.getClass();
        for (aing aingVar : this.checks) {
            String strInvoke = aingVar.invoke(agcjVar);
            if (strInvoke != null) {
                return new aini(strInvoke);
            }
        }
        String strInvoke2 = this.additionalCheck.invoke(agcjVar);
        return strInvoke2 != null ? new aini(strInvoke2) : ainj.INSTANCE;
    }

    public final boolean isApplicable(agcj agcjVar) {
        agcjVar.getClass();
        if (this.name != null && !affa.f(agcjVar.getName(), this.name)) {
            return false;
        }
        if (this.regex != null) {
            String strAsString = agcjVar.getName().asString();
            strAsString.getClass();
            if (!this.regex.f(strAsString)) {
                return false;
            }
        }
        Collection<ahnj> collection = this.nameList;
        return collection == null || collection.contains(agcjVar.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private aino(ahnj ahnjVar, aisp aispVar, Collection<ahnj> collection, afec<? super agcj, String> afecVar, aing... aingVarArr) {
        this.name = ahnjVar;
        this.regex = aispVar;
        this.nameList = collection;
        this.additionalCheck = afecVar;
        this.checks = aingVarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aino(Collection<ahnj> collection, aing[] aingVarArr, afec<? super agcj, String> afecVar) {
        this((ahnj) null, (aisp) null, collection, afecVar, (aing[]) Arrays.copyOf(aingVarArr, aingVarArr.length));
        collection.getClass();
        aingVarArr.getClass();
        afecVar.getClass();
    }

    public /* synthetic */ aino(ahnj ahnjVar, aing[] aingVarArr, afec afecVar, int i, afeu afeuVar) {
        this(ahnjVar, aingVarArr, (afec<? super agcj, String>) ((i & 4) != 0 ? ainl.INSTANCE : afecVar));
    }

    public /* synthetic */ aino(Collection collection, aing[] aingVarArr, afec afecVar, int i, afeu afeuVar) {
        this((Collection<ahnj>) collection, aingVarArr, (afec<? super agcj, String>) ((i & 4) != 0 ? ainn.INSTANCE : afecVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aino(aisp aispVar, aing[] aingVarArr, afec<? super agcj, String> afecVar) {
        this((ahnj) null, aispVar, (Collection<ahnj>) null, afecVar, (aing[]) Arrays.copyOf(aingVarArr, aingVarArr.length));
        aispVar.getClass();
        aingVarArr.getClass();
        afecVar.getClass();
    }

    public /* synthetic */ aino(aisp aispVar, aing[] aingVarArr, afec afecVar, int i, afeu afeuVar) {
        this(aispVar, aingVarArr, (afec<? super agcj, String>) ((i & 4) != 0 ? ainm.INSTANCE : afecVar));
    }
}
