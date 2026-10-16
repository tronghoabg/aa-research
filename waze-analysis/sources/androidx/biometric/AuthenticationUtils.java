package androidx.biometric;

import android.content.Context;
import android.support.v4.app.ar;
import androidx.activity.ComponentActivity;
import androidx.biometric.internal.AuthenticationResultRegistry;
import androidx.biometric.internal.ui.ConfirmCredentialUiLauncherKt;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationUtils {
    public static final AuthenticationResultLauncher registerForAuthenticationResult(ar arVar, Executor executor, AuthenticationResultCallback authenticationResultCallback) {
        x.f(arVar, "<this>");
        x.f(executor, "callbackExecutor");
        x.f(authenticationResultCallback, "resultCallback");
        AuthenticationResultRegistry authenticationResultRegistry = new AuthenticationResultRegistry();
        Context contextRequireContext = arVar.requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        return authenticationResultRegistry.register(contextRequireContext, arVar, arVar, ConfirmCredentialUiLauncherKt.getConfirmCredentialActivityLauncher(arVar), authenticationResultCallback, executor);
    }

    public static final AuthenticationResultLauncher registerForAuthenticationResult(ar arVar, AuthenticationResultCallback authenticationResultCallback) {
        x.f(arVar, "<this>");
        x.f(authenticationResultCallback, "resultCallback");
        AuthenticationResultRegistry authenticationResultRegistry = new AuthenticationResultRegistry();
        Context contextRequireContext = arVar.requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        return authenticationResultRegistry.register(contextRequireContext, arVar, arVar, ConfirmCredentialUiLauncherKt.getConfirmCredentialActivityLauncher(arVar), authenticationResultCallback, null);
    }

    public static final AuthenticationResultLauncher registerForAuthenticationResult(ComponentActivity componentActivity, AuthenticationResultCallback authenticationResultCallback) {
        x.f(componentActivity, "<this>");
        x.f(authenticationResultCallback, "resultCallback");
        return new AuthenticationResultRegistry().register(componentActivity, componentActivity, componentActivity, ConfirmCredentialUiLauncherKt.getConfirmCredentialActivityLauncher(componentActivity), authenticationResultCallback, null);
    }

    public static final AuthenticationResultLauncher registerForAuthenticationResult(ComponentActivity componentActivity, Executor executor, AuthenticationResultCallback authenticationResultCallback) {
        x.f(componentActivity, "<this>");
        x.f(executor, "callbackExecutor");
        x.f(authenticationResultCallback, "resultCallback");
        return new AuthenticationResultRegistry().register(componentActivity, componentActivity, componentActivity, ConfirmCredentialUiLauncherKt.getConfirmCredentialActivityLauncher(componentActivity), authenticationResultCallback, executor);
    }
}
