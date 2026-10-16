package com.waze;

import android.content.Context;
import android.location.Location;
import android.provider.Settings;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.waze.calendar.CalendarNativeManager;
import com.waze.messages.PushQuestionData;
import java.io.FileWriter;
import java.util.Calendar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class OfflineNativeManager extends jd {
    private static final String OFFLINE_LOG_FILENAME = "/data/data/com.waze/offline_waze.log";
    private static OfflineNativeManager instance;
    private String LOG_TAG = "OfflineNativeManager";

    /* compiled from: WazeSource */
    public interface CalendarUpdateProtobufListener {
        void a(String str);
    }

    private OfflineNativeManager() {
        if (!NativeManager.isAppStarted()) {
            VerifyInit();
            minimalNativeInitialization();
        }
        InitOfflineNativeManagerNTV();
    }

    private native PushQuestionData HandleCommandNTV(String str, int i2, int i3, int i4);

    private native void InitOfflineNativeManagerNTV();

    private void VerifyInit() {
        if (org.a.d.b.a.b() == null) {
            Log.e(this.LOG_TAG, "Application not initialized");
            System.exit(0);
        }
    }

    private native boolean accessToCalendarAllowedNTV();

    private native String formatLocationCommandNTV(int i2, int i3);

    public static synchronized OfflineNativeManager getInstance() {
        OfflineNativeManager offlineNativeManager;
        offlineNativeManager = instance;
        if (offlineNativeManager == null) {
            offlineNativeManager = new OfflineNativeManager();
            instance = offlineNativeManager;
        }
        return offlineNativeManager;
    }

    private native boolean getLocationBgEnabledNTV();

    public static String getPushInstallationUUIDStatic(Context context) {
        return context != null ? Settings.Secure.getString(context.getContentResolver(), "android_id") : "";
    }

    private native boolean getWriteOfflineLogFileNTV();

    public static synchronized boolean isOfflineMode() {
        return instance != null;
    }

    public static void log(String str, String str2, Object... objArr) {
        String str3 = String.format(str2, objArr);
        if (NativeManager.isAppStarted()) {
            com.waze.shared_infra.i.h.a(str + ": " + str3);
            return;
        }
        Log.d(str, str3);
        if (isOfflineMode() && getInstance().getWriteOfflineLogFileBlocking()) {
            try {
                FileWriter fileWriter = new FileWriter(OFFLINE_LOG_FILENAME, true);
                fileWriter.write(Calendar.getInstance().getTime().toLocaleString() + " " + str3 + "\n");
                fileWriter.close();
            } catch (Exception e2) {
                Log.d(str, "Failed to log to file - ".concat(e2.toString()));
            }
        }
    }

    private void minimalNativeInitialization() {
        NativeManager.getInstance().waitForAtLeastBlocking(com.waze.am.a.f14306b);
    }

    public static void setTestInstance(OfflineNativeManager offlineNativeManager) {
        instance = offlineNativeManager;
    }

    public PushQuestionData HandleCommandForPush(String str, int i2, int i3, int i4) {
        return HandleCommandNTV(str, i2, i3, i4);
    }

    public boolean accessToCalendarAllowed(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.READ_CALENDAR") != 0) {
            return false;
        }
        return accessToCalendarAllowedNTV();
    }

    public boolean getBackgroundLocationEnabled() {
        return ix.n(mg.a()) ? ContextCompat.checkSelfPermission(mg.a(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0 : getLocationBgEnabledNTV();
    }

    protected native void getCalendarUpdateProtobufNTV(CalendarUpdateProtobufListener calendarUpdateProtobufListener);

    String getInstallationUUID() {
        return com.b.b.a.u.d().c().a();
    }

    public String getPushInstallationUUID() {
        return getPushInstallationUUIDStatic(mg.a());
    }

    public boolean getWriteOfflineLogFileBlocking() {
        return getWriteOfflineLogFileNTV();
    }

    void onCalendarUpdateProtobuf(Object obj, String str) {
        if (obj instanceof CalendarUpdateProtobufListener) {
            ((CalendarUpdateProtobufListener) obj).a(str);
        }
    }

    public void sendOfflineLocation() {
        Location locationD = com.waze.location.bg.d(mg.a());
        if (locationD == null) {
            com.waze.shared_infra.i.h.c("OfflineNativeManager.sendOfflineLocation - location is null");
            return;
        }
        String locationCommandNTV = formatLocationCommandNTV(com.waze.location.bg.b(locationD.getLatitude()), com.waze.location.bg.b(locationD.getLongitude()));
        if (locationCommandNTV == null) {
            com.waze.shared_infra.i.h.a("OfflineNativeManager.sendOfflineLocation - command is null");
            return;
        }
        com.waze.shared_infra.i.h.c("OfflineNativeManager.sendOfflineLocation - sending ".concat(locationCommandNTV));
        com.waze.ci.a.b.a();
        com.waze.ci.a.b.b(mg.a(), locationCommandNTV);
    }

    public synchronized void updateCalendarEvents(Context context) {
        CalendarNativeManager.Companion.a().setOfflineMode();
        getCalendarUpdateProtobufNTV(new jc(this, context));
    }
}
