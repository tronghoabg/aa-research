package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class lyz {
    public boolean b;

    public lyz() {
        defpackage.ojm.a();
        j$.time.Instant.now().toEpochMilli();
    }

    protected abstract boolean a();

    protected abstract void b(boolean z);

    public final void c() {
        boolean zA = a();
        if (zA == this.b) {
            return;
        }
        this.b = zA;
        defpackage.ojm.a();
        j$.time.Instant.now().toEpochMilli();
        b(zA);
    }
}
