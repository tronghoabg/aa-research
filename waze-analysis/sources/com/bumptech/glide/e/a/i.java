package com.bumptech.glide.e.a;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.g.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    static Integer f2829a;

    /* renamed from: b, reason: collision with root package name */
    private final View f2830b;

    /* renamed from: c, reason: collision with root package name */
    private final List f2831c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private h f2832d;

    i(View view) {
        this.f2830b = view;
    }

    private final int e(int i2, int i3, int i4) {
        int i5 = i3 - i4;
        if (i5 > 0) {
            return i5;
        }
        int i6 = i2 - i4;
        if (i6 > 0) {
            return i6;
        }
        View view = this.f2830b;
        if (view.isLayoutRequested() || i3 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        Integer numValueOf = f2829a;
        if (numValueOf == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            p.f(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            numValueOf = Integer.valueOf(Math.max(point.x, point.y));
            f2829a = numValueOf;
        }
        return numValueOf.intValue();
    }

    private final int f() {
        View view = this.f2830b;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return e(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    private final int g() {
        View view = this.f2830b;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return e(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    private static final boolean h(int i2) {
        return i2 > 0 || i2 == Integer.MIN_VALUE;
    }

    private static final boolean i(int i2, int i3) {
        return h(i2) && h(i3);
    }

    final void a() {
        List list = this.f2831c;
        if (list.isEmpty()) {
            return;
        }
        int iG = g();
        int iF = f();
        if (i(iG, iF)) {
            ArrayList arrayList = new ArrayList(list);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((f) arrayList.get(i2)).g(iG, iF);
            }
            b();
        }
    }

    final void b() {
        ViewTreeObserver viewTreeObserver = this.f2830b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f2832d);
        }
        this.f2832d = null;
        this.f2831c.clear();
    }

    final void c(f fVar) {
        int iG = g();
        int iF = f();
        if (i(iG, iF)) {
            fVar.g(iG, iF);
            return;
        }
        List list = this.f2831c;
        if (!list.contains(fVar)) {
            list.add(fVar);
        }
        if (this.f2832d == null) {
            ViewTreeObserver viewTreeObserver = this.f2830b.getViewTreeObserver();
            h hVar = new h(this);
            this.f2832d = hVar;
            viewTreeObserver.addOnPreDrawListener(hVar);
        }
    }

    final void d(f fVar) {
        this.f2831c.remove(fVar);
    }
}
