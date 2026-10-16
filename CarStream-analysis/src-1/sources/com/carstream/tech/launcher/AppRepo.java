package com.carstream.tech.launcher;

import android.app.ActivityOptions;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserHandle;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.a1;
import defpackage.b1;
import defpackage.c0;
import defpackage.xc;
import defpackage.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class AppRepo {
    private static final long GANDAY_HAN_MS = 60000;
    private static volatile List<Entry> sCache;
    private static volatile boolean sDangDocGanDay;
    private static volatile Map<String, Long> sGanDay;
    private static volatile long sGanDayLuc;
    private static volatile boolean sWatching;
    private static final Handler H = new Handler(Looper.getMainLooper());
    private static final Set<Listener> sListeners = new HashSet();

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Entry implements Comparable<Entry> {
        public final String cls;
        public final boolean docOnly;
        public final Drawable icon;
        public final String label;
        public final boolean media;
        public final String pkg;

        public Entry(String str, String str2, String str3, Drawable drawable, boolean z, boolean z2) {
            this.label = str;
            this.pkg = str2;
            this.cls = str3;
            this.icon = drawable;
            this.media = z;
            this.docOnly = z2;
        }

        public ComponentName comp() {
            return new ComponentName(this.pkg, this.cls);
        }

        @Override // java.lang.Comparable
        public int compareTo(Entry entry) {
            return this.label.compareToIgnoreCase(entry.label);
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface Listener {
        void onApps(List<Entry> list);
    }

    private AppRepo() {
    }

    public static void baoLai() {
        List<Entry> list = sCache;
        if (list != null) {
            H.post(new z0(list, 2));
        }
    }

    public static List<Entry> danhSachDaCo() {
        return sCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fire(List<Entry> list) {
        ArrayList arrayList;
        Set<Listener> set = sListeners;
        synchronized (set) {
            arrayList = new ArrayList(set);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Listener) obj).onApps(list);
            } catch (Throwable unused) {
            }
        }
    }

    public static String firstInstalled(Context context, String... strArr) {
        PackageManager packageManager = context.getPackageManager();
        for (String str : strArr) {
            if (!packageManager.queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(str), 0).isEmpty()) {
                return str;
            }
        }
        return null;
    }

    public static Map<String, Long> ganDay(Context context) {
        List<UsageStats> listQueryUsageStats;
        Long l;
        HashMap map = new HashMap();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
            if (usageStatsManager != null && (listQueryUsageStats = usageStatsManager.queryUsageStats(1, jCurrentTimeMillis - 604800000, jCurrentTimeMillis)) != null) {
                for (UsageStats usageStats : listQueryUsageStats) {
                    long lastTimeUsed = usageStats.getLastTimeUsed();
                    if (lastTimeUsed > 0 && ((l = (Long) map.get(usageStats.getPackageName())) == null || lastTimeUsed > l.longValue())) {
                        map.put(usageStats.getPackageName(), Long.valueOf(lastTimeUsed));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public static Map<String, Long> ganDayNhanh(Context context, Runnable runnable) {
        Map<String, Long> map = sGanDay;
        if ((map == null || SystemClock.elapsedRealtime() - sGanDayLuc > GANDAY_HAN_MS) && !sDangDocGanDay) {
            sDangDocGanDay = true;
            new Thread(new c0(1, context.getApplicationContext(), runnable), "apprepo-ganday").start();
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public static Map<String, Long> hayDung(Context context) {
        HashMap map = new HashMap();
        try {
            UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<UsageStats> listQueryUsageStats = usageStatsManager.queryUsageStats(1, jCurrentTimeMillis - 604800000, jCurrentTimeMillis);
            if (listQueryUsageStats != null) {
                for (UsageStats usageStats : listQueryUsageStats) {
                    long totalTimeInForeground = usageStats.getTotalTimeInForeground();
                    if (totalTimeInForeground > 0) {
                        Long l = (Long) map.get(usageStats.getPackageName());
                        String packageName = usageStats.getPackageName();
                        if (l != null) {
                            totalTimeInForeground += l.longValue();
                        }
                        map.put(packageName, Long.valueOf(totalTimeInForeground));
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            String.valueOf(th);
            return map;
        }
    }

    public static boolean hienTrenLauncher(Context context, String str) {
        return xc.e(context, "appHien_" + str, true);
    }

    public static boolean khoaDoc(int i) {
        return i == 1 || i == 9 || i == 7 || i == 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ganDayNhanh$5(Context context, Runnable runnable) {
        Map<String, Long> map;
        try {
            map = ganDay(context);
        } catch (Throwable unused) {
            map = new HashMap<>();
        }
        sGanDay = map;
        sGanDayLuc = SystemClock.elapsedRealtime();
        sDangDocGanDay = false;
        if (runnable != null) {
            H.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$load$1(Context context) {
        List<Entry> listScan = scan(context);
        sCache = listScan;
        H.post(new z0(listScan, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$rescan$4(Context context) {
        List<Entry> listScan = scan(context);
        sCache = listScan;
        H.post(new z0(listScan, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$topGanDay$6(Map map, Entry entry, Entry entry2) {
        return Long.compare(map.get(entry2.pkg) == null ? 0L : ((Long) map.get(entry2.pkg)).longValue(), map.get(entry.pkg) != null ? ((Long) map.get(entry.pkg)).longValue() : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$topHayDung$7(Map map, Entry entry, Entry entry2) {
        return Long.compare(map.get(entry2.pkg) == null ? 0L : ((Long) map.get(entry2.pkg)).longValue(), map.get(entry.pkg) != null ? ((Long) map.get(entry.pkg)).longValue() : 0L);
    }

    public static boolean launch(Context context, Entry entry) {
        try {
            Intent intentAddCategory = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
            intentAddCategory.setClassName(entry.pkg, entry.cls);
            intentAddCategory.addFlags(270532608);
            context.startActivity(intentAddCategory);
            return true;
        } catch (Throwable unused) {
            String str = entry.pkg;
            return false;
        }
    }

    public static boolean launchOnDisplay(Context context, ComponentName componentName, int i) {
        try {
            Intent intentAddCategory = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
            intentAddCategory.setComponent(componentName);
            intentAddCategory.addFlags(268435456);
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            activityOptionsMakeBasic.setLaunchDisplayId(i);
            context.startActivity(intentAddCategory, activityOptionsMakeBasic.toBundle());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean launchPackage(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            launchIntentForPackage.addFlags(270532608);
            context.startActivity(launchIntentForPackage);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void load(Context context, Listener listener) {
        Set<Listener> set = sListeners;
        synchronized (set) {
            set.add(listener);
        }
        watch(context);
        List<Entry> list = sCache;
        if (list != null) {
            listener.onApps(list);
        } else {
            new Thread(new b1(context, 0), "apprepo-scan").start();
        }
    }

    private static Set<String> mediaPackages(Context context) {
        HashSet hashSet = new HashSet();
        try {
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentServices(new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE), 0).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    hashSet.add(serviceInfo.packageName);
                }
            }
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rescan(Context context) {
        new Thread(new b1(context, 1), "apprepo-rescan").start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List<Entry> scan(Context context) {
        Drawable icon;
        ArrayList arrayList = new ArrayList();
        Set<String> setMediaPackages = mediaPackages(context);
        String packageName = context.getPackageName();
        try {
            LauncherApps launcherApps = (LauncherApps) context.getSystemService("launcherapps");
            List<LauncherActivityInfo> activityList = launcherApps == null ? null : launcherApps.getActivityList(null, Process.myUserHandle());
            if (activityList != null && !activityList.isEmpty()) {
                for (LauncherActivityInfo launcherActivityInfo : activityList) {
                    String packageName2 = launcherActivityInfo.getComponentName().getPackageName();
                    if (!packageName.equals(packageName2)) {
                        int i = 0;
                        try {
                            icon = launcherActivityInfo.getIcon(0);
                        } catch (Throwable unused) {
                            icon = null;
                        }
                        try {
                            i = launcherActivityInfo.getActivityInfo().screenOrientation;
                        } catch (Throwable unused2) {
                        }
                        arrayList.add(new Entry(String.valueOf(launcherActivityInfo.getLabel()), packageName2, launcherActivityInfo.getComponentName().getClassName(), icon, setMediaPackages.contains(packageName2), khoaDoc(i)));
                    }
                }
            }
        } catch (Throwable unused3) {
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listScanViaPm = arrayList;
        if (zIsEmpty) {
            listScanViaPm = scanViaPm(context, setMediaPackages, packageName);
        }
        Collections.sort(listScanViaPm);
        return listScanViaPm;
    }

    private static List<Entry> scanViaPm(Context context, Set<String> set, String str) {
        Drawable drawableLoadIcon;
        ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    String str2 = activityInfo.packageName;
                    if (!str.equals(str2)) {
                        try {
                            drawableLoadIcon = resolveInfo.loadIcon(packageManager);
                        } catch (Throwable unused) {
                            drawableLoadIcon = null;
                        }
                        arrayList.add(new Entry(String.valueOf(resolveInfo.loadLabel(packageManager)), str2, resolveInfo.activityInfo.name, drawableLoadIcon, set.contains(str2), khoaDoc(resolveInfo.activityInfo.screenOrientation)));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    public static String tenApp(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Throwable unused) {
            return "Bản đồ";
        }
    }

    public static List<Entry> topGanDay(Context context, List<Entry> list, int i, Runnable runnable) {
        Map<String, Long> mapGanDayNhanh = ganDayNhanh(context, runnable);
        if (mapGanDayNhanh.isEmpty() || list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : list) {
            if (mapGanDayNhanh.containsKey(entry.pkg)) {
                arrayList.add(entry);
            }
        }
        Collections.sort(arrayList, new a1(mapGanDayNhanh, 0));
        return arrayList.size() > i ? new ArrayList(arrayList.subList(0, i)) : arrayList;
    }

    public static List<Entry> topHayDung(Context context, List<Entry> list, int i) {
        Map<String, Long> mapHayDung = hayDung(context);
        if (mapHayDung.isEmpty() || list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : list) {
            if (mapHayDung.containsKey(entry.pkg)) {
                arrayList.add(entry);
            }
        }
        Collections.sort(arrayList, new a1(mapHayDung, 1));
        return arrayList.size() > i ? new ArrayList(arrayList.subList(0, i)) : arrayList;
    }

    public static void unload(Listener listener) {
        Set<Listener> set = sListeners;
        synchronized (set) {
            set.remove(listener);
        }
    }

    private static void watch(final Context context) {
        if (sWatching) {
            return;
        }
        sWatching = true;
        try {
            LauncherApps launcherApps = (LauncherApps) context.getApplicationContext().getSystemService("launcherapps");
            if (launcherApps == null) {
                return;
            }
            launcherApps.registerCallback(new LauncherApps.Callback() { // from class: com.carstream.tech.launcher.AppRepo.1
                @Override // android.content.pm.LauncherApps.Callback
                public void onPackageAdded(String str, UserHandle userHandle) {
                    AppRepo.rescan(context.getApplicationContext());
                }

                @Override // android.content.pm.LauncherApps.Callback
                public void onPackageChanged(String str, UserHandle userHandle) {
                    AppRepo.rescan(context.getApplicationContext());
                }

                @Override // android.content.pm.LauncherApps.Callback
                public void onPackageRemoved(String str, UserHandle userHandle) {
                    AppRepo.rescan(context.getApplicationContext());
                }

                @Override // android.content.pm.LauncherApps.Callback
                public void onPackagesAvailable(String[] strArr, UserHandle userHandle, boolean z) {
                    AppRepo.rescan(context.getApplicationContext());
                }

                @Override // android.content.pm.LauncherApps.Callback
                public void onPackagesUnavailable(String[] strArr, UserHandle userHandle, boolean z) {
                    AppRepo.rescan(context.getApplicationContext());
                }
            }, H);
        } catch (Throwable unused) {
        }
    }
}
