package P4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends Drawable implements f, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final b f9108a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9109b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9110c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9111d;

    /* renamed from: f, reason: collision with root package name */
    public int f9113f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9115h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f9116i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f9117j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9112e = true;

    /* renamed from: g, reason: collision with root package name */
    public final int f9114g = -1;

    public c(b bVar) {
        this.f9108a = bVar;
    }

    public final void a() {
        gc.b.i("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f9111d);
        h hVar = (h) this.f9108a.f9107b;
        if (hVar.f9125a.f335l.f313c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f9109b) {
            return;
        }
        this.f9109b = true;
        if (hVar.f9134j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = hVar.f9127c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !hVar.f9130f) {
            hVar.f9130f = true;
            hVar.f9134j = false;
            hVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f9111d) {
            return;
        }
        if (this.f9115h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f9117j == null) {
                this.f9117j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f9117j);
            this.f9115h = false;
        }
        h hVar = (h) this.f9108a.f9107b;
        e eVar = hVar.f9133i;
        Bitmap bitmap = eVar != null ? eVar.f9122g : hVar.f9135l;
        if (this.f9117j == null) {
            this.f9117j = new Rect();
        }
        Rect rect = this.f9117j;
        if (this.f9116i == null) {
            this.f9116i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f9116i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f9108a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((h) this.f9108a.f9107b).f9139p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((h) this.f9108a.f9107b).f9138o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9109b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9115h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        if (this.f9116i == null) {
            this.f9116i = new Paint(2);
        }
        this.f9116i.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f9116i == null) {
            this.f9116i = new Paint(2);
        }
        this.f9116i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        gc.b.i("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f9111d);
        this.f9112e = z2;
        if (!z2) {
            this.f9109b = false;
            h hVar = (h) this.f9108a.f9107b;
            ArrayList arrayList = hVar.f9127c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f9130f = false;
            }
        } else if (this.f9110c) {
            a();
        }
        return super.setVisible(z2, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f9110c = true;
        this.f9113f = 0;
        if (this.f9112e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f9110c = false;
        this.f9109b = false;
        h hVar = (h) this.f9108a.f9107b;
        ArrayList arrayList = hVar.f9127c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f9130f = false;
        }
    }
}
