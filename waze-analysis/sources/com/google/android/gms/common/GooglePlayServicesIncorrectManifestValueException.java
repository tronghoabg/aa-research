package com.google.android.gms.common;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i2) {
        super("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + i.f4949a + " but found " + i2 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
