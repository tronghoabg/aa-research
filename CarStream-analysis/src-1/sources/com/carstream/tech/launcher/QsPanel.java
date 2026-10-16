package com.carstream.tech.launcher;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.carstream.tech.launcher.QsPanel;
import com.carstream.tech.launcher.Slider;
import defpackage.d0;
import defpackage.e7;
import defpackage.l7;
import java.io.OutputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class QsPanel extends LinearLayout {
    private Slider dim;
    private TextView dimPct;
    private Runnable doiNen;
    private Runnable dongBang;
    private boolean nenDac;
    private TextView pin;
    private TextView sac;
    private Tile tBt;
    private Tile tDem;
    private Tile tWifi;
    private final Ui ui;
    private final VolumeCtl vol;
    private TextView volPct;
    private Slider volSl;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public class Tile extends LinearLayout {
        private final Glyph g;
        private final TextView lb;

        public Tile(int i, String str, View.OnClickListener onClickListener) {
            super(QsPanel.this.getContext());
            setOrientation(1);
            setGravity(17);
            setPadding(QsPanel.this.ui.s(4.0f), QsPanel.this.ui.s(12.0f), QsPanel.this.ui.s(4.0f), QsPanel.this.ui.s(12.0f));
            setClickable(true);
            setOnClickListener(onClickListener);
            setOnTouchListener(new a());
            Glyph glyph = new Glyph(getContext(), i, QsPanel.this.ui.text);
            this.g = glyph;
            glyph.setClickable(false);
            addView(glyph, new LinearLayout.LayoutParams(QsPanel.this.ui.s(20.0f), QsPanel.this.ui.s(20.0f)));
            TextView textView = new TextView(getContext());
            this.lb = textView;
            textView.setText(str);
            textView.setTextSize(QsPanel.this.ui.sp(12.0f));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setMaxLines(1);
            textView.setGravity(17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = QsPanel.this.ui.s(6.0f);
            addView(textView, layoutParams);
            set(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$0(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                view.animate().scaleX(0.95f).scaleY(0.95f).setDuration(90L).start();
                return false;
            }
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(140L).start();
            return false;
        }

        public void set(boolean z) {
            Ui ui = QsPanel.this.ui;
            setBackground(Ui.round(z ? ui.blue : ui.card2, QsPanel.this.ui.s(16.0f)));
            int i = z ? -1 : QsPanel.this.ui.text;
            this.g.setColor(i);
            this.lb.setTextColor(i);
        }
    }

    public QsPanel(Context context, Ui ui, VolumeCtl volumeCtl) {
        super(context);
        this.ui = ui;
        this.vol = volumeCtl;
        setOrientation(1);
        setBackground(ui.kinh(ui.s(22.0f)));
        setPadding(ui.s(20.0f), ui.s(18.0f), ui.s(20.0f), ui.s(18.0f));
        setElevation(ui.dp(10.0f));
        setClickable(true);
        build();
    }

    private void build() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        final int i = 0;
        this.tWifi = new Tile(8, "WiFi", new View.OnClickListener(this) { // from class: z8
            public final /* synthetic */ QsPanel b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.b.lambda$build$0(view);
                        break;
                    case 1:
                        this.b.lambda$build$1(view);
                        break;
                    default:
                        this.b.lambda$build$2(view);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.tBt = new Tile(9, "Bluetooth", new View.OnClickListener(this) { // from class: z8
            public final /* synthetic */ QsPanel b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.b.lambda$build$0(view);
                        break;
                    case 1:
                        this.b.lambda$build$1(view);
                        break;
                    default:
                        this.b.lambda$build$2(view);
                        break;
                }
            }
        });
        final int i3 = 2;
        this.tDem = new Tile(10, "Ban đêm", new View.OnClickListener(this) { // from class: z8
            public final /* synthetic */ QsPanel b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.lambda$build$0(view);
                        break;
                    case 1:
                        this.b.lambda$build$1(view);
                        break;
                    default:
                        this.b.lambda$build$2(view);
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.rightMargin = this.ui.s(10.0f);
        linearLayout.addView(this.tWifi, layoutParams);
        linearLayout.addView(this.tBt, new LinearLayout.LayoutParams(layoutParams));
        linearLayout.addView(this.tDem, new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        addView(sliderBox("Độ sáng", true));
        addView(sliderBox("Âm lượng", false));
        addView(hangPin());
        sync();
    }

    private void capNhatPin() {
        try {
            Intent intentRegisterReceiver = getContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                return;
            }
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", 100);
            int intExtra3 = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            if (intExtra < 0) {
                return;
            }
            boolean z = intExtra3 == 2 || intExtra3 == 5;
            this.pin.setText("Pin điện thoại " + Math.round((intExtra * 100.0f) / intExtra2) + "%");
            this.sac.setText(z ? "Đang sạc" : "");
        } catch (Throwable unused) {
        }
    }

    private View hangPin() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackground(Ui.round(this.ui.card2, r2.s(14.0f)));
        linearLayout.setPadding(this.ui.s(12.0f), this.ui.s(10.0f), this.ui.s(12.0f), this.ui.s(10.0f));
        Glyph glyph = new Glyph(getContext(), 19, this.ui.green);
        glyph.setClickable(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ui.s(18.0f), this.ui.s(18.0f));
        layoutParams.rightMargin = this.ui.s(10.0f);
        linearLayout.addView(glyph, layoutParams);
        TextView textView = new TextView(getContext());
        this.pin = textView;
        textView.setTextColor(this.ui.text);
        this.pin.setTextSize(this.ui.sp(13.0f));
        this.pin.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout.addView(this.pin, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(getContext());
        this.sac = textView2;
        textView2.setTextColor(this.ui.sub);
        this.sac.setTextSize(this.ui.sp(12.0f));
        linearLayout.addView(this.sac);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = this.ui.s(16.0f);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$build$0(View view) {
        toggleWifi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$build$1(View view) {
        toggleBt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$build$2(View view) {
        toggleDem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sliderBox$3(float f) {
        int iRound = Math.round(f * 100.0f);
        this.dimPct.setText(iRound + "%");
        setDoSang(iRound);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sliderBox$4(float f) {
        this.vol.set(Math.round(r0.max() * f));
        this.volPct.setText(Math.round(f * 100.0f) + "%");
    }

    private void moTrangCaiDat(String str) {
        try {
            l7 l7VarMirror = Cau.mirror();
            if (l7VarMirror != null && l7VarMirror.d()) {
                OutputStream outputStream = l7VarMirror.d;
                if (outputStream != null && str != null) {
                    new Thread(new d0(l7VarMirror, str, outputStream, 1), "mirror-settings").start();
                }
                Runnable runnable = this.dongBang;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        } catch (Throwable unused) {
        }
        try {
            getContext().startActivity(new Intent(str).addFlags(268435456));
        } catch (Throwable unused2) {
        }
    }

    private void setDoSang(int i) {
        try {
            l7 l7VarMirror = Cau.mirror();
            if (l7VarMirror != null) {
                l7.n = Math.max(25, Math.min(100, i));
                OutputStream outputStream = l7VarMirror.d;
                if (outputStream == null) {
                    return;
                }
                new Thread(new e7(l7VarMirror, l7.n, outputStream), "mirror-dim").start();
            }
        } catch (Throwable unused) {
        }
    }

    private View sliderBox(String str, boolean z) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, this.ui.s(16.0f), 0, 0);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(this.ui.sub);
        textView.setTextSize(this.ui.sp(12.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(this.ui.sub);
        textView2.setTextSize(this.ui.sp(12.0f));
        textView2.setTypeface(typeface);
        linearLayout2.addView(textView2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = this.ui.s(8.0f);
        linearLayout.addView(linearLayout2, layoutParams);
        Slider slider = new Slider(getContext());
        Ui ui = this.ui;
        slider.setDensity(ui.d * ui.k);
        slider.setRanhMau(this.ui.card2);
        linearLayout.addView(slider, new LinearLayout.LayoutParams(-1, this.ui.s(30.0f)));
        if (!z) {
            this.volSl = slider;
            this.volPct = textView2;
            final int i = 1;
            slider.setOnChange(new Slider.OnChange(this) { // from class: a9
                public final /* synthetic */ QsPanel b;

                {
                    this.b = this;
                }

                @Override // com.carstream.tech.launcher.Slider.OnChange
                public final void onChange(float f) {
                    switch (i) {
                        case 0:
                            this.b.lambda$sliderBox$3(f);
                            break;
                        default:
                            this.b.lambda$sliderBox$4(f);
                            break;
                    }
                }
            });
            return linearLayout;
        }
        this.dim = slider;
        this.dimPct = textView2;
        slider.setMin(0.2f);
        final int i2 = 0;
        slider.setOnChange(new Slider.OnChange(this) { // from class: a9
            public final /* synthetic */ QsPanel b;

            {
                this.b = this;
            }

            @Override // com.carstream.tech.launcher.Slider.OnChange
            public final void onChange(float f) {
                switch (i2) {
                    case 0:
                        this.b.lambda$sliderBox$3(f);
                        break;
                    default:
                        this.b.lambda$sliderBox$4(f);
                        break;
                }
            }
        });
        return linearLayout;
    }

    private void toggleBt() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                moTrangCaiDat("android.settings.BLUETOOTH_SETTINGS");
                return;
            }
            if (defaultAdapter.isEnabled()) {
                defaultAdapter.disable();
            } else {
                defaultAdapter.enable();
            }
            sync();
        } catch (Throwable unused) {
        }
    }

    private void toggleDem() {
        GradientDrawable gradientDrawableKinh;
        Ui.datChedoDem(getContext(), this.ui.night ? 2 : 1);
        this.ui.refresh(getContext());
        if (this.nenDac) {
            gradientDrawableKinh = Ui.roundStroke(this.ui.card, r0.s(22.0f), Math.max(1, this.ui.dp(1.0f)), this.ui.vien);
        } else {
            gradientDrawableKinh = this.ui.kinh(r0.s(22.0f));
        }
        setBackground(gradientDrawableKinh);
        removeAllViews();
        build();
        Runnable runnable = this.doiNen;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void toggleWifi() {
        if (Build.VERSION.SDK_INT >= 29) {
            moTrangCaiDat("android.settings.panel.action.WIFI");
            return;
        }
        try {
            ((WifiManager) getContext().getApplicationContext().getSystemService("wifi")).setWifiEnabled(!r0.isWifiEnabled());
            sync();
        } catch (Throwable unused) {
        }
    }

    public void datNenDac() {
        this.nenDac = true;
        setBackground(Ui.roundStroke(this.ui.card, r1.s(22.0f), Math.max(1, this.ui.dp(1.0f)), this.ui.vien));
    }

    public void setOnDoiNen(Runnable runnable) {
        this.doiNen = runnable;
    }

    public void setOnDongBang(Runnable runnable) {
        this.dongBang = runnable;
    }

    public void sync() {
        this.tWifi.set(TrangThai.wifi(getContext()));
        this.tBt.set(TrangThai.bluetooth(getContext()));
        this.tDem.set(this.ui.night);
        Slider slider = this.volSl;
        if (slider != null) {
            slider.setRatio(this.vol.ratio());
            this.volPct.setText(Math.round(this.vol.ratio() * 100.0f) + "%");
        }
        if (this.dim != null) {
            int iDoSangHienTai = Cau.doSangHienTai(getContext());
            this.dim.setRatio(iDoSangHienTai / 100.0f);
            this.dimPct.setText(iDoSangHienTai + "%");
        }
        capNhatPin();
    }
}
