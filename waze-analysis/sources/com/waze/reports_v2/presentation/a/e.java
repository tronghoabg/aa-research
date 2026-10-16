package com.waze.reports_v2.presentation.a;

import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import com.waze.reports.dj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements dj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f34718a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f34719b;

    e(ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2) {
        this.f34718a = managedActivityResultLauncher;
        this.f34719b = managedActivityResultLauncher2;
    }

    @Override // com.waze.reports.dj
    public final void a(Intent intent) {
        h.g.b.x.f(intent, "speechRecognitionIntent");
        this.f34719b.launch(intent);
    }

    @Override // com.waze.reports.dj
    public final void b(Intent intent) {
        h.g.b.x.f(intent, "takePictureIntent");
        this.f34718a.launch(intent);
    }
}
