package com.waze.closure.d;

import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import com.waze.reports.dj;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements dj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f22494a;

    d(ManagedActivityResultLauncher managedActivityResultLauncher) {
        this.f22494a = managedActivityResultLauncher;
    }

    @Override // com.waze.reports.dj
    public final void a(Intent intent) {
        x.f(intent, "speechRecognitionIntent");
    }

    @Override // com.waze.reports.dj
    public final void b(Intent intent) {
        x.f(intent, "takePictureIntent");
        this.f22494a.launch(intent);
    }
}
