package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agcb {
    public static final ahya ALWAYS_SUITABLE_RECEIVER;
    public static final agcc DEFAULT_VISIBILITY;

    @Deprecated
    public static final ahya FALSE_IF_PROTECTED;
    public static final agcc INHERITED;
    public static final agcc INTERNAL;
    public static final agcc INVISIBLE_FAKE;
    public static final Set<agcc> INVISIBLE_FROM_OTHER_MODULES;
    private static final ahya IRRELEVANT_RECEIVER;
    public static final agcc LOCAL;
    private static final ainw MODULE_VISIBILITY_HELPER;
    private static final Map<agcc, Integer> ORDERED_VISIBILITIES;
    public static final agcc PRIVATE;
    public static final agcc PRIVATE_TO_THIS;
    public static final agcc PROTECTED;
    public static final agcc PUBLIC;
    public static final agcc UNKNOWN;
    private static final Map<agey, agcc> visibilitiesMapping;

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcb.$$$reportNull$$$0(int):void");
    }

    static {
        agbs agbsVar = new agbs(ages.INSTANCE);
        PRIVATE = agbsVar;
        agbt agbtVar = new agbt(aget.INSTANCE);
        PRIVATE_TO_THIS = agbtVar;
        agbu agbuVar = new agbu(ageu.INSTANCE);
        PROTECTED = agbuVar;
        agbv agbvVar = new agbv(agep.INSTANCE);
        INTERNAL = agbvVar;
        agbw agbwVar = new agbw(agev.INSTANCE);
        PUBLIC = agbwVar;
        agbx agbxVar = new agbx(ager.INSTANCE);
        LOCAL = agbxVar;
        agby agbyVar = new agby(ageo.INSTANCE);
        INHERITED = agbyVar;
        agbz agbzVar = new agbz(ageq.INSTANCE);
        INVISIBLE_FAKE = agbzVar;
        agca agcaVar = new agca(agew.INSTANCE);
        UNKNOWN = agcaVar;
        INVISIBLE_FROM_OTHER_MODULES = DesugarCollections.unmodifiableSet(woy.di(new agcc[]{agbsVar, agbtVar, agbvVar, agbxVar}));
        HashMap mapNewHashMapWithExpectedSize = aiow.newHashMapWithExpectedSize(4);
        mapNewHashMapWithExpectedSize.put(agbtVar, 0);
        mapNewHashMapWithExpectedSize.put(agbsVar, 0);
        mapNewHashMapWithExpectedSize.put(agbvVar, 1);
        mapNewHashMapWithExpectedSize.put(agbuVar, 1);
        mapNewHashMapWithExpectedSize.put(agbwVar, 2);
        ORDERED_VISIBILITIES = DesugarCollections.unmodifiableMap(mapNewHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = agbwVar;
        IRRELEVANT_RECEIVER = new agbp();
        ALWAYS_SUITABLE_RECEIVER = new agbq();
        FALSE_IF_PROTECTED = new agbr();
        Iterator it = ServiceLoader.load(ainw.class, ainw.class.getClassLoader()).iterator();
        MODULE_VISIBILITY_HELPER = it.hasNext() ? (ainw) it.next() : ainv.INSTANCE;
        visibilitiesMapping = new HashMap();
        recordVisibilityMapping(agbsVar);
        recordVisibilityMapping(agbtVar);
        recordVisibilityMapping(agbuVar);
        recordVisibilityMapping(agbvVar);
        recordVisibilityMapping(agbwVar);
        recordVisibilityMapping(agbxVar);
        recordVisibilityMapping(agbyVar);
        recordVisibilityMapping(agbzVar);
        recordVisibilityMapping(agcaVar);
    }

    public static Integer compare(agcc agccVar, agcc agccVar2) {
        if (agccVar == null) {
            $$$reportNull$$$0(12);
        }
        if (agccVar2 == null) {
            $$$reportNull$$$0(13);
        }
        Integer numCompareTo = agccVar.compareTo(agccVar2);
        if (numCompareTo != null) {
            return numCompareTo;
        }
        Integer numCompareTo2 = agccVar2.compareTo(agccVar);
        if (numCompareTo2 != null) {
            return Integer.valueOf(-numCompareTo2.intValue());
        }
        return null;
    }

    public static agbm findInvisibleMember(ahya ahyaVar, agbm agbmVar, agbi agbiVar, boolean z) {
        agbm agbmVarFindInvisibleMember;
        if (agbmVar == null) {
            $$$reportNull$$$0(8);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(9);
        }
        for (agbm agbmVar2 = (agbm) agbmVar.getOriginal(); agbmVar2 != null && agbmVar2.getVisibility() != LOCAL; agbmVar2 = (agbm) ahst.getParentOfType(agbmVar2, agbm.class)) {
            if (!agbmVar2.getVisibility().isVisible(ahyaVar, agbmVar2, agbiVar, z)) {
                return agbmVar2;
            }
        }
        if (!(agbmVar instanceof agiq) || (agbmVarFindInvisibleMember = findInvisibleMember(ahyaVar, ((agiq) agbmVar).getUnderlyingConstructorDescriptor(), agbiVar, z)) == null) {
            return null;
        }
        return agbmVarFindInvisibleMember;
    }

    public static boolean inSameFile(agbi agbiVar, agbi agbiVar2) {
        if (agbiVar == null) {
            $$$reportNull$$$0(6);
        }
        if (agbiVar2 == null) {
            $$$reportNull$$$0(7);
        }
        agdz containingSourceFile = ahst.getContainingSourceFile(agbiVar2);
        if (containingSourceFile != agdz.NO_SOURCE_FILE) {
            return containingSourceFile.equals(ahst.getContainingSourceFile(agbiVar));
        }
        return false;
    }

    public static boolean isPrivate(agcc agccVar) {
        if (agccVar == null) {
            $$$reportNull$$$0(14);
        }
        return agccVar == PRIVATE || agccVar == PRIVATE_TO_THIS;
    }

    public static boolean isVisibleIgnoringReceiver(agbm agbmVar, agbi agbiVar, boolean z) {
        if (agbmVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(3);
        }
        return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, agbmVar, agbiVar, z) == null;
    }

    private static void recordVisibilityMapping(agcc agccVar) {
        visibilitiesMapping.put(agccVar.getDelegate(), agccVar);
    }

    public static agcc toDescriptorVisibility(agey ageyVar) {
        if (ageyVar == null) {
            $$$reportNull$$$0(15);
        }
        agcc agccVar = visibilitiesMapping.get(ageyVar);
        if (agccVar != null) {
            return agccVar;
        }
        Objects.toString(ageyVar);
        throw new IllegalArgumentException("Inapplicable visibility: ".concat(String.valueOf(ageyVar)));
    }
}
