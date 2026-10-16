package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class aira {
    public static final ajhk b(String str) {
        ajhk ajhkVar = new ajhk(str);
        ajhk.b.put(str, ajhkVar);
        return ajhkVar;
    }

    public static final aiqx<?> getMutableCollectionKClass(ahnf ahnfVar, afhe<?> afheVar) {
        ahnfVar.getClass();
        afheVar.getClass();
        return new aiqx<>(afheVar, ahnfVar.asString(), new aiqy(afheVar, ahnfVar), new aiqz(ahnfVar, afheVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMutableCollectionKClass$lambda$0(afhe afheVar, ahnf ahnfVar, aiqx aiqxVar) {
        aiqxVar.getClass();
        List<afic> typeParameters = afheVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(woy.bp(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            afrv afrvVar = new afrv(aiqxVar, ((afic) it.next()).getName(), (affa.f(ahnfVar, afyn.mutableIterable) || affa.f(ahnfVar, afyn.mutableIterator)) ? afie.c : afie.a, false);
            afrvVar.setUpperBounds(woy.bg(afvm.INSTANCE.getNULLABLE_ANY()));
            arrayList.add(afrvVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMutableCollectionKClass$lambda$1(ahnf ahnfVar, afhe afheVar, aiqx aiqxVar) {
        afhe<?> mutableCollectionClass;
        aiqxVar.getClass();
        if (affa.f(ahnfVar, afyn.mutableCollection)) {
            afib afibVarD = affw.d(affw.g(Iterable.class, afid.a));
            afibVarD.getClass();
            mutableCollectionClass = ((aiqc) afibVarD).getMutableCollectionClass();
            if (mutableCollectionClass == null) {
                afhe afheVarB = affw.b(Iterable.class);
                Objects.toString(afheVarB);
                throw new aftw("No mutable collection class found: ".concat(String.valueOf(afheVarB)));
            }
        } else if (affa.f(ahnfVar, afyn.mutableList)) {
            afib afibVarD2 = affw.d(affw.g(Collection.class, afid.a));
            afibVarD2.getClass();
            mutableCollectionClass = ((aiqc) afibVarD2).getMutableCollectionClass();
            if (mutableCollectionClass == null) {
                afhe afheVarB2 = affw.b(Collection.class);
                Objects.toString(afheVarB2);
                throw new aftw("No mutable collection class found: ".concat(String.valueOf(afheVarB2)));
            }
        } else if (affa.f(ahnfVar, afyn.mutableSet)) {
            afib afibVarD3 = affw.d(affw.g(Collection.class, afid.a));
            afibVarD3.getClass();
            mutableCollectionClass = ((aiqc) afibVarD3).getMutableCollectionClass();
            if (mutableCollectionClass == null) {
                afhe afheVarB3 = affw.b(Collection.class);
                Objects.toString(afheVarB3);
                throw new aftw("No mutable collection class found: ".concat(String.valueOf(afheVarB3)));
            }
        } else if (affa.f(ahnfVar, afyn.mutableListIterator)) {
            afib afibVarD4 = affw.d(affw.g(Iterator.class, afid.a));
            afibVarD4.getClass();
            mutableCollectionClass = ((aiqc) afibVarD4).getMutableCollectionClass();
            if (mutableCollectionClass == null) {
                afhe afheVarB4 = affw.b(Iterator.class);
                Objects.toString(afheVarB4);
                throw new aftw("No mutable collection class found: ".concat(String.valueOf(afheVarB4)));
            }
        } else {
            mutableCollectionClass = null;
        }
        List<afic> typeParameters = aiqxVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(woy.bp(typeParameters, 10));
        for (afic aficVar : typeParameters) {
            afid afidVar = afid.a;
            arrayList.add(afik.f(afik.k(aficVar, null, false, 7)));
        }
        List listDa = woy.da(new afhe[]{afheVar, mutableCollectionClass});
        ArrayList arrayList2 = new ArrayList(woy.bp(listDa, 10));
        Iterator it = listDa.iterator();
        while (it.hasNext()) {
            arrayList2.add(afik.k((afhe) it.next(), arrayList, false, 6));
        }
        return arrayList2;
    }

    public final synchronized ajhk a(String str) {
        ajhk ajhkVar;
        String strConcat;
        str.getClass();
        Map map = ajhk.b;
        ajhkVar = (ajhk) map.get(str);
        if (ajhkVar == null) {
            if (afyh.g(str, "TLS_", false)) {
                String strSubstring = str.substring(4);
                strSubstring.getClass();
                strConcat = "SSL_".concat(strSubstring);
            } else if (afyh.g(str, "SSL_", false)) {
                String strSubstring2 = str.substring(4);
                strSubstring2.getClass();
                strConcat = "TLS_".concat(strSubstring2);
            } else {
                strConcat = str;
            }
            ajhkVar = (ajhk) map.get(strConcat);
            if (ajhkVar == null) {
                ajhkVar = new ajhk(str);
            }
            map.put(str, ajhkVar);
        }
        return ajhkVar;
    }
}
