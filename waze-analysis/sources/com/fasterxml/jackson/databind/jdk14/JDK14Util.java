package com.fasterxml.jackson.databind.jdk14;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.PotentialCreator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NativeImageUtil;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JDK14Util {

    /* compiled from: WazeSource */
    @Deprecated
    class CreatorLocator {
        protected final MapperConfig<?> _config;
        protected final List<AnnotatedConstructor> _constructors;
        protected final AnnotationIntrospector _intr;
        protected final AnnotatedConstructor _primaryConstructor;
        protected final AnnotatedClass _recordClass;
        protected final RawTypeName[] _recordFields;

        CreatorLocator(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
            int i2;
            this._recordClass = annotatedClass;
            this._intr = mapperConfig.getAnnotationIntrospector();
            this._config = mapperConfig;
            RawTypeName[] recordFields = RecordAccessor.instance().getRecordFields(annotatedClass.getRawType());
            this._recordFields = recordFields;
            AnnotatedConstructor defaultConstructor = null;
            if (recordFields == null) {
                this._constructors = annotatedClass.getConstructors();
                this._primaryConstructor = null;
                return;
            }
            int length = recordFields.length;
            if (length != 0) {
                List<AnnotatedConstructor> constructors = annotatedClass.getConstructors();
                this._constructors = constructors;
                Iterator<AnnotatedConstructor> it = constructors.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnnotatedConstructor next = it.next();
                    if (next.getParameterCount() == length) {
                        while (i2 < length) {
                            i2 = next.getRawParameterType(i2).equals(this._recordFields[i2].rawType) ? i2 + 1 : 0;
                        }
                        defaultConstructor = next;
                        break loop0;
                    }
                }
            } else {
                defaultConstructor = annotatedClass.getDefaultConstructor();
                this._constructors = Collections.singletonList(defaultConstructor);
            }
            if (defaultConstructor == null) {
                throw new IllegalArgumentException("Failed to find the canonical Record constructor of type ".concat(ClassUtil.getTypeDescription(this._recordClass.getType())));
            }
            this._primaryConstructor = defaultConstructor;
        }

        public AnnotatedConstructor locate(List<String> list) {
            for (AnnotatedConstructor annotatedConstructor : this._constructors) {
                JsonCreator.Mode modeFindCreatorAnnotation = this._intr.findCreatorAnnotation(this._config, annotatedConstructor);
                if (modeFindCreatorAnnotation != null && JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation && (JsonCreator.Mode.DELEGATING == modeFindCreatorAnnotation || annotatedConstructor != this._primaryConstructor)) {
                    return null;
                }
            }
            RawTypeName[] rawTypeNameArr = this._recordFields;
            if (rawTypeNameArr == null) {
                return null;
            }
            for (RawTypeName rawTypeName : rawTypeNameArr) {
                list.add(rawTypeName.name);
            }
            return this._primaryConstructor;
        }
    }

    /* compiled from: WazeSource */
    class RawTypeName {
        public final String name;
        public final Class<?> rawType;

        public RawTypeName(Class<?> cls, String str) {
            this.rawType = cls;
            this.name = str;
        }
    }

    /* compiled from: WazeSource */
    class RecordAccessor {
        private static final RecordAccessor INSTANCE;
        private static final RuntimeException PROBLEM;
        private final Method RECORD_COMPONENT_GET_NAME;
        private final Method RECORD_COMPONENT_GET_TYPE;
        private final Method RECORD_GET_RECORD_COMPONENTS;

        static {
            RecordAccessor recordAccessor = null;
            try {
                e = null;
                recordAccessor = new RecordAccessor();
            } catch (RuntimeException e2) {
                e = e2;
            }
            INSTANCE = recordAccessor;
            PROBLEM = e;
        }

        private RecordAccessor() throws ClassNotFoundException {
            try {
                this.RECORD_GET_RECORD_COMPONENTS = Class.class.getMethod("getRecordComponents", null);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.RECORD_COMPONENT_GET_NAME = cls.getMethod("getName", null);
                this.RECORD_COMPONENT_GET_TYPE = cls.getMethod("getType", null);
            } catch (Exception e2) {
                throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e2.getClass().getName(), e2.getMessage()), e2);
            }
        }

        public static RecordAccessor instance() {
            RuntimeException runtimeException = PROBLEM;
            if (runtimeException == null) {
                return INSTANCE;
            }
            throw runtimeException;
        }

        public String[] getRecordFieldNames(Class<?> cls) {
            Object[] objArrRecordComponents = recordComponents(cls);
            if (objArrRecordComponents == null) {
                return null;
            }
            String[] strArr = new String[objArrRecordComponents.length];
            for (int i2 = 0; i2 < objArrRecordComponents.length; i2++) {
                try {
                    strArr[i2] = (String) this.RECORD_COMPONENT_GET_NAME.invoke(objArrRecordComponents[i2], null);
                } catch (Exception e2) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i2), Integer.valueOf(objArrRecordComponents.length), ClassUtil.nameOf(cls)), e2);
                }
            }
            return strArr;
        }

        public RawTypeName[] getRecordFields(Class<?> cls) {
            Object[] objArrRecordComponents = recordComponents(cls);
            if (objArrRecordComponents == null) {
                return null;
            }
            RawTypeName[] rawTypeNameArr = new RawTypeName[objArrRecordComponents.length];
            for (int i2 = 0; i2 < objArrRecordComponents.length; i2++) {
                try {
                    try {
                        rawTypeNameArr[i2] = new RawTypeName((Class) this.RECORD_COMPONENT_GET_TYPE.invoke(objArrRecordComponents[i2], null), (String) this.RECORD_COMPONENT_GET_NAME.invoke(objArrRecordComponents[i2], null));
                    } catch (Exception e2) {
                        throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i2), Integer.valueOf(objArrRecordComponents.length), ClassUtil.nameOf(cls)), e2);
                    }
                } catch (Exception e3) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i2), Integer.valueOf(objArrRecordComponents.length), ClassUtil.nameOf(cls)), e3);
                }
            }
            return rawTypeNameArr;
        }

        protected Object[] recordComponents(Class<?> cls) {
            try {
                return (Object[]) this.RECORD_GET_RECORD_COMPONENTS.invoke(cls, null);
            } catch (Exception e2) {
                if (NativeImageUtil.isUnsupportedFeatureError(e2)) {
                    return null;
                }
                throw new IllegalArgumentException("Failed to access RecordComponents of type ".concat(ClassUtil.nameOf(cls)));
            }
        }
    }

    public static PotentialCreator findCanonicalRecordConstructor(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<PotentialCreator> list) {
        int i2;
        AnnotatedConstructor defaultConstructor;
        RawTypeName[] recordFields = RecordAccessor.instance().getRecordFields(annotatedClass.getRawType());
        if (recordFields == null) {
            return null;
        }
        int length = recordFields.length;
        if (length == 0 && (defaultConstructor = annotatedClass.getDefaultConstructor()) != null) {
            return new PotentialCreator(defaultConstructor, null);
        }
        for (PotentialCreator potentialCreator : list) {
            if (potentialCreator.paramCount() == length) {
                for (0; i2 < length; i2 + 1) {
                    i2 = potentialCreator.creator().getRawParameterType(i2).equals(recordFields[i2].rawType) ? i2 + 1 : 0;
                }
                PropertyName[] propertyNameArr = new PropertyName[length];
                for (int i3 = 0; i3 < length; i3++) {
                    propertyNameArr[i3] = PropertyName.construct(recordFields[i3].name);
                }
                return potentialCreator.introspectParamNames(mapperConfig, propertyNameArr);
            }
        }
        throw new IllegalArgumentException("Failed to find the canonical Record constructor of type ".concat(ClassUtil.getTypeDescription(annotatedClass.getType())));
    }

    @Deprecated
    public static AnnotatedConstructor findRecordConstructor(DeserializationContext deserializationContext, BeanDescription beanDescription, List<String> list) {
        return findRecordConstructor(beanDescription.getClassInfo(), deserializationContext.getAnnotationIntrospector(), deserializationContext.getConfig(), list);
    }

    public static String[] getRecordFieldNames(Class<?> cls) {
        return RecordAccessor.instance().getRecordFieldNames(cls);
    }

    @Deprecated
    public static AnnotatedConstructor findRecordConstructor(AnnotatedClass annotatedClass, AnnotationIntrospector annotationIntrospector, MapperConfig<?> mapperConfig, List<String> list) {
        return new CreatorLocator(mapperConfig, annotatedClass).locate(list);
    }
}
