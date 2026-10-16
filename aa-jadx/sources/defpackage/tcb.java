package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tcb implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        parcel.getClass();
        java.lang.ClassLoader classLoader = android.app.PendingIntent.class.getClassLoader();
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) parcel.readParcelable(classLoader);
        android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) parcel.readParcelable(classLoader);
        android.app.PendingIntent pendingIntent3 = (android.app.PendingIntent) parcel.readParcelable(classLoader);
        android.app.RemoteInput remoteInput = (android.app.RemoteInput) parcel.readParcelable(android.app.RemoteInput.class.getClassLoader());
        int i = parcel.readInt();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        while (i > 0) {
            java.lang.String string = parcel.readString();
            if (string == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            android.os.Bundle bundle = parcel.readBundle();
            if (bundle == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            i--;
            androidx.core.graphics.drawable.IconCompat iconCompatH = androidx.core.graphics.drawable.IconCompat.h(bundle);
            if (iconCompatH != null) {
                linkedHashMap.put(string, iconCompatH);
            }
        }
        return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables(pendingIntent, pendingIntent2, pendingIntent3, remoteInput, (android.app.PendingIntent) parcel.readParcelable(classLoader), linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.notification.protoparcel.NotificationInfoParcelables[i];
    }
}
