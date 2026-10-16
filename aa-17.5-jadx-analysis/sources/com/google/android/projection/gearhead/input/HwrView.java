package com.google.android.projection.gearhead.input;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.HandwritingRecognizerFactory;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.gui.GestureRecognizer;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizer;
import com.google.android.libraries.handwriting.networkrecognizer.HandwritingHttpClient;
import com.google.android.projection.gearhead.R;
import defpackage.abww;
import defpackage.abwz;
import defpackage.lgp;
import defpackage.org;
import defpackage.wxj;
import defpackage.xcs;
import defpackage.xcz;
import defpackage.ykd;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes3.dex */
public class HwrView extends View {
    private static final yph n = yph.c("GH.HwrView");
    private static final SparseBooleanArray o = new SparseBooleanArray();
    public final StrokeList a;
    public HandwritingRecognizer b;
    public GestureRecognizer c;
    public final Handler d;
    public int e;
    public int f;
    public lgp g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final Runnable k;
    public final Runnable l;
    public ykd m;
    private Stroke p;
    private int q;
    private Long r;
    private Paint s;
    private final Path t;
    private float u;
    private int v;
    private int w;
    private int x;
    private float y;
    private xcz z;

    static {
        try {
            System.loadLibrary("hwrword");
        } catch (UnsatisfiedLinkError e) {
            ((ype) ((ype) ((ype) n.g()).p(e)).ai((char) 10132)).u("Unable to load handwriting library");
        }
        SparseBooleanArray sparseBooleanArray = o;
        sparseBooleanArray.put(0, true);
        sparseBooleanArray.put(5, true);
        sparseBooleanArray.put(2, true);
        sparseBooleanArray.put(6, true);
        sparseBooleanArray.put(1, true);
        sparseBooleanArray.put(8, true);
    }

    public HwrView(Context context) {
        super(context);
        this.a = new StrokeList();
        this.t = new Path();
        this.d = new Handler();
        this.k = new wxj(this, 9, null);
        this.l = new wxj(this, 10, null);
        d(context);
    }

    private final void d(Context context) {
        this.h = false;
        this.i = false;
        Paint paint = new Paint(1);
        this.s = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.s.setStrokeWidth(7.0f);
        this.s.setStrokeCap(Paint.Cap.ROUND);
        this.x = org.a(context, R.attr.gearheadDialerHandwritingDialpadBackground);
        this.z = new xcz(org.a(context, R.attr.gearheadDialerHandwritingDialpadStroke), this.x);
        this.g = lgp.a();
        b();
        GestureRecognizer gestureRecognizer = new GestureRecognizer();
        this.c = gestureRecognizer;
        gestureRecognizer.setBackspaceGestureEnabled(true);
        this.c.setSpaceGestureEnabled(true);
    }

    public final void a() {
        this.a.clear();
        this.p = null;
        this.q = 0;
    }

    public final void b() {
        HandwritingRecognizer handwritingRecognizerCreate;
        lgp lgpVar = this.g;
        String strC = lgpVar.c();
        yph yphVar = lgp.a;
        ((ype) ((ype) yphVar.f()).ai((char) 3909)).y("Initializing new handwriting language: %s", strC);
        abww abwwVarB = lgpVar.b(strC);
        if (abwwVarB == null || !abwwVarB.d.equals("com.google.android.apps.handwriting.ime.ImeRecognizer")) {
            ((ype) ((ype) yphVar.g()).ai(3910)).y("Language spec is unknown: %s", abwwVarB.d);
            handwritingRecognizerCreate = null;
        } else {
            abwz abwzVar = abwwVarB.l;
            if (abwzVar == null) {
                abwzVar = abwz.a;
            }
            abww abwwVar = abwzVar.c;
            if (abwwVar == null) {
                abwwVar = abww.a;
            }
            handwritingRecognizerCreate = HandwritingRecognizerFactory.create(abwwVar, lgpVar.c);
            if (handwritingRecognizerCreate == null) {
                ((ype) ((ype) yphVar.g()).ai((char) 3911)).y("Failed to initialize handwriting recognition for %s", strC);
            }
        }
        this.b = handwritingRecognizerCreate;
        if (handwritingRecognizerCreate != null) {
            CloudRecognizer.CloudRecognizerSettings cloudRecognizerSettings = new CloudRecognizer.CloudRecognizerSettings();
            cloudRecognizerSettings.clientName = "Gearhead";
            cloudRecognizerSettings.clientVersion = 1;
            cloudRecognizerSettings.deviceVersion = Build.VERSION.SDK_INT;
            cloudRecognizerSettings.deviceName = Build.DEVICE;
            this.b.setSecondaryRecognizer(new CloudRecognizer(HandwritingHttpClient.getNewHttpClient(), cloudRecognizerSettings));
        }
    }

    public final void c() {
        Handler handler = this.d;
        Runnable runnable = this.l;
        handler.removeCallbacks(runnable);
        handler.removeCallbacks(this.k);
        boolean z = false;
        if (!this.a.isEmpty() && !this.h) {
            z = true;
        }
        this.h = true;
        handler.postDelayed(runnable, 2000L);
        if (z) {
            a();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = 0;
        if (!this.j && (this.a.isEmpty() || this.h)) {
            setBackgroundColor(0);
            return;
        }
        float f = 0.05f;
        float f2 = 1.0f;
        this.y = 1.0f - (this.q * 0.05f);
        setBackgroundColor(this.x);
        this.t.reset();
        StrokeList strokeList = this.a;
        int size = strokeList.size();
        int i2 = 0;
        while (i2 < size) {
            Stroke stroke = strokeList.get(i2);
            int i3 = i;
            while (i3 < stroke.size() - 1) {
                Stroke.Point point = stroke.get(i3);
                i3++;
                Stroke.Point point2 = stroke.get(i3);
                float f3 = point.x;
                float f4 = this.u;
                float f5 = f3 * f4;
                float f6 = this.v;
                float f7 = point.y * f4;
                float f8 = this.w;
                float f9 = point2.x * f4;
                float f10 = point2.y * f4;
                Paint paint = this.s;
                xcz xczVar = this.z;
                float f11 = f;
                float f12 = f2;
                float fMax = Math.max(this.y, 0.6f);
                float f13 = f12 - fMax;
                StrokeList strokeList2 = strokeList;
                paint.setColor(Color.rgb((int) ((xczVar.a * fMax) + (f13 * xczVar.b)), (int) ((xczVar.c * fMax) + (f13 * xczVar.d)), (int) ((fMax * xczVar.e) + (xczVar.f * f13))));
                this.y += f11;
                float f14 = f5 + f6;
                float f15 = f7 + f8;
                float f16 = f9 + f6;
                float f17 = f10 + f8;
                if (f14 == f16 && f15 == f17) {
                    canvas.drawPoint(f14, f15, this.s);
                } else {
                    canvas.drawLine(f14, f15, f16, f17, this.s);
                }
                f = f11;
                f2 = f12;
                strokeList = strokeList2;
            }
            i2++;
            i = 0;
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!o.get(action)) {
            return false;
        }
        this.d.removeCallbacks(this.k, this.r);
        if (action == 8) {
            c();
            return false;
        }
        if (action == 0) {
            this.p = new Stroke();
            StrokeList strokeList = this.a;
            synchronized (strokeList) {
                strokeList.add(this.p);
            }
            action = 0;
        }
        if (this.p == null) {
            return true;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.p.addPoint(new Stroke.Point(x, y));
        this.q++;
        if (action == 1) {
            StrokeList strokeList2 = new StrokeList();
            strokeList2.add(this.p);
            if (this.a.size() == 1 && this.c.recognizeLastStrokeGesture(strokeList2).equals(GestureRecognizer.Gesture.GEST_BACKSPACE)) {
                xcs xcsVar = (xcs) this.m.a;
                xcsVar.e(-5, 0);
                xcsVar.f(-5, false);
                a();
            } else {
                Long lValueOf = Long.valueOf(jUptimeMillis);
                this.r = lValueOf;
                this.d.postAtTime(this.k, lValueOf, jUptimeMillis + 750);
            }
            this.p = null;
            this.q--;
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e <= 0 || this.f <= 0) {
            return;
        }
        float fAbs = Math.abs(i3 - i);
        float fAbs2 = Math.abs(i4 - i2);
        float fMin = Math.min(fAbs / this.e, fAbs2 / this.f);
        this.u = fMin;
        this.v = Math.abs((int) ((fAbs - (this.e * fMin)) / 2.0f));
        this.w = Math.abs((int) ((fAbs2 - (this.f * this.u)) / 2.0f));
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            a();
        }
    }

    public HwrView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new StrokeList();
        this.t = new Path();
        this.d = new Handler();
        this.k = new wxj(this, 9, null);
        this.l = new wxj(this, 10, null);
        d(context);
    }

    public HwrView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new StrokeList();
        this.t = new Path();
        this.d = new Handler();
        this.k = new wxj(this, 9, null);
        this.l = new wxj(this, 10, null);
        d(context);
    }
}
