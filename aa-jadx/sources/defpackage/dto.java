package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dto {
    static android.app.Notification.MessagingStyle a(android.app.Notification.MessagingStyle messagingStyle, android.app.Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.graphics.drawable.Drawable b(android.graphics.drawable.Drawable drawable) {
        return drawable instanceof defpackage.dvz ? ((defpackage.dvz) drawable).a() : drawable;
    }

    public static final defpackage.eix c(defpackage.eje ejeVar, byte[] bArr) {
        if (ejeVar.b() == 0) {
            return new defpackage.eiv(bArr);
        }
        throw new java.lang.IllegalStateException("Did not write as much data as expected.");
    }

    public static final java.lang.Object d(defpackage.efh efhVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        return efhVar.a(new defpackage.eik(affgVar, null), afdkVar);
    }
}
