package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sxu implements defpackage.sme {
    public final com.google.android.gms.usagereporting.UsageReportingOptInOptions a;
    private final com.google.android.gms.common.api.Status b;

    public sxu(com.google.android.gms.common.api.Status status, com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions) {
        this.b = status;
        this.a = usageReportingOptInOptions;
    }

    @Override // defpackage.sme
    public final com.google.android.gms.common.api.Status b() {
        return this.b;
    }

    public final java.lang.String toString() {
        com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions = this.a;
        defpackage.sqs.aA(usageReportingOptInOptions);
        return java.lang.String.format("OptInOptionsResultImpl[%s]", java.lang.Boolean.valueOf(usageReportingOptInOptions.a == 1));
    }
}
