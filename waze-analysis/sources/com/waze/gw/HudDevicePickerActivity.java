package com.waze.gw;

import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelUuid;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class HudDevicePickerActivity extends Activity {
    private static int COLOR_ACCENT = AmbientTheme.WAZE_BLUE;
    private static final int COLOR_BG = -16052974;
    private static final int COLOR_BLUE = -11155457;
    private static final int COLOR_BORDER = -14012613;
    private static final int COLOR_CONTROL = -14999767;
    private static final int COLOR_MUTED = -6642766;
    private static final int COLOR_OK = -10102878;
    private static final int COLOR_PANEL = -15526370;
    private static final int COLOR_TEXT = -789258;
    public static final String EXTRA_HUD_PROFILE = "hud_profile";
    static final String PROFILE_HLP1 = "hlp1";
    static final String PROFILE_VIETMAP = "vietmap";
    private TextView adapterStatus;
    private TextView bleEmpty;
    private LinearLayout bleList;
    private TextView bondedEmpty;
    private LinearLayout bondedList;
    private boolean enableAfterSelect;
    private TextView scanAction;
    private TextView scanStatus;
    private BluetoothLeScanner scanner;
    private boolean scanning;
    private boolean softwareFilteredScan;
    private boolean vietMapMode;
    private final Handler handler = new Handler();
    private final Map<String, BluetoothDevice> bleDevices = new LinkedHashMap();
    private final Map<String, List<String>> bleAdvertisedServices = new LinkedHashMap();
    private final Runnable stopScanRunnable = new Runnable() { // from class: com.waze.gw.HudDevicePickerActivity.1
        @Override // java.lang.Runnable
        public void run() {
            HudDevicePickerActivity.this.stopBleScan();
        }
    };
    private final Runnable scanFallbackRunnable = new Runnable() { // from class: com.waze.gw.HudDevicePickerActivity.2
        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (!HudDevicePickerActivity.this.scanning || HudDevicePickerActivity.this.scanner == null || !HudDevicePickerActivity.this.bleDevices.isEmpty()) {
                return;
            }
            try {
                HudDevicePickerActivity.this.scanner.stopScan(HudDevicePickerActivity.this.callback);
                HudDevicePickerActivity.this.softwareFilteredScan = true;
                HudDevicePickerActivity.this.scanner.startScan((List<ScanFilter>) null, new ScanSettings.Builder().setScanMode(2).build(), HudDevicePickerActivity.this.callback);
                HudDevicePickerActivity hudDevicePickerActivity = HudDevicePickerActivity.this;
                if (HudDevicePickerActivity.this.vietMapMode) {
                    str = "Đang quét tổng quát và lọc HUD VietMap H50/H1…";
                } else {
                    str = "Đang quét tổng quát và lọc HUD HLP…";
                }
                hudDevicePickerActivity.setScanStatus(str, true);
            } catch (Throwable th) {
            }
        }
    };
    private final ScanCallback callback = new ScanCallback() { // from class: com.waze.gw.HudDevicePickerActivity.8
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i2, ScanResult scanResult) {
            if (HudDevicePickerActivity.this.vietMapMode) {
                if (!HudDevicePickerActivity.this.isVietMapResult(scanResult)) {
                    return;
                }
            } else if (HudDevicePickerActivity.this.softwareFilteredScan && !HudDevicePickerActivity.this.isHlpResult(scanResult)) {
                return;
            }
            final BluetoothDevice device = scanResult == null ? null : scanResult.getDevice();
            if (device == null) {
                return;
            }
            final String strSafeAddress = HudDeviceRepository.safeAddress(device);
            if (strSafeAddress.length() == 0 || HudDevicePickerActivity.this.bleDevices.containsKey(strSafeAddress)) {
                return;
            }
            final List listServiceUuidStrings = HudDevicePickerActivity.this.serviceUuidStrings(scanResult);
            HudDevicePickerActivity.this.bleDevices.put(strSafeAddress, device);
            HudDevicePickerActivity.this.bleAdvertisedServices.put(strSafeAddress, listServiceUuidStrings);
            HudDevicePickerActivity.this.runOnUiThread(new Runnable(this) { // from class: com.waze.gw.HudDevicePickerActivity.8.1
                final /* synthetic */ AnonymousClass8 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    if (HudDevicePickerActivity.this.bleList == null) {
                        return;
                    }
                    if (HudDevicePickerActivity.this.bleEmpty != null) {
                        HudDevicePickerActivity.this.bleList.removeView(HudDevicePickerActivity.this.bleEmpty);
                        HudDevicePickerActivity.this.bleEmpty = null;
                    }
                    HudDevicePickerActivity.this.bleList.addView(HudDevicePickerActivity.this.deviceCard(strSafeAddress, HudDevicePickerActivity.this.cleanName(HudDeviceRepository.safeName(device)), 2, listServiceUuidStrings), HudDevicePickerActivity.this.deviceCardParams());
                    HudDevicePickerActivity hudDevicePickerActivity = HudDevicePickerActivity.this;
                    if (HudDevicePickerActivity.this.vietMapMode) {
                        str = "Đã tìm thấy " + HudDevicePickerActivity.this.bleDevices.size() + " thiết bị BLE VietMap.";
                    } else {
                        str = "Đã tìm thấy " + HudDevicePickerActivity.this.bleDevices.size() + " thiết bị BLE HLP.";
                    }
                    hudDevicePickerActivity.setScanStatus(str, true);
                }
            });
        }
    };

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        COLOR_ACCENT = AmbientTheme.color(this);
        this.enableAfterSelect = getIntent().getBooleanExtra("enable_after_select", false);
        this.vietMapMode = PROFILE_VIETMAP.equalsIgnoreCase(getIntent().getStringExtra(EXTRA_HUD_PROFILE));
        getWindow().setStatusBarColor(COLOR_BG);
        getWindow().setNavigationBarColor(COLOR_BG);
        getWindow().getDecorView().setSystemUiVisibility(0);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(COLOR_BG);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int iDp = dp(isWide() ? 32.0f : 18.0f);
        linearLayout.setPadding(iDp, dp(12.0f), iDp, dp(36.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.min(getResources().getDisplayMetrics().widthPixels, dp(900.0f)), -2);
        layoutParams.gravity = 49;
        scrollView.addView(linearLayout, layoutParams);
        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
        addHeader(linearLayout);
        addConnectionCard(linearLayout);
        addQuickActions(linearLayout);
        addSectionHeader(linearLayout, "ĐÃ GHÉP NỐI", null, null);
        this.bondedList = new LinearLayout(this);
        this.bondedList.setOrientation(1);
        linearLayout.addView(this.bondedList, matchWrap());
        LinearLayout linearLayout2 = this.bondedList;
        if (this.vietMapMode) {
            str = "Chưa có thiết bị Bluetooth Classic VietMap nào được ghép nối.";
        } else {
            str = "Chưa có thiết bị Bluetooth Classic nào được ghép nối.";
        }
        this.bondedEmpty = addEmptyState(linearLayout2, str);
        addSectionHeader(linearLayout, this.vietMapMode ? "THIẾT BỊ VIETMAP BLE GẦN ĐÂY" : "THIẾT BỊ BLE GẦN ĐÂY", "QUÉT 10 GIÂY", new View.OnClickListener() { // from class: com.waze.gw.HudDevicePickerActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HudDevicePickerActivity.this.scanning) {
                    HudDevicePickerActivity.this.stopBleScan();
                } else {
                    HudDevicePickerActivity.this.startBleScan();
                }
            }
        });
        this.scanStatus = new TextView(this);
        this.scanStatus.setText("Nhấn Quét để tìm thiết bị HUD đang ở gần.");
        this.scanStatus.setTextSize(13.0f);
        this.scanStatus.setTextColor(COLOR_MUTED);
        LinearLayout.LayoutParams layoutParamsMatchWrap = matchWrap();
        layoutParamsMatchWrap.bottomMargin = dp(8.0f);
        linearLayout.addView(this.scanStatus, layoutParamsMatchWrap);
        this.bleList = new LinearLayout(this);
        this.bleList.setOrientation(1);
        linearLayout.addView(this.bleList, matchWrap());
        LinearLayout linearLayout3 = this.bleList;
        if (this.vietMapMode) {
            str2 = "Chưa quét thấy thiết bị BLE VietMap H50/H1 nào.";
        } else {
            str2 = "Chưa quét thấy thiết bị BLE HLP nào.";
        }
        this.bleEmpty = addEmptyState(linearLayout3, str2);
        showBonded();
        updateAdapterStatus();
    }

    private void addHeader(LinearLayout linearLayout) {
        String str;
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("‹");
        textView.setTextSize(40.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setGravity(17);
        textView.setContentDescription("Quay lại");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.HudDevicePickerActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HudDevicePickerActivity.this.finish();
            }
        });
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(dp(44.0f), dp(52.0f)));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        TextView textViewText = text(this.vietMapMode ? "Chọn thiết bị VietMap" : "Chọn thiết bị HUD", 23.0f, COLOR_TEXT, true);
        if (this.vietMapMode) {
            str = "VietMap H50 / H1 qua Bluetooth";
        } else {
            str = "Bluetooth Classic và Bluetooth Low Energy";
        }
        TextView textViewText2 = text(str, 13.0f, COLOR_MUTED, false);
        linearLayout3.addView(textViewText);
        linearLayout3.addView(textViewText2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.leftMargin = dp(6.0f);
        linearLayout2.addView(linearLayout3, layoutParams);
        linearLayout.addView(linearLayout2, matchWrap());
    }

    private void addConnectionCard(LinearLayout linearLayout) {
        String str;
        LinearLayout linearLayoutSurface = surface(COLOR_PANEL, 20, COLOR_BORDER, 1);
        boolean z = false;
        linearLayoutSurface.setOrientation(0);
        linearLayoutSurface.setGravity(16);
        linearLayoutSurface.setPadding(dp(18.0f), dp(18.0f), dp(18.0f), dp(18.0f));
        TextView textViewText = text("⌁", 32.0f, COLOR_ACCENT, true);
        textViewText.setGravity(17);
        textViewText.setBackground(circle(-14018782));
        linearLayoutSurface.addView(textViewText, new LinearLayout.LayoutParams(dp(54.0f), dp(54.0f)));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(14.0f), 0, 0, 0);
        linearLayout2.addView(text(this.vietMapMode ? "HUD VietMap" : "HUD Link", 18.0f, COLOR_TEXT, true));
        HudDeviceRepository hudDeviceRepository = new HudDeviceRepository(this);
        String strCleanName = cleanName(this.vietMapMode ? hudDeviceRepository.vietMapName() : hudDeviceRepository.name());
        String strVietMapAddress = this.vietMapMode ? hudDeviceRepository.vietMapAddress() : hudDeviceRepository.address();
        if (strVietMapAddress.length() == 0) {
            str = "Chưa chọn thiết bị";
        } else {
            str = strCleanName.length() == 0 ? strVietMapAddress : strCleanName + "  •  " + strVietMapAddress;
        }
        int length = strVietMapAddress.length();
        int i2 = COLOR_OK;
        linearLayout2.addView(text(str, 14.0f, length == 0 ? COLOR_MUTED : COLOR_OK, false));
        this.adapterStatus = text("Đang kiểm tra Bluetooth…", 12.0f, COLOR_MUTED, false);
        this.adapterStatus.setPadding(0, dp(5.0f), 0, 0);
        linearLayout2.addView(this.adapterStatus);
        linearLayoutSurface.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (!this.vietMapMode && getSharedPreferences("waze_hud_gw", 0).getBoolean("hud_link", false)) {
            z = true;
        }
        String str2 = this.vietMapMode ? "RUNTIME TẮT" : z ? "ĐANG BẬT" : "ĐANG TẮT";
        if (this.vietMapMode || !z) {
            i2 = COLOR_MUTED;
        }
        TextView textViewText2 = text(str2, 11.0f, i2, true);
        textViewText2.setGravity(17);
        textViewText2.setPadding(dp(11.0f), dp(7.0f), dp(11.0f), dp(7.0f));
        textViewText2.setBackground(pill(-14670803, COLOR_BORDER));
        linearLayoutSurface.addView(textViewText2);
        LinearLayout.LayoutParams layoutParamsMatchWrap = matchWrap();
        layoutParamsMatchWrap.topMargin = dp(16.0f);
        layoutParamsMatchWrap.bottomMargin = dp(18.0f);
        linearLayout.addView(linearLayoutSurface, layoutParamsMatchWrap);
    }

    private void addQuickActions(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(!isWide() ? 1 : 0);
        LinearLayout linearLayoutActionCard = actionCard("Cài đặt Bluetooth", this.vietMapMode ? "Ghép nối HUD VietMap Classic" : "Ghép nối HC-05, HC-06 hoặc ESP32 Classic", "MỞ CÀI ĐẶT");
        linearLayoutActionCard.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.HudDevicePickerActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    HudDevicePickerActivity.this.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
                } catch (Throwable th) {
                    HudDevicePickerActivity.this.setScanStatus("Không mở được cài đặt Bluetooth.", false);
                }
            }
        });
        LinearLayout linearLayoutActionCard2 = actionCard("Bật Bluetooth", this.vietMapMode ? "Cho phép tìm HUD VietMap ở gần" : "Cho phép Waze Mod tìm và kết nối HUD", "BẬT NGAY");
        linearLayoutActionCard2.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.HudDevicePickerActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    HudDevicePickerActivity.this.startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                } catch (Throwable th) {
                    HudDevicePickerActivity.this.setScanStatus("Không gửi được yêu cầu bật Bluetooth.", false);
                }
            }
        });
        if (isWide()) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.rightMargin = dp(6.0f);
            linearLayout2.addView(linearLayoutActionCard, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams2.leftMargin = dp(6.0f);
            linearLayout2.addView(linearLayoutActionCard2, layoutParams2);
        } else {
            linearLayout2.addView(linearLayoutActionCard, matchWrap());
            LinearLayout.LayoutParams layoutParamsMatchWrap = matchWrap();
            layoutParamsMatchWrap.topMargin = dp(10.0f);
            linearLayout2.addView(linearLayoutActionCard2, layoutParamsMatchWrap);
        }
        LinearLayout.LayoutParams layoutParamsMatchWrap2 = matchWrap();
        layoutParamsMatchWrap2.bottomMargin = dp(22.0f);
        linearLayout.addView(linearLayout2, layoutParamsMatchWrap2);
    }

    private LinearLayout actionCard(String str, String str2, String str3) {
        LinearLayout linearLayoutSurface = surface(COLOR_CONTROL, 16, COLOR_BORDER, 1);
        linearLayoutSurface.setOrientation(1);
        linearLayoutSurface.setPadding(dp(16.0f), dp(14.0f), dp(16.0f), dp(14.0f));
        linearLayoutSurface.setClickable(true);
        enableHoverLift(linearLayoutSurface);
        linearLayoutSurface.addView(text(str, 16.0f, COLOR_TEXT, true));
        TextView textViewText = text(str2, 12.0f, COLOR_MUTED, false);
        textViewText.setPadding(0, dp(3.0f), 0, dp(11.0f));
        linearLayoutSurface.addView(textViewText);
        linearLayoutSurface.addView(text(str3 + "  ›", 12.0f, COLOR_ACCENT, true));
        return linearLayoutSurface;
    }

    private void addSectionHeader(LinearLayout linearLayout, String str, String str2, View.OnClickListener onClickListener) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setGravity(16);
        linearLayout2.addView(text(str, 12.0f, COLOR_MUTED, true), new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (str2 != null) {
            this.scanAction = text(str2, 12.0f, COLOR_ACCENT, true);
            this.scanAction.setGravity(17);
            this.scanAction.setPadding(dp(13.0f), dp(8.0f), dp(13.0f), dp(8.0f));
            this.scanAction.setBackground(pill(-14018782, -11325372));
            this.scanAction.setOnClickListener(onClickListener);
            linearLayout2.addView(this.scanAction);
        }
        LinearLayout.LayoutParams layoutParamsMatchWrap = matchWrap();
        layoutParamsMatchWrap.topMargin = dp(4.0f);
        layoutParamsMatchWrap.bottomMargin = dp(9.0f);
        linearLayout.addView(linearLayout2, layoutParamsMatchWrap);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void showBonded() {
        /*
            r8 = this;
            android.widget.LinearLayout r0 = r8.bondedList
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.LinearLayout r0 = r8.bondedList
            r0.removeAllViews()
            r0 = 0
            android.bluetooth.BluetoothAdapter r1 = r8.adapter()     // Catch: java.lang.SecurityException -> L54
            if (r1 == 0) goto L53
            java.util.Set r1 = r1.getBondedDevices()     // Catch: java.lang.SecurityException -> L54
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.SecurityException -> L54
            r2 = 0
        L1b:
            boolean r3 = r1.hasNext()     // Catch: java.lang.SecurityException -> L51
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r1.next()     // Catch: java.lang.SecurityException -> L51
            android.bluetooth.BluetoothDevice r3 = (android.bluetooth.BluetoothDevice) r3     // Catch: java.lang.SecurityException -> L51
            java.lang.String r4 = com.waze.gw.HudDeviceRepository.safeAddress(r3)     // Catch: java.lang.SecurityException -> L51
            java.lang.String r3 = com.waze.gw.HudDeviceRepository.safeName(r3)     // Catch: java.lang.SecurityException -> L51
            java.lang.String r3 = r8.cleanName(r3)     // Catch: java.lang.SecurityException -> L51
            int r5 = r4.length()     // Catch: java.lang.SecurityException -> L51
            if (r5 != 0) goto L3a
            goto L1b
        L3a:
            android.widget.LinearLayout r5 = r8.bondedList     // Catch: java.lang.SecurityException -> L51
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.SecurityException -> L51
            r7 = 1
            android.view.View r3 = r8.deviceCard(r4, r3, r7, r6)     // Catch: java.lang.SecurityException -> L51
            android.widget.LinearLayout$LayoutParams r4 = r8.deviceCardParams()     // Catch: java.lang.SecurityException -> L51
            r5.addView(r3, r4)     // Catch: java.lang.SecurityException -> L51
            int r2 = r2 + 1
            goto L1b
        L4f:
            r0 = r2
            goto L53
        L51:
            r1 = move-exception
            goto L56
        L53:
            goto L5c
        L54:
            r1 = move-exception
            r2 = 0
        L56:
            java.lang.String r1 = "Cần quyền Thiết bị lân cận để đọc danh sách đã ghép nối."
            r8.setScanStatus(r1, r0)
            r0 = r2
        L5c:
            if (r0 != 0) goto L6f
            android.widget.LinearLayout r0 = r8.bondedList
            boolean r1 = r8.vietMapMode
            if (r1 == 0) goto L67
            java.lang.String r1 = "Chưa có thiết bị Bluetooth Classic VietMap nào được ghép nối."
            goto L69
        L67:
            java.lang.String r1 = "Chưa có thiết bị Bluetooth Classic nào được ghép nối."
        L69:
            android.widget.TextView r0 = r8.addEmptyState(r0, r1)
            r8.bondedEmpty = r0
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.HudDevicePickerActivity.showBonded():void");
    }

    private View deviceCard(String str, String str2, int i2) {
        return deviceCard(str, str2, i2, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View deviceCard(final String str, final String str2, final int i2, List<String> list) {
        final List<String> list2;
        HudProtocolFamily hudProtocolFamilyClassifyVietMap;
        String str3;
        HudDeviceRepository hudDeviceRepository = new HudDeviceRepository(this);
        boolean zEqualsIgnoreCase = str.equalsIgnoreCase(this.vietMapMode ? hudDeviceRepository.vietMapAddress() : hudDeviceRepository.address());
        if (this.vietMapMode) {
            list2 = list;
            hudProtocolFamilyClassifyVietMap = classifyVietMap(list2, i2);
        } else {
            list2 = list;
            hudProtocolFamilyClassifyVietMap = HudProtocolFamily.HLP1;
        }
        final HudProtocolFamily hudProtocolFamily = hudProtocolFamilyClassifyVietMap;
        LinearLayout linearLayoutSurface = surface(zEqualsIgnoreCase ? -14345947 : COLOR_CONTROL, 16, zEqualsIgnoreCase ? COLOR_ACCENT : COLOR_BORDER, zEqualsIgnoreCase ? 2 : 1);
        linearLayoutSurface.setOrientation(0);
        linearLayoutSurface.setGravity(16);
        linearLayoutSurface.setPadding(dp(13.0f), dp(12.0f), dp(13.0f), dp(12.0f));
        linearLayoutSurface.setClickable(true);
        enableHoverLift(linearLayoutSurface);
        TextView textViewText = text(i2 == 1 ? "C" : "B", 16.0f, i2 == 1 ? COLOR_ACCENT : COLOR_BLUE, true);
        textViewText.setGravity(17);
        textViewText.setBackground(circle(i2 == 1 ? -13361109 : -15258313));
        linearLayoutSurface.addView(textViewText, new LinearLayout.LayoutParams(dp(44.0f), dp(44.0f)));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(dp(13.0f), 0, dp(8.0f), 0);
        linearLayout.addView(text(str2.length() == 0 ? "Thiết bị không tên" : str2, 16.0f, COLOR_TEXT, true));
        int i3 = COLOR_MUTED;
        linearLayout.addView(text(str, 12.0f, COLOR_MUTED, false));
        linearLayoutSurface.addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (zEqualsIgnoreCase) {
            str3 = "ĐANG DÙNG";
        } else if (this.vietMapMode && i2 == 1) {
            str3 = "CHỌN PROFILE  ›";
        } else if (this.vietMapMode && hudProtocolFamily == HudProtocolFamily.VIETMAP_H50) {
            str3 = "H50  ›";
        } else if (this.vietMapMode && hudProtocolFamily == HudProtocolFamily.VIETMAP_H1) {
            str3 = "H1  ›";
        } else {
            str3 = i2 == 1 ? "CLASSIC  ›" : "BLE  ›";
        }
        if (zEqualsIgnoreCase) {
            i3 = COLOR_OK;
        }
        TextView textViewText2 = text(str3, 11.0f, i3, true);
        textViewText2.setGravity(17);
        linearLayoutSurface.addView(textViewText2);
        linearLayoutSurface.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.HudDevicePickerActivity.7
            final /* synthetic */ HudDevicePickerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!this.this$0.vietMapMode) {
                    this.this$0.select(str, str2, i2);
                    return;
                }
                if (i2 == 1) {
                    this.this$0.chooseVietMapClassicProfile(str, str2);
                } else if (hudProtocolFamily == HudProtocolFamily.VIETMAP_H50 || hudProtocolFamily == HudProtocolFamily.VIETMAP_H1) {
                    this.this$0.selectVietMap(str, str2, i2, HudProtocolFamily.AUTO, list2);
                }
            }
        });
        return linearLayoutSurface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LinearLayout.LayoutParams deviceCardParams() {
        LinearLayout.LayoutParams layoutParamsMatchWrap = matchWrap();
        layoutParamsMatchWrap.bottomMargin = dp(8.0f);
        return layoutParamsMatchWrap;
    }

    private TextView addEmptyState(LinearLayout linearLayout, String str) {
        TextView textViewText = text(str, 13.0f, COLOR_MUTED, false);
        textViewText.setGravity(17);
        textViewText.setPadding(dp(18.0f), dp(20.0f), dp(18.0f), dp(20.0f));
        textViewText.setBackground(surfaceDrawable(COLOR_PANEL, 14, COLOR_BORDER, 1));
        linearLayout.addView(textViewText, matchWrap());
        return textViewText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBleScan() {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 31 && checkSelfPermission("android.permission.BLUETOOTH_SCAN") != 0) {
            requestPermissions(new String[]{"android.permission.BLUETOOTH_SCAN"}, 4102);
            return;
        }
        if (Build.VERSION.SDK_INT < 31 && checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 4102);
            return;
        }
        try {
            BluetoothAdapter bluetoothAdapterAdapter = adapter();
            if (bluetoothAdapterAdapter != null && bluetoothAdapterAdapter.isEnabled()) {
                this.scanner = bluetoothAdapterAdapter.getBluetoothLeScanner();
                if (this.scanner == null) {
                    setScanStatus("Thiết bị này không cung cấp bộ quét BLE.", false);
                    return;
                }
                this.bleDevices.clear();
                this.bleAdvertisedServices.clear();
                this.bleList.removeAllViews();
                LinearLayout linearLayout = this.bleList;
                if (this.vietMapMode) {
                    str = "Đang tìm thiết bị BLE VietMap H50/H1 ở gần…";
                } else {
                    str = "Đang tìm thiết bị BLE HLP ở gần…";
                }
                this.bleEmpty = addEmptyState(linearLayout, str);
                this.scanning = true;
                this.softwareFilteredScan = false;
                if (this.scanAction != null) {
                    this.scanAction.setText("DỪNG QUÉT");
                }
                this.scanner.startScan(this.vietMapMode ? vietMapScanFilters() : Collections.singletonList(new ScanFilter.Builder().setServiceUuid(new ParcelUuid(HlpUuids.SERVICE)).build()), new ScanSettings.Builder().setScanMode(2).build(), this.callback);
                this.handler.removeCallbacks(this.stopScanRunnable);
                this.handler.removeCallbacks(this.scanFallbackRunnable);
                this.handler.postDelayed(this.scanFallbackRunnable, 3500L);
                this.handler.postDelayed(this.stopScanRunnable, 10000L);
                if (this.vietMapMode) {
                    str2 = "Đang quét trong 10 giây… Đặt HUD VietMap ở chế độ ghép nối.";
                } else {
                    str2 = "Đang quét trong 10 giây… Đặt HUD ở chế độ ghép nối.";
                }
                setScanStatus(str2, true);
                return;
            }
            setScanStatus("Bluetooth đang tắt. Hãy bật Bluetooth trước khi quét.", false);
        } catch (SecurityException e2) {
            setScanStatus("Cần quyền Thiết bị lân cận để quét BLE.", false);
        } catch (Throwable th) {
            setScanStatus("Không thể bắt đầu quét BLE.", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHlpResult(ScanResult scanResult) {
        List<ParcelUuid> serviceUuids;
        if (scanResult == null || scanResult.getScanRecord() == null || (serviceUuids = scanResult.getScanRecord().getServiceUuids()) == null) {
            return false;
        }
        ParcelUuid parcelUuid = new ParcelUuid(HlpUuids.SERVICE);
        Iterator<ParcelUuid> it = serviceUuids.iterator();
        while (it.hasNext()) {
            if (parcelUuid.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVietMapResult(ScanResult scanResult) {
        return HudDevicePickerLogic.acceptsVietMapBle(serviceUuidStrings(scanResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> serviceUuidStrings(ScanResult scanResult) {
        List<ParcelUuid> serviceUuids;
        ArrayList arrayList = new ArrayList();
        if (scanResult == null || scanResult.getScanRecord() == null || (serviceUuids = scanResult.getScanRecord().getServiceUuids()) == null) {
            return arrayList;
        }
        for (ParcelUuid parcelUuid : serviceUuids) {
            if (parcelUuid != null) {
                arrayList.add(HudProtocolSelector.normalizeUuid(parcelUuid.toString()));
            }
        }
        return arrayList;
    }

    private List<ScanFilter> vietMapScanFilters() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new ScanFilter.Builder().setServiceUuid(new ParcelUuid(UUID.fromString("0000ffff-0000-1000-8000-00805f9b34fb"))).build());
        arrayList.add(new ScanFilter.Builder().setServiceUuid(new ParcelUuid(UUID.fromString("0000fff0-0000-1000-8000-00805f9b34fb"))).build());
        return arrayList;
    }

    private HudProtocolFamily classifyVietMap(Iterable<String> iterable, int i2) {
        return HudDevicePickerLogic.classifyVietMap(iterable, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopBleScan() {
        String str;
        String str2;
        this.handler.removeCallbacks(this.stopScanRunnable);
        this.handler.removeCallbacks(this.scanFallbackRunnable);
        if (this.scanning) {
            this.scanning = false;
            this.softwareFilteredScan = false;
            try {
                if (this.scanner != null) {
                    this.scanner.stopScan(this.callback);
                }
            } catch (Throwable th) {
            }
            if (this.scanAction != null) {
                this.scanAction.setText("QUÉT LẠI");
            }
            if (this.bleDevices.isEmpty()) {
                if (this.vietMapMode) {
                    str = "Không tìm thấy HUD BLE VietMap H50/H1. Kiểm tra nguồn và chế độ ghép nối.";
                } else {
                    str = "Không tìm thấy HUD BLE HLP. Kiểm tra nguồn và chế độ ghép nối.";
                }
                setScanStatus(str, false);
                if (this.bleList != null && this.bleList.getChildCount() == 0) {
                    LinearLayout linearLayout = this.bleList;
                    if (this.vietMapMode) {
                        str2 = "Không có thiết bị BLE VietMap trong lần quét này.";
                    } else {
                        str2 = "Không có thiết bị BLE HLP trong lần quét này.";
                    }
                    this.bleEmpty = addEmptyState(linearLayout, str2);
                    return;
                }
                return;
            }
            setScanStatus("Hoàn tất • " + this.bleDevices.size() + " thiết bị được tìm thấy.", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScanStatus(String str, boolean z) {
        if (this.scanStatus == null) {
            return;
        }
        this.scanStatus.setText(str);
        this.scanStatus.setTextColor(z ? COLOR_OK : COLOR_MUTED);
    }

    private void updateAdapterStatus() {
        String str;
        if (this.adapterStatus == null) {
            return;
        }
        BluetoothAdapter bluetoothAdapterAdapter = adapter();
        boolean z = false;
        if (bluetoothAdapterAdapter != null) {
            try {
                if (bluetoothAdapterAdapter.isEnabled()) {
                    z = true;
                }
            } catch (SecurityException e2) {
            }
        }
        TextView textView = this.adapterStatus;
        if (bluetoothAdapterAdapter == null) {
            str = "Bluetooth không khả dụng";
        } else {
            str = z ? "●  Bluetooth đang bật" : "○  Bluetooth đang tắt";
        }
        textView.setText(str);
        this.adapterStatus.setTextColor(z ? COLOR_OK : COLOR_MUTED);
    }

    private BluetoothAdapter adapter() {
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        if (bluetoothManager == null) {
            return null;
        }
        return bluetoothManager.getAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void select(String str, String str2, int i2) {
        new HudDeviceRepository(this).select(str, str2, i2);
        if (this.enableAfterSelect) {
            getSharedPreferences("waze_hud_gw", 0).edit().putBoolean("hud_link", true).apply();
            HudLinkService.startFromUser(this);
        } else if (getSharedPreferences("waze_hud_gw", 0).getBoolean("hud_link", false)) {
            HudLinkService.reconfigure(this);
        }
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectVietMap(String str, String str2, int i2, HudProtocolFamily hudProtocolFamily, Iterable<String> iterable) {
        new HudDeviceRepository(this).selectVietMap(str, str2, i2, hudProtocolFamily, iterable);
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void chooseVietMapClassicProfile(final String str, final String str2) {
        final HudProtocolFamily[] hudProtocolFamilyArr = {HudProtocolFamily.VIETMAP_H50, HudProtocolFamily.VIETMAP_H1};
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setTitle("Chọn profile VietMap").setMessage("Bluetooth Classic không quảng cáo service UUID. Chọn đúng profile trước khi lưu.").setSingleChoiceItems(new String[]{"VietMap H50", "VietMap H1 / DJBT"}, -1, (DialogInterface.OnClickListener) null).setNegativeButton("Hủy", (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: com.waze.gw.HudDevicePickerActivity.9
            final /* synthetic */ HudDevicePickerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                ListView listView = alertDialogCreate.getListView();
                final HudProtocolFamily[] hudProtocolFamilyArr2 = hudProtocolFamilyArr;
                final String str3 = str;
                final String str4 = str2;
                final AlertDialog alertDialog = alertDialogCreate;
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener(this) { // from class: com.waze.gw.HudDevicePickerActivity.9.1
                    final /* synthetic */ AnonymousClass9 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                        HudProtocolFamily hudProtocolFamily = hudProtocolFamilyArr2[i2];
                        this.this$1.this$0.selectVietMap(str3, str4, 1, hudProtocolFamily, this.this$1.this$0.serviceForFamily(hudProtocolFamily));
                        alertDialog.dismiss();
                    }
                });
            }
        });
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> serviceForFamily(HudProtocolFamily hudProtocolFamily) {
        return HudDevicePickerLogic.manualServices(hudProtocolFamily);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        updateAdapterStatus();
        if (this.bondedList != null) {
            showBonded();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 4102 && iArr.length > 0 && iArr[0] == 0) {
            startBleScan();
        } else if (i2 == 4102) {
            setScanStatus("Không có quyền Thiết bị lân cận nên chưa thể quét BLE.", false);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        stopBleScan();
        this.handler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    private TextView text(String str, float f2, int i2, boolean z) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(f2);
        textView.setTextColor(i2);
        if (z) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        return textView;
    }

    private void enableHoverLift(View view) {
        view.setOnHoverListener(new View.OnHoverListener() { // from class: com.waze.gw.HudDevicePickerActivity.10
            @Override // android.view.View.OnHoverListener
            public boolean onHover(View view2, MotionEvent motionEvent) {
                boolean z = motionEvent.getActionMasked() != 10;
                view2.animate().scaleX(z ? 1.008f : 1.0f).scaleY(z ? 1.008f : 1.0f).translationZ(z ? HudDevicePickerActivity.this.dp(3.0f) : 0.0f).setDuration(100L).start();
                return false;
            }
        });
    }

    private LinearLayout surface(int i2, int i3, int i4, int i5) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setBackground(surfaceDrawable(i2, i3, i4, i5));
        return linearLayout;
    }

    private GradientDrawable surfaceDrawable(int i2, int i3, int i4, int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(dp(i3));
        if (i5 > 0) {
            gradientDrawable.setStroke(dp(i5), i4);
        }
        return gradientDrawable;
    }

    private GradientDrawable circle(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    private GradientDrawable pill(int i2, int i3) {
        return surfaceDrawable(i2, 99, i3, 1);
    }

    private LinearLayout.LayoutParams matchWrap() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String cleanName(String str) {
        return (str == null || "null".equalsIgnoreCase(str.trim())) ? "" : str.trim();
    }

    private boolean isWide() {
        return getResources().getConfiguration().screenWidthDp >= 600;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int dp(float f2) {
        return (int) ((f2 * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
