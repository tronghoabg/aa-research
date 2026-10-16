package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.carstream.tech.phone.MainActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class g3 extends FrameLayout {
    public static final /* synthetic */ int p = 0;
    public final MainActivity a;
    public final ArrayList b;
    public int c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final Rect g;
    public final int[] h;
    public int i;
    public final LinearLayout j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final e3 o;

    public g3(MainActivity mainActivity, ArrayList arrayList) {
        super(mainActivity);
        this.c = -1;
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        this.f = new RectF();
        this.g = new Rect();
        this.h = new int[2];
        this.i = -1;
        this.o = new e3(this);
        this.a = mainActivity;
        this.b = arrayList;
        setWillNotDraw(false);
        paint.setColor(-872415232);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(w1.k(mainActivity, 2));
        paint2.setColor(d8.a());
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        this.j = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setBackground(k1.t(d8.n(), w1.k(mainActivity, 18)));
        int iK = w1.k(mainActivity, 18);
        linearLayout.setPadding(iK, iK, iK, iK);
        linearLayout.setElevation(w1.k(mainActivity, 8));
        TextView textViewY = w1.y(mainActivity, "", 12, d8.p());
        this.m = textViewY;
        linearLayout.addView(textViewY);
        TextView textViewY2 = w1.y(mainActivity, "", 19, d8.o());
        this.k = textViewY2;
        Typeface typeface = Typeface.SANS_SERIF;
        textViewY2.setTypeface(Typeface.create(typeface, 1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = w1.k(mainActivity, 6);
        linearLayout.addView(textViewY2, layoutParams);
        TextView textViewY3 = w1.y(mainActivity, "", 15, d8.p());
        this.l = textViewY3;
        textViewY3.setLineSpacing(w1.k(mainActivity, 4), 1.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = w1.k(mainActivity, 6);
        linearLayout.addView(textViewY3, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textViewY4 = w1.y(mainActivity, "Bỏ qua", 14, d8.p());
        textViewY4.setPadding(0, w1.k(mainActivity, 10), w1.k(mainActivity, 12), w1.k(mainActivity, 4));
        textViewY4.setOnClickListener(new c3(this, 0));
        linearLayout2.addView(textViewY4);
        linearLayout2.addView(new View(mainActivity), new LinearLayout.LayoutParams(0, 1, 1.0f));
        TextView textViewY5 = w1.y(mainActivity, "Tiếp", 15, d8.a());
        this.n = textViewY5;
        textViewY5.setTypeface(Typeface.create(typeface, 1));
        textViewY5.setPadding(w1.k(mainActivity, 12), w1.k(mainActivity, 10), w1.k(mainActivity, 4), w1.k(mainActivity, 4));
        textViewY5.setOnClickListener(new c3(this, 1));
        linearLayout2.addView(textViewY5);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = w1.k(mainActivity, 4);
        linearLayout.addView(linearLayout2, layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 8388659;
        int iK2 = w1.k(mainActivity, 16);
        layoutParams4.leftMargin = iK2;
        layoutParams4.rightMargin = iK2;
        layoutParams4.topMargin = iK2;
        addView(linearLayout, layoutParams4);
        linearLayout.addOnLayoutChangeListener(new y1(this, 2));
    }

    public static void a(g3 g3Var) {
        int i = g3Var.c + 1;
        g3Var.c = i;
        ArrayList arrayList = g3Var.b;
        if (i < arrayList.size()) {
            Runnable runnable = ((f3) arrayList.get(g3Var.c)).d;
            if (runnable != null) {
                runnable.run();
            }
            g3Var.c(0);
            return;
        }
        xc.m(g3Var.a, "daXemHuongDan", true);
        ViewGroup viewGroup = (ViewGroup) g3Var.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(g3Var);
        }
    }

    public static boolean e(View view) {
        if (view instanceof g3) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (e(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(int i) {
        WindowInsets rootWindowInsets;
        this.i = i;
        LinearLayout linearLayout = this.j;
        int height = linearLayout.getHeight();
        if (height <= 0) {
            return;
        }
        MainActivity mainActivity = this.a;
        int iK = w1.k(mainActivity, 16);
        int height2 = getHeight() - iK;
        try {
            rootWindowInsets = getRootWindowInsets();
        } catch (Throwable unused) {
        }
        int systemWindowInsetBottom = rootWindowInsets != null ? rootWindowInsets.getSystemWindowInsetBottom() : 0;
        int i2 = height2 - systemWindowInsetBottom;
        int i3 = i2 - iK;
        if (height > i3) {
            TextView textView = this.l;
            if (textView.getHeight() > 0) {
                textView.setMaxHeight(Math.max(w1.k(mainActivity, 100), textView.getHeight() - (height - i3)));
                textView.setMovementMethod(new ScrollingMovementMethod());
                return;
            }
        }
        linearLayout.setTranslationY(Math.max(iK, Math.min(i < 0 ? (getHeight() - height) / 2 : (w1.k(mainActivity, 14) + i) + height <= i2 ? i + w1.k(mainActivity, 14) : (((int) this.f.top) - w1.k(mainActivity, 14)) - height, i2 - height)) - linearLayout.getTop());
    }

    public final void c(int i) {
        int i2 = this.c;
        ArrayList arrayList = this.b;
        f3 f3Var = (f3) arrayList.get(i2);
        String str = f3Var.a;
        View viewB = str == null ? null : h3.b(str);
        if (f3Var.a != null && ((viewB == null || viewB.getWidth() <= 0 || viewB.getHeight() <= 0) && i < 6)) {
            postDelayed(new d3(i, this, 0), 120L);
            return;
        }
        f3 f3Var2 = (f3) arrayList.get(this.c);
        this.m.setText("Bước " + (this.c + 1) + " / " + arrayList.size());
        this.k.setText(f3Var2.b);
        TextView textView = this.l;
        textView.setMaxHeight(Alert.DURATION_SHOW_INDEFINITELY);
        textView.setText(f3Var2.c);
        this.n.setText(this.c == arrayList.size() - 1 ? "Xong" : "Tiếp");
        String str2 = f3Var2.a;
        View viewB2 = str2 != null ? h3.b(str2) : null;
        if (viewB2 == null) {
            this.f.setEmpty();
            b(-1);
            invalidate();
            return;
        }
        int iK = w1.k(this.a, 40);
        int i3 = -iK;
        int width = viewB2.getWidth();
        int height = viewB2.getHeight() + iK;
        Rect rect = this.g;
        rect.set(0, i3, width, height);
        viewB2.requestRectangleOnScreen(rect, true);
        d();
    }

    public final void d() {
        int i = this.c;
        if (i >= 0) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            String str = ((f3) arrayList.get(this.c)).a;
            View viewB = str == null ? null : h3.b(str);
            if (viewB == null || viewB.getWidth() <= 0) {
                return;
            }
            int[] iArr = this.h;
            viewB.getLocationInWindow(iArr);
            int iK = w1.k(this.a, 6);
            int i2 = iArr[0];
            float f = i2 - iK;
            float f2 = iArr[1] - iK;
            float width = viewB.getWidth() + i2 + iK;
            float height = viewB.getHeight() + iArr[1] + iK;
            RectF rectF = this.f;
            if (Math.abs(f - rectF.left) >= 1.0f || Math.abs(f2 - rectF.top) >= 1.0f || Math.abs(width - rectF.right) >= 1.0f || Math.abs(height - rectF.bottom) >= 1.0f) {
                rectF.set(f, f2, width, height);
                b((int) rectF.bottom);
                invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.o);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        RectF rectF = this.f;
        boolean zIsEmpty = rectF.isEmpty();
        Paint paint = this.d;
        if (zIsEmpty) {
            canvas.drawRect(0.0f, 0.0f, width, height, paint);
            return;
        }
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rectF.top, paint);
        canvas.drawRect(0.0f, rectF.bottom, f, height, paint);
        canvas.drawRect(0.0f, rectF.top, rectF.left, rectF.bottom, paint);
        canvas.drawRect(rectF.right, rectF.top, f, rectF.bottom, paint);
        float fK = w1.k(this.a, 12);
        canvas.drawRoundRect(rectF, fK, fK, this.e);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f;
        if (!rectF.isEmpty() && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        LinearLayout linearLayout = this.j;
        return x < ((float) linearLayout.getLeft()) || x > ((float) linearLayout.getRight()) || y < linearLayout.getY() || y > linearLayout.getY() + ((float) linearLayout.getHeight());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return true;
        }
        RectF rectF = this.f;
        return rectF.isEmpty() || !rectF.contains(motionEvent.getX(), motionEvent.getY());
    }
}
