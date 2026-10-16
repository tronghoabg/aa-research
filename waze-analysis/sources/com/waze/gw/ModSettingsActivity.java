package com.waze.gw;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.camera.video.AudioStats;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.WorkRequest;
import com.waze.gw.HudDeviceConfig;
import com.waze.gw.TripBlackBox;
import com.waze.strings.DisplayStrings;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class ModSettingsActivity extends Activity {
    private static final long AUDIO_PREVIEW_COOLDOWN_MS = 5000;
    private static final String CAT_ALERTS = "alerts";
    private static final String CAT_AUTO = "auto";
    private static final String CAT_BLACK_BOX = "black_box";
    private static final String CAT_BUBBLE = "bubble";
    private static final String CAT_DEVICE = "device";
    private static final String CAT_DIAGNOSTICS = "diagnostics";
    private static final String CAT_FLOAT_SPEEDO = "float_speedo";
    private static final String CAT_GPS = "gps";
    private static final String CAT_HUD = "hud";
    private static final String CAT_MAP = "map";
    private static final String CAT_UPDATES = "updates";
    private static final int COLOR_BG = -16052974;
    private static final int COLOR_BORDER = -14012613;
    private static final int COLOR_CONTROL = -14999767;
    private static final int COLOR_MUTED = -6642766;
    private static final int COLOR_PANEL = -15526370;
    private static final int COLOR_TEXT = -789258;
    private static final int HUD_LINK_TAB_HLP = 0;
    private static final int HUD_LINK_TAB_VIETMAP = 1;
    private static final int HUD_LINK_TAB_WIFI = 2;
    private static final String MAP_BUILD_CACHE = "map_build_status_json";
    private static final String MAP_BUILD_FETCHED = "map_build_status_fetched";
    private static final String MAP_BUILD_URL = "https://storage.googleapis.com/waze-tile-build-public/current-build/intl-status.json";
    private static final long MAX_RECORDING_MS = 15000;
    static final String PREFS = "waze_hud_gw";
    private static final String PREF_HUD_LINK_UI_TAB = "hud_link_ui_tab";
    private static final int REQUEST_EXPORT_ALERT_RECORDING = 4104;
    private static final int REQUEST_EXPORT_DIAGNOSTICS = 4107;
    private static final int REQUEST_EXPORT_RECORDING_PACKAGE = 4105;
    private static final int REQUEST_EXPORT_TRIP_GPX = 4108;
    private static final int REQUEST_IMPORT_RECORDING_PACKAGE = 4106;
    private static final int REQUEST_PICK_OVERSPEED_AUDIO = 4102;
    private static final int REQUEST_RECORD_OVERSPEED_AUDIO = 4103;
    private static final String SCROLL_PAGE_MENU = "menu";
    private ScrollView activePageScroll;
    private String activePageScrollKey;
    private TextView alertRecordButton;
    private Dialog alertRecordDialog;
    private MediaPlayer alertRecordPreviewPlayer;
    private ProgressBar alertRecordProgress;
    private LinearLayout alertRecordReviewActions;
    private TextView alertRecordSaveButton;
    private TextView alertRecordStatus;
    private MediaRecorder alertRecorder;
    private boolean alertRecording;
    private File alertRecordingFile;
    private long alertRecordingStartedAt;
    private AudioPreviewCard audioActivePreview;
    private AudioPreviewCard audioCurrentPreview;
    private AudioPreviewCard audioNavigationPreview;
    private long audioPreviewLockedUntil;
    private FrameLayout detailHost;
    private TextView gpsDetailAccuracy;
    private TextView gpsDetailAge;
    private TextView gpsDetailLevel;
    private GpsSignalView gpsDetailSignal;
    private TextView gpsDetailSource;
    private TextView gpsDetailStatus;
    private boolean hudDeviceConfigDirty;
    private LinearLayout hudDeviceConfigHost;
    private TextView hudLinkActionButton;
    private TextView hudLinkStatus;
    private boolean hudStatusReceiverRegistered;
    private TextView mapBuildBadge;
    private TextView mapBuildDetails;
    private TextView mapBuildEta;
    private TextView mapBuildFetched;
    private boolean mapBuildLoading;
    private ProgressBar mapBuildProgress;
    private FrameLayout narrowHost;
    private TextView overspeedAudioSummary;
    private boolean pendingAlertRecordingPermission;
    private boolean pendingHudEnable;
    private boolean pendingHudPicker;
    private TextView selectedAudioSummary;
    private String selectedCategory;
    private String selectedSubpage;
    private LinearLayout sideMenu;
    private SharedPreferences sp;
    private boolean wideSettings;
    private static int COLOR_ACCENT = AmbientTheme.WAZE_BLUE;
    private static final int[] VOICE_SPEEDS = {10, 20, 30, 35, 40, 50, 60, 70, 80, 90, 100, 110, 120};
    private static final int[] OVER_MARGIN_VALUES = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 10};
    private static final String[] OVER_MARGIN_LABELS = {"-5 km/h", "-4 km/h", "-3 km/h", "-2 km/h", "-1 km/h", "+0 km/h", "+1 km/h", "+2 km/h", "+3 km/h", "+4 km/h", "+5 km/h", "+10 km/h"};
    private String pendingHudPickerProfile = "hlp1";
    private long hudDeviceConfigGeneration = -1;
    private long hudDeviceConfigRevision = -1;
    private final LinkedHashMap<String, Object> hudDeviceConfigDraft = new LinkedHashMap<>();
    private final HudDeviceConfig.Listener hudDeviceConfigListener = new HudDeviceConfig.Listener() { // from class: com.waze.gw.ModSettingsActivity.1
        @Override // com.waze.gw.HudDeviceConfig.Listener
        public void onHudDeviceConfigChanged() {
            ModSettingsActivity.this.runOnUiThread(new Runnable() { // from class: com.waze.gw.ModSettingsActivity.1.1
                @Override // java.lang.Runnable
                public void run() {
                    ModSettingsActivity.this.renderHudDeviceConfig();
                }
            });
        }
    };
    private final Handler audioPreviewHandler = new Handler(Looper.getMainLooper());
    private String selectedAudioSlot = "";
    private int pendingDiagnosticsExport = 4;
    private long pendingTripExportId = -1;
    private final Handler alertRecordingHandler = new Handler(Looper.getMainLooper());
    private final Runnable alertRecordingTimeout = new Runnable() { // from class: com.waze.gw.ModSettingsActivity.2
        @Override // java.lang.Runnable
        public void run() {
            ModSettingsActivity.this.stopAlertRecordingForReview();
        }
    };
    private final Runnable alertRecordingProgressTick = new Runnable() { // from class: com.waze.gw.ModSettingsActivity.3
        @Override // java.lang.Runnable
        public void run() {
            if (ModSettingsActivity.this.alertRecording) {
                long jMax = Math.max(0L, SystemClock.elapsedRealtime() - ModSettingsActivity.this.alertRecordingStartedAt);
                int iMin = (int) Math.min(15000L, jMax);
                if (ModSettingsActivity.this.alertRecordProgress != null) {
                    ModSettingsActivity.this.alertRecordProgress.setProgress(iMin);
                }
                if (ModSettingsActivity.this.alertRecordStatus != null) {
                    long jMax2 = Math.max(0L, ((15000 - jMax) + 99) / 100);
                    ModSettingsActivity.this.alertRecordStatus.setText(String.format(Locale.US, "●  Đang thu  ·  còn %d.%d giây", Long.valueOf(jMax2 / 10), Long.valueOf(jMax2 % 10)));
                }
                if (jMax < 15000) {
                    ModSettingsActivity.this.alertRecordingHandler.postDelayed(this, 50L);
                }
            }
        }
    };
    private final Handler gpsUiHandler = new Handler(Looper.getMainLooper());
    private final Runnable audioPreviewCountdown = new Runnable() { // from class: com.waze.gw.ModSettingsActivity.4
        @Override // java.lang.Runnable
        public void run() {
            ModSettingsActivity.this.updateAudioPreviewCooldown();
        }
    };
    private final Runnable gpsUiTick = new Runnable() { // from class: com.waze.gw.ModSettingsActivity.5
        @Override // java.lang.Runnable
        public void run() {
            ModSettingsActivity.this.updateGpsQualityCard();
            if (ModSettingsActivity.CAT_GPS.equals(ModSettingsActivity.this.selectedCategory)) {
                ModSettingsActivity.this.gpsUiHandler.postDelayed(this, 250L);
            }
        }
    };
    private final HashMap<String, FrameLayout> menuRows = new HashMap<>();
    private final HashMap<String, Integer> pageScrollPositions = new HashMap<>();
    private final BroadcastReceiver hudStatusReceiver = new BroadcastReceiver() { // from class: com.waze.gw.ModSettingsActivity.10
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ModSettingsActivity.this.refreshHudLinkStatus();
        }
    };

    interface BoolCb {
        void on(boolean z);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DiagnosticsLogger.install(this);
        if (!Gateway.modEnabled(this)) {
            finish();
            return;
        }
        this.sp = getSharedPreferences(PREFS, 0);
        COLOR_ACCENT = AmbientTheme.color(this.sp);
        this.wideSettings = ((int) (((float) getResources().getDisplayMetrics().widthPixels) / getResources().getDisplayMetrics().density)) >= 600;
        if (this.wideSettings) {
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(COLOR_BG);
            applySystemBarInsets(frameLayout);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(0);
            this.sideMenu = buildCategoryMenu();
            linearLayout.addView(this.sideMenu, new LinearLayout.LayoutParams(Math.max(dp(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_FERRIES), Math.min(dp(DisplayStrings.DS_ONE_DAY_AGO), (int) (getResources().getDisplayMetrics().widthPixels * 0.3f))), -1));
            this.detailHost = new FrameLayout(this);
            linearLayout.addView(this.detailHost, new LinearLayout.LayoutParams(0, -1, 1.0f));
            frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            setContentView(frameLayout);
            showEmptyDetail();
        } else {
            this.narrowHost = new FrameLayout(this);
            this.narrowHost.setBackgroundColor(COLOR_BG);
            applySystemBarInsets(this.narrowHost);
            setContentView(this.narrowHost);
            showCategoryMenu();
        }
        try {
            if (getIntent() != null && getIntent().getBooleanExtra("ota_check", false)) {
                openCategory(CAT_UPDATES);
                Updater.checkNow(this);
            }
        } catch (Throwable th) {
        }
    }

    private void applySystemBarInsets(final View view) {
        if (view == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.waze.gw.ModSettingsActivity.6
            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                if (windowInsets == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
                    view2.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                } else {
                    view2.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                }
                return windowInsets;
            }
        });
        view.requestApplyInsets();
        view.post(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.7
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                view.requestApplyInsets();
            }
        });
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        HudDeviceConfig.addListener(this.hudDeviceConfigListener);
        if (this.hudStatusReceiverRegistered) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.waze.gw.HUD_LINK_STATUS_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.hudStatusReceiver, intentFilter, 4);
        } else {
            registerReceiver(this.hudStatusReceiver, intentFilter);
        }
        this.hudStatusReceiverRegistered = true;
        refreshHudLinkStatus();
    }

    @Override // android.app.Activity
    protected void onStop() {
        HudDeviceConfig.removeListener(this.hudDeviceConfigListener);
        if (this.hudStatusReceiverRegistered) {
            try {
                unregisterReceiver(this.hudStatusReceiver);
            } catch (Throwable th) {
            }
            this.hudStatusReceiverRegistered = false;
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.audioPreviewHandler.removeCallbacks(this.audioPreviewCountdown);
        this.gpsUiHandler.removeCallbacks(this.gpsUiTick);
        discardAlertRecording();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Throwable] */
    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        String str;
        super.onActivityResult(i2, i3, intent);
        if (i2 == REQUEST_EXPORT_TRIP_GPX) {
            final long j2 = this.pendingTripExportId > 0 ? this.pendingTripExportId : this.sp.getLong("pending_trip_export_id", -1L);
            this.pendingTripExportId = -1L;
            this.sp.edit().remove("pending_trip_export_id").apply();
            if (i3 != -1 || intent == null || intent.getData() == null || j2 <= 0) {
                return;
            }
            final Uri data = intent.getData();
            Toast.makeText(this, "Đang xuất hộp đen GPX…", 0).show();
            Thread thread = new Thread(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.8
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    final boolean zExportGpx = TripBlackBox.exportGpx(this.this$0, j2, data);
                    this.this$0.runOnUiThread(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.8.1
                        final /* synthetic */ AnonymousClass8 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (this.this$1.this$0.isFinishing()) {
                                return;
                            }
                            Toast.makeText(this.this$1.this$0, zExportGpx ? "Đã xuất chuyến đi GPX" : "Không thể xuất chuyến đi GPX", zExportGpx ? 0 : 1).show();
                        }
                    });
                }
            }, "WazeMod-TripExport");
            thread.setDaemon(true);
            thread.start();
            return;
        }
        if (i2 == REQUEST_EXPORT_DIAGNOSTICS) {
            if (i3 != -1 || intent == null || intent.getData() == null) {
                return;
            }
            final Uri data2 = intent.getData();
            final int i4 = this.pendingDiagnosticsExport;
            Toast.makeText(this, "Đang đóng gói báo cáo…", 0).show();
            Thread thread2 = new Thread(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.9
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    final boolean zExport = DiagnosticsLogger.export(this.this$0, data2, i4);
                    this.this$0.runOnUiThread(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.9.1
                        final /* synthetic */ AnonymousClass9 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (this.this$1.this$0.isFinishing()) {
                                return;
                            }
                            Toast.makeText(this.this$1.this$0, zExport ? "Đã xuất báo cáo chẩn đoán" : "Không thể xuất báo cáo chẩn đoán", zExport ? 0 : 1).show();
                        }
                    });
                }
            }, "WazeMod-DiagnosticsExport");
            thread2.setDaemon(true);
            thread2.start();
            return;
        }
        if (i2 == REQUEST_EXPORT_RECORDING_PACKAGE) {
            if (i3 != -1 || intent == null || intent.getData() == null) {
                return;
            }
            int iExportRecordingPackage = CustomAlertAudio.exportRecordingPackage(this, this.sp, intent.getData());
            if (iExportRecordingPackage > 0) {
                str = "Đã xuất " + iExportRecordingPackage + " bản thu";
            } else {
                str = iExportRecordingPackage == 0 ? "Chưa có bản tự thu để xuất" : "Không thể xuất gói âm thanh";
            }
            Toast.makeText(this, str, iExportRecordingPackage < 0 ? 1 : 0).show();
            return;
        }
        if (i2 == REQUEST_IMPORT_RECORDING_PACKAGE) {
            if (i3 != -1 || intent == null || intent.getData() == null) {
                return;
            }
            Uri data3 = intent.getData();
            try {
                getContentResolver().takePersistableUriPermission(data3, intent.getFlags() & 1);
            } catch (Throwable th) {
            }
            showRecordingPackageImportDrawer(data3);
            return;
        }
        if (i2 == REQUEST_EXPORT_ALERT_RECORDING) {
            String string = this.sp.getString("pending_custom_audio_export_slot", "");
            this.sp.edit().remove("pending_custom_audio_export_slot").apply();
            if (i3 != -1 || intent == null || intent.getData() == null || string == null || string.isEmpty()) {
                return;
            }
            boolean zExportToUri = CustomAlertAudio.exportToUri(this, string, intent.getData());
            Toast.makeText(this, zExportToUri ? "Đã xuất bản thu" : "Không thể xuất bản thu", !zExportToUri ? 1 : 0).show();
            return;
        }
        if (i2 != REQUEST_PICK_OVERSPEED_AUDIO) {
            return;
        }
        String string2 = this.selectedAudioSlot;
        if (string2 == null || string2.isEmpty()) {
            string2 = this.sp.getString("pending_custom_audio_slot", "");
        }
        this.sp.edit().remove("pending_custom_audio_slot").apply();
        if (i3 != -1 || intent == null || intent.getData() == null || string2 == null || string2.isEmpty()) {
            return;
        }
        Uri data4 = intent.getData();
        String strAudioDisplayName = audioDisplayName(data4);
        if (CustomAlertAudio.importUri(this, string2, data4)) {
            this.sp.edit().putInt(CustomAlertAudio.modeKey(string2), 1).putString(CustomAlertAudio.nameKey(string2), strAudioDisplayName).apply();
            if (this.selectedAudioSummary != null) {
                this.selectedAudioSummary.setText(customAudioLabel(string2));
            }
            Toast.makeText(this, "Đã lưu âm thanh riêng", 0).show();
        } else {
            Toast.makeText(this, "Tệp không hợp lệ, dài quá 30 giây hoặc lớn hơn 16 MB", 1).show();
        }
        this.selectedAudioSlot = "";
        this.selectedAudioSummary = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshHudLinkStatus() {
        TextView textView = this.hudLinkStatus;
        if (textView == null || this.sp == null) {
            return;
        }
        String string = this.sp.getString("hud_link_status", "DISABLED");
        String string2 = this.sp.getString("hud_link_error", "");
        String strLocalizedState = HudLinkService.localizedState(string);
        String strLocalizedDetail = HudLinkService.localizedDetail(string2);
        if (strLocalizedDetail.length() != 0) {
            strLocalizedState = strLocalizedState + "\n" + strLocalizedDetail;
        }
        textView.setText(strLocalizedState);
        if (this.hudLinkActionButton != null) {
            this.hudLinkActionButton.setText(hudLinkActionLabel(string));
        }
        renderHudDeviceConfig();
    }

    private String hudLinkActionLabel(String str) {
        if ("CONNECTED".equals(str)) {
            return "Ngắt kết nối";
        }
        if ("CONNECTING".equals(str) || "HANDSHAKING".equals(str) || "RETRY_WAIT".equals(str) || "ERROR".equals(str)) {
            return "Kết nối lại";
        }
        return "Kết nối";
    }

    protected void onCreateLegacy(Bundle bundle) {
        super.onCreate(bundle);
        if (Gateway.modEnabled(this)) {
            this.sp = getSharedPreferences(PREFS, 0);
            ScrollView scrollView = new ScrollView(this);
            scrollView.setBackgroundColor(COLOR_BG);
            scrollView.setFillViewport(true);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(dp(16), dp(18), dp(16), dp(28));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(this);
            textView.setText("WAZE MOD");
            textView.setTextSize(25.0f);
            textView.setTextColor(COLOR_TEXT);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout.addView(textView);
            TextView textView2 = new TextView(this);
            textView2.setText("Tùy chỉnh trải nghiệm lái xe");
            textView2.setTextSize(14.0f);
            textView2.setTextColor(COLOR_MUTED);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = dp(2);
            layoutParams.bottomMargin = dp(4);
            linearLayout.addView(textView2, layoutParams);
            LinearLayout linearLayoutAddCategory = addCategory(linearLayout, "Âm thanh & giọng đọc", "Cảnh báo tốc độ, dữ liệu đoạn đường và âm lượng");
            addSection(linearLayoutAddCategory, "Âm thanh cảnh báo");
            addAudioMixChoice(linearLayoutAddCategory);
            addChoice(linearLayoutAddCategory, "Bộ giọng đọc", "voice_preset", new int[]{2, 4, 1, 3}, new String[]{"Waze (Mẫn nhi)", "VML (Ca sỹ Ngọc Bích)", "VML (MC Lê Yến)", "WazeMod"}, 2);
            addSection(linearLayoutAddCategory, "Thông báo bằng giọng nói");
            addSwitch(linearLayoutAddCategory, "Đọc tốc độ giới hạn hiện tại", "say_limit", true);
            addSwitch(linearLayoutAddCategory, "Cảnh báo khi vượt tốc độ", "say_over", true);
            addSwitch(linearLayoutAddCategory, "Đọc trước khi sắp giảm tốc", "say_next", true);
            addSwitch(linearLayoutAddCategory, "Đọc thông báo dữ liệu đoạn đường", "road_notice_tts", true);
            LinearLayout linearLayoutAddCategory2 = addCategory(linearLayout, "Tốc độ & GPS", "Ngưỡng cảnh báo và hiệu chỉnh theo đồng hồ xe");
            addChoice(linearLayoutAddCategory2, "Ngưỡng vượt tốc", "over_margin", OVER_MARGIN_VALUES, OVER_MARGIN_LABELS, 0);
            addSwitch(linearLayoutAddCategory2, "Giới hạn xe máy", "moto_cap", true);
            final SeekBar seekBarAddSlider = addSlider(linearLayoutAddCategory2, "Hiệu chỉnh tốc độ GPS (± km/h)", "gps_offset", -10, 10, 1, 0, " km/h", true, "Điều chỉnh GPS có thể gây ra sai lệch tốc độ", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.11
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$0.resetSlider(seekBarArr[0], 0);
                }
            });
            final SeekBar[] seekBarArr = {addSlider(linearLayoutAddCategory2, "Hiệu chỉnh tốc độ GPS (cộng thêm %)", "gps_pct", 0, 10, 1, 0, "%", true, "Cộng theo tỷ lệ — khớp đồng hồ xe tốt hơn. Đổi kiểu này sẽ đưa ± km/h về 0", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.12
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$0.resetSlider(seekBarAddSlider, 0);
                }
            })};
            addSwitch(linearLayoutAddCategory2, "Áp dụng hiệu chỉnh trên Android Auto", "gps_correct_android_auto", true);
            LinearLayout linearLayoutAddCategory3 = addCategory(linearLayout, "HUD", "Chọn bố cục và kích thước màn hình tập trung");
            addChoice(linearLayoutAddCategory3, "Hướng màn hình HUD", "hud_orientation", new int[]{0, 1, 2}, new String[]{"Tự động", "Nằm ngang", "Nằm dọc"}, 1);
            if (this.sp.getInt("hud_orientation", 1) == 2) {
                addPortraitGaugePicker(linearLayoutAddCategory3);
            } else {
                addHudLayoutPicker(linearLayoutAddCategory3);
            }
            addSlider(linearLayoutAddCategory3, "Cỡ đồng hồ (tốc độ / giới hạn / mũi tên)", "hud_size", 40, 160, 5, 100, "%", false, null, null);
            addSwitch(linearLayoutAddCategory3, "Mặc định lật gương (hắt kính)", "mirror", false);
            LinearLayout linearLayoutAddCategory4 = addCategory(linearLayout, "Bản đồ & hiển thị", "Các lớp thông tin hiển thị trực tiếp trên bản đồ Waze");
            addSwitch(linearLayoutAddCategory4, "Đồng hồ tốc độ nổi trên map (kéo để đặt vị trí)", CAT_FLOAT_SPEEDO, true);
            addSlider(linearLayoutAddCategory4, "Cỡ đồng hồ nổi", "fs_size", 80, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11, 10, 130, "%", false, null, null);
            addSwitch(linearLayoutAddCategory4, "Danh sách tốc độ và cảnh báo phía trước (kéo để đặt vị trí)", "upcoming_alerts", true);
            addChoice(linearLayoutAddCategory4, "Số cảnh báo hiển thị (màn hình dọc tối đa 2)", "upcoming_count", new int[]{1, 2, 3}, new String[]{"1 mục", "2 mục", "3 mục"}, 3);
            addSlider(linearLayoutAddCategory4, "Cỡ danh sách cảnh báo", "upcoming_size", 70, 160, 10, 100, "%", false, null, null);
            addSwitch(linearLayoutAddCategory4, "Hiển thị biển tốc độ tối thiểu trên cao tốc", "minimum_speed", false, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.13
                @Override // com.waze.gw.ModSettingsActivity.BoolCb
                public void on(boolean z) {
                    Gateway.onMinimumSpeedSettingChanged(z);
                }
            });
            addSwitch(linearLayoutAddCategory4, "Căn giữa bản đồ khi màn hình ngang", "center_landscape_map", true);
            addSwitch(linearLayoutAddCategory4, "Hiển thị đồng hồ tốc độ gốc Waze", "native_speedo_visible", true, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.14
                @Override // com.waze.gw.ModSettingsActivity.BoolCb
                public void on(boolean z) {
                    Gateway.refreshNativeSpeedoVisibility();
                }
            });
            addSwitch(linearLayoutAddCategory4, "Dùng màu chủ đạo cho số và km/h của đồng hồ gốc Waze", "float_speed_current_ambient", false, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.15
                @Override // com.waze.gw.ModSettingsActivity.BoolCb
                public void on(boolean z) {
                    Gateway.refreshNativeSpeedoTextColor();
                }
            });
            final NativeSpeedoPreview nativeSpeedoPreviewAddNativeSpeedoPreview = addNativeSpeedoPreview(linearLayoutAddCategory4);
            addSlider(linearLayoutAddCategory4, "Cỡ đồng hồ tốc độ gốc Waze", "native_speedo_size", 100, 200, 5, 100, "%", false, "Chỉ thay đổi đồng hồ tròn mặc định của Waze trên bản đồ", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.16
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    nativeSpeedoPreviewAddNativeSpeedoPreview.setSizePercent(this.this$0.sp.getInt("native_speedo_size", 100));
                    Gateway.refreshNativeSpeedoSize();
                }
            });
            final NavBannerPreview navBannerPreviewAddNavBannerPreview = addNavBannerPreview(linearLayoutAddCategory4);
            addSlider(linearLayoutAddCategory4, "Độ đục nền bảng chỉ dẫn", "nav_banner_opacity", 40, 100, 1, 78, "%", false, "100% là nền đen gốc; giảm để nhìn xuyên bản đồ", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.17
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    navBannerPreviewAddNavBannerPreview.syncFromPreferences();
                    Gateway.refreshNavBarOpacity();
                }
            });
            addSlider(linearLayoutAddCategory4, "Kích thước bảng chỉ dẫn", "nav_banner_size", 50, 100, 5, 100, "%", false, "Thu nhỏ cả mũi tên, khoảng cách, shield và tên đường", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.18
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    navBannerPreviewAddNavBannerPreview.syncFromPreferences();
                    Gateway.refreshNavBarAppearance();
                }
            });
            LinearLayout linearLayoutAddCategory5 = addCategory(linearLayout, "Bong bóng", "Thông tin nổi khi bạn chuyển sang ứng dụng khác");
            addSwitch(linearLayoutAddCategory5, "Bong bóng nổi trên app khác (tốc độ + cảnh báo)", CAT_BUBBLE, false, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.19
                @Override // com.waze.gw.ModSettingsActivity.BoolCb
                public void on(boolean z) {
                    if (z) {
                        if (!Bubble.canShow(ModSettingsActivity.this)) {
                            Bubble.requestPermission(ModSettingsActivity.this);
                        }
                        Bubble.installAutoHide(ModSettingsActivity.this.getApplicationContext());
                        Toast.makeText(ModSettingsActivity.this, "Bong bóng sẽ hiện khi bạn rời khỏi Waze", 1).show();
                        return;
                    }
                    Bubble.hide();
                    BubbleKeepAliveService.sync(ModSettingsActivity.this);
                }
            });
            addBubbleLayoutPicker(linearLayoutAddCategory5);
            addSlider(linearLayoutAddCategory5, "Cỡ bong bóng", "bub_size", 80, 200, 10, 100, "%", false, null, new Runnable() { // from class: com.waze.gw.ModSettingsActivity.20
                @Override // java.lang.Runnable
                public void run() {
                    Bubble.refresh();
                }
            });
            LinearLayout linearLayoutAddCategory6 = addCategory(linearLayout, "Android Auto", "Hiển thị tốc độ an toàn trên màn hình xe");
            addSwitch(linearLayoutAddCategory6, "Luôn hiện tên đường hiện tại khi chạy tự do", "aa_force_current_street", true);
            addChoice(linearLayoutAddCategory6, "Widget gợi ý điểm đến", "aa_suggest_widget_mode", new int[]{0, 1, 2, 3}, new String[]{"Luôn ẩn", "Ẩn sau 10 giây", "Ẩn sau 1 phút", "Mặc định Waze"}, 1);
            addSwitch(linearLayoutAddCategory6, "Đồng hồ giới hạn tốc độ trên Android Auto", "aa_float_speedo", false);
            addAaSpeedoLayoutPicker(linearLayoutAddCategory6);
            addSlider(linearLayoutAddCategory6, "Cỡ đồng hồ Android Auto", "aa_fs_size", 60, 180, 10, 100, "%", false, "Tự đặt ở góc trái và né phần chỉ dẫn của Android Auto", null);
            LinearLayout linearLayoutAddCategory7 = addCategory(linearLayout, "Cập nhật & dữ liệu bản đồ", "Phiên bản mod và thời điểm bản đồ Waze phát hành");
            addSwitch(linearLayoutAddCategory7, "Tự động kiểm tra khi mở app", "ota_auto", false, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.21
                @Override // com.waze.gw.ModSettingsActivity.BoolCb
                public void on(boolean z) {
                    Updater.onAutoSettingChanged(z);
                }
            });
            LinearLayout linearLayoutRow = row(linearLayoutAddCategory7, "Kiểm tra cập nhật");
            linearLayoutRow.setClickable(true);
            linearLayoutRow.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.22
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Updater.checkNow(ModSettingsActivity.this);
                }
            });
            addMapBuildStatus(linearLayoutAddCategory7);
            TextView textView3 = new TextView(this);
            textView3.setText("Waze Mod " + ModBuildInfo.versionLabel(this) + " by Chisadin - download tại https://wazemod.io.vn");
            textView3.setTextSize(13.0f);
            textView3.setTextColor(-9538439);
            textView3.setPadding(0, dp(18), 0, 0);
            linearLayout.addView(textView3);
            setContentView(scrollView);
            fetchMapBuildStatus();
            try {
                if (getIntent() == null || !getIntent().getBooleanExtra("ota_check", false)) {
                    return;
                }
                Updater.checkNow(this);
                return;
            } catch (Throwable th) {
                return;
            }
        }
        finish();
    }

    private LinearLayout buildCategoryMenu() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(dp(16), dp(16), dp(10), dp(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-15001314);
        gradientDrawable.setCornerRadius(dp(6));
        linearLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("‹");
        textView.setTextSize(38.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setGravity(17);
        textView.setContentDescription("Quay lại Waze");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModSettingsActivity.this.finish();
            }
        });
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(dp(40), dp(48)));
        TextView textView2 = new TextView(this);
        textView2.setText("Cài đặt Waze Mod");
        textView2.setTextSize(25.0f);
        textView2.setTextColor(COLOR_TEXT);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        ScrollView scrollView = new ScrollView(this);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        String[][] strArr = {new String[]{CAT_FLOAT_SPEEDO, "wz_ui_icon/icons-home.png", "Màn hình chính"}, new String[]{CAT_HUD, "wz_ui_icon/icons-floatSpeedo.png", "HUD"}, new String[]{CAT_BUBBLE, "wz_ui_icon/icons-settings.png", "Bong bóng nổi"}, new String[]{CAT_ALERTS, "wz_ui_icon/icons-warning.png", "Cảnh báo & giọng đọc"}, new String[]{CAT_GPS, "wz_ui_icon/icons-gps.png", "GPS & hiệu chỉnh"}, new String[]{"auto", "wz_ui_icon/icons-android_auto.png", "Android Auto"}, new String[]{CAT_DEVICE, "wz_ui_icon/icons-hud-link.png", "Kết nối với thiết bị"}, new String[]{CAT_MAP, "wz_ui_icon/icons-map.png", "Bản đồ & hiển thị"}, new String[]{CAT_UPDATES, "wz_ui_icon/icons-database.png", "Cập nhật & dữ liệu"}, new String[]{CAT_BLACK_BOX, "wz_ui_icon/icons-gps.png", "Hộp đen chuyến đi"}, new String[]{CAT_DIAGNOSTICS, "wz_ui_icon/icons-warning.png", "Chẩn đoán & xuất log"}};
        this.menuRows.clear();
        for (int i2 = 0; i2 < 11; i2++) {
            String[] strArr2 = strArr[i2];
            addMenuItem(linearLayout3, strArr2[0], strArr2[1], strArr2[2]);
        }
        scrollView.addView(linearLayout3, new FrameLayout.LayoutParams(-1, -2));
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        trackPageScroll(scrollView, SCROLL_PAGE_MENU);
        TextView textView3 = new TextView(this);
        textView3.setText("Waze Mod • " + ModBuildInfo.versionLabel(this));
        textView3.setTextSize(13.0f);
        textView3.setTextColor(COLOR_MUTED);
        textView3.setGravity(17);
        textView3.setPadding(0, dp(14), 0, dp(2));
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    private void addMenuItem(LinearLayout linearLayout, final String str, String str2, String str3) {
        final FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setPadding(dp(10), dp(8), dp(8), dp(8));
        frameLayout.setContentDescription(str3);
        ImageView imageView = new ImageView(this);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setPadding(dp(4), dp(4), dp(4), dp(4));
        boolean z = str2.endsWith("icons-home.png") || str2.endsWith("icons-hud-link.png");
        loadMenuIcon(imageView, str2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp(38), dp(42));
        layoutParams.gravity = 19;
        frameLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(this);
        textView.setText(str3);
        textView.setTextSize(17.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(16);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, dp(42));
        layoutParams2.leftMargin = dp(42);
        layoutParams2.rightMargin = dp(28);
        frameLayout.addView(textView, layoutParams2);
        TextView textView2 = new TextView(this);
        textView2.setText("›");
        textView2.setTextSize(30.0f);
        textView2.setGravity(17);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dp(28), dp(42));
        layoutParams3.gravity = 21;
        frameLayout.addView(textView2, layoutParams3);
        frameLayout.setTag(new Object[]{imageView, textView, textView2, Boolean.valueOf(z)});
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.24
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.openCategory(str);
            }
        });
        frameLayout.setOnHoverListener(new View.OnHoverListener(this) { // from class: com.waze.gw.ModSettingsActivity.25
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnHoverListener
            public boolean onHover(View view, MotionEvent motionEvent) {
                this.this$0.styleMenuItem(frameLayout, str.equals(this.this$0.selectedCategory), motionEvent.getActionMasked() != 10);
                return false;
            }
        });
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, dp(58));
        layoutParams4.topMargin = dp(2);
        linearLayout.addView(frameLayout, layoutParams4);
        this.menuRows.put(str, frameLayout);
        styleMenuItem(frameLayout, false);
    }

    private void styleMenuItem(FrameLayout frameLayout, boolean z) {
        styleMenuItem(frameLayout, z, frameLayout.isHovered());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void styleMenuItem(FrameLayout frameLayout, boolean z, boolean z2) {
        int i2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (z) {
            i2 = z2 ? -13556165 : -14213070;
        } else {
            i2 = z2 ? -14670802 : 1775902;
        }
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(dp(16));
        if (z) {
            gradientDrawable.setStroke(dp(1), z2 ? -5733377 : -8363777);
        } else if (z2) {
            gradientDrawable.setStroke(dp(1), -12827823);
        }
        frameLayout.setBackground(gradientDrawable);
        Object tag = frameLayout.getTag();
        if (tag instanceof Object[]) {
            Object[] objArr = (Object[]) tag;
            int i3 = COLOR_TEXT;
            int i4 = z ? -6524673 : z2 ? COLOR_ACCENT : COLOR_TEXT;
            boolean z3 = false;
            ImageView imageView = (ImageView) objArr[0];
            if (objArr.length > 3 && Boolean.TRUE.equals(objArr[3])) {
                z3 = true;
            }
            if (z3) {
                imageView.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
            } else {
                imageView.clearColorFilter();
            }
            imageView.setAlpha((z || z2) ? 1.0f : 0.88f);
            ((TextView) objArr[1]).setTextColor(z ? COLOR_TEXT : -1645592);
            TextView textView = (TextView) objArr[2];
            if (!z) {
                i3 = -2566948;
            }
            textView.setTextColor(i3);
        }
    }

    private void loadMenuIcon(ImageView imageView, String str) {
        Bitmap bitmapDecodeSampledAsset = decodeSampledAsset(str, 96);
        if (bitmapDecodeSampledAsset == null && !"wz_ui_icon/icons-fallback.png".equals(str)) {
            bitmapDecodeSampledAsset = decodeSampledAsset("wz_ui_icon/icons-fallback.png", 96);
        }
        if (bitmapDecodeSampledAsset != null) {
            imageView.setImageBitmap(bitmapDecodeSampledAsset);
        }
    }

    private Bitmap decodeSampledAsset(String str, int i2) {
        InputStream inputStreamOpen;
        InputStream inputStreamOpen2;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i3 = 1;
            options.inJustDecodeBounds = true;
            inputStreamOpen2 = getAssets().open(str);
            try {
                BitmapFactory.decodeStream(inputStreamOpen2, null, options);
                try {
                    inputStreamOpen2.close();
                } catch (Throwable th) {
                }
                while (true) {
                    int i4 = i3 * 2;
                    if (Math.max(options.outWidth, options.outHeight) / i4 < i2) {
                        break;
                    }
                    i3 = i4;
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i3;
                inputStreamOpen = getAssets().open(str);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th2) {
                        }
                    }
                    return bitmapDecodeStream;
                } catch (Throwable th3) {
                    inputStreamOpen2 = null;
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th4) {
                        }
                    }
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th5) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th6) {
                inputStreamOpen = null;
            }
        } catch (Throwable th7) {
            inputStreamOpen = null;
            inputStreamOpen2 = null;
        }
    }

    private void updateMenuSelection() {
        for (Map.Entry<String, FrameLayout> entry : this.menuRows.entrySet()) {
            styleMenuItem(entry.getValue(), entry.getKey().equals(this.selectedCategory));
        }
    }

    private static String categoryScrollKey(String str) {
        return "category:" + str;
    }

    private String categoryPageScrollKey(String str) {
        if (CAT_DEVICE.equals(str)) {
            return categoryScrollKey(str) + ":" + (hudLinkUiTab() == 1 ? "vietmap" : "hlp");
        }
        return categoryScrollKey(str);
    }

    private static String subpageScrollKey(String str) {
        return "subpage:" + str;
    }

    private void rememberActivePageScroll() {
        if (this.activePageScroll == null || this.activePageScrollKey == null) {
            return;
        }
        this.pageScrollPositions.put(this.activePageScrollKey, Integer.valueOf(Math.max(0, this.activePageScroll.getScrollY())));
    }

    private void trackPageScroll(final ScrollView scrollView, String str) {
        this.activePageScroll = scrollView;
        this.activePageScrollKey = str;
        final Integer num = this.pageScrollPositions.get(str);
        if (num == null || num.intValue() <= 0) {
            return;
        }
        scrollView.post(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.26
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (scrollView.getChildCount() == 0) {
                    return;
                }
                scrollView.scrollTo(0, Math.min(num.intValue(), Math.max(0, scrollView.getChildAt(0).getHeight() - scrollView.getHeight())));
            }
        });
    }

    private void showCategoryMenu() {
        rememberActivePageScroll();
        this.selectedCategory = null;
        if (this.narrowHost == null) {
            return;
        }
        this.narrowHost.removeAllViews();
        this.sideMenu = buildCategoryMenu();
        this.narrowHost.addView(this.sideMenu, new FrameLayout.LayoutParams(-1, -1));
    }

    private void showEmptyDetail() {
        if (this.detailHost == null) {
            return;
        }
        this.selectedCategory = null;
        updateMenuSelection();
        this.detailHost.removeAllViews();
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        TextView textView = new TextView(this);
        textView.setText("⚙");
        textView.setTextSize(64.0f);
        textView.setTextColor(-7647745);
        textView.setGravity(17);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, dp(86)));
        TextView textView2 = new TextView(this);
        textView2.setText("Chọn một nhóm tính năng của Waze Mod");
        textView2.setTextSize(18.0f);
        textView2.setTextColor(COLOR_TEXT);
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        this.detailHost.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openCategory(String str) {
        rememberActivePageScroll();
        this.gpsUiHandler.removeCallbacks(this.gpsUiTick);
        this.selectedCategory = str;
        this.selectedSubpage = null;
        ScrollView scrollViewBuildCategoryPage = buildCategoryPage(str);
        trackPageScroll(scrollViewBuildCategoryPage, categoryPageScrollKey(str));
        if (this.wideSettings) {
            updateMenuSelection();
            this.detailHost.removeAllViews();
            this.detailHost.addView(scrollViewBuildCategoryPage, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.narrowHost.removeAllViews();
            this.narrowHost.addView(scrollViewBuildCategoryPage, new FrameLayout.LayoutParams(-1, -1));
        }
        if (CAT_UPDATES.equals(str)) {
            fetchMapBuildStatus();
        }
    }

    private String categoryTitle(String str) {
        return CAT_HUD.equals(str) ? "HUD" : CAT_BUBBLE.equals(str) ? "Bong bóng nổi" : CAT_FLOAT_SPEEDO.equals(str) ? "Màn hình chính" : CAT_ALERTS.equals(str) ? "Cảnh báo & giọng đọc" : CAT_GPS.equals(str) ? "GPS & hiệu chỉnh" : "auto".equals(str) ? "Android Auto" : CAT_DEVICE.equals(str) ? "Kết nối với thiết bị" : CAT_MAP.equals(str) ? "Bản đồ & hiển thị" : CAT_BLACK_BOX.equals(str) ? "Hộp đen chuyến đi" : CAT_DIAGNOSTICS.equals(str) ? "Chẩn đoán & xuất log" : "Cập nhật & dữ liệu";
    }

    private String categorySubtitle(String str) {
        if (CAT_HUD.equals(str)) {
            return "Bố cục, kích thước và chế độ hắt kính";
        }
        if (CAT_BUBBLE.equals(str)) {
            return "Bố cục, kích thước và trạng thái bong bóng";
        }
        if (CAT_FLOAT_SPEEDO.equals(str)) {
            return "Đồng hồ nổi và các cảnh báo sắp xuất hiện";
        }
        if (CAT_ALERTS.equals(str)) {
            return "Quy tắc tốc độ, biển báo và âm thanh cảnh báo";
        }
        if (CAT_GPS.equals(str)) {
            return "Bù sai số tốc độ cho thiết bị";
        }
        if ("auto".equals(str)) {
            return "Hiển thị bổ sung trên màn hình Android Auto";
        }
        if (CAT_DEVICE.equals(str)) {
            return "Kết nối HUD WazeMod qua Bluetooth, Wi-Fi hoặc HUD VietMap";
        }
        if (CAT_MAP.equals(str)) {
            return "Vị trí bản đồ và cách hiển thị khi xoay ngang";
        }
        if (CAT_BLACK_BOX.equals(str)) {
            return "Lịch sử cục bộ, thống kê và GPX để tái hiện lỗi trên đường";
        }
        if (CAT_DIAGNOSTICS.equals(str)) {
            return "Đóng gói lỗi, log hệ thống và hoạt động mạng để gửi nhà phát triển";
        }
        return "Phiên bản mod, dữ liệu bản đồ và kiểm tra cập nhật";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCategoryPageBack() {
        if (!this.wideSettings) {
            showCategoryMenu();
        }
    }

    private ScrollView buildCategoryPage(String str) {
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        scrollView.setBackgroundColor(COLOR_BG);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(dp(18), dp(14), dp(18), dp(28));
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        if (!this.wideSettings) {
            TextView textView = new TextView(this);
            textView.setText("‹");
            textView.setTextSize(38.0f);
            textView.setTextColor(COLOR_TEXT);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.27
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ModSettingsActivity.this.onCategoryPageBack();
                }
            });
            linearLayout2.addView(textView, new LinearLayout.LayoutParams(dp(42), dp(48)));
        }
        TextView textView2 = new TextView(this);
        textView2.setText(categoryTitle(str));
        textView2.setTextSize(22.0f);
        textView2.setTextColor(COLOR_TEXT);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(this);
        textView3.setText(categorySubtitle(str));
        textView3.setTextSize(13.0f);
        textView3.setTextColor(COLOR_MUTED);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = this.wideSettings ? 0 : dp(42);
        layoutParams.topMargin = dp(1);
        layoutParams.bottomMargin = dp(12);
        linearLayout.addView(textView3, layoutParams);
        if (!CAT_HUD.equals(str)) {
            if (!CAT_BUBBLE.equals(str)) {
                if (!CAT_FLOAT_SPEEDO.equals(str)) {
                    if (!CAT_ALERTS.equals(str)) {
                        if (!CAT_GPS.equals(str)) {
                            if (!"auto".equals(str)) {
                                if (!CAT_DEVICE.equals(str)) {
                                    if (!CAT_MAP.equals(str)) {
                                        if (!CAT_UPDATES.equals(str)) {
                                            if (!CAT_BLACK_BOX.equals(str)) {
                                                if (CAT_DIAGNOSTICS.equals(str)) {
                                                    addDiagnosticsSettings(linearLayout);
                                                }
                                            } else {
                                                addTripBlackBoxSettings(linearLayout);
                                            }
                                        } else {
                                            addSection(linearLayout, "Cập nhật");
                                            addSwitch(linearLayout, "Tự động kiểm tra khi mở app", "ota_auto", false, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.40
                                                @Override // com.waze.gw.ModSettingsActivity.BoolCb
                                                public void on(boolean z) {
                                                    Updater.onAutoSettingChanged(z);
                                                }
                                            });
                                            LinearLayout linearLayoutRow = row(linearLayout, "Kiểm tra cập nhật");
                                            linearLayoutRow.setClickable(true);
                                            linearLayoutRow.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.41
                                                @Override // android.view.View.OnClickListener
                                                public void onClick(View view) {
                                                    Updater.checkNow(ModSettingsActivity.this);
                                                }
                                            });
                                            addMapBuildStatus(linearLayout);
                                            addModDatasetStatus(linearLayout);
                                        }
                                    } else {
                                        addSection(linearLayout, "Màu giao diện");
                                        addAmbientColorChoice(linearLayout);
                                        addSection(linearLayout, "Bản đồ");
                                        addSwitch(linearLayout, "Căn giữa bản đồ khi màn hình ngang", "center_landscape_map", true);
                                        addSwitch(linearLayout, "Hiển thị biển báo dữ liệu WME trên bản đồ", "map_point_notices", false);
                                        addSwitch(linearLayout, "Hiển thị đồng hồ tốc độ gốc Waze", "native_speedo_visible", true, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.35
                                            @Override // com.waze.gw.ModSettingsActivity.BoolCb
                                            public void on(boolean z) {
                                                Gateway.refreshNativeSpeedoVisibility();
                                            }
                                        });
                                        addSwitch(linearLayout, "Dùng màu chủ đạo cho số và km/h của đồng hồ gốc Waze", "float_speed_current_ambient", false, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.36
                                            @Override // com.waze.gw.ModSettingsActivity.BoolCb
                                            public void on(boolean z) {
                                                Gateway.refreshNativeSpeedoTextColor();
                                            }
                                        });
                                        final NativeSpeedoPreview nativeSpeedoPreviewAddNativeSpeedoPreview = addNativeSpeedoPreview(linearLayout);
                                        addSlider(linearLayout, "Cỡ đồng hồ tốc độ gốc Waze", "native_speedo_size", 100, 200, 5, 100, "%", false, "Chỉ thay đổi đồng hồ tròn mặc định của Waze trên bản đồ", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.37
                                            final /* synthetic */ ModSettingsActivity this$0;

                                            {
                                                this.this$0 = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                nativeSpeedoPreviewAddNativeSpeedoPreview.setSizePercent(this.this$0.sp.getInt("native_speedo_size", 100));
                                                Gateway.refreshNativeSpeedoSize();
                                            }
                                        });
                                        final NavBannerPreview navBannerPreviewAddNavBannerPreview = addNavBannerPreview(linearLayout);
                                        addSlider(linearLayout, "Độ đục nền bảng chỉ dẫn", "nav_banner_opacity", 40, 100, 1, 78, "%", false, "100% là nền đen gốc; giảm để nhìn xuyên bản đồ", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.38
                                            final /* synthetic */ ModSettingsActivity this$0;

                                            {
                                                this.this$0 = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                navBannerPreviewAddNavBannerPreview.syncFromPreferences();
                                                Gateway.refreshNavBarOpacity();
                                            }
                                        });
                                        addSlider(linearLayout, "Kích thước bảng chỉ dẫn", "nav_banner_size", 50, 100, 5, 100, "%", false, "Thu nhỏ cả mũi tên, khoảng cách, shield và tên đường", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.39
                                            final /* synthetic */ ModSettingsActivity this$0;

                                            {
                                                this.this$0 = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                navBannerPreviewAddNavBannerPreview.syncFromPreferences();
                                                Gateway.refreshNavBarAppearance();
                                            }
                                        });
                                    }
                                } else {
                                    addHudLinkTabs(linearLayout);
                                    if (hudLinkUiTab() == 1) {
                                        addVietMapHudSettings(linearLayout);
                                    } else {
                                        addHlpLinkSettings(linearLayout, hudLinkUiTab() == 2);
                                    }
                                }
                            } else {
                                addSection(linearLayout, "Android Auto");
                                addSwitch(linearLayout, "Luôn hiện tên đường hiện tại khi chạy tự do", "aa_force_current_street", true);
                                addChoice(linearLayout, "Widget gợi ý điểm đến", "aa_suggest_widget_mode", new int[]{0, 1, 2, 3}, new String[]{"Luôn ẩn", "Ẩn sau 10 giây", "Ẩn sau 1 phút", "Mặc định Waze"}, 1);
                                addSwitch(linearLayout, "Đồng hồ tốc độ trên Android Auto", "aa_float_speedo", false);
                                addAaSpeedoLayoutPicker(linearLayout);
                                addSlider(linearLayout, "Cỡ đồng hồ Android Auto", "aa_fs_size", 60, 180, 10, 100, "%", false, "Tính năng thử nghiệm", null);
                                addSwitch(linearLayout, "In đậm số tốc độ tối đa / tối thiểu", "aa_speed_sign_bold", true);
                            }
                        } else {
                            addGpsSettings(linearLayout);
                        }
                    } else {
                        addSection(linearLayout, "Cảnh báo tốc độ");
                        addChoice(linearLayout, "Ngưỡng vượt tốc", "over_margin", OVER_MARGIN_VALUES, OVER_MARGIN_LABELS, 0);
                        addChoice(linearLayout, "Lặp lại báo quá tốc độ", "over_repeat_mode", new int[]{1, 0}, new String[]{"Có lặp lại", "Chỉ báo 1 lần"}, 1);
                        addSwitch(linearLayout, "Giới hạn xe máy", "moto_cap", true);
                        addSwitch(linearLayout, "Hiển thị biển tốc độ tối thiểu trên cao tốc", "minimum_speed", false, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.33
                            @Override // com.waze.gw.ModSettingsActivity.BoolCb
                            public void on(boolean z) {
                                Gateway.onMinimumSpeedSettingChanged(z);
                            }
                        });
                        addChoice(linearLayout, "Cảnh báo thay đổi tốc độ phía trước", "speed_drop_read_mode", new int[]{0, 1}, new String[]{"Mặc định", "Luôn đọc"}, 0, new Runnable() { // from class: com.waze.gw.ModSettingsActivity.34
                            @Override // java.lang.Runnable
                            public void run() {
                                Toast.makeText(ModSettingsActivity.this, "Áp dụng sau khi khởi động lại Waze", 0).show();
                            }
                        });
                        addAudioSettings(linearLayout);
                    }
                } else {
                    addFloatSpeedoSettings(linearLayout);
                    addSection(linearLayout, "Phím tắt bản đồ");
                    addSwitch(linearLayout, "Hiện nút mở tuyến đường trong Google Maps", "google_maps_nav_button", false, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.29
                        @Override // com.waze.gw.ModSettingsActivity.BoolCb
                        public void on(boolean z) {
                            Gateway.refreshGoogleMapsButton();
                        }
                    });
                    addOverspeedEffectPicker(linearLayout, "map_overspeed_effect_mode", true);
                    addSection(linearLayout, "Danh sách cảnh báo phía trước");
                    addSwitch(linearLayout, "Hiển thị danh sách tốc độ và cảnh báo phía trước", "upcoming_alerts", true, new BoolCb(this) { // from class: com.waze.gw.ModSettingsActivity.30
                        final /* synthetic */ ModSettingsActivity this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // com.waze.gw.ModSettingsActivity.BoolCb
                        public void on(boolean z) {
                            this.this$0.updateUpcomingAlertPreview(upcomingAlertRailArr[0]);
                        }
                    });
                    final UpcomingAlertRail[] upcomingAlertRailArr = {addUpcomingAlertPreview(linearLayout)};
                    addChoice(linearLayout, "Số cảnh báo hiển thị (màn hình dọc tối đa 2)", "upcoming_count", new int[]{1, 2, 3}, new String[]{"1 mục", "2 mục", "3 mục"}, 3, new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.31
                        final /* synthetic */ ModSettingsActivity this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.this$0.updateUpcomingAlertPreview(upcomingAlertRailArr[0]);
                        }
                    });
                    addSlider(linearLayout, "Cỡ danh sách cảnh báo", "upcoming_size", 70, 160, 10, 100, "%", false, null, new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.32
                        final /* synthetic */ ModSettingsActivity this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.this$0.updateUpcomingAlertPreview(upcomingAlertRailArr[0]);
                        }
                    });
                }
            } else {
                addBubbleSettings(linearLayout);
            }
        } else {
            addSection(linearLayout, "Bố cục HUD");
            addChoice(linearLayout, "Hướng màn hình HUD", "hud_orientation", new int[]{0, 1, 2}, new String[]{"Tự động", "Nằm ngang", "Nằm dọc"}, 1, new Runnable() { // from class: com.waze.gw.ModSettingsActivity.28
                @Override // java.lang.Runnable
                public void run() {
                    ModSettingsActivity.this.openCategory(ModSettingsActivity.CAT_HUD);
                }
            });
            if (this.sp.getInt("hud_orientation", 1) == 2) {
                addPortraitGaugePicker(linearLayout);
            } else {
                addHudLayoutPicker(linearLayout);
            }
            addSlider(linearLayout, "Cỡ đồng hồ (tốc độ / giới hạn / mũi tên)", "hud_size", 40, 160, 5, 100, "%", false, null, null);
            addSwitch(linearLayout, "Mặc định lật gương (hắt kính)", "mirror", false);
            addOverspeedEffectPicker(linearLayout, "hud_overspeed_effect_mode", false);
        }
        return scrollView;
    }

    private void addTripBlackBoxSettings(LinearLayout linearLayout) {
        addSection(linearLayout, "Ghi hành trình");
        addSwitch(linearLayout, "Lưu hộp đen chuyến đi", "trip_blackbox_enabled", true, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.42
            @Override // com.waze.gw.ModSettingsActivity.BoolCb
            public void on(boolean z) {
                TripBlackBox.onEnabledChanged(ModSettingsActivity.this, z);
                Toast.makeText(ModSettingsActivity.this, z ? "Đã bật ghi chuyến đi mới" : "Đã dừng ghi; lịch sử cũ vẫn được giữ", 0).show();
            }
        });
        addInfoCard(linearLayout, "Lưu cục bộ · tối đa 10 chuyến", "Dữ liệu chỉ nằm trong bộ nhớ riêng của Waze Mod. Chuyến cũ nhất tự xoá khi có chuyến thứ 11. Tắt tính năng sẽ dừng ghi nhưng không xoá lịch sử.");
        addInfoCard(linearLayout, "Số liệu của hộp đen", "Mỗi chuyến có quãng đường, thời lượng, tốc độ trung bình khi xe di chuyển, tốc độ cao nhất và số lần bắt đầu vượt giới hạn tốc độ.");
        addSection(linearLayout, "10 chuyến gần nhất");
        List<TripBlackBox.TripSummary> listListTrips = TripBlackBox.listTrips(this);
        if (listListTrips.isEmpty()) {
            addInfoCard(linearLayout, "Chưa có chuyến đi", "Hộp đen bắt đầu một chuyến khi xe thực sự di chuyển. Dữ liệu đứng yên được lấy thưa hơn để giảm dung lượng.");
            return;
        }
        int i2 = 0;
        while (i2 < listListTrips.size()) {
            TripBlackBox.TripSummary tripSummary = listListTrips.get(i2);
            i2++;
            addTripSummaryCard(linearLayout, tripSummary, i2);
        }
    }

    private void addTripSummaryCard(LinearLayout linearLayout, final TripBlackBox.TripSummary tripSummary, int i2) {
        char c2;
        char c3;
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(16), dp(14), dp(16), dp(14));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(16));
        gradientDrawable.setStroke(dp(1), tripSummary.active ? COLOR_ACCENT : COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        enableLiftHover(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("#" + i2 + " · " + tripDateLabel(tripSummary.startMs));
        textView.setTextSize(17.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (tripSummary.active) {
            TextView textView2 = new TextView(this);
            textView2.setText("ĐANG GHI");
            textView2.setTextSize(11.0f);
            textView2.setTextColor(-1);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            textView2.setGravity(17);
            c2 = 0;
            c3 = 1;
            textView2.setPadding(dp(10), dp(5), dp(10), dp(5));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(COLOR_ACCENT);
            gradientDrawable2.setCornerRadius(dp(20));
            textView2.setBackground(gradientDrawable2);
            linearLayout3.addView(textView2);
        } else {
            c2 = 0;
            c3 = 1;
        }
        linearLayout2.addView(linearLayout3);
        TextView textView3 = new TextView(this);
        Locale locale = Locale.getDefault();
        Double dValueOf = Double.valueOf(tripSummary.distanceM / 1000.0d);
        String strTripDurationLabel = tripDurationLabel(tripSummary.startMs, tripSummary.endMs);
        Object[] objArr = new Object[2];
        objArr[c2] = dValueOf;
        objArr[c3] = strTripDurationLabel;
        textView3.setText(String.format(locale, "%.1f km  ·  %s", objArr));
        textView3.setTextSize(18.0f);
        textView3.setTextColor(COLOR_TEXT);
        textView3.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(10);
        linearLayout2.addView(textView3, layoutParams);
        TextView textView4 = new TextView(this);
        Locale locale2 = Locale.getDefault();
        Double dValueOf2 = Double.valueOf(tripSummary.averageSpeedKmh);
        Integer numValueOf = Integer.valueOf(tripSummary.maxSpeedKmh);
        Integer numValueOf2 = Integer.valueOf(tripSummary.overspeedCount);
        Integer numValueOf3 = Integer.valueOf(tripSummary.pointCount);
        Object[] objArr2 = new Object[4];
        objArr2[c2] = dValueOf2;
        objArr2[c3] = numValueOf;
        objArr2[2] = numValueOf2;
        objArr2[3] = numValueOf3;
        textView4.setText(String.format(locale2, "Trung bình %.0f km/h  ·  Cao nhất %d km/h\nVượt tốc %d lần  ·  %,d điểm GPS", objArr2));
        textView4.setTextSize(14.0f);
        textView4.setTextColor(COLOR_MUTED);
        textView4.setLineSpacing(dp(3), 1.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(5);
        linearLayout2.addView(textView4, layoutParams2);
        TextView textView5 = new TextView(this);
        textView5.setText("Xuất GPX kèm tốc độ");
        textView5.setTextSize(15.0f);
        textView5.setTextColor(COLOR_ACCENT);
        textView5.setTypeface(Typeface.DEFAULT_BOLD);
        textView5.setGravity(17);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(COLOR_PANEL);
        gradientDrawable3.setCornerRadius(dp(13));
        gradientDrawable3.setStroke(dp(1), COLOR_ACCENT);
        textView5.setBackground(gradientDrawable3);
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.43
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.showTripExportWarning(tripSummary);
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, dp(48));
        layoutParams3.topMargin = dp(12);
        linearLayout2.addView(textView5, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = dp(9);
        linearLayout.addView(linearLayout2, layoutParams4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTripExportWarning(final TripBlackBox.TripSummary tripSummary) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        LinearLayout linearLayoutCreateAmbientSheet = createAmbientSheet("Chia sẻ hộp đen chuyến đi", "GPX chứa tọa độ theo thời gian, tốc độ và dữ liệu đường để nhà phát triển có thể tái hiện lỗi.");
        TextView textView = new TextView(this);
        textView.setText("Bạn sắp chia sẻ dữ liệu di chuyển vào " + tripDateLabel(tripSummary.startMs) + ", Khoảng cách " + String.format(Locale.getDefault(), "%.1f km", Double.valueOf(tripSummary.distanceM / 1000.0d)) + ". Bạn có chắc muốn xuất? Hãy đảm bảo bạn tin tưởng người sắp chia sẻ file này.");
        textView.setTextColor(-30070);
        textView.setTextSize(15.0f);
        textView.setLineSpacing(dp(4), 1.0f);
        textView.setPadding(dp(5), dp(2), dp(5), dp(16));
        linearLayoutCreateAmbientSheet.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        TextView textViewTripExportButton = tripExportButton("Hủy bỏ", COLOR_TEXT, COLOR_CONTROL, COLOR_BORDER);
        textViewTripExportButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.44
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        TextView textViewTripExportButton2 = tripExportButton("Tôi hiểu, xuất GPX", -1, -2937041, -38037);
        textViewTripExportButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.45
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dialog.dismiss();
                this.this$0.beginTripGpxExport(tripSummary);
            }
        });
        linearLayout.addView(textViewTripExportButton, new LinearLayout.LayoutParams(0, dp(54), 1.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, dp(54), 1.0f);
        layoutParams.leftMargin = dp(10);
        linearLayout.addView(textViewTripExportButton2, layoutParams);
        linearLayoutCreateAmbientSheet.addView(linearLayout);
        showBottomSheet(dialog, linearLayoutCreateAmbientSheet, dp(620));
    }

    private TextView tripExportButton(String str, int i2, int i3, int i4) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(i2);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i3);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), i4);
        textView.setBackground(gradientDrawable);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void beginTripGpxExport(TripBlackBox.TripSummary tripSummary) {
        this.pendingTripExportId = tripSummary.id;
        this.sp.edit().putLong("pending_trip_export_id", tripSummary.id).apply();
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/gpx+xml");
        intent.putExtra("android.intent.extra.TITLE", "WazeMod_trip_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date(tripSummary.startMs)) + ".gpx");
        try {
            startActivityForResult(intent, REQUEST_EXPORT_TRIP_GPX);
        } catch (Throwable th) {
            this.pendingTripExportId = -1L;
            this.sp.edit().remove("pending_trip_export_id").apply();
            Toast.makeText(this, "Thiết bị không có trình chọn nơi lưu file", 1).show();
        }
    }

    private String tripDateLabel(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm, dd/MM/yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        return simpleDateFormat.format(new Date(j2));
    }

    private String tripDurationLabel(long j2, long j3) {
        long jMax = Math.max(0L, j3 - j2) / 60000;
        long j4 = jMax / 60;
        long j5 = jMax % 60;
        if (j4 > 0) {
            return j4 + " giờ " + j5 + " phút";
        }
        return Math.max(1L, j5) + " phút";
    }

    private void addDiagnosticsSettings(LinearLayout linearLayout) {
        addSection(linearLayout, "Trạng thái ghi log");
        addInfoCard(linearLayout, "Logger Waze Mod", DiagnosticsLogger.summary(this));
        addInfoCard(linearLayout, "Quyền riêng tư", "Không lưu nội dung request/response, query, cookie, token hoặc mật khẩu. Mục Tất cả chỉ kèm metadata tên, kích thước và thời gian file; không chép database hay dữ liệu tài khoản vào báo cáo.");
        addSection(linearLayout, "Chọn báo cáo cần xuất");
        addDiagnosticsAction(linearLayout, "Xuất lỗi", "Crash Java, dấu hiệu native crash/ANR được trích từ logcat", 1);
        addDiagnosticsAction(linearLayout, "Xuất logcat", "Log của riêng tiến trình Waze Mod từ lúc app khởi động", 2);
        addDiagnosticsAction(linearLayout, "Xuất log mạng", "Kết nối, endpoint đã bỏ query, HTTP status, dung lượng và thời gian", 3);
        addDiagnosticsAction(linearLayout, "Xuất tất cả (khuyên dùng)", "Lỗi + logcat + mạng + hoạt động file và inventory metadata", 4);
    }

    private void addDiagnosticsAction(LinearLayout linearLayout, String str, String str2, final int i2) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(dp(15), dp(13), dp(13), dp(13));
        styleControlHover(linearLayout2, false);
        enableControlHover(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(17.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText(str2);
        textView2.setTextSize(13.0f);
        textView2.setTextColor(COLOR_MUTED);
        textView2.setPadding(0, dp(3), 0, 0);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView3 = new TextView(this);
        textView3.setText("⇩");
        textView3.setTextSize(25.0f);
        textView3.setTextColor(COLOR_ACCENT);
        textView3.setGravity(17);
        linearLayout2.addView(textView3, new LinearLayout.LayoutParams(dp(42), dp(46)));
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.46
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.beginDiagnosticsExport(i2);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void beginDiagnosticsExport(int i2) {
        String str;
        this.pendingDiagnosticsExport = i2;
        if (i2 == 1) {
            str = "errors";
        } else if (i2 == 2) {
            str = "logcat";
        } else {
            str = i2 == 3 ? "network" : TtmlNode.COMBINE_ALL;
        }
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/zip");
        intent.putExtra("android.intent.extra.TITLE", "WazeMod_" + str + "_" + str2 + ".zip");
        try {
            startActivityForResult(intent, REQUEST_EXPORT_DIAGNOSTICS);
        } catch (Throwable th) {
            Toast.makeText(this, "Thiết bị không có trình chọn nơi lưu file", 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hudLinkUiTab() {
        int i2 = this.sp.getInt(PREF_HUD_LINK_UI_TAB, 0);
        if (i2 == 2) {
            return 2;
        }
        return (i2 == 1 && HudFeatureFlags.vietMapTabVisible()) ? 1 : 0;
    }

    private void addHudLinkTabs(LinearLayout linearLayout) {
        int iHudLinkUiTab = hudLinkUiTab();
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(4), dp(4), dp(4), dp(4));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(COLOR_PANEL);
        gradientDrawable.setCornerRadius(dp(17));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        linearLayout2.addView(hudLinkTab("HUD WazeMod", 0, iHudLinkUiTab == 0), hudLinkTabLayout(false));
        if (HudFeatureFlags.vietMapTabVisible()) {
            linearLayout2.addView(hudLinkTab("HUD VietMap", 1, iHudLinkUiTab == 1), hudLinkTabLayout(true));
        }
        linearLayout2.addView(hudLinkTab("HUD WazeMod (Wi-Fi)", 2, iHudLinkUiTab == 2), hudLinkTabLayout(true));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(2);
        layoutParams.bottomMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
    }

    private LinearLayout.LayoutParams hudLinkTabLayout(boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dp(50));
        if (z) {
            layoutParams.topMargin = dp(5);
        }
        return layoutParams;
    }

    private TextView hudLinkTab(String str, final int i2, boolean z) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(z ? -1 : COLOR_MUTED);
        textView.setGravity(17);
        textView.setSelected(z);
        textView.setContentDescription(str + (z ? ", đang chọn" : ""));
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i3 = 0;
        gradientDrawable.setShape(0);
        if (z) {
            i3 = (COLOR_ACCENT & ViewCompat.MEASURED_SIZE_MASK) | 805306368;
        }
        gradientDrawable.setColor(i3);
        gradientDrawable.setCornerRadius(dp(14));
        if (z) {
            gradientDrawable.setStroke(dp(1), COLOR_ACCENT);
        }
        textView.setBackground(gradientDrawable);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.47
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.this$0.hudLinkUiTab() == i2) {
                    return;
                }
                this.this$0.sp.edit().putInt(ModSettingsActivity.PREF_HUD_LINK_UI_TAB, i2).apply();
                this.this$0.openCategory(ModSettingsActivity.CAT_DEVICE);
            }
        });
        return textView;
    }

    private void addHlpLinkSettings(LinearLayout linearLayout, final boolean z) {
        String str;
        int i2 = this.sp.getInt("hud_link_transport", 0);
        final int i3 = (z || i2 != 3) ? i2 : 0;
        addSection(linearLayout, "Thiết bị HLP/1");
        String str2 = z ? "HUD WazeMod qua Wi-Fi • THỬ NGHIỆM" : "HUD WazeMod qua Bluetooth";
        if (z) {
            str = "Điện thoại và ESP32 phải cùng mạng Wi-Fi, hoặc ESP32 kết nối hotspot của điện thoại. WazeMod là WebSocket client; HUD là server.";
        } else {
            str = "Kết nối ESP32, HC-05/HC-06 bằng Bluetooth Classic SPP hoặc thiết bị BLE GATT.";
        }
        addInfoCard(linearLayout, str2, str);
        LinearLayout linearLayoutRow = row(linearLayout, "Bật HUD WazeMod");
        Switch r5 = new Switch(this);
        r5.setChecked(this.sp.getBoolean("hud_link", false) && (!z ? i2 == 3 : i2 != 3));
        r5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.waze.gw.ModSettingsActivity.48
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                if (!z2) {
                    this.this$0.sp.edit().putBoolean("hud_link", false).apply();
                    HudDeviceRepository hudDeviceRepository = new HudDeviceRepository(this.this$0);
                    if (hudDeviceRepository.isVietMapEnabled()) {
                        hudDeviceRepository.setActiveFamily(hudDeviceRepository.vietMapFamily());
                        HudLinkService.reconfigure(this.this$0);
                        return;
                    } else {
                        HudLink.stop(this.this$0);
                        return;
                    }
                }
                if (!z && !this.this$0.hasHudPermissions()) {
                    this.this$0.pendingHudEnable = true;
                    compoundButton.setChecked(false);
                    this.this$0.requestHudPermissions();
                } else if (z && this.this$0.sp.getString("hud_link_ws_host", "").trim().length() == 0) {
                    compoundButton.setChecked(false);
                    Toast.makeText(this.this$0, "Hãy nhập địa chỉ IP của HUD trước", 0).show();
                } else if (!z && this.this$0.sp.getString("hud_link_device_address", "").length() == 0) {
                    this.this$0.pendingHudEnable = true;
                    compoundButton.setChecked(false);
                    this.this$0.openHudPicker(true);
                } else {
                    new HudDeviceRepository(this.this$0).setActiveFamily(HudProtocolFamily.HLP1);
                    this.this$0.sp.edit().putInt("hud_link_transport", z ? 3 : i3).putBoolean("hud_link", true).apply();
                    HudLinkService.startFromUser(this.this$0);
                }
            }
        });
        linearLayoutRow.addView(r5, new LinearLayout.LayoutParams(-2, -2));
        if (!z) {
            addChoice(linearLayout, "Transport", "hud_link_transport", new int[]{0, 1, 2}, new String[]{"Tự động", "Bluetooth Classic SPP", "Bluetooth LE GATT"}, 0, new Runnable() { // from class: com.waze.gw.ModSettingsActivity.49
                @Override // java.lang.Runnable
                public void run() {
                    if (ModSettingsActivity.this.sp.getBoolean("hud_link", false)) {
                        HudLinkService.reconfigure(ModSettingsActivity.this);
                    }
                }
            });
        }
        if (z) {
            addHudWebSocketSettings(linearLayout);
        } else {
            LinearLayout linearLayoutRow2 = row(linearLayout, "Chọn thiết bị");
            linearLayoutRow2.setClickable(true);
            linearLayoutRow2.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.50
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ModSettingsActivity.this.openHudPicker(false);
                }
            });
            TextView textView = new TextView(this);
            textView.setTextColor(COLOR_ACCENT);
            textView.setTextSize(14.0f);
            String string = this.sp.getString("hud_link_device_name", "");
            String string2 = this.sp.getString("hud_link_device_address", "");
            if (string.length() <= 0) {
                string = string2.length() > 0 ? string2 : "Chưa chọn";
            }
            textView.setText(string);
            linearLayoutRow2.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        LinearLayout linearLayoutRow3 = row(linearLayout, "Trạng thái");
        this.hudLinkStatus = new TextView(this);
        this.hudLinkStatus.setTextColor(COLOR_ACCENT);
        this.hudLinkStatus.setTextSize(14.0f);
        refreshHudLinkStatus();
        linearLayoutRow3.addView(this.hudLinkStatus, new LinearLayout.LayoutParams(-2, -2));
        final TextView textView2 = new TextView(this);
        this.hudLinkActionButton = textView2;
        textView2.setText(hudLinkActionLabel(this.sp.getString("hud_link_status", "DISABLED")));
        textView2.setTextSize(16.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setClickable(true);
        textView2.setFocusable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_ACCENT);
        gradientDrawable.setCornerRadius(dp(15));
        textView2.setBackground(gradientDrawable);
        enableLiftHover(textView2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dp(52));
        layoutParams.topMargin = dp(12);
        layoutParams.bottomMargin = dp(8);
        linearLayout.addView(textView2, layoutParams);
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.51
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if ("CONNECTED".equals(this.this$0.sp.getString("hud_link_status", "DISABLED"))) {
                    this.this$0.sp.edit().putBoolean("hud_link", false).apply();
                    HudLink.stop(this.this$0);
                    textView2.setText("Kết nối");
                } else {
                    if (!z && !this.this$0.hasHudPermissions()) {
                        this.this$0.requestHudPermissions();
                        return;
                    }
                    if (z && this.this$0.sp.getString("hud_link_ws_host", "").trim().length() == 0) {
                        Toast.makeText(this.this$0, "Hãy nhập địa chỉ IP của HUD trước", 0).show();
                        return;
                    }
                    this.this$0.sp.edit().putInt("hud_link_transport", z ? 3 : i3).putBoolean("hud_link", true).apply();
                    new HudDeviceRepository(this.this$0).setActiveFamily(HudProtocolFamily.HLP1);
                    HudLinkService.startFromUser(this.this$0);
                    this.this$0.sendBroadcast(new Intent("com.waze.gw.HUD_LINK_RETRY").setPackage(this.this$0.getPackageName()));
                }
            }
        });
        LinearLayout linearLayoutRow4 = row(linearLayout, z ? "Xoá cấu hình Wi-Fi HUD" : "Quên thiết bị đã chọn");
        linearLayoutRow4.setClickable(true);
        linearLayoutRow4.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.52
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (z) {
                    this.this$0.sp.edit().remove("hud_link_ws_host").remove("hud_link_ws_port").remove("hud_link_ws_path").apply();
                } else {
                    new HudDeviceRepository(this.this$0).forget();
                }
                this.this$0.sp.edit().putBoolean("hud_link", false).apply();
                HudLink.stop(this.this$0);
            }
        });
        addSwitch(linearLayout, "Bật log payload (chỉ dùng khi debug)", "hud_link_log", false);
        this.hudDeviceConfigHost = new LinearLayout(this);
        this.hudDeviceConfigHost.setOrientation(1);
        linearLayout.addView(this.hudDeviceConfigHost, new LinearLayout.LayoutParams(-1, -2));
        renderHudDeviceConfig();
    }

    private void addHudWebSocketSettings(LinearLayout linearLayout) {
        addHudWebSocketField(linearLayout, "Địa chỉ IP / hostname HUD", "hud_link_ws_host", "192.168.43.27", false);
        addHudWebSocketField(linearLayout, "Cổng WebSocket", "hud_link_ws_port", String.valueOf(8765), true);
        addHudWebSocketField(linearLayout, "Đường dẫn WebSocket", "hud_link_ws_path", "/hlp", false);
        addInfoCard(linearLayout, "Hai mô hình mạng được hỗ trợ", "1. Điện thoại và ESP32 cùng kết nối một router/hotspot.\n2. Điện thoại phát hotspot và ESP32 kết nối vào hotspot đó.\nKhông nên kết nối điện thoại vào SoftAP của ESP32 vì Waze có thể mất Internet.");
    }

    private void addHudWebSocketField(LinearLayout linearLayout, String str, final String str2, String str3, final boolean z) {
        String string;
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(14), dp(10), dp(14), dp(10));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(COLOR_TEXT);
        textView.setTextSize(15.0f);
        linearLayout2.addView(textView);
        EditText editText = new EditText(this);
        editText.setSingleLine(true);
        editText.setTextColor(COLOR_TEXT);
        editText.setHintTextColor(COLOR_MUTED);
        editText.setTextSize(15.0f);
        editText.setPadding(dp(11), dp(7), dp(11), dp(7));
        editText.setHint(str3);
        if (z) {
            string = String.valueOf(this.sp.getInt(str2, Integer.parseInt(str3)));
        } else {
            string = this.sp.getString(str2, str3);
        }
        editText.setText(string);
        editText.setInputType(z ? 2 : 17);
        editText.addTextChangedListener(new TextWatcher(this) { // from class: com.waze.gw.ModSettingsActivity.53
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                int i5;
                String strTrim = charSequence == null ? "" : charSequence.toString().trim();
                SharedPreferences.Editor editorEdit = this.this$0.sp.edit();
                if (z) {
                    try {
                        i5 = Integer.parseInt(strTrim);
                    } catch (Throwable th) {
                        i5 = 8765;
                    }
                    editorEdit.putInt(str2, i5);
                } else {
                    editorEdit.putString(str2, strTrim);
                }
                editorEdit.apply();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }
        });
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-15657957);
        gradientDrawable2.setCornerRadius(dp(10));
        gradientDrawable2.setStroke(dp(1), COLOR_BORDER);
        editText.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(7);
        linearLayout2.addView(editText, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams2);
    }

    private void addVietMapHudSettings(LinearLayout linearLayout) {
        String str;
        this.hudDeviceConfigHost = null;
        this.hudLinkStatus = null;
        this.hudLinkActionButton = null;
        addSection(linearLayout, "Tích hợp HUD VietMap");
        addInfoCard(linearLayout, "Kênh kết nối độc lập", "HUD VietMap dùng protocol nhị phân riêng, không dùng HLP/1 của ESP32, HC-05 hoặc HC-06. Thiết bị HLP đã lưu sẽ không bị thay đổi.");
        addHudIntegrationStatus(linearLayout, "HUD H50", "EXPERIMENTAL", true);
        boolean z = false;
        addHudIntegrationStatus(linearLayout, "HUD H1 / H1N / H1AS / H2AS / H1X", "CHỜ KIỂM THỬ THIẾT BỊ", false);
        final HudDeviceRepository hudDeviceRepository = new HudDeviceRepository(this);
        LinearLayout linearLayoutRow = row(linearLayout, "Chọn HUD VietMap");
        linearLayoutRow.setClickable(true);
        linearLayoutRow.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.54
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModSettingsActivity.this.openVietMapHudPicker();
            }
        });
        TextView textView = new TextView(this);
        textView.setTextColor(COLOR_ACCENT);
        textView.setTextSize(14.0f);
        String strVietMapName = hudDeviceRepository.vietMapName();
        String strVietMapAddress = hudDeviceRepository.vietMapAddress();
        if (strVietMapName.length() <= 0) {
            strVietMapName = strVietMapAddress.length() > 0 ? strVietMapAddress : "Chưa chọn";
        }
        textView.setText(strVietMapName);
        linearLayoutRow.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        String strPreferenceValue = hudDeviceRepository.vietMapFamily().preferenceValue();
        LinearLayout linearLayoutRow2 = row(linearLayout, "Protocol đã nhận diện");
        TextView textView2 = new TextView(this);
        textView2.setTextColor(COLOR_ACCENT);
        textView2.setTextSize(14.0f);
        if ("vietmap_h50".equals(strPreferenceValue)) {
            str = "VietMap H50";
        } else {
            str = "vietmap_h1".equals(strPreferenceValue) ? "VietMap H1 / DJBT" : "Tự động";
        }
        textView2.setText(str);
        linearLayoutRow2.addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        if (HudFeatureFlags.h50RuntimeEnabled()) {
            LinearLayout linearLayoutRow3 = row(linearLayout, "Bật HUD VietMap H50");
            Switch r4 = new Switch(this);
            if ((hudDeviceRepository.vietMapFamily() == HudProtocolFamily.VIETMAP_H50) && hudDeviceRepository.isVietMapEnabled()) {
                z = true;
            }
            r4.setChecked(z);
            r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.waze.gw.ModSettingsActivity.55
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    HudDeviceRepository hudDeviceRepository2 = new HudDeviceRepository(ModSettingsActivity.this);
                    if (!z2) {
                        hudDeviceRepository2.setVietMapEnabled(false);
                        if (hudDeviceRepository2.activeFamily() == HudProtocolFamily.VIETMAP_H50) {
                            hudDeviceRepository2.setActiveFamily(HudProtocolFamily.HLP1);
                        }
                        if (ModSettingsActivity.this.sp.getBoolean("hud_link", false)) {
                            HudLinkService.reconfigure(ModSettingsActivity.this);
                            return;
                        } else {
                            HudLink.stop(ModSettingsActivity.this);
                            return;
                        }
                    }
                    if (!ModSettingsActivity.this.hasHudPermissions()) {
                        compoundButton.setChecked(false);
                        ModSettingsActivity.this.pendingHudEnable = false;
                        ModSettingsActivity.this.pendingHudPicker = true;
                        ModSettingsActivity.this.pendingHudPickerProfile = "vietmap";
                        ModSettingsActivity.this.requestHudPermissions();
                        return;
                    }
                    if (hudDeviceRepository2.vietMapAddress().length() == 0) {
                        compoundButton.setChecked(false);
                        Toast.makeText(ModSettingsActivity.this, "Hãy chọn HUD VietMap H50 trước", 0).show();
                        ModSettingsActivity.this.openVietMapHudPicker();
                    } else if (hudDeviceRepository2.vietMapFamily() != HudProtocolFamily.VIETMAP_H50) {
                        compoundButton.setChecked(false);
                        Toast.makeText(ModSettingsActivity.this, "Chỉ H50 đang hỗ trợ thử nghiệm; H1 vẫn chờ kiểm thử", 1).show();
                    } else {
                        hudDeviceRepository2.setActiveFamily(HudProtocolFamily.VIETMAP_H50);
                        hudDeviceRepository2.setVietMapEnabled(true);
                        HudLinkService.startFromUser(ModSettingsActivity.this);
                    }
                }
            });
            linearLayoutRow3.addView(r4, new LinearLayout.LayoutParams(-2, -2));
        }
        if (strVietMapAddress.length() > 0) {
            LinearLayout linearLayoutRow4 = row(linearLayout, "Quên HUD VietMap đã chọn");
            linearLayoutRow4.setClickable(true);
            linearLayoutRow4.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.56
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    hudDeviceRepository.forgetVietMap();
                    this.this$0.openCategory(ModSettingsActivity.CAT_DEVICE);
                }
            });
        }
        addInfoCard(linearLayout, "Experimental · chỉ dành cho H50", "H50 đã có handshake, codec và reconnect path để kiểm thử Developer Build. Không dùng khi lái xe cần độ ổn định; H1 vẫn chưa được bật.");
        addInfoCard(linearLayout, "Giới hạn H50 đã biết", "VietMap Live không truyền tốc độ xe hiện tại hoặc tốc độ tối thiểu trong các field H50 đã xác minh. Waze Mod sẽ không ghi dữ liệu vào field chưa rõ ý nghĩa.");
    }

    private void addHudIntegrationStatus(LinearLayout linearLayout, String str, String str2, boolean z) {
        int i2;
        LinearLayout linearLayoutRow = row(linearLayout, str);
        TextView textView = new TextView(this);
        textView.setText(str2);
        textView.setTextSize(11.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        if ("EXPERIMENTAL".equals(str2)) {
            i2 = -11155457;
        } else {
            i2 = z ? -10102878 : -20132;
        }
        textView.setTextColor(i2);
        textView.setGravity(21);
        textView.setContentDescription(str + ": " + str2.toLowerCase(Locale.getDefault()));
        linearLayoutRow.addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderHudDeviceConfig() {
        LinearLayout linearLayout = this.hudDeviceConfigHost;
        if (linearLayout == null) {
            return;
        }
        HudDeviceConfig.Snapshot snapshot = HudDeviceConfig.snapshot();
        HudDeviceConfig.Schema schema = snapshot.schema;
        linearLayout.removeAllViews();
        if (schema == null || schema.items.isEmpty()) {
            linearLayout.setVisibility(8);
            this.hudDeviceConfigDraft.clear();
            this.hudDeviceConfigRevision = -1L;
            this.hudDeviceConfigGeneration = snapshot.generation;
            this.hudDeviceConfigDirty = false;
            return;
        }
        linearLayout.setVisibility(0);
        boolean z = this.hudDeviceConfigGeneration != snapshot.generation;
        if (this.hudDeviceConfigRevision != schema.revision || ((z && "applied".equals(snapshot.applyState)) || (z && !this.hudDeviceConfigDirty))) {
            this.hudDeviceConfigDraft.clear();
            for (HudDeviceConfig.Item item : schema.items) {
                this.hudDeviceConfigDraft.put(item.id, item.value);
            }
            this.hudDeviceConfigRevision = schema.revision;
            this.hudDeviceConfigDirty = false;
        }
        this.hudDeviceConfigGeneration = snapshot.generation;
        addSection(linearLayout, schema.title);
        Iterator<HudDeviceConfig.Item> it = schema.items.iterator();
        while (it.hasNext()) {
            addHudDeviceConfigItem(linearLayout, it.next());
        }
        if (snapshot.message.length() > 0) {
            TextView textView = new TextView(this);
            textView.setText(snapshot.message);
            textView.setTextSize(13.0f);
            textView.setTextColor("error".equals(snapshot.applyState) ? -38027 : COLOR_MUTED);
            textView.setPadding(dp(5), dp(9), dp(5), dp(3));
            linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        }
        TextView textView2 = new TextView(this);
        textView2.setText("applying".equals(snapshot.applyState) ? "ĐANG GỬI…" : "ÁP DỤNG TRÊN HUD");
        textView2.setTextColor(-1);
        textView2.setTextSize(15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        textView2.setPadding(dp(16), dp(13), dp(16), dp(13));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor("applying".equals(snapshot.applyState) ? -11907236 : COLOR_ACCENT);
        gradientDrawable.setCornerRadius(dp(14));
        textView2.setBackground(gradientDrawable);
        boolean zEquals = "applying".equals(snapshot.applyState);
        textView2.setEnabled(!zEquals);
        if (!zEquals) {
            enableLiftHover(textView2);
        }
        final long j2 = schema.revision;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.57
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!HudLinkService.applyDeviceConfig(j2, new LinkedHashMap(this.this$0.hudDeviceConfigDraft))) {
                    Toast.makeText(this.this$0, "HUD Link chưa kết nối", 0).show();
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dp(50));
        layoutParams.topMargin = dp(12);
        layoutParams.bottomMargin = dp(4);
        linearLayout.addView(textView2, layoutParams);
    }

    private void addHudDeviceConfigItem(LinearLayout linearLayout, final HudDeviceConfig.Item item) {
        if ("toggle".equals(item.kind)) {
            LinearLayout linearLayoutDeviceConfigRow = deviceConfigRow(linearLayout, item);
            Switch r0 = new Switch(this);
            r0.setChecked(Boolean.TRUE.equals(this.hudDeviceConfigDraft.get(item.id)));
            r0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.waze.gw.ModSettingsActivity.58
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.this$0.updateHudDeviceDraft(item.id, Boolean.valueOf(z));
                }
            });
            linearLayoutDeviceConfigRow.addView(r0, new LinearLayout.LayoutParams(-2, -2));
            return;
        }
        if ("slider".equals(item.kind)) {
            LinearLayout linearLayoutDeviceConfigVerticalCard = deviceConfigVerticalCard(linearLayout, item);
            final TextView textView = new TextView(this);
            textView.setTextColor(COLOR_ACCENT);
            textView.setTextSize(16.0f);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setText(String.valueOf(this.hudDeviceConfigDraft.get(item.id)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = GravityCompat.END;
            linearLayoutDeviceConfigVerticalCard.addView(textView, layoutParams);
            SeekBar seekBar = new SeekBar(this);
            int iMax = Math.max(0, (item.max - item.min) / item.step);
            seekBar.setMax(iMax);
            seekBar.setProgress(Math.max(0, Math.min(iMax, (((Number) this.hudDeviceConfigDraft.get(item.id)).intValue() - item.min) / item.step)));
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(this) { // from class: com.waze.gw.ModSettingsActivity.59
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar2, int i2, boolean z) {
                    int i3 = item.min + (i2 * item.step);
                    textView.setText(String.valueOf(i3));
                    if (z) {
                        this.this$0.updateHudDeviceDraft(item.id, Integer.valueOf(i3));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar2) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar2) {
                }
            });
            linearLayoutDeviceConfigVerticalCard.addView(seekBar, new LinearLayout.LayoutParams(-1, -2));
            return;
        }
        if ("selection".equals(item.kind)) {
            LinearLayout linearLayoutDeviceConfigRow2 = deviceConfigRow(linearLayout, item);
            final TextView textView2 = new TextView(this);
            textView2.setTextColor(COLOR_ACCENT);
            textView2.setTextSize(15.0f);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            textView2.setText(deviceConfigOptionLabel(item, String.valueOf(this.hudDeviceConfigDraft.get(item.id))));
            linearLayoutDeviceConfigRow2.addView(textView2, new LinearLayout.LayoutParams(-2, -2));
            linearLayoutDeviceConfigRow2.setClickable(true);
            linearLayoutDeviceConfigRow2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.60
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    this.this$0.showHudDeviceChoiceDrawer(item, textView2);
                }
            });
            return;
        }
        LinearLayout linearLayoutDeviceConfigVerticalCard2 = deviceConfigVerticalCard(linearLayout, item);
        EditText editText = new EditText(this);
        editText.setSingleLine(true);
        editText.setTextColor(COLOR_TEXT);
        editText.setHintTextColor(COLOR_MUTED);
        editText.setTextSize(16.0f);
        editText.setPadding(dp(12), dp(9), dp(12), dp(9));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-15657957);
        gradientDrawable.setCornerRadius(dp(10));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        editText.setBackground(gradientDrawable);
        editText.setText(String.valueOf(this.hudDeviceConfigDraft.get(item.id)));
        if (TypedValues.Custom.S_INT.equals(item.kind)) {
            editText.setInputType(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } else {
            editText.setInputType(1);
        }
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(item.maxLength)});
        editText.addTextChangedListener(new TextWatcher(this) { // from class: com.waze.gw.ModSettingsActivity.61
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                this.this$0.updateHudDeviceDraft(item.id, charSequence.toString());
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(8);
        linearLayoutDeviceConfigVerticalCard2.addView(editText, layoutParams2);
    }

    private LinearLayout deviceConfigRow(LinearLayout linearLayout, HudDeviceConfig.Item item) {
        LinearLayout linearLayoutRow = row(linearLayout, item.label);
        if (item.description.length() > 0) {
            linearLayoutRow.setContentDescription(item.label + ". " + item.description);
        }
        return linearLayoutRow;
    }

    private LinearLayout deviceConfigVerticalCard(LinearLayout linearLayout, HudDeviceConfig.Item item) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(14), dp(12), dp(14), dp(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        TextView textView = new TextView(this);
        textView.setText(item.label);
        textView.setTextColor(COLOR_TEXT);
        textView.setTextSize(16.0f);
        linearLayout2.addView(textView);
        if (item.description.length() > 0) {
            TextView textView2 = new TextView(this);
            textView2.setText(item.description);
            textView2.setTextColor(COLOR_MUTED);
            textView2.setTextSize(12.0f);
            textView2.setPadding(0, dp(3), 0, 0);
            linearLayout2.addView(textView2);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        return linearLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHudDeviceDraft(String str, Object obj) {
        this.hudDeviceConfigDraft.put(str, obj);
        this.hudDeviceConfigDirty = true;
    }

    private String deviceConfigOptionLabel(HudDeviceConfig.Item item, String str) {
        for (HudDeviceConfig.Option option : item.options) {
            if (option.value.equals(str)) {
                return option.label;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showHudDeviceChoiceDrawer(final HudDeviceConfig.Item item, final TextView textView) {
        String[] strArr = new String[item.options.size()];
        String strValueOf = String.valueOf(this.hudDeviceConfigDraft.get(item.id));
        int i2 = -1;
        for (int i3 = 0; i3 < item.options.size(); i3++) {
            strArr[i3] = item.options.get(i3).label;
            if (item.options.get(i3).value.equals(strValueOf)) {
                i2 = i3;
            }
        }
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setTitle(item.label).setSingleChoiceItems(strArr, i2, (DialogInterface.OnClickListener) null).setNegativeButton("Hủy", (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: com.waze.gw.ModSettingsActivity.62
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                ListView listView = alertDialogCreate.getListView();
                final HudDeviceConfig.Item item2 = item;
                final TextView textView2 = textView;
                final AlertDialog alertDialog = alertDialogCreate;
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.62.1
                    final /* synthetic */ AnonymousClass62 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j2) {
                        HudDeviceConfig.Option option = item2.options.get(i4);
                        this.this$1.this$0.updateHudDeviceDraft(item2.id, option.value);
                        textView2.setText(option.label);
                        alertDialog.dismiss();
                    }
                });
            }
        });
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasHudPermissions() {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        return checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0 && checkSelfPermission("android.permission.BLUETOOTH_SCAN") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestHudPermissions() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 31) {
            if (checkSelfPermission("android.permission.BLUETOOTH_CONNECT") != 0) {
                arrayList.add("android.permission.BLUETOOTH_CONNECT");
            }
            if (checkSelfPermission("android.permission.BLUETOOTH_SCAN") != 0) {
                arrayList.add("android.permission.BLUETOOTH_SCAN");
            }
        } else if (this.sp.getInt("hud_link_transport", 0) != 1 && checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (!arrayList.isEmpty()) {
            requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4101);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openHudPicker(boolean z) {
        openHudPicker(z, "hlp1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openVietMapHudPicker() {
        openHudPicker(false, "vietmap");
    }

    private void openHudPicker(boolean z, String str) {
        if (!hasHudPermissions()) {
            this.pendingHudEnable = z;
            this.pendingHudPicker = true;
            if (str == null) {
                str = "hlp1";
            }
            this.pendingHudPickerProfile = str;
            requestHudPermissions();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) HudDevicePickerActivity.class);
        intent.putExtra("enable_after_select", z);
        intent.putExtra(HudDevicePickerActivity.EXTRA_HUD_PROFILE, str);
        startActivity(intent);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        boolean z = true;
        if (i2 == REQUEST_RECORD_OVERSPEED_AUDIO) {
            boolean z2 = iArr.length > 0 && iArr[0] == 0;
            this.pendingAlertRecordingPermission = false;
            if (!z2) {
                Toast.makeText(this, "Cần quyền micro để tự thu âm cảnh báo", 1).show();
                return;
            } else {
                showAlertRecordingDrawer();
                return;
            }
        }
        if (i2 != 4101) {
            return;
        }
        boolean z3 = iArr.length > 0;
        for (int i3 : iArr) {
            if (i3 != 0) {
                z3 = false;
            }
        }
        if (!z3) {
            this.pendingHudEnable = false;
            this.pendingHudPicker = false;
            this.sp.edit().putBoolean("hud_link", false).putString("hud_link_status", "PERMISSION_REQUIRED").apply();
            Toast.makeText(this, "Cần cấp quyền Thiết bị lân cận để dùng HUD Link", 1).show();
            for (String str : strArr) {
                if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(str)) {
                    z = false;
                    break;
                }
            }
            if (z) {
                new AlertDialog.Builder(this).setTitle("Cần quyền Bluetooth").setMessage("Hãy bật quyền Thiết bị lân cận trong Cài đặt ứng dụng.").setPositiveButton("Mở Cài đặt", new DialogInterface.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.63
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i4) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ModSettingsActivity.this.getPackageName()));
                            ModSettingsActivity.this.startActivity(intent);
                        } catch (Throwable th) {
                        }
                    }
                }).setNegativeButton("Hủy", (DialogInterface.OnClickListener) null).show();
                return;
            }
            return;
        }
        if (this.pendingHudPicker) {
            boolean z4 = this.pendingHudEnable;
            String str2 = this.pendingHudPickerProfile;
            this.pendingHudEnable = false;
            this.pendingHudPicker = false;
            this.pendingHudPickerProfile = "hlp1";
            openHudPicker(z4, str2);
        }
    }

    private void addAudioSettings(LinearLayout linearLayout) {
        addSection(linearLayout, "Âm thanh cảnh báo");
        addAudioMixChoice(linearLayout);
        addChoice(linearLayout, "Bộ giọng đọc", "voice_preset", new int[]{2, 4, 1, 3}, new String[]{"Waze (Mẫn nhi)", "VML (Ca sỹ Ngọc Bích)", "VML (MC Lê Yến)", "WazeMod"}, 2);
        addOverspeedAudioChoice(linearLayout);
        addSection(linearLayout, "Gói âm thanh tự thu");
        addRecordingPackageActions(linearLayout);
        addSection(linearLayout, "Kiểm tra âm thanh");
        addAudioPreviewCards(linearLayout);
        addSection(linearLayout, "Thông báo bằng giọng nói");
        addSpeedVoiceNavigationRow(linearLayout, "Đọc tốc độ giới hạn hiện tại", false);
        addSwitch(linearLayout, "Cảnh báo khi vượt tốc độ", "say_over", true);
        addSpeedVoiceNavigationRow(linearLayout, "[Dẫn đường] Đọc tốc độ giới hạn tiếp theo", true);
        addSwitch(linearLayout, "Đọc cảnh báo đường [Data Mod]", "road_notice_tts", true);
    }

    private void addRecordingPackageActions(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        int iRecordingCount = CustomAlertAudio.recordingCount(this, this.sp);
        TextView textViewCustomAudioAction = customAudioAction(iRecordingCount > 0 ? "Xuất tất cả (" + iRecordingCount + ")" : "Xuất tất cả", false);
        textViewCustomAudioAction.setGravity(17);
        textViewCustomAudioAction.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.64
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (CustomAlertAudio.recordingCount(ModSettingsActivity.this, ModSettingsActivity.this.sp) <= 0) {
                    Toast.makeText(ModSettingsActivity.this, "Chưa có bản tự thu để xuất", 0).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("application/zip");
                intent.putExtra("android.intent.extra.TITLE", "WazeMod_ban_thu_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + ".wzvoice");
                ModSettingsActivity.this.startActivityForResult(intent, ModSettingsActivity.REQUEST_EXPORT_RECORDING_PACKAGE);
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, dp(52), 1.0f);
        layoutParams2.rightMargin = dp(5);
        linearLayout2.addView(textViewCustomAudioAction, layoutParams2);
        TextView textViewCustomAudioAction2 = customAudioAction("Nhập gói âm thanh", false);
        textViewCustomAudioAction2.setGravity(17);
        textViewCustomAudioAction2.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.65
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("application/zip");
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"application/zip", "application/octet-stream"});
                ModSettingsActivity.this.startActivityForResult(intent, ModSettingsActivity.REQUEST_IMPORT_RECORDING_PACKAGE);
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, dp(52), 1.0f);
        layoutParams3.leftMargin = dp(5);
        linearLayout2.addView(textViewCustomAudioAction2, layoutParams3);
        TextView textView = new TextView(this);
        textView.setText("Chỉ đóng gói âm thanh tự thu; không chứa giọng có sẵn hoặc tệp đã chọn.");
        textView.setTextSize(12.0f);
        textView.setTextColor(COLOR_MUTED);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = dp(7);
        linearLayout.addView(textView, layoutParams4);
        TextView textViewCustomAudioAction3 = customAudioAction("Đặt lại âm thanh hàng loạt…", true);
        textViewCustomAudioAction3.setGravity(17);
        textViewCustomAudioAction3.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.66
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModSettingsActivity.this.showResetCustomAudioDrawer();
            }
        });
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, dp(52));
        layoutParams5.topMargin = dp(10);
        linearLayout.addView(textViewCustomAudioAction3, layoutParams5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showResetCustomAudioDrawer() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        LinearLayout linearLayoutCreateAmbientSheet = createAmbientSheet("Đặt lại âm thanh hàng loạt", "Chọn nhóm cần đưa về giọng mặc định. Thao tác này sẽ xóa bản tự thu và tệp riêng.");
        final Switch switchRecordingImportGroupRow = recordingImportGroupRow(linearLayoutCreateAmbientSheet, "settings_demo/ui_alert.png", "Voice quá tốc độ", "Đưa âm quá tốc độ về mặc định");
        final Switch switchRecordingImportGroupRow2 = recordingImportGroupRow(linearLayoutCreateAmbientSheet, "settings_demo/current_speed_ui.png", "Voice tốc độ hiện tại", "Đưa toàn bộ mốc tốc độ hiện tại về mặc định");
        final Switch switchRecordingImportGroupRow3 = recordingImportGroupRow(linearLayoutCreateAmbientSheet, "settings_demo/next_speed_ui.png", "Voice tốc độ tiếp theo", "Đưa toàn bộ mốc tốc độ tiếp theo về mặc định");
        TextView textViewCustomAudioAction = customAudioAction("Đặt lại nhóm đã chọn", true);
        textViewCustomAudioAction.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dp(52));
        layoutParams.topMargin = dp(14);
        linearLayoutCreateAmbientSheet.addView(textViewCustomAudioAction, layoutParams);
        textViewCustomAudioAction.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.67
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i2 = switchRecordingImportGroupRow.isChecked() ? 1 : 0;
                if (switchRecordingImportGroupRow2.isChecked()) {
                    i2 |= 2;
                }
                if (switchRecordingImportGroupRow3.isChecked()) {
                    i2 |= 4;
                }
                if (i2 == 0) {
                    Toast.makeText(this.this$0, "Hãy chọn ít nhất một nhóm âm thanh", 0).show();
                } else {
                    this.this$0.confirmResetCustomAudio(dialog, i2);
                }
            }
        });
        showBottomSheet(dialog, linearLayoutCreateAmbientSheet, dp(700));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void confirmResetCustomAudio(final Dialog dialog, final int i2) {
        StringBuilder sb = new StringBuilder();
        if ((i2 & 1) != 0) {
            sb.append("• Voice quá tốc độ\n");
        }
        if ((i2 & 2) != 0) {
            sb.append("• Voice tốc độ hiện tại\n");
        }
        if ((i2 & 4) != 0) {
            sb.append("• Voice tốc độ tiếp theo\n");
        }
        new AlertDialog.Builder(this).setTitle("Xác nhận đặt lại").setMessage("Các nhóm sau sẽ mất toàn bộ bản tự thu và tệp riêng:\n\n" + String.valueOf(sb) + "\nKhông thể hoàn tác thao tác này.").setNegativeButton("Hủy bỏ", (DialogInterface.OnClickListener) null).setPositiveButton("⚠ Đặt lại", new DialogInterface.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.68
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                int iResetGroups = CustomAlertAudio.resetGroups(this.this$0, this.this$0.sp, i2);
                dialog.dismiss();
                Toast.makeText(this.this$0, iResetGroups > 0 ? "Đã đưa " + iResetGroups + " âm thanh về mặc định" : "Các nhóm đã ở chế độ mặc định", 0).show();
                if (ModSettingsActivity.CAT_ALERTS.equals(this.this$0.selectedCategory)) {
                    this.this$0.openCategory(ModSettingsActivity.CAT_ALERTS);
                }
            }
        }).show();
    }

    private void showRecordingPackageImportDrawer(Uri uri) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        LinearLayout linearLayoutCreateAmbientSheet = createAmbientSheet("Nhập gói âm thanh", "Chọn các nhóm bản thu muốn nhập. Nhóm không chọn sẽ được giữ nguyên.");
        Switch switchRecordingImportGroupRow = recordingImportGroupRow(linearLayoutCreateAmbientSheet, "settings_demo/ui_alert.png", "Voice quá tốc độ", "Âm báo khi xe vượt giới hạn");
        Switch switchRecordingImportGroupRow2 = recordingImportGroupRow(linearLayoutCreateAmbientSheet, "settings_demo/current_speed_ui.png", "Voice tốc độ hiện tại", "Các mốc tốc độ hiện tại đã thu");
        Switch switchRecordingImportGroupRow3 = recordingImportGroupRow(linearLayoutCreateAmbientSheet, "settings_demo/next_speed_ui.png", "Voice tốc độ tiếp theo", "Các mốc tốc độ phía trước đã thu");
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(14);
        linearLayoutCreateAmbientSheet.addView(linearLayout, layoutParams);
        TextView textViewCustomAudioAction = customAudioAction("Hủy", false);
        textViewCustomAudioAction.setGravity(17);
        textViewCustomAudioAction.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.69
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, dp(52), 1.0f);
        layoutParams2.rightMargin = dp(5);
        linearLayout.addView(textViewCustomAudioAction, layoutParams2);
        TextView textViewCustomAudioAction2 = customAudioAction("Nhập bản thu", false);
        textViewCustomAudioAction2.setGravity(17);
        textViewCustomAudioAction2.setTextColor(COLOR_ACCENT);
        textViewCustomAudioAction2.setOnClickListener(new AnonymousClass70(this, switchRecordingImportGroupRow, switchRecordingImportGroupRow2, switchRecordingImportGroupRow3, textViewCustomAudioAction2, uri, dialog));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, dp(52), 1.0f);
        layoutParams3.leftMargin = dp(5);
        linearLayout.addView(textViewCustomAudioAction2, layoutParams3);
        showBottomSheet(dialog, linearLayoutCreateAmbientSheet, dp(DisplayStrings.DS_KM_PD));
    }

    /* renamed from: com.waze.gw.ModSettingsActivity$70, reason: invalid class name */
    class AnonymousClass70 implements View.OnClickListener {
        final /* synthetic */ ModSettingsActivity this$0;
        final /* synthetic */ TextView val$apply;
        final /* synthetic */ Switch val$current;
        final /* synthetic */ Dialog val$dialog;
        final /* synthetic */ Switch val$next;
        final /* synthetic */ Switch val$overspeed;
        final /* synthetic */ Uri val$packageUri;

        AnonymousClass70(ModSettingsActivity modSettingsActivity, Switch r2, Switch r3, Switch r4, TextView textView, Uri uri, Dialog dialog) {
            this.val$overspeed = r2;
            this.val$current = r3;
            this.val$next = r4;
            this.val$apply = textView;
            this.val$packageUri = uri;
            this.val$dialog = dialog;
            this.this$0 = modSettingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i2 = this.val$overspeed.isChecked() ? 1 : 0;
            if (this.val$current.isChecked()) {
                i2 |= 2;
            }
            if (this.val$next.isChecked()) {
                i2 |= 4;
            }
            final int i3 = i2;
            if (i3 == 0) {
                Toast.makeText(this.this$0, "Hãy chọn ít nhất một nhóm âm thanh", 0).show();
                return;
            }
            this.val$apply.setEnabled(false);
            this.val$apply.setText("Đang kiểm tra gói…");
            final Uri uri = this.val$packageUri;
            final TextView textView = this.val$apply;
            final Dialog dialog = this.val$dialog;
            new Thread(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.70.1
                final /* synthetic */ AnonymousClass70 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    final int iImportRecordingPackage = CustomAlertAudio.importRecordingPackage(this.this$1.this$0, this.this$1.this$0.sp, uri, i3);
                    ModSettingsActivity modSettingsActivity = this.this$1.this$0;
                    final TextView textView2 = textView;
                    final Dialog dialog2 = dialog;
                    modSettingsActivity.runOnUiThread(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.70.1.1
                        final /* synthetic */ AnonymousClass1 this$2;

                        {
                            this.this$2 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            String str;
                            if (this.this$2.this$1.this$0.isFinishing()) {
                                return;
                            }
                            textView2.setEnabled(true);
                            textView2.setText("Nhập bản thu");
                            ModSettingsActivity modSettingsActivity2 = this.this$2.this$1.this$0;
                            if (iImportRecordingPackage > 0) {
                                str = "Đã nhập " + iImportRecordingPackage + " bản thu";
                            } else if (iImportRecordingPackage == 0) {
                                str = "Gói không có bản thu thuộc nhóm đã chọn";
                            } else {
                                str = "Gói âm thanh không hợp lệ";
                            }
                            Toast.makeText(modSettingsActivity2, str, iImportRecordingPackage > 0 ? 0 : 1).show();
                            if (iImportRecordingPackage > 0) {
                                dialog2.dismiss();
                                if (ModSettingsActivity.CAT_ALERTS.equals(this.this$2.this$1.this$0.selectedCategory)) {
                                    this.this$2.this$1.this$0.openCategory(ModSettingsActivity.CAT_ALERTS);
                                }
                            }
                        }
                    });
                }
            }, "WazeMod-audio-import").start();
        }
    }

    private Switch recordingImportGroupRow(LinearLayout linearLayout, String str, String str2, String str3) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(dp(12), dp(10), dp(12), dp(10));
        styleControlHover(linearLayout2, false);
        enableControlHover(linearLayout2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dp(82));
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        ImageView imageView = new ImageView(this);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Bitmap bitmapDecodeSampledAsset = decodeSampledAsset(str, 128);
        if (bitmapDecodeSampledAsset != null) {
            imageView.setImageBitmap(bitmapDecodeSampledAsset);
        }
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(dp(58), dp(58)));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText(str2);
        textView.setTextSize(16.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText(str3);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(COLOR_MUTED);
        linearLayout3.addView(textView2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.leftMargin = dp(12);
        linearLayout2.addView(linearLayout3, layoutParams2);
        final Switch r9 = new Switch(this);
        r9.setChecked(true);
        try {
            r9.setShowText(false);
            int[][] iArr = {new int[]{R.attr.state_checked}, new int[0]};
            r9.setThumbTintList(new ColorStateList(iArr, new int[]{COLOR_ACCENT, -3158065}));
            r9.setTrackTintList(new ColorStateList(iArr, new int[]{AmbientTheme.withAlpha(COLOR_ACCENT, 128), 1090519039}));
        } catch (Throwable th) {
        }
        linearLayout2.addView(r9, new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.setClickable(true);
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.71
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                r9.setChecked(!r9.isChecked());
            }
        });
        return r9;
    }

    private void addAudioPreviewCards(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        final AudioPreviewCard audioPreviewCardMakeAudioPreviewCard = makeAudioPreviewCard("Tốc độ hiện tại", true);
        this.audioCurrentPreview = audioPreviewCardMakeAudioPreviewCard;
        audioPreviewCardMakeAudioPreviewCard.root.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.72
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startAudioPreview(audioPreviewCardMakeAudioPreviewCard, false);
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, dp(76), 1.0f);
        layoutParams2.rightMargin = dp(5);
        linearLayout2.addView(audioPreviewCardMakeAudioPreviewCard.root, layoutParams2);
        final AudioPreviewCard audioPreviewCardMakeAudioPreviewCard2 = makeAudioPreviewCard("Âm thanh dẫn đường", false);
        this.audioNavigationPreview = audioPreviewCardMakeAudioPreviewCard2;
        audioPreviewCardMakeAudioPreviewCard2.root.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.73
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.startAudioPreview(audioPreviewCardMakeAudioPreviewCard2, true);
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, dp(76), 1.0f);
        layoutParams3.leftMargin = dp(5);
        linearLayout2.addView(audioPreviewCardMakeAudioPreviewCard2.root, layoutParams3);
        updateAudioPreviewCooldown();
    }

    private static final class AudioPreviewCard {
        final LinearLayout root;
        final TextView speaker;

        AudioPreviewCard(LinearLayout linearLayout, TextView textView) {
            this.root = linearLayout;
            this.speaker = textView;
        }
    }

    private AudioPreviewCard makeAudioPreviewCard(String str, boolean z) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(dp(9), dp(8), dp(8), dp(8));
        linearLayout.setClickable(true);
        linearLayout.setFocusable(true);
        linearLayout.setContentDescription("Nghe thử " + str);
        styleControlHover(linearLayout, false);
        enableControlHover(linearLayout);
        TextView textView = new TextView(this);
        textView.setText(z ? previewSpeedValue() : "↱");
        textView.setTextSize(z ? 13.0f : 22.0f);
        textView.setTextColor(z ? -15658735 : -1);
        textView.setGravity(17);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(z ? -460552 : -24822);
        gradientDrawable.setStroke(dp(z ? 4 : 1), z ? -42396 : -18355);
        textView.setBackground(gradientDrawable);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(dp(40), dp(40)));
        TextView textView2 = new TextView(this);
        textView2.setText(str);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(COLOR_TEXT);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(16);
        textView2.setMaxLines(2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.leftMargin = dp(9);
        layoutParams.rightMargin = dp(5);
        linearLayout.addView(textView2, layoutParams);
        TextView textView3 = new TextView(this);
        textView3.setText("🔊");
        textView3.setTextSize(17.0f);
        textView3.setGravity(17);
        textView3.setTextColor(COLOR_TEXT);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(-13354942);
        textView3.setBackground(gradientDrawable2);
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(dp(40), dp(40)));
        return new AudioPreviewCard(linearLayout, textView3);
    }

    private String previewSpeedValue() {
        return "60";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAudioPreview(AudioPreviewCard audioPreviewCard, boolean z) {
        boolean zPreviewCurrentSpeedAudio;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < this.audioPreviewLockedUntil) {
            return;
        }
        if (z) {
            zPreviewCurrentSpeedAudio = Gateway.previewNavigationAudio();
        } else {
            zPreviewCurrentSpeedAudio = Gateway.previewCurrentSpeedAudio();
        }
        if (!zPreviewCurrentSpeedAudio) {
            Toast.makeText(this, "Âm thanh Waze chưa sẵn sàng, hãy thử lại sau", 0).show();
            return;
        }
        this.audioActivePreview = audioPreviewCard;
        this.audioPreviewLockedUntil = jElapsedRealtime + 5000;
        updateAudioPreviewCooldown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAudioPreviewCooldown() {
        this.audioPreviewHandler.removeCallbacks(this.audioPreviewCountdown);
        long jElapsedRealtime = this.audioPreviewLockedUntil - SystemClock.elapsedRealtime();
        boolean z = jElapsedRealtime > 0;
        updateAudioPreviewCard(this.audioCurrentPreview, z);
        updateAudioPreviewCard(this.audioNavigationPreview, z);
        if (z) {
            int i2 = (int) ((999 + jElapsedRealtime) / 1000);
            if (this.audioActivePreview != null) {
                this.audioActivePreview.speaker.setText(i2 + CmcdData.STREAMING_FORMAT_SS);
            }
            this.audioPreviewHandler.postDelayed(this.audioPreviewCountdown, Math.min(1000L, jElapsedRealtime));
            return;
        }
        this.audioPreviewLockedUntil = 0L;
        this.audioActivePreview = null;
    }

    private void updateAudioPreviewCard(AudioPreviewCard audioPreviewCard, boolean z) {
        if (audioPreviewCard == null) {
            return;
        }
        audioPreviewCard.root.setEnabled(!z);
        audioPreviewCard.root.setClickable(!z);
        audioPreviewCard.root.setAlpha(z ? 0.68f : 1.0f);
        if (audioPreviewCard != this.audioActivePreview || !z) {
            audioPreviewCard.speaker.setText("🔊");
        }
    }

    private void addSpeedVoiceNavigationRow(LinearLayout linearLayout, String str, final boolean z) {
        LinearLayout linearLayoutRow = row(linearLayout, str);
        TextView textView = new TextView(this);
        textView.setText("›");
        textView.setTextSize(28.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp(26), dp(36));
        layoutParams.leftMargin = dp(6);
        linearLayoutRow.addView(textView, layoutParams);
        linearLayoutRow.setClickable(true);
        linearLayoutRow.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.74
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.openSpeedVoicePage(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openSpeedVoicePage(boolean z) {
        rememberActivePageScroll();
        this.selectedSubpage = z ? "next_speed_voice" : "current_speed_voice";
        ScrollView scrollViewBuildSpeedVoicePage = buildSpeedVoicePage(z);
        trackPageScroll(scrollViewBuildSpeedVoicePage, subpageScrollKey(this.selectedSubpage));
        if (this.wideSettings) {
            this.detailHost.removeAllViews();
            this.detailHost.addView(scrollViewBuildSpeedVoicePage, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.narrowHost.removeAllViews();
            this.narrowHost.addView(scrollViewBuildSpeedVoicePage, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnToAlertsPage() {
        rememberActivePageScroll();
        this.selectedSubpage = null;
        ScrollView scrollViewBuildCategoryPage = buildCategoryPage(CAT_ALERTS);
        trackPageScroll(scrollViewBuildCategoryPage, categoryScrollKey(CAT_ALERTS));
        if (this.wideSettings) {
            this.detailHost.removeAllViews();
            this.detailHost.addView(scrollViewBuildCategoryPage, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.narrowHost.removeAllViews();
            this.narrowHost.addView(scrollViewBuildCategoryPage, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private ScrollView buildSpeedVoicePage(boolean z) {
        String str;
        String str2;
        String str3;
        if (z) {
            str = "Tốc độ giới hạn tiếp theo";
        } else {
            str = "Tốc độ giới hạn hiện tại";
        }
        String str4 = z ? "say_next" : "say_limit";
        String str5 = z ? "say_next_speed_" : "say_limit_speed_";
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        scrollView.setBackgroundColor(COLOR_BG);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(dp(18), dp(14), dp(18), dp(28));
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("‹");
        textView.setTextSize(38.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setGravity(17);
        textView.setContentDescription("Quay lại Cảnh báo & giọng đọc");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.75
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModSettingsActivity.this.returnToAlertsPage();
            }
        });
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(dp(42), dp(48)));
        TextView textView2 = new TextView(this);
        textView2.setText(str);
        textView2.setTextSize(22.0f);
        textView2.setTextColor(COLOR_TEXT);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout2.addView(textView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(this);
        if (z) {
            str2 = "Chọn những giới hạn tốc độ được đọc khi đang dẫn đường";
        } else {
            str2 = "Chọn những giới hạn tốc độ được đọc khi xe đi vào đoạn đường";
        }
        textView3.setText(str2);
        textView3.setTextSize(13.0f);
        textView3.setTextColor(COLOR_MUTED);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = dp(42);
        layoutParams.bottomMargin = dp(10);
        linearLayout.addView(textView3, layoutParams);
        addSection(linearLayout, "Giọng đọc");
        if (z) {
            str3 = "Đọc giới hạn tốc độ tiếp theo";
        } else {
            str3 = "Đọc giới hạn tốc độ hiện tại";
        }
        addSwitch(linearLayout, str3, str4, true);
        addSection(linearLayout, "Tốc độ được đọc");
        for (int i2 : VOICE_SPEEDS) {
            addSpeedVoiceToggle(linearLayout, i2, str5 + i2);
        }
        return scrollView;
    }

    private void addSpeedVoiceToggle(LinearLayout linearLayout, final int i2, final String str) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(dp(12), dp(10), dp(14), dp(10));
        styleControlHover(linearLayout2, false);
        enableControlHover(linearLayout2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        TextView textView = new TextView(this);
        textView.setText(String.valueOf(i2));
        textView.setTextColor(-15658735);
        textView.setTextSize(i2 >= 100 ? 13.0f : 15.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-460552);
        gradientDrawable.setStroke(dp(4), -42396);
        textView.setBackground(gradientDrawable);
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(dp(48), dp(48)));
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        TextView textView2 = new TextView(this);
        textView2.setText("Tốc độ giới hạn " + i2);
        textView2.setTextSize(17.0f);
        textView2.setTextColor(COLOR_TEXT);
        linearLayout3.addView(textView2);
        final String str2 = (str.startsWith("say_next_speed_") ? "next_" : "current_") + i2;
        final TextView textView3 = new TextView(this);
        textView3.setText(customAudioLabel(str2));
        textView3.setTextSize(12.0f);
        textView3.setTextColor(COLOR_ACCENT);
        linearLayout3.addView(textView3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.leftMargin = dp(14);
        linearLayout2.addView(linearLayout3, layoutParams2);
        TextView textView4 = new TextView(this);
        textView4.setText("Âm thanh");
        textView4.setTextSize(13.0f);
        textView4.setTextColor(COLOR_ACCENT);
        textView4.setTypeface(Typeface.DEFAULT_BOLD);
        textView4.setGravity(17);
        textView4.setPadding(dp(10), dp(7), dp(10), dp(7));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(AmbientTheme.withAlpha(COLOR_ACCENT, 24));
        gradientDrawable2.setCornerRadius(dp(12));
        gradientDrawable2.setStroke(dp(1), AmbientTheme.withAlpha(COLOR_ACCENT, 110));
        textView4.setBackground(gradientDrawable2);
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.76
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.showCustomAudioDrawer(str2, (str2.startsWith("next_") ? "Tốc độ tiếp theo " : "Tốc độ hiện tại ") + i2, textView3);
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, dp(38));
        layoutParams3.rightMargin = dp(10);
        linearLayout2.addView(textView4, layoutParams3);
        final Switch r5 = new Switch(this);
        try {
            r5.setShowText(false);
            int[][] iArr = {new int[]{R.attr.state_checked}, new int[0]};
            r5.setThumbTintList(new ColorStateList(iArr, new int[]{COLOR_ACCENT, -3158065}));
            r5.setTrackTintList(new ColorStateList(iArr, new int[]{AmbientTheme.withAlpha(COLOR_ACCENT, 128), 1090519039}));
        } catch (Throwable th) {
        }
        r5.setChecked(this.sp.getBoolean(str, true));
        r5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.waze.gw.ModSettingsActivity.77
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.this$0.sp.edit().putBoolean(str, z).apply();
            }
        });
        linearLayout2.addView(r5, new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.setClickable(true);
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.78
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                r5.setChecked(!r5.isChecked());
            }
        });
    }

    private void addAudioMixChoice(LinearLayout linearLayout) {
        if (!this.sp.contains("audio_mix_mode")) {
            this.sp.edit().putInt("audio_mix_mode", !this.sp.getBoolean("mix_mod_audio", false) ? 1 : 0).apply();
        }
        addChoice(linearLayout, "Chế độ âm thanh", "audio_mix_mode", new int[]{0, 1}, new String[]{"Trộn âm thanh", "Giảm nhỏ nhạc"}, 1, new Runnable() { // from class: com.waze.gw.ModSettingsActivity.79
            @Override // java.lang.Runnable
            public void run() {
                ModSettingsActivity.this.sp.edit().putBoolean("mix_mod_audio", ModSettingsActivity.this.sp.getInt("audio_mix_mode", 1) == 0).apply();
            }
        });
    }

    private void addOverspeedAudioChoice(LinearLayout linearLayout) {
        LinearLayout linearLayoutRow = row(linearLayout, "Âm báo quá tốc độ");
        this.overspeedAudioSummary = new TextView(this);
        this.overspeedAudioSummary.setText(customAudioLabel("overspeed"));
        this.overspeedAudioSummary.setTextSize(15.0f);
        this.overspeedAudioSummary.setTextColor(COLOR_ACCENT);
        this.overspeedAudioSummary.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayoutRow.addView(this.overspeedAudioSummary, new LinearLayout.LayoutParams(-2, -2));
        linearLayoutRow.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.80
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModSettingsActivity.this.showCustomAudioDrawer("overspeed", "Âm báo quá tốc độ", ModSettingsActivity.this.overspeedAudioSummary);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String customAudioLabel(String str) {
        int i2 = this.sp.getInt(CustomAlertAudio.modeKey(str), 0);
        if (i2 == 2) {
            return "Bản tự thu";
        }
        if (i2 == 1) {
            String string = this.sp.getString(CustomAlertAudio.nameKey(str), "Tệp riêng");
            return (string == null || string.trim().isEmpty()) ? "Tệp riêng" : string;
        }
        return "Mặc định";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCustomAudioDrawer(final String str, String str2, final TextView textView) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        LinearLayout linearLayoutCreateAmbientSheet = createAmbientSheet(str2, "Dùng âm mặc định, chọn tệp hoặc tự thu tối đa 15 giây");
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        final TextView textViewCustomAudioAction = customAudioAction("Nghe thử", false);
        textViewCustomAudioAction.setGravity(16);
        linearLayout.addView(textViewCustomAudioAction, new LinearLayout.LayoutParams(-1, dp(48)));
        final ProgressBar progressBar = new ProgressBar(this, null, R.attr.progressBarStyleHorizontal);
        progressBar.setMax(1000);
        progressBar.setProgress(0);
        progressBar.setIndeterminate(false);
        progressBar.setProgressDrawable(synthwaveRecordingProgressDrawable());
        progressBar.setVisibility(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dp(6));
        layoutParams.leftMargin = dp(12);
        layoutParams.rightMargin = dp(12);
        layoutParams.bottomMargin = dp(4);
        linearLayout.addView(progressBar, layoutParams);
        final ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[1];
        textViewCustomAudioAction.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.81
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zPreviewOverspeedAlert;
                long jPreviewOverspeedDurationMs;
                if ("overspeed".equals(str)) {
                    zPreviewOverspeedAlert = Gateway.previewOverspeedAlert();
                    jPreviewOverspeedDurationMs = Gateway.previewOverspeedDurationMs();
                } else {
                    boolean zStartsWith = str.startsWith("next_");
                    int iLastIndexOf = str.lastIndexOf(95);
                    int i2 = iLastIndexOf >= 0 ? Integer.parseInt(str.substring(iLastIndexOf + 1)) : -1;
                    boolean zPreviewSpeedAlert = Gateway.previewSpeedAlert(zStartsWith, i2);
                    long jPreviewSpeedDurationMs = Gateway.previewSpeedDurationMs(zStartsWith, i2);
                    zPreviewOverspeedAlert = zPreviewSpeedAlert;
                    jPreviewOverspeedDurationMs = jPreviewSpeedDurationMs;
                }
                if (!zPreviewOverspeedAlert) {
                    textViewCustomAudioAction.setText("⚠ Không thể phát · chạm để thử lại");
                    textViewCustomAudioAction.setTextColor(-39567);
                    progressBar.setVisibility(4);
                    return;
                }
                if (objectAnimatorArr[0] != null) {
                    objectAnimatorArr[0].cancel();
                }
                long jMax = Math.max(800L, Math.min(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, jPreviewOverspeedDurationMs));
                textViewCustomAudioAction.setEnabled(false);
                textViewCustomAudioAction.setText("🔊  Đang phát…");
                textViewCustomAudioAction.setTextColor(-15079681);
                progressBar.setProgress(0);
                progressBar.setVisibility(0);
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", 0, 1000);
                objectAnimatorArr[0] = objectAnimatorOfInt;
                objectAnimatorOfInt.setDuration(jMax);
                objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
                final TextView textView2 = textViewCustomAudioAction;
                final ProgressBar progressBar2 = progressBar;
                objectAnimatorOfInt.addListener(new AnimatorListenerAdapter(this) { // from class: com.waze.gw.ModSettingsActivity.81.1
                    final /* synthetic */ AnonymousClass81 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        textView2.setEnabled(true);
                        textView2.setText("Nghe lại");
                        textView2.setTextColor(ModSettingsActivity.COLOR_TEXT);
                        progressBar2.setVisibility(4);
                    }
                });
                objectAnimatorOfInt.start();
            }
        });
        linearLayoutCreateAmbientSheet.addView(linearLayout, new LinearLayout.LayoutParams(-1, dp(58)));
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.waze.gw.ModSettingsActivity.82
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (objectAnimatorArr[0] != null) {
                    objectAnimatorArr[0].cancel();
                }
            }
        });
        TextView textViewCustomAudioAction2 = customAudioAction("Chọn tệp âm thanh…", false);
        textViewCustomAudioAction2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.83
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dialog.dismiss();
                this.this$0.selectedAudioSlot = str;
                this.this$0.selectedAudioSummary = textView;
                this.this$0.sp.edit().putString("pending_custom_audio_slot", str).apply();
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("audio/*");
                this.this$0.startActivityForResult(intent, ModSettingsActivity.REQUEST_PICK_OVERSPEED_AUDIO);
            }
        });
        linearLayoutCreateAmbientSheet.addView(textViewCustomAudioAction2, actionLayoutParams(true));
        TextView textViewCustomAudioAction3 = customAudioAction("Tự thu âm…", false);
        textViewCustomAudioAction3.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.84
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dialog.dismiss();
                this.this$0.selectedAudioSlot = str;
                this.this$0.selectedAudioSummary = textView;
                this.this$0.requestOrShowAlertRecorder();
            }
        });
        linearLayoutCreateAmbientSheet.addView(textViewCustomAudioAction3, actionLayoutParams(true));
        if (this.sp.getInt(CustomAlertAudio.modeKey(str), 0) == 2 && CustomAlertAudio.hasAudio(this, str)) {
            TextView textViewCustomAudioAction4 = customAudioAction("Xuất bản thu…", false);
            textViewCustomAudioAction4.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.85
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dialog.dismiss();
                    this.this$0.sp.edit().putString("pending_custom_audio_export_slot", str).apply();
                    Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType(MimeTypes.AUDIO_MP4);
                    intent.putExtra("android.intent.extra.TITLE", this.this$0.exportRecordingFileName(str));
                    this.this$0.startActivityForResult(intent, ModSettingsActivity.REQUEST_EXPORT_ALERT_RECORDING);
                }
            });
            linearLayoutCreateAmbientSheet.addView(textViewCustomAudioAction4, actionLayoutParams(true));
        }
        TextView textViewCustomAudioAction5 = customAudioAction("Khôi phục âm mặc định", true);
        textViewCustomAudioAction5.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.86
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomAlertAudio.reset(this.this$0, str);
                this.this$0.sp.edit().putInt(CustomAlertAudio.modeKey(str), 0).remove(CustomAlertAudio.nameKey(str)).apply();
                if (textView != null) {
                    textView.setText(this.this$0.customAudioLabel(str));
                }
                dialog.dismiss();
            }
        });
        linearLayoutCreateAmbientSheet.addView(textViewCustomAudioAction5, actionLayoutParams(true));
        showBottomSheet(dialog, linearLayoutCreateAmbientSheet, dp(640));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String exportRecordingFileName(String str) {
        String str2;
        if ("overspeed".equals(str)) {
            str2 = "qua_toc_do";
        } else if (str != null && str.startsWith("current_")) {
            str2 = "toc_do_hien_tai_" + str.substring("current_".length());
        } else if (str != null && str.startsWith("next_")) {
            str2 = "toc_do_tiep_theo_" + str.substring("next_".length());
        } else {
            str2 = "canh_bao";
        }
        return "WazeMod_" + str2 + ".m4a";
    }

    private TextView customAudioAction(String str, boolean z) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(16.0f);
        textView.setTextColor(z ? -39567 : COLOR_TEXT);
        textView.setGravity(16);
        textView.setPadding(dp(16), 0, dp(16), 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), z ? 1728013681 : COLOR_BORDER);
        textView.setBackground(gradientDrawable);
        enableControlHover(textView);
        return textView;
    }

    private LinearLayout.LayoutParams actionLayoutParams(boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dp(54));
        if (z) {
            layoutParams.topMargin = dp(8);
        }
        return layoutParams;
    }

    private String audioDisplayName(Uri uri) {
        String string;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst() || (string = cursorQuery.getString(0)) == null || string.trim().isEmpty()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return "Tệp riêng";
                    }
                    return "Tệp riêng";
                }
                String strTrim = string.trim();
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th) {
                    }
                }
                return strTrim;
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return "Tệp riêng";
                }
                return "Tệp riêng";
            }
        } catch (Throwable th3) {
            return "Tệp riêng";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestOrShowAlertRecorder() {
        if (Build.VERSION.SDK_INT >= 23 && checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            this.pendingAlertRecordingPermission = true;
            requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, REQUEST_RECORD_OVERSPEED_AUDIO);
        } else {
            showAlertRecordingDrawer();
        }
    }

    private void showAlertRecordingDrawer() {
        if (this.selectedAudioSlot == null || this.selectedAudioSlot.isEmpty()) {
            return;
        }
        final Dialog dialog = new Dialog(this);
        this.alertRecordDialog = dialog;
        dialog.requestWindowFeature(1);
        LinearLayout linearLayoutCreateAmbientSheet = createAmbientSheet("Tự thu âm cảnh báo", "Nhấn bắt đầu, đọc câu cảnh báo rồi lưu. Tối đa 15 giây.");
        this.alertRecordStatus = new TextView(this);
        this.alertRecordStatus.setText("Sẵn sàng thu");
        this.alertRecordStatus.setTextSize(22.0f);
        this.alertRecordStatus.setTextColor(COLOR_TEXT);
        this.alertRecordStatus.setTypeface(Typeface.DEFAULT_BOLD);
        this.alertRecordStatus.setGravity(17);
        linearLayoutCreateAmbientSheet.addView(this.alertRecordStatus, new LinearLayout.LayoutParams(-1, dp(58)));
        FrameLayout frameLayout = new FrameLayout(this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-15658211);
        gradientDrawable.setCornerRadius(dp(10));
        gradientDrawable.setStroke(dp(1), -1433707265);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setPadding(dp(3), dp(3), dp(3), dp(3));
        this.alertRecordProgress = new ProgressBar(this, null, R.attr.progressBarStyleHorizontal);
        this.alertRecordProgress.setMax(15000);
        this.alertRecordProgress.setProgress(0);
        this.alertRecordProgress.setIndeterminate(false);
        this.alertRecordProgress.setProgressDrawable(synthwaveRecordingProgressDrawable());
        frameLayout.addView(this.alertRecordProgress, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dp(14));
        layoutParams.leftMargin = dp(12);
        layoutParams.rightMargin = dp(12);
        layoutParams.bottomMargin = dp(18);
        linearLayoutCreateAmbientSheet.addView(frameLayout, layoutParams);
        this.alertRecordButton = customAudioAction("Bắt đầu thu", false);
        this.alertRecordButton.setGravity(17);
        this.alertRecordButton.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.87
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!ModSettingsActivity.this.alertRecording) {
                    if (ModSettingsActivity.this.startAlertRecording()) {
                        ModSettingsActivity.this.alertRecordButton.setText("Dừng thu");
                        ModSettingsActivity.this.alertRecordStatus.setTextColor(-42106);
                        return;
                    }
                    return;
                }
                ModSettingsActivity.this.stopAlertRecordingForReview();
            }
        });
        linearLayoutCreateAmbientSheet.addView(this.alertRecordButton, actionLayoutParams(false));
        this.alertRecordReviewActions = new LinearLayout(this);
        this.alertRecordReviewActions.setOrientation(0);
        this.alertRecordReviewActions.setGravity(16);
        this.alertRecordReviewActions.setVisibility(8);
        TextView textViewCustomAudioAction = customAudioAction("↻  Ghi lại", false);
        textViewCustomAudioAction.setGravity(17);
        textViewCustomAudioAction.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.88
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModSettingsActivity.this.stopAlertRecordPreview();
                CustomAlertAudio.deleteQuietly(ModSettingsActivity.this.alertRecordingFile);
                ModSettingsActivity.this.alertRecordingFile = null;
                ModSettingsActivity.this.showRecorderReadyState();
                if (ModSettingsActivity.this.startAlertRecording()) {
                    ModSettingsActivity.this.alertRecordButton.setText("Dừng thu");
                    ModSettingsActivity.this.alertRecordStatus.setTextColor(-42106);
                }
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, dp(52), 1.0f);
        layoutParams2.rightMargin = dp(5);
        this.alertRecordReviewActions.addView(textViewCustomAudioAction, layoutParams2);
        TextView textViewCustomAudioAction2 = customAudioAction("▶  Nghe thử", false);
        textViewCustomAudioAction2.setGravity(17);
        textViewCustomAudioAction2.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.89
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModSettingsActivity.this.previewPendingAlertRecording();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, dp(52), 1.0f);
        layoutParams3.leftMargin = dp(5);
        this.alertRecordReviewActions.addView(textViewCustomAudioAction2, layoutParams3);
        linearLayoutCreateAmbientSheet.addView(this.alertRecordReviewActions, actionLayoutParams(true));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textViewCustomAudioAction3 = customAudioAction("Hủy", true);
        textViewCustomAudioAction3.setGravity(17);
        textViewCustomAudioAction3.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.90
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.discardAlertRecording();
                dialog.dismiss();
            }
        });
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, dp(52), 1.0f);
        layoutParams4.rightMargin = dp(5);
        linearLayout.addView(textViewCustomAudioAction3, layoutParams4);
        this.alertRecordSaveButton = customAudioAction("Lưu", false);
        this.alertRecordSaveButton.setGravity(17);
        this.alertRecordSaveButton.setTextColor(COLOR_ACCENT);
        this.alertRecordSaveButton.setEnabled(false);
        this.alertRecordSaveButton.setAlpha(0.45f);
        this.alertRecordSaveButton.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.91
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModSettingsActivity.this.savePendingAlertRecording();
            }
        });
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, dp(52), 1.0f);
        layoutParams5.leftMargin = dp(5);
        linearLayout.addView(this.alertRecordSaveButton, layoutParams5);
        linearLayoutCreateAmbientSheet.addView(linearLayout, actionLayoutParams(true));
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.waze.gw.ModSettingsActivity.92
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                ModSettingsActivity.this.discardAlertRecording();
            }
        });
        showBottomSheet(dialog, linearLayoutCreateAmbientSheet, dp(DisplayStrings.DS_REPORT_MENU_V2_HAZARD_ANIMALS_LABEL));
    }

    private Drawable synthwaveRecordingProgressDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-14212547);
        gradientDrawable.setCornerRadius(dp(7));
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-15079681, -8758017, -53867});
        gradientDrawable2.setCornerRadius(dp(7));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean startAlertRecording() {
        discardAlertRecording();
        String str = this.selectedAudioSlot;
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            this.alertRecordingFile = CustomAlertAudio.recordingTempFile(this, str);
            CustomAlertAudio.deleteQuietly(this.alertRecordingFile);
            MediaRecorder mediaRecorder = Build.VERSION.SDK_INT >= 31 ? new MediaRecorder(this) : new MediaRecorder();
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(2);
            mediaRecorder.setAudioEncoder(3);
            mediaRecorder.setAudioEncodingBitRate(DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE);
            mediaRecorder.setAudioSamplingRate(44100);
            mediaRecorder.setMaxDuration(15000);
            mediaRecorder.setOutputFile(this.alertRecordingFile.getAbsolutePath());
            mediaRecorder.prepare();
            mediaRecorder.start();
            this.alertRecorder = mediaRecorder;
            this.alertRecording = true;
            this.alertRecordingStartedAt = SystemClock.elapsedRealtime();
            if (this.alertRecordProgress != null) {
                this.alertRecordProgress.setProgress(0);
            }
            this.alertRecordingHandler.removeCallbacks(this.alertRecordingTimeout);
            this.alertRecordingHandler.removeCallbacks(this.alertRecordingProgressTick);
            this.alertRecordingHandler.postDelayed(this.alertRecordingTimeout, 15000L);
            this.alertRecordingHandler.post(this.alertRecordingProgressTick);
            return true;
        } catch (Throwable th) {
            discardAlertRecording();
            Toast.makeText(this, "Không thể mở micro", 1).show();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopAlertRecordingForReview() {
        boolean z;
        this.alertRecordingHandler.removeCallbacks(this.alertRecordingTimeout);
        this.alertRecordingHandler.removeCallbacks(this.alertRecordingProgressTick);
        MediaRecorder mediaRecorder = this.alertRecorder;
        this.alertRecorder = null;
        if (mediaRecorder == null) {
            z = false;
        } else {
            try {
                mediaRecorder.stop();
                z = true;
            } catch (Throwable th) {
                z = false;
            }
            try {
                mediaRecorder.release();
            } catch (Throwable th2) {
            }
        }
        this.alertRecording = false;
        if (z && this.alertRecordingFile != null && CustomAlertAudio.durationMs(this.alertRecordingFile) > 0) {
            if (this.alertRecordStatus != null) {
                this.alertRecordStatus.setText(String.format(Locale.US, "Đã thu xong  ·  %.1f giây", Float.valueOf(CustomAlertAudio.durationMs(this.alertRecordingFile) / 1000.0f)));
                this.alertRecordStatus.setTextColor(-15079681);
            }
            if (this.alertRecordProgress != null) {
                this.alertRecordProgress.setProgress((int) Math.min(15000L, Math.max(0L, CustomAlertAudio.durationMs(this.alertRecordingFile))));
            }
            if (this.alertRecordButton != null) {
                this.alertRecordButton.setVisibility(8);
            }
            if (this.alertRecordReviewActions != null) {
                this.alertRecordReviewActions.setVisibility(0);
            }
            if (this.alertRecordSaveButton != null) {
                this.alertRecordSaveButton.setEnabled(true);
                this.alertRecordSaveButton.setAlpha(1.0f);
                return;
            }
            return;
        }
        CustomAlertAudio.deleteQuietly(this.alertRecordingFile);
        this.alertRecordingFile = null;
        showRecorderReadyState();
        Toast.makeText(this, "Bản thu quá ngắn hoặc không hợp lệ", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savePendingAlertRecording() {
        stopAlertRecordPreview();
        String str = this.selectedAudioSlot;
        File file = this.alertRecordingFile;
        this.alertRecordingFile = null;
        if (str != null && !str.isEmpty() && CustomAlertAudio.commitRecording(this, str, file)) {
            this.sp.edit().putInt(CustomAlertAudio.modeKey(str), 2).putString(CustomAlertAudio.nameKey(str), "Bản tự thu").apply();
            if (this.selectedAudioSummary != null) {
                this.selectedAudioSummary.setText(customAudioLabel(str));
            }
            Toast.makeText(this, "Đã lưu bản tự thu", 0).show();
            if (this.alertRecordDialog != null) {
                this.alertRecordDialog.dismiss();
            }
        } else {
            CustomAlertAudio.deleteQuietly(file);
            Toast.makeText(this, "Bản thu quá ngắn hoặc không hợp lệ", 1).show();
        }
        this.selectedAudioSlot = "";
        this.selectedAudioSummary = null;
        this.alertRecordDialog = null;
        this.alertRecordStatus = null;
        this.alertRecordProgress = null;
        this.alertRecordButton = null;
        this.alertRecordReviewActions = null;
        this.alertRecordSaveButton = null;
        this.alertRecordingStartedAt = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRecorderReadyState() {
        if (this.alertRecordStatus != null) {
            this.alertRecordStatus.setText("Sẵn sàng thu");
            this.alertRecordStatus.setTextColor(COLOR_TEXT);
        }
        if (this.alertRecordProgress != null) {
            this.alertRecordProgress.setProgress(0);
        }
        if (this.alertRecordButton != null) {
            this.alertRecordButton.setText("Bắt đầu thu");
            this.alertRecordButton.setVisibility(0);
        }
        if (this.alertRecordReviewActions != null) {
            this.alertRecordReviewActions.setVisibility(8);
        }
        if (this.alertRecordSaveButton != null) {
            this.alertRecordSaveButton.setEnabled(false);
            this.alertRecordSaveButton.setAlpha(0.45f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void previewPendingAlertRecording() {
        stopAlertRecordPreview();
        File file = this.alertRecordingFile;
        if (file == null || !file.isFile()) {
            return;
        }
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.alertRecordPreviewPlayer = mediaPlayer;
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(12).setContentType(1).build());
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.waze.gw.ModSettingsActivity.93
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer2) {
                    ModSettingsActivity.this.stopAlertRecordPreview();
                    if (ModSettingsActivity.this.alertRecordStatus != null) {
                        ModSettingsActivity.this.alertRecordStatus.setText("Đã nghe xong  ·  có thể lưu");
                    }
                }
            });
            mediaPlayer.prepare();
            mediaPlayer.start();
            if (this.alertRecordStatus != null) {
                this.alertRecordStatus.setText("▶  Đang phát bản thu…");
            }
        } catch (Throwable th) {
            stopAlertRecordPreview();
            Toast.makeText(this, "Không thể phát bản thu", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopAlertRecordPreview() {
        MediaPlayer mediaPlayer = this.alertRecordPreviewPlayer;
        this.alertRecordPreviewPlayer = null;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Throwable th) {
            }
            try {
                mediaPlayer.release();
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void discardAlertRecording() {
        stopAlertRecordPreview();
        this.alertRecordingHandler.removeCallbacks(this.alertRecordingTimeout);
        this.alertRecordingHandler.removeCallbacks(this.alertRecordingProgressTick);
        MediaRecorder mediaRecorder = this.alertRecorder;
        this.alertRecorder = null;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Throwable th) {
            }
            try {
                mediaRecorder.release();
            } catch (Throwable th2) {
            }
        }
        this.alertRecording = false;
        CustomAlertAudio.deleteQuietly(this.alertRecordingFile);
        this.alertRecordingFile = null;
        this.alertRecordingStartedAt = 0L;
        if (this.alertRecordProgress != null) {
            this.alertRecordProgress.setProgress(0);
        }
    }

    private void addGpsSettings(LinearLayout linearLayout) {
        addGpsQualityCard(linearLayout);
        addSection(linearLayout, "GPS (chỉ dùng 1 trong 2 kiểu)");
        final SeekBar seekBarAddSlider = addSlider(linearLayout, "Hiệu chỉnh tốc độ GPS (± km/h)", "gps_offset", -10, 10, 1, 0, " km/h", true, "Điều chỉnh GPS có thể gây ra sai lệch tốc độ", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.94
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.resetSlider(seekBarArr[0], 0);
            }
        });
        final SeekBar[] seekBarArr = {addSlider(linearLayout, "Hiệu chỉnh tốc độ GPS (cộng thêm %)", "gps_pct", 0, 10, 1, 0, "%", true, "Cộng theo tỷ lệ — khớp đồng hồ xe tốt hơn. Đổi kiểu này sẽ đưa ± km/h về 0", new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.95
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.resetSlider(seekBarAddSlider, 0);
            }
        })};
        addInfoCard(linearLayout, "Android Auto dùng tốc độ GPS đã hiệu chỉnh từ điện thoại", "Không can thiệp luồng định vị riêng của Android Auto để tránh cộng hai lần và giảm nguy cơ treo ứng dụng.");
    }

    private void addGpsQualityCard(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(16), dp(15), dp(16), dp(14));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(16));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dp(14);
        linearLayout.addView(linearLayout2, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        this.gpsDetailSignal = new GpsSignalView(this);
        linearLayout3.addView(this.gpsDetailSignal, new LinearLayout.LayoutParams(dp(52), dp(52)));
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setText("Chất lượng định vị hiện tại");
        textView.setTextSize(18.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout4.addView(textView);
        this.gpsDetailStatus = new TextView(this);
        this.gpsDetailStatus.setTextSize(15.0f);
        this.gpsDetailStatus.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = dp(3);
        linearLayout4.addView(this.gpsDetailStatus, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams3.leftMargin = dp(14);
        linearLayout3.addView(linearLayout4, layoutParams3);
        linearLayout2.addView(linearLayout3);
        View view = new View(this);
        view.setBackgroundColor(COLOR_BORDER);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, dp(1));
        layoutParams4.topMargin = dp(13);
        layoutParams4.bottomMargin = dp(7);
        linearLayout2.addView(view, layoutParams4);
        this.gpsDetailAccuracy = addGpsMetric(linearLayout2, "Độ chính xác");
        this.gpsDetailAge = addGpsMetric(linearLayout2, "Lần cập nhật");
        this.gpsDetailSource = addGpsMetric(linearLayout2, "Nguồn dữ liệu");
        this.gpsDetailLevel = addGpsMetric(linearLayout2, "Mức tín hiệu");
        TextView textView2 = new TextView(this);
        textView2.setText("Chất lượng được tính từ sai số vị trí và độ mới của fix GPS, không phải số vệ tinh.");
        textView2.setTextSize(12.0f);
        textView2.setTextColor(COLOR_MUTED);
        textView2.setPadding(0, dp(9), 0, 0);
        linearLayout2.addView(textView2);
        this.gpsUiHandler.removeCallbacks(this.gpsUiTick);
        this.gpsUiHandler.post(this.gpsUiTick);
    }

    private TextView addGpsMetric(LinearLayout linearLayout, String str) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(0, dp(6), 0, dp(6));
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(COLOR_MUTED);
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(this);
        textView2.setText("--");
        textView2.setTextSize(15.0f);
        textView2.setTextColor(COLOR_TEXT);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        return textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateGpsQualityCard() {
        if (this.gpsDetailSignal == null || this.gpsDetailStatus == null) {
            return;
        }
        int iGpsInstantSignalLevel = Gateway.gpsInstantSignalLevel();
        this.gpsDetailSignal.setLevel(iGpsInstantSignalLevel);
        this.gpsDetailStatus.setText(new String[]{"Chưa có tín hiệu", "Rất yếu", "Yếu", "Tốt", "Rất tốt"}[iGpsInstantSignalLevel]);
        this.gpsDetailStatus.setTextColor(GpsSignalView.colorForLevel(iGpsInstantSignalLevel));
        double dGpsAccuracyMeters = Gateway.gpsAccuracyMeters();
        if (dGpsAccuracyMeters > AudioStats.AUDIO_AMPLITUDE_NONE) {
            this.gpsDetailAccuracy.setText(dGpsAccuracyMeters < 10.0d ? String.format(Locale.US, "±%.1f m", Double.valueOf(dGpsAccuracyMeters)) : "±" + Math.round(dGpsAccuracyMeters) + " m");
        } else {
            this.gpsDetailAccuracy.setText("Chưa có dữ liệu");
        }
        long jGpsFixAgeMs = Gateway.gpsFixAgeMs();
        if (jGpsFixAgeMs == Long.MAX_VALUE) {
            this.gpsDetailAge.setText("Chưa nhận fix");
        } else if (jGpsFixAgeMs < 1500) {
            this.gpsDetailAge.setText("Vừa cập nhật");
        } else {
            this.gpsDetailAge.setText((jGpsFixAgeMs / 1000) + " giây trước");
        }
        String strGpsFixSource = Gateway.gpsFixSource();
        TextView textView = this.gpsDetailSource;
        if (strGpsFixSource == null || strGpsFixSource.length() == 0) {
            strGpsFixSource = "--";
        }
        textView.setText(strGpsFixSource);
        this.gpsDetailLevel.setText(iGpsInstantSignalLevel + " / 4");
        this.gpsDetailLevel.setTextColor(GpsSignalView.colorForLevel(iGpsInstantSignalLevel));
    }

    private void addFloatSpeedoSettings(LinearLayout linearLayout) {
        addSection(linearLayout, "Đồng hồ nổi trên bản đồ");
        addSwitch(linearLayout, "Đồng hồ tốc độ nổi trên map (kéo để đặt vị trí)", CAT_FLOAT_SPEEDO, true);
        addSwitch(linearLayout, "Nhấn giữ FloatSpeedo để mở HUD", "float_speedo_long_press_hud", true);
        final FloatSpeedoPreview[] floatSpeedoPreviewArr = {addFloatSpeedoPreview(linearLayout)};
        addFloatSpeedoLayoutPicker(linearLayout, floatSpeedoPreviewArr);
        addSwitch(linearLayout, "In đậm số tốc độ tối đa / tối thiểu", "float_speed_sign_bold", true, new BoolCb(this) { // from class: com.waze.gw.ModSettingsActivity.96
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // com.waze.gw.ModSettingsActivity.BoolCb
            public void on(boolean z) {
                if (floatSpeedoPreviewArr[0] != null) {
                    floatSpeedoPreviewArr[0].setBold(z);
                }
            }
        });
        addSlider(linearLayout, "Kích thước đồng hồ nổi", "fs_size", 80, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11, 10, 130, "%", false, null, new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.97
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (floatSpeedoPreviewArr[0] != null) {
                    floatSpeedoPreviewArr[0].setSizePercent(this.this$0.sp.getInt("fs_size", 130));
                }
            }
        });
    }

    private void addFloatSpeedoLayoutPicker(LinearLayout linearLayout, final FloatSpeedoPreview[] floatSpeedoPreviewArr) {
        linearLayout.addView(pickerTitle("Kiểu đồng hồ nổi"), pickerTitleParams());
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(dp(2), dp(2), dp(2), dp(2));
        int iMax = Math.max(dp(150), Math.min(dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11), (getResources().getDisplayMetrics().widthPixels - dp(56)) / 2));
        int iDp = dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_4);
        final FrameLayout[] frameLayoutArr = {floatSpeedoLayoutCard(4, "Mặc định"), floatSpeedoLayoutCard(1, "Viên thuốc"), floatSpeedoLayoutCard(2, "Huy hiệu"), floatSpeedoLayoutCard(3, "Hai cụm")};
        final int[] iArr = {4, 1, 2, 3};
        for (int i2 = 0; i2 < 4; i2++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, iDp);
            if (i2 > 0) {
                layoutParams.leftMargin = dp(12);
            }
            linearLayout2.addView(frameLayoutArr[i2], layoutParams);
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-2, -2));
        linearLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        int i3 = this.sp.getInt("fs_layout", 4);
        if (i3 < 1 || i3 > 4) {
            i3 = 4;
        }
        updateFloatSpeedoLayoutCards(frameLayoutArr, iArr, i3);
        for (int i4 = 0; i4 < 4; i4++) {
            final int i5 = iArr[i4];
            frameLayoutArr[i4].setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.98
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    this.this$0.sp.edit().putInt("fs_layout", i5).apply();
                    this.this$0.updateFloatSpeedoLayoutCards(frameLayoutArr, iArr, i5);
                    if (floatSpeedoPreviewArr[0] != null) {
                        floatSpeedoPreviewArr[0].setLayoutStyle(i5);
                    }
                }
            });
        }
    }

    private FrameLayout floatSpeedoLayoutCard(int i2, String str) {
        String str2;
        if (i2 == 1) {
            str2 = "settings_demo/preset_1.png";
        } else if (i2 == 2) {
            str2 = "settings_demo/preset_2.png";
        } else {
            str2 = i2 == 3 ? "settings_demo/preset_3.png" : "settings_demo/preset_default.png";
        }
        return bubbleLayoutCard(str2, str, true);
    }

    private void addAaSpeedoLayoutPicker(LinearLayout linearLayout) {
        linearLayout.addView(pickerTitle("Kiểu đồng hồ Android Auto"), pickerTitleParams());
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(dp(2), dp(2), dp(2), dp(2));
        int iMax = Math.max(dp(150), Math.min(dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11), (getResources().getDisplayMetrics().widthPixels - dp(56)) / 2));
        int iDp = dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_4);
        final FrameLayout[] frameLayoutArr = {bubbleLayoutCard("settings_demo/preset_3.png", "Hai cụm (hiện tại)", true), bubbleLayoutCard("settings_demo/preset_2.png", "Huy hiệu", true), bubbleLayoutCard("settings_demo/preset_default.png", "Chỉ biển tốc độ", true)};
        final int[] iArr = {3, 2, 4};
        for (int i2 = 0; i2 < 3; i2++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, iDp);
            if (i2 > 0) {
                layoutParams.leftMargin = dp(12);
            }
            linearLayout2.addView(frameLayoutArr[i2], layoutParams);
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-2, -2));
        linearLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        int i3 = this.sp.getInt("aa_fs_layout", 3);
        if (i3 != 2 && i3 != 4) {
            i3 = 3;
        }
        updateFloatSpeedoLayoutCards(frameLayoutArr, iArr, i3);
        for (int i4 = 0; i4 < 3; i4++) {
            final int i5 = iArr[i4];
            frameLayoutArr[i4].setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.99
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    this.this$0.sp.edit().putInt("aa_fs_layout", i5).apply();
                    this.this$0.updateFloatSpeedoLayoutCards(frameLayoutArr, iArr, i5);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFloatSpeedoLayoutCards(FrameLayout[] frameLayoutArr, int[] iArr, int i2) {
        for (int i3 = 0; i3 < frameLayoutArr.length; i3++) {
            styleBubbleLayoutCard(frameLayoutArr[i3], i2 == iArr[i3]);
        }
    }

    private final class NativeSpeedoPreview {
        final View gauge;

        NativeSpeedoPreview(View view) {
            this.gauge = view;
        }

        void setSizePercent(int i2) {
            final float fMax = Math.max(1.0f, Math.min(2.0f, i2 / 100.0f));
            this.gauge.post(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.NativeSpeedoPreview.1
                final /* synthetic */ NativeSpeedoPreview this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.gauge.setPivotX(this.this$1.gauge.getWidth() / 2.0f);
                    this.this$1.gauge.setPivotY(this.this$1.gauge.getHeight() / 2.0f);
                    this.this$1.gauge.setScaleX(fMax);
                    this.this$1.gauge.setScaleY(fMax);
                    this.this$1.gauge.invalidate();
                }
            });
        }
    }

    private NativeSpeedoPreview addNativeSpeedoPreview(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(14), dp(10), dp(14), dp(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        TextView textView = new TextView(this);
        textView.setText("Xem trước đồng hồ tốc độ gốc Waze");
        textView.setTextSize(14.0f);
        textView.setTextColor(COLOR_MUTED);
        linearLayout2.addView(textView);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1709331);
        gradientDrawable2.setCornerRadius(dp(12));
        frameLayout.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, dp(240));
        layoutParams2.topMargin = dp(8);
        linearLayout2.addView(frameLayout, layoutParams2);
        View viewFallbackNativeSpeedoPreview = null;
        try {
            int iWazeResourceId = wazeResourceId("speedometer", "layout");
            if (iWazeResourceId != 0) {
                View viewInflate = LayoutInflater.from(this).inflate(iWazeResourceId, (ViewGroup) frameLayout, false);
                try {
                    setPreviewText(viewInflate, "speedText", "50");
                    setPreviewText(viewInflate, "speedUnits", "km/h");
                    int iWazeResourceId2 = wazeResourceId("speedLimitWarnLayout", TtmlNode.ATTR_ID);
                    if (iWazeResourceId2 != 0) {
                        viewFallbackNativeSpeedoPreview = viewInflate.findViewById(iWazeResourceId2);
                    }
                    if (viewFallbackNativeSpeedoPreview != null) {
                        viewFallbackNativeSpeedoPreview.setVisibility(8);
                    }
                } catch (Throwable th) {
                }
                viewFallbackNativeSpeedoPreview = viewInflate;
            }
        } catch (Throwable th2) {
        }
        if (viewFallbackNativeSpeedoPreview == null) {
            viewFallbackNativeSpeedoPreview = fallbackNativeSpeedoPreview();
        }
        viewFallbackNativeSpeedoPreview.setClickable(false);
        viewFallbackNativeSpeedoPreview.setFocusable(false);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dp(110), dp(110));
        layoutParams3.gravity = 17;
        frameLayout.addView(viewFallbackNativeSpeedoPreview, layoutParams3);
        NativeSpeedoPreview nativeSpeedoPreview = new NativeSpeedoPreview(viewFallbackNativeSpeedoPreview);
        nativeSpeedoPreview.setSizePercent(this.sp.getInt("native_speedo_size", 100));
        return nativeSpeedoPreview;
    }

    private int wazeResourceId(String str, String str2) {
        int identifier = getResources().getIdentifier(str, str2, "com.waze");
        return identifier == 0 ? getResources().getIdentifier(str, str2, getPackageName()) : identifier;
    }

    private void setPreviewText(View view, String str, String str2) {
        int iWazeResourceId = wazeResourceId(str, TtmlNode.ATTR_ID);
        if (iWazeResourceId == 0) {
            return;
        }
        View viewFindViewById = view.findViewById(iWazeResourceId);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setText(str2);
        }
    }

    private View fallbackNativeSpeedoPreview() {
        TextView textView = new TextView(this);
        textView.setText("50\nkm/h");
        textView.setTextColor(-1);
        textView.setTextSize(24.0f);
        textView.setGravity(17);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setBackground(previewOval(-13354947, dp(6), -9866886));
        return textView;
    }

    private final class FloatSpeedoPreview {
        boolean bold;
        final FloatSpeedo gauge;
        int sizePercent;
        int style;

        FloatSpeedoPreview(FloatSpeedo floatSpeedo) {
            this.gauge = floatSpeedo;
        }

        void setSizePercent(int i2) {
            this.sizePercent = i2;
            apply();
        }

        void setBold(boolean z) {
            this.bold = z;
            apply();
        }

        void setLayoutStyle(int i2) {
            if (i2 < 1 || i2 > 4) {
                i2 = 4;
            }
            this.style = i2;
            apply();
        }

        private void apply() {
            this.gauge.configurePreview(this.style, this.sizePercent <= 0 ? 130 : this.sizePercent, this.bold);
            this.gauge.post(new Runnable() { // from class: com.waze.gw.ModSettingsActivity.FloatSpeedoPreview.1
                @Override // java.lang.Runnable
                public void run() {
                    FloatSpeedoPreview.this.gauge.setPivotX(FloatSpeedoPreview.this.gauge.getWidth() / 2.0f);
                    FloatSpeedoPreview.this.gauge.setPivotY(FloatSpeedoPreview.this.gauge.getHeight() / 2.0f);
                }
            });
        }
    }

    private FloatSpeedoPreview addFloatSpeedoPreview(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(14), dp(10), dp(14), dp(10));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        TextView textView = new TextView(this);
        textView.setText("Xem trước");
        textView.setTextSize(14.0f);
        textView.setTextColor(COLOR_MUTED);
        linearLayout2.addView(textView);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayout2.addView(frameLayout, new LinearLayout.LayoutParams(-1, dp(DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN)));
        FloatSpeedo floatSpeedo = new FloatSpeedo(this, true);
        floatSpeedo.setClickable(false);
        floatSpeedo.setFocusable(false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(floatSpeedo, layoutParams2);
        FloatSpeedoPreview floatSpeedoPreview = new FloatSpeedoPreview(floatSpeedo);
        floatSpeedoPreview.setLayoutStyle(this.sp.getInt("fs_layout", 4));
        floatSpeedoPreview.setBold(this.sp.getBoolean("float_speed_sign_bold", true));
        floatSpeedoPreview.setSizePercent(this.sp.getInt("fs_size", 130));
        return floatSpeedoPreview;
    }

    private TextView previewSpeedText(String str, int i2, int i3) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(i2);
        textView.setTextColor(i3);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        ModTypeface.applySpeed(textView);
        return textView;
    }

    private void applyPreviewSpeedWeight(TextView textView, boolean z, float f2) {
        Paint.Style style;
        TextPaint paint = textView.getPaint();
        if (z) {
            style = Paint.Style.FILL_AND_STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
        textView.getPaint().setStrokeWidth(z ? textView.getTextSize() * f2 : 0.0f);
        textView.invalidate();
    }

    private GradientDrawable previewOval(int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        if (i3 > 0) {
            gradientDrawable.setStroke(i3, i4);
        }
        return gradientDrawable;
    }

    private void addBubbleSettings(LinearLayout linearLayout) {
        addSection(linearLayout, "Bong bóng nổi");
        addSwitch(linearLayout, "Bong bóng nổi trên app khác (tốc độ + cảnh báo)", CAT_BUBBLE, false, new BoolCb() { // from class: com.waze.gw.ModSettingsActivity.100
            @Override // com.waze.gw.ModSettingsActivity.BoolCb
            public void on(boolean z) {
                if (z) {
                    if (!Bubble.canShow(ModSettingsActivity.this)) {
                        Bubble.requestPermission(ModSettingsActivity.this);
                    }
                    Bubble.installAutoHide(ModSettingsActivity.this.getApplicationContext());
                    Toast.makeText(ModSettingsActivity.this, "Bong bóng sẽ hiện khi bạn rời khỏi Waze", 1).show();
                    return;
                }
                Bubble.hide();
                BubbleKeepAliveService.sync(ModSettingsActivity.this);
            }
        });
        addBubbleLayoutPicker(linearLayout);
        addSlider(linearLayout, "Cỡ bong bóng", "bub_size", 80, 200, 10, 100, "%", false, null, new Runnable() { // from class: com.waze.gw.ModSettingsActivity.101
            @Override // java.lang.Runnable
            public void run() {
                Bubble.refresh();
            }
        });
    }

    private void addInfoCard(LinearLayout linearLayout, String str, String str2) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(16), dp(15), dp(16), dp(15));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(17.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText(str2);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(COLOR_MUTED);
        textView2.setPadding(0, dp(5), 0, 0);
        linearLayout2.addView(textView2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.selectedSubpage != null) {
            returnToAlertsPage();
        } else if (!this.wideSettings && this.selectedCategory != null) {
            showCategoryMenu();
        } else {
            super.onBackPressed();
        }
    }

    private LinearLayout addCategory(LinearLayout linearLayout, String str, String str2) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(12), dp(12), dp(12), dp(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(COLOR_PANEL);
        gradientDrawable.setCornerRadius(dp(20));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        View view = new View(this);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(COLOR_ACCENT);
        gradientDrawable2.setCornerRadius(dp(3));
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp(5), dp(42));
        layoutParams.rightMargin = dp(11);
        linearLayout3.addView(view, layoutParams);
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(19.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout4.addView(textView);
        if (str2 != null && str2.length() != 0) {
            TextView textView2 = new TextView(this);
            textView2.setText(str2);
            textView2.setTextSize(13.0f);
            textView2.setTextColor(COLOR_MUTED);
            textView2.setPadding(0, dp(2), 0, 0);
            linearLayout4.addView(textView2);
        }
        linearLayout3.addView(linearLayout4, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(14);
        linearLayout.addView(linearLayout2, layoutParams2);
        return linearLayout2;
    }

    private void addSection(LinearLayout linearLayout, String str) {
        TextView textView = new TextView(this);
        textView.setText(str.toUpperCase());
        textView.setTextSize(12.0f);
        textView.setTextColor(COLOR_MUTED);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(16);
        layoutParams.bottomMargin = dp(4);
        linearLayout.addView(textView, layoutParams);
    }

    private void addMapBuildStatus(LinearLayout linearLayout) {
        addSection(linearLayout, "Dữ liệu bản đồ");
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(16), dp(15), dp(16), dp(14));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-15329764);
        gradientDrawable.setCornerRadius(dp(16));
        linearLayout2.setBackground(gradientDrawable);
        linearLayout2.setClickable(true);
        linearLayout2.setFocusable(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("CẬP NHẬT BẢN ĐỒ WAZE");
        textView.setTextSize(14.0f);
        textView.setTextColor(-1184275);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(this);
        textView2.setText("↻");
        textView2.setTextSize(25.0f);
        textView2.setTextColor(COLOR_ACCENT);
        textView2.setGravity(17);
        linearLayout3.addView(textView2, new LinearLayout.LayoutParams(dp(36), dp(36)));
        linearLayout2.addView(linearLayout3);
        this.mapBuildBadge = new TextView(this);
        this.mapBuildBadge.setText("ĐANG KẾT NỐI");
        this.mapBuildBadge.setTextSize(11.0f);
        this.mapBuildBadge.setTextColor(-1);
        this.mapBuildBadge.setTypeface(Typeface.DEFAULT_BOLD);
        this.mapBuildBadge.setGravity(17);
        this.mapBuildBadge.setPadding(dp(10), dp(5), dp(10), dp(5));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = dp(4);
        linearLayout2.addView(this.mapBuildBadge, layoutParams2);
        styleMapBuildBadge(-9538439);
        this.mapBuildEta = new TextView(this);
        this.mapBuildEta.setText("Đang lấy lịch cập nhật…");
        this.mapBuildEta.setTextSize(20.0f);
        this.mapBuildEta.setTextColor(COLOR_ACCENT);
        this.mapBuildEta.setTypeface(Typeface.DEFAULT_BOLD);
        this.mapBuildEta.setLineSpacing(0.0f, 1.08f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = dp(12);
        linearLayout2.addView(this.mapBuildEta, layoutParams3);
        this.mapBuildProgress = new ProgressBar(this, null, R.attr.progressBarStyleHorizontal);
        this.mapBuildProgress.setMax(100);
        this.mapBuildProgress.setIndeterminate(true);
        try {
            this.mapBuildProgress.setProgressTintList(ColorStateList.valueOf(COLOR_ACCENT));
            this.mapBuildProgress.setProgressBackgroundTintList(ColorStateList.valueOf(-13355970));
            this.mapBuildProgress.setIndeterminateTintList(ColorStateList.valueOf(COLOR_ACCENT));
        } catch (Throwable th) {
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, dp(7));
        layoutParams4.topMargin = dp(12);
        linearLayout2.addView(this.mapBuildProgress, layoutParams4);
        this.mapBuildDetails = new TextView(this);
        this.mapBuildDetails.setText("Thông tin tiến độ sẽ xuất hiện tại đây.");
        this.mapBuildDetails.setTextSize(14.0f);
        this.mapBuildDetails.setTextColor(-2960681);
        this.mapBuildDetails.setLineSpacing(dp(3), 1.0f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = dp(12);
        linearLayout2.addView(this.mapBuildDetails, layoutParams5);
        this.mapBuildFetched = new TextView(this);
        this.mapBuildFetched.setText("Chạm vào thẻ để làm mới");
        this.mapBuildFetched.setTextSize(12.0f);
        this.mapBuildFetched.setTextColor(-8947840);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = dp(10);
        linearLayout2.addView(this.mapBuildFetched, layoutParams6);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.waze.gw.ModSettingsActivity.102
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ModSettingsActivity.this.fetchMapBuildStatus();
            }
        });
        String string = this.sp.getString(MAP_BUILD_CACHE, "");
        if (string.length() > 0) {
            renderMapBuildStatus(string, this.sp.getLong(MAP_BUILD_FETCHED, 0L), true);
        }
    }

    private void addModDatasetStatus(LinearLayout linearLayout) {
        addSection(linearLayout, "Dữ liệu Waze Mod");
        final TextView textViewAddDatasetStatusCard = addDatasetStatusCard(linearLayout, "Dữ liệu theo đoạn đường");
        final TextView textViewAddDatasetStatusCard2 = addDatasetStatusCard(linearLayout, "Dữ liệu điểm WME");
        LinearLayout linearLayoutRow = row(linearLayout, "Kiểm tra dữ liệu điểm WME ngay");
        linearLayoutRow.setClickable(true);
        linearLayoutRow.setFocusable(true);
        linearLayoutRow.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.103
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                textViewAddDatasetStatusCard2.setText("Đang kiểm tra manifest và database...");
                Context applicationContext = this.this$0.getApplicationContext();
                final TextView textView = textViewAddDatasetStatusCard;
                final TextView textView2 = textViewAddDatasetStatusCard2;
                PointNoticeClient.checkNow(applicationContext, new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.103.1
                    final /* synthetic */ AnonymousClass103 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.this$1.this$0.refreshModDatasetStatus(textView, textView2);
                    }
                });
            }
        });
        refreshModDatasetStatus(textViewAddDatasetStatusCard, textViewAddDatasetStatusCard2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshModDatasetStatus(final TextView textView, final TextView textView2) {
        Thread thread = new Thread(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.104
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Context applicationContext = this.this$0.getApplicationContext();
                final RoadNoticeDatabase roadNoticeDatabase = RoadNoticeClient.get(applicationContext);
                final PointNoticeDatabase pointNoticeDatabase = PointNoticeClient.get(applicationContext);
                SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("waze_road_notice_client", 0);
                SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("waze_point_notice_client", 0);
                final long j2 = sharedPreferences.getLong("last_check_ms", 0L);
                final long j3 = sharedPreferences2.getLong("last_check_ms", 0L);
                final String string = sharedPreferences2.getString("server_version", "");
                final String string2 = sharedPreferences2.getString("last_result", "");
                ModSettingsActivity modSettingsActivity = this.this$0;
                final TextView textView3 = textView;
                final TextView textView4 = textView2;
                modSettingsActivity.runOnUiThread(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.104.1
                    final /* synthetic */ AnonymousClass104 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (this.this$1.this$0.isFinishing()) {
                            return;
                        }
                        if (roadNoticeDatabase == null) {
                            textView3.setText("Chưa có database hợp lệ" + this.this$1.this$0.checkedSuffix(j2));
                        } else {
                            textView3.setText("Phiên bản " + roadNoticeDatabase.datasetVersion + "  •  " + roadNoticeDatabase.segmentIds.length + " đoạn  •  " + roadNoticeDatabase.pointOffsets.length + " điểm\nMap build mục tiêu: " + roadNoticeDatabase.targetMapBuildId + "\nTạo lúc: " + this.this$1.this$0.formatLocalMillis(roadNoticeDatabase.generatedAtMs) + this.this$1.this$0.checkedSuffix(j2));
                        }
                        if (pointNoticeDatabase == null) {
                            textView4.setText("Chưa có database hợp lệ" + this.this$1.this$0.serverVersionSuffix(string) + this.this$1.this$0.datasetResultSuffix(string2) + this.this$1.this$0.checkedSuffix(j3));
                            return;
                        }
                        textView4.setText("Phiên bản " + pointNoticeDatabase.datasetVersion + "  •  spatial z" + pointNoticeDatabase.spatialZoom + this.this$1.this$0.serverVersionSuffix(string) + "\nTạo lúc: " + this.this$1.this$0.formatLocalMillis(pointNoticeDatabase.generatedAtMs) + this.this$1.this$0.datasetResultSuffix(string2) + this.this$1.this$0.checkedSuffix(j3));
                    }
                });
            }
        }, "WazeGW-settings-data-version");
        thread.setDaemon(true);
        thread.start();
    }

    private TextView addDatasetStatusCard(LinearLayout linearLayout, String str) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(16), dp(14), dp(16), dp(14));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(17.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText("Đang đọc phiên bản...");
        textView2.setTextSize(14.0f);
        textView2.setTextColor(COLOR_MUTED);
        textView2.setPadding(0, dp(5), 0, 0);
        textView2.setLineSpacing(0.0f, 1.15f);
        linearLayout2.addView(textView2);
        return textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String checkedSuffix(long j2) {
        if (j2 > 0) {
            return "\nKiểm tra máy chủ: " + formatLocalMillis(j2);
        }
        return "\nChưa kiểm tra máy chủ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String serverVersionSuffix(String str) {
        return (str == null || str.length() == 0) ? "" : "\nPhiên bản trên máy chủ: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String datasetResultSuffix(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if ("UP_TO_DATE".equals(str)) {
            return "\nTrạng thái: Đã là bản mới nhất";
        }
        if ("UPDATED".equals(str)) {
            return "\nTrạng thái: Đã cập nhật";
        }
        if ("DOWNLOADING".equals(str)) {
            return "\nTrạng thái: Đang tải";
        }
        if ("NO_DATA".equals(str)) {
            return "\nTrạng thái: Máy chủ chưa phát hành";
        }
        if (!str.startsWith("ERROR: ")) {
            return "\nTrạng thái: " + str;
        }
        return "\nLỗi cập nhật: " + str.substring(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchMapBuildStatus() {
        if (this.mapBuildLoading || this.mapBuildFetched == null) {
            return;
        }
        this.mapBuildLoading = true;
        this.mapBuildFetched.setText("Đang làm mới trạng thái…");
        new Thread(new Runnable() { // from class: com.waze.gw.ModSettingsActivity.105
            @Override // java.lang.Runnable
            public void run() {
                HttpURLConnection httpURLConnection;
                int responseCode;
                BufferedReader bufferedReader = null;
                try {
                    httpURLConnection = (HttpURLConnection) new URL(ModSettingsActivity.MAP_BUILD_URL).openConnection();
                    try {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                        httpURLConnection.setConnectTimeout(8000);
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setRequestProperty("Accept", "application/json");
                        DiagnosticsLogger.networkStart("waze-map-build", httpURLConnection);
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (Throwable th) {
                    }
                } catch (Throwable th2) {
                    httpURLConnection = null;
                }
                if (responseCode != 200) {
                    DiagnosticsLogger.networkEnd("waze-map-build", httpURLConnection, responseCode, 0L, null);
                    throw new IOException("HTTP " + responseCode);
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    }
                    final String string = sb.toString();
                    DiagnosticsLogger.networkEnd("waze-map-build", httpURLConnection, responseCode, string.getBytes(StandardCharsets.UTF_8).length, null);
                    JSONObject jSONObject = new JSONObject(string);
                    if (jSONObject.optJSONObject("current_build") == null && jSONObject.optJSONObject("previous_build") == null && jSONObject.optJSONObject("next_build") == null) {
                        throw new JSONException("No build status objects");
                    }
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    ModSettingsActivity.this.sp.edit().putString(ModSettingsActivity.MAP_BUILD_CACHE, string).putLong(ModSettingsActivity.MAP_BUILD_FETCHED, jCurrentTimeMillis).apply();
                    ModSettingsActivity.this.runOnUiThread(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.105.1
                        final /* synthetic */ AnonymousClass105 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            ModSettingsActivity.this.mapBuildLoading = false;
                            if (!ModSettingsActivity.this.isFinishing()) {
                                ModSettingsActivity.this.renderMapBuildStatus(string, jCurrentTimeMillis, false);
                            }
                        }
                    });
                    try {
                        bufferedReader2.close();
                    } catch (Throwable th3) {
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                } catch (Throwable th4) {
                    bufferedReader = bufferedReader2;
                    try {
                        ModSettingsActivity.this.runOnUiThread(new Runnable() { // from class: com.waze.gw.ModSettingsActivity.105.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ModSettingsActivity.this.mapBuildLoading = false;
                                if (ModSettingsActivity.this.isFinishing()) {
                                    return;
                                }
                                if (ModSettingsActivity.this.sp.getString(ModSettingsActivity.MAP_BUILD_CACHE, "").length() > 0) {
                                    ModSettingsActivity.this.mapBuildFetched.setText("Không thể làm mới • đang hiển thị dữ liệu đã lưu");
                                    return;
                                }
                                ModSettingsActivity.this.mapBuildProgress.setIndeterminate(false);
                                ModSettingsActivity.this.mapBuildProgress.setProgress(0);
                                ModSettingsActivity.this.mapBuildBadge.setText("CHƯA KẾT NỐI");
                                ModSettingsActivity.this.styleMapBuildBadge(-2061790);
                                ModSettingsActivity.this.mapBuildEta.setText("Chưa lấy được lịch cập nhật bản đồ");
                                ModSettingsActivity.this.mapBuildDetails.setText("Kiểm tra kết nối mạng rồi chạm vào thẻ để thử lại.");
                                ModSettingsActivity.this.mapBuildFetched.setText("Nguồn: Waze INTL Tile Build");
                            }
                        });
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th5) {
                            }
                        }
                        if (httpURLConnection == null) {
                            return;
                        }
                        httpURLConnection.disconnect();
                    } finally {
                    }
                }
                httpURLConnection.disconnect();
            }
        }, "WazeMapBuildStatus").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderMapBuildStatus(String str, long j2, boolean z) {
        String upperCase;
        int i2;
        String strOptString;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("current_build");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("previous_build");
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("next_build");
            if (jSONObjectOptJSONObject == null && jSONObjectOptJSONObject2 == null && jSONObjectOptJSONObject3 == null) {
                throw new JSONException("No build status objects");
            }
            boolean z2 = jSONObjectOptJSONObject != null;
            JSONObject jSONObject2 = z2 ? jSONObjectOptJSONObject : jSONObjectOptJSONObject3;
            if (jSONObject2 != null) {
                upperCase = jSONObject2.optString("build_status", z2 ? "UNKNOWN" : "PENDING").toUpperCase(Locale.US);
            } else {
                upperCase = "IDLE";
            }
            int iMax = z2 ? Math.max(0, Math.min(100, jSONObjectOptJSONObject.optInt("progress_percent", 0))) : 0;
            String isoTime = formatIsoTime(jSONObject2 != null ? jSONObject2.optString("estimated_completion_time", "") : "");
            if (!z2 && jSONObjectOptJSONObject3 == null) {
                this.mapBuildBadge.setText("ĐÃ CẬP NHẬT");
                this.mapBuildEta.setText("Bản đồ hiện tại phát hành\n" + (jSONObjectOptJSONObject2 != null ? formatIsoTime(jSONObjectOptJSONObject2.optString("release_time", "")) : "chưa xác định"));
                i2 = -13718160;
                iMax = 100;
            } else if ("RUNNING".equals(upperCase)) {
                this.mapBuildBadge.setText("ĐANG XỬ LÝ • " + iMax + "%");
                int i3 = COLOR_ACCENT;
                this.mapBuildEta.setText("Dự kiến bản đồ cập nhật\n" + isoTime);
                i2 = i3;
            } else if ("STARTING".equals(upperCase)) {
                this.mapBuildBadge.setText("ĐANG KHỞI TẠO");
                int i4 = COLOR_ACCENT;
                this.mapBuildEta.setText("Đợt cập nhật đang bắt đầu\nDự kiến hoàn tất " + isoTime);
                i2 = i4;
            } else if ("SOON".equals(upperCase)) {
                this.mapBuildBadge.setText("SẮP BẮT ĐẦU");
                this.mapBuildEta.setText("Đợt cập nhật kế tiếp dự kiến hoàn tất\n" + isoTime);
                i2 = -8034858;
            } else if ("PENDING".equals(upperCase)) {
                this.mapBuildBadge.setText("ĐANG CHỜ");
                this.mapBuildEta.setText("Đợt cập nhật dự kiến hoàn tất\n" + isoTime);
                i2 = -2061790;
            } else if ("COMPLETED".equals(upperCase) || "SUCCEEDED".equals(upperCase) || "SUCCESS".equals(upperCase)) {
                this.mapBuildBadge.setText("ĐÃ HOÀN TẤT");
                this.mapBuildEta.setText("Bản đồ mới đã hoàn tất xử lý");
                i2 = -13718160;
                iMax = 100;
            } else if ("FAILED".equals(upperCase) || "ERROR".equals(upperCase)) {
                this.mapBuildBadge.setText("TẠM GIÁN ĐOẠN");
                this.mapBuildEta.setText("Chưa có thời gian cập nhật mới");
                i2 = -1881269;
            } else {
                this.mapBuildBadge.setText(upperCase);
                this.mapBuildEta.setText("Dự kiến hoàn tất\n" + isoTime);
                i2 = -9538439;
            }
            styleMapBuildBadge(i2);
            this.mapBuildProgress.setIndeterminate(false);
            this.mapBuildProgress.setProgress(iMax);
            StringBuilder sb = new StringBuilder();
            if (jSONObjectOptJSONObject2 != null) {
                sb.append("Bản hiện tại phát hành: ").append(formatIsoTime(jSONObjectOptJSONObject2.optString("release_time", "")));
            }
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("last_edit_time", "");
            } else {
                strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("last_edit_time", "") : "";
            }
            if (strOptString.length() > 0) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append("Nhận chỉnh sửa đến: ").append(formatIsoTime(strOptString));
            }
            if (jSONObjectOptJSONObject3 != null) {
                String strOptString2 = jSONObjectOptJSONObject3.optString("estimated_start_time", "");
                if (strOptString2.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append("Đợt kế tiếp bắt đầu: ").append(formatIsoTime(strOptString2));
                }
                String strOptString3 = jSONObjectOptJSONObject3.optString("estimated_completion_time", "");
                if (strOptString3.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append("Đợt kế tiếp dự kiến: ").append(formatIsoTime(strOptString3));
                }
            }
            int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("delay_minutes", 0) : 0;
            if (iOptInt > 0) {
                sb.append("\nChậm hơn kế hoạch: ").append(iOptInt).append(" phút");
            }
            this.mapBuildDetails.setText(sb.length() > 0 ? sb.toString() : "Chưa có chi tiết lịch cập nhật.");
            String localMillis = j2 > 0 ? formatLocalMillis(j2) : "";
            this.mapBuildFetched.setText((z ? "Dữ liệu đã lưu" : "Cập nhật trạng thái") + (localMillis.length() > 0 ? " lúc " + localMillis : "") + " • chạm để làm mới");
        } catch (Throwable th) {
            this.mapBuildProgress.setIndeterminate(false);
            this.mapBuildProgress.setProgress(0);
            this.mapBuildBadge.setText("DỮ LIỆU KHÔNG HỢP LỆ");
            styleMapBuildBadge(-1881269);
            this.mapBuildEta.setText("Chưa đọc được lịch cập nhật bản đồ");
            this.mapBuildDetails.setText("Chạm vào thẻ để tải lại trạng thái mới.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void styleMapBuildBadge(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(dp(20));
        this.mapBuildBadge.setBackground(gradientDrawable);
    }

    private String formatIsoTime(String str) {
        if (str == null || str.length() == 0) {
            return "chưa xác định";
        }
        try {
            int length = str.endsWith("Z") ? str.length() - 1 : str.length();
            int iIndexOf = str.indexOf(46);
            if (iIndexOf >= 0) {
                String strSubstring = str.substring(iIndexOf + 1, length);
                while (strSubstring.length() < 3) {
                    strSubstring = strSubstring + "0";
                }
                if (strSubstring.length() > 3) {
                    strSubstring = strSubstring.substring(0, 3);
                }
                str = str.substring(0, iIndexOf) + "." + strSubstring + "Z";
            } else if (str.endsWith("Z")) {
                str = str.substring(0, str.length() - 1) + ".000Z";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            simpleDateFormat.setLenient(false);
            return formatVietnamTime(simpleDateFormat.parse(str));
        } catch (Throwable th) {
            return "chưa xác định";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatLocalMillis(long j2) {
        return formatVietnamTime(new Date(j2));
    }

    private String formatVietnamTime(Date date) {
        if (date == null) {
            return "chưa xác định";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm, dd/MM", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        return simpleDateFormat.format(date);
    }

    private LinearLayout row(LinearLayout linearLayout, String str) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(dp(14), dp(14), dp(14), dp(14));
        styleControlHover(linearLayout2, false);
        enableControlHover(linearLayout2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(17.0f);
        textView.setTextColor(COLOR_TEXT);
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        return linearLayout2;
    }

    private void enableControlHover(View view) {
        view.setOnHoverListener(new View.OnHoverListener() { // from class: com.waze.gw.ModSettingsActivity.106
            @Override // android.view.View.OnHoverListener
            public boolean onHover(View view2, MotionEvent motionEvent) {
                boolean z = motionEvent.getActionMasked() != 10;
                ModSettingsActivity.this.styleControlHover(view2, z);
                view2.animate().translationZ(z ? ModSettingsActivity.this.dp(2) : 0.0f).setDuration(100L).start();
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void styleControlHover(View view, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(z ? -14538957 : COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), z ? -12169116 : COLOR_BORDER);
        view.setBackground(gradientDrawable);
    }

    private void enableLiftHover(View view) {
        view.setOnHoverListener(new View.OnHoverListener() { // from class: com.waze.gw.ModSettingsActivity.107
            @Override // android.view.View.OnHoverListener
            public boolean onHover(View view2, MotionEvent motionEvent) {
                boolean z = motionEvent.getActionMasked() != 10;
                view2.animate().scaleX(z ? 1.006f : 1.0f).scaleY(z ? 1.006f : 1.0f).translationZ(z ? ModSettingsActivity.this.dp(3) : 0.0f).setDuration(100L).start();
                return false;
            }
        });
    }

    private void addSwitch(LinearLayout linearLayout, String str, String str2, boolean z) {
        addSwitch(linearLayout, str, str2, z, null);
    }

    private void addSwitch(LinearLayout linearLayout, String str, final String str2, boolean z, final BoolCb boolCb) {
        LinearLayout linearLayoutRow = row(linearLayout, str);
        Switch r6 = new Switch(this);
        try {
            r6.setShowText(false);
            int[][] iArr = {new int[]{R.attr.state_checked}, new int[0]};
            r6.setThumbTintList(new ColorStateList(iArr, new int[]{COLOR_ACCENT, -3158065}));
            r6.setTrackTintList(new ColorStateList(iArr, new int[]{AmbientTheme.withAlpha(COLOR_ACCENT, 128), 1090519039}));
        } catch (Throwable th) {
        }
        r6.setChecked(this.sp.getBoolean(str2, z));
        r6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.waze.gw.ModSettingsActivity.108
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.this$0.sp.edit().putBoolean(str2, z2).apply();
                if (boolCb != null) {
                    boolCb.on(z2);
                }
            }
        });
        linearLayoutRow.addView(r6, new LinearLayout.LayoutParams(-2, -2));
    }

    private void addOverspeedEffectPicker(LinearLayout linearLayout, final String str, final boolean z) {
        String str2;
        String str3;
        String str4;
        LinearLayout.LayoutParams layoutParams;
        linearLayout.addView(pickerTitle("Hiệu ứng khi quá tốc độ"), pickerTitleParams());
        if (z) {
            str2 = "settings_demo/overspeed_no_effect.png";
        } else {
            str2 = "settings_demo/ovs_HUD_no_effect.png";
        }
        if (z) {
            str3 = "settings_demo/overspeed_effect_low.png";
        } else {
            str3 = "settings_demo/ovs_HUD_Low.png";
        }
        if (z) {
            str4 = "settings_demo/overspeed_effect_high.png";
        } else {
            str4 = "settings_demo/ovs_HUD_High.png";
        }
        float f2 = z ? 1.6f : 1.83f;
        final FrameLayout frameLayoutBubbleLayoutCard = bubbleLayoutCard(str2, "Không hiệu ứng");
        final FrameLayout frameLayoutBubbleLayoutCard2 = bubbleLayoutCard(str3, "Hiệu ứng yếu");
        final FrameLayout frameLayoutBubbleLayoutCard3 = bubbleLayoutCard(str4, "Hiệu ứng mạnh");
        int i2 = 0;
        boolean z2 = ((int) (((float) getResources().getDisplayMetrics().widthPixels) / getResources().getDisplayMetrics().density)) >= 700;
        int iDp = getResources().getDisplayMetrics().widthPixels - dp(z2 ? 72 : 36);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        FrameLayout[] frameLayoutArr = {frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, frameLayoutBubbleLayoutCard3};
        int i3 = 0;
        for (int i4 = 3; i3 < i4; i4 = 3) {
            if (!z2) {
                int iMin = Math.min(dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5), Math.max(dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_1), (int) (iDp * 0.74f)));
                layoutParams = new LinearLayout.LayoutParams(iMin, ((int) (iMin / f2)) + dp(42));
                if (i3 > 0) {
                    layoutParams.leftMargin = dp(10);
                }
            } else {
                layoutParams = new LinearLayout.LayoutParams(0, dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_2), 1.0f);
                if (i3 > 0) {
                    layoutParams.leftMargin = dp(10);
                }
            }
            linearLayout2.addView(frameLayoutArr[i3], layoutParams);
            i3++;
        }
        if (!z2) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setFillViewport(false);
            horizontalScrollView.setOverScrollMode(1);
            horizontalScrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-2, -2));
            linearLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        } else {
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        }
        int i5 = this.sp.getInt(str, 0);
        if (i5 < 0 || i5 > 2) {
            this.sp.edit().putInt(str, 0).apply();
        } else {
            i2 = i5;
        }
        updateOverspeedEffectCards(frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, frameLayoutBubbleLayoutCard3, i2);
        frameLayoutBubbleLayoutCard.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.109
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.selectOverspeedEffect(str, z, frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, frameLayoutBubbleLayoutCard3, 0);
            }
        });
        frameLayoutBubbleLayoutCard2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.110
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.selectOverspeedEffect(str, z, frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, frameLayoutBubbleLayoutCard3, 1);
            }
        });
        frameLayoutBubbleLayoutCard3.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.111
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.selectOverspeedEffect(str, z, frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, frameLayoutBubbleLayoutCard3, 2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectOverspeedEffect(String str, boolean z, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, int i2) {
        this.sp.edit().putInt(str, i2).apply();
        updateOverspeedEffectCards(frameLayout, frameLayout2, frameLayout3, i2);
        if (z) {
            Gateway.onMapOverspeedSettingChanged();
        }
    }

    private void updateOverspeedEffectCards(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, int i2) {
        styleBubbleLayoutCard(frameLayout, i2 == 0);
        styleBubbleLayoutCard(frameLayout2, i2 == 1);
        styleBubbleLayoutCard(frameLayout3, i2 == 2);
    }

    private void addHudLayoutPicker(LinearLayout linearLayout) {
        linearLayout.addView(pickerTitle("Kiểu giao diện HUD"), pickerTitleParams());
        TextView textView = new TextView(this);
        textView.setText("Chọn bố cục hiển thị. Bố cục mới có thể được thêm mà không đổi luồng cài đặt.");
        textView.setTextSize(13.0f);
        textView.setTextColor(COLOR_MUTED);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dp(10);
        linearLayout.addView(textView, layoutParams);
        final FrameLayout frameLayoutBubbleLayoutCard = bubbleLayoutCard("settings_demo/hud_v1.png", "HUD V1");
        final FrameLayout frameLayoutBubbleLayoutCard2 = bubbleLayoutCard("settings_demo/hud_v2.png", "HUD V2");
        int iMax = Math.max(dp(150), ((int) (Math.min(getResources().getDisplayMetrics().widthPixels - dp(((int) (((float) getResources().getDisplayMetrics().widthPixels) / getResources().getDisplayMetrics().density)) >= 600 ? 72 : 32), dp(DisplayStrings.DS_UNABLE_TO_PROVIDE_ROUTE_TO_DESTINATION__TAKING_YOU_TO_NEAREST_LOCATION_)) / 2.22f)) + dp(48));
        LinearLayout linearLayout2 = new LinearLayout(this);
        int i2 = 1;
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iMax);
        layoutParams2.bottomMargin = dp(12);
        linearLayout2.addView(frameLayoutBubbleLayoutCard, layoutParams2);
        linearLayout2.addView(frameLayoutBubbleLayoutCard2, new LinearLayout.LayoutParams(-1, iMax));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        int i3 = this.sp.getInt("hud_layout", 1);
        if (i3 != 1 && i3 != 2) {
            this.sp.edit().putInt("hud_layout", 1).apply();
        } else {
            i2 = i3;
        }
        updateHudLayoutCards(frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, i2);
        frameLayoutBubbleLayoutCard.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.112
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.sp.edit().putInt("hud_layout", 1).apply();
                this.this$0.updateHudLayoutCards(frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, 1);
            }
        });
        frameLayoutBubbleLayoutCard2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.113
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.sp.edit().putInt("hud_layout", 2).apply();
                this.this$0.updateHudLayoutCards(frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, 2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHudLayoutCards(FrameLayout frameLayout, FrameLayout frameLayout2, int i2) {
        styleBubbleLayoutCard(frameLayout, i2 == 1);
        styleBubbleLayoutCard(frameLayout2, i2 == 2);
    }

    private void addPortraitGaugePicker(LinearLayout linearLayout) {
        linearLayout.addView(pickerTitle("Kiểu đồng hồ HUD dọc"), pickerTitleParams());
        TextView textView = new TextView(this);
        textView.setText("Chỉ áp dụng khi HUD đang ở màn hình dọc.");
        textView.setTextSize(13.0f);
        textView.setTextColor(COLOR_MUTED);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dp(10);
        linearLayout.addView(textView, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(dp(2), dp(2), dp(2), dp(2));
        int iMax = Math.max(dp(160), Math.min(dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_2), (getResources().getDisplayMetrics().widthPixels - dp(56)) / 2));
        int iDp = dp(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_4);
        int i2 = 1;
        final FrameLayout frameLayoutPortraitGaugeCard = portraitGaugeCard(1, "Đồng hồ chính");
        final FrameLayout frameLayoutPortraitGaugeCard2 = portraitGaugeCard(2, "Biển tốc độ chính");
        final FrameLayout frameLayoutPortraitGaugeCard3 = portraitGaugeCard(3, "Hai đồng hồ");
        linearLayout2.addView(frameLayoutPortraitGaugeCard, new LinearLayout.LayoutParams(iMax, iDp));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iMax, iDp);
        layoutParams2.leftMargin = dp(12);
        linearLayout2.addView(frameLayoutPortraitGaugeCard2, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iMax, iDp);
        layoutParams3.leftMargin = dp(12);
        linearLayout2.addView(frameLayoutPortraitGaugeCard3, layoutParams3);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-2, -2));
        linearLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        int i3 = this.sp.getInt("hud_portrait_gauge_style", 1);
        if (i3 >= 1 && i3 <= 3) {
            i2 = i3;
        }
        updatePortraitGaugeCards(frameLayoutPortraitGaugeCard, frameLayoutPortraitGaugeCard2, frameLayoutPortraitGaugeCard3, i2);
        frameLayoutPortraitGaugeCard.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.114
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.sp.edit().putInt("hud_portrait_gauge_style", 1).apply();
                this.this$0.updatePortraitGaugeCards(frameLayoutPortraitGaugeCard, frameLayoutPortraitGaugeCard2, frameLayoutPortraitGaugeCard3, 1);
            }
        });
        frameLayoutPortraitGaugeCard2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.115
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.sp.edit().putInt("hud_portrait_gauge_style", 2).apply();
                this.this$0.updatePortraitGaugeCards(frameLayoutPortraitGaugeCard, frameLayoutPortraitGaugeCard2, frameLayoutPortraitGaugeCard3, 2);
            }
        });
        frameLayoutPortraitGaugeCard3.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.116
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.sp.edit().putInt("hud_portrait_gauge_style", 3).apply();
                this.this$0.updatePortraitGaugeCards(frameLayoutPortraitGaugeCard, frameLayoutPortraitGaugeCard2, frameLayoutPortraitGaugeCard3, 3);
            }
        });
    }

    private FrameLayout portraitGaugeCard(int i2, String str) {
        return bubbleLayoutCard("settings_demo/hud_h_speedometer_preset_" + i2 + ".png", str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePortraitGaugeCards(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, int i2) {
        styleBubbleLayoutCard(frameLayout, i2 == 1);
        styleBubbleLayoutCard(frameLayout2, i2 == 2);
        styleBubbleLayoutCard(frameLayout3, i2 == 3);
    }

    private void addBubbleLayoutPicker(LinearLayout linearLayout) {
        linearLayout.addView(pickerTitle("Kiểu hiển thị bong bóng"), pickerTitleParams());
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(dp(2), dp(2), dp(2), dp(2));
        int iMax = Math.max(dp(150), Math.min(dp(240), (getResources().getDisplayMetrics().widthPixels - dp(56)) / 2));
        int iDp = dp(172);
        final FrameLayout frameLayoutBubbleLayoutCard = bubbleLayoutCard("settings_demo/bubble_bs.png", "Cơ bản");
        final FrameLayout frameLayoutBubbleLayoutCard2 = bubbleLayoutCard("settings_demo/bubble_h.png", "Nằm ngang");
        final FrameLayout frameLayoutBubbleLayoutCard3 = bubbleLayoutCard("settings_demo/bubble_v.png", "Nằm dọc");
        linearLayout2.addView(frameLayoutBubbleLayoutCard, new LinearLayout.LayoutParams(iMax, iDp));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, iDp);
        layoutParams.leftMargin = dp(12);
        linearLayout2.addView(frameLayoutBubbleLayoutCard2, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iMax, iDp);
        layoutParams2.leftMargin = dp(12);
        linearLayout2.addView(frameLayoutBubbleLayoutCard3, layoutParams2);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-2, -2));
        linearLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        updateBubbleLayoutCards(frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, frameLayoutBubbleLayoutCard3, this.sp.getInt("bubble_layout", 0));
        frameLayoutBubbleLayoutCard.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.117
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.sp.edit().putInt("bubble_layout", 2).apply();
                this.this$0.updateBubbleLayoutCards(frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, frameLayoutBubbleLayoutCard3, 2);
                Bubble.refresh();
            }
        });
        frameLayoutBubbleLayoutCard2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.118
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.sp.edit().putInt("bubble_layout", 0).apply();
                this.this$0.updateBubbleLayoutCards(frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, frameLayoutBubbleLayoutCard3, 0);
                Bubble.refresh();
            }
        });
        frameLayoutBubbleLayoutCard3.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.119
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.sp.edit().putInt("bubble_layout", 1).apply();
                this.this$0.updateBubbleLayoutCards(frameLayoutBubbleLayoutCard, frameLayoutBubbleLayoutCard2, frameLayoutBubbleLayoutCard3, 1);
                Bubble.refresh();
            }
        });
    }

    private TextView pickerTitle(String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(17.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        return textView;
    }

    private LinearLayout.LayoutParams pickerTitleParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(16);
        layoutParams.bottomMargin = dp(8);
        return layoutParams;
    }

    private FrameLayout bubbleLayoutCard(String str, String str2) {
        return bubbleLayoutCard(str, str2, false);
    }

    private FrameLayout bubbleLayoutCard(String str, String str2, boolean z) {
        ImageView imageView = new ImageView(this);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        if (z) {
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.waze.gw.ModSettingsActivity.120
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ModSettingsActivity.this.dp(14));
                }
            });
        }
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = getAssets().open(str);
            imageView.setImageBitmap(BitmapFactory.decodeStream(inputStreamOpen));
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
            }
        }
        if (inputStreamOpen != null) {
            try {
                inputStreamOpen.close();
            } catch (Throwable th2) {
            }
        }
        return bubbleLayoutCard(imageView, str2);
    }

    private FrameLayout bubbleLayoutCard(View view, String str) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setPadding(dp(10), dp(10), dp(10), dp(8));
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        frameLayout.setContentDescription(str);
        enableLiftHover(frameLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(COLOR_TEXT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(4);
        linearLayout.addView(textView, layoutParams);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        TextView textView2 = new TextView(this);
        textView2.setText("✓");
        textView2.setTextSize(18.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(COLOR_ACCENT);
        textView2.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp(30), dp(30));
        layoutParams2.gravity = 85;
        layoutParams2.rightMargin = dp(5);
        layoutParams2.bottomMargin = dp(5);
        frameLayout.addView(textView2, layoutParams2);
        frameLayout.setTag(textView2);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBubbleLayoutCards(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, int i2) {
        styleBubbleLayoutCard(frameLayout, i2 == 2);
        styleBubbleLayoutCard(frameLayout2, i2 == 0);
        styleBubbleLayoutCard(frameLayout3, i2 == 1);
    }

    private void styleBubbleLayoutCard(FrameLayout frameLayout, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(16));
        gradientDrawable.setStroke(dp(z ? 3 : 1), z ? COLOR_ACCENT : COLOR_BORDER);
        frameLayout.setBackground(gradientDrawable);
        Object tag = frameLayout.getTag();
        if (tag instanceof TextView) {
            ((TextView) tag).setVisibility(z ? 0 : 8);
        }
    }

    private void addAmbientColorChoice(LinearLayout linearLayout) {
        LinearLayout linearLayoutRow = row(linearLayout, "Màu điểm nhấn");
        final View view = new View(this);
        int iDp = dp(26);
        linearLayoutRow.addView(view, new LinearLayout.LayoutParams(iDp, iDp));
        final TextView textView = new TextView(this);
        textView.setTextSize(16.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = dp(10);
        linearLayoutRow.addView(textView, layoutParams);
        updateAmbientChoiceSummary(view, textView);
        linearLayoutRow.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.121
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                this.this$0.showAmbientColorDrawer(view, textView);
            }
        });
        TextView textView2 = new TextView(this);
        textView2.setText("Áp dụng cho tên đường trên bảng chỉ dẫn, HUD, bong bóng và điểm nhấn MOD. Màu cảnh báo đỏ và màu tuyến đường không đổi.");
        textView2.setTextSize(12.0f);
        textView2.setTextColor(COLOR_MUTED);
        textView2.setPadding(dp(14), dp(7), dp(14), dp(3));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
    }

    private void updateAmbientChoiceSummary(View view, TextView textView) {
        int i2 = this.sp.getInt(AmbientTheme.PREF_MODE, 0);
        int iColor = AmbientTheme.color(this.sp);
        if (view != null) {
            view.setBackground(colorCircle(iColor, dp(1), -855638017));
        }
        if (textView != null) {
            textView.setText(ambientModeLabel(i2));
            textView.setTextColor(iColor);
        }
    }

    private String ambientModeLabel(int i2) {
        switch (i2) {
            case 1:
                return "Hồng Chisadin";
            case 2:
                return "Hổ phách";
            case 3:
                return "Bạc hà";
            case 4:
                return "Tự chọn";
            default:
                return "Xanh Waze";
        }
    }

    private GradientDrawable colorCircle(int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(AmbientTheme.opaque(i2));
        if (i3 > 0) {
            gradientDrawable.setStroke(i3, i4);
        }
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public void showAmbientColorDrawer(final View view, final TextView textView) {
        final Dialog dialog = new Dialog(this);
        ?? r7 = 1;
        dialog.requestWindowFeature(1);
        LinearLayout linearLayoutCreateAmbientSheet = createAmbientSheet("Màu điểm nhấn", "Ưu tiên màu sáng để dễ đọc trên nền đen và ngoài trời");
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayoutCreateAmbientSheet.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        int i2 = this.sp.getInt(AmbientTheme.PREF_MODE, 0);
        final int i3 = this.sp.getInt(AmbientTheme.PREF_CUSTOM, AmbientTheme.WAZE_BLUE);
        int[] iArr = {0, 1, 2, 3, 4};
        int i4 = 5;
        String[] strArr = {"Xanh Waze", "Hồng Chisadin", "Hổ phách", "Bạc hà", "Tự chọn…"};
        int i5 = 0;
        while (i5 < i4) {
            final int i6 = iArr[i5];
            int iPresetColor = AmbientTheme.presetColor(i6, i3);
            boolean z = i6 == i2;
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setGravity(16);
            linearLayout2.setPadding(dp(14), dp(10), dp(12), dp(10));
            linearLayout2.setClickable(r7);
            linearLayout2.setFocusable((boolean) r7);
            enableLiftHover(linearLayout2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(z ? AmbientTheme.withAlpha(iPresetColor, 34) : COLOR_CONTROL);
            gradientDrawable.setCornerRadius(dp(15));
            gradientDrawable.setStroke(dp(z ? 2 : 1), z ? iPresetColor : COLOR_BORDER);
            linearLayout2.setBackground(gradientDrawable);
            View view2 = new View(this);
            view2.setBackground(colorCircle(iPresetColor, dp(r7), -1275068417));
            linearLayout2.addView(view2, new LinearLayout.LayoutParams(dp(30), dp(30)));
            TextView textView2 = new TextView(this);
            textView2.setText(strArr[i5]);
            textView2.setTextColor(z ? iPresetColor : COLOR_TEXT);
            textView2.setTextSize(16.0f);
            textView2.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.leftMargin = dp(13);
            linearLayout2.addView(textView2, layoutParams);
            TextView textView3 = new TextView(this);
            textView3.setText(z ? "✓" : i6 == 4 ? "+" : "");
            if (!z) {
                iPresetColor = COLOR_MUTED;
            }
            textView3.setTextColor(iPresetColor);
            textView3.setTextSize(18.0f);
            textView3.setGravity(17);
            linearLayout2.addView(textView3, new LinearLayout.LayoutParams(dp(30), dp(30)));
            int i7 = i5;
            String[] strArr2 = strArr;
            linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.122
                final /* synthetic */ ModSettingsActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    dialog.dismiss();
                    if (i6 == 4) {
                        Handler handler = this.this$0.audioPreviewHandler;
                        final View view4 = view;
                        final TextView textView4 = textView;
                        handler.postDelayed(new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.122.1
                            final /* synthetic */ AnonymousClass122 this$1;

                            {
                                this.this$1 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (!this.this$1.this$0.isFinishing()) {
                                    if (Build.VERSION.SDK_INT < 17 || !this.this$1.this$0.isDestroyed()) {
                                        this.this$1.this$0.showCustomAmbientColorPicker(view4, textView4);
                                    }
                                }
                            }
                        }, 100L);
                        return;
                    }
                    this.this$0.applyAmbientSelection(i6, AmbientTheme.presetColor(i6, i3), view, textView);
                }
            });
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, dp(56));
            if (i7 > 0) {
                layoutParams2.topMargin = dp(8);
            }
            linearLayout.addView(linearLayout2, layoutParams2);
            i5 = i7 + 1;
            strArr = strArr2;
            i4 = 5;
            r7 = 1;
        }
        showBottomSheet(dialog, linearLayoutCreateAmbientSheet, dp(640));
    }

    private LinearLayout createAmbientSheet(String str, String str2) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(dp(16), dp(10), dp(16), dp(18));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-15394783);
        gradientDrawable.setCornerRadius(dp(24));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout.setBackground(gradientDrawable);
        View view = new View(this);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-10327431);
        gradientDrawable2.setCornerRadius(dp(4));
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp(44), dp(4));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = dp(15);
        linearLayout.addView(view, layoutParams);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(COLOR_TEXT);
        textView.setTextSize(21.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText(str2);
        textView2.setTextColor(COLOR_MUTED);
        textView2.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(3);
        layoutParams2.bottomMargin = dp(14);
        linearLayout.addView(textView2, layoutParams2);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCustomAmbientColorPicker(final View view, final TextView textView) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        LinearLayout linearLayoutCreateAmbientSheet = createAmbientSheet("Màu tự chọn", "Kéo ba thanh để xem màu trực tiếp trên mẫu bảng chỉ dẫn");
        final float[] fArr = new float[3];
        Color.colorToHSV(AmbientTheme.opaque(this.sp.getInt(AmbientTheme.PREF_CUSTOM, AmbientTheme.WAZE_BLUE)), fArr);
        final TextView textView2 = new TextView(this);
        textView2.setText("↱   420 m\n     Trường Định");
        textView2.setTextSize(20.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(16);
        textView2.setPadding(dp(18), dp(10), dp(18), dp(10));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-301989888);
        gradientDrawable.setCornerRadius(dp(14));
        textView2.setBackground(gradientDrawable);
        linearLayoutCreateAmbientSheet.addView(textView2, new LinearLayout.LayoutParams(-1, dp(82)));
        final TextView textView3 = new TextView(this);
        textView3.setTextSize(14.0f);
        textView3.setTypeface(Typeface.MONOSPACE, 1);
        textView3.setGravity(5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayoutCreateAmbientSheet.addView(textView3, layoutParams);
        final SeekBar seekBarAmbientColorSlider = ambientColorSlider(linearLayoutCreateAmbientSheet, "Sắc độ", DisplayStrings.DS_ONE_DAY_AGO, Math.round(fArr[0]));
        final SeekBar seekBarAmbientColorSlider2 = ambientColorSlider(linearLayoutCreateAmbientSheet, "Độ rực", 100, Math.round(fArr[1] * 100.0f));
        final SeekBar seekBarAmbientColorSlider3 = ambientColorSlider(linearLayoutCreateAmbientSheet, "Độ sáng", 100, Math.round(fArr[2] * 100.0f));
        final Runnable runnable = new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.123
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                fArr[0] = seekBarAmbientColorSlider.getProgress();
                fArr[1] = seekBarAmbientColorSlider2.getProgress() / 100.0f;
                fArr[2] = Math.max(0.25f, seekBarAmbientColorSlider3.getProgress() / 100.0f);
                int iHSVToColor = Color.HSVToColor(fArr);
                textView2.setTextColor(iHSVToColor);
                textView3.setText(String.format(Locale.US, "#%06X", Integer.valueOf(16777215 & iHSVToColor)));
                textView3.setTextColor(iHSVToColor);
            }
        };
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener(this) { // from class: com.waze.gw.ModSettingsActivity.124
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                runnable.run();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        };
        seekBarAmbientColorSlider.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekBarAmbientColorSlider2.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekBarAmbientColorSlider3.setOnSeekBarChangeListener(onSeekBarChangeListener);
        runnable.run();
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setGravity(21);
        linearLayout.setPadding(0, dp(14), 0, 0);
        TextView textViewAmbientAction = ambientAction("Hủy", COLOR_MUTED);
        TextView textViewAmbientAction2 = ambientAction("Áp dụng", AmbientTheme.color(this.sp));
        linearLayout.addView(textViewAmbientAction, new LinearLayout.LayoutParams(0, dp(48), 1.0f));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, dp(48), 1.0f);
        layoutParams2.leftMargin = dp(10);
        linearLayout.addView(textViewAmbientAction2, layoutParams2);
        linearLayoutCreateAmbientSheet.addView(linearLayout);
        textViewAmbientAction.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.125
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                dialog.dismiss();
            }
        });
        textViewAmbientAction2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.126
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iHSVToColor = Color.HSVToColor(fArr);
                dialog.dismiss();
                this.this$0.applyAmbientSelection(4, iHSVToColor, view, textView);
            }
        });
        showBottomSheet(dialog, linearLayoutCreateAmbientSheet, dp(640));
    }

    private SeekBar ambientColorSlider(LinearLayout linearLayout, String str, int i2, int i3) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(COLOR_TEXT);
        textView.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(10);
        linearLayout.addView(textView, layoutParams);
        SeekBar seekBar = new SeekBar(this);
        seekBar.setMax(i2);
        seekBar.setProgress(i3);
        linearLayout.addView(seekBar, new LinearLayout.LayoutParams(-1, -2));
        return seekBar;
    }

    private TextView ambientAction(String str, int i2) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(i2);
        textView.setTextSize(15.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(13));
        gradientDrawable.setStroke(dp(1), i2);
        textView.setBackground(gradientDrawable);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyAmbientSelection(int i2, int i3, View view, TextView textView) {
        SharedPreferences.Editor editorPutInt = this.sp.edit().putInt(AmbientTheme.PREF_MODE, i2);
        if (i2 == 4) {
            editorPutInt.putInt(AmbientTheme.PREF_CUSTOM, AmbientTheme.opaque(i3));
        }
        editorPutInt.apply();
        COLOR_ACCENT = AmbientTheme.color(this.sp);
        updateAmbientChoiceSummary(view, textView);
        Gateway.refreshAmbientTheme();
        if (!CAT_MAP.equals(this.selectedCategory) || textView == null) {
            return;
        }
        textView.postDelayed(new Runnable() { // from class: com.waze.gw.ModSettingsActivity.127
            @Override // java.lang.Runnable
            public void run() {
                ModSettingsActivity.this.openCategory(ModSettingsActivity.CAT_MAP);
            }
        }, 80L);
    }

    private void showBottomSheet(Dialog dialog, View view, int i2) {
        dialog.setContentView(view);
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setGravity(81);
        window.addFlags(2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.58f;
        attributes.width = Math.min(getResources().getDisplayMetrics().widthPixels - dp(20), i2);
        attributes.height = -2;
        attributes.y = dp(10);
        window.setAttributes(attributes);
    }

    private void addChoice(LinearLayout linearLayout, String str, String str2, int[] iArr, String[] strArr, int i2) {
        addChoice(linearLayout, str, str2, iArr, strArr, i2, null);
    }

    private void addChoice(LinearLayout linearLayout, final String str, final String str2, final int[] iArr, final String[] strArr, final int i2, final Runnable runnable) {
        LinearLayout linearLayoutRow = row(linearLayout, str);
        final TextView textView = new TextView(this);
        textView.setTextSize(17.0f);
        textView.setTextColor(COLOR_ACCENT);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText(labelFor(iArr, strArr, this.sp.getInt(str2, i2)));
        linearLayoutRow.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        linearLayoutRow.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.128
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.this$0.showChoiceDrawer(str, str2, iArr, strArr, i2, textView, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showChoiceDrawer(String str, String str2, final int[] iArr, String[] strArr, int i2, final TextView textView, final Runnable runnable) {
        final String[] strArr2 = strArr;
        if (iArr != null && strArr2 != null && iArr.length != 0 && iArr.length == strArr2.length) {
            final Dialog dialog = new Dialog(this);
            dialog.requestWindowFeature(1);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            int i3 = 16;
            linearLayout.setPadding(dp(16), dp(10), dp(16), dp(18));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-15394783);
            gradientDrawable.setCornerRadius(dp(24));
            gradientDrawable.setStroke(dp(1), COLOR_BORDER);
            linearLayout.setBackground(gradientDrawable);
            View view = new View(this);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(-10327431);
            gradientDrawable2.setCornerRadius(dp(4));
            view.setBackground(gradientDrawable2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp(44), dp(4));
            layoutParams.gravity = 1;
            layoutParams.bottomMargin = dp(15);
            linearLayout.addView(view, layoutParams);
            TextView textView2 = new TextView(this);
            textView2.setText(str);
            textView2.setTextColor(COLOR_TEXT);
            textView2.setTextSize(21.0f);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText("Chọn một tùy chọn");
            textView3.setTextColor(COLOR_MUTED);
            textView3.setTextSize(13.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = dp(3);
            layoutParams2.bottomMargin = dp(14);
            linearLayout.addView(textView3, layoutParams2);
            ScrollView scrollView = new ScrollView(this);
            int i4 = 0;
            scrollView.setFillViewport(false);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            scrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-1, -2));
            String str3 = str2;
            int i5 = this.sp.getInt(str3, i2);
            int i6 = 0;
            while (i6 < iArr.length) {
                final int i7 = iArr[i6];
                String str4 = strArr2[i6];
                boolean z = i7 == i5;
                LinearLayout linearLayout3 = new LinearLayout(this);
                linearLayout3.setOrientation(i4);
                linearLayout3.setGravity(i3);
                ScrollView scrollView2 = scrollView;
                linearLayout3.setPadding(dp(i3), dp(12), dp(12), dp(12));
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                enableLiftHover(linearLayout3);
                linearLayout3.setContentDescription(str4 + (z ? ", đang chọn" : ""));
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setColor(z ? -14016464 : COLOR_CONTROL);
                gradientDrawable3.setCornerRadius(dp(15));
                gradientDrawable3.setStroke(dp(z ? 2 : 1), z ? COLOR_ACCENT : COLOR_BORDER);
                linearLayout3.setBackground(gradientDrawable3);
                TextView textView4 = new TextView(this);
                textView4.setText(str4);
                textView4.setTextColor(COLOR_TEXT);
                textView4.setTextSize(16.0f);
                textView4.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                linearLayout3.addView(textView4, new LinearLayout.LayoutParams(0, -2, 1.0f));
                TextView textView5 = new TextView(this);
                textView5.setText(z ? "✓" : "");
                textView5.setTextColor(-1);
                textView5.setTextSize(16.0f);
                textView5.setTypeface(Typeface.DEFAULT_BOLD);
                textView5.setGravity(17);
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(1);
                gradientDrawable4.setColor(z ? COLOR_ACCENT : -13617854);
                textView5.setBackground(gradientDrawable4);
                linearLayout3.addView(textView5, new LinearLayout.LayoutParams(dp(30), dp(30)));
                LinearLayout linearLayout4 = linearLayout2;
                final String str5 = str3;
                final int i8 = i5;
                linearLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.129
                    final /* synthetic */ ModSettingsActivity this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        final String str6 = str5;
                        final int i9 = i7;
                        final TextView textView6 = textView;
                        final int[] iArr2 = iArr;
                        final String[] strArr3 = strArr2;
                        final Runnable runnable2 = runnable;
                        Runnable runnable3 = new Runnable(this) { // from class: com.waze.gw.ModSettingsActivity.129.1
                            final /* synthetic */ AnonymousClass129 this$1;

                            {
                                this.this$1 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                this.this$1.this$0.sp.edit().putInt(str6, i9).apply();
                                textView6.setText(this.this$1.this$0.labelFor(iArr2, strArr3, i9));
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            }
                        };
                        dialog.dismiss();
                        if ("audio_mix_mode".equals(str5) && i7 == 0 && i8 != 0) {
                            this.this$0.showAudioMixWarning(runnable3);
                        } else {
                            runnable3.run();
                        }
                    }
                });
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, dp(58));
                if (i6 > 0) {
                    layoutParams3.topMargin = dp(8);
                }
                linearLayout4.addView(linearLayout3, layoutParams3);
                i6++;
                str3 = str2;
                strArr2 = strArr;
                i5 = i8;
                scrollView = scrollView2;
                linearLayout2 = linearLayout4;
                i4 = 0;
                i3 = 16;
            }
            linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, Math.min(iArr.length * dp(66), Math.min(dp(480), (int) (getResources().getDisplayMetrics().heightPixels * 0.62f)))));
            dialog.setContentView(linearLayout);
            dialog.setCanceledOnTouchOutside(true);
            dialog.show();
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setGravity(81);
                window.addFlags(2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = 0.58f;
                attributes.width = Math.min(getResources().getDisplayMetrics().widthPixels - dp(20), dp(640));
                attributes.height = -2;
                attributes.y = dp(10);
                window.setAttributes(attributes);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAudioMixWarning(final Runnable runnable) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        LinearLayout linearLayoutCreateAmbientSheet = createAmbientSheet("Cảnh báo Android Auto", "Khi dùng Trộn âm thanh trên Android Auto, âm thanh cảnh báo Mod có thể bị mất hoàn toàn trên một số màn hình hoặc đầu xe.");
        TextView textView = new TextView(this);
        textView.setText("Nếu bạn thường dùng Android Auto, nên giữ chế độ Giảm nhỏ nhạc để cảnh báo được phát ổn định.");
        textView.setTextColor(COLOR_TEXT);
        textView.setTextSize(15.0f);
        textView.setLineSpacing(dp(3), 1.0f);
        textView.setPadding(dp(4), dp(2), dp(4), dp(14));
        linearLayoutCreateAmbientSheet.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView2 = new TextView(this);
        textView2.setText("Hủy bỏ");
        textView2.setTextColor(COLOR_TEXT);
        textView2.setTextSize(16.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.130
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        TextView textView3 = new TextView(this);
        textView3.setText("⚠️ Đồng ý");
        textView3.setTextColor(-1);
        textView3.setTextSize(16.0f);
        textView3.setTypeface(Typeface.DEFAULT_BOLD);
        textView3.setGravity(17);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-2937041);
        gradientDrawable2.setCornerRadius(dp(14));
        gradientDrawable2.setStroke(dp(1), -38037);
        textView3.setBackground(gradientDrawable2);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.gw.ModSettingsActivity.131
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (runnable != null) {
                    runnable.run();
                }
                dialog.dismiss();
            }
        });
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(0, dp(54), 1.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, dp(54), 1.0f);
        layoutParams.leftMargin = dp(10);
        linearLayout.addView(textView3, layoutParams);
        linearLayoutCreateAmbientSheet.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        showBottomSheet(dialog, linearLayoutCreateAmbientSheet, dp(DisplayStrings.DS_REPORT_INCAR_CLOSURE_REPORT_PRIMARY_BUTTON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String labelFor(int[] iArr, String[] strArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return strArr[i3];
            }
        }
        return String.valueOf(i2);
    }

    private UpcomingAlertRail addUpcomingAlertPreview(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(12), dp(10), dp(12), dp(10));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("Xem trước danh sách cảnh báo");
        textView.setTextColor(COLOR_TEXT);
        textView.setTextSize(14.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(this);
        textView2.setText("Kéo ngang khi danh sách lớn");
        textView2.setTextColor(COLOR_MUTED);
        textView2.setTextSize(12.0f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(dp(10), dp(8), dp(10), dp(8));
        frameLayout.setMinimumWidth(Math.max(dp(DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_ROUTE_NAME_VIA_FORMAT_PS), getResources().getDisplayMetrics().widthPixels - dp(this.wideSettings ? DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT : 44)));
        UpcomingAlertRail upcomingAlertRail = new UpcomingAlertRail(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(upcomingAlertRail, layoutParams);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -1));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, dp(150));
        layoutParams2.topMargin = dp(5);
        linearLayout2.addView(horizontalScrollView, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams3);
        updateUpcomingAlertPreview(upcomingAlertRail);
        return upcomingAlertRail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUpcomingAlertPreview(UpcomingAlertRail upcomingAlertRail) {
        if (upcomingAlertRail == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("preview\tSpeed\t450 m\t450\tspeeddrop_80");
        arrayList.add("preview\tCamera\t820 m\t820\ticon_alerter_cam_speed");
        arrayList.add("preview\tNo passing\t1.2 km\t1200\twme_14");
        upcomingAlertRail.setPreviewState(arrayList, this.sp.getBoolean("upcoming_alerts", true), this.sp.getInt("upcoming_count", 3), this.sp.getInt("upcoming_size", 100));
    }

    private NavBannerPreview addNavBannerPreview(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(12), dp(10), dp(12), dp(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("Xem trước bảng chỉ dẫn");
        textView.setTextColor(COLOR_TEXT);
        textView.setTextSize(14.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout3.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(this);
        textView2.setText("Làn đường + lối rẽ");
        textView2.setTextColor(COLOR_MUTED);
        textView2.setTextSize(12.0f);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        NavBannerPreview navBannerPreview = new NavBannerPreview(this);
        navBannerPreview.syncFromPreferences();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dp(this.wideSettings ? DisplayStrings.DS_TRIP_OVERVIEW_REQUIRED_RESTRICTED_AREA_LABEL : 150));
        layoutParams.topMargin = dp(8);
        linearLayout2.addView(navBannerPreview, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams2);
        return navBannerPreview;
    }

    private final class NavBannerPreview extends FrameLayout {
        private final View nativeLane;
        private final LinearLayout nativeNav;
        private final View nativeTop;
        private int opacityPercent;
        private int sizePercent;
        private final TextView status;

        /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        NavBannerPreview(android.content.Context r11) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.ModSettingsActivity.NavBannerPreview.<init>(com.waze.gw.ModSettingsActivity, android.content.Context):void");
        }

        void syncFromPreferences() {
            this.opacityPercent = Math.max(40, Math.min(100, ModSettingsActivity.this.sp.getInt("nav_banner_opacity", 78)));
            this.sizePercent = Math.max(50, Math.min(100, ModSettingsActivity.this.sp.getInt("nav_banner_size", 100)));
            applyPreviewAppearance();
        }

        @Override // android.view.View
        protected void onSizeChanged(int i2, int i3, int i4, int i5) {
            super.onSizeChanged(i2, i3, i4, i5);
            post(new Runnable() { // from class: com.waze.gw.ModSettingsActivity.NavBannerPreview.1
                @Override // java.lang.Runnable
                public void run() {
                    NavBannerPreview.this.applyPreviewAppearance();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void applyPreviewAppearance() {
            if (this.nativeNav == null) {
                return;
            }
            int measuredHeight = this.nativeNav.getMeasuredHeight();
            int measuredWidth = this.nativeNav.getMeasuredWidth();
            float fMin = 1.0f;
            if (getWidth() > 0 && measuredWidth > 0) {
                fMin = Math.min(1.0f, (getWidth() - ModSettingsActivity.this.dp(8)) / measuredWidth);
            }
            if (getHeight() > ModSettingsActivity.this.dp(26) && measuredHeight > 0) {
                fMin = Math.min(fMin, (getHeight() - ModSettingsActivity.this.dp(26)) / measuredHeight);
            }
            float fMax = Math.max(0.1f, (fMin * this.sizePercent) / 100.0f);
            this.nativeNav.setPivotX(0.0f);
            this.nativeNav.setPivotY(0.0f);
            this.nativeNav.setScaleX(fMax);
            this.nativeNav.setScaleY(fMax);
            setBackgroundAlpha(this.nativeTop, this.opacityPercent);
            setBackgroundAlpha(this.nativeLane, this.opacityPercent);
            this.status.setText(this.opacityPercent + "% nền  •  " + this.sizePercent + "% cỡ");
            this.nativeNav.invalidate();
        }

        private void setBackgroundAlpha(View view, int i2) {
            Drawable background;
            if (view != null && (background = view.getBackground()) != null) {
                background.mutate().setAlpha(Math.round((i2 * 255.0f) / 100.0f));
            }
        }

        private void bindNativeInstruction(View view) throws Exception {
            View viewFindViewById = view.findViewById(resourceId(TtmlNode.ATTR_ID, "instructionView"));
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
                viewFindViewById.getClass().getMethod(CmcdData.OBJECT_TYPE_AUDIO_ONLY, Integer.class).invoke(viewFindViewById, Integer.valueOf(resourceId("drawable", "car_big_trans_direction_right")));
                viewFindViewById.getClass().getMethod("b", String.class).invoke(viewFindViewById, "");
            }
            View viewFindViewById2 = view.findViewById(resourceId(TtmlNode.ATTR_ID, "navBarDistance"));
            if (viewFindViewById2 instanceof TextView) {
                ((TextView) viewFindViewById2).setText("420 m");
            }
            View viewFindViewById3 = view.findViewById(resourceId(TtmlNode.ATTR_ID, "navBarStreetLine"));
            if (viewFindViewById3 instanceof TextView) {
                TextView textView = (TextView) viewFindViewById3;
                textView.setText("CT. Phan Thiết - Dầu Giây");
                textView.setTextColor(AmbientTheme.color(ModSettingsActivity.this.sp));
            }
        }

        private void bindNativeLanes(View view) throws Exception {
            if (view == null) {
                return;
            }
            ClassLoader classLoader = ModSettingsActivity.this.getClassLoader();
            Class<?> cls = Class.forName("com.waze.ui.navbar.b", true, classLoader);
            Class<?> cls2 = Class.forName("com.waze.ui.navbar.c", true, classLoader);
            Constructor<?> constructor = cls.getConstructor(Integer.TYPE, Boolean.TYPE);
            Constructor<?> constructor2 = cls2.getConstructor(List.class);
            ArrayList arrayList = new ArrayList();
            int[] iArr = {0, 0, 0, 90, 90};
            int i2 = 0;
            while (i2 < 5) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(constructor.newInstance(Integer.valueOf(iArr[i2]), Boolean.valueOf(i2 >= 2)));
                arrayList.add(constructor2.newInstance(arrayList2));
                i2++;
            }
            view.getClass().getMethod("e", List.class, Boolean.TYPE, Boolean.TYPE).invoke(view, arrayList, Boolean.FALSE, Boolean.TRUE);
            view.setVisibility(0);
        }

        private int resourceId(String str, String str2) {
            int identifier = getResources().getIdentifier(str2, str, ModSettingsActivity.this.getPackageName());
            return identifier == 0 ? getResources().getIdentifier(str2, str, "com.waze") : identifier;
        }
    }

    private SeekBar addSlider(LinearLayout linearLayout, String str, final String str2, final int i2, int i3, final int i4, int i5, final String str3, final boolean z, String str4, final Runnable runnable) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(dp(14), dp(12), dp(14), dp(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(COLOR_CONTROL);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), COLOR_BORDER);
        linearLayout2.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(8);
        linearLayout.addView(linearLayout2, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(17.0f);
        textView.setTextColor(COLOR_TEXT);
        linearLayout3.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        final TextView textView2 = new TextView(this);
        textView2.setTextSize(17.0f);
        textView2.setTextColor(COLOR_ACCENT);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setText(fmtVal(this.sp.getInt(str2, i5), str3, z));
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        SeekBar seekBar = new SeekBar(this);
        seekBar.setMax((i3 - i2) / i4);
        seekBar.setProgress((this.sp.getInt(str2, i5) - i2) / i4);
        seekBar.setTag(new Object[]{str2, Integer.valueOf(i2), Integer.valueOf(i4), str3, Boolean.valueOf(z), textView2});
        try {
            seekBar.setProgressTintList(ColorStateList.valueOf(COLOR_ACCENT));
            seekBar.setThumbTintList(ColorStateList.valueOf(COLOR_ACCENT));
        } catch (Throwable th) {
        }
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(this) { // from class: com.waze.gw.ModSettingsActivity.132
            final /* synthetic */ ModSettingsActivity this$0;

            {
                this.this$0 = this;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i6, boolean z2) {
                int i7 = i2 + (i6 * i4);
                this.this$0.sp.edit().putInt(str2, i7).apply();
                textView2.setText(this.this$0.fmtVal(i7, str3, z));
                if (!z2 || runnable == null) {
                    return;
                }
                runnable.run();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dp(6);
        linearLayout2.addView(seekBar, layoutParams2);
        if (str4 != null) {
            TextView textView3 = new TextView(this);
            textView3.setText("⚠  " + str4);
            textView3.setTextSize(13.0f);
            textView3.setTextColor(-1957094);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = dp(6);
            linearLayout2.addView(textView3, layoutParams3);
        }
        return seekBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetSlider(SeekBar seekBar, int i2) {
        if (seekBar == null) {
            return;
        }
        Object[] objArr = (Object[]) seekBar.getTag();
        String str = (String) objArr[0];
        int iIntValue = ((Integer) objArr[1]).intValue();
        int iIntValue2 = ((Integer) objArr[2]).intValue();
        String str2 = (String) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        TextView textView = (TextView) objArr[5];
        this.sp.edit().putInt(str, i2).apply();
        seekBar.setProgress((i2 - iIntValue) / iIntValue2);
        textView.setText(fmtVal(i2, str2, zBooleanValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String fmtVal(int i2, String str, boolean z) {
        return ((!z || i2 <= 0) ? String.valueOf(i2) : "+" + i2) + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int dp(int i2) {
        return (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
