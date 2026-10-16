package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dtr {
    static android.app.Notification.MessagingStyle.Message a(java.lang.CharSequence charSequence, long j, android.app.Person person) {
        return new android.app.Notification.MessagingStyle.Message(charSequence, j, person);
    }

    static void b(android.app.Notification.MessagingStyle.Message message, android.os.Bundle bundle) {
        ep$.ExternalSyntheticApiModelOutline1.m(message).putAll(bundle);
    }

    public static int c(java.lang.Object obj) {
        return hh$.ExternalSyntheticApiModelOutline0.m$1((android.graphics.drawable.Icon) obj);
    }

    public static int d(java.lang.Object obj) {
        return hh$.ExternalSyntheticApiModelOutline0.m((android.graphics.drawable.Icon) obj);
    }

    public static android.net.Uri e(java.lang.Object obj) {
        return hh$.ExternalSyntheticApiModelOutline0.m((android.graphics.drawable.Icon) obj);
    }

    public static java.lang.String f(java.lang.Object obj) {
        return hh$.ExternalSyntheticApiModelOutline0.m((android.graphics.drawable.Icon) obj);
    }

    public static final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        ekh ekhVarA = (ekh) obj;
        ekh ekhVar = (ekh) obj2;
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
        return ekh.a.a();
    }

    public static final defpackage.eqa i(java.lang.Object obj) {
        return (defpackage.eqa) ((defpackage.erh) obj).a;
    }
}
