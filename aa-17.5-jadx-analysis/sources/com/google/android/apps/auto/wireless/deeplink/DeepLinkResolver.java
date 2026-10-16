package com.google.android.apps.auto.wireless.deeplink;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.abnj;
import defpackage.abnv;
import defpackage.abon;
import defpackage.acpx;
import defpackage.dup;
import defpackage.jlp;
import defpackage.jmq;
import defpackage.ler;
import defpackage.onh;
import defpackage.oyy;
import defpackage.ozg;
import defpackage.ozh;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxi;
import j$.time.Duration;

/* loaded from: classes2.dex */
public class DeepLinkResolver extends ler {
    public static final yph n = yph.c("GH.QR");
    public static final Duration o = Duration.ofSeconds(30);
    public static final Duration p = Duration.ofSeconds(2);
    public final Handler q = new Handler(Looper.getMainLooper());
    public Runnable r;
    public Runnable s;
    private BroadcastReceiver t;

    private final void E(int i, int i2) {
        A();
        ((TextView) findViewById(R.id.bs_title)).setText(i);
        ((ImageView) findViewById(R.id.bs_illustration)).setImageDrawable(getDrawable(R.drawable.car_bottom_sheet_apps_illustration));
        TextView textView = (TextView) findViewById(R.id.bs_body);
        textView.setVisibility(0);
        textView.setText(i2);
        ((Button) findViewById(R.id.bs_accept_button)).setVisibility(8);
        Button button = (Button) findViewById(R.id.bs_decline_button);
        button.setText(getString(R.string.deep_link_button_exit));
        button.setOnClickListener(new onh(this, 5));
    }

    public final void B(yxi yxiVar) {
        sendBroadcast(new Intent().setAction("com.google.android.apps.auto.components.connectivity.ACTION_LOG_WIRELESS_EVENT").putExtra("event_type", yxiVar.pC).setPackage("com.google.android.projection.gearhead").putExtra("time_since_boot_millis", SystemClock.elapsedRealtime()));
    }

    public final void C() {
        B(yxi.QR_CODE_CONNECTION_DECLINED);
        finish();
    }

    public final void D() {
        Runnable runnable = this.r;
        if (runnable != null) {
            this.q.removeCallbacks(runnable);
        }
        this.r = new oyy(this, 4);
        runOnUiThread(new oyy(this, 5));
    }

    @Override // defpackage.ler, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        ozh ozhVar;
        boolean z;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT <= 29) {
            B(yxi.QR_CODE_NOT_SUPPORTED);
            E(R.string.deep_link_wifi_error_title, R.string.deep_link_aaw_not_supported);
            return;
        }
        if (!acpx.c()) {
            ((ype) ((ype) n.f()).ai((char) 6218)).u("Experiment DEEP_LINK_ENABLED is disabled. Showing error.");
            B(yxi.QR_CODE_NOT_SUPPORTED);
            E(R.string.deep_link_wifi_error_title, R.string.deep_link_aaw_not_supported);
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            ozhVar = null;
        } else {
            try {
                String queryParameter = data.getQueryParameter("data");
                if (!TextUtils.isEmpty(queryParameter)) {
                    ozhVar = (ozh) abnv.B(ozh.a, Base64.decode(queryParameter, 8), abnj.a());
                    if (ozhVar.c.isEmpty()) {
                        ((ype) ((ype) n.f()).ai((char) 6215)).u("Failed to parse QR Code data! SSID should not be empty!");
                        z = false;
                    } else {
                        z = true;
                    }
                    if (ozhVar.e.isEmpty()) {
                        ((ype) ((ype) n.f()).ai((char) 6214)).u("Failed to parse QR Code data! Passkey should not be empty!");
                        z = false;
                    }
                    if (!BluetoothAdapter.checkBluetoothAddress(ozhVar.h)) {
                        ((ype) ((ype) n.f()).ai((char) 6213)).u("Failed to parse QR Code data! Failed to find Bluetooth device!");
                        z = false;
                    }
                    if (!jlp.d(ozhVar.d)) {
                        ((ype) ((ype) n.f()).ai((char) 6212)).u("Failed to parse QR Code data! BSSID is invalid!");
                        z = false;
                    }
                    if (!jlp.e(ozhVar.f)) {
                        ((ype) ((ype) n.f()).ai((char) 6211)).u("Failed to parse QR Code data! WPP on TCP Ip is invalid!");
                    } else if (!z) {
                    }
                }
            } catch (abon e) {
                ((ype) ((ype) ((ype) n.g()).p(e)).ai((char) 6219)).u("Failed to parse QR Code data!");
            }
            ozhVar = null;
        }
        if (ozhVar == null) {
            B(yxi.QR_CODE_DATA_INVALID);
            E(R.string.deep_link_error_title, R.string.deep_link_qr_invalid);
            return;
        }
        A();
        ((TextView) findViewById(R.id.bs_title)).setText(R.string.deep_link_welcome_title);
        ((ImageView) findViewById(R.id.bs_illustration)).setImageDrawable(getDrawable(R.drawable.car_bottom_sheet_apps_illustration));
        findViewById(R.id.bs_body).setVisibility(0);
        Button button = (Button) findViewById(R.id.bs_accept_button);
        button.setVisibility(0);
        button.setText(getString(R.string.deep_link_button_continue));
        button.setOnClickListener(new jmq(this, ozhVar, 16));
        Button button2 = (Button) findViewById(R.id.bs_decline_button);
        button2.setText(getString(R.string.deep_link_button_exit));
        button2.setOnClickListener(new onh(this, 3));
        findViewById(R.id.bottom_sheet_fragment_background).setOnClickListener(new onh(this, 4));
        ozg ozgVar = new ozg(this);
        this.t = ozgVar;
        dup.e(this, ozgVar, new IntentFilter("com.google.android.gms.car.PROJECTION_STARTED"), null, 4);
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.r;
        if (runnable != null) {
            this.q.removeCallbacks(runnable);
        }
        BroadcastReceiver broadcastReceiver = this.t;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        Runnable runnable2 = this.s;
        if (runnable2 != null) {
            this.q.removeCallbacks(runnable2);
        }
    }
}
