package androidx.biometric.internal.data;

import androidx.biometric.AuthenticationRequest;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.data.PromptConfigRepository;
import h.ab;
import h.c.e;
import h.f;
import h.g;
import h.g.a.a;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface PromptConfigRepository {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final f<PromptConfigRepositoryImpl> instance$delegate = g.a(new a() { // from class: androidx.biometric.internal.data.PromptConfigRepository$Companion$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return PromptConfigRepository.Companion.instance_delegate$lambda$0();
            }
        });

        private Companion() {
        }

        static final PromptConfigRepositoryImpl instance_delegate$lambda$0() {
            return new PromptConfigRepositoryImpl();
        }

        public final PromptConfigRepository getInstance() {
            return instance$delegate.getValue();
        }
    }

    int getAllowedAuthenticators();

    BiometricPrompt.CryptoObject getCryptoObject();

    int getCurrentAuthenticationKey();

    List<AuthenticationRequest.Biometric.Fallback> getFallbackOptionList();

    BiometricPrompt.PromptInfo getPromptInfo();

    boolean isConfirmingDeviceCredential();

    boolean isDelayingPrompt();

    boolean isIdentityCheckAvailable();

    boolean isPromptShowing();

    boolean isUsingKeyguardManagerForBiometricAndCredential();

    void setConfirmingDeviceCredential(boolean z);

    void setCryptoObject(BiometricPrompt.CryptoObject cryptoObject);

    void setCurrentAuthenticationKey(int i2);

    Object setDelayedDelayingPrompt(boolean z, long j2, e<? super ab> eVar);

    void setDelayingPrompt(boolean z);

    void setIdentityCheckAvailable(boolean z);

    void setNegativeButtonTextOverride(CharSequence charSequence);

    void setPromptInfo(BiometricPrompt.PromptInfo promptInfo);

    void setPromptShowing(boolean z);

    void setUsingKeyguardManagerForBiometricAndCredential(boolean z);

    /* compiled from: WazeSource */
    /* renamed from: androidx.biometric.internal.data.PromptConfigRepository$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            Companion companion = PromptConfigRepository.Companion;
        }

        public static /* synthetic */ void getAllowedAuthenticators$annotations() {
        }
    }
}
