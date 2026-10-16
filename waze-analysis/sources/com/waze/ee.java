package com.waze;

import android.database.Cursor;
import android.net.Uri;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.LifecycleCoroutineScope;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ee extends gd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ el f23636a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ee(el elVar, LifecycleCoroutineScope lifecycleCoroutineScope, lm lmVar, com.waze.favorites.k kVar, com.waze.google_assistant.ah ahVar, com.waze.navigate.eo eoVar, com.waze.google_assistant.aa aaVar, com.waze.modules.navigation.bp bpVar) {
        super(lifecycleCoroutineScope, lmVar, kVar, ahVar, eoVar, aaVar, bpVar);
        this.f23636a = elVar;
    }

    @Override // com.waze.cr
    public final Uri a() {
        return ActivityCompat.getReferrer(this.f23636a);
    }

    @Override // com.waze.cr
    public final String b() {
        String packageName = this.f23636a.getPackageName();
        h.g.b.x.e(packageName, "getPackageName(...)");
        return packageName;
    }

    @Override // com.waze.cr
    public final Cursor h(Uri uri, String[] strArr, String str) {
        return this.f23636a.managedQuery(uri, strArr, str, null, "data10 asc");
    }
}
