package za;

import A7.C;
import Ca.e;
import I4.f;
import I4.p;
import I4.q;
import I4.v;
import K6.b;
import Le.c;
import R4.i;
import Va.AbstractC1152t8;
import Va.C0932c8;
import Va.InterfaceC1129rb;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import org.json.JSONObject;

/* renamed from: za.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4658a implements C, C5.a, zzu, q, b, c, i, T8.c, InterfaceC1129rb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48470a;

    public /* synthetic */ C4658a(int i5) {
        this.f48470a = i5;
    }

    @Override // T8.c
    public String b() {
        return null;
    }

    @Override // C5.a
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // I4.q
    public p d(v vVar) {
        return new J4.b(vVar.b(f.class, InputStream.class));
    }

    public void f(KClass kClass, List typeArgumentsSerializers) {
        AbstractC3340k.e(kClass, "kClass");
        AbstractC3340k.e(typeArgumentsSerializers, "typeArgumentsSerializers");
    }

    @Override // Va.InterfaceC1129rb
    public Object n(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        C0932c8 c0932c8 = new C0932c8();
        c0932c8.f14064a = jSONObjectOptJSONObject.optBoolean(C0932c8.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, MotionEvent.axisFromString("") + 211, 1 - KeyEvent.normalizeMetaState(0), "\u0007\ufffe\ufffb\uffff\f\u0002￮\b\u0003\ufffb").intern());
        c0932c8.f14065b = jSONObjectOptJSONObject.optBoolean(C0932c8.a(8 - Process.getGidForName(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u000e\u0000\ufffb\b\u0003\ufffb\uffe7\f\uffff").intern());
        c0932c8.f14066c = AbstractC1152t8.a(jSONObjectOptJSONObject.optString(C0932c8.a(KeyEvent.keyCodeFromString("") + 6, Process.getGidForName("") + Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, (ViewConfiguration.getScrollBarSize() >> 8) + 6, "\ufffa\u0005\ufffe\n\ufffb\u0003").intern()));
        return c0932c8;
    }

    public String toString() {
        switch (this.f48470a) {
            case 23:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        return ((e) obj).p();
    }

    public C4658a() {
        this.f48470a = 22;
        C3407I c3407i = AbstractC3409K.f40056b;
        e0 e0Var = e0.f40101e;
    }

    @Override // A7.C
    public Object zza() {
        switch (this.f48470a) {
            case 1:
                return Boolean.valueOf(zzpn.zze());
            case 2:
                return Boolean.valueOf(zznx.zzb());
            case 3:
                return Integer.valueOf((int) zzng.zzai());
            case 4:
                return Integer.valueOf((int) zzng.zzah());
            case 5:
                return Long.valueOf(zzng.zzab());
            case 6:
                return Long.valueOf(zzng.zzac());
            case 7:
                return Integer.valueOf((int) zzng.zzh());
            case 8:
                return Integer.valueOf((int) zzng.zzl());
            case 9:
                return Integer.valueOf((int) zzng.zzq());
            case 10:
                return zzng.zzaz();
            case 11:
                return Boolean.valueOf(zzpi.zza());
            case 12:
                return Boolean.valueOf(zzny.zzc());
            default:
                return Boolean.valueOf(zzpu.zzf());
        }
    }

    public C4658a(P7.c cVar, P7.c cVar2) {
        this.f48470a = 24;
        cVar.getClass();
        cVar2.getClass();
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException();
        }
    }

    @Override // T8.c
    public void a() {
    }

    @Override // Le.c
    public Object apply(Object obj) {
        return obj;
    }

    @Override // T8.c
    public void e(long j8, String str) {
    }
}
