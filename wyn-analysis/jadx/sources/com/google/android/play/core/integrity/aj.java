package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import i8.C;
import java.util.ArrayList;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final i8.d f27148a;

    /* renamed from: b, reason: collision with root package name */
    private final i8.y f27149b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27150c;

    /* renamed from: d, reason: collision with root package name */
    private final at f27151d;

    /* renamed from: e, reason: collision with root package name */
    private final k f27152e;

    public aj(Context context, i8.y yVar, at atVar, k kVar) {
        this.f27150c = context.getPackageName();
        this.f27149b = yVar;
        this.f27151d = atVar;
        this.f27152e = kVar;
        i8.y yVar2 = i8.f.f36905a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (i8.f.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    this.f27148a = new i8.d(context, yVar, "IntegrityService", ak.f27153a, new C() { // from class: com.google.android.play.core.integrity.ae
                        @Override // i8.C
                        public final Object a(IBinder iBinder) {
                            int i5 = i8.s.f36913g;
                            if (iBinder == null) {
                                return null;
                            }
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                            return iInterfaceQueryLocalInterface instanceof i8.t ? (i8.t) iInterfaceQueryLocalInterface : new i8.r(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                        }
                    });
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        yVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", i8.y.c(yVar.f36914a, "Phonesky is not installed.", objArr));
        }
        this.f27148a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f27150c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i8.l(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC3935e.d(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f27148a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i5 = bundle.getInt("dialog.intent.type");
        this.f27149b.b("requestAndShowDialog(%s, %s)", this.f27150c, Integer.valueOf(i5));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f27148a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i5), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f27148a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f27149b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f27148a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e7) {
            return Tasks.forException(new IntegrityServiceException(-13, e7));
        }
    }
}
