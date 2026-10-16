package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SerializedString implements SerializableString, Serializable {
    private static final JsonStringEncoder JSON_ENCODER = JsonStringEncoder.getInstance();
    private static final long serialVersionUID = 1;
    protected transient String _jdkSerializeValue;
    protected volatile char[] _quotedChars;
    protected volatile byte[] _quotedUTF8Ref;
    protected volatile byte[] _unquotedUTF8Ref;
    protected final String _value;

    public SerializedString(String str) {
        this._value = (String) Objects.requireNonNull(str, "Null String illegal for SerializedString");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this._jdkSerializeValue = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendQuoted(char[] cArr, int i2) {
        char[] cArrQuoteAsString = this._quotedChars;
        if (cArrQuoteAsString == null) {
            cArrQuoteAsString = JSON_ENCODER.quoteAsString(this._value);
            this._quotedChars = cArrQuoteAsString;
        }
        int length = cArrQuoteAsString.length;
        if (i2 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrQuoteAsString, 0, cArr, i2, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendQuotedUTF8(byte[] bArr, int i2) {
        byte[] bArrQuoteAsUTF8 = this._quotedUTF8Ref;
        if (bArrQuoteAsUTF8 == null) {
            bArrQuoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
            this._quotedUTF8Ref = bArrQuoteAsUTF8;
        }
        int length = bArrQuoteAsUTF8.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrQuoteAsUTF8, 0, bArr, i2, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendUnquoted(char[] cArr, int i2) {
        String str = this._value;
        int length = str.length();
        if (i2 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i2);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendUnquotedUTF8(byte[] bArr, int i2) {
        byte[] bArrEncodeAsUTF8 = this._unquotedUTF8Ref;
        if (bArrEncodeAsUTF8 == null) {
            bArrEncodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
            this._unquotedUTF8Ref = bArrEncodeAsUTF8;
        }
        int length = bArrEncodeAsUTF8.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrEncodeAsUTF8, 0, bArr, i2, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrQuoteAsString = JSON_ENCODER.quoteAsString(this._value);
        this._quotedChars = cArrQuoteAsString;
        return cArrQuoteAsString;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrQuoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
        this._quotedUTF8Ref = bArrQuoteAsUTF8;
        return bArrQuoteAsUTF8;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrEncodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
        this._unquotedUTF8Ref = bArrEncodeAsUTF8;
        return bArrEncodeAsUTF8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final String getValue() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    protected Object readResolve() {
        return new SerializedString(this._jdkSerializeValue);
    }

    public final String toString() {
        return this._value;
    }
}
