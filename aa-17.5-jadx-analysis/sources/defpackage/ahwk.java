package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahwk {
    private ahwk() {
    }

    public final ahxe create(String str, Iterable<? extends ahxe> iterable) {
        str.getClass();
        iterable.getClass();
        aipr aiprVar = new aipr();
        for (ahxe ahxeVar : iterable) {
            if (ahxeVar != ahxd.INSTANCE) {
                if (ahxeVar instanceof ahwl) {
                    woy.cr(aiprVar, ((ahwl) ahxeVar).scopes);
                } else {
                    aiprVar.add(ahxeVar);
                }
            }
        }
        return createOrSingle$org_jetbrains_kotlin_descriptors(str, aiprVar);
    }

    public final ahxe createOrSingle$org_jetbrains_kotlin_descriptors(String str, List<? extends ahxe> list) {
        str.getClass();
        list.getClass();
        int size = list.size();
        return size != 0 ? size != 1 ? new ahwl(str, (ahxe[]) list.toArray(new ahxe[0]), null) : list.get(0) : ahxd.INSTANCE;
    }

    public /* synthetic */ ahwk(afeu afeuVar) {
        this();
    }
}
