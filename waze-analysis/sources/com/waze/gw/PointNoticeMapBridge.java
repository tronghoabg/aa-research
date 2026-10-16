package com.waze.gw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.AudioStats;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.waze.gw.PointNoticeDatabase;
import com.waze.gw.PointNoticeRepository;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
final class PointNoticeMapBridge {
    private static final double EARTH_RADIUS_M = 6371008.8d;
    private static final int ICON_PX = 46;
    private static final int MAX_MARKERS = 64;
    private static final String PREFS = "waze_hud_gw";
    private static final String PREF_ENABLED = "map_point_notices";
    private static final double RADIUS_M = 2000.0d;
    private static final String TAG = "WazeGW-PointMap";
    private static Object activeHandle;
    private static long lastReflectErrorMs;
    private static int publishGeneration;
    private static volatile Reflection reflection;
    private static volatile Object templateRequest;
    private static volatile List<MapPoint> points = Collections.emptyList();
    private static volatile String pointSignature = "";
    private static volatile String lastPublishedSignature = "";
    private static volatile WeakReference<Object> controllerRef = new WeakReference<>(null);
    private static final ThreadLocal<Boolean> internalPublish = new ThreadLocal<>();
    private static final HashMap<String, Bitmap> normalizedIcons = new HashMap<>();

    private PointNoticeMapBridge() {
    }

    static void update(Context context, PointNoticeDatabase pointNoticeDatabase, PointNoticeRepository.PositionSnapshot positionSnapshot, double d2) {
        double d3;
        double d4;
        if (context == null || pointNoticeDatabase == null || positionSnapshot == null || !context.getSharedPreferences(PREFS, 0).getBoolean(PREF_ENABLED, false)) {
            clear();
            return;
        }
        List<PointNoticeDatabase.Notice> listNearby = pointNoticeDatabase.nearby(positionSnapshot.latitude, positionSnapshot.longitude);
        ArrayList arrayList = new ArrayList();
        for (PointNoticeDatabase.Notice notice : listNearby) {
            double dDistanceM = distanceM(positionSnapshot.latitude, positionSnapshot.longitude, notice.latitude(), notice.longitude());
            if (dDistanceM <= RADIUS_M) {
                double dSignedAngle = signedAngle(d2, bearing(positionSnapshot.latitude, positionSnapshot.longitude, notice.latitude(), notice.longitude()));
                if (dSignedAngle > AudioStats.AUDIO_AMPLITUDE_NONE && dSignedAngle <= 70.0d) {
                    double radians = Math.toRadians(dSignedAngle);
                    double dCos = Math.cos(radians) * dDistanceM;
                    double dSin = Math.sin(radians) * dDistanceM;
                    double dMax = 3.0d;
                    if (positionSnapshot.mapMatched) {
                        d3 = dDistanceM;
                        d4 = dSin;
                    } else {
                        d3 = dDistanceM;
                        d4 = dSin;
                        dMax = Math.max(3.0d, Math.min(8.0d, positionSnapshot.accuracyM * 0.25d));
                    }
                    if (dCos >= 20.0d && d4 >= dMax) {
                        if (!Gateway.hudNavigating || !isSpeedNotice(notice)) {
                            arrayList.add(new DistancePoint(new MapPoint(notice.id, notice.type, notice.latitude(), notice.longitude(), rawIcon(notice)), d3));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator<DistancePoint>() { // from class: com.waze.gw.PointNoticeMapBridge.1
            @Override // java.util.Comparator
            public int compare(DistancePoint distancePoint, DistancePoint distancePoint2) {
                int iCompare = Double.compare(distancePoint.distanceM, distancePoint2.distanceM);
                return iCompare != 0 ? iCompare : distancePoint.point.id.compareTo(distancePoint2.point.id);
            }
        });
        ArrayList arrayList2 = new ArrayList(Math.min(64, arrayList.size()));
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(64, arrayList.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            MapPoint mapPoint = ((DistancePoint) arrayList.get(i2)).point;
            arrayList2.add(mapPoint);
            sb.append(mapPoint.id).append(':').append(mapPoint.icon).append(';');
        }
        String string = sb.toString();
        if (!string.equals(pointSignature)) {
            points = Collections.unmodifiableList(arrayList2);
            pointSignature = string;
            Log.i(TAG, "nearby markers=" + arrayList2.size());
            schedulePublish();
        }
    }

    static void clear() {
        if (!points.isEmpty()) {
            points = Collections.emptyList();
            pointSignature = "";
            Log.i(TAG, "nearby markers=0");
            schedulePublish();
        }
    }

    static Object attach(Object obj, Object obj2) {
        if (obj2 == null || obj == null || Boolean.TRUE.equals(internalPublish.get())) {
            return obj2;
        }
        try {
            if (reflection == null) {
                synchronized (PointNoticeMapBridge.class) {
                    if (reflection == null) {
                        reflection = new Reflection(obj2.getClass().getClassLoader());
                    }
                }
            }
            Object obj3 = controllerRef.get();
            controllerRef = new WeakReference<>(obj);
            templateRequest = obj2;
            if (obj3 != obj) {
                Log.i(TAG, "mobile map controller attached");
            }
            if (!points.isEmpty() && !pointSignature.equals(lastPublishedSignature)) {
                schedulePublish();
            }
            return obj2;
        } catch (Throwable th) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - lastReflectErrorMs > 10000) {
                lastReflectErrorMs = jElapsedRealtime;
                Log.w(TAG, "Unable to inject map markers", th);
            }
            return obj2;
        }
    }

    private static void schedulePublish() {
        final int i2;
        synchronized (PointNoticeMapBridge.class) {
            i2 = publishGeneration + 1;
            publishGeneration = i2;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.waze.gw.PointNoticeMapBridge.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (PointNoticeMapBridge.class) {
                    if (i2 != PointNoticeMapBridge.publishGeneration) {
                        return;
                    }
                    PointNoticeMapBridge.publishNow();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void publishNow() {
        Object objInvoke;
        Object obj = controllerRef.get();
        Object obj2 = templateRequest;
        Reflection reflection2 = reflection;
        if (obj == null || obj2 == null || reflection2 == null) {
            return;
        }
        List<MapPoint> list = points;
        Object obj3 = activeHandle;
        try {
            if (list.isEmpty()) {
                objInvoke = null;
            } else {
                ArrayList<Object> arrayListBuildMarkers = buildMarkers(reflection2, list);
                List listEmptyList = Collections.emptyList();
                Object objNewInstance = reflection2.mapContentCtor.newInstance(listEmptyList, listEmptyList, arrayListBuildMarkers, listEmptyList, listEmptyList, reflection2.additional.invoke(obj2, new Object[0]), reflection2.navigation.invoke(obj2, new Object[0]), reflection2.scheme.invoke(obj2, new Object[0]));
                Method method = obj.getClass().getMethod("b", reflection2.mapContentClass);
                internalPublish.set(Boolean.TRUE);
                try {
                    objInvoke = method.invoke(obj, objNewInstance);
                    internalPublish.remove();
                } catch (Throwable th) {
                    internalPublish.remove();
                    throw th;
                }
            }
            activeHandle = objInvoke;
            lastPublishedSignature = pointSignature;
            cancelHandle(obj3);
            Log.i(TAG, "layer published=" + list.size());
        } catch (Throwable th2) {
            internalPublish.remove();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - lastReflectErrorMs > 10000) {
                lastReflectErrorMs = jElapsedRealtime;
                Log.w(TAG, "Unable to publish marker layer", th2);
            }
        }
    }

    private static ArrayList<Object> buildMarkers(Reflection reflection2, List<MapPoint> list) throws Exception {
        ArrayList<Object> arrayList = new ArrayList<>(list.size());
        for (MapPoint mapPoint : list) {
            arrayList.add(reflection2.markerWrapperCtor.newInstance(reflection2.markerViewCtor.newInstance(reflection2.coordinateCtor.newInstance(Double.valueOf(mapPoint.latitude), Double.valueOf(mapPoint.longitude)), reflection2.bitmapRenderableCtor.newInstance(Proxy.newProxyInstance(reflection2.loader, new Class[]{reflection2.function1Class}, new BitmapCreator(mapPoint.icon))), reflection2.centerAlignment, reflection2.poiPriority, reflection2.zoomRange, Float.valueOf(1.0f), null, null, null), null));
        }
        return arrayList;
    }

    private static void cancelHandle(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Object objInvoke = obj.getClass().getMethod(CmcdData.OBJECT_TYPE_AUDIO_ONLY, new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke != null) {
                objInvoke.getClass().getMethod("x", new Class[0]).invoke(objInvoke, new Object[0]);
            }
        } catch (Throwable th) {
            Log.w(TAG, "Unable to cancel previous marker layer", th);
        }
    }

    private static final class BitmapCreator implements InvocationHandler {
        private final String icon;

        BitmapCreator(String str) {
            this.icon = str;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Context context = null;
            boolean z = false;
            if ("invoke".equals(name)) {
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Context)) {
                    context = (Context) objArr[0];
                }
                Bitmap bitmapCopy = PointNoticeMapBridge.normalizedIcon(context, this.icon).copy(Bitmap.Config.ARGB_8888, false);
                Log.d(PointNoticeMapBridge.TAG, "bitmap rendered=" + this.icon + " " + bitmapCopy.getWidth() + "x" + bitmapCopy.getHeight());
                return bitmapCopy;
            }
            if ("hashCode".equals(name)) {
                return Integer.valueOf(this.icon.hashCode());
            }
            if (!"equals".equals(name)) {
                if (!"toString".equals(name)) {
                    return null;
                }
                return "PointBitmapCreator(" + this.icon + ")";
            }
            if (objArr != null && objArr.length > 0 && obj == objArr[0]) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap normalizedIcon(Context context, String str) {
        if (context == null) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        synchronized (normalizedIcons) {
            Bitmap bitmap = normalizedIcons.get(str);
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
            Bitmap bitmapAlertIcon = Signs.alertIcon(context, str);
            if (bitmapAlertIcon == null || bitmapAlertIcon.isRecycled()) {
                bitmapAlertIcon = Signs.pin(context, "bigpin_hazard");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(46, 46, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPremultiplied(true);
            if (bitmapAlertIcon != null && !bitmapAlertIcon.isRecycled()) {
                float fMin = Math.min(46.0f / bitmapAlertIcon.getWidth(), 46.0f / bitmapAlertIcon.getHeight());
                float width = bitmapAlertIcon.getWidth() * fMin;
                float height = bitmapAlertIcon.getHeight() * fMin;
                float f2 = (46.0f - width) * 0.5f;
                float f3 = (46.0f - height) * 0.5f;
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapAlertIcon, (Rect) null, new RectF(f2, f3, width + f2, height + f3), new Paint(3));
            }
            normalizedIcons.put(str, bitmapCreateBitmap);
            return bitmapCreateBitmap;
        }
    }

    private static String rawIcon(PointNoticeDatabase.Notice notice) {
        if ((notice.type == 12 || notice.type == 13) && notice.hasValueKmh) {
            return "speeddrop_" + notice.valueKmh;
        }
        return "wme_" + notice.type;
    }

    private static boolean isSpeedNotice(PointNoticeDatabase.Notice notice) {
        return notice.type == 12 || notice.type == 13;
    }

    private static double signedAngle(double d2, double d3) {
        double dNormalize = normalize(d3) - normalize(d2);
        if (dNormalize > 180.0d) {
            dNormalize -= 360.0d;
        }
        return dNormalize <= -180.0d ? dNormalize + 360.0d : dNormalize;
    }

    private static double normalize(double d2) {
        double d3 = d2 % 360.0d;
        return d3 < AudioStats.AUDIO_AMPLITUDE_NONE ? d3 + 360.0d : d3;
    }

    private static double bearing(double d2, double d3, double d4, double d5) {
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(d4);
        double radians3 = Math.toRadians(d5 - d3);
        return normalize(Math.toDegrees(Math.atan2(Math.sin(radians3) * Math.cos(radians2), (Math.cos(radians) * Math.sin(radians2)) - ((Math.sin(radians) * Math.cos(radians2)) * Math.cos(radians3)))));
    }

    private static double distanceM(double d2, double d3, double d4, double d5) {
        double radians = Math.toRadians(d4 - d2);
        double d6 = radians / 2.0d;
        double radians2 = Math.toRadians(d5 - d3) / 2.0d;
        double dSin = (Math.sin(d6) * Math.sin(d6)) + (Math.cos(Math.toRadians(d2)) * Math.cos(Math.toRadians(d4)) * Math.sin(radians2) * Math.sin(radians2));
        return Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 1.27420176E7d;
    }

    private static final class MapPoint {
        final String icon;
        final String id;
        final double latitude;
        final double longitude;
        final int type;

        MapPoint(String str, int i2, double d2, double d3, String str2) {
            this.id = str;
            this.type = i2;
            this.latitude = d2;
            this.longitude = d3;
            this.icon = str2;
        }
    }

    private static final class DistancePoint {
        final double distanceM;
        final MapPoint point;

        DistancePoint(MapPoint mapPoint, double d2) {
            this.point = mapPoint;
            this.distanceM = d2;
        }
    }

    private static final class Reflection {
        final Method additional;
        final Constructor<?> bitmapRenderableCtor;
        final Object centerAlignment;
        final Constructor<?> coordinateCtor;
        final Method events;
        final Class<?> function1Class;
        final ClassLoader loader;
        final Class<?> mapContentClass;
        final Constructor<?> mapContentCtor;
        final Constructor<?> markerViewCtor;
        final Constructor<?> markerWrapperCtor;
        final Method markers;
        final Method navigation;
        final Object poiPriority;
        final Method polygons;
        final Method polylines;
        final Method routes;
        final Method scheme;
        final Object zoomRange;

        Reflection(ClassLoader classLoader) throws Exception {
            this.loader = classLoader;
            Class<?> cls = Class.forName("com.waze.shared_infra.h.c", false, classLoader);
            Class<?> cls2 = Class.forName("com.waze.gas.a", false, classLoader);
            Class<?> cls3 = Class.forName("com.waze.map.as", false, classLoader);
            Class<?> cls4 = Class.forName("com.waze.map.aw", false, classLoader);
            Class<?> cls5 = Class.forName("com.waze.map.b.fk", false, classLoader);
            Class<?> cls6 = Class.forName("com.waze.map.ba", false, classLoader);
            Class<?> cls7 = Class.forName("com.waze.map.av", false, classLoader);
            Class<?> cls8 = Class.forName("com.waze.map.bc", false, classLoader);
            Class<?> cls9 = Class.forName("com.waze.coroutines.b", false, classLoader);
            this.mapContentClass = Class.forName("com.waze.map.b.bi", false, classLoader);
            Class<?> cls10 = Class.forName("com.waze.map.b.ca", false, classLoader);
            Class<?> cls11 = Class.forName("com.waze.map.b.dn", false, classLoader);
            Class<?> cls12 = Class.forName("com.waze.map.b.bh", false, classLoader);
            this.function1Class = Class.forName("h.g.a.l", false, classLoader);
            Class<?> cls13 = Class.forName("com.waze.map.ax", false, classLoader);
            this.coordinateCtor = cls.getConstructor(Double.TYPE, Double.TYPE);
            this.bitmapRenderableCtor = cls13.getConstructor(this.function1Class);
            this.markerViewCtor = cls8.getConstructor(cls, cls2, cls3, cls4, cls5, Float.TYPE, Point.class, cls6, cls7);
            this.markerWrapperCtor = cls9.getConstructor(cls8, cls9);
            this.mapContentCtor = this.mapContentClass.getConstructor(List.class, List.class, List.class, List.class, List.class, cls10, cls11, cls12);
            this.centerAlignment = Enum.valueOf(cls3, "CENTER");
            this.poiPriority = Enum.valueOf(cls4, "ALERTS");
            this.zoomRange = cls5.getConstructor(Float.TYPE, Float.TYPE).newInstance(Float.valueOf(0.0f), Float.valueOf(1.0f));
            this.routes = this.mapContentClass.getMethod(CmcdData.STREAMING_FORMAT_HLS, new Class[0]);
            this.events = this.mapContentClass.getMethod("d", new Class[0]);
            this.markers = this.mapContentClass.getMethod("e", new Class[0]);
            this.polylines = this.mapContentClass.getMethod("g", new Class[0]);
            this.polygons = this.mapContentClass.getMethod("f", new Class[0]);
            this.additional = this.mapContentClass.getMethod("b", new Class[0]);
            this.navigation = this.mapContentClass.getMethod("c", new Class[0]);
            this.scheme = this.mapContentClass.getMethod(CmcdData.OBJECT_TYPE_AUDIO_ONLY, new Class[0]);
        }
    }
}
