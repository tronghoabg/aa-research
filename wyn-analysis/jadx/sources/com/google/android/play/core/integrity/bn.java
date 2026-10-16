package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import i8.C;
import java.util.ArrayList;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    final i8.d f27211a;

    /* renamed from: b, reason: collision with root package name */
    private final i8.y f27212b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27213c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f27214d;

    /* renamed from: e, reason: collision with root package name */
    private final at f27215e;

    /* renamed from: f, reason: collision with root package name */
    private final k f27216f;

    public bn(Context context, i8.y yVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f27214d = taskCompletionSource;
        this.f27213c = context.getPackageName();
        this.f27212b = yVar;
        this.f27215e = atVar;
        this.f27216f = kVar;
        i8.d dVar = new i8.d(context, yVar, "ExpressIntegrityService", bo.f27217a, new C() { // from class: com.google.android.play.core.integrity.bd
            @Override // i8.C
            public final Object a(IBinder iBinder) {
                int i5 = i8.n.f36912g;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof i8.o ? (i8.o) iInterfaceQueryLocalInterface : new i8.m(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f27211a = dVar;
        dVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j8, long j10, int i5) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f27213c);
        bundle.putLong("cloud.prj", j8);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i8.l(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC3935e.d(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j8, int i5) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f27213c);
        bundle.putLong("cloud.prj", j8);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i8.l(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC3935e.d(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f27214d.getTask().isSuccessful() && ((Integer) bnVar.f27214d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i5 = bundle.getInt("dialog.intent.type");
        this.f27212b.b("requestAndShowDialog(%s)", Integer.valueOf(i5));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f27211a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i5), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j8, long j10, int i5) {
        this.f27212b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f27211a.c(new bg(this, taskCompletionSource, 0, str, j8, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j8, int i5) {
        this.f27212b.b("warmUpIntegrityToken(%s)", Long.valueOf(j8));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f27211a.c(new bf(this, taskCompletionSource, 0, j8, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
