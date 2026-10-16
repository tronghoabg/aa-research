package com.waze;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lf extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    private final float f25140a;

    public lf(float f2) {
        this.f25140a = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        h.g.b.x.f(view, "view");
        h.g.b.x.f(outline, "outline");
        float fMin = Math.min(this.f25140a, view.getWidth() / 2.0f);
        Path path = new Path();
        path.reset();
        float f2 = fMin + fMin;
        path.arcTo(0.0f, 0.0f, f2, f2, 180.0f, 90.0f, false);
        path.lineTo(view.getWidth() - fMin, 0.0f);
        path.arcTo(view.getWidth() - f2, 0.0f, view.getWidth(), f2, 270.0f, 90.0f, false);
        path.lineTo(view.getWidth(), view.getHeight());
        path.lineTo(0.0f, view.getHeight());
        path.lineTo(0.0f, fMin);
        path.close();
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }
}
