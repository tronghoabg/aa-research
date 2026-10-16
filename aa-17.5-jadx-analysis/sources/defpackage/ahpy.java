package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahpy extends RuntimeException {
    private final List<String> missingFields;

    public ahpy(ahpg ahpgVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    public ahou asInvalidProtocolBufferException() {
        return new ahou(getMessage());
    }
}
