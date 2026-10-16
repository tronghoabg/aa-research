package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes2.dex */
public enum odr {
    CACHED_NAME("name"),
    DATE("date"),
    CONTACT_LOOKUP_URI("lookup_uri"),
    CALL_TYPE(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA),
    CALL_NUMBER("number"),
    CALL_NUMBER_LABEL("numberlabel"),
    CALL_NUMBER_TYPE("numbertype");

    public final String h;

    odr(String str) {
        this.h = str;
    }
}
