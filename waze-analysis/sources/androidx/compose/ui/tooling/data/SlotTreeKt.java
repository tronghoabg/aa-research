package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.LocationSourceInformation;
import androidx.compose.runtime.tooling.ParameterSourceInformation;
import androidx.compose.runtime.tooling.SourceInformation;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.g.a.q;
import h.g.a.r;
import h.g.b.x;
import h.h.a;
import h.n.f;
import h.n.g;
import h.n.l;
import h.n.o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SlotTreeKt {
    private static final int BITS_PER_SLOT = 3;
    private static final int SLOT_MASK = 7;
    private static final int STABLE_BITS = 4;
    private static final int STATIC_BITS = 3;
    private static final String changedFieldName = "$$changed";
    private static final String defaultFieldName = "$$default";
    private static final String internalFieldPrefix = "$$";
    private static final String jacocoDataField = "$jacoco";
    private static final String parameterPrefix = "$";
    private static final String recomposeScopeNameSuffix = ".RecomposeScopeImpl";
    private static final IntRect emptyBox = new IntRect(0, 0, 0, 0);
    private static final l indyLambdaRegex = new l("^f\\$\\d+$");
    private static final l legacyLambdaRegex = new l("^\\$([^$]+)$|\\$\\$.*?\\$-([^$]+)\\$\\d+$");

    private static final Field accessibleField(Class<?> cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i2];
            if (x.n(field.getName(), str)) {
                break;
            }
            i2++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    public static final Group asTree(CompositionData compositionData) {
        CompositionGroup compositionGroup = (CompositionGroup) i.Q(compositionData.getCompositionGroups());
        return compositionGroup != null ? getGroup(compositionGroup, null) : EmptyGroup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect boundsOfLayoutNode(LayoutInfo layoutInfo) {
        LayoutCoordinates coordinates = layoutInfo.getCoordinates();
        if (!layoutInfo.isAttached() || !coordinates.isAttached()) {
            return new IntRect(0, 0, layoutInfo.getWidth(), layoutInfo.getHeight());
        }
        long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(coordinates);
        if ((((9223372034707292159L & jPositionInWindow) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) {
            return new IntRect(0, 0, layoutInfo.getWidth(), layoutInfo.getHeight());
        }
        long jMo9743getSizeYbymL2g = coordinates.mo9743getSizeYbymL2g();
        int iB = a.b(Float.intBitsToFloat((int) (jPositionInWindow >> 32)));
        int iB2 = a.b(Float.intBitsToFloat((int) (jPositionInWindow & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        return new IntRect(iB, iB2, ((int) (jMo9743getSizeYbymL2g >> 32)) + iB, ((int) (jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + iB2);
    }

    private static final ParameterInformation buildParameterInfo(Field field, Object obj, int i2, int i3, int i4, ParameterSourceInformation parameterSourceInformation) throws IllegalAccessException, IllegalArgumentException {
        String strSubstring;
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        if (parameterSourceInformation == null || (strSubstring = parameterSourceInformation.getName()) == null) {
            strSubstring = field.getName().substring(1);
            x.e(strSubstring, "substring(...)");
        }
        String str = strSubstring;
        int i5 = (i2 * 3) + 1;
        int i6 = (7 << i5) & i4;
        boolean z = ((1 << i2) & i3) != 0;
        int i7 = i6 >> i5;
        int i8 = i7 & 3;
        return new ParameterInformation(str, obj2, z, i8 == 3, i8 == 0 && !z, parameterSourceInformation != null ? parameterSourceInformation.getInlineClass() : null, (i7 & 4) == 0);
    }

    private static final List<ParameterInformation> extractFromIndyLambdaFields(List<Field> list, Object obj, List<ParameterSourceInformation> list2) {
        boolean z;
        Object next;
        List listAl = i.al(list, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractFromIndyLambdaFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String name = ((Field) t).getName();
                Integer numF = o.f(o.B(name, "f$", name));
                Integer numValueOf = Integer.valueOf(numF != null ? numF.intValue() : Integer.MAX_VALUE);
                String name2 = ((Field) t2).getName();
                Integer numF2 = o.f(o.B(name2, "f$", name2));
                return h.b.a.a(numValueOf, Integer.valueOf(numF2 != null ? numF2.intValue() : Integer.MAX_VALUE));
            }
        });
        int i2 = 0;
        if (list2.isEmpty()) {
            z = true;
            break;
        }
        List<ParameterSourceInformation> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((ParameterSourceInformation) it.next()).getName() != null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        List listAm = z ? i.am(listAl, list2.size()) : listAl;
        int size = z ? list2.size() : listAl.size();
        Field field = (Field) i.S(listAl, size);
        Object obj2 = field != null ? field.get(obj) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Field field2 = (Field) i.S(listAl, size + 1);
        Object obj3 = field2 != null ? field2.get(obj) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List list4 = listAm;
        ArrayList arrayList = new ArrayList(i.q(list4, 10));
        Iterator it2 = list4.iterator();
        while (true) {
            int i3 = i2;
            if (!it2.hasNext()) {
                return arrayList;
            }
            Object next2 = it2.next();
            i2 = i3 + 1;
            if (i3 < 0) {
                i.p();
            }
            Field field3 = (Field) next2;
            Iterator<T> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (((ParameterSourceInformation) next).getSortedIndex() == i3) {
                    break;
                }
            }
            Object obj4 = obj;
            arrayList.add(buildParameterInfo(field3, obj4, i3, iIntValue2, iIntValue, (ParameterSourceInformation) next));
            obj = obj4;
        }
    }

    private static final List<ParameterInformation> extractFromLegacyFields(List<Field> list, Object obj, List<ParameterSourceInformation> list2) throws IllegalAccessException, IllegalArgumentException {
        Field field;
        ParameterSourceInformation parameterSourceInformation;
        Field field2;
        int i2;
        int i3;
        ParameterInformation parameterInformationBuildParameterInfo;
        Object next;
        Object obj2 = obj;
        Class<?> cls = obj2.getClass();
        Field fieldAccessibleField = accessibleField(cls, defaultFieldName);
        Object obj3 = fieldAccessibleField != null ? fieldAccessibleField.get(obj2) : null;
        Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Field fieldAccessibleField2 = accessibleField(cls, changedFieldName);
        Object obj4 = fieldAccessibleField2 != null ? fieldAccessibleField2.get(obj2) : null;
        Integer num2 = obj4 instanceof Integer ? (Integer) obj4 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List<Field> list3 = list;
        List listAl = i.al(list3, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractFromLegacyFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return h.b.a.a(SlotTreeKt.extractFromLegacyFields$extractedName((Field) t), SlotTreeKt.extractFromLegacyFields$extractedName((Field) t2));
            }
        });
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj5 : list3) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                i.p();
            }
            ParameterSourceInformation parameterSourceInformation2 = (ParameterSourceInformation) i.S(list2, i4);
            if (parameterSourceInformation2 == null) {
                parameterSourceInformation2 = new ParameterSourceInformation(i4, null, null, 6, null);
            }
            int sortedIndex = parameterSourceInformation2.getSortedIndex();
            if (sortedIndex >= list.size()) {
                i2 = iIntValue;
                parameterInformationBuildParameterInfo = null;
            } else {
                if (parameterSourceInformation2.getName() != null) {
                    Iterator<T> it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (x.n(parameterSourceInformation2.getName(), extractFromLegacyFields$extractedName((Field) next))) {
                            break;
                        }
                    }
                    field = (Field) next;
                } else {
                    field = null;
                }
                if (field == null) {
                    field = (Field) listAl.get(sortedIndex);
                }
                if (parameterSourceInformation2.getName() == null) {
                    parameterSourceInformation = new ParameterSourceInformation(sortedIndex, extractFromLegacyFields$extractedName(field), parameterSourceInformation2.getInlineClass());
                    i2 = iIntValue;
                    i3 = i4;
                    field2 = field;
                } else {
                    parameterSourceInformation = parameterSourceInformation2;
                    field2 = field;
                    i2 = iIntValue;
                    i3 = i4;
                }
                parameterInformationBuildParameterInfo = buildParameterInfo(field2, obj2, i3, i2, iIntValue2, parameterSourceInformation);
            }
            if (parameterInformationBuildParameterInfo != null) {
                arrayList.add(parameterInformationBuildParameterInfo);
            }
            obj2 = obj;
            iIntValue = i2;
            i4 = i5;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String extractFromLegacyFields$extractedName(Field field) {
        f fVarA;
        g gVarH = l.h(legacyLambdaRegex, field.getName());
        h.n.i iVarE = gVarH != null ? gVarH.e() : null;
        if (iVarE == null || (fVarA = iVarE.a(1)) == null) {
            fVarA = iVarE != null ? iVarE.a(2) : null;
        }
        if (fVarA != null) {
            return fVarA.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ParameterInformation> extractParameterInfo(List<? extends Object> list, SourceInformationContext sourceInformationContext) {
        Object next;
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && o.l(next.getClass().getName(), recomposeScopeNameSuffix, false)) {
                break;
            }
        }
        if (next == null) {
            return i.h();
        }
        Field fieldAccessibleField = accessibleField(next.getClass(), "block");
        if (fieldAccessibleField == null || (obj = fieldAccessibleField.get(next)) == null) {
            return i.h();
        }
        List<ParameterSourceInformation> parameters = sourceInformationContext != null ? sourceInformationContext.getParameters() : null;
        if (parameters == null) {
            parameters = i.h();
        }
        Class<?> cls = obj.getClass();
        try {
            List<Field> listFilterParameterFields = filterParameterFields(cls.getDeclaredFields(), true);
            return !listFilterParameterFields.isEmpty() ? extractFromIndyLambdaFields(listFilterParameterFields, obj, parameters) : extractFromLegacyFields(filterParameterFields(cls.getDeclaredFields(), false), obj, parameters);
        } catch (Exception unused) {
            return i.h();
        }
    }

    private static final List<Field> filterParameterFields(Field[] fieldArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Field field : fieldArr) {
            String name = field.getName();
            if ((z ? indyLambdaRegex.g(name) : legacyLambdaRegex.g(name)) && !o.ah(name, jacocoDataField)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    public static final List<ParameterInformation> findParameters(CompositionGroup compositionGroup, ContextCache contextCache) {
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo == null) {
            return i.h();
        }
        SourceInformationContext sourceInformationContextSourceInformationContextOf$default = null;
        if (contextCache == null) {
            sourceInformationContextSourceInformationContextOf$default = sourceInformationContextOf$default(sourceInfo, null, 2, null);
        } else {
            Map<String, Object> contexts$ui_tooling_data = contextCache.getContexts$ui_tooling_data();
            Object objSourceInformationContextOf$default = contexts$ui_tooling_data.get(sourceInfo);
            if (objSourceInformationContextOf$default == null) {
                objSourceInformationContextOf$default = sourceInformationContextOf$default(sourceInfo, null, 2, null);
                contexts$ui_tooling_data.put(sourceInfo, objSourceInformationContextOf$default);
            }
            if (objSourceInformationContextOf$default instanceof SourceInformationContext) {
                sourceInformationContextSourceInformationContextOf$default = (SourceInformationContext) objSourceInformationContextOf$default;
            }
        }
        ArrayList arrayList = new ArrayList();
        i.aD(arrayList, compositionGroup.getData());
        return extractParameterInfo(arrayList, sourceInformationContextSourceInformationContextOf$default);
    }

    public static /* synthetic */ List findParameters$default(CompositionGroup compositionGroup, ContextCache contextCache, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            contextCache = null;
        }
        return findParameters(compositionGroup, contextCache);
    }

    public static final IntRect getEmptyBox() {
        return emptyBox;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.ui.tooling.data.Group getGroup(androidx.compose.runtime.tooling.CompositionGroup r12, androidx.compose.ui.tooling.data.SourceInformationContext r13) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.data.SlotTreeKt.getGroup(androidx.compose.runtime.tooling.CompositionGroup, androidx.compose.ui.tooling.data.SourceInformationContext):androidx.compose.ui.tooling.data.Group");
    }

    public static final String getPosition(Group group) {
        return keyPosition(group.getKey());
    }

    public static /* synthetic */ void getPosition$annotations(Group group) {
    }

    private static final String keyPosition(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof JoinedKey)) {
            return null;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        String strKeyPosition = keyPosition(joinedKey.getLeft());
        return strKeyPosition != null ? strKeyPosition : keyPosition(joinedKey.getRight());
    }

    public static final <T> T mapTree(CompositionData compositionData, final q<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> qVar, ContextCache contextCache) {
        CompositionGroup compositionGroup = (CompositionGroup) i.Q(compositionData.getCompositionGroups());
        if (compositionGroup == null) {
            return null;
        }
        CompositionCallStack compositionCallStack = new CompositionCallStack(new r() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0
            @Override // h.g.a.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return qVar.invoke((CompositionGroup) obj, (SourceContext) obj2, (List) obj3);
            }
        }, contextCache.getContexts$ui_tooling_data(), null, 4, null);
        ArrayList arrayList = new ArrayList();
        compositionCallStack.convert(compositionGroup, 0, arrayList);
        return (T) i.R(arrayList);
    }

    public static /* synthetic */ Object mapTree$default(CompositionData compositionData, q qVar, ContextCache contextCache, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            contextCache = new ContextCache();
        }
        return mapTree(compositionData, qVar, contextCache);
    }

    public static final <T, R> T mapTreeWithStitching(CompositionData compositionData, r<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? super List<? extends R>, ? extends T> rVar, ContextCache contextCache, Map<CompositionGroup, List<R>> map) {
        CompositionGroup compositionGroup = (CompositionGroup) i.Q(compositionData.getCompositionGroups());
        if (compositionGroup == null) {
            return null;
        }
        CompositionCallStack compositionCallStack = new CompositionCallStack(rVar, contextCache.getContexts$ui_tooling_data(), map);
        ArrayList arrayList = new ArrayList();
        compositionCallStack.convert(compositionGroup, 0, arrayList);
        return (T) i.R(arrayList);
    }

    public static /* synthetic */ Object mapTreeWithStitching$default(CompositionData compositionData, r rVar, ContextCache contextCache, Map map, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            contextCache = new ContextCache();
        }
        if ((i2 & 4) != 0) {
            map = new LinkedHashMap();
        }
        return mapTreeWithStitching(compositionData, rVar, contextCache, map);
    }

    private static final SourceInformationContext sourceInformationContextOf(String str, SourceInformationContext sourceInformationContext) {
        String str2;
        int i2;
        SourceInformation sourceInformation = SourceInformationKt.parseSourceInformation(str);
        Integer numValueOf = null;
        if (sourceInformation == null) {
            return null;
        }
        String functionName = sourceInformation.getFunctionName();
        String sourceFile = sourceInformation.getSourceFile();
        if (sourceFile != null) {
            str2 = sourceFile;
        } else if (sourceInformationContext != null) {
            sourceFile = sourceInformationContext.getSourceFile();
            str2 = sourceFile;
        } else {
            str2 = null;
        }
        if (sourceInformation.getSourceFile() != null) {
            String packageHash = sourceInformation.getPackageHash();
            if (packageHash != null) {
                numValueOf = o.g(packageHash, 36);
            }
        } else if (sourceInformationContext != null) {
            numValueOf = Integer.valueOf(sourceInformationContext.getPackageHash());
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        List<LocationSourceInformation> locations = sourceInformation.getLocations();
        Iterator<LocationSourceInformation> it = sourceInformation.getLocations().iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().isRepeatable()) {
                i2 = i3;
                break;
            }
            i3++;
        }
        return new SourceInformationContext(functionName, str2, iIntValue, locations, i2, sourceInformation.getParameters(), sourceInformation.isCall(), sourceInformation.isInline());
    }

    static /* synthetic */ SourceInformationContext sourceInformationContextOf$default(String str, SourceInformationContext sourceInformationContext, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            sourceInformationContext = null;
        }
        return sourceInformationContextOf(str, sourceInformationContext);
    }

    public static final IntRect union(IntRect intRect, IntRect intRect2) {
        IntRect intRect3 = emptyBox;
        if (x.n(intRect, intRect3)) {
            return intRect2;
        }
        if (x.n(intRect2, intRect3)) {
            return intRect;
        }
        return new IntRect(Math.min(intRect.getLeft(), intRect2.getLeft()), Math.min(intRect.getTop(), intRect2.getTop()), Math.max(intRect.getRight(), intRect2.getRight()), Math.max(intRect.getBottom(), intRect2.getBottom()));
    }
}
