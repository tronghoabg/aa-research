package androidx.biometric.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.biometric.AuthenticationRequest;
import androidx.biometric.AuthenticationResult;
import androidx.biometric.AuthenticationResultCallback;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.PromptContentItem;
import androidx.biometric.PromptContentViewWithMoreOptionsButton;
import androidx.biometric.PromptVerticalListContentView;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationResultRegistryKt {
    private static final void authInternal(BiometricPrompt biometricPrompt, Context context, String str, String str2, AuthenticationRequest.BodyContent bodyContent, Bitmap bitmap, int i2, String str3, AuthenticationRequest.Biometric.Strength strength, boolean z, BiometricPrompt.CryptoObject cryptoObject, List<? extends AuthenticationRequest.Biometric.Fallback> list) {
        BiometricPrompt.PromptInfo.Builder builder = new BiometricPrompt.PromptInfo.Builder();
        int authenticationType$biometric = strength != null ? strength.toAuthenticationType$biometric() : 32768;
        if (strength != null) {
            if (multipleFallbackOptionsValid(list)) {
                x.c(list);
            } else {
                List<? extends AuthenticationRequest.Biometric.Fallback> list2 = list;
                list = (list2 == null || list2.isEmpty()) ? i.d(authInternal$lambda$0$0$defaultCancelButton(context)) : i.d(i.P(list));
            }
            for (AuthenticationRequest.Biometric.Fallback fallback : list) {
                if (fallback instanceof AuthenticationRequest.Biometric.Fallback.DeviceCredential) {
                    authenticationType$biometric |= 32768;
                } else {
                    builder.addFallbackOption(fallback);
                }
            }
        }
        builder.setAllowedAuthenticators(authenticationType$biometric);
        if (bodyContent instanceof AuthenticationRequest.BodyContent.PlainText) {
            builder.setDescription(((AuthenticationRequest.BodyContent.PlainText) bodyContent).getDescription());
        } else if (bodyContent instanceof AuthenticationRequest.BodyContent.VerticalList) {
            PromptVerticalListContentView.Builder builder2 = new PromptVerticalListContentView.Builder();
            AuthenticationRequest.BodyContent.VerticalList verticalList = (AuthenticationRequest.BodyContent.VerticalList) bodyContent;
            Iterator<T> it = verticalList.getItems().iterator();
            while (it.hasNext()) {
                builder2.addListItem((PromptContentItem) it.next());
            }
            if (verticalList.getDescription() != null) {
                builder2.setDescription(verticalList.getDescription());
            }
            builder.setContentView(builder2.build());
        } else if (bodyContent instanceof AuthenticationRequest.BodyContent.ContentViewWithMoreOptionsButton) {
            PromptContentViewWithMoreOptionsButton.Builder builder3 = new PromptContentViewWithMoreOptionsButton.Builder();
            AuthenticationRequest.BodyContent.ContentViewWithMoreOptionsButton contentViewWithMoreOptionsButton = (AuthenticationRequest.BodyContent.ContentViewWithMoreOptionsButton) bodyContent;
            if (contentViewWithMoreOptionsButton.getDescription() != null) {
                builder3.setDescription(contentViewWithMoreOptionsButton.getDescription());
            }
            builder.setContentView(builder3.build());
        }
        if (i2 != 0) {
            builder.setLogoRes(i2);
        } else if (bitmap != null) {
            builder.setLogoBitmap(bitmap);
        }
        if (str3 != null) {
            builder.setLogoDescription(str3);
        }
        builder.setTitle(str);
        builder.setSubtitle(str2);
        builder.setConfirmationRequired(z);
        if (strength instanceof AuthenticationRequest.Biometric.Strength.Class3) {
            cryptoObject = ((AuthenticationRequest.Biometric.Strength.Class3) strength).getCryptoObject();
        } else if (strength != null) {
            cryptoObject = null;
        }
        if (cryptoObject == null) {
            biometricPrompt.authenticate(builder.build());
        } else {
            biometricPrompt.authenticate(builder.build(), cryptoObject);
        }
    }

    static /* synthetic */ void authInternal$default(BiometricPrompt biometricPrompt, Context context, String str, String str2, AuthenticationRequest.BodyContent bodyContent, Bitmap bitmap, int i2, String str3, AuthenticationRequest.Biometric.Strength strength, boolean z, BiometricPrompt.CryptoObject cryptoObject, List list, int i3, Object obj) {
        authInternal(biometricPrompt, context, str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : bodyContent, (i3 & 16) != 0 ? null : bitmap, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : strength, (!((i3 & 256) == 0)) | z, (i3 & 512) != 0 ? null : cryptoObject, (i3 & 1024) != 0 ? null : list);
    }

    private static final AuthenticationRequest.Biometric.Fallback authInternal$lambda$0$0$defaultCancelButton(Context context) {
        String string = context.getString(R.string.cancel);
        x.e(string, "getString(...)");
        return new AuthenticationRequest.Biometric.Fallback.DefaultCancel(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiometricPrompt.AuthenticationCallback createAuthenticationCallback(final AuthenticationResultCallback authenticationResultCallback) {
        return new BiometricPrompt.AuthenticationCallback() { // from class: androidx.biometric.internal.AuthenticationResultRegistryKt.createAuthenticationCallback.1
            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i2, CharSequence charSequence) {
                x.f(charSequence, "errString");
                authenticationResultCallback.onAuthResult(new AuthenticationResult.Error(i2, charSequence));
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                authenticationResultCallback.onAuthAttemptFailed();
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                x.f(authenticationResult, "result");
                authenticationResultCallback.onAuthResult(new AuthenticationResult.Success(authenticationResult.getCryptoObject(), authenticationResult.getAuthenticationType()));
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onFallbackSelected(AuthenticationRequest.Biometric.Fallback.CustomOption customOption) {
                x.f(customOption, "fallback");
                authenticationResultCallback.onAuthResult(new AuthenticationResult.CustomFallbackSelected(customOption));
            }
        };
    }

    public static final boolean multipleFallbackOptionsValid(List<? extends AuthenticationRequest.Biometric.Fallback> list) {
        return Build.VERSION.SDK_INT >= 36 && AuthenticationResultRegistryKt$$ExternalSyntheticBackportWithForwarding0.m() >= 3600001 && list != null && list.size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch(BiometricPrompt biometricPrompt, Context context, AuthenticationRequest authenticationRequest) {
        if (authenticationRequest instanceof AuthenticationRequest.Biometric) {
            AuthenticationRequest.Biometric biometric = (AuthenticationRequest.Biometric) authenticationRequest;
            authInternal$default(biometricPrompt, context, biometric.getTitle(), biometric.getSubtitle(), biometric.getContent(), biometric.getLogoBitmap(), biometric.getLogoRes(), biometric.getLogoDescription(), biometric.getMinStrength(), biometric.isConfirmationRequired(), null, biometric.getAuthFallbacks(), 512, null);
        } else if (authenticationRequest instanceof AuthenticationRequest.Credential) {
            AuthenticationRequest.Credential credential = (AuthenticationRequest.Credential) authenticationRequest;
            authInternal$default(biometricPrompt, context, credential.getTitle(), credential.getSubtitle(), credential.getContent(), null, 0, null, null, false, credential.getCryptoObject(), null, DisplayStrings.DS_TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TITLE, null);
        }
    }
}
