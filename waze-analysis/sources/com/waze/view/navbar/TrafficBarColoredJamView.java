package com.waze.view.navbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class TrafficBarColoredJamView extends View {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f45052e = {-12958, -26798, -36497, -2020051};

    /* renamed from: a, reason: collision with root package name */
    Drawable f45053a;

    /* renamed from: b, reason: collision with root package name */
    Bitmap f45054b;

    /* renamed from: c, reason: collision with root package name */
    int[] f45055c;

    /* renamed from: d, reason: collision with root package name */
    float[] f45056d;

    /* renamed from: f, reason: collision with root package name */
    private Paint f45057f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f45058g;

    /* renamed from: h, reason: collision with root package name */
    private Canvas f45059h;

    public TrafficBarColoredJamView(Context context) {
        super(context);
        d();
    }

    private final void c() {
        float height = this.f45059h.getHeight();
        float f2 = 1.0f + height;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f45055c;
            if (i2 >= iArr.length) {
                invalidate();
                return;
            }
            this.f45058g.setColor(iArr[i2]);
            float f3 = (f2 - (this.f45056d[i2] * height)) - 0.5f;
            this.f45059h.drawRect(0.0f, f3, 100.0f, f2 + 0.5f, this.f45058g);
            f2 = f3 + 0.5f;
            i2++;
        }
    }

    private final void d() {
        Paint paint = new Paint();
        this.f45057f = paint;
        paint.setColor(-1);
        this.f45057f.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f45058g = paint2;
        paint2.setColor(-16776961);
        this.f45058g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f45058g.setAntiAlias(true);
        setLayerType(1, null);
        if (isInEditMode()) {
            a(new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4}, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5}, 10);
        }
    }

    public final void a(int[] iArr, int[] iArr2, int i2) {
        int length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = iArr2.length;
            if (i4 >= length) {
                break;
            }
            i5 += iArr2[i4];
            i4++;
        }
        int i6 = (i5 * i2) / (100 - i2);
        float[] fArr = new float[length + 1];
        this.f45056d = fArr;
        float f2 = i5 + i6;
        fArr[0] = i6 / f2;
        int i7 = 0;
        while (i7 < iArr2.length) {
            int i8 = i7 + 1;
            this.f45056d[i8] = iArr2[i7] / f2;
            i7 = i8;
        }
        int[] iArr3 = new int[iArr.length + 1];
        this.f45055c = iArr3;
        iArr3[0] = -4144960;
        while (i3 < iArr.length) {
            int i9 = iArr[i3];
            if (i9 < 0 || i9 >= 4) {
                i9 = 2;
            }
            i3++;
            this.f45055c[i3] = f45052e[i9];
        }
        if (this.f45059h != null) {
            c();
        }
    }

    public final void b() {
        this.f45056d = new float[]{1.0f};
        this.f45055c = new int[]{-14624100};
        if (this.f45059h != null) {
            c();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f45054b;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f45057f);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) throws Resources.NotFoundException {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        this.f45054b = Bitmap.createBitmap(getResources().getDisplayMetrics(), i2, i3, Bitmap.Config.ARGB_8888);
        this.f45059h = new Canvas(this.f45054b);
        Drawable drawable = getResources().getDrawable(R.drawable.traffic_bar_traffic);
        this.f45053a = drawable;
        drawable.setBounds(0, 0, this.f45059h.getWidth(), this.f45059h.getHeight());
        this.f45053a.draw(this.f45059h);
        if (this.f45055c != null) {
            c();
        }
    }

    public TrafficBarColoredJamView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public TrafficBarColoredJamView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d();
    }
}
