package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mzr implements defpackage.affj {
    private final /* synthetic */ int a;

    public /* synthetic */ mzr(int i) {
        this.a = i;
    }

    @Override // defpackage.affj
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        if (this.a != 0) {
            android.content.ComponentName componentName = (android.content.ComponentName) obj;
            defpackage.lor lorVar = (defpackage.lor) obj3;
            return ((los) obj2) == null ? new defpackage.lrk(componentName, lorVar, null, false) : new defpackage.lrk(componentName, lorVar, (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj4, ((java.lang.Boolean) obj5).booleanValue());
        }
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) obj4).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) obj5).booleanValue();
        defpackage.yqm yqmVar = defpackage.mzu.a;
        if (zBooleanValue) {
            return defpackage.mzq.a;
        }
        if (zBooleanValue2) {
            return defpackage.mzq.c;
        }
        if ((!zBooleanValue3) || (!zBooleanValue4)) {
            return defpackage.mzq.b;
        }
        return zBooleanValue5 ? defpackage.mzq.e : defpackage.mzq.d;
    }
}
