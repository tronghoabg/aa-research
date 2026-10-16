package androidx.biometric.internal.data;

import androidx.biometric.AuthenticationRequest;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.internal.data.AuthenticationStateRepository;
import androidx.biometric.utils.BiometricErrorData;
import androidx.biometric.utils.CancellationSignalProvider;
import h.ab;
import h.c.e;
import h.f;
import h.g;
import h.g.a.a;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AuthenticationStateRepository {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final f<AuthenticationStateRepositoryImpl> instance$delegate = g.a(new a() { // from class: androidx.biometric.internal.data.AuthenticationStateRepository$Companion$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return AuthenticationStateRepository.Companion.instance_delegate$lambda$0();
            }
        });

        private Companion() {
        }

        static final AuthenticationStateRepositoryImpl instance_delegate$lambda$0() {
            return new AuthenticationStateRepositoryImpl();
        }

        public final AuthenticationStateRepository getInstance() {
            return instance$delegate.getValue();
        }
    }

    k<BiometricErrorData> getAuthenticationError();

    k<CharSequence> getAuthenticationHelpMessage();

    k<BiometricPrompt.AuthenticationResult> getAuthenticationResult();

    CanceledFrom getCanceledFrom();

    CancellationSignalProvider getCancellationSignalProvider();

    k<ab> isAuthenticationFailurePending();

    boolean isAwaitingResult();

    k<AuthenticationRequest.Biometric.Fallback.CustomOption> isFallbackOptionPressPending();

    boolean isIgnoringCancel();

    k<ab> isMoreOptionsButtonPressPending();

    k<ab> isNegativeButtonPressPending();

    Object setAuthenticationError(BiometricErrorData biometricErrorData, e<? super ab> eVar);

    Object setAuthenticationFailurePending(e<? super ab> eVar);

    Object setAuthenticationHelpMessage(CharSequence charSequence, e<? super ab> eVar);

    Object setAuthenticationResult(BiometricPrompt.AuthenticationResult authenticationResult, e<? super ab> eVar);

    void setAwaitingResult(boolean z);

    void setCanceledFrom(CanceledFrom canceledFrom);

    Object setDelayedIgnoringCancel(boolean z, long j2, e<? super ab> eVar);

    Object setFallbackOptionPressPending(AuthenticationRequest.Biometric.Fallback.CustomOption customOption, e<? super ab> eVar);

    void setIgnoringCancel(boolean z);

    Object setMoreOptionsButtonPressPending(e<? super ab> eVar);

    Object setNegativeButtonPressPending(e<? super ab> eVar);
}
