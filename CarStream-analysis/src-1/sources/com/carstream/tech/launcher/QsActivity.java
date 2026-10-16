package com.carstream.tech.launcher;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import com.carstream.tech.launcher.QsActivity;
import defpackage.g0;
import defpackage.h7;
import defpackage.l7;
import java.io.OutputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class QsActivity extends Activity {
    private boolean daBao;
    private QsPanel panel;
    private Ui ui;

    /* JADX INFO: Access modifiers changed from: private */
    public void baoO() {
        try {
            l7 l7VarMirror = Cau.mirror();
            if (l7VarMirror != null && this.panel.getWidth() > 0) {
                int[] iArr = new int[2];
                this.panel.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int width = this.panel.getWidth();
                int height = this.panel.getHeight();
                int iS = this.ui.s(22.0f);
                OutputStream outputStream = l7VarMirror.d;
                if (outputStream != null) {
                    new Thread(new h7(l7VarMirror, i, i2, iS, width, height, outputStream), "mirror-qs-rect").start();
                }
                this.daBao = true;
                this.panel.getWidth();
                this.panel.getHeight();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dong() {
        thoiGhep();
        finish();
        overridePendingTransition(0, 0);
    }

    private void lamMoNen() {
        try {
            if (Build.VERSION.SDK_INT >= 31 && getWindowManager().isCrossWindowBlurEnabled()) {
                getWindow().setBackgroundBlurRadius(this.ui.dp(24.0f));
                return;
            }
        } catch (Throwable unused) {
        }
        this.panel.datNenDac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        dong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1() {
        this.ui.refresh(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        baoO();
    }

    private void thoiGhep() {
        try {
            l7 l7VarMirror = Cau.mirror();
            if (l7VarMirror == null || !this.daBao) {
                return;
            }
            OutputStream outputStream = l7VarMirror.d;
            if (outputStream != null) {
                new Thread(new h7(l7VarMirror, -1, 0, 0, 0, 0, outputStream), "mirror-qs-rect").start();
            }
            this.daBao = false;
        } catch (Throwable unused) {
        }
    }

    private boolean tuKetLieuNeuLacSangDienThoai() {
        try {
            Display display = Build.VERSION.SDK_INT >= 30 ? getDisplay() : getWindowManager().getDefaultDisplay();
            if ((display != null ? display.getDisplayId() : 0) != 0) {
                return false;
            }
            finishAndRemoveTask();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        dong();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tuKetLieuNeuLacSangDienThoai();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (tuKetLieuNeuLacSangDienThoai()) {
            return;
        }
        overridePendingTransition(0, 0);
        this.ui = new Ui(this);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setOnClickListener(new g0(this, 2));
        QsPanel qsPanel = new QsPanel(this, this.ui, new VolumeCtl(this));
        this.panel = qsPanel;
        final int i = 0;
        qsPanel.setOnDoiNen(new Runnable(this) { // from class: x8
            public final /* synthetic */ QsActivity b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.lambda$onCreate$1();
                        break;
                    case 1:
                        this.b.dong();
                        break;
                    default:
                        this.b.baoO();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.panel.setOnDongBang(new Runnable(this) { // from class: x8
            public final /* synthetic */ QsActivity b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.lambda$onCreate$1();
                        break;
                    case 1:
                        this.b.dong();
                        break;
                    default:
                        this.b.baoO();
                        break;
                }
            }
        });
        int iS = this.ui.s(340.0f);
        Ui ui = this.ui;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.min(iS, ui.paneW - ui.s(40.0f)), -2, 8388661);
        layoutParams.topMargin = this.ui.s(78.0f);
        layoutParams.rightMargin = this.ui.s(56.0f);
        frameLayout.addView(this.panel, layoutParams);
        setContentView(frameLayout);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        lamMoNen();
        final int i3 = 2;
        this.panel.post(new Runnable(this) { // from class: x8
            public final /* synthetic */ QsActivity b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.lambda$onCreate$1();
                        break;
                    case 1:
                        this.b.dong();
                        break;
                    default:
                        this.b.baoO();
                        break;
                }
            }
        });
        this.panel.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: y8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                this.a.lambda$onCreate$2(view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        thoiGhep();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        QsPanel qsPanel = this.panel;
        if (qsPanel != null) {
            qsPanel.sync();
        }
        baoO();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        thoiGhep();
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
