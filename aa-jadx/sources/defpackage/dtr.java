package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dtr {
    static android.app.Notification.MessagingStyle.Message a(java.lang.CharSequence charSequence, long j, android.app.Person person) {
        return new android.app.Notification.MessagingStyle.Message(charSequence, j, person);
    }

    static void b(android.app.Notification.MessagingStyle.Message message, android.os.Bundle bundle) {
        message.getExtras().putAll(bundle);
    }

    public static int c(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getResId();
    }

    public static int d(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getType();
    }

    public static android.net.Uri e(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getUri();
    }

    public static java.lang.String f(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getResPackage();
    }

    public static final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ekh ekhVarA = (defpackage.ekh) obj;
        defpackage.ekh ekhVar = (defpackage.ekh) obj2;
        if (!ekhVar.isEmpty()) {
            if (!ekhVarA.b) {
                ekhVarA = ekhVarA.a();
            }
            ekhVarA.b();
            if (!ekhVar.isEmpty()) {
                ekhVarA.putAll(ekhVar);
            }
        }
        return ekhVarA;
    }

    public static final java.lang.Object h() {
        return defpackage.ekh.a.a();
    }

    public static final defpackage.eqa i(java.lang.Object obj) {
        return (defpackage.eqa) ((defpackage.erh) obj).a;
    }
}
