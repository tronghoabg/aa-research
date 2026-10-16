package androidx.biometric.internal.ui;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ar;
import android.support.v4.app.av;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import androidx.biometric.internal.viewmodel.AuthenticationViewModelFactory;
import androidx.biometric.utils.BiometricErrorData;
import androidx.biometric.utils.KeyguardUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.waze.R;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ConfirmCredentialUiLauncherKt {
    private static final String TAG = "ConfirmCredentialUiLauncher";

    private static final <F extends ar> F findOrAddCallerFragment(bv bvVar, String str, a<? extends F> aVar) {
        if (bvVar == null) {
            Log.e(TAG, String.valueOf(str).concat(": Unable to start authentication . Client fragment manager was null"));
            return null;
        }
        if (bvVar.aO()) {
            Log.e(TAG, String.valueOf(str).concat(": Unable to start authentication. Called after onSaveInstanceState()."));
            return null;
        }
        F f2 = (F) bvVar.h(str);
        if (f2 != null) {
            return f2;
        }
        F fInvoke = aVar.invoke();
        ch chVarU = bvVar.u();
        chVarU.s(fInvoke, str);
        chVarU.l();
        bvVar.aV();
        return fInvoke;
    }

    public static final AuthenticationViewModel getCallerViewModelForFragment(ar arVar, boolean z) {
        x.f(arVar, "<this>");
        return getViewModel(z ? arVar.requireActivity() : arVar.requireParentFragment());
    }

    public static final Runnable getConfirmCredentialActivityLauncher(final ar arVar) {
        x.f(arVar, "<this>");
        final ActivityResultLauncher activityResultLauncherRegisterForActivityResult = arVar.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: androidx.biometric.internal.ui.ConfirmCredentialUiLauncherKt$$ExternalSyntheticLambda6
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ConfirmCredentialUiLauncherKt.getConfirmCredentialActivityLauncher$lambda$0(arVar, (ActivityResult) obj);
            }
        });
        x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        return new Runnable() { // from class: androidx.biometric.internal.ui.ConfirmCredentialUiLauncherKt$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                ConfirmCredentialUiLauncherKt.getConfirmCredentialActivityLauncher$lambda$1(arVar, activityResultLauncherRegisterForActivityResult);
            }
        };
    }

    static final void getConfirmCredentialActivityLauncher$lambda$0(ar arVar, ActivityResult activityResult) {
        x.f(activityResult, "result");
        Context contextRequireContext = arVar.requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        handleConfirmCredentialResult(contextRequireContext, arVar, activityResult.getResultCode());
    }

    static final void getConfirmCredentialActivityLauncher$lambda$1(ar arVar, ActivityResultLauncher activityResultLauncher) {
        if (!arVar.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            Log.w(TAG, "Attempted to launch ConfirmCredentialActivity when Fragment is not STARTED.");
            return;
        }
        Context contextRequireContext = arVar.requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        launchConfirmCredentialActivity(contextRequireContext, arVar, activityResultLauncher);
    }

    static final void getConfirmCredentialActivityLauncher$lambda$2(ComponentActivity componentActivity, ActivityResult activityResult) {
        x.f(activityResult, "result");
        handleConfirmCredentialResult(componentActivity, componentActivity, activityResult.getResultCode());
    }

    static final void getConfirmCredentialActivityLauncher$lambda$3(ComponentActivity componentActivity, ActivityResultLauncher activityResultLauncher) {
        if (componentActivity.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            launchConfirmCredentialActivity(componentActivity, componentActivity, activityResultLauncher);
        } else {
            Log.w(TAG, "Attempted to launch ConfirmCredentialActivity when Fragment is not STARTED.");
        }
    }

    public static final Runnable getConfirmCredentialFragmentLauncher(final ar arVar) {
        x.f(arVar, "<this>");
        return new Runnable() { // from class: androidx.biometric.internal.ui.ConfirmCredentialUiLauncherKt$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ConfirmCredentialUiLauncherKt.getConfirmCredentialFragmentLauncher$lambda$0(arVar);
            }
        };
    }

    static final void getConfirmCredentialFragmentLauncher$lambda$0(ar arVar) {
        Context contextRequireContext = arVar.requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        final Intent confirmCredentialIntent = getConfirmCredentialIntent(contextRequireContext, arVar);
        if (confirmCredentialIntent != null) {
            bv childFragmentManager = arVar.getChildFragmentManager();
            String name = ConfirmCredentialCallerFragment.class.getName();
            x.e(name, "getName(...)");
            findOrAddCallerFragment(childFragmentManager, name, new a() { // from class: androidx.biometric.internal.ui.ConfirmCredentialUiLauncherKt$$ExternalSyntheticLambda5
                @Override // h.g.a.a
                public final Object invoke() {
                    return ConfirmCredentialUiLauncherKt.getConfirmCredentialFragmentLauncher$lambda$0$0(confirmCredentialIntent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfirmCredentialCallerFragment getConfirmCredentialFragmentLauncher$lambda$0$0(Intent intent) {
        return ConfirmCredentialCallerFragment.Companion.newInstance(false, intent);
    }

    static final void getConfirmCredentialFragmentLauncher$lambda$1(av avVar) {
        final Intent confirmCredentialIntent = getConfirmCredentialIntent(avVar, avVar);
        if (confirmCredentialIntent != null) {
            bv bvVarBv = avVar.bv();
            String name = ConfirmCredentialCallerFragment.class.getName();
            x.e(name, "getName(...)");
            findOrAddCallerFragment(bvVarBv, name, new a() { // from class: androidx.biometric.internal.ui.ConfirmCredentialUiLauncherKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return ConfirmCredentialUiLauncherKt.getConfirmCredentialFragmentLauncher$lambda$1$0(confirmCredentialIntent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfirmCredentialCallerFragment getConfirmCredentialFragmentLauncher$lambda$1$0(Intent intent) {
        return ConfirmCredentialCallerFragment.Companion.newInstance(true, intent);
    }

    public static final Intent getConfirmCredentialIntent(Context context, ViewModelStoreOwner viewModelStoreOwner) {
        x.f(context, "<this>");
        x.f(viewModelStoreOwner, "viewModelStoreOwner");
        AuthenticationViewModel viewModel = getViewModel(viewModelStoreOwner);
        KeyguardManager keyguardManager = KeyguardUtils.getKeyguardManager(context);
        if (keyguardManager == null) {
            viewModel.setAuthenticationError(new BiometricErrorData(12, context.getString(R.string.generic_error_no_keyguard)));
            return null;
        }
        CharSequence title = viewModel.getTitle();
        CharSequence subtitle = viewModel.getSubtitle();
        CharSequence description = viewModel.getDescription();
        if (subtitle == null) {
            subtitle = description;
        }
        Intent intentCreateConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(title, subtitle);
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            viewModel.setAuthenticationError(new BiometricErrorData(14, context.getString(R.string.generic_error_no_device_credential)));
            return null;
        }
        viewModel.setConfirmingDeviceCredential(true);
        return intentCreateConfirmDeviceCredentialIntent;
    }

    private static final AuthenticationViewModel getViewModel(ViewModelStoreOwner viewModelStoreOwner) {
        return (AuthenticationViewModel) new ViewModelProvider(viewModelStoreOwner, new AuthenticationViewModelFactory()).get(AuthenticationViewModel.class);
    }

    public static final void handleConfirmCredentialResult(Context context, AuthenticationViewModel authenticationViewModel, int i2) {
        x.f(context, "context");
        x.f(authenticationViewModel, "callerViewModel");
        int i3 = -1;
        if (i2 == -1) {
            if (authenticationViewModel.isUsingKeyguardManagerForBiometricAndCredential()) {
                authenticationViewModel.setUsingKeyguardManagerForBiometricAndCredential(false);
            } else {
                i3 = 1;
            }
            authenticationViewModel.setAuthenticationResult(new BiometricPrompt.AuthenticationResult(null, i3));
        } else {
            authenticationViewModel.setAuthenticationError(new BiometricErrorData(10, context.getString(R.string.generic_error_user_canceled)));
        }
        authenticationViewModel.setPromptShowing(false);
    }

    public static final void launchConfirmCredentialActivity(Context context, ViewModelStoreOwner viewModelStoreOwner, ActivityResultLauncher<Intent> activityResultLauncher) {
        x.f(context, "<this>");
        x.f(viewModelStoreOwner, "viewModelStoreOwner");
        x.f(activityResultLauncher, "confirmCredentialActivityLauncher");
        Intent confirmCredentialIntent = getConfirmCredentialIntent(context, viewModelStoreOwner);
        if (confirmCredentialIntent != null) {
            confirmCredentialIntent.setFlags(134742016);
            activityResultLauncher.launch(confirmCredentialIntent);
        }
    }

    public static final Runnable getConfirmCredentialFragmentLauncher(final av avVar) {
        x.f(avVar, "<this>");
        return new Runnable() { // from class: androidx.biometric.internal.ui.ConfirmCredentialUiLauncherKt$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                ConfirmCredentialUiLauncherKt.getConfirmCredentialFragmentLauncher$lambda$1(avVar);
            }
        };
    }

    public static final Runnable getConfirmCredentialActivityLauncher(final ComponentActivity componentActivity) {
        x.f(componentActivity, "<this>");
        final ActivityResultLauncher activityResultLauncherRegisterForActivityResult = componentActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: androidx.biometric.internal.ui.ConfirmCredentialUiLauncherKt$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ConfirmCredentialUiLauncherKt.getConfirmCredentialActivityLauncher$lambda$2(componentActivity, (ActivityResult) obj);
            }
        });
        return new Runnable() { // from class: androidx.biometric.internal.ui.ConfirmCredentialUiLauncherKt$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ConfirmCredentialUiLauncherKt.getConfirmCredentialActivityLauncher$lambda$3(componentActivity, activityResultLauncherRegisterForActivityResult);
            }
        };
    }

    public static final void handleConfirmCredentialResult(Context context, ViewModelStoreOwner viewModelStoreOwner, int i2) {
        x.f(context, "context");
        x.f(viewModelStoreOwner, "viewModelStoreOwner");
        handleConfirmCredentialResult(context, getViewModel(viewModelStoreOwner), i2);
    }
}
