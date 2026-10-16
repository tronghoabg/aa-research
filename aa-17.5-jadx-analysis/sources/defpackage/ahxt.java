package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahxt extends ahwj {
    public static final ahxs Companion = new ahxs(null);
    private final String debugName;
    private final ahxe workerScope;

    private ahxt(String str, ahxe ahxeVar) {
        this.debugName = str;
        this.workerScope = ahxeVar;
    }

    static /* synthetic */ agav accessor$TypeIntersectionScope$lambda0(agdv agdvVar) {
        getContributedFunctions$lambda$0(agdvVar);
        return agdvVar;
    }

    static /* synthetic */ agav accessor$TypeIntersectionScope$lambda1(agdn agdnVar) {
        getContributedVariables$lambda$0(agdnVar);
        return agdnVar;
    }

    static /* synthetic */ agav accessor$TypeIntersectionScope$lambda2(agav agavVar) {
        getContributedDescriptors$lambda$1(agavVar);
        return agavVar;
    }

    public static final ahxe create(String str, Collection<? extends aigl> collection) {
        return Companion.create(str, collection);
    }

    private static final agav getContributedDescriptors$lambda$1(agav agavVar) {
        agavVar.getClass();
        return agavVar;
    }

    private static final agav getContributedFunctions$lambda$0(agdv agdvVar) {
        agdvVar.getClass();
        return agdvVar;
    }

    private static final agav getContributedVariables$lambda$0(agdn agdnVar) {
        agdnVar.getClass();
        return agdnVar;
    }

    @Override // defpackage.ahwj, defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        Collection<agbi> contributedDescriptors = super.getContributedDescriptors(ahwtVar, afecVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : contributedDescriptors) {
            if (((agbi) obj) instanceof agav) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        aezu aezuVar = new aezu(arrayList, arrayList2);
        List list = (List) aezuVar.a;
        List list2 = (List) aezuVar.b;
        list.getClass();
        return woy.bY(ahtm.selectMostSpecificInEachOverridableGroup(list, ahxr.INSTANCE), list2);
    }

    @Override // defpackage.ahwj, defpackage.ahxe, defpackage.ahxi
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return ahtm.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(ahnjVar, agloVar), ahxp.INSTANCE);
    }

    @Override // defpackage.ahwj, defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return ahtm.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(ahnjVar, agloVar), ahxq.INSTANCE);
    }

    @Override // defpackage.ahwj
    protected ahxe getWorkerScope() {
        return this.workerScope;
    }

    public /* synthetic */ ahxt(String str, ahxe ahxeVar, afeu afeuVar) {
        this(str, ahxeVar);
    }
}
