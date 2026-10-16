package x4;

import A7.C;
import E4.A;
import J8.C0635j;
import J9.C0645d;
import N1.C0765n;
import Va.AbstractC1152t8;
import Va.InterfaceC0950e0;
import Va.InterfaceC1142sb;
import Va.Lb;
import Va.Vb;
import android.graphics.Bitmap;
import android.media.Image;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import com.google.android.gms.internal.measurement.zzna;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.reflect.KClass;
import m9.S;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements C, zzu, Z4.a, F4.a, d0, Continuation, Le.c, P2.j, InterfaceC1142sb, Lb, Z8.b {

    /* renamed from: b, reason: collision with root package name */
    public static d f47692b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47693a;

    public /* synthetic */ d(int i5) {
        this.f47693a = i5;
    }

    public static Z8.a x(S s10) {
        return new Z8.a(System.currentTimeMillis() + 3600000, new R1.i(8, 1, (byte) 0), new E4.j(true, false, false), 10.0d, 1.2d, 60);
    }

    public static synchronized d y() {
        try {
            if (f47692b == null) {
                f47692b = new d(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f47692b;
    }

    public static void z(Image.Plane plane, int i5, int i10, byte[] bArr, int i11, int i12) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i13 = i5 / (i10 / rowStride);
        int rowStride2 = 0;
        for (int i14 = 0; i14 < rowStride; i14++) {
            int pixelStride = rowStride2;
            for (int i15 = 0; i15 < i13; i15++) {
                bArr[i11] = buffer.get(pixelStride);
                i11 += i12;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    public boolean a() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i5 = 0; i5 < 9; i5++) {
            if (new File(strArr[i5]).exists()) {
                return true;
            }
        }
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", AndroidStaticDeviceInfoDataSource.BINARY_SU});
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                processExec.destroy();
                return true;
            }
        } catch (Throwable unused) {
            if (processExec != null) {
            }
        }
        processExec.destroy();
        return false;
    }

    @Override // Le.c
    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 2) {
            return new C0645d((String) objArr[0], (P9.a) objArr[1]);
        }
        throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
    }

    @Override // Z4.a
    public Object c() {
        switch (this.f47693a) {
            case 16:
                return new A();
            default:
                try {
                    return new G4.g(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e7) {
                    throw new RuntimeException(e7);
                }
        }
    }

    @Override // P2.j
    public boolean d(C0765n c0765n) {
        return false;
    }

    @Override // F4.a
    public Bitmap e(int i5, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i5, i10, config);
    }

    public void f(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // P2.j
    public int g(C0765n c0765n) {
        return 1;
    }

    @Override // P2.j
    public P2.l i(C0765n c0765n) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // androidx.lifecycle.d0
    public b0 j(Class cls, H1.c cVar) {
        return p(cls);
    }

    @Override // Z8.b
    public Z8.a l(S s10, JSONObject jSONObject) {
        return x(s10);
    }

    @Override // androidx.lifecycle.d0
    public b0 p(Class cls) {
        return new J1.c();
    }

    @Override // androidx.lifecycle.d0
    public b0 q(KClass kClass, H1.c cVar) {
        return j(Fe.b.y(kClass), cVar);
    }

    @Override // F4.a
    public Bitmap t(int i5, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i5, i10, config);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new C0635j("INTERNAL_ERROR", zzag.zzb(exception != null ? exception.getMessage() : "")));
    }

    @Override // Va.InterfaceC1142sb
    public /* synthetic */ Object u(JSONArray jSONArray, int i5) {
        return AbstractC1152t8.a(jSONArray.optString(i5));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        return new Ca.a((zzvb) obj);
    }

    public d(F5.d dVar) {
        this.f47693a = 23;
    }

    @Override // A7.C
    public Object zza() {
        switch (this.f47693a) {
            case 1:
                return Boolean.valueOf(zzpn.zzi());
            case 2:
                return Integer.valueOf((int) zzng.zzae());
            case 3:
                return Boolean.valueOf(zzod.zza());
            case 4:
                return Boolean.valueOf(zzna.zza());
            case 5:
                return zzng.zzau();
            case 6:
                return Long.valueOf(zzng.zze());
            case 7:
                return Long.valueOf(zzng.zzg());
            case 8:
                return Boolean.valueOf(zznm.zze());
            case 9:
                return Boolean.valueOf(zzoj.zza());
            case 10:
                return Long.valueOf(zzng.zzf());
            case 11:
                return Boolean.valueOf(zzng.zzbe());
            case 12:
                return Boolean.valueOf(zzpz.zzb());
            default:
                return zzng.zzaw();
        }
    }

    @Override // F4.a
    public void o() {
    }

    @Override // F4.a
    public void b(int i5) {
    }

    @Override // Va.Lb
    public void h(JSONObject jSONObject, View view, Object obj) {
    }

    @Override // Va.Lb
    public void k(JSONObject jSONObject, View view, KeyEvent.Callback callback) {
    }

    @Override // Va.Lb
    public void m(JSONObject jSONObject, Object obj, Object obj2) {
    }

    @Override // Va.Lb
    public void r(JSONObject jSONObject, View view, Object obj) {
    }

    @Override // Va.Lb
    public void v(JSONObject jSONObject, View view, Object obj) {
    }

    @Override // Va.Lb
    public void n(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Object obj) {
    }

    @Override // Va.Lb
    public void s(JSONObject jSONObject, Object obj, InterfaceC0950e0 interfaceC0950e0, Object obj2) {
    }

    @Override // Va.Lb
    public void w(JSONObject jSONObject, View view, Vb vb2, Object obj) {
    }
}
