package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahqy extends java.lang.RuntimeException {
    private final java.util.List<java.lang.String> missingFields;

    public ahqy(defpackage.ahqg ahqgVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    public defpackage.ahpu asInvalidProtocolBufferException() {
        return new defpackage.ahpu(getMessage());
    }
}
