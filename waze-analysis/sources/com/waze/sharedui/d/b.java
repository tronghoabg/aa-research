package com.waze.sharedui.d;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.d.b.an;
import com.waze.R;
import com.waze.beacons.p;
import com.waze.sharedui.d.a.d;
import com.waze.sharedui.views.ProgressAnimation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class b extends d {

    /* renamed from: a, reason: collision with root package name */
    protected Context f38855a;

    /* renamed from: b, reason: collision with root package name */
    private int f38856b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressAnimation f38857c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f38858d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f38859e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38860f;

    public b(Context context, String str, int i2, boolean z) {
        super(context, R.style.ProgressBarDialog);
        this.f38856b = 0;
        this.f38860f = false;
        setContentView(R.layout.progress_bar_dlg);
        this.f38858d = (TextView) findViewById(R.id.progress_bar_dlg_text);
        this.f38857c = (ProgressAnimation) findViewById(R.id.progress_bar_dlg_animation);
        this.f38859e = (ImageView) findViewById(R.id.progress_bar_icon);
        this.f38856b = i2;
        if (an.f(str)) {
            this.f38859e.setVisibility(8);
            this.f38857c.setVisibility(0);
            this.f38858d.setVisibility(8);
        } else {
            this.f38858d.setText(str);
        }
        this.f38855a = context;
        f(z);
    }

    public static /* synthetic */ void b(b bVar) {
        if (bVar.f38860f) {
            bVar.f38860f = false;
            if (bVar.f38856b == 0) {
                bVar.f38857c.b();
            }
            if (bVar.a()) {
                super.dismiss();
            }
        }
    }

    private final void h() {
        p pVar = new p(this, 11);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            pVar.run();
            return;
        }
        Context context = this.f38855a;
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        ((Activity) context).runOnUiThread(pVar);
    }

    protected boolean a() {
        Context context = this.f38855a;
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        h();
    }

    @Override // com.waze.sharedui.d.a.d, android.support.v7.app.ap, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        h();
    }

    public final void e() {
        super.dismiss();
    }

    public final void f(boolean z) {
        Window window = getWindow();
        if (window != null) {
            if (z) {
                window.addFlags(32);
                window.clearFlags(2);
                window.setDimAmount(0.0f);
            } else {
                window.clearFlags(32);
                window.addFlags(2);
                window.setDimAmount(0.5f);
            }
        }
    }

    public final void g() {
        show();
        this.f38859e.postDelayed(new p(this, 12), 1000L);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        int i2 = this.f38856b;
        ImageView imageView = this.f38859e;
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.f38857c.setVisibility(8);
            this.f38859e.setImageResource(this.f38856b);
        } else {
            imageView.setVisibility(8);
            this.f38857c.setVisibility(0);
            this.f38857c.a();
        }
        this.f38860f = true;
    }

    public b(Context context, String str, int i2) {
        this(context, str, i2, true);
    }

    public b(Context context, String str) {
        this(context, str, 0);
    }
}
