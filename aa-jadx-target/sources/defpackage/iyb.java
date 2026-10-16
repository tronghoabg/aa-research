package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iyb extends defpackage.riq {
    private static final defpackage.yqm a = defpackage.yqm.c("CAR.CAM");
    private final android.content.Context b;
    private boolean c;
    private android.content.ComponentName d;

    public iyb(android.content.Context context) {
        this.b = context;
    }

    public final synchronized void c() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1540)).y("makeBackground for component %s", this.d);
        if (!this.c) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1541)).u("Already unbound, not making background");
            return;
        }
        defpackage.sqf.a().b(this.b, this);
        this.c = false;
        this.d = null;
    }

    public final synchronized void d(android.content.ComponentName componentName) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1542)).y("makeForeground for component %s", componentName);
        if (this.c) {
            android.content.ComponentName componentName2 = this.d;
            componentName2.getClass();
            if (componentName2.equals(componentName)) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1544)).u("Already bound, not making foreground");
                return;
            }
            c();
        }
        int i = true != defpackage.sqs.e() ? 64 : 4160;
        boolean zD = defpackage.sqf.a().d(this.b, new android.content.Intent().setComponent(componentName), this, i);
        this.c = zD;
        if (zD) {
            this.d = componentName;
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1543)).y("makeForeground failed due to bindService failure %s", componentName);
        }
    }

    @Override // defpackage.riq
    public final void b(android.content.ComponentName componentName) {
    }

    @Override // defpackage.riq
    public final void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    }
}
