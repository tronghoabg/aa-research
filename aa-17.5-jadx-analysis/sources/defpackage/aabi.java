package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.car.app.model.Alert;

/* loaded from: classes3.dex */
public final class aabi {
    public final zwv a;
    public final aaco b;
    public tsc c;
    private final trk d;
    private final piv e;

    public aabi(trk trkVar, piv pivVar, zwv zwvVar, aaco aacoVar) {
        zkt.m(trkVar);
        this.d = trkVar;
        zkt.m(pivVar);
        this.e = pivVar;
        this.a = zwvVar;
        this.b = aacoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, tsc] */
    public final void a(int i, int i2) {
        zrt.a.a();
        if (zrn.e("InfoWindowRendererV3", 3)) {
            Log.d("InfoWindowRendererV3", "createInfoWindow");
        }
        if (this.c != null) {
            return;
        }
        zwv zwvVar = this.a;
        Bitmap bitmapA = zwvVar.b.k.a(zwvVar, i, i2);
        if (bitmapA != null) {
            abnr abnrVar = (abnr) abdr.a.n();
            abnr abnrVar2 = (abnr) abcf.a.n();
            abnrVar2.t();
            abcf abcfVar = (abcf) abnrVar2.b;
            abcfVar.b |= 1;
            abcfVar.c = 0;
            abnp abnpVarN = abcv.a.n();
            abnpVarN.t();
            abcv abcvVar = (abcv) abnpVarN.b;
            abcvVar.b |= 256;
            abcvVar.i = Alert.DURATION_SHOW_INDEFINITELY;
            abnrVar2.t();
            abcf abcfVar2 = (abcf) abnrVar2.b;
            abcv abcvVar2 = (abcv) abnpVarN.q();
            abcvVar2.getClass();
            abcfVar2.e = abcvVar2;
            abcfVar2.b |= 4;
            abnrVar.bj(abnrVar2);
            uqk uqkVar = new uqk((abdr) abnrVar.q());
            rjg rjgVarO = this.d.o();
            ajnt ajntVarA = Ctry.a();
            ajntVarA.b = abfi.WORLD_ENCODING_LAT_LNG_E7;
            kex kexVarK = rjgVarO.k(uqkVar, ajntVarA.h());
            Object obj = kexVarK.a;
            abnp abnpVarN2 = abii.a.n();
            abnpVarN2.t();
            abii abiiVar = (abii) abnpVarN2.b;
            abiiVar.b |= 32;
            abiiVar.i = true;
            abnpVarN2.t();
            abii abiiVar2 = (abii) abnpVarN2.b;
            abiiVar2.b |= 65536;
            abiiVar2.o = true;
            abii abiiVar3 = (abii) abnpVarN2.q();
            abnp abnpVarN3 = aaey.a.n();
            abnpVarN3.t();
            aaey aaeyVar = (aaey) abnpVarN3.b;
            aaeyVar.b |= 1;
            aaeyVar.c = Alert.DURATION_SHOW_INDEFINITELY;
            aaey aaeyVar2 = (aaey) abnpVarN3.q();
            abnp abnpVar = (abnp) obj;
            abnpVar.t();
            abnr abnrVar3 = (abnr) obj;
            abcs abcsVar = (abcs) abnrVar3.b;
            abcs abcsVar2 = abcs.a;
            abcsVar.b |= 16384;
            abcsVar.n = Alert.DURATION_SHOW_INDEFINITELY;
            abnpVar.t();
            abcs abcsVar3 = (abcs) abnrVar3.b;
            abcsVar3.b |= 64;
            abcsVar3.h = 3;
            abnrVar3.bc(abhx.a, abiiVar3);
            abnrVar3.bc(abhx.f, true);
            abnr abnrVar4 = (abnr) abdl.a.n();
            abnrVar4.bc(aaez.a, aaeyVar2);
            abnpVar.t();
            abcs abcsVar4 = (abcs) abnrVar3.b;
            abdl abdlVar = (abdl) abnrVar4.q();
            abdlVar.getClass();
            abcsVar4.u = abdlVar;
            abcsVar4.b |= 65536;
            abnr abnrVar5 = (abnr) abco.a.n();
            abnrVar5.bd((abcn) kexVarK.l(tss.e(bitmapA)).q());
            abnpVar.t();
            abcs abcsVar5 = (abcs) abnrVar3.b;
            abco abcoVar = (abco) abnrVar5.q();
            abcoVar.getClass();
            abcsVar5.c = abcoVar;
            abcsVar5.b |= 1;
            abnp abnpVarN4 = abag.a.n();
            abah abahVarF = tss.f(too.l(zwvVar.getPosition().latitude, zwvVar.getPosition().longitude));
            abnpVarN4.t();
            abag abagVar = (abag) abnpVarN4.b;
            abahVarF.getClass();
            abagVar.c = abahVarF;
            abagVar.b |= 1;
            abaf abafVar = abaf.TOP;
            abnpVarN4.t();
            abag abagVar2 = (abag) abnpVarN4.b;
            abagVar2.d = abafVar.j;
            abagVar2.b |= 2;
            abnpVar.t();
            abcs abcsVar6 = (abcs) abnrVar3.b;
            abag abagVar3 = (abag) abnpVarN4.q();
            abagVar3.getClass();
            abcsVar6.e = abagVar3;
            abcsVar6.b |= 8;
            ?? K = kexVarK.k();
            this.c = K;
            this.e.b(K, new aacj(this, 1));
        }
    }

    public final void b() {
        if (zrn.e("InfoWindowRendererV3", 3)) {
            Log.d("InfoWindowRendererV3", "destroyInfoWindowLabel");
        }
        tsc tscVar = this.c;
        if (tscVar == null) {
            return;
        }
        tscVar.b();
        tscVar.c();
        this.e.a(tscVar);
        this.c = null;
    }

    public final void c() {
        zrt.a.a();
        if (zrn.e("InfoWindowRendererV3", 3)) {
            Log.d("InfoWindowRendererV3", "showInfoWindow");
        }
        tsc tscVar = this.c;
        if (tscVar == null) {
            return;
        }
        zwv zwvVar = this.a;
        if (zwvVar.b.q(zwvVar)) {
            return;
        }
        tscVar.d();
    }

    public final boolean d() {
        zrt.a.a();
        return this.c != null;
    }
}
