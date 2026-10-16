package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ino {
    static final android.content.ComponentName a;
    public static final defpackage.yhe b;
    public static final defpackage.yhe c;
    public static final defpackage.yhe d;
    public static final defpackage.yhe e;
    public static final defpackage.yhx f;
    public static final android.content.ComponentName g;
    public static final android.content.ComponentName h;
    static final defpackage.ygy i;
    static final defpackage.ygy j;
    static final defpackage.yia k;
    public static final defpackage.ino l;
    private static final android.content.ComponentName o;
    private static final android.content.ComponentName p;
    private static final android.content.ComponentName q;
    private static final android.content.ComponentName r;
    public boolean m = true;
    public java.util.Map n = new java.util.HashMap(e);

    static {
        android.content.ComponentName componentName = new android.content.ComponentName("com.google.android.apps.maps", "com.google.android.apps.gmm.car.GmmCarProjectionService");
        a = componentName;
        android.content.ComponentName componentName2 = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateNavigationService");
        o = componentName2;
        android.content.ComponentName componentName3 = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.telecom.TelecomService");
        p = componentName3;
        android.content.ComponentName componentName4 = new android.content.ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.gearhead.projected.VoicePlateCarService");
        q = componentName4;
        android.content.ComponentName componentName5 = new android.content.ComponentName("com.google.android.googlequicksearchbox", "com.google.android.libraries.assistant.auto.jumpboost.caractivity.VoicePlateCarService");
        r = componentName5;
        f = defpackage.yhx.q(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.system.secondary.activity.clock.ClockCarActivityService"), new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.system.secondary.activity.media.MiniMediaCarActivityService"), new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.system.secondary.activity.telecom.MiniTelecomCarActivityService"));
        android.content.ComponentName componentName6 = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.ProjectionTrampolineInitialService");
        g = componentName6;
        h = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.preflight.PreflightCarActivityService");
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(componentName6, defpackage.tgf.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TRAMPOLINE_SERVICE);
        yhaVar.f(componentName, defpackage.tgf.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GMM_PACKAGE_CAR_PROJECTION_SERVICE);
        yhaVar.f(componentName3, defpackage.tgf.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TELECOM_SERVICE);
        yhaVar.f(componentName2, defpackage.tgf.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_NAVIGATION_SERVICE);
        yhaVar.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.applauncher.GhAppLauncherService"), defpackage.tgf.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_LAUNCHER_SERVICE);
        yhaVar.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.media.MediaService"), defpackage.tgf.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_MEDIA_SERVICE);
        yhaVar.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateService"), defpackage.tgf.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_SERVICE);
        yhaVar.f(componentName4, defpackage.tgf.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_VOICE_PLATE_SERVICE);
        yhaVar.f(componentName5, defpackage.tgf.GEARHEAD_COLD_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_NEW_VOICE_PLATE_SERVICE);
        b = yhaVar.d(true);
        defpackage.yha yhaVar2 = new defpackage.yha(4);
        yhaVar2.f(componentName, defpackage.tgf.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GMM_PACKAGE_CAR_PROJECTION_SERVICE);
        yhaVar2.f(componentName3, defpackage.tgf.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TELECOM_SERVICE);
        yhaVar2.f(componentName2, defpackage.tgf.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_NAVIGATION_SERVICE);
        yhaVar2.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.applauncher.GhAppLauncherService"), defpackage.tgf.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_LAUNCHER_SERVICE);
        yhaVar2.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.media.MediaService"), defpackage.tgf.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_MEDIA_SERVICE);
        yhaVar2.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateService"), defpackage.tgf.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_SERVICE);
        yhaVar2.f(componentName6, defpackage.tgf.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TRAMPOLINE_SERVICE);
        yhaVar2.f(componentName4, defpackage.tgf.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_VOICE_PLATE_SERVICE);
        yhaVar2.f(componentName5, defpackage.tgf.GEARHEAD_WARM_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_NEW_VOICE_PLATE_SERVICE);
        c = yhaVar2.d(true);
        defpackage.yha yhaVar3 = new defpackage.yha(4);
        yhaVar3.f(componentName, defpackage.tgf.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GMM_PACKAGE_CAR_PROJECTION_SERVICE);
        yhaVar3.f(componentName3, defpackage.tgf.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TELECOM_SERVICE);
        yhaVar3.f(componentName2, defpackage.tgf.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_NAVIGATION_SERVICE);
        yhaVar3.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.applauncher.GhAppLauncherService"), defpackage.tgf.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_LAUNCHER_SERVICE);
        yhaVar3.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.media.MediaService"), defpackage.tgf.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_MEDIA_SERVICE);
        yhaVar3.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateService"), defpackage.tgf.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_SERVICE);
        yhaVar3.f(componentName6, defpackage.tgf.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_GH_PACKAGE_TRAMPOLINE_SERVICE);
        yhaVar3.f(componentName4, defpackage.tgf.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_VOICE_PLATE_SERVICE);
        yhaVar3.f(componentName5, defpackage.tgf.GEARHEAD_HOT_CAR_ACTIVITY_STARTED_PRIMARY_REGION_ASSISTANT_PACKAGE_NEW_VOICE_PLATE_SERVICE);
        d = yhaVar3.d(true);
        defpackage.yha yhaVar4 = new defpackage.yha(4);
        yhaVar4.f(componentName, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_GMM_PACKAGE_CAR_PROJECTION_SERVICE);
        yhaVar4.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.applauncher.GhAppLauncherService"), defpackage.tgf.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_GH_PACKAGE_LAUNCHER_SERVICE);
        yhaVar4.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.media.MediaService"), defpackage.tgf.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_GH_PACKAGE_MEDIA_SERVICE);
        yhaVar4.f(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.apphost.TemplateService"), defpackage.tgf.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_GH_PACKAGE_TEMPLATE_SERVICE);
        yhaVar4.f(componentName4, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_ASSISTANT_PACKAGE_VOICE_PLATE_SERVICE);
        yhaVar4.f(componentName5, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_FIRST_COLD_START_PRIMARY_REGION_ASSISTANT_PACKAGE_NEW_VOICE_PLATE_SERVICE);
        e = yhaVar4.d(true);
        defpackage.ygx ygxVar = new defpackage.ygx();
        ygxVar.b(2, defpackage.tgf.GEARHEAD_GMM_CAM_COLD_START_WINDOW_READY);
        ygxVar.b(2, defpackage.tgf.GEARHEAD_GMM_CAM_COLD_START_CLIENT_START_COMPLETE);
        ygxVar.b(2, defpackage.tgf.GEARHEAD_GMM_CAM_COLD_START_WINDOW_ATTACHED);
        i = ygxVar.a();
        defpackage.ygx ygxVar2 = new defpackage.ygx();
        ygxVar2.b(2, defpackage.tgf.GEARHEAD_GMM_CAM_NON_COLD_START_WINDOW_READY);
        ygxVar2.b(2, defpackage.tgf.GEARHEAD_GMM_CAM_NON_COLD_START_CLIENT_START_COMPLETE);
        ygxVar2.b(2, defpackage.tgf.GEARHEAD_GMM_CAM_NON_COLD_START_WINDOW_ATTACHED);
        j = ygxVar2.a();
        defpackage.yhy yhyVar = new defpackage.yhy();
        yhyVar.b(3, defpackage.tgf.GEARHEAD_GMM_CAM_NON_COLD_START_WINDOW_READY);
        yhyVar.b(3, defpackage.tgf.GEARHEAD_GMM_CAM_COLD_START_WINDOW_READY);
        yhyVar.b(4, defpackage.tgf.GEARHEAD_GMM_CAM_COLD_START_CLIENT_START_COMPLETE);
        yhyVar.b(4, defpackage.tgf.GEARHEAD_GMM_CAM_NON_COLD_START_CLIENT_START_COMPLETE);
        k = yhyVar.a();
        l = new defpackage.ino();
    }

    private ino() {
    }

    public final void a() {
        this.m = true;
        this.n = new java.util.HashMap(e);
    }
}
