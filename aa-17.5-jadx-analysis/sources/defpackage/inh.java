package defpackage;

import android.content.ComponentName;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class inh {
    static final ComponentName a;
    public static final yfy b;
    public static final yfy c;
    public static final yfy d;
    public static final yfy e;
    public static final ygr f;
    public static final ComponentName g;
    public static final ComponentName h;
    static final yfs i;
    static final yfs j;
    static final ygu k;
    public static final inh l;
    private static final ComponentName o;
    private static final ComponentName p;
    private static final ComponentName q;
    private static final ComponentName r;
    public boolean m = true;
    public Map n = new HashMap(e);

    static {
        ComponentName componentName = new ComponentName("com.google.android.apps.maps", "com.google.android.apps.gmm.car.GmmCarProjectionService");
        a = componentName;
        ComponentName componentName2 = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateNavigationService");
        o = componentName2;
        ComponentName componentName3 = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.telecom.TelecomService");
        p = componentName3;
        ComponentName componentName4 = new ComponentName(RemoteApiConstants.NOW_PACKAGE, "com.google.android.apps.gsa.staticplugins.gearhead.projected.VoicePlateCarService");
        q = componentName4;
        ComponentName componentName5 = new ComponentName(RemoteApiConstants.NOW_PACKAGE, "com.google.android.libraries.assistant.auto.jumpboost.caractivity.VoicePlateCarService");
        r = componentName5;
        f = ygr.q(new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.system.secondary.activity.clock.ClockCarActivityService"), new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.system.secondary.activity.media.MiniMediaCarActivityService"), new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.system.secondary.activity.telecom.MiniTelecomCarActivityService"));
        ComponentName componentName6 = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.ProjectionTrampolineInitialService");
        g = componentName6;
        h = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.preflight.PreflightCarActivityService");
        yfu yfuVar = new yfu(4);
        yfuVar.e(componentName6, tfj.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TRAMPOLINE_SERVICE);
        yfuVar.e(componentName, tfj.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GMM_PACKAGE_CAR_PROJECTION_SERVICE);
        yfuVar.e(componentName3, tfj.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TELECOM_SERVICE);
        yfuVar.e(componentName2, tfj.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_NAVIGATION_SERVICE);
        yfuVar.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.applauncher.GhAppLauncherService"), tfj.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_LAUNCHER_SERVICE);
        yfuVar.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.media.MediaService"), tfj.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_MEDIA_SERVICE);
        yfuVar.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateService"), tfj.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_SERVICE);
        yfuVar.e(componentName4, tfj.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_VOICE_PLATE_SERVICE);
        yfuVar.e(componentName5, tfj.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_NEW_VOICE_PLATE_SERVICE);
        b = yfuVar.d(true);
        yfu yfuVar2 = new yfu(4);
        yfuVar2.e(componentName, tfj.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GMM_PACKAGE_CAR_PROJECTION_SERVICE);
        yfuVar2.e(componentName3, tfj.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TELECOM_SERVICE);
        yfuVar2.e(componentName2, tfj.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_NAVIGATION_SERVICE);
        yfuVar2.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.applauncher.GhAppLauncherService"), tfj.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_LAUNCHER_SERVICE);
        yfuVar2.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.media.MediaService"), tfj.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_MEDIA_SERVICE);
        yfuVar2.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateService"), tfj.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_SERVICE);
        yfuVar2.e(componentName6, tfj.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TRAMPOLINE_SERVICE);
        yfuVar2.e(componentName4, tfj.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_VOICE_PLATE_SERVICE);
        yfuVar2.e(componentName5, tfj.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_NEW_VOICE_PLATE_SERVICE);
        c = yfuVar2.d(true);
        yfu yfuVar3 = new yfu(4);
        yfuVar3.e(componentName, tfj.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GMM_PACKAGE_CAR_PROJECTION_SERVICE);
        yfuVar3.e(componentName3, tfj.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TELECOM_SERVICE);
        yfuVar3.e(componentName2, tfj.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_NAVIGATION_SERVICE);
        yfuVar3.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.applauncher.GhAppLauncherService"), tfj.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_LAUNCHER_SERVICE);
        yfuVar3.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.media.MediaService"), tfj.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_MEDIA_SERVICE);
        yfuVar3.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateService"), tfj.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_SERVICE);
        yfuVar3.e(componentName6, tfj.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TRAMPOLINE_SERVICE);
        yfuVar3.e(componentName4, tfj.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_VOICE_PLATE_SERVICE);
        yfuVar3.e(componentName5, tfj.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_NEW_VOICE_PLATE_SERVICE);
        d = yfuVar3.d(true);
        yfu yfuVar4 = new yfu(4);
        yfuVar4.e(componentName, tfj.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_GMM_PACKAGE_CAR_PROJECTION_SERVICE);
        yfuVar4.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.applauncher.GhAppLauncherService"), tfj.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_GH_PACKAGE_LAUNCHER_SERVICE);
        yfuVar4.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.media.MediaService"), tfj.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_GH_PACKAGE_MEDIA_SERVICE);
        yfuVar4.e(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateService"), tfj.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_SERVICE);
        yfuVar4.e(componentName4, tfj.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_ASSISTANT_PACKAGE_VOICE_PLATE_SERVICE);
        yfuVar4.e(componentName5, tfj.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_ASSISTANT_PACKAGE_NEW_VOICE_PLATE_SERVICE);
        e = yfuVar4.d(true);
        yfr yfrVar = new yfr();
        yfrVar.b(2, tfj.GEARHEAD_GMM_CAM_COLD_START_WINDOW_READY);
        yfrVar.b(2, tfj.GEARHEAD_GMM_CAM_COLD_START_CLIENT_START_COMPLETE);
        yfrVar.b(2, tfj.GEARHEAD_GMM_CAM_COLD_START_WINDOW_ATTACHED);
        i = yfrVar.a();
        yfr yfrVar2 = new yfr();
        yfrVar2.b(2, tfj.GEARHEAD_GMM_CAM_NON_COLD_START_WINDOW_READY);
        yfrVar2.b(2, tfj.GEARHEAD_GMM_CAM_NON_COLD_START_CLIENT_START_COMPLETE);
        yfrVar2.b(2, tfj.GEARHEAD_GMM_CAM_NON_COLD_START_WINDOW_ATTACHED);
        j = yfrVar2.a();
        ygs ygsVar = new ygs();
        ygsVar.b(3, tfj.GEARHEAD_GMM_CAM_NON_COLD_START_WINDOW_READY);
        ygsVar.b(3, tfj.GEARHEAD_GMM_CAM_COLD_START_WINDOW_READY);
        ygsVar.b(4, tfj.GEARHEAD_GMM_CAM_COLD_START_CLIENT_START_COMPLETE);
        ygsVar.b(4, tfj.GEARHEAD_GMM_CAM_NON_COLD_START_CLIENT_START_COMPLETE);
        k = ygsVar.a();
        l = new inh();
    }

    private inh() {
    }

    public final void a() {
        this.m = true;
        this.n = new HashMap(e);
    }
}
