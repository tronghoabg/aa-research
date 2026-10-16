package x9;

import A7.C;
import E4.j;
import J5.h;
import J5.o;
import J5.t;
import J8.C0635j;
import L4.A;
import R1.i;
import Va.AbstractC1152t8;
import Va.InterfaceC1142sb;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.security.MessageDigest;
import m9.S;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x9.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4504d implements C, B4.e, zzu, Continuation, A, Le.a, R4.d, S5.d, InterfaceC1142sb, Z8.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47869a;

    public /* synthetic */ C4504d(int i5) {
        this.f47869a = i5;
    }

    @Override // S5.d
    public t a() {
        return new o(-9223372036854775807L);
    }

    @Override // S5.d
    public long d(h hVar) {
        return -1L;
    }

    @Override // R4.d
    public void f(R4.e eVar) {
        eVar.b();
    }

    @Override // L4.A
    public void j(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // Z8.b
    public Z8.a l(S s10, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        i iVar = jSONObject.has("session") ? new i(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 1, (byte) 0) : new i(new JSONObject().optInt("max_custom_exception_events", 8), 1, (byte) 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new Z8.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (iOptInt * 1000) + System.currentTimeMillis(), iVar, new j(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (!task.isSuccessful() && (task.getException() instanceof C0635j) && ((C0635j) task.getException()).f5807a.equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }

    public String toString() {
        switch (this.f47869a) {
            case 23:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    @Override // Va.InterfaceC1142sb
    public /* synthetic */ Object u(JSONArray jSONArray, int i5) {
        return AbstractC1152t8.a(jSONArray.optString(i5));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        zzvd zzvdVar = (zzvd) obj;
        return new Ca.b(zzvdVar, zzvdVar.zzb(), zzvdVar.zza());
    }

    @Override // A7.C
    public Object zza() {
        switch (this.f47869a) {
            case 1:
                return Boolean.valueOf(zzns.zza());
            case 2:
                return Boolean.valueOf(zznr.zzd());
            case 3:
                return Boolean.valueOf(zzod.zzb());
            case 4:
                return Boolean.valueOf(zznm.zzb());
            case 5:
                return zzng.zzbb();
            case 6:
                return Long.valueOf(zzng.zzx());
            case 7:
                return Long.valueOf(zzng.zzal());
            case 8:
                return Long.valueOf(zzng.zzd());
            case 9:
                return Long.valueOf(zzng.zzaa());
            case 10:
                return zzng.zzat();
            case 11:
                return Boolean.valueOf(zzng.zzbd());
            case 12:
                return Integer.valueOf((int) zzng.zzaf());
            default:
                return Boolean.valueOf(zzpu.zzd());
        }
    }

    @Override // Le.a
    public void run() {
    }

    @Override // S5.d
    public void b(long j8) {
    }

    @Override // R4.d
    public void e(R4.e eVar) {
    }

    @Override // B4.e
    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
