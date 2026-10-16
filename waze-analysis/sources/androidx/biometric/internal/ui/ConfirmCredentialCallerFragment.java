package androidx.biometric.internal.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ar;
import android.support.v4.app.ch;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.biometric.internal.viewmodel.AuthenticationViewModel;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ConfirmCredentialCallerFragment extends ar {
    private static final String ARG_CONFIRM_CREDENTIAL_INTENT = "confirm_credential_intent";
    private static final String ARG_HOST_ACTIVITY = "host_activity";
    public static final Companion Companion = new Companion(null);
    private final ActivityResultLauncher<Intent> launcher;
    private AuthenticationViewModel viewModel;

    public ConfirmCredentialCallerFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: androidx.biometric.internal.ui.ConfirmCredentialCallerFragment$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ConfirmCredentialCallerFragment.launcher$lambda$0(this.f$0, (ActivityResult) obj);
            }
        });
        x.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launcher = activityResultLauncherRegisterForActivityResult;
    }

    private final Intent getCredentialIntent() {
        Intent intent = (Intent) requireArguments().getParcelable(ARG_CONFIRM_CREDENTIAL_INTENT);
        if (intent != null) {
            return intent;
        }
        throw new IllegalStateException("Confirm credential intent cannot be null");
    }

    private final boolean isHostedInActivity() {
        return requireArguments().getBoolean(ARG_HOST_ACTIVITY, true);
    }

    static final void launcher$lambda$0(ConfirmCredentialCallerFragment confirmCredentialCallerFragment, ActivityResult activityResult) {
        x.f(activityResult, "result");
        Context contextRequireContext = confirmCredentialCallerFragment.requireContext();
        x.e(contextRequireContext, "requireContext(...)");
        AuthenticationViewModel authenticationViewModel = confirmCredentialCallerFragment.viewModel;
        if (authenticationViewModel == null) {
            x.j("viewModel");
            authenticationViewModel = null;
        }
        ConfirmCredentialUiLauncherKt.handleConfirmCredentialResult(contextRequireContext, authenticationViewModel, activityResult.getResultCode());
        ch chVarU = confirmCredentialCallerFragment.getParentFragmentManager().u();
        chVarU.n(confirmCredentialCallerFragment);
        chVarU.l();
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.viewModel = ConfirmCredentialUiLauncherKt.getCallerViewModelForFragment(this, isHostedInActivity());
        if (bundle != null) {
            return;
        }
        getCredentialIntent().setFlags(134742016);
        this.launcher.launch(getCredentialIntent());
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ConfirmCredentialCallerFragment newInstance(boolean z, Intent intent) {
            x.f(intent, "credentialIntent");
            ConfirmCredentialCallerFragment confirmCredentialCallerFragment = new ConfirmCredentialCallerFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(ConfirmCredentialCallerFragment.ARG_HOST_ACTIVITY, z);
            bundle.putParcelable(ConfirmCredentialCallerFragment.ARG_CONFIRM_CREDENTIAL_INTENT, intent);
            confirmCredentialCallerFragment.setArguments(bundle);
            return confirmCredentialCallerFragment;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
