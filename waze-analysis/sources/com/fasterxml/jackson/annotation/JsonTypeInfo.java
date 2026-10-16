package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonTypeInfo {

    /* compiled from: WazeSource */
    public enum As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    /* compiled from: WazeSource */
    public enum Id {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        SIMPLE_NAME("@type"),
        DEDUCTION(null),
        CUSTOM(null);

        private final String _defaultPropertyName;

        Id(String str) {
            this._defaultPropertyName = str;
        }

        public String getDefaultPropertyName() {
            return this._defaultPropertyName;
        }
    }

    /* compiled from: WazeSource */
    @Deprecated
    public abstract class None {
    }

    /* compiled from: WazeSource */
    public class Value implements JacksonAnnotationValue<JsonTypeInfo>, Serializable {
        protected static final Value EMPTY = new Value(Id.NONE, As.PROPERTY, null, null, false, null);
        private static final long serialVersionUID = 1;
        protected final Class<?> _defaultImpl;
        protected final Id _idType;
        protected final boolean _idVisible;
        protected final As _inclusionType;
        protected final String _propertyName;
        protected final Boolean _requireTypeIdForSubtypes;

        protected Value(Id id, As as, String str, Class<?> cls, boolean z, Boolean bool) {
            this._defaultImpl = cls;
            this._idType = id;
            this._inclusionType = as;
            this._propertyName = str;
            this._idVisible = z;
            this._requireTypeIdForSubtypes = bool;
        }

        private static <T> boolean _equal(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }

        private static boolean _equals(Value value, Value value2) {
            return value._idType == value2._idType && value._inclusionType == value2._inclusionType && value._defaultImpl == value2._defaultImpl && value._idVisible == value2._idVisible && _equal(value._propertyName, value2._propertyName) && _equal(value._requireTypeIdForSubtypes, value2._requireTypeIdForSubtypes);
        }

        public static Value construct(Id id, As as, String str, Class<?> cls, boolean z, Boolean bool) {
            if (str == null || str.isEmpty()) {
                str = id != null ? id.getDefaultPropertyName() : "";
            }
            return new Value(id, as, str, (cls == null || cls.isAnnotation()) ? null : cls, z, bool);
        }

        public static Value from(JsonTypeInfo jsonTypeInfo) {
            if (jsonTypeInfo == null) {
                return null;
            }
            return construct(jsonTypeInfo.use(), jsonTypeInfo.include(), jsonTypeInfo.property(), jsonTypeInfo.defaultImpl(), jsonTypeInfo.visible(), jsonTypeInfo.requireTypeIdForSubtypes().asBoolean());
        }

        public static boolean isEnabled(Value value) {
            Id id;
            return (value == null || (id = value._idType) == null || id == Id.NONE) ? false : true;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return obj.getClass() == getClass() && _equals(this, (Value) obj);
        }

        public Class<?> getDefaultImpl() {
            return this._defaultImpl;
        }

        public Id getIdType() {
            return this._idType;
        }

        public boolean getIdVisible() {
            return this._idVisible;
        }

        public As getInclusionType() {
            return this._inclusionType;
        }

        public String getPropertyName() {
            return this._propertyName;
        }

        public Boolean getRequireTypeIdForSubtypes() {
            return this._requireTypeIdForSubtypes;
        }

        public int hashCode() {
            Id id = this._idType;
            int iHashCode = id != null ? id.hashCode() : 0;
            As as = this._inclusionType;
            int iHashCode2 = as != null ? as.hashCode() : 0;
            int i2 = iHashCode + 31;
            String str = this._propertyName;
            int iHashCode3 = ((((i2 * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31;
            Class<?> cls = this._defaultImpl;
            return ((((iHashCode3 + (cls != null ? cls.hashCode() : 0)) * 31) + (true != this._requireTypeIdForSubtypes.booleanValue() ? -17 : 11)) * 31) + (true == this._idVisible ? 11 : -17);
        }

        public String toString() {
            Id id = this._idType;
            As as = this._inclusionType;
            String str = this._propertyName;
            Class<?> cls = this._defaultImpl;
            return String.format("JsonTypeInfo.Value(idType=%s,includeAs=%s,propertyName=%s,defaultImpl=%s,idVisible=%s,requireTypeIdForSubtypes=%s)", id, as, str, cls == null ? "NULL" : cls.getName(), Boolean.valueOf(this._idVisible), this._requireTypeIdForSubtypes);
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JsonTypeInfo> valueFor() {
            return JsonTypeInfo.class;
        }

        public Value withDefaultImpl(Class<?> cls) {
            return cls == this._defaultImpl ? this : new Value(this._idType, this._inclusionType, this._propertyName, cls, this._idVisible, this._requireTypeIdForSubtypes);
        }

        public Value withIdType(Id id) {
            return id == this._idType ? this : new Value(id, this._inclusionType, this._propertyName, this._defaultImpl, this._idVisible, this._requireTypeIdForSubtypes);
        }

        public Value withIdVisible(boolean z) {
            return z == this._idVisible ? this : new Value(this._idType, this._inclusionType, this._propertyName, this._defaultImpl, z, this._requireTypeIdForSubtypes);
        }

        public Value withInclusionType(As as) {
            return as == this._inclusionType ? this : new Value(this._idType, as, this._propertyName, this._defaultImpl, this._idVisible, this._requireTypeIdForSubtypes);
        }

        public Value withPropertyName(String str) {
            return str == this._propertyName ? this : new Value(this._idType, this._inclusionType, str, this._defaultImpl, this._idVisible, this._requireTypeIdForSubtypes);
        }

        public Value withRequireTypeIdForSubtypes(Boolean bool) {
            return this._requireTypeIdForSubtypes == bool ? this : new Value(this._idType, this._inclusionType, this._propertyName, this._defaultImpl, this._idVisible, bool);
        }
    }

    Class<?> defaultImpl() default JsonTypeInfo.class;

    As include() default As.PROPERTY;

    String property() default "";

    OptBoolean requireTypeIdForSubtypes() default OptBoolean.DEFAULT;

    Id use();

    boolean visible() default false;
}
