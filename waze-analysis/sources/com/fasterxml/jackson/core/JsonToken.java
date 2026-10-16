package com.fasterxml.jackson.core;

import androidx.credentials.provider.CredentialEntry;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum JsonToken {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE(CredentialEntry.TRUE_STRING, 9),
    VALUE_FALSE(CredentialEntry.FALSE_STRING, 10),
    VALUE_NULL("null", 11);

    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    JsonToken(String str, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                this._serializedBytes[i3] = (byte) this._serializedChars[i3];
            }
        }
        this._id = i2;
        if (i2 == 10) {
            z = true;
        } else if (i2 == 9) {
            i2 = 9;
            z = true;
        } else {
            z = false;
        }
        this._isBoolean = z;
        if (i2 == 7) {
            z2 = true;
        } else if (i2 == 8) {
            i2 = 8;
            z2 = true;
        } else {
            z2 = false;
        }
        this._isNumber = z2;
        boolean z4 = i2 == 1 || i2 == 3;
        this._isStructStart = z4;
        boolean z5 = i2 == 2 || i2 == 4;
        this._isStructEnd = z5;
        if (!z4 && !z5 && i2 != 5 && i2 != -1) {
            z3 = true;
        }
        this._isScalar = z3;
    }

    public static String valueDescFor(JsonToken jsonToken) {
        if (jsonToken == null) {
            return "<end of input>";
        }
        switch (jsonToken.ordinal()) {
            case 1:
            case 2:
            case 5:
                return "Object value";
            case 3:
            case 4:
                return "Array value";
            case 6:
                return "Embedded Object value";
            case 7:
                return "String value";
            case 8:
                return "Integer value";
            case 9:
                return "Floating-point value";
            case 10:
            case 11:
                return "Boolean value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final String asString() {
        return this._serialized;
    }

    public final int id() {
        return this._id;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }
}
