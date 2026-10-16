package defpackage;

/* loaded from: classes2.dex */
public enum pxy {
    UNKNOWN("unknown"),
    INITIAL_REFRESH("initial refresh"),
    REFRESH("refresh"),
    RETRY("retry"),
    OOB_MISSING_RETRY("OobMissingRetry"),
    ACCOUNT_CHANGE("account change"),
    LOCALE_CHANGE("locale change"),
    SERVER_RESET_SIGNAL("server reset signal"),
    FORCED_UPDATE("forced update"),
    PHENTOYPE_BROADCAST_RECEIVED("Phenotype broadcast received"),
    PHENOTYPE_FORCED_UPDATE("Phenotype forced update"),
    INCOGNITO_PREFETCH("incognito prefetch");

    public final String m;

    pxy(String str) {
        this.m = str;
    }
}
