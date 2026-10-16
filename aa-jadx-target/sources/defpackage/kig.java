package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kig implements kih {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public kig(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final defpackage.zhs a(j$.time.LocalDate localDate) {
        if (this.a != 0) {
            return ((defpackage.khx) this.b).a(localDate);
        }
        defpackage.kif kifVar = defpackage.kif.a;
        android.os.Bundle bundle = new android.os.Bundle(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
        com.google.android.enterprise.connectedapps.internal.Bundler bundler = defpackage.kif.b;
        bundler.c(bundle, "date", localDate, com.google.android.enterprise.connectedapps.internal.BundlerType.a("java.time.LocalDate"));
        qdw qdwVar = new qdw(bundler, com.google.android.enterprise.connectedapps.internal.BundlerType.b(new com.google.android.enterprise.connectedapps.internal.BundlerType[]{com.google.android.enterprise.connectedapps.internal.BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent")}));
        defpackage.zif zifVar = qdwVar.c;
        ((defpackage.qdn) this.b).b().p(0, bundle, qdwVar, zifVar);
        return zifVar;
    }

    public final defpackage.zhs b(java.lang.Long l) {
        if (this.a != 0) {
            return ((defpackage.khx) this.b).b(l);
        }
        defpackage.kif kifVar = defpackage.kif.a;
        android.os.Bundle bundle = new android.os.Bundle(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
        com.google.android.enterprise.connectedapps.internal.Bundler bundler = defpackage.kif.b;
        bundler.c(bundle, "timestamp", l, com.google.android.enterprise.connectedapps.internal.BundlerType.a("java.lang.Long"));
        qdw qdwVar = new qdw(bundler, com.google.android.enterprise.connectedapps.internal.BundlerType.b(new com.google.android.enterprise.connectedapps.internal.BundlerType[]{com.google.android.enterprise.connectedapps.internal.BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarReminder")}));
        defpackage.zif zifVar = qdwVar.c;
        ((defpackage.qdn) this.b).b().p(1, bundle, qdwVar, zifVar);
        return zifVar;
    }

    public final defpackage.zhs c(java.lang.Long l, java.lang.Long l2) {
        if (this.a != 0) {
            return ((defpackage.khx) this.b).c(l, l2);
        }
        defpackage.kif kifVar = defpackage.kif.a;
        android.os.Bundle bundle = new android.os.Bundle(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
        com.google.android.enterprise.connectedapps.internal.Bundler bundler = defpackage.kif.b;
        bundler.c(bundle, "startTime", l, com.google.android.enterprise.connectedapps.internal.BundlerType.a("java.lang.Long"));
        bundler.c(bundle, "endTime", l2, com.google.android.enterprise.connectedapps.internal.BundlerType.a("java.lang.Long"));
        qdw qdwVar = new qdw(bundler, com.google.android.enterprise.connectedapps.internal.BundlerType.b(new com.google.android.enterprise.connectedapps.internal.BundlerType[]{com.google.android.enterprise.connectedapps.internal.BundlerType.a("com.google.android.apps.auto.components.calendar.model.CalendarEvent")}));
        defpackage.zif zifVar = qdwVar.c;
        ((defpackage.qdn) this.b).b().p(2, bundle, qdwVar, zifVar);
        return zifVar;
    }
}
