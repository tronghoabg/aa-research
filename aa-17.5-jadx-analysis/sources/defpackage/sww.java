package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* loaded from: classes.dex */
public final class sww implements sli {
    public final UsageReportingOptInOptions a;
    private final Status b;

    public sww(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.b = status;
        this.a = usageReportingOptInOptions;
    }

    @Override // defpackage.sli
    public final Status b() {
        return this.b;
    }

    public final String toString() {
        UsageReportingOptInOptions usageReportingOptInOptions = this.a;
        spu.aw(usageReportingOptInOptions);
        return String.format("OptInOptionsResultImpl[%s]", Boolean.valueOf(usageReportingOptInOptions.a == 1));
    }
}
