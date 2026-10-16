package com.waze.ui.k;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.waze.share.ViewShareDriveActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class n implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f42448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42449b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42450c;

    public /* synthetic */ n(MutableState mutableState, FocusManager focusManager, int i2) {
        this.f42450c = i2;
        this.f42448a = mutableState;
        this.f42449b = focusManager;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.focus.FocusManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (this.f42450c != 0) {
            return ViewShareDriveActivity.v((ViewShareDriveActivity) this.f42449b, (View) this.f42448a, windowInsetsCompat);
        }
        if (!windowInsetsCompat.isVisible(8) && ((Boolean) this.f42448a.getValue()).booleanValue()) {
            FocusManager.CC.clearFocus$default(this.f42449b, false, 1, null);
        }
        return windowInsetsCompat;
    }

    public /* synthetic */ n(ViewShareDriveActivity viewShareDriveActivity, View view, int i2) {
        this.f42450c = i2;
        this.f42449b = viewShareDriveActivity;
        this.f42448a = view;
    }
}
