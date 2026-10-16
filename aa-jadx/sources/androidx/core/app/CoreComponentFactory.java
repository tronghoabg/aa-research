package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {
    static java.lang.Object a(java.lang.Object obj) {
        java.lang.Object objA;
        return (!(obj instanceof defpackage.dsv) || (objA = ((defpackage.dsv) obj).a()) == null) ? obj : objA;
    }

    public final android.app.Activity instantiateActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.app.Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    public final android.app.Application instantiateApplication(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.app.Application) a(super.instantiateApplication(classLoader, str));
    }

    public final android.content.ContentProvider instantiateProvider(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.content.ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    public final android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.content.BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    public final android.app.Service instantiateService(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.app.Service) a(super.instantiateService(classLoader, str, intent));
    }
}
