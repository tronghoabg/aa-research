package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes4.dex */
final class as extends i8.w {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f27166a;

    /* renamed from: b, reason: collision with root package name */
    final i8.d f27167b;

    /* renamed from: c, reason: collision with root package name */
    private final i8.y f27168c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27169d;

    /* renamed from: e, reason: collision with root package name */
    private final k f27170e;

    /* renamed from: f, reason: collision with root package name */
    private final Activity f27171f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, i8.d dVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.f27168c = new i8.y("RequestDialogCallbackImpl");
        this.f27169d = context.getPackageName();
        this.f27170e = kVar;
        this.f27166a = taskCompletionSource;
        this.f27171f = activity;
        this.f27167b = dVar;
    }

    @Override // i8.x
    public final void b(Bundle bundle) {
        this.f27167b.d(this.f27166a);
        this.f27168c.b("onRequestDialog(%s)", this.f27169d);
        com.google.android.gms.common.api.j jVarA = this.f27170e.a(bundle);
        if (jVarA != null) {
            this.f27166a.trySetException(jVarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            i8.y yVar = this.f27168c;
            Object[] objArr = {this.f27169d};
            yVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", i8.y.c(yVar.f36914a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f27166a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f27171f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f27167b.a()));
        i8.y yVar2 = this.f27168c;
        Object[] objArr2 = new Object[0];
        yVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", i8.y.c(yVar2.f36914a, "Starting dialog intent...", objArr2));
        }
        this.f27171f.startActivityForResult(intent, 0);
    }
}
