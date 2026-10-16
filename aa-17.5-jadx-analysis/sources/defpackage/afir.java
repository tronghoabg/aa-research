package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afir {
    public static final Collection a(afhe afheVar) {
        Collection<afhd<?>> members = afheVar.getMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : members) {
            if (obj instanceof afhh) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final afib b(afhe afheVar) {
        afheVar.getClass();
        List<afic> listAllTypeParameters = aiqj.allTypeParameters(afheVar);
        ArrayList arrayList = new ArrayList(woy.bp(listAllTypeParameters, 10));
        Iterator<T> it = listAllTypeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(new afid(afie.a, afik.k((afic) it.next(), null, false, 7)));
        }
        return afik.k(afheVar, arrayList, false, 6);
    }

    public static final boolean c(afhe afheVar, afhe afheVar2) {
        afheVar.getClass();
        afheVar2.getClass();
        return affa.f(afheVar, afheVar2) || aipd.ifAny(woy.bg(afheVar), new afio(new affn() { // from class: afiq
            @Override // defpackage.affn, defpackage.afhx
            public final Object get(Object obj) {
                afhe afheVar3 = (afhe) obj;
                afheVar3.getClass();
                List<afib> supertypes = afheVar3.getSupertypes();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = supertypes.iterator();
                while (it.hasNext()) {
                    afhf classifier = ((afib) it.next()).getClassifier();
                    afhe afheVar4 = classifier instanceof afhe ? (afhe) classifier : null;
                    if (afheVar4 != null) {
                        arrayList.add(afheVar4);
                    }
                }
                return arrayList;
            }
        }), new afip(afheVar2)).booleanValue();
    }

    public static final List d(afhd afhdVar) {
        afhdVar.getClass();
        List<afhr> parameters = afhdVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((afhr) obj).getKind() == afhq.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final afhe e(afhf afhfVar) {
        Object obj;
        if (afhfVar instanceof afhe) {
            return (afhe) afhfVar;
        }
        if (!(afhfVar instanceof afic)) {
            Objects.toString(afhfVar);
            throw new aftw("Cannot calculate JVM erasure for type: ".concat(afhfVar.toString()));
        }
        List<afib> upperBounds = ((afic) afhfVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            afhf classifier = ((afib) next).getClassifier();
            afqw afqwVar = classifier instanceof afqw ? (afqw) classifier : null;
            if (afqwVar != null && afqwVar.getClassKind$kotlin_reflection() != agmp.INTERFACE && afqwVar.getClassKind$kotlin_reflection() != agmp.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        afib afibVar = (afib) obj;
        if (afibVar == null) {
            afibVar = (afib) woy.bH(upperBounds);
        }
        return afibVar != null ? f(afibVar) : affw.b(Object.class);
    }

    public static final afhe f(afib afibVar) {
        afhe afheVarE;
        afibVar.getClass();
        afhf classifier = afibVar.getClassifier();
        if (classifier != null && (afheVarE = e(classifier)) != null) {
            return afheVarE;
        }
        Objects.toString(afibVar);
        throw new aftw("Cannot calculate JVM erasure for type: ".concat(afibVar.toString()));
    }

    public static final String g(afhe afheVar) {
        afheVar.getClass();
        String name = ((afqw) afheVar).getJClass().getName();
        name.getClass();
        return name;
    }
}
