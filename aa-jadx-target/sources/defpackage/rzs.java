package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rzs {
    static final defpackage.rzs a = b().a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public rzs(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
    }

    public static defpackage.rzr b() {
        defpackage.rzr rzrVar = new defpackage.rzr();
        rzrVar.c(false);
        rzrVar.b(false);
        rzrVar.d(false);
        rzrVar.e(false);
        rzrVar.f(false);
        rzrVar.g(false);
        rzrVar.h(false);
        rzrVar.i(false);
        return rzrVar;
    }

    public static defpackage.rzs c(android.os.Bundle bundle) {
        boolean z = bundle.getBoolean("connected");
        boolean z2 = bundle.getBoolean("configured");
        defpackage.rzr rzrVarB = b();
        rzrVarB.b(z2);
        rzrVarB.c(z);
        rzrVarB.d(bundle.getBoolean("unlocked"));
        if (z && z2) {
            rzrVarB.e(bundle.getBoolean("accessory"));
            rzrVarB.f(bundle.getBoolean("adb"));
            rzrVarB.g(bundle.getBoolean("audio_source"));
            rzrVarB.h(bundle.getBoolean("mtp"));
            rzrVarB.i(bundle.getBoolean("ptp"));
        }
        return rzrVarB.a();
    }

    public final int a() {
        return (this.c ? 1 : 0) + (true != this.b ? 0 : 2) + (true != this.d ? 0 : 4) + (true != this.e ? 0 : 8) + (true != this.f ? 0 : 16) + (true != this.g ? 0 : 32) + (true != this.h ? 0 : 64) + (true == this.i ? 128 : 0);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.rzs) && a() == ((defpackage.rzs) obj).a();
    }

    public final int hashCode() {
        return a();
    }

    public final java.lang.String toString() {
        return "UsbState{configured=" + this.b + ", connected=" + this.c + ", dataUnlocked=" + this.d + ", functionAccessory=" + this.e + ", functionAdb=" + this.f + ", functionAudioSource=" + this.g + ", functionMtp=" + this.h + ", functionPtp=" + this.i + "}";
    }

    public rzs() {
        throw null;
    }
}
