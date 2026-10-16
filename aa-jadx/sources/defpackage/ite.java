package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ite {
    public defpackage.ipy a;
    public boolean b = false;
    private defpackage.ipy c;

    public static final void g(defpackage.iqa iqaVar, defpackage.ipy ipyVar) {
        iqaVar.getClass();
        defpackage.ipy ipyVarB = iqaVar.b();
        com.google.android.apps.auto.carservice.car.audio.resampling.NativeResampler.native48000StereoTo48000Mono(ipyVar.h.array(), ipyVar.a(), ipyVarB.h.array(), ipyVarB.a());
        h(ipyVar, ipyVarB);
        iqaVar.e(ipyVarB);
    }

    private static void h(defpackage.ipy ipyVar, defpackage.ipy ipyVar2) {
        ipyVar2.a = ipyVar.a;
        ipyVar2.b = ipyVar.b;
        ipyVar2.c = ipyVar.c;
        ipyVar2.d = ipyVar.d;
    }

    public final void a() {
        if (this.a != null) {
            this.a = null;
        }
        if (this.c != null) {
            this.c = null;
        }
        this.b = false;
    }

    public final boolean b() {
        return this.c != null;
    }

    public final boolean c(defpackage.iqa iqaVar, defpackage.ipy ipyVar) {
        defpackage.ipy ipyVar2;
        defpackage.ipy ipyVar3 = this.a;
        if (ipyVar3 == null || (ipyVar2 = this.c) == null) {
            if (ipyVar3 == null) {
                this.a = ipyVar;
                return false;
            }
            this.c = ipyVar;
            return false;
        }
        iqaVar.getClass();
        java.nio.ByteBuffer byteBuffer = ipyVar.h;
        java.nio.ByteBuffer byteBuffer2 = ipyVar3.h;
        defpackage.ipy ipyVarB = iqaVar.b();
        com.google.android.apps.auto.carservice.car.audio.resampling.NativeResampler.native48000MonoTo16000Mono(byteBuffer2.array(), ipyVar3.a(), ipyVar2.h.array(), ipyVar2.a(), byteBuffer.array(), ipyVar.a(), ipyVarB.h.array(), ipyVarB.a());
        h(ipyVar, ipyVarB);
        iqaVar.e(ipyVarB);
        this.a = null;
        this.c = null;
        return true;
    }

    public final boolean d(defpackage.iqa iqaVar, defpackage.ipy ipyVar) {
        defpackage.ipy ipyVar2 = this.a;
        if (ipyVar2 == null) {
            this.a = ipyVar;
            return false;
        }
        java.nio.ByteBuffer byteBuffer = ipyVar.h;
        byte[] bArrArray = ipyVar2.h.array();
        int iA = ipyVar2.a();
        byte[] bArrArray2 = byteBuffer.array();
        int iA2 = ipyVar.a();
        iqaVar.getClass();
        defpackage.ipy ipyVarB = iqaVar.b();
        byte[] bArrArray3 = ipyVarB.h.array();
        int iA3 = ipyVarB.a();
        if (this.b) {
            com.google.android.apps.auto.carservice.car.audio.resampling.NativeResampler.native48000StereoTo16000MonoSecond(bArrArray, iA, bArrArray2, iA2, bArrArray3, iA3);
            this.a = null;
            this.b = false;
        } else {
            com.google.android.apps.auto.carservice.car.audio.resampling.NativeResampler.native48000StereoTo16000MonoFirst(bArrArray, iA, bArrArray2, iA2, bArrArray3, iA3);
            this.a = ipyVar;
            this.b = true;
        }
        h(ipyVar, ipyVarB);
        iqaVar.e(ipyVarB);
        return true;
    }

    public final void e(defpackage.iqa iqaVar, defpackage.ipy ipyVar) {
        java.nio.ByteBuffer byteBuffer = ipyVar.h;
        byte[] bArrArray = byteBuffer.array();
        int iA = ipyVar.a();
        int iLimit = byteBuffer.limit();
        iqaVar.getClass();
        defpackage.ipy ipyVarB = iqaVar.b();
        java.nio.ByteBuffer byteBuffer2 = ipyVarB.h;
        com.google.android.apps.auto.carservice.car.audio.resampling.NativeResampler.nativeMonoToStereoWithLimit(bArrArray, iA, iLimit, byteBuffer2.array(), ipyVarB.a(), byteBuffer2.limit());
        h(ipyVar, ipyVarB);
        iqaVar.e(ipyVarB);
        this.a = null;
    }

    public final void f(defpackage.iqa iqaVar, defpackage.ipy ipyVar) {
        if (!this.b) {
            iqaVar.getClass();
            java.nio.ByteBuffer byteBuffer = ipyVar.h;
            defpackage.ipy ipyVarB = iqaVar.b();
            defpackage.ipy ipyVarB2 = iqaVar.b();
            com.google.android.apps.auto.carservice.car.audio.resampling.NativeResampler.native16000MonoTo48000StereoFirst(byteBuffer.array(), ipyVar.a(), ipyVarB.h.array(), ipyVarB.a(), ipyVarB2.h.array(), ipyVarB2.a());
            h(ipyVar, ipyVarB);
            iqaVar.e(ipyVarB);
            this.a = ipyVarB2;
            this.b = true;
            return;
        }
        defpackage.ipy ipyVar2 = this.a;
        ipyVar2.getClass();
        iqaVar.getClass();
        java.nio.ByteBuffer byteBuffer2 = ipyVar.h;
        defpackage.ipy ipyVarB3 = iqaVar.b();
        com.google.android.apps.auto.carservice.car.audio.resampling.NativeResampler.native16000MonoTo48000StereoSecond(byteBuffer2.array(), ipyVar.a(), ipyVar2.h.array(), ipyVar2.a(), ipyVarB3.h.array(), ipyVarB3.a());
        h(ipyVar, ipyVar2);
        h(ipyVar, ipyVarB3);
        iqaVar.e(ipyVar2);
        iqaVar.e(ipyVarB3);
        this.a = null;
        this.b = false;
    }
}
