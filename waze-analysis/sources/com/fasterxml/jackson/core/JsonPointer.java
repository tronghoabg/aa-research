package com.fasterxml.jackson.core;

import androidx.collection.SieveCacheKt;
import com.fasterxml.jackson.core.io.NumberInput;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JsonPointer implements Serializable {
    protected static final JsonPointer EMPTY = new JsonPointer();
    private static final long serialVersionUID = 1;
    protected final String _asString;
    protected final int _asStringOffset;
    protected int _hashCode;
    protected final int _matchingElementIndex;
    protected final String _matchingPropertyName;
    protected final JsonPointer _nextSegment;

    /* compiled from: WazeSource */
    class PointerParent {
        public final int fullPathOffset;
        public final PointerParent parent;
        public final String segment;

        PointerParent(PointerParent pointerParent, int i2, String str) {
            this.parent = pointerParent;
            this.fullPathOffset = i2;
            this.segment = str;
        }
    }

    /* compiled from: WazeSource */
    class PointerSegment {
        public final int index;
        public final PointerSegment next;
        public int pathOffset;
        public PointerSegment prev;
        public final String property;

        public PointerSegment(PointerSegment pointerSegment, String str, int i2) {
            this.next = pointerSegment;
            this.property = str;
            this.index = i2;
            if (pointerSegment != null) {
                pointerSegment.prev = this;
            }
        }
    }

    protected JsonPointer() {
        this._nextSegment = null;
        this._matchingPropertyName = null;
        this._matchingElementIndex = -1;
        this._asString = "";
        this._asStringOffset = 0;
    }

    private static int _appendEscape(StringBuilder sb, char c2) {
        if (c2 == '0') {
            sb.append('~');
            return 1;
        }
        if (c2 == '1') {
            sb.append('/');
            return 1;
        }
        sb.append('~');
        return 0;
    }

    private static void _appendEscaped(StringBuilder sb, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '/') {
                sb.append("~1");
            } else if (cCharAt == '~') {
                sb.append("~0");
            } else {
                sb.append(cCharAt);
            }
        }
    }

    private static JsonPointer _buildPath(String str, int i2, String str2, PointerParent pointerParent) {
        JsonPointer jsonPointer = new JsonPointer(str, i2, str2, EMPTY);
        while (pointerParent != null) {
            JsonPointer jsonPointer2 = new JsonPointer(str, pointerParent.fullPathOffset, pointerParent.segment, jsonPointer);
            pointerParent = pointerParent.parent;
            jsonPointer = jsonPointer2;
        }
        return jsonPointer;
    }

    private final boolean _compare(String str, int i2, String str2, int i3) {
        int length = str.length();
        if (length - i2 != str2.length() - i3) {
            return false;
        }
        while (i2 < length) {
            int i4 = i2 + 1;
            int i5 = i3 + 1;
            if (str.charAt(i2) != str2.charAt(i3)) {
                return false;
            }
            i2 = i4;
            i3 = i5;
        }
        return true;
    }

    protected static int _extractEscapedSegment(String str, int i2, int i3, StringBuilder sb) {
        int i4 = i3 - 1;
        if (i4 - i2 > 0) {
            sb.append((CharSequence) str, i2, i4);
        }
        int i_appendEscape = _appendEscape(sb, str.charAt(i3));
        while (true) {
            i3 += i_appendEscape;
            while (true) {
                int length = str.length();
                if (i3 >= length) {
                    return -1;
                }
                char cCharAt = str.charAt(i3);
                if (cCharAt == '/') {
                    return i3;
                }
                i3++;
                if (cCharAt == '~') {
                    if (i3 < length) {
                        break;
                    }
                    cCharAt = '~';
                }
                sb.append(cCharAt);
            }
            i_appendEscape = _appendEscape(sb, str.charAt(i3));
        }
    }

    private static final int _parseIndex(String str) throws NumberFormatException {
        int length = str.length();
        if (length != 0 && length <= 10) {
            char cCharAt = str.charAt(0);
            if (cCharAt <= '0') {
                return (length == 1 && cCharAt == '0') ? 0 : -1;
            }
            if (cCharAt <= '9') {
                for (int i2 = 1; i2 < length; i2++) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 > '9' || cCharAt2 < '0') {
                        return -1;
                    }
                }
                if (length != 10) {
                    return NumberInput.parseInt(str);
                }
                long j2 = Long.parseLong(str);
                if (j2 > SieveCacheKt.NodeLinkMask) {
                    return -1;
                }
                return (int) j2;
            }
        }
        return -1;
    }

    protected static JsonPointer _parseTail(String str) {
        PointerParent pointerParent = null;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int length = str.length();
            if (i3 >= length) {
                return _buildPath(str, i2, str.substring(i2 + 1), pointerParent);
            }
            int i4 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt == '/') {
                PointerParent pointerParent2 = new PointerParent(pointerParent, i2, str.substring(i2 + 1, i3));
                i2 = i3;
                i3 = i4;
                pointerParent = pointerParent2;
            } else if (cCharAt != '~' || i4 >= length) {
                i3 = i4;
            } else {
                StringBuilder sb = new StringBuilder(32);
                int i_extractEscapedSegment = _extractEscapedSegment(str, i2 + 1, i4, sb);
                String string = sb.toString();
                if (i_extractEscapedSegment < 0) {
                    return _buildPath(str, i2, string, pointerParent);
                }
                PointerParent pointerParent3 = new PointerParent(pointerParent, i2, string);
                i2 = i_extractEscapedSegment;
                i3 = i_extractEscapedSegment + 1;
                pointerParent = pointerParent3;
            }
        }
    }

    public static JsonPointer compile(String str) {
        if (str == null || str.length() == 0) {
            return EMPTY;
        }
        if (str.charAt(0) == '/') {
            return _parseTail(str);
        }
        throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
    }

    public static JsonPointer forPath(JsonStreamContext jsonStreamContext, boolean z) {
        PointerSegment pointerSegment;
        if (!jsonStreamContext.hasPathSegment() && (!z || !jsonStreamContext.inRoot() || !jsonStreamContext.hasCurrentIndex())) {
            jsonStreamContext = jsonStreamContext.getParent();
        }
        int length = 0;
        PointerSegment pointerSegment2 = null;
        while (jsonStreamContext != null) {
            if (jsonStreamContext.inObject()) {
                String currentName = jsonStreamContext.getCurrentName();
                if (currentName == null) {
                    currentName = "";
                }
                length += currentName.length() + 2;
                pointerSegment = new PointerSegment(pointerSegment2, currentName, -1);
            } else if (jsonStreamContext.inArray() || z) {
                pointerSegment = new PointerSegment(pointerSegment2, null, jsonStreamContext.getCurrentIndex());
                length += 6;
            } else {
                jsonStreamContext = jsonStreamContext.getParent();
            }
            pointerSegment2 = pointerSegment;
            jsonStreamContext = jsonStreamContext.getParent();
        }
        if (pointerSegment2 == null) {
            return EMPTY;
        }
        StringBuilder sb = new StringBuilder(length);
        PointerSegment pointerSegment3 = null;
        PointerSegment pointerSegment4 = pointerSegment2;
        while (pointerSegment4 != null) {
            pointerSegment4.pathOffset = sb.length();
            sb.append('/');
            String str = pointerSegment4.property;
            if (str != null) {
                _appendEscaped(sb, str);
            } else {
                sb.append(pointerSegment4.index);
            }
            PointerSegment pointerSegment5 = pointerSegment4;
            pointerSegment4 = pointerSegment4.next;
            pointerSegment3 = pointerSegment5;
        }
        String string = sb.toString();
        JsonPointer jsonPointer = EMPTY;
        while (pointerSegment3 != null) {
            String str2 = pointerSegment3.property;
            if (str2 != null) {
                jsonPointer = new JsonPointer(string, pointerSegment3.pathOffset, str2, jsonPointer);
            } else {
                int i2 = pointerSegment3.index;
                jsonPointer = new JsonPointer(string, pointerSegment3.pathOffset, String.valueOf(i2), i2, jsonPointer);
            }
            pointerSegment3 = pointerSegment3.prev;
        }
        return jsonPointer;
    }

    private Object writeReplace() {
        return new Serialization(toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonPointer)) {
            return false;
        }
        JsonPointer jsonPointer = (JsonPointer) obj;
        return _compare(this._asString, this._asStringOffset, jsonPointer._asString, jsonPointer._asStringOffset);
    }

    public int getMatchingIndex() {
        return this._matchingElementIndex;
    }

    public String getMatchingProperty() {
        return this._matchingPropertyName;
    }

    public int hashCode() {
        int iHashCode = this._hashCode;
        if (iHashCode == 0) {
            iHashCode = toString().hashCode();
            if (iHashCode == 0) {
                iHashCode = -1;
            }
            this._hashCode = iHashCode;
        }
        return iHashCode;
    }

    public JsonPointer matchElement(int i2) {
        if (i2 != this._matchingElementIndex || i2 < 0) {
            return null;
        }
        return this._nextSegment;
    }

    public JsonPointer matchProperty(String str) {
        if (this._nextSegment == null || !this._matchingPropertyName.equals(str)) {
            return null;
        }
        return this._nextSegment;
    }

    public boolean matches() {
        return this._nextSegment == null;
    }

    public boolean mayMatchElement() {
        return this._matchingElementIndex >= 0;
    }

    public JsonPointer tail() {
        return this._nextSegment;
    }

    public String toString() {
        int i2 = this._asStringOffset;
        String str = this._asString;
        return i2 <= 0 ? str : str.substring(i2);
    }

    /* compiled from: WazeSource */
    class Serialization implements Externalizable {
        private String _fullPath;

        Serialization(String str) {
            this._fullPath = str;
        }

        private Object readResolve() {
            return JsonPointer.compile(this._fullPath);
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) {
            this._fullPath = objectInput.readUTF();
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeUTF(this._fullPath);
        }

        public Serialization() {
        }
    }

    protected JsonPointer(String str, int i2, String str2, int i3, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i2;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = i3;
    }

    protected JsonPointer(String str, int i2, String str2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i2;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = _parseIndex(str2);
    }
}
