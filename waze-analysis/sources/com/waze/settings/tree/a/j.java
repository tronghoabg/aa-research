package com.waze.settings.tree.a;

import android.graphics.drawable.Drawable;
import com.waze.sdk.as;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class j implements as {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WazeSettingsView f37476a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37477b;

    public /* synthetic */ j(WazeSettingsView wazeSettingsView, int i2) {
        this.f37477b = i2;
        this.f37476a = wazeSettingsView;
    }

    @Override // com.waze.sdk.as
    public final void a(Drawable drawable) {
        int i2 = this.f37477b;
        WazeSettingsView wazeSettingsView = this.f37476a;
        if (i2 != 0) {
            wazeSettingsView.p(drawable);
        } else {
            wazeSettingsView.p(drawable);
        }
    }
}
