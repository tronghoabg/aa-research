package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aiaa implements ahyn {
    private final Map<ahnd, ahhc> classIdToProto;
    private final afec<ahnd, agdx> classSource;
    private final ahkv metadataVersion;
    private final ahld nameResolver;

    /* JADX WARN: Multi-variable type inference failed */
    public aiaa(ahip ahipVar, ahld ahldVar, ahkv ahkvVar, afec<? super ahnd, ? extends agdx> afecVar) {
        ahipVar.getClass();
        ahldVar.getClass();
        ahkvVar.getClass();
        afecVar.getClass();
        this.nameResolver = ahldVar;
        this.metadataVersion = ahkvVar;
        this.classSource = afecVar;
        List<ahhc> class_List = ahipVar.getClass_List();
        class_List.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(class_List, 10)), 16));
        for (Object obj : class_List) {
            linkedHashMap.put(ahzz.getClassId(this.nameResolver, ((ahhc) obj).getFqName()), obj);
        }
        this.classIdToProto = linkedHashMap;
    }

    @Override // defpackage.ahyn
    public ahym findClassData(ahnd ahndVar) {
        ahndVar.getClass();
        ahhc ahhcVar = this.classIdToProto.get(ahndVar);
        if (ahhcVar == null) {
            return null;
        }
        return new ahym(this.nameResolver, ahhcVar, this.metadataVersion, this.classSource.invoke(ahndVar));
    }

    public final Collection<ahnd> getAllClassIds() {
        return this.classIdToProto.keySet();
    }
}
