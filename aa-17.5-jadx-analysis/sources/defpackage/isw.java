package defpackage;

import com.google.android.apps.auto.carservice.car.audio.resampling.NativeResampler;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class isw {
    public ipr a;
    public boolean b = false;
    private ipr c;

    public static final void g(ipt iptVar, ipr iprVar) {
        iptVar.getClass();
        ipr iprVarB = iptVar.b();
        NativeResampler.native48000StereoTo48000Mono(iprVar.h.array(), iprVar.a(), iprVarB.h.array(), iprVarB.a());
        h(iprVar, iprVarB);
        iptVar.e(iprVarB);
    }

    private static void h(ipr iprVar, ipr iprVar2) {
        iprVar2.a = iprVar.a;
        iprVar2.b = iprVar.b;
        iprVar2.c = iprVar.c;
        iprVar2.d = iprVar.d;
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

    public final boolean c(ipt iptVar, ipr iprVar) {
        ipr iprVar2;
        ipr iprVar3 = this.a;
        if (iprVar3 == null || (iprVar2 = this.c) == null) {
            if (iprVar3 == null) {
                this.a = iprVar;
                return false;
            }
            this.c = iprVar;
            return false;
        }
        iptVar.getClass();
        ByteBuffer byteBuffer = iprVar.h;
        ByteBuffer byteBuffer2 = iprVar3.h;
        ipr iprVarB = iptVar.b();
        NativeResampler.native48000MonoTo16000Mono(byteBuffer2.array(), iprVar3.a(), iprVar2.h.array(), iprVar2.a(), byteBuffer.array(), iprVar.a(), iprVarB.h.array(), iprVarB.a());
        h(iprVar, iprVarB);
        iptVar.e(iprVarB);
        this.a = null;
        this.c = null;
        return true;
    }

    public final boolean d(ipt iptVar, ipr iprVar) {
        ipr iprVar2 = this.a;
        if (iprVar2 == null) {
            this.a = iprVar;
            return false;
        }
        ByteBuffer byteBuffer = iprVar.h;
        byte[] bArrArray = iprVar2.h.array();
        int iA = iprVar2.a();
        byte[] bArrArray2 = byteBuffer.array();
        int iA2 = iprVar.a();
        iptVar.getClass();
        ipr iprVarB = iptVar.b();
        byte[] bArrArray3 = iprVarB.h.array();
        int iA3 = iprVarB.a();
        if (this.b) {
            NativeResampler.native48000StereoTo16000MonoSecond(bArrArray, iA, bArrArray2, iA2, bArrArray3, iA3);
            this.a = null;
            this.b = false;
        } else {
            NativeResampler.native48000StereoTo16000MonoFirst(bArrArray, iA, bArrArray2, iA2, bArrArray3, iA3);
            this.a = iprVar;
            this.b = true;
        }
        h(iprVar, iprVarB);
        iptVar.e(iprVarB);
        return true;
    }

    public final void e(ipt iptVar, ipr iprVar) {
        ByteBuffer byteBuffer = iprVar.h;
        byte[] bArrArray = byteBuffer.array();
        int iA = iprVar.a();
        int iLimit = byteBuffer.limit();
        iptVar.getClass();
        ipr iprVarB = iptVar.b();
        ByteBuffer byteBuffer2 = iprVarB.h;
        NativeResampler.nativeMonoToStereoWithLimit(bArrArray, iA, iLimit, byteBuffer2.array(), iprVarB.a(), byteBuffer2.limit());
        h(iprVar, iprVarB);
        iptVar.e(iprVarB);
        this.a = null;
    }

    public final void f(ipt iptVar, ipr iprVar) {
        if (!this.b) {
            iptVar.getClass();
            ByteBuffer byteBuffer = iprVar.h;
            ipr iprVarB = iptVar.b();
            ipr iprVarB2 = iptVar.b();
            NativeResampler.native16000MonoTo48000StereoFirst(byteBuffer.array(), iprVar.a(), iprVarB.h.array(), iprVarB.a(), iprVarB2.h.array(), iprVarB2.a());
            h(iprVar, iprVarB);
            iptVar.e(iprVarB);
            this.a = iprVarB2;
            this.b = true;
            return;
        }
        ipr iprVar2 = this.a;
        iprVar2.getClass();
        iptVar.getClass();
        ByteBuffer byteBuffer2 = iprVar.h;
        ipr iprVarB3 = iptVar.b();
        NativeResampler.native16000MonoTo48000StereoSecond(byteBuffer2.array(), iprVar.a(), iprVar2.h.array(), iprVar2.a(), iprVarB3.h.array(), iprVarB3.a());
        h(iprVar, iprVar2);
        h(iprVar, iprVarB3);
        iptVar.e(iprVar2);
        iptVar.e(iprVarB3);
        this.a = null;
        this.b = false;
    }
}
