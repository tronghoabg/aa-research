package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aghr extends aggy implements agdj {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aghr.class, "fragments", "getFragments()Ljava/util/List;", 0), new affn(aghr.class, "empty", "getEmpty()Z", 0)};
    private final aiec empty$delegate;
    private final ahnf fqName;
    private final aiec fragments$delegate;
    private final ahxe memberScope;
    private final agic module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghr(agic agicVar, ahnf ahnfVar, aiei aieiVar) {
        super(agfk.Companion.getEMPTY(), ahnfVar.shortNameOrSpecial());
        agicVar.getClass();
        ahnfVar.getClass();
        aieiVar.getClass();
        this.module = agicVar;
        this.fqName = ahnfVar;
        this.fragments$delegate = aieiVar.createLazyValue(new agho(this));
        this.empty$delegate = aieiVar.createLazyValue(new aghp(this));
        this.memberScope = new ahwz(aieiVar, new aghq(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean empty_delegate$lambda$0(aghr aghrVar) {
        return agdh.isEmpty(aghrVar.getModule().getPackageFragmentProvider(), aghrVar.getFqName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fragments_delegate$lambda$0(aghr aghrVar) {
        return agdh.packageFragments(aghrVar.getModule().getPackageFragmentProvider(), aghrVar.getFqName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahxe memberScope$lambda$0(aghr aghrVar) {
        if (aghrVar.isEmpty()) {
            return ahxd.INSTANCE;
        }
        List<agdc> fragments = aghrVar.getFragments();
        ArrayList arrayList = new ArrayList(woy.bp(fragments, 10));
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            arrayList.add(((agdc) it.next()).getMemberScope());
        }
        List listBZ = woy.bZ(arrayList, new agip(aghrVar.getModule(), aghrVar.getFqName()));
        return ahwl.Companion.create("package view scope for " + aghrVar.getFqName() + " in " + aghrVar.getModule().getName(), listBZ);
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        agbkVar.getClass();
        return agbkVar.visitPackageViewDescriptor(this, d);
    }

    public boolean equals(Object obj) {
        agdj agdjVar = obj instanceof agdj ? (agdj) obj : null;
        return agdjVar != null && affa.f(getFqName(), agdjVar.getFqName()) && affa.f(getModule(), agdjVar.getModule());
    }

    @Override // defpackage.agbi
    public agdj getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        return getModule().getPackage(getFqName().parent());
    }

    protected final boolean getEmpty() {
        return ((Boolean) aieh.getValue(this.empty$delegate, this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // defpackage.agdj
    public ahnf getFqName() {
        return this.fqName;
    }

    @Override // defpackage.agdj
    public List<agdc> getFragments() {
        return (List) aieh.getValue(this.fragments$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.agdj
    public ahxe getMemberScope() {
        return this.memberScope;
    }

    public int hashCode() {
        return (getModule().hashCode() * 31) + getFqName().hashCode();
    }

    @Override // defpackage.agdj
    public boolean isEmpty() {
        return getEmpty();
    }

    @Override // defpackage.agdj
    public agic getModule() {
        return this.module;
    }
}
