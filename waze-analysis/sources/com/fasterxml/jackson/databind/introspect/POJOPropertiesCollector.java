package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.jdk14.JDK14Util;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class POJOPropertiesCollector {
    protected final AccessorNamingStrategy _accessorNaming;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected LinkedList<AnnotatedMember> _anyGetterField;
    protected LinkedList<AnnotatedMember> _anyGetters;
    protected LinkedList<AnnotatedMember> _anySetterField;
    protected LinkedList<AnnotatedMethod> _anySetters;
    protected final AnnotatedClass _classDef;
    protected boolean _collected;
    protected final MapperConfig<?> _config;
    protected List<POJOPropertyBuilder> _creatorProperties;
    protected Map<PropertyName, PropertyName> _fieldRenameMappings;
    protected final boolean _forSerialization;
    protected JsonFormat.Value _formatOverrides;
    protected HashSet<String> _ignoredPropertyNames;
    protected LinkedHashMap<Object, AnnotatedMember> _injectables;
    protected final boolean _isRecordType;
    protected LinkedList<AnnotatedMember> _jsonKeyAccessors;
    protected LinkedList<AnnotatedMember> _jsonValueAccessors;
    protected PotentialCreators _potentialCreators;
    protected LinkedHashMap<String, POJOPropertyBuilder> _properties;
    protected final JavaType _type;
    protected final boolean _useAnnotations;
    protected final VisibilityChecker<?> _visibilityChecker;

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor;

        static {
            int[] iArr = new int[ConstructorDetector.SingleArgConstructor.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor = iArr;
            try {
                iArr[ConstructorDetector.SingleArgConstructor.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[ConstructorDetector.SingleArgConstructor.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[ConstructorDetector.SingleArgConstructor.REQUIRE_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[ConstructorDetector.SingleArgConstructor.HEURISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[JsonCreator.Mode.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode = iArr2;
            try {
                iArr2[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[JsonCreator.Mode.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[JsonCreator.Mode.PROPERTIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[JsonCreator.Mode.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    protected POJOPropertiesCollector(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, AnnotatedClass annotatedClass, AccessorNamingStrategy accessorNamingStrategy) {
        this._config = mapperConfig;
        this._forSerialization = z;
        this._type = javaType;
        this._classDef = annotatedClass;
        this._isRecordType = javaType.isRecordType();
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this._useAnnotations = true;
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        } else {
            this._useAnnotations = false;
            this._annotationIntrospector = AnnotationIntrospector.nopInstance();
        }
        this._visibilityChecker = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), annotatedClass);
        this._accessorNaming = accessorNamingStrategy;
    }

    private void _addCreatorParams(Map<String, POJOPropertyBuilder> map, PotentialCreator potentialCreator, List<POJOPropertyBuilder> list) {
        boolean z;
        POJOPropertyBuilder pOJOPropertyBuilder_property;
        int iParamCount = potentialCreator.paramCount();
        for (int i2 = 0; i2 < iParamCount; i2++) {
            AnnotatedParameter annotatedParameterParam = potentialCreator.param(i2);
            PropertyName propertyNameExplicitName = potentialCreator.explicitName(i2);
            PropertyName propertyNameImplicitName = potentialCreator.implicitName(i2);
            boolean z2 = true;
            if (propertyNameExplicitName != null) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (z2 || propertyNameImplicitName != null) {
                if (propertyNameImplicitName != null) {
                    propertyNameImplicitName = PropertyName.construct(_checkRenameByField(propertyNameImplicitName.getSimpleName()));
                }
                POJOPropertyBuilder pOJOPropertyBuilder_property2 = propertyNameImplicitName == null ? _property(map, propertyNameExplicitName) : _property(map, propertyNameImplicitName);
                if (z == z2) {
                    propertyNameImplicitName = propertyNameExplicitName;
                }
                pOJOPropertyBuilder_property = pOJOPropertyBuilder_property2;
                pOJOPropertyBuilder_property.addCtor(annotatedParameterParam, propertyNameImplicitName, z2, true, false);
            } else if (this._annotationIntrospector.findUnwrappingNameTransformer(annotatedParameterParam) != null) {
                PropertyName propertyNameCreatorParamName = UnwrappedPropertyHandler.creatorParamName(annotatedParameterParam.getIndex());
                pOJOPropertyBuilder_property = _property(map, propertyNameCreatorParamName);
                pOJOPropertyBuilder_property.addCtor(annotatedParameterParam, propertyNameCreatorParamName, false, true, false);
            } else {
                pOJOPropertyBuilder_property = null;
            }
            list.add(pOJOPropertyBuilder_property);
        }
        potentialCreator.assignPropertyDefs(list);
    }

    private void _addCreatorsWithAnnotatedNames(PotentialCreators potentialCreators, List<PotentialCreator> list, PotentialCreator potentialCreator) {
        List<PotentialCreator> list_findCreatorsWithAnnotatedNames = _findCreatorsWithAnnotatedNames(list);
        if (potentialCreator != null && list_findCreatorsWithAnnotatedNames.contains(potentialCreator)) {
            potentialCreators.setPropertiesBased(this._config, potentialCreator, "implicit");
            return;
        }
        Iterator<PotentialCreator> it = list_findCreatorsWithAnnotatedNames.iterator();
        while (it.hasNext()) {
            potentialCreators.setPropertiesBased(this._config, it.next(), "implicit");
        }
    }

    private void _addExplicitlyAnnotatedCreators(PotentialCreators potentialCreators, List<PotentialCreator> list, Map<String, POJOPropertyBuilder> map, boolean z) {
        ConstructorDetector constructorDetector = this._config.getConstructorDetector();
        Iterator<PotentialCreator> it = list.iterator();
        while (it.hasNext()) {
            PotentialCreator next = it.next();
            if (next.isAnnotated()) {
                it.remove();
                ConstructorDetector.SingleArgConstructor singleArgConstructor = ConstructorDetector.SingleArgConstructor.DELEGATING;
                JsonCreator.Mode mode = JsonCreator.Mode.DEFAULT;
                int iOrdinal = next.creatorMode().ordinal();
                if (iOrdinal == 1 || !(iOrdinal == 2 || _isExplicitlyAnnotatedCreatorPropsBased(next, map, constructorDetector))) {
                    potentialCreators.addExplicitDelegating(next);
                } else if (!z) {
                    potentialCreators.setPropertiesBased(this._config, next, "explicit");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r0.hasNameOrInjectForAllParams(r5._config) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r8.anyIgnorals() == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean _addImplicitConstructor(com.fasterxml.jackson.databind.introspect.PotentialCreators r6, java.util.List<com.fasterxml.jackson.databind.introspect.PotentialCreator> r7, java.util.Map<java.lang.String, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder> r8) {
        /*
            r5 = this;
            int r0 = r7.size()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L9
            goto L75
        L9:
            java.lang.Object r0 = r7.get(r1)
            com.fasterxml.jackson.databind.introspect.PotentialCreator r0 = (com.fasterxml.jackson.databind.introspect.PotentialCreator) r0
            com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r3 = r5._visibilityChecker
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r4 = r0.creator()
            boolean r3 = r3.isCreatorVisible(r4)
            if (r3 == 0) goto L75
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r3 = r5._config
            r0.introspectParamNames(r3)
            int r3 = r0.paramCount()
            if (r3 == r2) goto L2f
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r8 = r5._config
            boolean r8 = r0.hasNameOrInjectForAllParams(r8)
            if (r8 == 0) goto L75
            goto L6a
        L2f:
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r5._annotationIntrospector
            if (r3 == 0) goto L3d
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r4 = r0.param(r1)
            com.fasterxml.jackson.annotation.JacksonInject$Value r3 = r3.findInjectableValue(r4)
            if (r3 != 0) goto L6a
        L3d:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r3 = r5._config
            com.fasterxml.jackson.databind.cfg.ConstructorDetector r3 = r3.getConstructorDetector()
            boolean r4 = r3.singleArgCreatorDefaultsToDelegating()
            if (r4 != 0) goto L75
            java.lang.String r4 = r0.implicitNameSimple(r1)
            if (r4 == 0) goto L75
            boolean r3 = r3.singleArgCreatorDefaultsToProperties()
            if (r3 != 0) goto L6a
            java.lang.Object r8 = r8.get(r4)
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder r8 = (com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder) r8
            if (r8 == 0) goto L75
            boolean r3 = r8.anyVisible()
            if (r3 == 0) goto L75
            boolean r8 = r8.anyIgnorals()
            if (r8 == 0) goto L6a
            goto L75
        L6a:
            r7.remove(r1)
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r5._config
            java.lang.String r7 = "implicit"
            r6.setPropertiesBased(r5, r0, r7)
            return r2
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addImplicitConstructor(com.fasterxml.jackson.databind.introspect.PotentialCreators, java.util.List, java.util.Map):boolean");
    }

    private boolean _anyIndexed(Collection<POJOPropertyBuilder> collection) {
        Iterator<POJOPropertyBuilder> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().getMetadata().hasIndex()) {
                return true;
            }
        }
        return false;
    }

    private String _checkRenameByField(String str) {
        PropertyName propertyName;
        Map<PropertyName, PropertyName> map = this._fieldRenameMappings;
        return (map == null || (propertyName = map.get(_propNameFromSimple(str))) == null) ? str : propertyName.getSimpleName();
    }

    private List<PotentialCreator> _collectCreators(List<? extends AnnotatedWithParams> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (AnnotatedWithParams annotatedWithParams : list) {
            arrayList.add(new PotentialCreator(annotatedWithParams, this._useAnnotations ? this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedWithParams) : null));
        }
        return arrayList;
    }

    private List<PotentialCreator> _findCreatorsWithAnnotatedNames(List<PotentialCreator> list) {
        Iterator<PotentialCreator> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            PotentialCreator next = it.next();
            next.introspectParamNames(this._config);
            if (next.hasExplicitNames()) {
                it.remove();
                if (arrayList == null) {
                    arrayList = new ArrayList(4);
                }
                arrayList.add(next);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    private PropertyNamingStrategy _findNamingStrategy() {
        PropertyNamingStrategy propertyNamingStrategyNamingStrategyInstance;
        Object objFindNamingStrategy = this._annotationIntrospector.findNamingStrategy(this._classDef);
        if (objFindNamingStrategy == null) {
            return this._config.getPropertyNamingStrategy();
        }
        if (objFindNamingStrategy instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) objFindNamingStrategy;
        }
        if (!(objFindNamingStrategy instanceof Class)) {
            reportProblem("AnnotationIntrospector returned PropertyNamingStrategy definition of type %s; expected type `PropertyNamingStrategy` or `Class<PropertyNamingStrategy>` instead", ClassUtil.classNameOf(objFindNamingStrategy));
        }
        Class<?> cls = (Class) objFindNamingStrategy;
        if (cls == PropertyNamingStrategy.class) {
            return null;
        }
        if (!PropertyNamingStrategy.class.isAssignableFrom(cls)) {
            reportProblem("AnnotationIntrospector returned Class %s; expected `Class<PropertyNamingStrategy>`", ClassUtil.classNameOf(cls));
        }
        HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
        return (handlerInstantiator == null || (propertyNamingStrategyNamingStrategyInstance = handlerInstantiator.namingStrategyInstance(this._config, this._classDef, cls)) == null) ? (PropertyNamingStrategy) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : propertyNamingStrategyNamingStrategyInstance;
    }

    private boolean _isDelegatingConstructor(PotentialCreator potentialCreator) {
        LinkedList<AnnotatedMember> linkedList;
        ConstructorDetector.SingleArgConstructor singleArgConstructor = ConstructorDetector.SingleArgConstructor.DELEGATING;
        JsonCreator.Mode mode = JsonCreator.Mode.DEFAULT;
        int iOrdinal = potentialCreator.creatorModeOrDefault().ordinal();
        if (iOrdinal != 1) {
            return (iOrdinal == 2 || iOrdinal == 3 || potentialCreator.paramCount() != 1 || (linkedList = this._jsonValueAccessors) == null || linkedList.isEmpty()) ? false : true;
        }
        return true;
    }

    private boolean _isExplicitlyAnnotatedCreatorPropsBased(PotentialCreator potentialCreator, Map<String, POJOPropertyBuilder> map, ConstructorDetector constructorDetector) {
        if (potentialCreator.paramCount() == 1) {
            ConstructorDetector.SingleArgConstructor singleArgConstructor = ConstructorDetector.SingleArgConstructor.DELEGATING;
            JsonCreator.Mode mode = JsonCreator.Mode.DEFAULT;
            int iOrdinal = constructorDetector.singleArgMode().ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            if (iOrdinal == 3) {
                throw new IllegalArgumentException(String.format("Single-argument constructor (%s) is annotated but no 'mode' defined; `ConstructorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", potentialCreator.creator()));
            }
        }
        potentialCreator.introspectParamNames(this._config);
        if (potentialCreator.hasExplicitNames()) {
            return true;
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonValueAccessors;
        if (linkedList != null && !linkedList.isEmpty()) {
            return false;
        }
        if (potentialCreator.paramCount() != 1) {
            return potentialCreator.hasNameOrInjectForAllParams(this._config);
        }
        PropertyName propertyNameImplicitName = potentialCreator.implicitName(0);
        if (propertyNameImplicitName != null) {
            POJOPropertyBuilder pOJOPropertyBuilder = map.get(propertyNameImplicitName.getSimpleName());
            if (pOJOPropertyBuilder == null) {
                for (POJOPropertyBuilder pOJOPropertyBuilder2 : map.values()) {
                    if (pOJOPropertyBuilder2.anyVisible() && !pOJOPropertyBuilder2.anyIgnorals() && pOJOPropertyBuilder2.hasExplicitName(propertyNameImplicitName)) {
                        return true;
                    }
                }
            } else if (pOJOPropertyBuilder.anyVisible() && !pOJOPropertyBuilder.anyIgnorals()) {
                return true;
            }
        }
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        return (annotationIntrospector == null || annotationIntrospector.findInjectableValue(potentialCreator.param(0)) == null) ? false : true;
    }

    private PropertyName _propNameFromSimple(String str) {
        return PropertyName.construct(str, null);
    }

    private Map<String, POJOPropertyBuilder> _putAnyGettersInTheEnd(Map<String, POJOPropertyBuilder> map) {
        AnnotatedMember first;
        LinkedList<AnnotatedMember> linkedList = this._anyGetters;
        if (linkedList != null) {
            first = linkedList.getFirst();
        } else {
            LinkedList<AnnotatedMember> linkedList2 = this._anyGetterField;
            if (linkedList2 == null) {
                return map;
            }
            first = linkedList2.getFirst();
        }
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
        POJOPropertyBuilder pOJOPropertyBuilder = null;
        for (POJOPropertyBuilder pOJOPropertyBuilder2 : map.values()) {
            if (pOJOPropertyBuilder2.hasFieldOrGetter(first)) {
                pOJOPropertyBuilder = pOJOPropertyBuilder2;
            } else {
                linkedHashMap.put(pOJOPropertyBuilder2.getName(), pOJOPropertyBuilder2);
            }
        }
        if (pOJOPropertyBuilder != null) {
            linkedHashMap.put(pOJOPropertyBuilder.getName(), pOJOPropertyBuilder);
        }
        return linkedHashMap;
    }

    private void _removeDisabledCreators(List<PotentialCreator> list) {
        Iterator<PotentialCreator> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().creatorMode() == JsonCreator.Mode.DISABLED) {
                it.remove();
            }
        }
    }

    private void _removeNonFactoryStaticMethods(List<PotentialCreator> list, PotentialCreator potentialCreator) {
        Class<?> rawParameterType;
        Class<?> rawClass = this._type.getRawClass();
        Iterator<PotentialCreator> it = list.iterator();
        while (it.hasNext()) {
            PotentialCreator next = it.next();
            if (!next.isAnnotated() && potentialCreator != next) {
                AnnotatedWithParams annotatedWithParamsCreator = next.creator();
                if (rawClass.isAssignableFrom(annotatedWithParamsCreator.getRawType()) && next.paramCount() == 1) {
                    String name = annotatedWithParamsCreator.getName();
                    if ("valueOf".equals(name) || ("fromString".equals(name) && ((rawParameterType = annotatedWithParamsCreator.getRawParameterType(0)) == String.class || CharSequence.class.isAssignableFrom(rawParameterType)))) {
                    }
                }
                it.remove();
            }
        }
    }

    private void _removeNonVisibleCreators(List<PotentialCreator> list) {
        Iterator<PotentialCreator> it = list.iterator();
        while (it.hasNext()) {
            if (!this._visibilityChecker.isCreatorVisible(it.next().creator())) {
                it.remove();
            }
        }
    }

    protected void _addCreators(Map<String, POJOPropertyBuilder> map) {
        AnnotatedClass annotatedClass = this._classDef;
        PotentialCreators potentialCreators = this._potentialCreators;
        List<PotentialCreator> list_collectCreators = _collectCreators(annotatedClass.getConstructors());
        List<PotentialCreator> list_collectCreators2 = _collectCreators(this._classDef.getFactoryMethods());
        PotentialCreator potentialCreatorFindCanonicalRecordConstructor = this._isRecordType ? JDK14Util.findCanonicalRecordConstructor(this._config, this._classDef, list_collectCreators) : this._annotationIntrospector.findDefaultCreator(this._config, this._classDef, list_collectCreators, list_collectCreators2);
        _removeDisabledCreators(list_collectCreators);
        _removeDisabledCreators(list_collectCreators2);
        _removeNonFactoryStaticMethods(list_collectCreators2, potentialCreatorFindCanonicalRecordConstructor);
        if (this._useAnnotations) {
            _addExplicitlyAnnotatedCreators(potentialCreators, list_collectCreators, map, false);
            _addExplicitlyAnnotatedCreators(potentialCreators, list_collectCreators2, map, potentialCreators.hasPropertiesBased());
        }
        if (!potentialCreators.hasPropertiesBased()) {
            _addCreatorsWithAnnotatedNames(potentialCreators, list_collectCreators, potentialCreatorFindCanonicalRecordConstructor);
        }
        if (potentialCreatorFindCanonicalRecordConstructor != null && (list_collectCreators.remove(potentialCreatorFindCanonicalRecordConstructor) || list_collectCreators2.remove(potentialCreatorFindCanonicalRecordConstructor))) {
            if (_isDelegatingConstructor(potentialCreatorFindCanonicalRecordConstructor)) {
                if (!potentialCreators.hasDelegating()) {
                    potentialCreators.addExplicitDelegating(potentialCreatorFindCanonicalRecordConstructor);
                }
            } else if (!potentialCreators.hasPropertiesBased()) {
                potentialCreators.setPropertiesBased(this._config, potentialCreatorFindCanonicalRecordConstructor, "Primary");
            }
        }
        ConstructorDetector constructorDetector = this._config.getConstructorDetector();
        if (!potentialCreators.hasPropertiesBasedOrDelegating() && !constructorDetector.requireCtorAnnotation() && (this._classDef.getDefaultConstructor() == null || constructorDetector.singleArgCreatorDefaultsToProperties())) {
            _addImplicitConstructor(potentialCreators, list_collectCreators, map);
        }
        _removeNonVisibleCreators(list_collectCreators);
        _removeNonVisibleCreators(list_collectCreators2);
        potentialCreators.setImplicitDelegating(list_collectCreators, list_collectCreators2);
        PotentialCreator potentialCreator = potentialCreators.propertiesBased;
        if (potentialCreator == null) {
            this._creatorProperties = Collections.EMPTY_LIST;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this._creatorProperties = arrayList;
        _addCreatorParams(map, potentialCreator, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0025 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void _addFields(java.util.Map<java.lang.String, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder> r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(java.util.Map):void");
    }

    protected void _addGetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean z;
        boolean z2;
        String strFindImplicitPropertyName;
        boolean zIsGetterVisible;
        Class<?> rawReturnType = annotatedMethod.getRawReturnType();
        if (rawReturnType != Void.TYPE) {
            if (rawReturnType != Void.class || this._config.isEnabled(MapperFeature.ALLOW_VOID_VALUED_PROPERTIES)) {
                if (Boolean.TRUE.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                    LinkedList<AnnotatedMember> linkedList = this._anyGetters;
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        this._anyGetters = linkedList;
                    }
                    linkedList.add(annotatedMethod);
                } else {
                    if (Boolean.TRUE.equals(annotationIntrospector.hasAsKey(this._config, annotatedMethod))) {
                        LinkedList<AnnotatedMember> linkedList2 = this._jsonKeyAccessors;
                        if (linkedList2 == null) {
                            linkedList2 = new LinkedList<>();
                            this._jsonKeyAccessors = linkedList2;
                        }
                        linkedList2.add(annotatedMethod);
                        return;
                    }
                    if (Boolean.TRUE.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                        LinkedList<AnnotatedMember> linkedList3 = this._jsonValueAccessors;
                        if (linkedList3 == null) {
                            linkedList3 = new LinkedList<>();
                            this._jsonValueAccessors = linkedList3;
                        }
                        linkedList3.add(annotatedMethod);
                        return;
                    }
                }
                PropertyName propertyNameFindNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
                boolean z3 = false;
                boolean z4 = propertyNameFindNameForSerialization != null;
                if (z4) {
                    String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (strFindImplicitPropertyName2 == null && (strFindImplicitPropertyName2 = this._accessorNaming.findNameForRegularGetter(annotatedMethod, annotatedMethod.getName())) == null) {
                        strFindImplicitPropertyName2 = this._accessorNaming.findNameForIsGetter(annotatedMethod, annotatedMethod.getName());
                    }
                    if (strFindImplicitPropertyName2 == null) {
                        strFindImplicitPropertyName2 = annotatedMethod.getName();
                    }
                    if (propertyNameFindNameForSerialization.isEmpty()) {
                        propertyNameFindNameForSerialization = _propNameFromSimple(strFindImplicitPropertyName2);
                    } else {
                        z3 = z4;
                    }
                    propertyName = propertyNameFindNameForSerialization;
                    z = true;
                    z2 = z3;
                    strFindImplicitPropertyName = strFindImplicitPropertyName2;
                } else {
                    strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this._accessorNaming.findNameForRegularGetter(annotatedMethod, annotatedMethod.getName());
                    }
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this._accessorNaming.findNameForIsGetter(annotatedMethod, annotatedMethod.getName());
                        if (strFindImplicitPropertyName == null) {
                            return;
                        } else {
                            zIsGetterVisible = this._visibilityChecker.isIsGetterVisible(annotatedMethod);
                        }
                    } else {
                        zIsGetterVisible = this._visibilityChecker.isGetterVisible(annotatedMethod);
                    }
                    propertyName = propertyNameFindNameForSerialization;
                    z = zIsGetterVisible;
                    z2 = z4;
                }
                _property(map, _checkRenameByField(strFindImplicitPropertyName)).addGetter(annotatedMethod, propertyName, z2, z, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
            }
        }
    }

    protected void _addInjectables(Map<String, POJOPropertyBuilder> map) {
        for (AnnotatedMember annotatedMember : this._classDef.fields()) {
            _doAddInjectable(this._annotationIntrospector.findInjectableValue(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            if (annotatedMethod.getParameterCount() == 1) {
                _doAddInjectable(this._annotationIntrospector.findInjectableValue(annotatedMethod), annotatedMethod);
            }
        }
    }

    protected void _addMethods(Map<String, POJOPropertyBuilder> map) {
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                _addGetterMethod(map, annotatedMethod, this._annotationIntrospector);
            } else if (parameterCount == 1) {
                _addSetterMethod(map, annotatedMethod, this._annotationIntrospector);
            } else if (parameterCount == 2) {
                if (Boolean.TRUE.equals(this._annotationIntrospector.hasAnySetter(annotatedMethod))) {
                    LinkedList<AnnotatedMethod> linkedList = this._anySetters;
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        this._anySetters = linkedList;
                    }
                    linkedList.add(annotatedMethod);
                }
            }
        }
    }

    protected void _addSetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        boolean zIsSetterVisible;
        boolean z;
        String strFindImplicitPropertyName;
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z2 = false;
        boolean z3 = propertyNameFindNameForDeserialization != null;
        if (z3) {
            String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = this._accessorNaming.findNameForMutator(annotatedMethod, annotatedMethod.getName());
            }
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = annotatedMethod.getName();
            }
            if (propertyNameFindNameForDeserialization.isEmpty()) {
                propertyNameFindNameForDeserialization = _propNameFromSimple(strFindImplicitPropertyName2);
            } else {
                z2 = z3;
            }
            zIsSetterVisible = true;
            z = z2;
            strFindImplicitPropertyName = strFindImplicitPropertyName2;
        } else {
            strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = this._accessorNaming.findNameForMutator(annotatedMethod, annotatedMethod.getName());
            }
            if (strFindImplicitPropertyName == null) {
                return;
            }
            zIsSetterVisible = this._visibilityChecker.isSetterVisible(annotatedMethod);
            z = z3;
        }
        _property(map, _checkRenameByField(strFindImplicitPropertyName)).addSetter(annotatedMethod, propertyNameFindNameForDeserialization, z, zIsSetterVisible, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
    }

    protected void _collectIgnorals(String str) {
        if (this._forSerialization || str == null) {
            return;
        }
        HashSet<String> hashSet = this._ignoredPropertyNames;
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this._ignoredPropertyNames = hashSet;
        }
        hashSet.add(str);
    }

    protected void _doAddInjectable(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        Object id = value.getId();
        LinkedHashMap<Object, AnnotatedMember> linkedHashMap = this._injectables;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            this._injectables = linkedHashMap;
        }
        AnnotatedMember annotatedMemberPut = linkedHashMap.put(id, annotatedMember);
        if (annotatedMemberPut == null || annotatedMemberPut.getClass() != annotatedMember.getClass()) {
            return;
        }
        reportProblem("Duplicate injectable value with id '%s' (of type %s)", id, ClassUtil.classNameOf(id));
    }

    protected POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, PropertyName propertyName) {
        String simpleName = propertyName.getSimpleName();
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(simpleName);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, propertyName);
        map.put(simpleName, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    protected void _removeUnwantedAccessors(Map<String, POJOPropertyBuilder> map) {
        boolean zIsEnabled = this._config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().removeNonVisible(zIsEnabled, true != this._forSerialization ? this : null);
        }
    }

    protected void _removeUnwantedProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            POJOPropertyBuilder next = it.next();
            if (!next.anyVisible()) {
                it.remove();
            } else if (next.anyIgnorals()) {
                if (isRecordType() && !this._forSerialization) {
                    next.removeIgnored();
                    _collectIgnorals(next.getName());
                } else if (next.anyExplicitsWithoutIgnoral()) {
                    next.removeIgnored();
                    if (!next.couldDeserialize()) {
                        _collectIgnorals(next.getName());
                    }
                } else {
                    it.remove();
                    _collectIgnorals(next.getName());
                }
            }
        }
    }

    protected void _renameProperties(Map<String, POJOPropertyBuilder> map) {
        HashSet<String> hashSet;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            HashSet<String> hashSet2 = this._ignoredPropertyNames;
            if (hashSet2 == null || !hashSet2.contains(value.getName())) {
                Set<PropertyName> setFindExplicitNames = value.findExplicitNames();
                if (!setFindExplicitNames.isEmpty()) {
                    it.remove();
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    if (setFindExplicitNames.size() == 1) {
                        linkedList.add(value.withName(setFindExplicitNames.iterator().next()));
                    } else {
                        linkedList.addAll(value.explode(setFindExplicitNames));
                    }
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
                if (_replaceCreatorProperty(this._creatorProperties, pOJOPropertyBuilder) && (hashSet = this._ignoredPropertyNames) != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    protected void _renameUsing(Map<String, POJOPropertyBuilder> map, PropertyNamingStrategy propertyNamingStrategy) {
        if (!this._type.isEnumType() || getFormatOverrides().getShape() == JsonFormat.Shape.OBJECT) {
            POJOPropertyBuilder[] pOJOPropertyBuilderArr = (POJOPropertyBuilder[]) map.values().toArray(new POJOPropertyBuilder[map.size()]);
            map.clear();
            for (POJOPropertyBuilder pOJOPropertyBuilderWithSimpleName : pOJOPropertyBuilderArr) {
                PropertyName fullName = pOJOPropertyBuilderWithSimpleName.getFullName();
                String strNameForGetterMethod = null;
                if (!pOJOPropertyBuilderWithSimpleName.isExplicitlyNamed() || this._config.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                    if (this._forSerialization) {
                        if (pOJOPropertyBuilderWithSimpleName.hasGetter()) {
                            strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilderWithSimpleName.getGetter(), fullName.getSimpleName());
                        } else if (pOJOPropertyBuilderWithSimpleName.hasField()) {
                            strNameForGetterMethod = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilderWithSimpleName.getField(), fullName.getSimpleName());
                        }
                    } else if (pOJOPropertyBuilderWithSimpleName.hasSetter()) {
                        strNameForGetterMethod = propertyNamingStrategy.nameForSetterMethod(this._config, pOJOPropertyBuilderWithSimpleName.getSetterUnchecked(), fullName.getSimpleName());
                    } else if (pOJOPropertyBuilderWithSimpleName.hasConstructorParameter()) {
                        strNameForGetterMethod = propertyNamingStrategy.nameForConstructorParameter(this._config, pOJOPropertyBuilderWithSimpleName.getConstructorParameter(), fullName.getSimpleName());
                    } else if (pOJOPropertyBuilderWithSimpleName.hasField()) {
                        strNameForGetterMethod = propertyNamingStrategy.nameForField(this._config, pOJOPropertyBuilderWithSimpleName.getFieldUnchecked(), fullName.getSimpleName());
                    } else if (pOJOPropertyBuilderWithSimpleName.hasGetter()) {
                        strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this._config, pOJOPropertyBuilderWithSimpleName.getGetterUnchecked(), fullName.getSimpleName());
                    }
                }
                if (strNameForGetterMethod == null || fullName.hasSimpleName(strNameForGetterMethod)) {
                    strNameForGetterMethod = fullName.getSimpleName();
                } else {
                    pOJOPropertyBuilderWithSimpleName = pOJOPropertyBuilderWithSimpleName.withSimpleName(strNameForGetterMethod);
                }
                POJOPropertyBuilder pOJOPropertyBuilder = map.get(strNameForGetterMethod);
                if (pOJOPropertyBuilder == null) {
                    map.put(strNameForGetterMethod, pOJOPropertyBuilderWithSimpleName);
                } else {
                    pOJOPropertyBuilder.addAll(pOJOPropertyBuilderWithSimpleName);
                }
                _replaceCreatorProperty(this._creatorProperties, pOJOPropertyBuilderWithSimpleName);
            }
        }
    }

    protected void _renameWithWrappers(Map<String, POJOPropertyBuilder> map) {
        PropertyName propertyNameFindWrapperName;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            AnnotatedMember primaryMember = value.getPrimaryMember();
            if (primaryMember != null && (propertyNameFindWrapperName = this._annotationIntrospector.findWrapperName(primaryMember)) != null && propertyNameFindWrapperName.hasSimpleName() && !propertyNameFindWrapperName.equals(value.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.withName(propertyNameFindWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
            }
        }
    }

    protected boolean _replaceCreatorProperty(List<POJOPropertyBuilder> list, POJOPropertyBuilder pOJOPropertyBuilder) {
        AnnotatedParameter constructorParameter = pOJOPropertyBuilder.getConstructorParameter();
        if (list != null && constructorParameter != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                POJOPropertyBuilder pOJOPropertyBuilder2 = list.get(i2);
                if (pOJOPropertyBuilder2 != null && pOJOPropertyBuilder2.getConstructorParameter() == constructorParameter) {
                    list.set(i2, pOJOPropertyBuilder);
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean _resolveFieldVsGetter(List<AnnotatedMember> list) {
        do {
            AnnotatedMember annotatedMember = list.get(0);
            AnnotatedMember annotatedMember2 = list.get(1);
            if (annotatedMember instanceof AnnotatedField) {
                if (!(annotatedMember2 instanceof AnnotatedMethod)) {
                    return false;
                }
                list.remove(0);
            } else {
                if (!(annotatedMember instanceof AnnotatedMethod) || !(annotatedMember2 instanceof AnnotatedField)) {
                    return false;
                }
                list.remove(1);
            }
        } while (list.size() > 1);
        return true;
    }

    protected void _sortProperties(Map<String, POJOPropertyBuilder> map) {
        Collection<POJOPropertyBuilder> collectionValues;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Boolean boolFindSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this._classDef);
        boolean zShouldSortPropertiesAlphabetically = boolFindSerializationSortAlphabetically == null ? this._config.shouldSortPropertiesAlphabetically() : boolFindSerializationSortAlphabetically.booleanValue();
        boolean z_anyIndexed = _anyIndexed(map.values());
        String[] strArrFindSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this._classDef);
        if (zShouldSortPropertiesAlphabetically || z_anyIndexed || this._creatorProperties != null || strArrFindSerializationPropertyOrder != null) {
            int size = map.size();
            int i2 = size + size;
            Map<String, POJOPropertyBuilder> treeMap = zShouldSortPropertiesAlphabetically ? new TreeMap<>() : new LinkedHashMap<>(i2);
            for (POJOPropertyBuilder pOJOPropertyBuilder : map.values()) {
                treeMap.put(pOJOPropertyBuilder.getName(), pOJOPropertyBuilder);
            }
            Map<String, POJOPropertyBuilder> map_putAnyGettersInTheEnd = _putAnyGettersInTheEnd(treeMap);
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            if (strArrFindSerializationPropertyOrder != null) {
                for (String name : strArrFindSerializationPropertyOrder) {
                    POJOPropertyBuilder pOJOPropertyBuilderRemove = map_putAnyGettersInTheEnd.remove(name);
                    if (pOJOPropertyBuilderRemove == null) {
                        Iterator<POJOPropertyBuilder> it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            POJOPropertyBuilder next = it.next();
                            if (name.equals(next.getInternalName())) {
                                name = next.getName();
                                pOJOPropertyBuilderRemove = next;
                                break;
                            }
                        }
                    }
                    if (pOJOPropertyBuilderRemove != null) {
                        linkedHashMap.put(name, pOJOPropertyBuilderRemove);
                    }
                }
            }
            if (z_anyIndexed) {
                TreeMap treeMap2 = new TreeMap();
                Iterator<Map.Entry<String, POJOPropertyBuilder>> it2 = map_putAnyGettersInTheEnd.entrySet().iterator();
                while (it2.hasNext()) {
                    POJOPropertyBuilder value = it2.next().getValue();
                    Integer index = value.getMetadata().getIndex();
                    if (index != null) {
                        treeMap2.put(index, value);
                        it2.remove();
                    }
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder2 : treeMap2.values()) {
                    linkedHashMap.put(pOJOPropertyBuilder2.getName(), pOJOPropertyBuilder2);
                }
            }
            if (this._creatorProperties != null && (!zShouldSortPropertiesAlphabetically || this._config.isEnabled(MapperFeature.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (!zShouldSortPropertiesAlphabetically || this._config.isEnabled(MapperFeature.SORT_CREATOR_PROPERTIES_BY_DECLARATION_ORDER)) {
                    collectionValues = this._creatorProperties;
                } else {
                    TreeMap treeMap3 = new TreeMap();
                    for (POJOPropertyBuilder pOJOPropertyBuilder3 : this._creatorProperties) {
                        if (pOJOPropertyBuilder3 != null) {
                            treeMap3.put(pOJOPropertyBuilder3.getName(), pOJOPropertyBuilder3);
                        }
                    }
                    collectionValues = treeMap3.values();
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder4 : collectionValues) {
                    if (pOJOPropertyBuilder4 != null) {
                        String name2 = pOJOPropertyBuilder4.getName();
                        if (map_putAnyGettersInTheEnd.containsKey(name2)) {
                            linkedHashMap.put(name2, pOJOPropertyBuilder4);
                        }
                    }
                }
            }
            linkedHashMap.putAll(map_putAnyGettersInTheEnd);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    protected void collectAll() {
        this._potentialCreators = new PotentialCreators();
        LinkedHashMap<String, POJOPropertyBuilder> linkedHashMap = new LinkedHashMap<>();
        _addFields(linkedHashMap);
        _addMethods(linkedHashMap);
        if (!this._classDef.isNonStaticInnerClass()) {
            _addCreators(linkedHashMap);
        }
        _removeUnwantedProperties(linkedHashMap);
        _removeUnwantedAccessors(linkedHashMap);
        _renameProperties(linkedHashMap);
        _addInjectables(linkedHashMap);
        Iterator<POJOPropertyBuilder> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().mergeAnnotations(this._forSerialization);
        }
        PropertyNamingStrategy propertyNamingStrategy_findNamingStrategy = _findNamingStrategy();
        if (propertyNamingStrategy_findNamingStrategy != null) {
            _renameUsing(linkedHashMap, propertyNamingStrategy_findNamingStrategy);
        }
        Iterator<POJOPropertyBuilder> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().trimByVisibility();
        }
        if (this._isRecordType && !this._forSerialization) {
            Iterator<POJOPropertyBuilder> it3 = linkedHashMap.values().iterator();
            while (it3.hasNext()) {
                it3.next().removeFields();
            }
        }
        if (this._config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            _renameWithWrappers(linkedHashMap);
        }
        _sortProperties(linkedHashMap);
        this._properties = linkedHashMap;
        this._collected = true;
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    @Deprecated
    public AnnotatedMember getAnyGetter() {
        return getAnyGetterMethod();
    }

    public AnnotatedMember getAnyGetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-getter' fields defined (%s vs %s)", this._anyGetterField.get(0), this._anyGetterField.get(1));
        }
        return this._anyGetterField.getFirst();
    }

    public AnnotatedMember getAnyGetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-getter' methods defined (%s vs %s)", this._anyGetters.get(0), this._anyGetters.get(1));
        }
        return this._anyGetters.getFirst();
    }

    public AnnotatedMember getAnySetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anySetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' fields defined (%s vs %s)", this._anySetterField.get(0), this._anySetterField.get(1));
        }
        return this._anySetterField.getFirst();
    }

    public AnnotatedMethod getAnySetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMethod> linkedList = this._anySetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' methods defined (%s vs %s)", this._anySetters.get(0), this._anySetters.get(1));
        }
        return this._anySetters.getFirst();
    }

    public AnnotatedClass getClassDef() {
        return this._classDef;
    }

    public MapperConfig<?> getConfig() {
        return this._config;
    }

    public JsonFormat.Value getFormatOverrides() {
        JsonFormat.Value valueFindFormat = this._formatOverrides;
        if (valueFindFormat == null) {
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            valueFindFormat = annotationIntrospector != null ? annotationIntrospector.findFormat(this._classDef) : null;
            JsonFormat.Value defaultPropertyFormat = this._config.getDefaultPropertyFormat(this._type.getRawClass());
            if (defaultPropertyFormat != null) {
                valueFindFormat = valueFindFormat == null ? defaultPropertyFormat : valueFindFormat.withOverrides(defaultPropertyFormat);
            }
            if (valueFindFormat == null) {
                valueFindFormat = JsonFormat.Value.empty();
            }
            this._formatOverrides = valueFindFormat;
        }
        return valueFindFormat;
    }

    public Set<String> getIgnoredPropertyNames() {
        return this._ignoredPropertyNames;
    }

    public Map<Object, AnnotatedMember> getInjectables() {
        if (!this._collected) {
            collectAll();
        }
        return this._injectables;
    }

    public AnnotatedMember getJsonKeyAccessor() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonKeyAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !_resolveFieldVsGetter(this._jsonKeyAccessors)) {
            reportProblem("Multiple 'as-key' properties defined (%s vs %s)", this._jsonKeyAccessors.get(0), this._jsonKeyAccessors.get(1));
        }
        return this._jsonKeyAccessors.get(0);
    }

    public AnnotatedMember getJsonValueAccessor() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonValueAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !_resolveFieldVsGetter(this._jsonValueAccessors)) {
            reportProblem("Multiple 'as-value' properties defined (%s vs %s)", this._jsonValueAccessors.get(0), this._jsonValueAccessors.get(1));
        }
        return this._jsonValueAccessors.get(0);
    }

    public ObjectIdInfo getObjectIdInfo() {
        ObjectIdInfo objectIdInfoFindObjectIdInfo = this._annotationIntrospector.findObjectIdInfo(this._classDef);
        if (objectIdInfoFindObjectIdInfo != null) {
            return this._annotationIntrospector.findObjectReferenceInfo(this._classDef, objectIdInfoFindObjectIdInfo);
        }
        return null;
    }

    public PotentialCreators getPotentialCreators() {
        if (!this._collected) {
            collectAll();
        }
        return this._potentialCreators;
    }

    public List<BeanPropertyDefinition> getProperties() {
        return new ArrayList(getPropertyMap().values());
    }

    protected Map<String, POJOPropertyBuilder> getPropertyMap() {
        if (!this._collected) {
            collectAll();
        }
        return this._properties;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean isRecordType() {
        return this._isRecordType;
    }

    protected void reportProblem(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + String.valueOf(this._classDef) + ": " + str);
    }

    protected POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, String str) {
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, PropertyName.construct(str));
        map.put(str, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }
}
