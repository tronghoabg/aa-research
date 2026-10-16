package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* loaded from: classes.dex */
final class swl extends swu {
    final /* synthetic */ nok a;

    public swl(nok nokVar) {
        this.a = nokVar;
    }

    @Override // defpackage.swu
    public final void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        oni.l(status, new ntn(new sww(Status.a, usageReportingOptInOptions), null), this.a);
    }
}
