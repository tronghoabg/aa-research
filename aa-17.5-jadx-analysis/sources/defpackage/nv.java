package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class nv extends lv {
    private List A;
    float c;
    float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final nr l;
    int m;
    public RecyclerView o;
    VelocityTracker q;
    public GestureDetector s;
    public ns t;
    public Rect v;
    public long w;
    private List z;
    public final List a = new ArrayList();
    private final float[] x = new float[2];
    public mo b = null;
    int k = -1;
    private int y = 0;
    public final List n = new ArrayList();
    public final Runnable p = new lh(this, 5);
    public View r = null;
    public final mc u = new np(this);

    public nv(nr nrVar) {
        this.l = nrVar;
    }

    private final void t(float[] fArr) {
        if ((this.m & 12) != 0) {
            fArr[0] = (this.i + this.g) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.m & 3) != 0) {
            fArr[1] = (this.j + this.h) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private static boolean u(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final int v(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.g > BitmapDescriptorFactory.HUE_RED ? 8 : 4;
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null && this.k >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f);
            float xVelocity = this.q.getXVelocity(this.k);
            float yVelocity = this.q.getYVelocity(this.k);
            int i3 = xVelocity <= BitmapDescriptorFactory.HUE_RED ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.e && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.o.getWidth();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.g) > width * 0.5f) {
            return i2;
        }
        return 0;
    }

    private final int w(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.h > BitmapDescriptorFactory.HUE_RED ? 2 : 1;
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null && this.k >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f);
            float xVelocity = this.q.getXVelocity(this.k);
            float yVelocity = this.q.getYVelocity(this.k);
            int i3 = yVelocity <= BitmapDescriptorFactory.HUE_RED ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.e && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.o.getHeight();
        if ((i & i2) == 0) {
            return 0;
        }
        if (Math.abs(this.h) > height * 0.5f) {
            return i2;
        }
        return 0;
    }

    @Override // defpackage.lv
    public final void a(Rect rect, View view, RecyclerView recyclerView, ml mlVar) {
        rect.setEmpty();
    }

    @Override // defpackage.lv
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.b != null) {
            float[] fArr = this.x;
            t(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
            f2 = 0.0f;
        }
        mo moVar = this.b;
        List list = this.n;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nu nuVar = (nu) list.get(i);
            float f3 = nuVar.d;
            float f4 = nuVar.f;
            if (f3 == f4) {
                nuVar.l = nuVar.h.a.getTranslationX();
            } else {
                nuVar.l = f3 + (nuVar.p * (f4 - f3));
            }
            float f5 = nuVar.e;
            float f6 = nuVar.g;
            if (f5 == f6) {
                nuVar.m = nuVar.h.a.getTranslationY();
            } else {
                nuVar.m = f5 + (nuVar.p * (f6 - f5));
            }
            int iSave = canvas.save();
            mo moVar2 = nuVar.h;
            float f7 = nuVar.l;
            float f8 = nuVar.m;
            int i2 = nuVar.i;
            nr.h(recyclerView, moVar2, f7, f8, false);
            canvas.restoreToCount(iSave);
        }
        if (moVar != null) {
            int iSave2 = canvas.save();
            nr.h(recyclerView, moVar, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    final View c(MotionEvent motionEvent) {
        nu nuVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        mo moVar = this.b;
        if (moVar != null) {
            float f = this.i + this.g;
            float f2 = this.j + this.h;
            View view2 = moVar.a;
            if (u(view2, x, y, f, f2)) {
                return view2;
            }
        }
        List list = this.n;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                nuVar = (nu) list.get(size);
                view = nuVar.h.a;
            } else {
                RecyclerView recyclerView = this.o;
                int iA = recyclerView.h.a();
                while (true) {
                    iA--;
                    if (iA < 0) {
                        return null;
                    }
                    View viewD = recyclerView.h.d(iA);
                    float translationX = viewD.getTranslationX();
                    float translationY = viewD.getTranslationY();
                    if (x >= viewD.getLeft() + translationX && x <= viewD.getRight() + translationX && y >= viewD.getTop() + translationY && y <= viewD.getBottom() + translationY) {
                        return viewD;
                    }
                }
            }
        } while (!u(view, x, y, nuVar.l, nuVar.m));
        return view;
    }

    public final void d(mo moVar, boolean z) {
        nu nuVar;
        List list = this.n;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                nuVar = (nu) list.get(size);
            }
        } while (nuVar.h != moVar);
        nuVar.n |= z;
        if (!nuVar.o) {
            nuVar.a();
        }
        list.remove(size);
    }

    public final void e(mo moVar) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        int iAbs4;
        int i;
        int i2;
        View view;
        int i3;
        if (this.o.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.y == 2) {
            float f = this.i + this.g;
            float f2 = this.j + this.h;
            View view2 = moVar.a;
            int i4 = (int) f2;
            int i5 = (int) f;
            if (Math.abs(i4 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i5 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                List list = this.z;
                if (list == null) {
                    this.z = new ArrayList();
                    this.A = new ArrayList();
                } else {
                    list.clear();
                    this.A.clear();
                }
                int iRound = Math.round(this.i + this.g);
                int iRound2 = Math.round(this.j + this.h);
                int width = view2.getWidth() + iRound;
                int height = view2.getHeight() + iRound2;
                int i6 = (iRound + width) / 2;
                int i7 = (iRound2 + height) / 2;
                lz lzVarG = this.o.g();
                int iAv = lzVarG.av();
                int i8 = 0;
                while (i8 < iAv) {
                    char c2 = c;
                    View viewAD = lzVarG.aD(i8);
                    if (viewAD != view2 && viewAD.getBottom() >= iRound2 && viewAD.getTop() <= height && viewAD.getRight() >= iRound && viewAD.getLeft() <= width) {
                        mo moVarJ = this.o.j(viewAD);
                        i = i5;
                        if (((xac) this.l).c.q.w(moVarJ.b())) {
                            int iAbs5 = Math.abs(i6 - ((viewAD.getLeft() + viewAD.getRight()) / 2));
                            int i9 = iAbs5 * iAbs5;
                            int iAbs6 = Math.abs(i7 - ((viewAD.getTop() + viewAD.getBottom()) / 2));
                            int i10 = iAbs6 * iAbs6;
                            int size = this.z.size();
                            i2 = i4;
                            view = view2;
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                i3 = i9 + i10;
                                if (i11 >= size) {
                                    break;
                                }
                                int i13 = size;
                                if (i3 <= ((Integer) this.A.get(i11)).intValue()) {
                                    break;
                                }
                                i12++;
                                i11++;
                                size = i13;
                            }
                            this.z.add(i12, moVarJ);
                            this.A.add(i12, Integer.valueOf(i3));
                        }
                        i8++;
                        c = c2;
                        i5 = i;
                        i4 = i2;
                        view2 = view;
                    } else {
                        i = i5;
                    }
                    i2 = i4;
                    view = view2;
                    i8++;
                    c = c2;
                    i5 = i;
                    i4 = i2;
                    view2 = view;
                }
                int i14 = i5;
                int i15 = i4;
                View view3 = view2;
                List list2 = this.z;
                if (list2.size() != 0) {
                    int width2 = i14 + view3.getWidth();
                    int height2 = i15 + view3.getHeight();
                    int left = i14 - view3.getLeft();
                    int top = i15 - view3.getTop();
                    int size2 = list2.size();
                    mo moVar2 = null;
                    int i16 = -1;
                    for (int i17 = 0; i17 < size2; i17++) {
                        mo moVar3 = (mo) list2.get(i17);
                        if (left > 0) {
                            View view4 = moVar3.a;
                            int right = view4.getRight() - width2;
                            if (right < 0 && view4.getRight() > view3.getRight() && (iAbs4 = Math.abs(right)) > i16) {
                                moVar2 = moVar3;
                                i16 = iAbs4;
                            }
                        }
                        if (left < 0) {
                            View view5 = moVar3.a;
                            int left2 = view5.getLeft() - i14;
                            if (left2 > 0 && view5.getLeft() < view3.getLeft() && (iAbs3 = Math.abs(left2)) > i16) {
                                moVar2 = moVar3;
                                i16 = iAbs3;
                            }
                        }
                        if (top < 0) {
                            View view6 = moVar3.a;
                            int top2 = view6.getTop() - i15;
                            if (top2 > 0 && view6.getTop() < view3.getTop() && (iAbs2 = Math.abs(top2)) > i16) {
                                moVar2 = moVar3;
                                i16 = iAbs2;
                            }
                        }
                        if (top > 0) {
                            View view7 = moVar3.a;
                            int bottom = view7.getBottom() - height2;
                            if (bottom < 0 && view7.getBottom() > view3.getBottom() && (iAbs = Math.abs(bottom)) > i16) {
                                moVar2 = moVar3;
                                i16 = iAbs;
                            }
                        }
                    }
                    if (moVar2 == null) {
                        this.z.clear();
                        this.A.clear();
                        return;
                    }
                    moVar2.a();
                    moVar.a();
                    nr nrVar = this.l;
                    if (moVar instanceof wzy) {
                        xac xacVar = (xac) nrVar;
                        xai xaiVar = xacVar.c.q;
                        wzy wzyVar = (wzy) moVar;
                        int iB = moVar.b();
                        int iB2 = moVar2.b();
                        boolean z = iB2 >= 0 && iB2 < xaiVar.e.size();
                        List list3 = xaiVar.e;
                        woy.T(z, "New position must be at least 0 and less than %s, found: %s", list3.size(), iB2);
                        if (iB != iB2 && xaiVar.w(iB) && xaiVar.w(iB2)) {
                            list3.remove(iB);
                            list3.add(iB2, wzyVar.w);
                            List list4 = xaiVar.f;
                            list4.add(iB2 - xai.c(), (mqz) list4.remove(iB - xai.c()));
                            xaiVar.i(iB, iB2);
                            if (xacVar.a == -1) {
                                xacVar.a = moVar.c();
                            }
                            xacVar.b = moVar2.c();
                        }
                    }
                }
            }
        }
    }

    public final void f() {
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.q = VelocityTracker.obtain();
    }

    public final void g() {
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    public final void h(View view) {
        if (view == this.r) {
            this.r = null;
        }
    }

    @Override // defpackage.lv
    public final void i(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            t(this.x);
        }
        mo moVar = this.b;
        List list = this.n;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            nu nuVar = (nu) list.get(i);
            int iSave = canvas.save();
            mo moVar2 = nuVar.h;
            float f = nuVar.l;
            float f2 = nuVar.m;
            int i2 = nuVar.i;
            canvas.restoreToCount(iSave);
        }
        if (moVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            nu nuVar2 = (nu) list.get(size);
            if (!nuVar2.o) {
                z = true;
            } else if (!nuVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.mo r19, int r20) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv.j(mo, int):void");
    }

    final void k(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.c;
        this.g = fMax;
        this.h = y - this.d;
        if ((i & 4) == 0) {
            fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fMax);
            this.g = fMax;
        }
        if ((i & 8) == 0) {
            this.g = Math.min(BitmapDescriptorFactory.HUE_RED, fMax);
        }
        if ((i & 1) == 0) {
            this.h = Math.max(BitmapDescriptorFactory.HUE_RED, this.h);
        }
        if ((i & 2) == 0) {
            this.h = Math.min(BitmapDescriptorFactory.HUE_RED, this.h);
        }
    }
}
