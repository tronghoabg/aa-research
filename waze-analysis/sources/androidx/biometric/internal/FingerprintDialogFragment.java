package androidx.biometric.internal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ab;
import android.support.v7.app.k;
import android.support.v7.app.l;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.lifecycle.Observer;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class FingerprintDialogFragment extends ab {
    private static final String ARG_HOST_ACTIVITY = "host_activity";
    private static final int MESSAGE_DISPLAY_TIME_MS = 2000;
    static final int STATE_FINGERPRINT = 1;
    static final int STATE_FINGERPRINT_AUTHENTICATED = 3;
    static final int STATE_FINGERPRINT_ERROR = 2;
    static final int STATE_NONE = 0;
    private static final String TAG = "FingerprintFragment";
    private int mErrorTextColor;
    private ImageView mFingerprintIcon;
    TextView mHelpMessageView;
    private int mNormalTextColor;
    BiometricViewModel mViewModel;
    final Handler mHandler = new Handler(Looper.getMainLooper());
    final Runnable mResetDialogRunnable = new Runnable() { // from class: androidx.biometric.internal.FingerprintDialogFragment.1
        @Override // java.lang.Runnable
        public void run() {
            FingerprintDialogFragment.this.resetDialog();
        }
    };

    /* compiled from: WazeSource */
    class Api26Impl {
        private Api26Impl() {
        }

        static int getColorErrorAttr() {
            return R.attr.colorError;
        }
    }

    private void connectViewModel() {
        BiometricViewModel viewModel = BiometricPrompt.getViewModel(this, isHostedInActivity());
        this.mViewModel = viewModel;
        viewModel.getFingerprintDialogState().observe(this, new Observer<Integer>() { // from class: androidx.biometric.internal.FingerprintDialogFragment.3
            @Override // androidx.lifecycle.Observer
            public void onChanged(Integer num) {
                FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                FingerprintDialogFragment.this.updateFingerprintIcon(num.intValue());
                FingerprintDialogFragment.this.updateHelpMessageColor(num.intValue());
                FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                fingerprintDialogFragment2.mHandler.postDelayed(fingerprintDialogFragment2.mResetDialogRunnable, 2000L);
            }
        });
        this.mViewModel.getFingerprintDialogHelpMessage().observe(this, new Observer<CharSequence>() { // from class: androidx.biometric.internal.FingerprintDialogFragment.4
            @Override // androidx.lifecycle.Observer
            public void onChanged(CharSequence charSequence) {
                FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                FingerprintDialogFragment.this.updateHelpMessageText(charSequence);
                FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                fingerprintDialogFragment2.mHandler.postDelayed(fingerprintDialogFragment2.mResetDialogRunnable, 2000L);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023 A[PHI: r5
  0x0023: PHI (r5v2 int) = (r5v1 int), (r5v4 int) binds: [B:12:0x001a, B:15:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.drawable.Drawable getAssetForTransition(int r5, int r6) {
        /*
            r4 = this;
            android.content.Context r4 = r4.getContext()
            r0 = 0
            if (r4 != 0) goto Lf
            java.lang.String r4 = "FingerprintFragment"
            java.lang.String r5 = "Unable to get asset. Context is null."
            android.util.Log.w(r4, r5)
            return r0
        Lf:
            r1 = 2131231492(0x7f080304, float:1.8079067E38)
            r2 = 1
            if (r5 != 0) goto L19
            if (r6 != r2) goto L18
            goto L2d
        L18:
            r5 = 0
        L19:
            r3 = 2
            if (r5 != r2) goto L23
            if (r6 != r3) goto L22
            r1 = 2131231491(0x7f080303, float:1.8079065E38)
            goto L2d
        L22:
            r5 = r2
        L23:
            if (r5 != r3) goto L28
            if (r6 != r2) goto L28
            goto L2d
        L28:
            if (r5 != r2) goto L32
            r5 = 3
            if (r6 != r5) goto L32
        L2d:
            android.graphics.drawable.Drawable r4 = androidx.core.content.ContextCompat.getDrawable(r4, r1)
            return r4
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.internal.FingerprintDialogFragment.getAssetForTransition(int, int):android.graphics.drawable.Drawable");
    }

    private int getThemedColorFor(int i2) throws Resources.NotFoundException {
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i2});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    private boolean isHostedInActivity() {
        return getArguments().getBoolean(ARG_HOST_ACTIVITY, true);
    }

    static FingerprintDialogFragment newInstance(boolean z) {
        FingerprintDialogFragment fingerprintDialogFragment = new FingerprintDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_HOST_ACTIVITY, z);
        fingerprintDialogFragment.setArguments(bundle);
        return fingerprintDialogFragment;
    }

    private boolean shouldAnimateForTransition(int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 1) {
                return false;
            }
            i2 = 0;
        }
        if (i2 == 1) {
            if (i3 == 2) {
                return true;
            }
            i2 = 1;
        }
        return i2 == 2 && i3 == 1;
    }

    @Override // android.support.v4.app.ab, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.mViewModel.setFingerprintDialogCancelPending(true);
    }

    @Override // android.support.v4.app.ab, android.support.v4.app.ar
    /* renamed from: onCreate */
    public void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        connectViewModel();
        this.mErrorTextColor = getThemedColorFor(R.attr.colorError);
        this.mNormalTextColor = getThemedColorFor(android.R.attr.textColorSecondary);
    }

    @Override // android.support.v4.app.ab
    public Dialog onCreateDialog(Bundle bundle) {
        k kVar = new k(requireContext());
        kVar.s(this.mViewModel.getTitle());
        View viewInflate = LayoutInflater.from(kVar.a()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence subtitle = this.mViewModel.getSubtitle();
            if (TextUtils.isEmpty(subtitle)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(subtitle);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            CharSequence description = this.mViewModel.getDescription();
            if (TextUtils.isEmpty(description)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(description);
            }
        }
        this.mFingerprintIcon = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.mHelpMessageView = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        kVar.l(AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators()) ? getString(R.string.confirm_device_credential_password) : this.mViewModel.getNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: androidx.biometric.internal.FingerprintDialogFragment.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                FingerprintDialogFragment.this.mViewModel.setNegativeButtonPressPending(true);
            }
        });
        kVar.t(viewInflate);
        l lVarB = kVar.b();
        lVarB.setCanceledOnTouchOutside(false);
        return lVarB;
    }

    @Override // android.support.v4.app.ar
    public void onPause() {
        super.onPause();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // android.support.v4.app.ar
    public void onResume() {
        super.onResume();
        this.mViewModel.setFingerprintDialogPreviousState(0);
        this.mViewModel.setFingerprintDialogState(1);
        this.mViewModel.setFingerprintDialogHelpMessage(getString(R.string.fingerprint_dialog_touch_sensor));
    }

    void resetDialog() {
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "Not resetting the dialog. Context is null.");
        } else {
            this.mViewModel.setFingerprintDialogState(1);
            this.mViewModel.setFingerprintDialogHelpMessage(context.getString(R.string.fingerprint_dialog_touch_sensor));
        }
    }

    void updateFingerprintIcon(int i2) {
        int fingerprintDialogPreviousState;
        Drawable assetForTransition;
        if (this.mFingerprintIcon == null || (assetForTransition = getAssetForTransition((fingerprintDialogPreviousState = this.mViewModel.getFingerprintDialogPreviousState()), i2)) == null) {
            return;
        }
        this.mFingerprintIcon.setImageDrawable(assetForTransition);
        if (shouldAnimateForTransition(fingerprintDialogPreviousState, i2) && (assetForTransition instanceof AnimatedVectorDrawable)) {
            ((AnimatedVectorDrawable) assetForTransition).start();
        }
        this.mViewModel.setFingerprintDialogPreviousState(i2);
    }

    void updateHelpMessageColor(int i2) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setTextColor(i2 == 2 ? this.mErrorTextColor : this.mNormalTextColor);
        }
    }

    void updateHelpMessageText(CharSequence charSequence) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
