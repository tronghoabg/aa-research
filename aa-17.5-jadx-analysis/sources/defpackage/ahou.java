package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahou extends IOException {
    private ahpg unfinishedMessage;

    public ahou(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    static ahou invalidEndTag() {
        return new ahou("Protocol message end-group tag did not match expected tag.");
    }

    static ahou invalidTag() {
        return new ahou("Protocol message contained an invalid tag (zero).");
    }

    static ahou invalidUtf8() {
        return new ahou("Protocol message had invalid UTF-8.");
    }

    static ahou invalidWireType() {
        return new ahou("Protocol message tag had invalid wire type.");
    }

    static ahou malformedVarint() {
        return new ahou("CodedInputStream encountered a malformed varint.");
    }

    static ahou negativeSize() {
        return new ahou("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static ahou recursionLimitExceeded() {
        return new ahou("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static ahou sizeLimitExceeded() {
        return new ahou("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static ahou truncatedMessage() {
        return new ahou("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public ahpg getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    public ahou setUnfinishedMessage(ahpg ahpgVar) {
        this.unfinishedMessage = ahpgVar;
        return this;
    }
}
