package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.ClassUtil;
import j$.util.Objects;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class PropertyName implements Serializable {
    private static final String _NO_NAME = "";
    private static final String _USE_DEFAULT = "";
    private static final long serialVersionUID = 1;
    protected SerializableString _encodedSimple;
    protected final String _namespace;
    protected final String _simpleName;
    public static final PropertyName USE_DEFAULT = new PropertyName("", null);
    public static final PropertyName NO_NAME = new PropertyName(new String(""), null);

    public PropertyName(String str, String str2) {
        this._simpleName = ClassUtil.nonNullString(str);
        this._namespace = str2;
    }

    private static String _nonEmpty(String str, String str2) {
        return (str != null && (str2 == null || !str.isEmpty())) ? str : str2;
    }

    public static PropertyName construct(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.isEmpty()) ? USE_DEFAULT : new PropertyName(InternCache.instance.intern(str), str2);
    }

    public static PropertyName merge(PropertyName propertyName, PropertyName propertyName2) {
        if (propertyName != null) {
            if (propertyName2 != null && propertyName != NO_NAME) {
                String str = propertyName._namespace;
                String str2 = propertyName2._namespace;
                String str3 = propertyName._simpleName;
                String str4 = propertyName2._simpleName;
                String str_nonEmpty = _nonEmpty(str3, str4);
                String str_nonEmpty2 = _nonEmpty(str, str2);
                if (str_nonEmpty2 != str || str_nonEmpty != str3) {
                    if (str_nonEmpty2 != str2 || str_nonEmpty != str4) {
                        return construct(str_nonEmpty, str_nonEmpty2);
                    }
                }
            }
            return propertyName;
        }
        return propertyName2;
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
        PropertyName propertyName = (PropertyName) obj;
        String str = this._simpleName;
        if (str == null) {
            if (propertyName._simpleName != null) {
                return false;
            }
        } else if (!str.equals(propertyName._simpleName)) {
            return false;
        }
        String str2 = this._namespace;
        return str2 == null ? propertyName._namespace == null : str2.equals(propertyName._namespace);
    }

    public String getNamespace() {
        return this._namespace;
    }

    public String getSimpleName() {
        return this._simpleName;
    }

    public boolean hasNamespace() {
        return this._namespace != null;
    }

    public boolean hasSimpleName() {
        return !this._simpleName.isEmpty();
    }

    public int hashCode() {
        return (Objects.hashCode(this._simpleName) * 31) + Objects.hashCode(this._namespace);
    }

    public PropertyName internSimpleName() {
        if (!this._simpleName.isEmpty()) {
            String strIntern = InternCache.instance.intern(this._simpleName);
            if (strIntern != this._simpleName) {
                return new PropertyName(strIntern, this._namespace);
            }
        }
        return this;
    }

    public boolean isEmpty() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    protected Object readResolve() {
        if (this._namespace != null) {
            return this;
        }
        String str = this._simpleName;
        return (str == null || "".equals(str)) ? USE_DEFAULT : this;
    }

    public SerializableString simpleAsEncoded(MapperConfig<?> mapperConfig) {
        SerializableString serializableString = this._encodedSimple;
        if (serializableString != null) {
            return serializableString;
        }
        String str = this._simpleName;
        SerializableString serializedString = mapperConfig == null ? new SerializedString(str) : mapperConfig.compileString(str);
        this._encodedSimple = serializedString;
        return serializedString;
    }

    public String toString() {
        String str = this._namespace;
        String str2 = this._simpleName;
        if (str == null) {
            return str2;
        }
        return "{" + str + "}" + str2;
    }

    public PropertyName withNamespace(String str) {
        String str2 = this._namespace;
        return (str != null ? !str.equals(str2) : str2 != null) ? new PropertyName(this._simpleName, str) : this;
    }

    public PropertyName withSimpleName(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this._simpleName) ? this : new PropertyName(str, this._namespace);
    }

    public PropertyName(String str) {
        this(str, null);
    }

    public boolean hasSimpleName(String str) {
        return this._simpleName.equals(str);
    }

    public static PropertyName construct(String str) {
        return (str == null || str.isEmpty()) ? USE_DEFAULT : new PropertyName(InternCache.instance.intern(str), null);
    }
}
