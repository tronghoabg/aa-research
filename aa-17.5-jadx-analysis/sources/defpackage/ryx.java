package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ryx {
    static final ryx a = b().a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ryx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
    }

    public static ryw b() {
        ryw rywVar = new ryw();
        rywVar.c(false);
        rywVar.b(false);
        rywVar.d(false);
        rywVar.e(false);
        rywVar.f(false);
        rywVar.g(false);
        rywVar.h(false);
        rywVar.i(false);
        return rywVar;
    }

    public static ryx c(Bundle bundle) {
        boolean z = bundle.getBoolean("connected");
        boolean z2 = bundle.getBoolean("configured");
        ryw rywVarB = b();
        rywVarB.b(z2);
        rywVarB.c(z);
        rywVarB.d(bundle.getBoolean("unlocked"));
        if (z && z2) {
            rywVarB.e(bundle.getBoolean("accessory"));
            rywVarB.f(bundle.getBoolean("adb"));
            rywVarB.g(bundle.getBoolean("audio_source"));
            rywVarB.h(bundle.getBoolean("mtp"));
            rywVarB.i(bundle.getBoolean("ptp"));
        }
        return rywVarB.a();
    }

    public final int a() {
        return (this.c ? 1 : 0) + (true != this.b ? 0 : 2) + (true != this.d ? 0 : 4) + (true != this.e ? 0 : 8) + (true != this.f ? 0 : 16) + (true != this.g ? 0 : 32) + (true != this.h ? 0 : 64) + (true == this.i ? 128 : 0);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ryx) && a() == ((ryx) obj).a();
    }

    public final int hashCode() {
        return a();
    }

    public final String toString() {
        return "UsbState{configured=" + this.b + ", connected=" + this.c + ", dataUnlocked=" + this.d + ", functionAccessory=" + this.e + ", functionAdb=" + this.f + ", functionAudioSource=" + this.g + ", functionMtp=" + this.h + ", functionPtp=" + this.i + "}";
    }

    public ryx() {
        throw null;
    }
}
