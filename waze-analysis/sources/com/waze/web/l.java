package com.waze.web;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContract;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends ActivityResultContract {

    /* renamed from: a, reason: collision with root package name */
    private Uri f45508a;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, Object obj) {
        Uri uri = (Uri) obj;
        x.f(context, "context");
        x.f(uri, "input");
        this.f45508a = uri;
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        x.e(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final /* bridge */ /* synthetic */ Object parseResult(int i2, Intent intent) {
        Uri uri = i2 == -1 ? this.f45508a : null;
        this.f45508a = null;
        return uri;
    }
}
