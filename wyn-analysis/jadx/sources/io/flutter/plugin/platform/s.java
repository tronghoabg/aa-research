package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public final class s extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C2865a f37156a;

    /* renamed from: b, reason: collision with root package name */
    public final View f37157b;

    public s(Context context, C2865a c2865a, View view) {
        super(context);
        this.f37156a = c2865a;
        this.f37157b = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.l lVar = this.f37156a.f37090a;
        if (lVar == null) {
            return false;
        }
        return lVar.a(this.f37157b, view, accessibilityEvent);
    }
}
