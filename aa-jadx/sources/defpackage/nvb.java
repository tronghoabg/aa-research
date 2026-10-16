package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvb {
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon a;
    public final java.lang.String b;
    public final android.app.PendingIntent c;
    public final j$.time.Duration d;
    public final int e;

    public nvb(defpackage.aafz aafzVar) {
        this.a = (com.google.android.apps.auto.components.graphics.icon.GhIcon) aafzVar.e;
        this.b = (java.lang.String) aafzVar.d;
        this.c = (android.app.PendingIntent) aafzVar.b;
        this.d = (j$.time.Duration) aafzVar.c;
        this.e = aafzVar.a;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("Action[icon=%s, label=%s, intent=%s, duration=%s, semanticType=%s]", this.a, this.b, this.c, this.d, defpackage.edd.z(this.e));
    }
}
