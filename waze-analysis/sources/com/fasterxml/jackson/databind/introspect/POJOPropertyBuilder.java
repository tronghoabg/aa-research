package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {
    private static final AnnotationIntrospector.ReferenceProperty NOT_REFEFERENCE_PROP = AnnotationIntrospector.ReferenceProperty.managed("");
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final MapperConfig<?> _config;
    protected Linked<AnnotatedParameter> _ctorParameters;
    protected Linked<AnnotatedField> _fields;
    protected final boolean _forSerialization;
    protected Linked<AnnotatedMethod> _getters;
    protected final PropertyName _internalName;
    protected transient PropertyMetadata _metadata;
    protected final PropertyName _name;
    protected transient AnnotationIntrospector.ReferenceProperty _referenceInfo;
    protected Linked<AnnotatedMethod> _setters;

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access = iArr;
            try {
                iArr[JsonProperty.Access.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[JsonProperty.Access.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[JsonProperty.Access.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Linked<T> {
        public final boolean isMarkedIgnored;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final PropertyName name;
        public final Linked<T> next;
        public final T value;

        public Linked(T t, Linked<T> linked, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.value = t;
            this.next = linked;
            PropertyName propertyName2 = null;
            if (propertyName != null && !propertyName.isEmpty()) {
                propertyName2 = propertyName;
            }
            this.name = propertyName2;
            if (z) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!propertyName.hasSimpleName()) {
                    z = false;
                }
            }
            this.isNameExplicit = z;
            this.isVisible = z2;
            this.isMarkedIgnored = z3;
        }

        protected Linked<T> append(Linked<T> linked) {
            Linked<T> linked2 = this.next;
            return linked2 == null ? withNext(linked) : withNext(linked2.append(linked));
        }

        public String toString() {
            String str = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.value.toString(), Boolean.valueOf(this.isVisible), Boolean.valueOf(this.isMarkedIgnored), Boolean.valueOf(this.isNameExplicit));
            Linked<T> linked = this.next;
            if (linked == null) {
                return str;
            }
            return str + ", " + linked.toString();
        }

        public Linked<T> trimByVisibility() {
            Linked<T> linked = this.next;
            if (linked == null) {
                return this;
            }
            PropertyName propertyName = this.name;
            Linked<T> linkedTrimByVisibility = linked.trimByVisibility();
            if (propertyName != null) {
                return linkedTrimByVisibility.name == null ? withNext(null) : withNext(linkedTrimByVisibility);
            }
            if (linkedTrimByVisibility.name == null) {
                boolean z = this.isVisible;
                if (z == linkedTrimByVisibility.isVisible) {
                    return withNext(linkedTrimByVisibility);
                }
                if (z) {
                    return withNext(null);
                }
            }
            return linkedTrimByVisibility;
        }

        public Linked<T> withNext(Linked<T> linked) {
            return linked == this.next ? this : new Linked<>(this.value, linked, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withValue(T t) {
            return t == this.value ? this : new Linked<>(t, this.next, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutIgnored() {
            Linked<T> linkedWithoutIgnored;
            boolean z = this.isMarkedIgnored;
            Linked<T> linked = this.next;
            if (!z) {
                return (linked == null || (linkedWithoutIgnored = linked.withoutIgnored()) == linked) ? this : withNext(linkedWithoutIgnored);
            }
            if (linked == null) {
                return null;
            }
            return linked.withoutIgnored();
        }

        public Linked<T> withoutNext() {
            return this.next == null ? this : new Linked<>(this.value, null, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutNonVisible() {
            Linked<T> linked = this.next;
            Linked<T> linkedWithoutNonVisible = linked == null ? null : linked.withoutNonVisible();
            return this.isVisible ? withNext(linkedWithoutNonVisible) : linkedWithoutNonVisible;
        }
    }

    /* compiled from: WazeSource */
    public class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {
        private Linked<T> next;

        public MemberIterator(Linked<T> linked) {
            this.next = linked;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public T next() {
            Linked<T> linked = this.next;
            if (linked == null) {
                throw new NoSuchElementException();
            }
            Linked<T> linked2 = linked.next;
            T t = linked.value;
            this.next = linked2;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: WazeSource */
    interface WithMember<T> {
        T withMember(AnnotatedMember annotatedMember);
    }

    protected POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this._config = pOJOPropertyBuilder._config;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = propertyName;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }

    private <T> boolean _anyExplicitNames(Linked<T> linked) {
        while (linked != null) {
            if (linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicitNamesWithoutIgnoral(Linked<T> linked) {
        while (linked != null) {
            if (!linked.isMarkedIgnored && linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicits(Linked<T> linked) {
        while (linked != null) {
            PropertyName propertyName = linked.name;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicitsWithoutIgnoral(Linked<T> linked) {
        PropertyName propertyName;
        while (linked != null) {
            if (!linked.isMarkedIgnored && (propertyName = linked.name) != null && propertyName.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyIgnorals(Linked<T> linked) {
        while (linked != null) {
            if (linked.isMarkedIgnored) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyVisible(Linked<T> linked) {
        while (linked != null) {
            if (linked.isVisible) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T extends AnnotatedMember> Linked<T> _applyAnnotations(Linked<T> linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) linked.value.withAnnotations(annotationMap);
        Linked<T> linked2 = linked.next;
        Linked linkedWithNext = linked;
        if (linked2 != null) {
            linkedWithNext = linked.withNext(_applyAnnotations(linked2, annotationMap));
        }
        return linkedWithNext.withValue(annotatedMember);
    }

    private void _explode(Collection<PropertyName> collection, Map<PropertyName, POJOPropertyBuilder> map, Linked<?> linked) {
        PropertyName propertyName;
        for (Linked linked2 = linked; linked2 != null; linked2 = linked2.next) {
            if (linked2.isNameExplicit && (propertyName = linked2.name) != null) {
                POJOPropertyBuilder pOJOPropertyBuilder = map.get(propertyName);
                if (pOJOPropertyBuilder == null) {
                    POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, this._internalName, propertyName);
                    map.put(propertyName, pOJOPropertyBuilder2);
                    pOJOPropertyBuilder = pOJOPropertyBuilder2;
                }
                if (linked == this._fields) {
                    pOJOPropertyBuilder._fields = linked2.withNext(pOJOPropertyBuilder._fields);
                } else if (linked == this._getters) {
                    pOJOPropertyBuilder._getters = linked2.withNext(pOJOPropertyBuilder._getters);
                } else if (linked == this._setters) {
                    pOJOPropertyBuilder._setters = linked2.withNext(pOJOPropertyBuilder._setters);
                } else {
                    if (linked != this._ctorParameters) {
                        throw new IllegalStateException("Internal error: mismatched accessors, property: ".concat(toString()));
                    }
                    pOJOPropertyBuilder._ctorParameters = linked2.withNext(pOJOPropertyBuilder._ctorParameters);
                }
            } else if (linked2.isVisible) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name " + ClassUtil.name(this._name) + "): found multiple explicit names: " + String.valueOf(collection) + ", but also implicit accessor: " + linked2.toString());
            }
        }
    }

    private Set<PropertyName> _findExplicitNames(Linked<? extends AnnotatedMember> linked, Set<PropertyName> set) {
        for (Linked<? extends AnnotatedMember> linked2 = linked; linked2 != null; linked2 = linked2.next) {
            if (linked2.isNameExplicit && linked2.name != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(linked2.name);
            }
        }
        return set;
    }

    private <T extends AnnotatedMember> AnnotationMap _getAllAnnotations(Linked<T> linked) {
        AnnotationMap allAnnotations = linked.value.getAllAnnotations();
        Linked<T> linked2 = linked.next;
        return linked2 != null ? AnnotationMap.merge(allAnnotations, _getAllAnnotations(linked2)) : allAnnotations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean _hasAccessor(Linked<? extends AnnotatedMember> linked, AnnotatedMember annotatedMember) {
        Member member = annotatedMember.getMember();
        for (Linked<? extends AnnotatedMember> linked2 = linked; linked2 != null; linked2 = linked2.next) {
            if (((AnnotatedMember) linked2.value).getMember() == member) {
                return true;
            }
        }
        return false;
    }

    private boolean _hasExplicitName(Linked<? extends AnnotatedMember> linked, PropertyName propertyName) {
        for (Linked<? extends AnnotatedMember> linked2 = linked; linked2 != null; linked2 = linked2.next) {
            if (linked2.isNameExplicit && propertyName.equals(linked2.name)) {
                return true;
            }
        }
        return false;
    }

    private AnnotationMap _mergeAnnotations(int i2, Linked<? extends AnnotatedMember>... linkedArr) {
        AnnotationMap annotationMap_getAllAnnotations = _getAllAnnotations(linkedArr[i2]);
        do {
            i2++;
            if (i2 >= linkedArr.length) {
                return annotationMap_getAllAnnotations;
            }
        } while (linkedArr[i2] == null);
        return AnnotationMap.merge(annotationMap_getAllAnnotations, _mergeAnnotations(i2, linkedArr));
    }

    private <T> Linked<T> _removeIgnored(Linked<T> linked) {
        if (linked == null) {
            return null;
        }
        return linked.withoutIgnored();
    }

    private <T> Linked<T> _removeNonVisible(Linked<T> linked) {
        if (linked == null) {
            return null;
        }
        return linked.withoutNonVisible();
    }

    private <T> Linked<T> _trimByVisibility(Linked<T> linked) {
        if (linked == null) {
            return null;
        }
        return linked.trimByVisibility();
    }

    private static <T> Linked<T> merge(Linked<T> linked, Linked<T> linked2) {
        return linked == null ? linked2 : linked2 == null ? linked : linked.append(linked2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[PHI: r1 r7
  0x0035: PHI (r1v2 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r7v4 com.fasterxml.jackson.databind.PropertyMetadata) = (r7v0 com.fasterxml.jackson.databind.PropertyMetadata), (r7v8 com.fasterxml.jackson.databind.PropertyMetadata) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.databind.PropertyMetadata _getSetterInfo(com.fasterxml.jackson.databind.PropertyMetadata r7, com.fasterxml.jackson.databind.introspect.AnnotatedMember r8) {
        /*
            r6 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r6.getAccessor()
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L79
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r6._annotationIntrospector
            r4 = 0
            if (r3 == 0) goto L35
            if (r0 == 0) goto L24
            java.lang.Boolean r3 = r3.findMergeInfo(r8)
            if (r3 == 0) goto L24
            boolean r1 = r3.booleanValue()
            if (r1 == 0) goto L23
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r1 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForPropertyOverride(r0)
            com.fasterxml.jackson.databind.PropertyMetadata r7 = r7.withMergeInfo(r1)
        L23:
            r1 = r4
        L24:
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r6._annotationIntrospector
            com.fasterxml.jackson.annotation.JsonSetter$Value r3 = r3.findSetterInfo(r8)
            if (r3 == 0) goto L35
            com.fasterxml.jackson.annotation.Nulls r5 = r3.nonDefaultValueNulls()
            com.fasterxml.jackson.annotation.Nulls r3 = r3.nonDefaultContentNulls()
            goto L37
        L35:
            r3 = r2
            r5 = r3
        L37:
            if (r1 != 0) goto L40
            if (r5 == 0) goto L40
            if (r3 != 0) goto L3e
            goto L41
        L3e:
            r2 = r5
            goto L7a
        L40:
            r2 = r3
        L41:
            java.lang.Class r8 = r6._rawTypeOf(r8)
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r3 = r6._config
            com.fasterxml.jackson.databind.cfg.ConfigOverride r8 = r3.getConfigOverride(r8)
            com.fasterxml.jackson.annotation.JsonSetter$Value r3 = r8.getSetterInfo()
            if (r3 == 0) goto L5d
            if (r5 != 0) goto L57
            com.fasterxml.jackson.annotation.Nulls r5 = r3.nonDefaultValueNulls()
        L57:
            if (r2 != 0) goto L5d
            com.fasterxml.jackson.annotation.Nulls r2 = r3.nonDefaultContentNulls()
        L5d:
            r3 = r2
            r2 = r5
            if (r1 == 0) goto L7a
            if (r0 == 0) goto L7a
            java.lang.Boolean r8 = r8.getMergeable()
            if (r8 == 0) goto L7a
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L77
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r8 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForTypeOverride(r0)
            com.fasterxml.jackson.databind.PropertyMetadata r7 = r7.withMergeInfo(r8)
        L77:
            r1 = r4
            goto L7a
        L79:
            r3 = r2
        L7a:
            if (r1 != 0) goto L80
            if (r2 == 0) goto L80
            if (r3 != 0) goto Lac
        L80:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r8 = r6._config
            com.fasterxml.jackson.annotation.JsonSetter$Value r8 = r8.getDefaultSetterInfo()
            if (r2 != 0) goto L8c
            com.fasterxml.jackson.annotation.Nulls r2 = r8.nonDefaultValueNulls()
        L8c:
            if (r3 != 0) goto L92
            com.fasterxml.jackson.annotation.Nulls r3 = r8.nonDefaultContentNulls()
        L92:
            if (r1 == 0) goto Lac
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r6 = r6._config
            java.lang.Boolean r6 = r6.getDefaultMergeable()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto Lac
            if (r0 == 0) goto Lac
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r6 = com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo.createForDefaults(r0)
            com.fasterxml.jackson.databind.PropertyMetadata r7 = r7.withMergeInfo(r6)
        Lac:
            if (r2 != 0) goto Lb2
            if (r3 == 0) goto Lb1
            goto Lb2
        Lb1:
            return r7
        Lb2:
            com.fasterxml.jackson.databind.PropertyMetadata r6 = r7.withNulls(r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._getSetterInfo(com.fasterxml.jackson.databind.PropertyMetadata, com.fasterxml.jackson.databind.introspect.AnnotatedMember):com.fasterxml.jackson.databind.PropertyMetadata");
    }

    protected int _getterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    protected Class<?> _rawTypeOf(AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.getParameterCount() > 0) {
                return annotatedMethod.getParameterType(0).getRawClass();
            }
        }
        return annotatedMember.getType().getRawClass();
    }

    protected AnnotatedMethod _selectSetter(AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> declaringClass = annotatedMethod.getDeclaringClass();
        Class<?> declaringClass2 = annotatedMethod2.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (!declaringClass.isAssignableFrom(declaringClass2)) {
                if (!declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
        }
        int i_setterPriority = _setterPriority(annotatedMethod2);
        int i_setterPriority2 = _setterPriority(annotatedMethod);
        if (i_setterPriority != i_setterPriority2) {
            return i_setterPriority < i_setterPriority2 ? annotatedMethod2 : annotatedMethod;
        }
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.resolveSetterConflict(this._config, annotatedMethod, annotatedMethod2);
    }

    protected AnnotatedMethod _selectSetterFromMultiple(Linked<AnnotatedMethod> linked, Linked<AnnotatedMethod> linked2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(linked.value);
        arrayList.add(linked2.value);
        for (Linked<AnnotatedMethod> linked3 = linked2.next; linked3 != null; linked3 = linked3.next) {
            AnnotatedMethod annotatedMethod_selectSetter = _selectSetter(linked.value, linked3.value);
            if (annotatedMethod_selectSetter != linked.value) {
                AnnotatedMethod annotatedMethod = linked3.value;
                if (annotatedMethod_selectSetter == annotatedMethod) {
                    arrayList.clear();
                    linked = linked3;
                } else {
                    arrayList.add(annotatedMethod);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s", getName(), (String) Collection.EL.stream(arrayList).map(new Function() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$$ExternalSyntheticLambda0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((AnnotatedMethod) obj).getFullName();
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(" vs "))));
        }
        this._setters = linked.withoutNext();
        return linked.value;
    }

    protected int _setterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        return (!name.startsWith("set") || name.length() <= 3) ? 2 : 1;
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        this._fields = merge(this._fields, pOJOPropertyBuilder._fields);
        this._ctorParameters = merge(this._ctorParameters, pOJOPropertyBuilder._ctorParameters);
        this._getters = merge(this._getters, pOJOPropertyBuilder._getters);
        this._setters = merge(this._setters, pOJOPropertyBuilder._setters);
    }

    public void addCtor(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._ctorParameters = new Linked<>(annotatedParameter, this._ctorParameters, propertyName, z, z2, z3);
    }

    public void addField(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._fields = new Linked<>(annotatedField, this._fields, propertyName, z, z2, z3);
    }

    public void addGetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._getters = new Linked<>(annotatedMethod, this._getters, propertyName, z, z2, z3);
    }

    public void addSetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this._setters = new Linked<>(annotatedMethod, this._setters, propertyName, z, z2, z3);
    }

    public boolean anyExplicitsWithoutIgnoral() {
        return _anyExplicitsWithoutIgnoral(this._fields) || _anyExplicitsWithoutIgnoral(this._getters) || _anyExplicitsWithoutIgnoral(this._setters) || _anyExplicitNamesWithoutIgnoral(this._ctorParameters);
    }

    public boolean anyIgnorals() {
        return _anyIgnorals(this._fields) || _anyIgnorals(this._getters) || _anyIgnorals(this._setters) || _anyIgnorals(this._ctorParameters);
    }

    public boolean anyVisible() {
        return _anyVisible(this._fields) || _anyVisible(this._getters) || _anyVisible(this._setters) || _anyVisible(this._ctorParameters);
    }

    @Override // java.lang.Comparable
    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldDeserialize() {
        if (this._ctorParameters != null || this._setters != null) {
            return true;
        }
        Linked<AnnotatedField> linked = this._fields;
        return linked != null && _anyVisible(linked);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldSerialize() {
        return (this._getters == null && this._fields == null) ? false : true;
    }

    public java.util.Collection<POJOPropertyBuilder> explode(java.util.Collection<PropertyName> collection) {
        HashMap map = new HashMap();
        _explode(collection, map, this._fields);
        _explode(collection, map, this._getters);
        _explode(collection, map, this._setters);
        _explode(collection, map, this._ctorParameters);
        return map.values();
    }

    public JsonProperty.Access findAccess() {
        JsonProperty.Access access = (JsonProperty.Access) fromMemberAnnotationsExcept(new WithMember<JsonProperty.Access>(this) { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.5
            final /* synthetic */ POJOPropertyBuilder this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public JsonProperty.Access withMember(AnnotatedMember annotatedMember) {
                return this.this$0._annotationIntrospector.findPropertyAccess(annotatedMember);
            }
        }, JsonProperty.Access.AUTO);
        if (this._config.isEnabled(MapperFeature.INVERSE_READ_WRITE_ACCESS)) {
            JsonProperty.Access access2 = JsonProperty.Access.READ_ONLY;
            if (access == access2) {
                return JsonProperty.Access.WRITE_ONLY;
            }
            if (access == JsonProperty.Access.WRITE_ONLY) {
                return access2;
            }
        }
        return access;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public List<PropertyName> findAliases() {
        List<PropertyName> listFindPropertyAliases;
        AnnotatedMember primaryMember = getPrimaryMember();
        return (primaryMember == null || (listFindPropertyAliases = this._annotationIntrospector.findPropertyAliases(primaryMember)) == null) ? Collections.EMPTY_LIST : listFindPropertyAliases;
    }

    public Set<PropertyName> findExplicitNames() {
        Set<PropertyName> set_findExplicitNames = _findExplicitNames(this._ctorParameters, _findExplicitNames(this._setters, _findExplicitNames(this._getters, _findExplicitNames(this._fields, null))));
        return set_findExplicitNames == null ? Collections.EMPTY_SET : set_findExplicitNames;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JsonInclude.Value findInclusion() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        JsonInclude.Value valueFindPropertyInclusion = annotationIntrospector == null ? null : annotationIntrospector.findPropertyInclusion(getAccessor());
        return valueFindPropertyInclusion == null ? JsonInclude.Value.empty() : valueFindPropertyInclusion;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new WithMember<ObjectIdInfo>(this) { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.4
            final /* synthetic */ POJOPropertyBuilder this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public ObjectIdInfo withMember(AnnotatedMember annotatedMember) {
                ObjectIdInfo objectIdInfoFindObjectIdInfo = this.this$0._annotationIntrospector.findObjectIdInfo(annotatedMember);
                if (objectIdInfoFindObjectIdInfo != null) {
                    return this.this$0._annotationIntrospector.findObjectReferenceInfo(annotatedMember, objectIdInfoFindObjectIdInfo);
                }
                return null;
            }
        });
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this._referenceInfo;
        if (referenceProperty != null) {
            if (referenceProperty == NOT_REFEFERENCE_PROP) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = (AnnotationIntrospector.ReferenceProperty) fromMemberAnnotations(new WithMember<AnnotationIntrospector.ReferenceProperty>(this) { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.2
            final /* synthetic */ POJOPropertyBuilder this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember annotatedMember) {
                return this.this$0._annotationIntrospector.findReferenceType(annotatedMember);
            }
        });
        this._referenceInfo = referenceProperty2 == null ? NOT_REFEFERENCE_PROP : referenceProperty2;
        return referenceProperty2;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?>[] findViews() {
        return (Class[]) fromMemberAnnotations(new WithMember<Class<?>[]>(this) { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.1
            final /* synthetic */ POJOPropertyBuilder this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public Class<?>[] withMember(AnnotatedMember annotatedMember) {
                return this.this$0._annotationIntrospector.findViews(annotatedMember);
            }
        });
    }

    protected <T> T fromMemberAnnotations(WithMember<T> withMember) {
        Linked<AnnotatedMethod> linked;
        Linked<AnnotatedField> linked2;
        if (this._annotationIntrospector != null) {
            if (this._forSerialization) {
                Linked<AnnotatedMethod> linked3 = this._getters;
                if (linked3 != null) {
                    tWithMember = withMember.withMember(linked3.value);
                }
            } else {
                Linked<AnnotatedParameter> linked4 = this._ctorParameters;
                tWithMember = linked4 != null ? withMember.withMember(linked4.value) : null;
                if (tWithMember == null && (linked = this._setters) != null) {
                    tWithMember = withMember.withMember(linked.value);
                }
            }
            if (tWithMember == null && (linked2 = this._fields) != null) {
                return withMember.withMember(linked2.value);
            }
        }
        return tWithMember;
    }

    protected <T> T fromMemberAnnotationsExcept(WithMember<T> withMember, T t) {
        T tWithMember;
        T tWithMember2;
        T tWithMember3;
        T tWithMember4;
        T tWithMember5;
        T tWithMember6;
        T tWithMember7;
        T tWithMember8;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null && (tWithMember8 = withMember.withMember(linked.value)) != null && tWithMember8 != t) {
                return tWithMember8;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null && (tWithMember7 = withMember.withMember(linked2.value)) != null && tWithMember7 != t) {
                return tWithMember7;
            }
            Linked<AnnotatedParameter> linked3 = this._ctorParameters;
            if (linked3 != null && (tWithMember6 = withMember.withMember(linked3.value)) != null && tWithMember6 != t) {
                return tWithMember6;
            }
            Linked<AnnotatedMethod> linked4 = this._setters;
            if (linked4 == null || (tWithMember5 = withMember.withMember(linked4.value)) == null || tWithMember5 == t) {
                return null;
            }
            return tWithMember5;
        }
        Linked<AnnotatedParameter> linked5 = this._ctorParameters;
        if (linked5 != null && (tWithMember4 = withMember.withMember(linked5.value)) != null && tWithMember4 != t) {
            return tWithMember4;
        }
        Linked<AnnotatedMethod> linked6 = this._setters;
        if (linked6 != null && (tWithMember3 = withMember.withMember(linked6.value)) != null && tWithMember3 != t) {
            return tWithMember3;
        }
        Linked<AnnotatedField> linked7 = this._fields;
        if (linked7 != null && (tWithMember2 = withMember.withMember(linked7.value)) != null && tWithMember2 != t) {
            return tWithMember2;
        }
        Linked<AnnotatedMethod> linked8 = this._getters;
        if (linked8 == null || (tWithMember = withMember.withMember(linked8.value)) == null || tWithMember == t) {
            return null;
        }
        return tWithMember;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedParameter getConstructorParameter() {
        Linked linked = this._ctorParameters;
        if (linked == null) {
            return null;
        }
        while (!(((AnnotatedParameter) linked.value).getOwner() instanceof AnnotatedConstructor)) {
            linked = linked.next;
            if (linked == null) {
                return this._ctorParameters.value;
            }
        }
        return (AnnotatedParameter) linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Iterator<AnnotatedParameter> getConstructorParameters() {
        Linked<AnnotatedParameter> linked = this._ctorParameters;
        return linked == null ? ClassUtil.emptyIterator() : new MemberIterator(linked);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.introspect.AnnotatedField getField() {
        /*
            r6 = this;
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedField> r0 = r6._fields
            if (r0 != 0) goto L6
            r6 = 0
            return r6
        L6:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T> r1 = r0.next
            T r0 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedField r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r0
        Lc:
            if (r1 == 0) goto L69
            T r2 = r1.value
            com.fasterxml.jackson.databind.introspect.AnnotatedField r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r2
            java.lang.Class r3 = r0.getDeclaringClass()
            java.lang.Class r4 = r2.getDeclaringClass()
            if (r3 == r4) goto L29
            boolean r5 = r3.isAssignableFrom(r4)
            if (r5 == 0) goto L23
            goto L35
        L23:
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 != 0) goto L36
        L29:
            boolean r3 = r0.isStatic()
            boolean r4 = r2.isStatic()
            if (r3 == r4) goto L39
            if (r3 == 0) goto L36
        L35:
            r0 = r2
        L36:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T> r1 = r1.next
            goto Lc
        L39:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = r0.getFullName()
            java.lang.String r2 = r2.getFullName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Multiple fields representing property \""
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r6 = "\": "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = " vs "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
            r1.<init>(r6)
            throw r1
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getField():com.fasterxml.jackson.databind.introspect.AnnotatedField");
    }

    protected AnnotatedField getFieldUnchecked() {
        Linked<AnnotatedField> linked = this._fields;
        if (linked == null) {
            return null;
        }
        return linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyName getFullName() {
        return this._name;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.introspect.AnnotatedMethod getGetter() {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r0 = r5._getters
            if (r0 != 0) goto L6
            r5 = 0
            return r5
        L6:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T> r1 = r0.next
            if (r1 == 0) goto L86
        La:
            if (r1 == 0) goto L7b
            T r2 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r2
            java.lang.Class r2 = r2.getDeclaringClass()
            T r3 = r1.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r3 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r3
            java.lang.Class r3 = r3.getDeclaringClass()
            if (r2 == r3) goto L2b
            boolean r4 = r2.isAssignableFrom(r3)
            if (r4 == 0) goto L25
            goto L3f
        L25:
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 != 0) goto L40
        L2b:
            T r2 = r1.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r2
            int r2 = r5._getterPriority(r2)
            T r3 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r3 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r3
            int r3 = r5._getterPriority(r3)
            if (r2 == r3) goto L43
            if (r2 >= r3) goto L40
        L3f:
            r0 = r1
        L40:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<T> r1 = r1.next
            goto La
        L43:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            T r0 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r0
            java.lang.String r0 = r0.getFullName()
            T r1 = r1.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r1 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r1
            java.lang.String r1 = r1.getFullName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Conflicting getter definitions for property \""
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = "\": "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = " vs "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5)
            throw r2
        L7b:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r1 = r0.withoutNext()
            r5._getters = r1
            T r5 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r5 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r5
            return r5
        L86:
            T r5 = r0.value
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r5 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getGetter():com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
    }

    protected AnnotatedMethod getGetterUnchecked() {
        Linked<AnnotatedMethod> linked = this._getters;
        if (linked == null) {
            return null;
        }
        return linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public String getInternalName() {
        return this._internalName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyMetadata getMetadata() {
        PropertyMetadata propertyMetadataConstruct;
        PropertyMetadata propertyMetadata = this._metadata;
        if (propertyMetadata != null) {
            return propertyMetadata;
        }
        AnnotatedMember primaryMemberUnchecked = getPrimaryMemberUnchecked();
        if (primaryMemberUnchecked == null) {
            PropertyMetadata propertyMetadata2 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            this._metadata = propertyMetadata2;
            return propertyMetadata2;
        }
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Boolean boolHasRequiredMarker = annotationIntrospector.hasRequiredMarker(primaryMemberUnchecked);
        String strFindPropertyDescription = annotationIntrospector.findPropertyDescription(primaryMemberUnchecked);
        Integer numFindPropertyIndex = annotationIntrospector.findPropertyIndex(primaryMemberUnchecked);
        String strFindPropertyDefaultValue = annotationIntrospector.findPropertyDefaultValue(primaryMemberUnchecked);
        if (boolHasRequiredMarker == null && numFindPropertyIndex == null && strFindPropertyDefaultValue == null) {
            propertyMetadataConstruct = strFindPropertyDescription == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : PropertyMetadata.STD_REQUIRED_OR_OPTIONAL.withDescription(strFindPropertyDescription);
            this._metadata = propertyMetadataConstruct;
        } else {
            propertyMetadataConstruct = PropertyMetadata.construct(boolHasRequiredMarker, strFindPropertyDescription, numFindPropertyIndex, strFindPropertyDefaultValue);
            this._metadata = propertyMetadataConstruct;
        }
        if (this._forSerialization) {
            return propertyMetadataConstruct;
        }
        PropertyMetadata propertyMetadata_getSetterInfo = _getSetterInfo(propertyMetadataConstruct, primaryMemberUnchecked);
        this._metadata = propertyMetadata_getSetterInfo;
        return propertyMetadata_getSetterInfo;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.util.Named
    public String getName() {
        PropertyName propertyName = this._name;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        AnnotatedMember mutator = getMutator();
        return mutator == null ? getAccessor() : mutator;
    }

    protected AnnotatedMember getPrimaryMemberUnchecked() {
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                return linked.value;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                return linked2.value;
            }
            return null;
        }
        Linked<AnnotatedParameter> linked3 = this._ctorParameters;
        if (linked3 != null) {
            return linked3.value;
        }
        Linked<AnnotatedMethod> linked4 = this._setters;
        if (linked4 != null) {
            return linked4.value;
        }
        Linked<AnnotatedField> linked5 = this._fields;
        if (linked5 != null) {
            return linked5.value;
        }
        Linked<AnnotatedMethod> linked6 = this._getters;
        if (linked6 != null) {
            return linked6.value;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JavaType getPrimaryType() {
        if (this._forSerialization) {
            Annotated getter = getGetter();
            return (getter == null && (getter = getField()) == null) ? TypeFactory.unknownType() : getter.getType();
        }
        Annotated constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            AnnotatedMethod setter = getSetter();
            if (setter != null) {
                return setter.getParameterType(0);
            }
            constructorParameter = getField();
        }
        return (constructorParameter == null && (constructorParameter = getGetter()) == null) ? TypeFactory.unknownType() : constructorParameter.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMethod getSetter() {
        Linked<AnnotatedMethod> linked = this._setters;
        if (linked == null) {
            return null;
        }
        Linked<AnnotatedMethod> linked2 = linked.next;
        if (linked2 == null) {
            return linked.value;
        }
        for (Linked<AnnotatedMethod> linked3 = linked2; linked3 != null; linked3 = linked3.next) {
            AnnotatedMethod annotatedMethod_selectSetter = _selectSetter(linked.value, linked3.value);
            if (annotatedMethod_selectSetter != linked.value) {
                if (annotatedMethod_selectSetter != linked3.value) {
                    return _selectSetterFromMultiple(linked, linked3);
                }
                linked = linked3;
            }
        }
        this._setters = linked.withoutNext();
        return linked.value;
    }

    protected AnnotatedMethod getSetterUnchecked() {
        Linked<AnnotatedMethod> linked = this._setters;
        if (linked == null) {
            return null;
        }
        return linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember primaryMember = getPrimaryMember();
        if (primaryMember == null || (annotationIntrospector = this._annotationIntrospector) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(primaryMember);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasConstructorParameter() {
        return this._ctorParameters != null;
    }

    public boolean hasExplicitName(PropertyName propertyName) {
        return _hasExplicitName(this._fields, propertyName) || _hasExplicitName(this._getters, propertyName) || _hasExplicitName(this._setters, propertyName) || _hasExplicitName(this._ctorParameters, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasField() {
        return this._fields != null;
    }

    public boolean hasFieldOrGetter(AnnotatedMember annotatedMember) {
        return _hasAccessor(this._fields, annotatedMember) || _hasAccessor(this._getters, annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasGetter() {
        return this._getters != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasName(PropertyName propertyName) {
        return this._name.equals(propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasSetter() {
        return this._setters != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyIncluded() {
        return _anyExplicits(this._fields) || _anyExplicits(this._getters) || _anyExplicits(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyNamed() {
        return _anyExplicitNames(this._fields) || _anyExplicitNames(this._getters) || _anyExplicitNames(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new WithMember<Boolean>(this) { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.3
            final /* synthetic */ POJOPropertyBuilder this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return this.this$0._annotationIntrospector.isTypeId(annotatedMember);
            }
        });
        return bool != null && bool.booleanValue();
    }

    public void mergeAnnotations(boolean z) {
        if (z) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                this._getters = _applyAnnotations(this._getters, _mergeAnnotations(0, linked, this._fields, this._ctorParameters, this._setters));
                return;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked2, this._ctorParameters, this._setters));
                return;
            }
            return;
        }
        Linked<AnnotatedParameter> linked3 = this._ctorParameters;
        if (linked3 != null) {
            this._ctorParameters = _applyAnnotations(this._ctorParameters, _mergeAnnotations(0, linked3, this._setters, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedMethod> linked4 = this._setters;
        if (linked4 != null) {
            this._setters = _applyAnnotations(this._setters, _mergeAnnotations(0, linked4, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedField> linked5 = this._fields;
        if (linked5 != null) {
            this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked5, this._getters));
        }
    }

    public void removeConstructors() {
        this._ctorParameters = null;
    }

    public void removeFields() {
        this._fields = null;
    }

    public void removeIgnored() {
        this._fields = _removeIgnored(this._fields);
        this._getters = _removeIgnored(this._getters);
        this._setters = _removeIgnored(this._setters);
        this._ctorParameters = _removeIgnored(this._ctorParameters);
    }

    public JsonProperty.Access removeNonVisible(boolean z, POJOPropertiesCollector pOJOPropertiesCollector) {
        JsonProperty.Access accessFindAccess = findAccess();
        if (accessFindAccess == null) {
            accessFindAccess = JsonProperty.Access.AUTO;
        }
        int iOrdinal = accessFindAccess.ordinal();
        if (iOrdinal == 1) {
            if (pOJOPropertiesCollector != null) {
                pOJOPropertiesCollector._collectIgnorals(getName());
                Iterator<PropertyName> it = findExplicitNames().iterator();
                while (it.hasNext()) {
                    pOJOPropertiesCollector._collectIgnorals(it.next().getSimpleName());
                }
            }
            this._setters = null;
            this._ctorParameters = null;
            if (!this._forSerialization) {
                this._fields = null;
            }
        } else if (iOrdinal == 2) {
            this._getters = null;
            if (this._forSerialization) {
                this._fields = null;
                return accessFindAccess;
            }
        } else if (iOrdinal != 3) {
            this._getters = _removeNonVisible(this._getters);
            this._ctorParameters = _removeNonVisible(this._ctorParameters);
            if (!z || this._getters == null) {
                this._fields = _removeNonVisible(this._fields);
                this._setters = _removeNonVisible(this._setters);
                return accessFindAccess;
            }
        }
        return accessFindAccess;
    }

    public String toString() {
        return "[Property '" + this._name + "'; ctors: " + this._ctorParameters + ", field(s): " + this._fields + ", getter(s): " + this._getters + ", setter(s): " + this._setters + "]";
    }

    public void trimByVisibility() {
        this._fields = _trimByVisibility(this._fields);
        this._getters = _trimByVisibility(this._getters);
        this._setters = _trimByVisibility(this._setters);
        this._ctorParameters = _trimByVisibility(this._ctorParameters);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public POJOPropertyBuilder withName(PropertyName propertyName) {
        return new POJOPropertyBuilder(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public POJOPropertyBuilder withSimpleName(String str) {
        PropertyName propertyName = this._name;
        PropertyName propertyNameWithSimpleName = propertyName.withSimpleName(str);
        return propertyNameWithSimpleName == propertyName ? this : new POJOPropertyBuilder(this, propertyNameWithSimpleName);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    protected POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName2;
        this._forSerialization = z;
    }
}
