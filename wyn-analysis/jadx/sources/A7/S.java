package A7;

import Va.M6;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import g0.C2661b;
import io.flutter.embedding.engine.FlutterJNI;
import j$.util.Objects;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class S implements zzub {

    /* renamed from: f, reason: collision with root package name */
    public static S f687f;

    /* renamed from: g, reason: collision with root package name */
    public static io.flutter.view.s f688g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f689a;

    /* renamed from: b, reason: collision with root package name */
    public long f690b;

    /* renamed from: c, reason: collision with root package name */
    public Object f691c;

    /* renamed from: d, reason: collision with root package name */
    public Object f692d;

    /* renamed from: e, reason: collision with root package name */
    public Object f693e;

    public /* synthetic */ S(Ea.a aVar, long j8, zzou zzouVar, Aa.a aVar2) {
        this.f689a = 1;
        this.f691c = aVar;
        this.f690b = j8;
        this.f692d = zzouVar;
        this.f693e = aVar2;
    }

    public static S a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f687f == null) {
            f687f = new S(flutterJNI);
        }
        if (f688g == null) {
            S s10 = f687f;
            Objects.requireNonNull(s10);
            io.flutter.view.s sVar = new io.flutter.view.s(s10, displayManager, 0);
            f688g = sVar;
            displayManager.registerDisplayListener(sVar, null);
        }
        if (f687f.f690b == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f687f.f690b = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f687f;
    }

    public static S c(C0301x c0301x) {
        String str = c0301x.f1103a;
        Bundle bundleW = c0301x.f1104b.W();
        S s10 = new S(0);
        s10.f691c = str;
        s10.f692d = c0301x.f1105c;
        s10.f693e = bundleW;
        s10.f690b = c0301x.f1106d;
        return s10;
    }

    public C0301x b() {
        return new C0301x((String) this.f691c, new C0298w(new Bundle((Bundle) this.f693e)), (String) this.f692d, this.f690b);
    }

    public String toString() {
        switch (this.f689a) {
            case 0:
                String strValueOf = String.valueOf((Bundle) this.f693e);
                StringBuilder sb2 = new StringBuilder("origin=");
                sb2.append((String) this.f692d);
                sb2.append(",name=");
                return M6.t(sb2, (String) this.f691c, ",params=", strValueOf);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
    public zztr zza() {
        int iLimit;
        Ea.a aVar = (Ea.a) this.f691c;
        long j8 = this.f690b;
        zzou zzouVar = (zzou) this.f692d;
        Aa.a aVar2 = (Aa.a) this.f693e;
        aVar.getClass();
        zzrx zzrxVar = new zzrx();
        zzoh zzohVar = new zzoh();
        zzohVar.zzc(Long.valueOf(j8));
        zzohVar.zzd(zzouVar);
        zzohVar.zze(Boolean.valueOf(Ea.a.f3630i));
        Boolean bool = Boolean.TRUE;
        zzohVar.zza(bool);
        zzohVar.zzb(bool);
        zzrxVar.zzd(zzohVar.zzf());
        Ea.a.f3631j.getClass();
        int i5 = aVar2.f1252f;
        if (i5 == -1) {
            Bitmap bitmap = aVar2.f1247a;
            AbstractC1732v.i(bitmap);
            iLimit = bitmap.getAllocationByteCount();
        } else if (i5 == 17 || i5 == 842094169) {
            ByteBuffer byteBuffer = aVar2.f1248b;
            AbstractC1732v.i(byteBuffer);
            iLimit = byteBuffer.limit();
        } else {
            if (i5 == 35) {
                AbstractC1732v.i(null);
                throw null;
            }
            iLimit = 0;
        }
        zzoa zzoaVar = new zzoa();
        zzoaVar.zza(i5 != -1 ? i5 != 35 ? i5 != 842094169 ? i5 != 16 ? i5 != 17 ? zzob.UNKNOWN_FORMAT : zzob.NV21 : zzob.NV16 : zzob.YV12 : zzob.YUV_420_888 : zzob.BITMAP);
        zzoaVar.zzb(Integer.valueOf(iLimit));
        zzrxVar.zzc(zzoaVar.zzd());
        zzsa zzsaVar = new zzsa();
        aVar.f3635g.getClass();
        zzsaVar.zza(A6.c.P(1));
        zzrxVar.zze(zzsaVar.zzc());
        zzrz zzrzVarZzf = zzrxVar.zzf();
        zzow zzowVar = new zzow();
        zzowVar.zze(aVar.f3635g.c() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzowVar.zzh(zzrzVarZzf);
        return zzuf.zzf(zzowVar);
    }

    public S(int i5) {
        this.f689a = i5;
        switch (i5) {
            case 2:
                this.f690b = 0L;
                this.f693e = new C2661b();
                break;
        }
    }

    public S(FlutterJNI flutterJNI) {
        this.f689a = 3;
        this.f690b = -1L;
        this.f692d = new io.flutter.view.t(this, 0L);
        this.f693e = new io.flutter.view.a(this);
        this.f691c = flutterJNI;
    }
}
