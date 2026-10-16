package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class soq implements android.content.DialogInterface.OnClickListener {
    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (android.content.ActivityNotFoundException e) {
                android.util.Log.e("DialogRedirect", true == android.os.Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
