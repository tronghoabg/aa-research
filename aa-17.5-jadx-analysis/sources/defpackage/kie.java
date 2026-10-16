package defpackage;

import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes2.dex */
final class kie {
    public static final String a = String.format("(%s NOT NULL) AND (%s != ?)", "number", "number");
    public static final String[] b = {"name", "date", "lookup_uri", RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "number", "numberlabel", "numbertype", "_id"};
    public static final String[] c = {"name", "date", "lookup_uri", RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "number", "numberlabel", "numbertype", "_id", "subscription_component_name", "subscription_id"};
    public final String d;
    public final String[] e;

    public kie(String str, String[] strArr) {
        this.d = str;
        this.e = strArr;
    }
}
