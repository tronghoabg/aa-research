package com.waze.main_screen.g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.waze.R;
import com.waze.ui.z.as;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q extends FrameLayout {

    /* renamed from: j, reason: collision with root package name */
    private static final int f26425j = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    protected long f26426a;

    /* renamed from: b, reason: collision with root package name */
    protected final View f26427b;

    /* renamed from: c, reason: collision with root package name */
    protected final View f26428c;

    /* renamed from: d, reason: collision with root package name */
    protected final View f26429d;

    /* renamed from: e, reason: collision with root package name */
    protected final View f26430e;

    /* renamed from: f, reason: collision with root package name */
    protected int f26431f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f26432g;

    /* renamed from: h, reason: collision with root package name */
    boolean f26433h;

    /* renamed from: i, reason: collision with root package name */
    protected final Runnable f26434i;

    /* renamed from: k, reason: collision with root package name */
    private com.waze.map.f.e f26435k;

    /* renamed from: l, reason: collision with root package name */
    private final LayoutInflater f26436l;
    private final Interpolator m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private p r;
    private final Runnable s;
    private final Runnable t;

    public q(Context context) {
        super(context);
        this.f26435k = null;
        this.m = new AccelerateDecelerateInterpolator();
        this.f26426a = 0L;
        this.r = new n(this);
        this.f26434i = new g(this, 1);
        this.s = new g(this, 2, (byte[]) null);
        this.t = new g(this, 3, (char[]) null);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f26436l = layoutInflater;
        layoutInflater.inflate(R.layout.zoom_controls, this);
        this.f26427b = findViewById(R.id.zoomControlInWrapper);
        this.f26428c = findViewById(R.id.zoomControlOutWrapper);
        this.f26429d = findViewById(R.id.zoomControlIn);
        this.f26430e = findViewById(R.id.zoomControlOut);
        addOnLayoutChangeListener(new o(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m(int i2) {
        return as.h(getResources(), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(com.waze.map.f.e eVar) {
        com.waze.map.f.e eVar2 = this.f26435k;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null || eVar == com.waze.map.f.e.f28903a) {
            this.f26435k = eVar;
            com.waze.map.f.f fVar = (com.waze.map.f.f) r.i(com.waze.map.f.f.class);
            if (fVar != null) {
                fVar.h(eVar);
            }
        }
    }

    public final void i(p pVar) {
        this.r = pVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f26431f = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.g.q.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
