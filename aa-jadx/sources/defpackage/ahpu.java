package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahpu extends java.io.IOException {
    private defpackage.ahqg unfinishedMessage;

    public ahpu(java.lang.String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    static defpackage.ahpu invalidEndTag() {
        return new defpackage.ahpu("Protocol message end-group tag did not match expected tag.");
    }

    static defpackage.ahpu invalidTag() {
        return new defpackage.ahpu("Protocol message contained an invalid tag (zero).");
    }

    static defpackage.ahpu invalidUtf8() {
        return new defpackage.ahpu("Protocol message had invalid UTF-8.");
    }

    static defpackage.ahpu invalidWireType() {
        return new defpackage.ahpu("Protocol message tag had invalid wire type.");
    }

    static defpackage.ahpu malformedVarint() {
        return new defpackage.ahpu("CodedInputStream encountered a malformed varint.");
    }

    static defpackage.ahpu negativeSize() {
        return new defpackage.ahpu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static defpackage.ahpu recursionLimitExceeded() {
        return new defpackage.ahpu("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static defpackage.ahpu sizeLimitExceeded() {
        return new defpackage.ahpu("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static defpackage.ahpu truncatedMessage() {
        return new defpackage.ahpu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public defpackage.ahqg getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    public defpackage.ahpu setUnfinishedMessage(defpackage.ahqg ahqgVar) {
        this.unfinishedMessage = ahqgVar;
        return this;
    }
}
