package defpackage;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import j$.time.LocalDate;

/* loaded from: classes.dex */
public final class kib implements kic {
    private final /* synthetic */ int a;
    private final Object b;

    public kib(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kic
    public final zgp a(LocalDate localDate) {
        if (this.a != 0) {
            return ((kht) this.b).a(localDate);
        }
        kia kiaVar = kia.a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        Bundler bundler = kia.b;
        bundler.c(bundle, "date", localDate, BundlerType.a("java.time.LocalDate"));
        qcz qczVar = new qcz(bundler, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent")));
        zhc zhcVar = qczVar.c;
        ((qco) this.b).b().p(0, bundle, qczVar, zhcVar);
        return zhcVar;
    }

    @Override // defpackage.kic
    public final zgp b(Long l) {
        if (this.a != 0) {
            return ((kht) this.b).b(l);
        }
        kia kiaVar = kia.a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        Bundler bundler = kia.b;
        bundler.c(bundle, "timestamp", l, BundlerType.a("java.lang.Long"));
        qcz qczVar = new qcz(bundler, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarReminder")));
        zhc zhcVar = qczVar.c;
        ((qco) this.b).b().p(1, bundle, qczVar, zhcVar);
        return zhcVar;
    }

    @Override // defpackage.kic
    public final zgp c(Long l, Long l2) {
        if (this.a != 0) {
            return ((kht) this.b).c(l, l2);
        }
        kia kiaVar = kia.a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        Bundler bundler = kia.b;
        bundler.c(bundle, "startTime", l, BundlerType.a("java.lang.Long"));
        bundler.c(bundle, "endTime", l2, BundlerType.a("java.lang.Long"));
        qcz qczVar = new qcz(bundler, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent")));
        zhc zhcVar = qczVar.c;
        ((qco) this.b).b().p(2, bundle, qczVar, zhcVar);
        return zhcVar;
    }
}
