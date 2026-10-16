package androidx.biometric.internal;

import android.content.Context;
import android.util.Log;
import androidx.biometric.AuthenticationRequest;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import androidx.biometric.utils.ErrorUtils;
import com.waze.R;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class AuthenticationResultDispatcher {
    private final BiometricPrompt.AuthenticationCallback clientAuthenticationCallback;
    private final Executor clientExecutor;
    private final Runnable confirmCredentialActivityLauncher;
    private final Context context;
    private final a<ab> dismiss;
    private final AuthenticationViewModel viewModel;

    public AuthenticationResultDispatcher(Context context, AuthenticationViewModel authenticationViewModel, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback, Runnable runnable, a<ab> aVar) {
        x.f(context, "context");
        x.f(authenticationViewModel, "viewModel");
        x.f(executor, "clientExecutor");
        x.f(authenticationCallback, "clientAuthenticationCallback");
        x.f(runnable, "confirmCredentialActivityLauncher");
        x.f(aVar, "dismiss");
        this.context = context;
        this.viewModel = authenticationViewModel;
        this.clientExecutor = executor;
        this.clientAuthenticationCallback = authenticationCallback;
        this.confirmCredentialActivityLauncher = runnable;
        this.dismiss = aVar;
    }

    private final void sendSuccessAndDismiss(BiometricPrompt.AuthenticationResult authenticationResult) {
        sendSuccessToClient(authenticationResult);
        this.dismiss.invoke();
    }

    private final void sendSuccessToClient(final BiometricPrompt.AuthenticationResult authenticationResult) {
        if (!this.viewModel.isAwaitingResult()) {
            Log.w("AuthResultDispatcher", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.viewModel.setAwaitingResult(false);
            this.clientExecutor.execute(new Runnable() { // from class: androidx.biometric.internal.AuthenticationResultDispatcher$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.clientAuthenticationCallback.onAuthenticationSucceeded(authenticationResult);
                }
            });
        }
    }

    public final BiometricPrompt.AuthenticationCallback getClientAuthenticationCallback() {
        return this.clientAuthenticationCallback;
    }

    public final Executor getClientExecutor() {
        return this.clientExecutor;
    }

    public final Runnable getConfirmCredentialActivityLauncher() {
        return this.confirmCredentialActivityLauncher;
    }

    public final Context getContext() {
        return this.context;
    }

    public final a<ab> getDismiss() {
        return this.dismiss;
    }

    public final AuthenticationViewModel getViewModel() {
        return this.viewModel;
    }

    public void onAuthenticationError(int i2, CharSequence charSequence) {
        if (charSequence == null) {
            String string = this.context.getString(R.string.default_error_msg);
            x.e(string, "getString(...)");
            charSequence = string;
        }
        sendErrorAndDismiss(ErrorUtils.toKnownErrorCodeForAuthenticate(i2), charSequence);
    }

    public void onAuthenticationFailed() {
        sendFailureToClient();
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        x.f(authenticationResult, "result");
        sendSuccessAndDismiss(authenticationResult);
    }

    public final void sendErrorAndDismiss(int i2, CharSequence charSequence) {
        x.f(charSequence, "errorString");
        sendErrorToClient(i2, charSequence);
        this.dismiss.invoke();
    }

    public final void sendErrorToClient(final int i2, final CharSequence charSequence) {
        x.f(charSequence, "errorString");
        if (!this.viewModel.isAwaitingResult()) {
            Log.w("AuthResultDispatcher", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.viewModel.setAwaitingResult(false);
            this.clientExecutor.execute(new Runnable() { // from class: androidx.biometric.internal.AuthenticationResultDispatcher$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.clientAuthenticationCallback.onAuthenticationError(i2, charSequence);
                }
            });
        }
    }

    public final void sendFailureToClient() {
        if (this.viewModel.isAwaitingResult()) {
            this.clientExecutor.execute(new Runnable() { // from class: androidx.biometric.internal.AuthenticationResultDispatcher$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.clientAuthenticationCallback.onAuthenticationFailed();
                }
            });
        } else {
            Log.w("AuthResultDispatcher", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    public final void sendFallbackOption(final AuthenticationRequest.Biometric.Fallback.CustomOption customOption) {
        x.f(customOption, "fallback");
        if (!this.viewModel.isAwaitingResult()) {
            Log.w("AuthResultDispatcher", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.viewModel.setAwaitingResult(false);
            this.clientExecutor.execute(new Runnable() { // from class: androidx.biometric.internal.AuthenticationResultDispatcher$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.clientAuthenticationCallback.onFallbackSelected(customOption);
                }
            });
        }
    }

    public final void sendFallbackOptionAndDismiss(AuthenticationRequest.Biometric.Fallback.CustomOption customOption) {
        x.f(customOption, "fallback");
        sendFallbackOption(customOption);
        this.dismiss.invoke();
    }

    public void showKMAsFallback() {
        this.confirmCredentialActivityLauncher.run();
    }
}
