package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.common.api.t;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p implements LoaderManager.LoaderCallbacks {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f4631a;

    /* synthetic */ p(SignInHubActivity signInHubActivity) {
        Objects.requireNonNull(signInHubActivity);
        this.f4631a = signInHubActivity;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final Loader<Void> onCreateLoader(int i2, Bundle bundle) {
        return new b(this.f4631a, t.b());
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        SignInHubActivity signInHubActivity = this.f4631a;
        signInHubActivity.setResult(signInHubActivity.f4613j, signInHubActivity.f4614k);
        signInHubActivity.finish();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(Loader<Void> loader) {
    }
}
