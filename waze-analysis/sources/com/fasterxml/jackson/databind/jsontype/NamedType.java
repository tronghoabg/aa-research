package com.fasterxml.jackson.databind.jsontype;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _class;
    protected final int _hashCode;
    protected String _name;

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        setName(str);
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
        NamedType namedType = (NamedType) obj;
        return this._class == namedType._class && Objects.equals(this._name, namedType._name);
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getType() {
        return this._class;
    }

    public boolean hasName() {
        return this._name != null;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public void setName(String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        this._name = str;
    }

    public String toString() {
        String str;
        String name = this._class.getName();
        String str2 = this._name;
        if (str2 == null) {
            str = "null";
        } else {
            str = "'" + str2 + "'";
        }
        return "[NamedType, class " + name + ", name: " + str + "]";
    }

    public NamedType(Class<?> cls) {
        this(cls, null);
    }
}
