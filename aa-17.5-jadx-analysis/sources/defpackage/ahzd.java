package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ahzd extends ahza {
    private ahxe _memberScope;
    private ahip _proto;
    private final aiaa classDataFinder;
    private final aibv containerSource;
    private final ahkv metadataVersion;
    private final ahle nameResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzd(ahnf ahnfVar, aiei aieiVar, agcu agcuVar, ahip ahipVar, ahkv ahkvVar, aibv aibvVar) {
        super(ahnfVar, aieiVar, agcuVar);
        ahnfVar.getClass();
        aieiVar.getClass();
        agcuVar.getClass();
        ahipVar.getClass();
        ahkvVar.getClass();
        this.metadataVersion = ahkvVar;
        this.containerSource = aibvVar;
        ahjf strings = ahipVar.getStrings();
        strings.getClass();
        ahja qualifiedNames = ahipVar.getQualifiedNames();
        qualifiedNames.getClass();
        ahle ahleVar = new ahle(strings, qualifiedNames);
        this.nameResolver = ahleVar;
        this.classDataFinder = new aiaa(ahipVar, ahleVar, ahkvVar, new ahzb(this));
        this._proto = ahipVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdx classDataFinder$lambda$0(ahzd ahzdVar, ahnd ahndVar) {
        ahndVar.getClass();
        aibv aibvVar = ahzdVar.containerSource;
        if (aibvVar != null) {
            return aibvVar;
        }
        agdx agdxVar = agdx.NO_SOURCE;
        agdxVar.getClass();
        return agdxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection initialize$lambda$0(ahzd ahzdVar) {
        Collection<ahnd> allClassIds = ahzdVar.getClassDataFinder().getAllClassIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allClassIds) {
            ahnd ahndVar = (ahnd) obj;
            if (!ahndVar.isNestedClass() && !ahyr.Companion.getBLACK_LIST().contains(ahndVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ahnd) it.next()).getShortClassName());
        }
        return arrayList2;
    }

    @Override // defpackage.agdc
    public ahxe getMemberScope() {
        ahxe ahxeVar = this._memberScope;
        if (ahxeVar != null) {
            return ahxeVar;
        }
        affa.d("_memberScope");
        return null;
    }

    @Override // defpackage.ahza
    public void initialize(ahyv ahyvVar) {
        ahyvVar.getClass();
        ahip ahipVar = this._proto;
        if (ahipVar == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this._proto = null;
        ahim ahimVar = ahipVar.getPackage();
        ahimVar.getClass();
        ahle ahleVar = this.nameResolver;
        ahkv ahkvVar = this.metadataVersion;
        aibv aibvVar = this.containerSource;
        toString();
        this._memberScope = new aict(this, ahimVar, ahleVar, ahkvVar, aibvVar, ahyvVar, "scope of ".concat(toString()), new ahzc(this));
    }

    @Override // defpackage.ahza
    public aiaa getClassDataFinder() {
        return this.classDataFinder;
    }
}
