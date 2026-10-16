package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC1700n;

/* loaded from: classes3.dex */
public final class C implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f26582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26583c;

    public /* synthetic */ C(Intent intent, Object obj, int i5) {
        this.f26581a = i5;
        this.f26582b = intent;
        this.f26583c = obj;
    }

    public final void a() {
        switch (this.f26581a) {
            case 0:
                Intent intent = this.f26582b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f26583c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f26582b;
                if (intent2 != null) {
                    ((InterfaceC1700n) this.f26583c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e7) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e7);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
