package c8;

import A7.C;
import J5.w;
import Va.InterfaceC1129rb;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaCodec;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.internal.measurement.zznf;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import com.google.android.gms.internal.safetynet.zzaf;
import com.google.android.gms.internal.safetynet.zzh;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONObject;
import r7.AbstractC3935e;
import u6.AbstractC4256a;

/* renamed from: c8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1581e implements C, InterfaceC1708w, E0.n, zzu, G0.d, J5.m, L4.l, SuccessContinuation, V5.j, InterfaceC1129rb, Z4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19712a;

    public /* synthetic */ C1581e(int i5) {
        this.f19712a = i5;
    }

    public static MediaCodec c(V5.i iVar) throws IOException {
        iVar.f13055a.getClass();
        String str = iVar.f13055a.f13061a;
        AbstractC4256a.b("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        AbstractC4256a.q();
        return mediaCodecCreateByCodecName;
    }

    public static boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public void accept(Object obj, Object obj2) throws RemoteException {
        ((zzh) ((zzaf) obj).getService()).zzf(new C7.m((TaskCompletionSource) obj2));
    }

    @Override // G0.d
    public List b() {
        Locale locale = Locale.getDefault();
        AbstractC3340k.d(locale, "getDefault()");
        return AbstractC3935e.C(new G0.a(locale));
    }

    @Override // E0.n
    public Typeface i(E0.m name, E0.l fontWeight, int i5) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(fontWeight, "fontWeight");
        name.getClass();
        int i10 = fontWeight.f2802a / 100;
        if (i10 >= 0 && i10 < 2) {
            throw null;
        }
        if (2 <= i10 && i10 < 4) {
            throw null;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                throw null;
            }
            if ((6 > i10 || i10 >= 8) && 8 <= i10 && i10 < 11) {
                throw null;
            }
        }
        throw null;
    }

    @Override // V5.j
    public V5.k j(V5.i iVar) {
        MediaCodec mediaCodecC = null;
        try {
            mediaCodecC = c(iVar);
            AbstractC4256a.b("configureCodec");
            mediaCodecC.configure(iVar.f13056b, iVar.f13058d, iVar.f13059e, 0);
            AbstractC4256a.q();
            AbstractC4256a.b("startCodec");
            mediaCodecC.start();
            AbstractC4256a.q();
            return new Dd.c(mediaCodecC);
        } catch (IOException | RuntimeException e7) {
            if (mediaCodecC != null) {
                mediaCodecC.release();
            }
            throw e7;
        }
    }

    @Override // J5.m
    public w m(int i5, int i10) {
        return new J5.j();
    }

    @Override // Va.InterfaceC1129rb
    public /* synthetic */ Object n(String str, JSONObject jSONObject) {
        return jSONObject.optString(str, null);
    }

    @Override // E0.n
    public Typeface o(E0.l fontWeight, int i5) {
        AbstractC3340k.e(fontWeight, "fontWeight");
        if (i5 == 0 && AbstractC3340k.a(fontWeight, E0.l.f2798d)) {
            Typeface DEFAULT = Typeface.DEFAULT;
            AbstractC3340k.d(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(tg.b.z(fontWeight, i5));
        AbstractC3340k.d(typefaceDefaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
        return typefaceDefaultFromStyle;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        zzr zzrVar = (zzr) obj;
        zzv zzvVar = Ea.d.f3636a;
        List listX = Ba.c.X(zzrVar.zzb);
        return new Ca.a(zzy.zzb(zzrVar.zzd) ? "" : zzrVar.zzd, Ba.c.W(listX), listX, zzy.zzb(zzrVar.zzf) ? "und" : zzrVar.zzf, zzrVar.zze, zzrVar.zzb.zze, zzbk.zzh());
    }

    public /* synthetic */ C1581e(C7.g gVar) {
        this.f19712a = 15;
    }

    @Override // A7.C
    public Object zza() {
        switch (this.f19712a) {
            case 2:
                return Boolean.valueOf(zzpn.zzb());
            case 3:
                return Boolean.valueOf(zznx.zza());
            case 4:
                return Boolean.valueOf(zznf.zza());
            case 5:
                return Integer.valueOf((int) zzng.zzak());
            case 6:
                return Long.valueOf(zzng.zzu());
            case 7:
                return Long.valueOf(zzng.zzap());
            case 8:
                return Long.valueOf(zzph.zzd());
            case 9:
                return Integer.valueOf((int) zzng.zzn());
            case 10:
                return zzng.zzay();
            case 11:
                return Long.valueOf(zzng.zzy());
            case 12:
                return Boolean.valueOf(zzpc.zza());
            case 13:
                return Boolean.valueOf(zzpo.zzb());
            default:
                return Boolean.valueOf(zzpb.zzb());
        }
    }

    @Override // L4.l
    public void h() {
    }

    @Override // J5.m
    public void l() {
    }

    @Override // Z4.c
    public void a(Object obj) {
    }

    @Override // J5.m
    public void x(J5.t tVar) {
    }

    @Override // L4.l
    public void d(F4.a aVar, Bitmap bitmap) {
    }
}
