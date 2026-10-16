package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agje {
    private final ConcurrentHashMap<ahnd, ahxe> cache;
    private final agjl kotlinClassFinder;
    private final ahen resolver;

    public agje(ahen ahenVar, agjl agjlVar) {
        ahenVar.getClass();
        agjlVar.getClass();
        this.resolver = ahenVar;
        this.kotlinClassFinder = agjlVar;
        this.cache = new ConcurrentHashMap<>();
    }

    public final ahxe getPackagePartScope(agjk agjkVar) {
        Collection collectionBg;
        agjkVar.getClass();
        ConcurrentHashMap<ahnd, ahxe> concurrentHashMap = this.cache;
        ahnd classId = agjkVar.getClassId();
        ahxe ahxeVarCreate = concurrentHashMap.get(classId);
        if (ahxeVarCreate == null) {
            ahnf packageFqName = agjkVar.getClassId().getPackageFqName();
            if (agjkVar.getClassHeader().getKind() == ahga.MULTIFILE_CLASS) {
                List<String> multifilePartNames = agjkVar.getClassHeader().getMultifilePartNames();
                collectionBg = new ArrayList();
                Iterator<T> it = multifilePartNames.iterator();
                while (it.hasNext()) {
                    ahfj ahfjVarFindKotlinClass = ahfd.findKotlinClass(this.kotlinClassFinder, ahnd.Companion.topLevel(ahwd.byInternalName((String) it.next()).getFqNameForTopLevelClassMaybeWithDollars()), this.resolver.getComponents().getConfiguration().getMetadataVersion());
                    if (ahfjVarFindKotlinClass != null) {
                        collectionBg.add(ahfjVarFindKotlinClass);
                    }
                }
            } else {
                collectionBg = woy.bg(agjkVar);
            }
            aghb aghbVar = new aghb(this.resolver.getComponents().getModuleDescriptor(), packageFqName);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collectionBg.iterator();
            while (it2.hasNext()) {
                ahxe ahxeVarCreateKotlinPackagePartScope = this.resolver.createKotlinPackagePartScope(aghbVar, (ahfj) it2.next());
                if (ahxeVarCreateKotlinPackagePartScope != null) {
                    arrayList.add(ahxeVarCreateKotlinPackagePartScope);
                }
            }
            ahxeVarCreate = ahwl.Companion.create(a.cj((byte) 41, agjkVar, packageFqName, "package ", " ("), woy.cf(arrayList));
            ahxe ahxeVarPutIfAbsent = concurrentHashMap.putIfAbsent(classId, ahxeVarCreate);
            if (ahxeVarPutIfAbsent != null) {
                ahxeVarCreate = ahxeVarPutIfAbsent;
            }
        }
        ahxeVarCreate.getClass();
        return ahxeVarCreate;
    }
}
