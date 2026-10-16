package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* loaded from: classes3.dex */
final class afrs extends afri {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(afrs.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0), new affn(afrs.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0), new affn(afrs.class, "members", "getMembers()Ljava/util/Collection;", 0)};
    private final aezr kmPackages$delegate;
    private final afup kotlinClass$delegate;
    private final afup members$delegate;
    private final aezr multifileFacade$delegate;
    private final afup scope$delegate;
    final /* synthetic */ afrt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afrs(afrt afrtVar) {
        super(afrtVar);
        this.this$0 = afrtVar;
        this.kmPackages$delegate = woy.dH(2, new afrm(afrtVar, this));
        this.kotlinClass$delegate = afus.lazySoft(new afrn(afrtVar));
        this.scope$delegate = afus.lazySoft(new afro(this));
        this.multifileFacade$delegate = woy.dH(2, new afrp(this, afrtVar));
        this.members$delegate = afus.lazySoft(new afrq(this, afrtVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List kmPackages_delegate$lambda$0(afrt afrtVar, afrs afrsVar) throws ClassNotFoundException {
        if (!afvn.getLoadMetadataDirectly()) {
            ahxe scope = afrsVar.getScope();
            List<ahxe> listBg = scope instanceof aict ? woy.bg(scope) : scope instanceof ahwl ? ((ahwl) scope).getComponentScopes() : afbe.a;
            ArrayList arrayList = new ArrayList(woy.bp(listBg, 10));
            for (ahxe ahxeVar : listBg) {
                ahxeVar.getClass();
                aict aictVar = (aict) ahxeVar;
                arrayList.add(agpo.toKmPackage$default(aictVar.getProto(), aictVar.getC().getNameResolver(), false, null, 6, null));
            }
            return arrayList;
        }
        Metadata metadata = (Metadata) afrtVar.getJClass().getAnnotation(Metadata.class);
        agqx lenient = metadata != null ? agqx.Companion.readLenient(metadata) : null;
        if (lenient instanceof agqs) {
            return woy.bg(((agqs) lenient).getKmPackage());
        }
        if (lenient instanceof agqu) {
            return woy.bg(((agqu) lenient).getKmPackage());
        }
        if (!(lenient instanceof agqt)) {
            return afbe.a;
        }
        List<String> partClassNames = ((agqt) lenient).getPartClassNames();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = partClassNames.iterator();
        while (it.hasNext()) {
            Class<?> clsLoadClass = agkc.getSafeClassLoader(afrtVar.getJClass()).loadClass(afyh.I((String) it.next(), '/', '.'));
            clsLoadClass.getClass();
            afhg orCreateKotlinPackage = afjc.getOrCreateKotlinPackage(clsLoadClass);
            orCreateKotlinPackage.getClass();
            woy.cq(arrayList2, ((afrs) ((afrt) orCreateKotlinPackage).data.a()).getKmPackages());
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agjk kotlinClass_delegate$lambda$0(afrt afrtVar) {
        return agjk.Factory.create(afrtVar.getJClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List members_delegate$lambda$0(afrs afrsVar, afrt afrtVar) {
        if (afvn.getUseK1Implementation()) {
            afrr afrrVar = new afrr(afrtVar);
            Collection<agbi> contributedDescriptors$default = ahxh.getContributedDescriptors$default(afrsVar.getScope(), null, null, 3, null);
            ArrayList arrayList = new ArrayList();
            for (agbi agbiVar : contributedDescriptors$default) {
                afko afkoVar = agbiVar instanceof agax ? (afko) agbiVar.accept(afrrVar, afak.a) : null;
                if (afkoVar != null) {
                    arrayList.add(afkoVar);
                }
            }
            return woy.cf(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (agoi agoiVar : afrsVar.getKmPackages()) {
            Iterator<agoj> it = agoiVar.getProperties().iterator();
            while (it.hasNext()) {
                arrayList2.add(afjz.createUnboundProperty(it.next(), afrtVar));
            }
            Iterator<agog> it2 = agoiVar.getFunctions().iterator();
            while (it2.hasNext()) {
                arrayList2.add(afjz.createUnboundFunction(it2.next(), afrtVar));
            }
        }
        return woy.cf(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class multifileFacade_delegate$lambda$0(afrs afrsVar, afrt afrtVar) {
        ahgb classHeader;
        agjk kotlinClass = afrsVar.getKotlinClass();
        String multifileClassName = (kotlinClass == null || (classHeader = kotlinClass.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
        if (multifileClassName == null || multifileClassName.length() <= 0) {
            return null;
        }
        return agkc.getSafeClassLoader(afrtVar.getJClass()).loadClass(afyh.I(multifileClassName, '/', '.'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahxe scope_delegate$lambda$0(afrs afrsVar) {
        agjk kotlinClass = afrsVar.getKotlinClass();
        return kotlinClass != null ? afrsVar.getModuleData().getPackagePartScopeCache().getPackagePartScope(kotlinClass) : ahxd.INSTANCE;
    }

    public final List<agoi> getKmPackages() {
        return (List) this.kmPackages$delegate.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final agjk getKotlinClass() {
        return (agjk) this.kotlinClass$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final Collection<afhd<?>> getMembers() {
        T value = this.members$delegate.getValue(this, $$delegatedProperties[2]);
        value.getClass();
        return (Collection) value;
    }

    public final Class<?> getMultifileFacade() {
        return (Class) this.multifileFacade$delegate.a();
    }

    public final ahxe getScope() {
        T value = this.scope$delegate.getValue(this, $$delegatedProperties[1]);
        value.getClass();
        return (ahxe) value;
    }
}
