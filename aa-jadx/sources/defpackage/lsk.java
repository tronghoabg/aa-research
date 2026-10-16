package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class lsk {
    public final j$.time.ZonedDateTime a = j$.time.ZonedDateTime.now(j$.time.ZoneId.systemDefault());
    public final android.content.ComponentName b;

    protected lsk(android.content.ComponentName componentName) {
        this.b = componentName;
    }

    protected abstract java.lang.String a();
}
