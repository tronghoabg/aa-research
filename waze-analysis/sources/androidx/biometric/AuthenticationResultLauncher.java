package androidx.biometric;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AuthenticationResultLauncher {
    void cancel();

    void launch(AuthenticationRequest authenticationRequest);
}
