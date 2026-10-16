package com.google.android.material.snackbar;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f6753a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6754b;

    i(o oVar, int i2, byte[] bArr) {
        this.f6754b = i2;
        Objects.requireNonNull(oVar);
        this.f6753a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        int i2 = this.f6754b;
        if (i2 == 0) {
            this.f6753a.z();
            return;
        }
        o oVar = this.f6753a;
        if (i2 != 1) {
            n nVar = oVar.f6777b;
            if (nVar == null) {
                return;
            }
            if (nVar.getParent() != null) {
                nVar.setVisibility(0);
            }
            if (nVar.b() == 1) {
                o.l(oVar);
                return;
            } else {
                o.m(oVar);
                return;
            }
        }
        n nVar2 = oVar.f6777b;
        if (nVar2 == null || oVar.q == null) {
            return;
        }
        WindowManager windowManager = (WindowManager) oVar.q.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = windowManager.getCurrentWindowMetrics().getBounds();
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
        }
        int iHeight = rect.height();
        int[] iArr = new int[2];
        nVar2.getLocationInWindow(iArr);
        int height = (iHeight - (iArr[1] + nVar2.getHeight())) + ((int) nVar2.getTranslationY());
        if (height >= oVar.w) {
            oVar.x = oVar.w;
            return;
        }
        ViewGroup.LayoutParams layoutParams = nVar2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(o.f6776i, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
            return;
        }
        oVar.x = oVar.w;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += oVar.w - height;
        nVar2.requestLayout();
    }

    i(o oVar, int i2) {
        this.f6754b = i2;
        Objects.requireNonNull(oVar);
        this.f6753a = oVar;
    }

    i(o oVar, int i2, char[] cArr) {
        this.f6754b = i2;
        Objects.requireNonNull(oVar);
        this.f6753a = oVar;
    }
}
