package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Member;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class CreatorCollector {
    protected static final int C_ARRAY_DELEGATE = 10;
    protected static final int C_BIG_DECIMAL = 6;
    protected static final int C_BIG_INTEGER = 4;
    protected static final int C_BOOLEAN = 7;
    protected static final int C_DEFAULT = 0;
    protected static final int C_DELEGATE = 8;
    protected static final int C_DOUBLE = 5;
    protected static final int C_INT = 2;
    protected static final int C_LONG = 3;
    protected static final int C_PROPS = 9;
    protected static final int C_STRING = 1;
    protected static final String[] TYPE_DESCS = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    protected SettableBeanProperty[] _arrayDelegateArgs;
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected SettableBeanProperty[] _delegateArgs;
    protected final boolean _forceAccess;
    protected SettableBeanProperty[] _propertyBasedArgs;
    protected final AnnotatedWithParams[] _creators = new AnnotatedWithParams[11];
    protected int _explicitCreators = 0;
    protected boolean _hasNonDefaultCreator = false;

    public CreatorCollector(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this._beanDesc = beanDescription;
        this._canFixAccess = mapperConfig.canOverrideAccessModifiers();
        this._forceAccess = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    private JavaType _computeDelegateType(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) {
        if (!this._hasNonDefaultCreator || annotatedWithParams == null) {
            return null;
        }
        int i2 = 0;
        if (settableBeanPropertyArr != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= settableBeanPropertyArr.length) {
                    break;
                }
                if (settableBeanPropertyArr[i3] == null) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i2);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        AnnotatedParameter parameter = annotatedWithParams.getParameter(i2);
        Object objFindDeserializer = annotationIntrospector.findDeserializer(parameter);
        return objFindDeserializer != null ? parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, objFindDeserializer)) : annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    private <T extends AnnotatedMember> T _fixAccess(T t) throws SecurityException {
        if (t != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) t.getAnnotated(), this._forceAccess);
        }
        return t;
    }

    protected boolean _isEnumValueOf(AnnotatedWithParams annotatedWithParams) {
        return ClassUtil.isEnumType(annotatedWithParams.getDeclaringClass()) && "valueOf".equals(annotatedWithParams.getName());
    }

    protected void _reportDuplicateCreator(int i2, boolean z, AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", TYPE_DESCS[i2], true != z ? "implicitly discovered" : "explicitly marked", annotatedWithParams, annotatedWithParams2));
    }

    public void addBigDecimalCreator(AnnotatedWithParams annotatedWithParams, boolean z) throws SecurityException {
        verifyNonDup(annotatedWithParams, 6, z);
    }

    public void addBigIntegerCreator(AnnotatedWithParams annotatedWithParams, boolean z) throws SecurityException {
        verifyNonDup(annotatedWithParams, 4, z);
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams, boolean z) throws SecurityException {
        verifyNonDup(annotatedWithParams, 7, z);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i2) {
        if (annotatedWithParams.getParameterType(i2).isCollectionLikeType()) {
            if (verifyNonDup(annotatedWithParams, 10, z)) {
                this._arrayDelegateArgs = settableBeanPropertyArr;
            }
        } else if (verifyNonDup(annotatedWithParams, 8, z)) {
            this._delegateArgs = settableBeanPropertyArr;
        }
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams, boolean z) throws SecurityException {
        verifyNonDup(annotatedWithParams, 5, z);
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams, boolean z) throws SecurityException {
        verifyNonDup(annotatedWithParams, 2, z);
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams, boolean z) throws SecurityException {
        verifyNonDup(annotatedWithParams, 3, z);
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        if (verifyNonDup(annotatedWithParams, 9, z)) {
            int length = settableBeanPropertyArr.length;
            if (length > 1) {
                HashMap map = new HashMap();
                for (int i2 = 0; i2 < length; i2++) {
                    String name = settableBeanPropertyArr[i2].getName();
                    if (!name.isEmpty() || settableBeanPropertyArr[i2].getInjectableValueId() == null) {
                        Integer numValueOf = Integer.valueOf(i2);
                        Integer num = (Integer) map.put(name, numValueOf);
                        if (num != null) {
                            throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, numValueOf, ClassUtil.nameOf(this._beanDesc.getBeanClass())));
                        }
                    }
                }
            }
            this._propertyBasedArgs = settableBeanPropertyArr;
        }
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams, boolean z) throws SecurityException {
        verifyNonDup(annotatedWithParams, 1, z);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationContext deserializationContext) {
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType javaType_computeDelegateType = _computeDelegateType(deserializationContext, annotatedWithParamsArr[8], this._delegateArgs);
        JavaType javaType_computeDelegateType2 = _computeDelegateType(deserializationContext, this._creators[10], this._arrayDelegateArgs);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, this._beanDesc.getType());
        AnnotatedWithParams[] annotatedWithParamsArr2 = this._creators;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsArr2[0], annotatedWithParamsArr2[8], javaType_computeDelegateType, this._delegateArgs, annotatedWithParamsArr2[9], this._propertyBasedArgs);
        stdValueInstantiator.configureFromArraySettings(this._creators[10], javaType_computeDelegateType2, this._arrayDelegateArgs);
        stdValueInstantiator.configureFromStringCreator(this._creators[1]);
        stdValueInstantiator.configureFromIntCreator(this._creators[2]);
        stdValueInstantiator.configureFromLongCreator(this._creators[3]);
        stdValueInstantiator.configureFromBigIntegerCreator(this._creators[4]);
        stdValueInstantiator.configureFromDoubleCreator(this._creators[5]);
        stdValueInstantiator.configureFromBigDecimalCreator(this._creators[6]);
        stdValueInstantiator.configureFromBooleanCreator(this._creators[7]);
        return stdValueInstantiator;
    }

    public boolean hasDefaultCreator() {
        return this._creators[0] != null;
    }

    public boolean hasDelegatingCreator() {
        return this._creators[8] != null;
    }

    public boolean hasPropertyBasedCreator() {
        return this._creators[9] != null;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) throws SecurityException {
        _fixAccess(annotatedWithParams);
        this._creators[0] = annotatedWithParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r3.isPrimitive() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r8, int r9, boolean r10) throws java.lang.SecurityException {
        /*
            r7 = this;
            r0 = 1
            r7._hasNonDefaultCreator = r0
            int r1 = r0 << r9
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r2 = r7._creators
            r2 = r2[r9]
            if (r2 == 0) goto L5f
            int r3 = r7._explicitCreators
            r3 = r3 & r1
            r4 = 0
            if (r3 == 0) goto L15
            if (r10 == 0) goto L5e
            r10 = r0
            goto L18
        L15:
            if (r10 != 0) goto L61
            r10 = r4
        L18:
            java.lang.Class r3 = r8.getClass()
            java.lang.Class r5 = r2.getClass()
            if (r5 != r3) goto L5f
            java.lang.Class r3 = r2.getRawParameterType(r4)
            java.lang.Class r5 = r8.getRawParameterType(r4)
            if (r3 != r5) goto L3d
            boolean r3 = r7._isEnumValueOf(r8)
            if (r3 == 0) goto L33
            goto L5e
        L33:
            boolean r3 = r7._isEnumValueOf(r2)
            if (r3 != 0) goto L5f
            r7._reportDuplicateCreator(r9, r10, r2, r8)
            goto L5f
        L3d:
            boolean r6 = r5.isAssignableFrom(r3)
            if (r6 != 0) goto L5e
            boolean r6 = r3.isAssignableFrom(r5)
            if (r6 != 0) goto L5f
            boolean r6 = r3.isPrimitive()
            boolean r5 = r5.isPrimitive()
            if (r6 == r5) goto L5a
            boolean r2 = r3.isPrimitive()
            if (r2 == 0) goto L5f
            goto L5e
        L5a:
            r7._reportDuplicateCreator(r9, r10, r2, r8)
            goto L5f
        L5e:
            return r4
        L5f:
            if (r10 == 0) goto L66
        L61:
            int r10 = r7._explicitCreators
            r10 = r10 | r1
            r7._explicitCreators = r10
        L66:
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r10 = r7._creators
            r7._fixAccess(r8)
            r7 = r8
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r7 = (com.fasterxml.jackson.databind.introspect.AnnotatedWithParams) r7
            r10[r9] = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean):boolean");
    }
}
