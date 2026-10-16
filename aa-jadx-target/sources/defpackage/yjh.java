package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yjh {
    public int a;
    public java.lang.Object b;
    public java.lang.Object c;

    public yjh(android.app.Notification notification) {
        java.lang.String[] strArr;
        this.a = 0;
        dtj dtjVar = null;
        android.os.Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle != null) {
            this.b = (android.graphics.Bitmap) bundle.getParcelable("large_icon");
            this.a = bundle.getInt("app_color", 0);
            android.os.Bundle bundle2 = bundle.getBundle("car_conversation");
            if (bundle2 != null) {
                android.os.Parcelable[] parcelableArray = bundle2.getParcelableArray("messages");
                if (parcelableArray != null) {
                    int length = parcelableArray.length;
                    java.lang.String[] strArr2 = new java.lang.String[length];
                    for (int i = 0; i < length; i++) {
                        android.os.Parcelable parcelable = parcelableArray[i];
                        if (parcelable instanceof android.os.Bundle) {
                            java.lang.String string = ((android.os.Bundle) parcelable).getString("text");
                            strArr2[i] = string;
                            if (string != null) {
                            }
                        }
                    }
                    strArr = strArr2;
                } else {
                    strArr = null;
                }
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle2.getParcelable("on_read");
                android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle2.getParcelable("on_reply");
                android.app.RemoteInput remoteInput = (android.app.RemoteInput) bundle2.getParcelable("remote_input");
                java.lang.String[] stringArray = bundle2.getStringArray("participants");
                if (stringArray != null && stringArray.length == 1) {
                    dtjVar = new dtj(strArr, remoteInput != null ? new dut(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), android.os.Build.VERSION.SDK_INT >= 29 ? dti.a(remoteInput) : 0, remoteInput.getExtras(), (java.util.Set) null) : null, pendingIntent2, pendingIntent, stringArray, bundle2.getLong("timestamp"));
                }
            }
            this.c = dtjVar;
        }
    }

    public yjh(yji yjiVar) {
        this.b = yjiVar;
        this.c = yjiVar;
        yjiVar.d = null;
        yjiVar.c = null;
        this.a = 1;
    }
}
