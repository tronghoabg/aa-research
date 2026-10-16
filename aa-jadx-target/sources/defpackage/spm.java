package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class spm extends java.lang.Exception {
    public final com.google.android.gms.common.ConnectionResult a;

    public spm(com.google.android.gms.common.ConnectionResult connectionResult) {
        defpackage.sqs.ar(connectionResult.b(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = connectionResult;
    }
}
