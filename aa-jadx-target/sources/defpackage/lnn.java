package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lnn extends defpackage.moz {
    public static final /* synthetic */ int a = 0;

    public lnn() {
        super(defpackage.mkt.f, "Media");
    }

    private static final android.content.ComponentName b(android.content.ComponentName componentName) {
        return !android.text.TextUtils.isEmpty(componentName.getClassName()) ? componentName : defpackage.loo.a(defpackage.kit.b().e(), componentName.getPackageName());
    }

    @Override // defpackage.moz
    protected final void c(android.content.Intent intent, defpackage.qrh qrhVar) {
        android.content.ComponentName component = intent.getComponent();
        component.getClass();
        android.content.ComponentName componentNameB = b(component);
        componentNameB.getClass();
        defpackage.mqi mqiVarB = defpackage.mpr.b(componentNameB);
        mqiVarB.d(intent);
        g(intent);
        java.lang.String strC = mqiVarB.c();
        defpackage.yqm yqmVar = jsg.a;
        intent.putExtra("TemplateCarActivity.SESSION_ID", strC);
        intent.putExtra("GH.ComponentExtra", componentNameB);
        intent.setComponent(defpackage.mkt.f);
    }

    @Override // defpackage.mpb
    protected final boolean d(android.content.Intent intent, defpackage.qrh qrhVar) {
        android.content.ComponentName componentNameB;
        defpackage.mqi mqiVarB = defpackage.mqi.b(intent);
        if (mqiVarB == null || (componentNameB = b(mqiVarB.a)) == null) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(componentNameB.getClassName())) {
            return true;
        }
        defpackage.mqj mqjVarA = defpackage.ler.a().a(defpackage.kit.b().e(), new defpackage.mqi(componentNameB));
        return mqjVarA != null && mqjVarA.b == defpackage.mqg.MEDIA;
    }

    @Override // defpackage.moz
    public final defpackage.mqi h() {
        android.content.ComponentName componentNameA = defpackage.kzi.r().a();
        if (componentNameA == null) {
            return null;
        }
        return defpackage.mpr.b(componentNameA);
    }
}
