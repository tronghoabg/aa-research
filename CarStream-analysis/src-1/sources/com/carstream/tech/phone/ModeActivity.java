package com.carstream.tech.phone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.carstream.tech.box.BoxActivity;
import defpackage.d8;
import defpackage.ec;
import defpackage.k1;
import defpackage.l;
import defpackage.s7;
import defpackage.t6;
import defpackage.t7;
import defpackage.w1;
import defpackage.z6;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class ModeActivity extends Activity {
    private static final long DEM_NGUOC_MS = 6000;
    private static final long NHIP_MS = 250;
    private static Boolean chonBoxPhien;
    private boolean daChon;
    private TextView dongDem;
    private long hetHanAt;
    private boolean nguoiThat;
    private final Handler dongHo = new Handler(Looper.getMainLooper());
    private final t6 aaListener = new l(this, 3);
    private final Runnable nhip = new t7(this, 0);

    private View build() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iK = w1.k(this, 28);
        linearLayout.setPadding(iK, iK, iK, iK);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(Math.min(w1.k(this, 460), getResources().getDisplayMetrics().widthPixels), -2, 17));
        TextView textViewY = w1.y(this, "Chưa kết nối Android Auto", 14, d8.p());
        textViewY.setGravity(17);
        linearLayout.addView(textViewY);
        TextView textViewY2 = w1.y(this, "Màn hình xe nằm ở đâu?", 25, d8.o());
        textViewY2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        textViewY2.setGravity(17);
        linearLayout.addView(textViewY2, mt(6));
        linearLayout.addView(nut("Dùng chế độ Android Auto", "Màn hình xe nằm trên đầu xe — máy này để điều khiển", d8.a(), true, new s7(this, 0)), mt(22));
        linearLayout.addView(nut("Dùng chế độ Box", "Chính máy này là màn hình xe — chạm ngay trên đây", k1.x(), false, new s7(this, 1)), mt(12));
        TextView textViewY3 = w1.y(this, "", 13, d8.p());
        this.dongDem = textViewY3;
        textViewY3.setGravity(17);
        linearLayout.addView(this.dongDem, mt(18));
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(linearLayout);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        scrollView.setBackgroundColor(d8.e());
        scrollView.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return scrollView;
    }

    public static boolean chonBox() {
        return Boolean.TRUE.equals(chonBoxPhien);
    }

    public static boolean daHoiTrongPhien() {
        return chonBoxPhien != null;
    }

    private LinearLayout.LayoutParams mt(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = w1.k(this, i);
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        return layoutParams;
    }

    public static boolean namNgang(Context context) {
        if (ec.l(context)) {
            return true;
        }
        return !z6.a() && daHoiTrongPhien() && chonBox();
    }

    private View nut(String str, String str2, int i, boolean z, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iK = w1.k(this, 18);
        linearLayout.setPadding(iK, iK, iK, iK);
        linearLayout.setBackground(k1.t(i, w1.k(this, 16)));
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(onClickListener);
        k1.B(linearLayout, i, false, w1.k(this, 16));
        int iK2 = z ? d8.k() : d8.o();
        TextView textViewY = w1.y(this, str, 18, iK2);
        textViewY.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        textViewY.setGravity(17);
        linearLayout.addView(textViewY);
        if (!z) {
            iK2 = d8.p();
        }
        TextView textViewY2 = w1.y(this, str2, 13, iK2);
        textViewY2.setGravity(17);
        if (z) {
            textViewY2.setAlpha(0.85f);
        }
        linearLayout.addView(textViewY2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    public static void quenLuaChon() {
        chonBoxPhien = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vaoBox(String str) {
        if (this.daChon) {
            return;
        }
        this.daChon = true;
        chonBoxPhien = Boolean.TRUE;
        startActivity(new Intent(this, (Class<?>) BoxActivity.class));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vaoDienThoai() {
        if (this.daChon) {
            return;
        }
        this.daChon = true;
        chonBoxPhien = Boolean.FALSE;
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra(MainActivity.EXTRA_SKIP_BOX, true);
        startActivity(intent);
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.nguoiThat && !this.daChon && this.dongDem != null) {
            this.nguoiThat = true;
            this.dongHo.removeCallbacks(this.nhip);
            this.dongDem.setText("Chọn một bên để tiếp tục");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k1.s(this);
        if (z6.a()) {
            vaoDienThoai();
            return;
        }
        if (ec.l(this)) {
            try {
                setRequestedOrientation(0);
            } catch (Throwable unused) {
            }
        }
        setContentView(build());
        z6.b(this.aaListener);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.dongHo.removeCallbacksAndMessages(null);
        z6.j.remove(this.aaListener);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.daChon || this.nguoiThat || this.dongDem == null) {
            return;
        }
        this.hetHanAt = SystemClock.uptimeMillis() + DEM_NGUOC_MS;
        this.dongHo.post(this.nhip);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.dongHo.removeCallbacks(this.nhip);
    }
}
