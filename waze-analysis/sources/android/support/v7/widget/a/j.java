package android.support.v7.widget.a;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ej;
import android.support.v7.widget.en;
import android.support.v7.widget.eq;
import android.support.v7.widget.fb;
import android.support.v7.widget.fe;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.waze.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class j extends ej {
    private Rect A;
    private long B;

    /* renamed from: c, reason: collision with root package name */
    float f1016c;

    /* renamed from: d, reason: collision with root package name */
    float f1017d;

    /* renamed from: e, reason: collision with root package name */
    float f1018e;

    /* renamed from: f, reason: collision with root package name */
    float f1019f;

    /* renamed from: h, reason: collision with root package name */
    final f f1021h;

    /* renamed from: i, reason: collision with root package name */
    int f1022i;

    /* renamed from: k, reason: collision with root package name */
    RecyclerView f1024k;
    VelocityTracker m;
    GestureDetector o;
    private float q;
    private float r;
    private float s;
    private float t;
    private int v;
    private List w;
    private List x;
    private g y;

    /* renamed from: a, reason: collision with root package name */
    final List f1014a = new ArrayList();
    private final float[] p = new float[2];

    /* renamed from: b, reason: collision with root package name */
    fe f1015b = null;

    /* renamed from: g, reason: collision with root package name */
    int f1020g = -1;
    private int u = 0;

    /* renamed from: j, reason: collision with root package name */
    final List f1023j = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    final Runnable f1025l = new a(this);
    View n = null;
    private final eq z = new b(this);

    public j(f fVar) {
        this.f1021h = fVar;
    }

    private final void n(float[] fArr) {
        if ((this.f1022i & 12) != 0) {
            fArr[0] = (this.s + this.f1018e) - this.f1015b.itemView.getLeft();
        } else {
            fArr[0] = this.f1015b.itemView.getTranslationX();
        }
        if ((this.f1022i & 3) != 0) {
            fArr[1] = (this.t + this.f1019f) - this.f1015b.itemView.getTop();
        } else {
            fArr[1] = this.f1015b.itemView.getTranslationY();
        }
    }

    private final void o() {
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    private static boolean p(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    private final int q(int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = this.f1018e > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null && this.f1020g >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.r);
            float xVelocity = this.m.getXVelocity(this.f1020g);
            float yVelocity = this.m.getYVelocity(this.f1020g);
            int i4 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i4 & i2) != 0 && i3 == i4 && fAbs >= this.q && fAbs > Math.abs(yVelocity)) {
                return i4;
            }
        }
        float width = this.f1024k.getWidth();
        if ((i2 & i3) == 0) {
            return 0;
        }
        if (Math.abs(this.f1018e) > width * 0.5f) {
            return i3;
        }
        return 0;
    }

    private final int r(int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = this.f1019f > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null && this.f1020g >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.r);
            float xVelocity = this.m.getXVelocity(this.f1020g);
            float yVelocity = this.m.getYVelocity(this.f1020g);
            int i4 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i4 & i2) != 0 && i4 == i3 && fAbs >= this.q && fAbs > Math.abs(xVelocity)) {
                return i4;
            }
        }
        float height = this.f1024k.getHeight();
        if ((i2 & i3) == 0) {
            return 0;
        }
        if (Math.abs(this.f1019f) > height * 0.5f) {
            return i3;
        }
        return 0;
    }

    final View a(MotionEvent motionEvent) {
        i iVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        fe feVar = this.f1015b;
        if (feVar != null) {
            float f2 = this.s + this.f1018e;
            float f3 = this.t + this.f1019f;
            View view2 = feVar.itemView;
            if (p(view2, x, y, f2, f3)) {
                return view2;
            }
        }
        List list = this.f1023j;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return this.f1024k.r(x, y);
            }
            iVar = (i) list.get(size);
            view = iVar.f1009h.itemView;
        } while (!p(view, x, y, iVar.f1013l, iVar.m));
        return view;
    }

    public final void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1024k;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.af(this);
            this.f1024k.ag(this.z);
            this.f1024k.az(this);
            List list = this.f1023j;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                i iVar = (i) list.get(0);
                iVar.a();
                f fVar = this.f1021h;
                fe feVar = iVar.f1009h;
                fVar.d();
            }
            list.clear();
            this.n = null;
            o();
            g gVar = this.y;
            if (gVar != null) {
                gVar.a();
                this.y = null;
            }
            if (this.o != null) {
                this.o = null;
            }
        }
        this.f1024k = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.q = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.r = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.v = ViewConfiguration.get(this.f1024k.getContext()).getScaledTouchSlop();
            this.f1024k.A(this);
            this.f1024k.B(this.z);
            this.f1024k.ay(this);
            this.y = new g(this);
            this.o = new GestureDetector(this.f1024k.getContext(), this.y);
        }
    }

    final void c(int i2, MotionEvent motionEvent, int i3) {
        View viewA;
        if (this.f1015b != null || i2 != 2 || this.u == 2 || this.f1024k.g() == 1) {
            return;
        }
        en enVarL = this.f1024k.l();
        int i4 = this.f1020g;
        fe feVarO = null;
        if (i4 != -1) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i4);
            float x = motionEvent.getX(iFindPointerIndex) - this.f1016c;
            float y = motionEvent.getY(iFindPointerIndex) - this.f1017d;
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(y);
            float f2 = this.v;
            if ((fAbs >= f2 || fAbs2 >= f2) && ((fAbs <= fAbs2 || !enVarL.ae()) && ((fAbs2 <= fAbs || !enVarL.af()) && (viewA = a(motionEvent)) != null))) {
                feVarO = this.f1024k.o(viewA);
            }
        }
        if (feVarO != null) {
            int iH = this.f1021h.h(this.f1024k) >> 8;
            if ((iH & 255) != 0) {
                float x2 = motionEvent.getX(i3);
                float y2 = motionEvent.getY(i3);
                float f3 = x2 - this.f1016c;
                float f4 = y2 - this.f1017d;
                float fAbs3 = Math.abs(f3);
                float fAbs4 = Math.abs(f4);
                float f5 = this.v;
                if (fAbs3 >= f5 || fAbs4 >= f5) {
                    if (fAbs3 > fAbs4) {
                        if (f3 < 0.0f && (iH & 4) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iH & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f4 < 0.0f && (iH & 1) == 0) {
                            return;
                        }
                        if (f4 > 0.0f && (iH & 2) == 0) {
                            return;
                        }
                    }
                    this.f1019f = 0.0f;
                    this.f1018e = 0.0f;
                    this.f1020g = motionEvent.getPointerId(0);
                    h(feVarO, 1);
                }
            }
        }
    }

    final void d(fe feVar, boolean z) {
        i iVar;
        List list = this.f1023j;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                iVar = (i) list.get(size);
            }
        } while (iVar.f1009h != feVar);
        iVar.n |= z;
        if (!iVar.o) {
            iVar.a();
        }
        list.remove(size);
    }

    final void e(fe feVar) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f1024k.isLayoutRequested()) {
            return;
        }
        char c2 = 2;
        if (this.u == 2) {
            float f2 = this.s + this.f1018e;
            int i7 = (int) (this.t + this.f1019f);
            int i8 = (int) f2;
            if (Math.abs(i7 - feVar.itemView.getTop()) >= feVar.itemView.getHeight() * 0.5f || Math.abs(i8 - feVar.itemView.getLeft()) >= feVar.itemView.getWidth() * 0.5f) {
                List list = this.w;
                if (list == null) {
                    this.w = new ArrayList();
                    this.x = new ArrayList();
                } else {
                    list.clear();
                    this.x.clear();
                }
                int iRound = Math.round(this.s + this.f1018e);
                float f3 = this.t + this.f1019f;
                View view = feVar.itemView;
                int iRound2 = Math.round(f3);
                int width = view.getWidth() + iRound;
                int height = feVar.itemView.getHeight() + iRound2;
                int i9 = (iRound + width) / 2;
                int i10 = (iRound2 + height) / 2;
                en enVarL = this.f1024k.l();
                int iAs = enVarL.as();
                int i11 = 0;
                while (i11 < iAs) {
                    View viewAI = enVarL.aI(i11);
                    char c3 = c2;
                    if (viewAI != feVar.itemView && viewAI.getBottom() >= iRound2 && viewAI.getTop() <= height && viewAI.getRight() >= iRound && viewAI.getLeft() <= width) {
                        fe feVarO = this.f1024k.o(viewAI);
                        int iAbs5 = Math.abs(i9 - ((viewAI.getLeft() + viewAI.getRight()) / 2));
                        int i12 = iAbs5 * iAbs5;
                        int iAbs6 = Math.abs(i10 - ((viewAI.getTop() + viewAI.getBottom()) / 2));
                        int i13 = iAbs6 * iAbs6;
                        int size = this.w.size();
                        i2 = i8;
                        i3 = i7;
                        i4 = iRound;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i5 = i12 + i13;
                            i6 = iRound2;
                            if (i14 >= size || i5 <= ((Integer) this.x.get(i14)).intValue()) {
                                break;
                            }
                            i15++;
                            i14++;
                            iRound2 = i6;
                        }
                        this.w.add(i15, feVarO);
                        this.x.add(i15, Integer.valueOf(i5));
                    } else {
                        i2 = i8;
                        i3 = i7;
                        i4 = iRound;
                        i6 = iRound2;
                    }
                    i11++;
                    c2 = c3;
                    i8 = i2;
                    i7 = i3;
                    iRound = i4;
                    iRound2 = i6;
                }
                int i16 = i8;
                int i17 = i7;
                List list2 = this.w;
                if (list2.size() != 0) {
                    int width2 = i16 + feVar.itemView.getWidth();
                    int height2 = i17 + feVar.itemView.getHeight();
                    int left2 = i16 - feVar.itemView.getLeft();
                    int top2 = i17 - feVar.itemView.getTop();
                    int size2 = list2.size();
                    int i18 = -1;
                    fe feVar2 = null;
                    for (int i19 = 0; i19 < size2; i19++) {
                        fe feVar3 = (fe) list2.get(i19);
                        if (left2 > 0 && (right = feVar3.itemView.getRight() - width2) < 0 && feVar3.itemView.getRight() > feVar.itemView.getRight() && (iAbs4 = Math.abs(right)) > i18) {
                            feVar2 = feVar3;
                            i18 = iAbs4;
                        }
                        if (left2 < 0 && (left = feVar3.itemView.getLeft() - i16) > 0 && feVar3.itemView.getLeft() < feVar.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i18) {
                            feVar2 = feVar3;
                            i18 = iAbs3;
                        }
                        if (top2 < 0 && (top = feVar3.itemView.getTop() - i17) > 0 && feVar3.itemView.getTop() < feVar.itemView.getTop() && (iAbs2 = Math.abs(top)) > i18) {
                            feVar2 = feVar3;
                            i18 = iAbs2;
                        }
                        if (top2 > 0 && (bottom = feVar3.itemView.getBottom() - height2) < 0 && feVar3.itemView.getBottom() > feVar.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i18) {
                            feVar2 = feVar3;
                            i18 = iAbs;
                        }
                    }
                    if (feVar2 == null) {
                        this.w.clear();
                        this.x.clear();
                        return;
                    }
                    int absoluteAdapterPosition = feVar2.getAbsoluteAdapterPosition();
                    feVar.getAbsoluteAdapterPosition();
                    this.f1021h.g(feVar, feVar2);
                    RecyclerView recyclerView = this.f1024k;
                    en enVarL2 = recyclerView.l();
                    if (enVarL2 instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) enVarL2).ap(feVar.itemView, feVar2.itemView);
                        return;
                    }
                    if (enVarL2.ae()) {
                        if (en.bp(feVar2.itemView) <= recyclerView.getPaddingLeft()) {
                            recyclerView.ai(absoluteAdapterPosition);
                        }
                        if (en.bs(feVar2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.ai(absoluteAdapterPosition);
                        }
                    }
                    if (enVarL2.af()) {
                        if (en.bt(feVar2.itemView) <= recyclerView.getPaddingTop()) {
                            recyclerView.ai(absoluteAdapterPosition);
                        }
                        if (en.bo(feVar2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.ai(absoluteAdapterPosition);
                        }
                    }
                }
            }
        }
    }

    public final void f(View view) {
        g(view);
        fe feVarO = this.f1024k.o(view);
        if (feVarO == null) {
            return;
        }
        fe feVar = this.f1015b;
        if (feVar != null && feVarO == feVar) {
            h(null, 0);
            return;
        }
        d(feVarO, false);
        if (this.f1014a.remove(feVarO.itemView)) {
            this.f1021h.d();
        }
    }

    final void g(View view) {
        if (view == this.n) {
            this.n = null;
        }
    }

    @Override // android.support.v7.widget.ej
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, fb fbVar) {
        rect.setEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void h(android.support.v7.widget.fe r19, int r20) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.a.j.h(android.support.v7.widget.fe, int):void");
    }

    final void i(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float fMax = x - this.f1016c;
        this.f1018e = fMax;
        this.f1019f = y - this.f1017d;
        if ((i2 & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.f1018e = fMax;
        }
        if ((i2 & 8) == 0) {
            this.f1018e = Math.min(0.0f, fMax);
        }
        if ((i2 & 1) == 0) {
            this.f1019f = Math.max(0.0f, this.f1019f);
        }
        if ((i2 & 2) == 0) {
            this.f1019f = Math.min(0.0f, this.f1019f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
    
        if (r6 != 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean m() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.a.j.m():boolean");
    }

    @Override // android.support.v7.widget.ej
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, fb fbVar) {
        float f2;
        float f3;
        if (this.f1015b != null) {
            float[] fArr = this.p;
            n(fArr);
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        f fVar = this.f1021h;
        fe feVar = this.f1015b;
        List list = this.f1023j;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = (i) list.get(i2);
            iVar.c();
            int iSave = canvas.save();
            fe feVar2 = iVar.f1009h;
            float f5 = iVar.f1013l;
            float f6 = iVar.m;
            int i3 = iVar.f1010i;
            fVar.i(recyclerView, feVar2, f5, f6, false);
            canvas.restoreToCount(iSave);
        }
        if (feVar != null) {
            int iSave2 = canvas.save();
            fVar.i(recyclerView, feVar, f2, f3, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // android.support.v7.widget.ej
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, fb fbVar) {
        if (this.f1015b != null) {
            n(this.p);
        }
        fe feVar = this.f1015b;
        List list = this.f1023j;
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = (i) list.get(i2);
            int iSave = canvas.save();
            fe feVar2 = iVar.f1009h;
            float f2 = iVar.f1013l;
            float f3 = iVar.m;
            int i3 = iVar.f1010i;
            canvas.restoreToCount(iSave);
        }
        if (feVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar2 = (i) list.get(size);
            if (!iVar2.o) {
                z = true;
            } else if (!iVar2.f1012k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }
}
