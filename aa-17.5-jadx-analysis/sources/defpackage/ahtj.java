package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* loaded from: classes3.dex */
public final class ahtj {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ahtj DEFAULT;
    private static final aijo DEFAULT_TYPE_CONSTRUCTOR_EQUALITY;
    private static final List<ExternalOverridabilityCondition> EXTERNAL_CONDITIONS = woy.cf(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
    private final afeg<aigl, aigl, Boolean> customSubtype;
    private final aijo equalityAxioms;
    private final aijs kotlinTypePreparator;
    private final aiju kotlinTypeRefiner;

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r24) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtj.$$$reportNull$$$0(int):void");
    }

    static {
        ahta ahtaVar = new ahta();
        DEFAULT_TYPE_CONSTRUCTOR_EQUALITY = ahtaVar;
        DEFAULT = new ahtj(ahtaVar, aijt.INSTANCE, aijq.INSTANCE, null);
    }

    private ahtj(aijo aijoVar, aiju aijuVar, aijs aijsVar, afeg<aigl, aigl, Boolean> afegVar) {
        if (aijoVar == null) {
            $$$reportNull$$$0(5);
        }
        if (aijuVar == null) {
            $$$reportNull$$$0(6);
        }
        if (aijsVar == null) {
            $$$reportNull$$$0(7);
        }
        this.equalityAxioms = aijoVar;
        this.kotlinTypeRefiner = aijuVar;
        this.kotlinTypePreparator = aijsVar;
        this.customSubtype = afegVar;
    }

    private static boolean allHasSameContainingDeclaration(Collection<agax> collection) {
        if (collection == null) {
            $$$reportNull$$$0(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        ahtc ahtcVar = new ahtc(collection.iterator().next().getContainingDeclaration());
        collection.getClass();
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!((Boolean) ahtcVar.invoke((ahtc) it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean areTypeParametersEquivalent(defpackage.agee r4, defpackage.agee r5, defpackage.aiic r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 47
            $$$reportNull$$$0(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            $$$reportNull$$$0(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            $$$reportNull$$$0(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            aigl r5 = (defpackage.aigl) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            aigl r3 = (defpackage.aigl) r3
            boolean r3 = areTypesEquivalent(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahtj.areTypeParametersEquivalent(agee, agee, aiic):boolean");
    }

    private static boolean areTypesEquivalent(aigl aiglVar, aigl aiglVar2, aiic aiicVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(44);
        }
        if (aiglVar2 == null) {
            $$$reportNull$$$0(45);
        }
        if (aiicVar == null) {
            $$$reportNull$$$0(46);
        }
        if (aigr.isError(aiglVar) && aigr.isError(aiglVar2)) {
            return true;
        }
        return aier.INSTANCE.equalTypes(aiicVar, aiglVar.unwrap(), aiglVar2.unwrap());
    }

    private static ahti checkReceiverAndParameterCount(agav agavVar, agav agavVar2) {
        if ((agavVar.getExtensionReceiverParameter() == null) != (agavVar2.getExtensionReceiverParameter() == null)) {
            return ahti.incompatible("Receiver presence mismatch");
        }
        if (agavVar.getValueParameters().size() != agavVar2.getValueParameters().size()) {
            return ahti.incompatible("Value parameter number mismatch");
        }
        return null;
    }

    private static void collectOverriddenDeclarations(agax agaxVar, Set<agax> set) {
        if (agaxVar == null) {
            $$$reportNull$$$0(17);
        }
        if (set == null) {
            $$$reportNull$$$0(18);
        }
        if (agaxVar.getKind().isReal()) {
            set.add(agaxVar);
        } else {
            if (agaxVar.getOverriddenDescriptors().isEmpty()) {
                Objects.toString(agaxVar);
                throw new IllegalStateException("No overridden descriptors found for (fake override) ".concat(String.valueOf(agaxVar)));
            }
            Iterator<? extends agax> it = agaxVar.getOverriddenDescriptors().iterator();
            while (it.hasNext()) {
                collectOverriddenDeclarations(it.next(), set);
            }
        }
    }

    private static List<aigl> compiledValueParameters(agav agavVar) {
        agdq extensionReceiverParameter = agavVar.getExtensionReceiverParameter();
        ArrayList arrayList = new ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.getType());
        }
        Iterator<agel> it = agavVar.getValueParameters().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    private static agcc computeVisibilityToInherit(agax agaxVar) {
        if (agaxVar == null) {
            $$$reportNull$$$0(106);
        }
        Collection<? extends agax> overriddenDescriptors = agaxVar.getOverriddenDescriptors();
        agcc agccVarFindMaxVisibility = findMaxVisibility(overriddenDescriptors);
        if (agccVarFindMaxVisibility == null) {
            return null;
        }
        if (agaxVar.getKind() != agaw.FAKE_OVERRIDE) {
            return agccVarFindMaxVisibility.normalize();
        }
        for (agax agaxVar2 : overriddenDescriptors) {
            if (agaxVar2.getModality() != agcq.ABSTRACT && !agaxVar2.getVisibility().equals(agccVarFindMaxVisibility)) {
                return null;
            }
        }
        return agccVarFindMaxVisibility;
    }

    public static ahtj create(aiju aijuVar, aijo aijoVar) {
        if (aijuVar == null) {
            $$$reportNull$$$0(3);
        }
        if (aijoVar == null) {
            $$$reportNull$$$0(4);
        }
        return new ahtj(aijoVar, aijuVar, aijq.INSTANCE, null);
    }

    private static void createAndBindFakeOverride(Collection<agax> collection, agba agbaVar, ahsz ahszVar) {
        if (collection == null) {
            $$$reportNull$$$0(83);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(84);
        }
        if (ahszVar == null) {
            $$$reportNull$$$0(85);
        }
        Collection<agax> collectionFilterVisibleFakeOverrides = filterVisibleFakeOverrides(agbaVar, collection);
        boolean zIsEmpty = collectionFilterVisibleFakeOverrides.isEmpty();
        if (true != zIsEmpty) {
            collection = collectionFilterVisibleFakeOverrides;
        }
        agax agaxVarCopy = ((agax) selectMostSpecificMember(collection, new ahtd())).copy(agbaVar, determineModalityForFakeOverride(collection, agbaVar), zIsEmpty ? agcb.INVISIBLE_FAKE : agcb.INHERITED, agaw.FAKE_OVERRIDE, false);
        ahszVar.setOverriddenDescriptors(agaxVarCopy, collection);
        ahszVar.addFakeOverride(agaxVarCopy);
    }

    private static void createAndBindFakeOverrides(agba agbaVar, Collection<agax> collection, ahsz ahszVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(62);
        }
        if (collection == null) {
            $$$reportNull$$$0(63);
        }
        if (ahszVar == null) {
            $$$reportNull$$$0(64);
        }
        if (allHasSameContainingDeclaration(collection)) {
            Iterator<agax> it = collection.iterator();
            while (it.hasNext()) {
                createAndBindFakeOverride(Collections.singleton(it.next()), agbaVar, ahszVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                createAndBindFakeOverride(extractMembersOverridableInBothWays(ahtu.findMemberWithMaxVisibility(linkedList), linkedList, ahszVar), agbaVar, ahszVar);
            }
        }
    }

    private aiic createTypeCheckerState(List<agee> list, List<agee> list2) {
        if (list == null) {
            $$$reportNull$$$0(40);
        }
        if (list2 == null) {
            $$$reportNull$$$0(41);
        }
        afeg<aigl, aigl, Boolean> afegVar = this.customSubtype;
        if (list.isEmpty()) {
            return new ahtk(null, this.equalityAxioms, this.kotlinTypeRefiner, this.kotlinTypePreparator, afegVar).newTypeCheckerState(true, true, false);
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).getTypeConstructor(), list2.get(i).getTypeConstructor());
        }
        return new ahtk(map, this.equalityAxioms, this.kotlinTypeRefiner, this.kotlinTypePreparator, afegVar).newTypeCheckerState(true, true, false);
    }

    public static ahtj createWithTypeRefiner(aiju aijuVar) {
        if (aijuVar == null) {
            $$$reportNull$$$0(0);
        }
        return new ahtj(DEFAULT_TYPE_CONSTRUCTOR_EQUALITY, aijuVar, aijq.INSTANCE, null);
    }

    private static agcq determineModalityForFakeOverride(Collection<agax> collection, agba agbaVar) {
        if (collection == null) {
            $$$reportNull$$$0(86);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(87);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (agax agaxVar : collection) {
            agcp agcpVar = agcq.Companion;
            int iOrdinal = agaxVar.getModality().ordinal();
            if (iOrdinal == 0) {
                agcq agcqVar = agcq.FINAL;
                if (agcqVar == null) {
                    $$$reportNull$$$0(88);
                }
                return agcqVar;
            }
            if (iOrdinal == 1) {
                Objects.toString(agaxVar);
                throw new IllegalStateException("Member cannot have SEALED modality: ".concat(String.valueOf(agaxVar)));
            }
            if (iOrdinal == 2) {
                z2 = true;
            } else if (iOrdinal == 3) {
                z3 = true;
            }
        }
        if (agbaVar.isExpect() && agbaVar.getModality() != agcq.ABSTRACT && agbaVar.getModality() != agcq.SEALED) {
            z = true;
        }
        if (z2 && !z3) {
            agcq agcqVar2 = agcq.OPEN;
            if (agcqVar2 == null) {
                $$$reportNull$$$0(89);
            }
            return agcqVar2;
        }
        if (!z2 && z3) {
            agcq modality = z ? agbaVar.getModality() : agcq.ABSTRACT;
            if (modality == null) {
                $$$reportNull$$$0(90);
            }
            return modality;
        }
        HashSet hashSet = new HashSet();
        Iterator<agax> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(getOverriddenDeclarations(it.next()));
        }
        return getMinimalModality(filterOutOverridden(hashSet), z, agbaVar.getModality());
    }

    private Collection<agax> extractAndBindOverridesForMember(agax agaxVar, Collection<? extends agax> collection, agba agbaVar, ahsz ahszVar) {
        if (agaxVar == null) {
            $$$reportNull$$$0(57);
        }
        if (collection == null) {
            $$$reportNull$$$0(58);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(59);
        }
        if (ahszVar == null) {
            $$$reportNull$$$0(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        aipv aipvVarCreate = aipv.create();
        for (agax agaxVar2 : collection) {
            ahth result = isOverridableBy(agaxVar2, agaxVar, agbaVar).getResult();
            boolean zIsVisibleForOverride = isVisibleForOverride(agaxVar, agaxVar2, false);
            agcp agcpVar = agcq.Companion;
            int iOrdinal = result.ordinal();
            if (iOrdinal == 0) {
                if (zIsVisibleForOverride) {
                    aipvVarCreate.add(agaxVar2);
                }
                arrayList.add(agaxVar2);
            } else if (iOrdinal == 2) {
                if (zIsVisibleForOverride) {
                    ahszVar.overrideConflict(agaxVar2, agaxVar);
                }
                arrayList.add(agaxVar2);
            }
        }
        ahszVar.setOverriddenDescriptors(agaxVar, aipvVarCreate);
        return arrayList;
    }

    public static <H> Collection<H> extractMembersOverridableInBothWays(H h, Collection<H> collection, afec<H, agav> afecVar, afec<H, afak> afecVar2) {
        if (h == null) {
            $$$reportNull$$$0(97);
        }
        if (collection == null) {
            $$$reportNull$$$0(98);
        }
        if (afecVar == null) {
            $$$reportNull$$$0(99);
        }
        if (afecVar2 == null) {
            $$$reportNull$$$0(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        agav agavVarInvoke = afecVar.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            agav agavVarInvoke2 = afecVar.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                ahth bothWaysOverridability = getBothWaysOverridability(agavVarInvoke, agavVarInvoke2);
                if (bothWaysOverridability == ahth.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (bothWaysOverridability == ahth.CONFLICT) {
                    afecVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static <D extends agav> Set<D> filterOutOverridden(Set<D> set) {
        if (set == null) {
            $$$reportNull$$$0(8);
        }
        boolean z = false;
        if (!set.isEmpty() && ahvz.isTypeRefinementEnabled(ahvz.getModule(set.iterator().next()))) {
            z = true;
        }
        return filterOverrides(set, z, null, new ahtb());
    }

    public static <D> Set<D> filterOverrides(Set<D> set, boolean z, afdr afdrVar, afeg<? super D, ? super D, aezu<agav, agav>> afegVar) {
        if (set == null) {
            $$$reportNull$$$0(9);
        }
        if (afegVar == null) {
            $$$reportNull$$$0(10);
        }
        if (set.size() <= 1) {
            if (set == null) {
                $$$reportNull$$$0(11);
            }
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (afdrVar != null) {
                afdrVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                aezu<agav, agav> aezuVarInvoke = afegVar.invoke(obj, (Object) it.next());
                agav agavVar = (agav) aezuVarInvoke.a;
                agav agavVar2 = (agav) aezuVarInvoke.b;
                if (!overrides(agavVar, agavVar2, z, true)) {
                    if (overrides(agavVar2, agavVar, z, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection<agax> filterVisibleFakeOverrides(agba agbaVar, Collection<agax> collection) {
        if (agbaVar == null) {
            $$$reportNull$$$0(94);
        }
        if (collection == null) {
            $$$reportNull$$$0(95);
        }
        return woy.bT(collection, new ahte(agbaVar));
    }

    public static agcc findMaxVisibility(Collection<? extends agax> collection) {
        agcc agccVar;
        if (collection == null) {
            $$$reportNull$$$0(107);
        }
        if (collection.isEmpty()) {
            return agcb.DEFAULT_VISIBILITY;
        }
        Iterator<? extends agax> it = collection.iterator();
        loop0: while (true) {
            agccVar = null;
            while (it.hasNext()) {
                agcc visibility = it.next().getVisibility();
                if (agccVar != null) {
                    Integer numCompare = agcb.compare(visibility, agccVar);
                    if (numCompare == null) {
                        break;
                    }
                    if (numCompare.intValue() > 0) {
                    }
                }
                agccVar = visibility;
            }
        }
        if (agccVar == null) {
            return null;
        }
        Iterator<? extends agax> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numCompare2 = agcb.compare(agccVar, it2.next().getVisibility());
            if (numCompare2 == null || numCompare2.intValue() < 0) {
                return null;
            }
        }
        return agccVar;
    }

    public static ahti getBasicOverridabilityProblem(agav agavVar, agav agavVar2) {
        boolean z;
        if (agavVar == null) {
            $$$reportNull$$$0(38);
        }
        if (agavVar2 == null) {
            $$$reportNull$$$0(39);
        }
        boolean z2 = agavVar instanceof agcj;
        if ((z2 && !(agavVar2 instanceof agcj)) || (((z = agavVar instanceof agdn)) && !(agavVar2 instanceof agdn))) {
            return ahti.incompatible("Member kind mismatch");
        }
        if (!z2 && !z) {
            Objects.toString(agavVar);
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: ".concat(String.valueOf(agavVar)));
        }
        if (!agavVar.getName().equals(agavVar2.getName())) {
            return ahti.incompatible("Name mismatch");
        }
        ahti ahtiVarCheckReceiverAndParameterCount = checkReceiverAndParameterCount(agavVar, agavVar2);
        if (ahtiVarCheckReceiverAndParameterCount != null) {
            return ahtiVarCheckReceiverAndParameterCount;
        }
        return null;
    }

    public static ahth getBothWaysOverridability(agav agavVar, agav agavVar2) {
        ahtj ahtjVar = DEFAULT;
        ahth result = ahtjVar.isOverridableBy(agavVar2, agavVar, null).getResult();
        ahth result2 = ahtjVar.isOverridableBy(agavVar, agavVar2, null).getResult();
        ahth ahthVar = ahth.OVERRIDABLE;
        if (result == ahthVar && result2 == ahthVar) {
            return ahthVar;
        }
        ahth ahthVar2 = ahth.CONFLICT;
        return (result == ahthVar2 || result2 == ahthVar2) ? ahthVar2 : ahth.INCOMPATIBLE;
    }

    private static agcq getMinimalModality(Collection<agax> collection, boolean z, agcq agcqVar) {
        if (collection == null) {
            $$$reportNull$$$0(91);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(92);
        }
        agcq agcqVar2 = agcq.ABSTRACT;
        for (agax agaxVar : collection) {
            agcq modality = (z && agaxVar.getModality() == agcq.ABSTRACT) ? agcqVar : agaxVar.getModality();
            if (modality.compareTo(agcqVar2) < 0) {
                agcqVar2 = modality;
            }
        }
        if (agcqVar2 == null) {
            $$$reportNull$$$0(93);
        }
        return agcqVar2;
    }

    public static Set<agax> getOverriddenDeclarations(agax agaxVar) {
        if (agaxVar == null) {
            $$$reportNull$$$0(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        collectOverriddenDeclarations(agaxVar, linkedHashSet);
        return linkedHashSet;
    }

    private static boolean isAccessorMoreSpecific(agdm agdmVar, agdm agdmVar2) {
        if (agdmVar == null || agdmVar2 == null) {
            return true;
        }
        return isVisibilityMoreSpecific(agdmVar, agdmVar2);
    }

    public static boolean isMoreSpecific(agav agavVar, agav agavVar2) {
        if (agavVar == null) {
            $$$reportNull$$$0(65);
        }
        if (agavVar2 == null) {
            $$$reportNull$$$0(66);
        }
        aigl returnType = agavVar.getReturnType();
        aigl returnType2 = agavVar2.getReturnType();
        if (!isVisibilityMoreSpecific(agavVar, agavVar2)) {
            return false;
        }
        aiic aiicVarCreateTypeCheckerState = DEFAULT.createTypeCheckerState(agavVar.getTypeParameters(), agavVar2.getTypeParameters());
        if (agavVar instanceof agcj) {
            return isReturnTypeMoreSpecific(agavVar, returnType, agavVar2, returnType2, aiicVarCreateTypeCheckerState);
        }
        if (!(agavVar instanceof agdn)) {
            Class<?> cls = agavVar.getClass();
            Objects.toString(cls);
            throw new IllegalArgumentException("Unexpected callable: ".concat(String.valueOf(cls)));
        }
        agdn agdnVar = (agdn) agavVar;
        agdn agdnVar2 = (agdn) agavVar2;
        if (isAccessorMoreSpecific(agdnVar.getSetter(), agdnVar2.getSetter())) {
            return (agdnVar.isVar() && agdnVar2.isVar()) ? aier.INSTANCE.equalTypes(aiicVarCreateTypeCheckerState, returnType.unwrap(), returnType2.unwrap()) : (agdnVar.isVar() || !agdnVar2.isVar()) && isReturnTypeMoreSpecific(agavVar, returnType, agavVar2, returnType2, aiicVarCreateTypeCheckerState);
        }
        return false;
    }

    private static boolean isMoreSpecificThenAllOf(agav agavVar, Collection<agav> collection) {
        if (agavVar == null) {
            $$$reportNull$$$0(69);
        }
        if (collection == null) {
            $$$reportNull$$$0(70);
        }
        Iterator<agav> it = collection.iterator();
        while (it.hasNext()) {
            if (!isMoreSpecific(agavVar, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean isReturnTypeMoreSpecific(agav agavVar, aigl aiglVar, agav agavVar2, aigl aiglVar2, aiic aiicVar) {
        if (agavVar == null) {
            $$$reportNull$$$0(71);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(72);
        }
        if (agavVar2 == null) {
            $$$reportNull$$$0(73);
        }
        if (aiglVar2 == null) {
            $$$reportNull$$$0(74);
        }
        if (aiicVar == null) {
            $$$reportNull$$$0(75);
        }
        return aier.INSTANCE.isSubtypeOf(aiicVar, aiglVar.unwrap(), aiglVar2.unwrap());
    }

    private static boolean isVisibilityMoreSpecific(agbm agbmVar, agbm agbmVar2) {
        if (agbmVar == null) {
            $$$reportNull$$$0(67);
        }
        if (agbmVar2 == null) {
            $$$reportNull$$$0(68);
        }
        Integer numCompare = agcb.compare(agbmVar.getVisibility(), agbmVar2.getVisibility());
        return numCompare == null || numCompare.intValue() >= 0;
    }

    public static boolean isVisibleForOverride(agco agcoVar, agco agcoVar2, boolean z) {
        if (agcoVar == null) {
            $$$reportNull$$$0(55);
        }
        if (agcoVar2 == null) {
            $$$reportNull$$$0(56);
        }
        return !agcb.isPrivate(agcoVar2.getVisibility()) && agcb.isVisibleIgnoringReceiver(agcoVar2, agcoVar, z);
    }

    public static <D extends agav> boolean overrides(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            $$$reportNull$$$0(13);
        }
        if (d2 == null) {
            $$$reportNull$$$0(14);
        }
        if (!d.equals(d2) && ahsq.INSTANCE.areEquivalent(d.getOriginal(), d2.getOriginal(), z, z2)) {
            return true;
        }
        agav original = d2.getOriginal();
        Iterator it = ahst.getAllOverriddenDescriptors(d).iterator();
        while (it.hasNext()) {
            if (ahsq.INSTANCE.areEquivalent(original, (agav) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    public static void resolveUnknownVisibilityForMember(agax agaxVar, afec<agax, afak> afecVar) {
        agcc agccVar;
        if (agaxVar == null) {
            $$$reportNull$$$0(105);
        }
        for (agax agaxVar2 : agaxVar.getOverriddenDescriptors()) {
            if (agaxVar2.getVisibility() == agcb.INHERITED) {
                resolveUnknownVisibilityForMember(agaxVar2, afecVar);
            }
        }
        if (agaxVar.getVisibility() != agcb.INHERITED) {
            return;
        }
        agcc agccVarComputeVisibilityToInherit = computeVisibilityToInherit(agaxVar);
        if (agccVarComputeVisibilityToInherit == null) {
            if (afecVar != null) {
                afecVar.invoke(agaxVar);
            }
            agccVar = agcb.PUBLIC;
        } else {
            agccVar = agccVarComputeVisibilityToInherit;
        }
        if (agaxVar instanceof agik) {
            ((agik) agaxVar).setVisibility(agccVar);
            Iterator<agdm> it = ((agdn) agaxVar).getAccessors().iterator();
            while (it.hasNext()) {
                resolveUnknownVisibilityForMember(it.next(), agccVarComputeVisibilityToInherit == null ? null : afecVar);
            }
            return;
        }
        if (agaxVar instanceof aghm) {
            ((aghm) agaxVar).setVisibility(agccVar);
            return;
        }
        agii agiiVar = (agii) agaxVar;
        agiiVar.setVisibility(agccVar);
        if (agccVar != agiiVar.getCorrespondingProperty().getVisibility()) {
            agiiVar.setDefault(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H selectMostSpecificMember(Collection<H> collection, afec<H, agav> afecVar) {
        H h;
        if (collection == null) {
            $$$reportNull$$$0(76);
        }
        if (afecVar == 0) {
            $$$reportNull$$$0(77);
        }
        if (collection.size() == 1) {
            H h2 = (H) woy.bE(collection);
            if (h2 == null) {
                $$$reportNull$$$0(78);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        collection.getClass();
        afecVar.getClass();
        ArrayList arrayList2 = new ArrayList(woy.bp(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(afecVar.invoke(it.next()));
        }
        H h3 = (H) woy.bE(collection);
        agav agavVar = (agav) afecVar.invoke(h3);
        for (H h4 : collection) {
            agav agavVar2 = (agav) afecVar.invoke(h4);
            if (isMoreSpecificThenAllOf(agavVar2, arrayList2)) {
                arrayList.add(h4);
            }
            if (isMoreSpecific(agavVar2, agavVar) && !isMoreSpecific(agavVar, agavVar2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                $$$reportNull$$$0(79);
            }
            return h3;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) woy.bE(arrayList);
            if (h5 == null) {
                $$$reportNull$$$0(80);
            }
            return h5;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                h = null;
                break;
            }
            h = (H) arrayList.get(i);
            i++;
            if (!aige.isFlexible(((agav) afecVar.invoke(h)).getReturnType())) {
                break;
            }
        }
        if (h != null) {
            return h;
        }
        H h6 = (H) woy.bE(arrayList);
        if (h6 == null) {
            $$$reportNull$$$0(82);
        }
        return h6;
    }

    public void generateOverridesInFunctionGroup(ahnj ahnjVar, Collection<? extends agax> collection, Collection<? extends agax> collection2, agba agbaVar, ahsz ahszVar) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(50);
        }
        if (collection == null) {
            $$$reportNull$$$0(51);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(52);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(53);
        }
        if (ahszVar == null) {
            $$$reportNull$$$0(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends agax> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(extractAndBindOverridesForMember(it.next(), collection, agbaVar, ahszVar));
        }
        createAndBindFakeOverrides(agbaVar, linkedHashSet, ahszVar);
    }

    public ahti isOverridableBy(agav agavVar, agav agavVar2, agba agbaVar, boolean z) {
        if (agavVar == null) {
            $$$reportNull$$$0(22);
        }
        if (agavVar2 == null) {
            $$$reportNull$$$0(23);
        }
        ahti ahtiVarIsOverridableByWithoutExternalConditions = isOverridableByWithoutExternalConditions(agavVar, agavVar2, z);
        boolean z2 = ahtiVarIsOverridableByWithoutExternalConditions.getResult() == ahth.OVERRIDABLE;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : EXTERNAL_CONDITIONS) {
            if (externalOverridabilityCondition.getContract() != ahsu.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.getContract() != ahsu.SUCCESS_ONLY)) {
                ahsv ahsvVarIsOverridable = externalOverridabilityCondition.isOverridable(agavVar, agavVar2, agbaVar);
                agcp agcpVar = agcq.Companion;
                int iOrdinal = ahsvVarIsOverridable.ordinal();
                if (iOrdinal == 0) {
                    z2 = true;
                } else if (iOrdinal == 1) {
                    return ahti.incompatible("External condition");
                }
            }
        }
        if (!z2) {
            if (ahtiVarIsOverridableByWithoutExternalConditions == null) {
                $$$reportNull$$$0(25);
            }
            return ahtiVarIsOverridableByWithoutExternalConditions;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : EXTERNAL_CONDITIONS) {
            if (externalOverridabilityCondition2.getContract() == ahsu.CONFLICTS_ONLY) {
                ahsv ahsvVarIsOverridable2 = externalOverridabilityCondition2.isOverridable(agavVar, agavVar2, agbaVar);
                agcp agcpVar2 = agcq.Companion;
                int iOrdinal2 = ahsvVarIsOverridable2.ordinal();
                if (iOrdinal2 == 0) {
                    throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iOrdinal2 == 1) {
                    return ahti.incompatible("External condition");
                }
            }
        }
        ahti ahtiVarSuccess = ahti.success();
        if (ahtiVarSuccess == null) {
            $$$reportNull$$$0(27);
        }
        return ahtiVarSuccess;
    }

    public ahti isOverridableByWithoutExternalConditions(agav agavVar, agav agavVar2, boolean z) {
        if (agavVar == null) {
            $$$reportNull$$$0(28);
        }
        if (agavVar2 == null) {
            $$$reportNull$$$0(29);
        }
        ahti basicOverridabilityProblem = getBasicOverridabilityProblem(agavVar, agavVar2);
        if (basicOverridabilityProblem != null) {
            return basicOverridabilityProblem;
        }
        List<aigl> listCompiledValueParameters = compiledValueParameters(agavVar);
        List<aigl> listCompiledValueParameters2 = compiledValueParameters(agavVar2);
        List<agee> typeParameters = agavVar.getTypeParameters();
        List<agee> typeParameters2 = agavVar2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < listCompiledValueParameters.size()) {
                if (!aijp.DEFAULT.equalTypes(listCompiledValueParameters.get(i), listCompiledValueParameters2.get(i))) {
                    return ahti.incompatible("Type parameter number mismatch");
                }
                i++;
            }
            return ahti.conflict("Type parameter number mismatch");
        }
        aiic aiicVarCreateTypeCheckerState = createTypeCheckerState(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!areTypeParametersEquivalent(typeParameters.get(i2), typeParameters2.get(i2), aiicVarCreateTypeCheckerState)) {
                return ahti.incompatible("Type parameter bounds mismatch");
            }
        }
        while (i < listCompiledValueParameters.size()) {
            if (!areTypesEquivalent(listCompiledValueParameters.get(i), listCompiledValueParameters2.get(i), aiicVarCreateTypeCheckerState)) {
                return ahti.incompatible("Value parameter type mismatch");
            }
            i++;
        }
        if ((agavVar instanceof agcj) && (agavVar2 instanceof agcj) && ((agcj) agavVar).isSuspend() != ((agcj) agavVar2).isSuspend()) {
            return ahti.conflict("Incompatible suspendability");
        }
        if (z) {
            aigl returnType = agavVar.getReturnType();
            aigl returnType2 = agavVar2.getReturnType();
            if (returnType != null && returnType2 != null && ((!aigr.isError(returnType2) || !aigr.isError(returnType)) && !aier.INSTANCE.isSubtypeOf(aiicVarCreateTypeCheckerState, returnType2.unwrap(), returnType.unwrap()))) {
                return ahti.conflict("Return type mismatch");
            }
        }
        ahti ahtiVarSuccess = ahti.success();
        if (ahtiVarSuccess == null) {
            $$$reportNull$$$0(37);
        }
        return ahtiVarSuccess;
    }

    private static Collection<agax> extractMembersOverridableInBothWays(agax agaxVar, Queue<agax> queue, ahsz ahszVar) {
        if (agaxVar == null) {
            $$$reportNull$$$0(102);
        }
        if (queue == null) {
            $$$reportNull$$$0(103);
        }
        if (ahszVar == null) {
            $$$reportNull$$$0(104);
        }
        return extractMembersOverridableInBothWays(agaxVar, queue, new ahtf(), new ahtg(ahszVar, agaxVar));
    }

    public ahti isOverridableBy(agav agavVar, agav agavVar2, agba agbaVar) {
        if (agavVar == null) {
            $$$reportNull$$$0(19);
        }
        if (agavVar2 == null) {
            $$$reportNull$$$0(20);
        }
        ahti ahtiVarIsOverridableBy = isOverridableBy(agavVar, agavVar2, agbaVar, false);
        if (ahtiVarIsOverridableBy == null) {
            $$$reportNull$$$0(21);
        }
        return ahtiVarIsOverridableBy;
    }
}
