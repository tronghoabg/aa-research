package w6;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import kd.RunnableC3307c;
import u6.v;

/* loaded from: classes3.dex */
public final class k extends GLSurfaceView {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f47355a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f47356b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f47357c;

    /* renamed from: d, reason: collision with root package name */
    public final C4370d f47358d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f47359e;

    /* renamed from: f, reason: collision with root package name */
    public final i f47360f;

    /* renamed from: g, reason: collision with root package name */
    public SurfaceTexture f47361g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f47362h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f47363i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f47364j;
    public boolean k;

    public k(Context context) {
        super(context, null);
        this.f47355a = new CopyOnWriteArrayList();
        this.f47359e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f47356b = sensorManager;
        Sensor defaultSensor = v.f46721a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f47357c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f47360f = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f47358d = new C4370d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.f47363i = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z2 = this.f47363i && this.f47364j;
        Sensor sensor = this.f47357c;
        if (sensor == null || z2 == this.k) {
            return;
        }
        C4370d c4370d = this.f47358d;
        SensorManager sensorManager = this.f47356b;
        if (z2) {
            sensorManager.registerListener(c4370d, sensor, 0);
        } else {
            sensorManager.unregisterListener(c4370d);
        }
        this.k = z2;
    }

    public InterfaceC4367a getCameraMotionListener() {
        return this.f47360f;
    }

    public v6.i getVideoFrameMetadataListener() {
        return this.f47360f;
    }

    public Surface getVideoSurface() {
        return this.f47362h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47359e.post(new RunnableC3307c(this, 18));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f47364j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f47364j = true;
        a();
    }

    public void setDefaultStereoMode(int i5) {
        this.f47360f.k = i5;
    }

    public void setUseSensorRotation(boolean z2) {
        this.f47363i = z2;
        a();
    }
}
