package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.ContentReference;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JsonLocation implements Serializable {
    public static final JsonLocation NA = new JsonLocation(ContentReference.unknown(), -1, -1, -1, -1);
    private static final long serialVersionUID = 2;
    protected final int _columnNr;
    protected final ContentReference _contentReference;
    protected final int _lineNr;
    protected transient String _sourceDescription;
    protected final long _totalBytes;
    protected final long _totalChars;

    public JsonLocation(ContentReference contentReference, long j2, long j3, int i2, int i3) {
        this._contentReference = contentReference == null ? ContentReference.unknown() : contentReference;
        this._totalBytes = j2;
        this._totalChars = j3;
        this._lineNr = i2;
        this._columnNr = i3;
    }

    public StringBuilder appendOffsetDescription(StringBuilder sb) {
        if (this._contentReference.hasTextualContent()) {
            sb.append("line: ");
            int i2 = this._lineNr;
            if (i2 >= 0) {
                sb.append(i2);
            } else {
                sb.append("UNKNOWN");
            }
            sb.append(", column: ");
            int i3 = this._columnNr;
            if (i3 >= 0) {
                sb.append(i3);
                return sb;
            }
            sb.append("UNKNOWN");
            return sb;
        }
        if (this._lineNr > 0) {
            sb.append("line: ");
            sb.append(this._lineNr);
            if (this._columnNr > 0) {
                sb.append(", column: ");
                sb.append(this._columnNr);
            }
            return sb;
        }
        sb.append("byte offset: #");
        long j2 = this._totalBytes;
        if (j2 >= 0) {
            sb.append(j2);
            return sb;
        }
        sb.append("UNKNOWN");
        return sb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        ContentReference contentReference = this._contentReference;
        if (contentReference == null) {
            if (jsonLocation._contentReference != null) {
                return false;
            }
        } else if (!contentReference.equals(jsonLocation._contentReference)) {
            return false;
        }
        return this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && this._totalBytes == jsonLocation._totalBytes;
    }

    public int hashCode() {
        int i2 = (this._contentReference == null ? 1 : 2) ^ this._lineNr;
        int i3 = this._columnNr;
        return (((int) this._totalChars) ^ (i2 + i3)) + ((int) this._totalBytes);
    }

    public String sourceDescription() {
        String str = this._sourceDescription;
        if (str != null) {
            return str;
        }
        String strBuildSourceDescription = this._contentReference.buildSourceDescription();
        this._sourceDescription = strBuildSourceDescription;
        return strBuildSourceDescription;
    }

    public String toString() {
        String strSourceDescription = sourceDescription();
        StringBuilder sb = new StringBuilder(strSourceDescription.length() + 40);
        sb.append("[Source: ");
        sb.append(strSourceDescription);
        sb.append("; ");
        appendOffsetDescription(sb);
        sb.append(']');
        return sb.toString();
    }

    public JsonLocation(ContentReference contentReference, long j2, int i2, int i3) {
        this(contentReference, -1L, -1L, i2, i3);
    }
}
