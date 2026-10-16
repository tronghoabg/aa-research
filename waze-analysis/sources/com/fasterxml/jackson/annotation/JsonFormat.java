package com.fasterxml.jackson.annotation;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: WazeSource */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonFormat {
    public static final String DEFAULT_LOCALE = "##default";
    public static final String DEFAULT_TIMEZONE = "##default";

    /* compiled from: WazeSource */
    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        READ_UNKNOWN_ENUM_VALUES_AS_NULL,
        READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE,
        READ_DATE_TIMESTAMPS_AS_NANOSECONDS,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    OptBoolean lenient() default OptBoolean.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};

    /* compiled from: WazeSource */
    public enum Shape {
        BINARY,
        BOOLEAN,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        SCALAR,
        ARRAY,
        OBJECT,
        ANY,
        NATURAL,
        POJO;

        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        public boolean isStructured() {
            return this == OBJECT || this == ARRAY || this == POJO;
        }

        public static boolean isNumeric(Shape shape) {
            return shape != null && shape.isNumeric();
        }

        public static boolean isStructured(Shape shape) {
            return shape != null && shape.isStructured();
        }
    }

    /* compiled from: WazeSource */
    public class Features {
        private static final Features EMPTY = new Features(0, 0);
        private final int _disabled;
        private final int _enabled;

        private Features(int i2, int i3) {
            this._enabled = i2;
            this._disabled = i3;
        }

        public static Features construct(Feature[] featureArr, Feature[] featureArr2) {
            int iOrdinal = 0;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            int iOrdinal2 = 0;
            for (Feature feature2 : featureArr2) {
                iOrdinal2 |= 1 << feature2.ordinal();
            }
            return new Features(iOrdinal, iOrdinal2);
        }

        public static Features empty() {
            return EMPTY;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (obj.getClass() != getClass()) {
                return false;
            }
            Features features = (Features) obj;
            return features._enabled == this._enabled && features._disabled == this._disabled;
        }

        public Boolean get(Feature feature) {
            int iOrdinal = 1 << feature.ordinal();
            if ((this._disabled & iOrdinal) != 0) {
                return Boolean.FALSE;
            }
            if ((this._enabled & iOrdinal) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public int hashCode() {
            return this._disabled + this._enabled;
        }

        public String toString() {
            return this == EMPTY ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this._enabled), Integer.valueOf(this._disabled));
        }

        public Features with(Feature... featureArr) {
            int iOrdinal = this._enabled;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            return iOrdinal == this._enabled ? this : new Features(iOrdinal, this._disabled);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.fasterxml.jackson.annotation.JsonFormat.Features withOverrides(com.fasterxml.jackson.annotation.JsonFormat.Features r5) {
            /*
                r4 = this;
                if (r5 != 0) goto L3
                goto L24
            L3:
                int r0 = r5._disabled
                int r1 = r5._enabled
                r2 = 0
                if (r0 != 0) goto Ld
                if (r1 == 0) goto L24
                r0 = r2
            Ld:
                int r3 = r4._enabled
                if (r3 != 0) goto L17
                int r3 = r4._disabled
                if (r3 == 0) goto L16
                goto L18
            L16:
                return r5
            L17:
                r2 = r3
            L18:
                int r5 = ~r0
                r5 = r5 & r2
                r5 = r5 | r1
                int r3 = r4._disabled
                int r1 = ~r1
                r1 = r1 & r3
                r0 = r0 | r1
                if (r5 != r2) goto L25
                if (r0 != r3) goto L25
            L24:
                return r4
            L25:
                com.fasterxml.jackson.annotation.JsonFormat$Features r4 = new com.fasterxml.jackson.annotation.JsonFormat$Features
                r4.<init>(r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonFormat.Features.withOverrides(com.fasterxml.jackson.annotation.JsonFormat$Features):com.fasterxml.jackson.annotation.JsonFormat$Features");
        }

        public Features without(Feature... featureArr) {
            int iOrdinal = this._disabled;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            return iOrdinal == this._disabled ? this : new Features(this._enabled, iOrdinal);
        }

        public static Features construct(JsonFormat jsonFormat) {
            return construct(jsonFormat.with(), jsonFormat.without());
        }
    }

    /* compiled from: WazeSource */
    public class Value implements JacksonAnnotationValue<JsonFormat>, Serializable {
        private static final Value EMPTY = new Value();
        private static final long serialVersionUID = 1;
        private final Features _features;
        private final Boolean _lenient;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private transient TimeZone _timezone;
        private final String _timezoneStr;

        public Value(String str, Shape shape, String str2, String str3, Features features, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, features, bool);
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

        public static final Value empty() {
            return EMPTY;
        }

        public static Value forLeniency(boolean z) {
            return new Value("", null, null, null, null, Features.empty(), Boolean.valueOf(z));
        }

        public static Value forPattern(String str) {
            return new Value(str, null, null, null, null, Features.empty(), null);
        }

        public static Value forShape(Shape shape) {
            return new Value("", shape, null, null, null, Features.empty(), null);
        }

        public static final Value from(JsonFormat jsonFormat) {
            return jsonFormat == null ? EMPTY : new Value(jsonFormat);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public static Value mergeAll(Value... valueArr) {
            Value valueWithOverrides = null;
            for (Value value : valueArr) {
                if (value != null) {
                    valueWithOverrides = valueWithOverrides == null ? value : valueWithOverrides.withOverrides(value);
                }
            }
            return valueWithOverrides;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            return this._shape == value._shape && this._features.equals(value._features) && _equal(this._lenient, value._lenient) && _equal(this._timezoneStr, value._timezoneStr) && _equal(this._pattern, value._pattern) && _equal(this._timezone, value._timezone) && _equal(this._locale, value._locale);
        }

        public Boolean getFeature(Feature feature) {
            return this._features.get(feature);
        }

        public Features getFeatures() {
            return this._features;
        }

        public Boolean getLenient() {
            return this._lenient;
        }

        public Locale getLocale() {
            return this._locale;
        }

        public String getPattern() {
            return this._pattern;
        }

        public Shape getShape() {
            return this._shape;
        }

        public TimeZone getTimeZone() {
            TimeZone timeZone = this._timezone;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this._timezoneStr;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str);
            this._timezone = timeZone2;
            return timeZone2;
        }

        public boolean hasLenient() {
            return this._lenient != null;
        }

        public boolean hasLocale() {
            return this._locale != null;
        }

        public boolean hasPattern() {
            String str = this._pattern;
            return str != null && str.length() > 0;
        }

        public boolean hasShape() {
            return this._shape != Shape.ANY;
        }

        public boolean hasTimeZone() {
            if (this._timezone != null) {
                return true;
            }
            String str = this._timezoneStr;
            return (str == null || str.isEmpty()) ? false : true;
        }

        public int hashCode() {
            String str = this._timezoneStr;
            int iHashCode = str == null ? 1 : str.hashCode();
            String str2 = this._pattern;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            int iHashCode2 = iHashCode + this._shape.hashCode();
            Boolean bool = this._lenient;
            if (bool != null) {
                iHashCode2 ^= bool.hashCode();
            }
            Locale locale = this._locale;
            if (locale != null) {
                iHashCode2 += locale.hashCode();
            }
            return this._features.hashCode() ^ iHashCode2;
        }

        public boolean isLenient() {
            return Boolean.TRUE.equals(this._lenient);
        }

        public String timeZoneAsString() {
            TimeZone timeZone = this._timezone;
            return timeZone != null ? timeZone.getID() : this._timezoneStr;
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features);
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JsonFormat> valueFor() {
            return JsonFormat.class;
        }

        public Value withFeature(Feature feature) {
            Features featuresWith = this._features.with(feature);
            return featuresWith == this._features ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, featuresWith, this._lenient);
        }

        public Value withLenient(Boolean bool) {
            return bool == this._lenient ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, this._features, bool);
        }

        public Value withLocale(Locale locale) {
            return new Value(this._pattern, this._shape, locale, this._timezoneStr, this._timezone, this._features, this._lenient);
        }

        public final Value withOverrides(Value value) {
            Value value2;
            TimeZone timeZone;
            if (value == null || value == (value2 = EMPTY) || value == this) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str = value._pattern;
            if (str == null || str.isEmpty()) {
                str = this._pattern;
            }
            String str2 = str;
            Shape shape = value._shape;
            if (shape == Shape.ANY) {
                shape = this._shape;
            }
            Shape shape2 = shape;
            Locale locale = value._locale;
            if (locale == null) {
                locale = this._locale;
            }
            Locale locale2 = locale;
            Features features = this._features;
            Features featuresWithOverrides = features == null ? value._features : features.withOverrides(value._features);
            Boolean bool = value._lenient;
            if (bool == null) {
                bool = this._lenient;
            }
            Boolean bool2 = bool;
            String str3 = value._timezoneStr;
            if (str3 == null || str3.isEmpty()) {
                str3 = this._timezoneStr;
                timeZone = this._timezone;
            } else {
                timeZone = value._timezone;
            }
            return new Value(str2, shape2, locale2, str3, timeZone, featuresWithOverrides, bool2);
        }

        public Value withPattern(String str) {
            return new Value(str, this._shape, this._locale, this._timezoneStr, this._timezone, this._features, this._lenient);
        }

        public Value withShape(Shape shape) {
            return shape == this._shape ? this : new Value(this._pattern, shape, this._locale, this._timezoneStr, this._timezone, this._features, this._lenient);
        }

        public Value withTimeZone(TimeZone timeZone) {
            return new Value(this._pattern, this._shape, this._locale, null, timeZone, this._features, this._lenient);
        }

        public Value withoutFeature(Feature feature) {
            Features featuresWithout = this._features.without(feature);
            return featuresWithout == this._features ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, featuresWithout, this._lenient);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone(), Features.construct(jsonFormat), jsonFormat.lenient().asBoolean());
        }

        @Deprecated
        public Value(String str, Shape shape, String str2, String str3, Features features) {
            this(str, shape, str2, str3, features, (Boolean) null);
        }

        public Value() {
            this("", Shape.ANY, "", "", Features.empty(), (Boolean) null);
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, Features features) {
            this(str, shape, locale, str2, timeZone, features, null);
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, Features features, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = str2;
            this._features = features == null ? Features.empty() : features;
            this._lenient = bool;
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, Features features) {
            this(str, shape, locale, timeZone, features, (Boolean) null);
        }

        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, Features features, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = null;
            this._features = features == null ? Features.empty() : features;
            this._lenient = bool;
        }
    }
}
