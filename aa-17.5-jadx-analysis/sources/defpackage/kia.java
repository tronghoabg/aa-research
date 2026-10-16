package defpackage;

import android.os.Bundle;
import com.google.android.apps.auto.components.calendar.model.CrossProfileCalendarStore_Bundler;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import j$.time.LocalDate;

/* loaded from: classes.dex */
public final class kia {
    public static final kia a = new kia();
    public static final Bundler b = new CrossProfileCalendarStore_Bundler();
    public final qdt[] c;

    private kia() {
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        this.c = new qdt[]{new qdt() { // from class: khz
            @Override // defpackage.qdt
            public final Bundle a(Bundle bundle, qdc qdcVar) {
                int i4 = i;
                if (i4 == 0) {
                    Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
                    Bundler bundler = kia.b;
                    qcz.c(kia.a().b((Long) bundler.a(bundle, "timestamp", BundlerType.a("java.lang.Long"))), new ohb(qdcVar, bundler, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarReminder"))));
                    return bundle2;
                }
                if (i4 != 1) {
                    Bundle bundle3 = new Bundle(Bundler.class.getClassLoader());
                    Bundler bundler2 = kia.b;
                    qcz.c(kia.a().c((Long) bundler2.a(bundle, "startTime", BundlerType.a("java.lang.Long")), (Long) bundler2.a(bundle, "endTime", BundlerType.a("java.lang.Long"))), new ohb(qdcVar, bundler2, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent"))));
                    return bundle3;
                }
                Bundle bundle4 = new Bundle(Bundler.class.getClassLoader());
                Bundler bundler3 = kia.b;
                qcz.c(kia.a().a((LocalDate) bundler3.a(bundle, "date", BundlerType.a("java.time.LocalDate"))), new ohb(qdcVar, bundler3, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent"))));
                return bundle4;
            }
        }, new qdt() { // from class: khz
            @Override // defpackage.qdt
            public final Bundle a(Bundle bundle, qdc qdcVar) {
                int i4 = i2;
                if (i4 == 0) {
                    Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
                    Bundler bundler = kia.b;
                    qcz.c(kia.a().b((Long) bundler.a(bundle, "timestamp", BundlerType.a("java.lang.Long"))), new ohb(qdcVar, bundler, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarReminder"))));
                    return bundle2;
                }
                if (i4 != 1) {
                    Bundle bundle3 = new Bundle(Bundler.class.getClassLoader());
                    Bundler bundler2 = kia.b;
                    qcz.c(kia.a().c((Long) bundler2.a(bundle, "startTime", BundlerType.a("java.lang.Long")), (Long) bundler2.a(bundle, "endTime", BundlerType.a("java.lang.Long"))), new ohb(qdcVar, bundler2, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent"))));
                    return bundle3;
                }
                Bundle bundle4 = new Bundle(Bundler.class.getClassLoader());
                Bundler bundler3 = kia.b;
                qcz.c(kia.a().a((LocalDate) bundler3.a(bundle, "date", BundlerType.a("java.time.LocalDate"))), new ohb(qdcVar, bundler3, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent"))));
                return bundle4;
            }
        }, new qdt() { // from class: khz
            @Override // defpackage.qdt
            public final Bundle a(Bundle bundle, qdc qdcVar) {
                int i4 = i3;
                if (i4 == 0) {
                    Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
                    Bundler bundler = kia.b;
                    qcz.c(kia.a().b((Long) bundler.a(bundle, "timestamp", BundlerType.a("java.lang.Long"))), new ohb(qdcVar, bundler, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarReminder"))));
                    return bundle2;
                }
                if (i4 != 1) {
                    Bundle bundle3 = new Bundle(Bundler.class.getClassLoader());
                    Bundler bundler2 = kia.b;
                    qcz.c(kia.a().c((Long) bundler2.a(bundle, "startTime", BundlerType.a("java.lang.Long")), (Long) bundler2.a(bundle, "endTime", BundlerType.a("java.lang.Long"))), new ohb(qdcVar, bundler2, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent"))));
                    return bundle3;
                }
                Bundle bundle4 = new Bundle(Bundler.class.getClassLoader());
                Bundler bundler3 = kia.b;
                qcz.c(kia.a().a((LocalDate) bundler3.a(bundle, "date", BundlerType.a("java.time.LocalDate"))), new ohb(qdcVar, bundler3, BundlerType.b(BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent"))));
                return bundle4;
            }
        }};
    }

    public static final kht a() {
        kid kidVar = kid.a;
        if (kidVar.b == null) {
            synchronized (kid.class) {
                if (kidVar.b == null) {
                    kidVar.b = new xv();
                }
            }
        }
        xv xvVar = kidVar.b;
        if (xvVar.a == null) {
            xvVar.a = new kht();
        }
        return (kht) xvVar.a;
    }
}
