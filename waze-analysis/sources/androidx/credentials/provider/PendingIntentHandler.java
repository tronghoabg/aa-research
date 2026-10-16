package androidx.credentials.provider;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.SigningInfo;
import android.credentials.Credential;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.ResultReceiver;
import android.service.credentials.CreateCredentialRequest;
import android.service.credentials.GetCredentialRequest;
import android.util.Log;
import androidx.core.os.BundleCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.ConversionUtilsKt;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.LargePayloadSupport;
import androidx.credentials.provider.BeginGetCredentialRequest;
import androidx.credentials.provider.BeginGetCredentialResponse;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.PendingIntentHandler;
import androidx.credentials.provider.ProviderCreateCredentialRequest;
import androidx.credentials.provider.ProviderGetCredentialRequest;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PendingIntentHandler {
    private static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    private static final int CONTROLLER_REQUEST_CODE = 1;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_LARGE_PAYLOAD_RESULT_RECEIVER = "androidx.credentials.provider.EXTRA_LARGE_PAYLOAD_RESULT_RECEIVER";
    public static final String EXTRA_PASS_IT_BY_RESULT_RECEIVER = "androidx.credentials.provider.EXTRA_PASS_IT_BY_RESULT_RECEIVER";
    public static final String EXTRA_RP_PID = "androidx.credentials.provider.EXTRA_RP_PID";
    private static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    private static final int ILLEGAL_PID = -1;
    private static final String RESULT_DATA_TAG = "RESULT_DATA";
    private static final String TAG = "PendingIntentHandler";
    private static final int TWO_HUNDRED_KB = 204800;

    public static final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
        return Companion.retrieveBeginGetCredentialRequest(intent);
    }

    public static final CreateCredentialException retrieveCreateCredentialException(Intent intent) {
        return Companion.retrieveCreateCredentialException(intent);
    }

    public static final CreateCredentialResponse retrieveCreateCredentialResponse(String str, Intent intent) {
        return Companion.retrieveCreateCredentialResponse(str, intent);
    }

    public static final GetCredentialException retrieveGetCredentialException(Intent intent) {
        return Companion.retrieveGetCredentialException(intent);
    }

    public static final GetCredentialResponse retrieveGetCredentialResponse(Intent intent) {
        return Companion.retrieveGetCredentialResponse(intent);
    }

    public static final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
        return Companion.retrieveProviderCreateCredentialRequest(intent);
    }

    public static final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
        return Companion.retrieveProviderGetCredentialRequest(intent);
    }

    public static final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
        Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
    }

    public static final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
        Companion.setCreateCredentialException(intent, createCredentialException);
    }

    public static final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
        Companion.setCreateCredentialResponse(intent, createCredentialResponse);
    }

    public static final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
        Companion.setGetCredentialException(intent, getCredentialException);
    }

    public static final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse) throws IOException {
        Companion.setGetCredentialResponse(intent, getCredentialResponse);
    }

    /* compiled from: WazeSource */
    public final class Api23Impl {
        public static final Companion Companion = new Companion(null);
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST";
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE";
        private static final String EXTRA_CREATE_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION";
        private static final String EXTRA_CREATE_CREDENTIAL_REQUEST = "android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST";
        private static final String EXTRA_CREATE_CREDENTIAL_RESPONSE = "android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE";
        private static final String EXTRA_GET_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION";
        private static final String EXTRA_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.GET_CREDENTIAL_REQUEST";
        private static final String EXTRA_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.GET_CREDENTIAL_RESPONSE";

        public static final BeginGetCredentialResponse extractBeginGetCredentialResponse(Intent intent) {
            return Companion.extractBeginGetCredentialResponse(intent);
        }

        public static final CreateCredentialException extractCreateCredentialException(Intent intent) {
            return Companion.extractCreateCredentialException(intent);
        }

        public static final CreateCredentialResponse extractCreateCredentialResponse(Intent intent) {
            return Companion.extractCreateCredentialResponse(intent);
        }

        public static final GetCredentialException extractGetCredentialException(Intent intent) {
            return Companion.extractGetCredentialException(intent);
        }

        public static final GetCredentialResponse extractGetCredentialResponse(Intent intent) {
            return Companion.extractGetCredentialResponse(intent);
        }

        public static final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
            return Companion.retrieveBeginGetCredentialRequest(intent);
        }

        public static final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
            return Companion.retrieveProviderCreateCredentialRequest(intent);
        }

        public static final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
            return Companion.retrieveProviderGetCredentialRequest(intent);
        }

        public static final void setBeginGetCredentialRequest(Intent intent, BeginGetCredentialRequest beginGetCredentialRequest) {
            Companion.setBeginGetCredentialRequest(intent, beginGetCredentialRequest);
        }

        public static final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
            Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
        }

        public static final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
            Companion.setCreateCredentialException(intent, createCredentialException);
        }

        public static final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
            Companion.setCreateCredentialResponse(intent, createCredentialResponse);
        }

        public static final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
            Companion.setGetCredentialException(intent, getCredentialException);
        }

        public static final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse, ProviderGetCredentialRequest providerGetCredentialRequest) throws IOException {
            Companion.setGetCredentialResponse(intent, getCredentialResponse, providerGetCredentialRequest);
        }

        public static final void setProviderCreateCredentialRequest(Intent intent, ProviderCreateCredentialRequest providerCreateCredentialRequest) {
            Companion.setProviderCreateCredentialRequest(intent, providerCreateCredentialRequest);
        }

        public static final void setProviderGetCredentialRequest(Intent intent, ProviderGetCredentialRequest providerGetCredentialRequest) {
            Companion.setProviderGetCredentialRequest(intent, providerGetCredentialRequest);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            private final void setGetCredentialResponseExtra(Intent intent, Bundle bundle) {
                intent.putExtra(Api23Impl.EXTRA_GET_CREDENTIAL_RESPONSE, bundle);
            }

            public final BeginGetCredentialResponse extractBeginGetCredentialResponse(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                BeginGetCredentialResponse.Companion companion = BeginGetCredentialResponse.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final CreateCredentialException extractCreateCredentialException(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                CreateCredentialException.Companion companion = CreateCredentialException.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_EXCEPTION);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final CreateCredentialResponse extractCreateCredentialResponse(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                CreateCredentialResponse.Companion companion = CreateCredentialResponse.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_RESPONSE);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final GetCredentialException extractGetCredentialException(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                GetCredentialException.Companion companion = GetCredentialException.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_GET_CREDENTIAL_EXCEPTION);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final GetCredentialResponse extractGetCredentialResponse(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_GET_CREDENTIAL_RESPONSE);
                if (bundleExtra == null) {
                    return null;
                }
                if (bundleExtra.containsKey(LargePayloadSupport.EXTRA_LARGE_PAYLOAD) && (bundleExtra = PendingIntentHandler.Companion.readBundleFromFd(bundleExtra)) == null) {
                    return null;
                }
                return GetCredentialResponse.Companion.fromBundle(bundleExtra);
            }

            public final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                BeginGetCredentialRequest.Companion companion = BeginGetCredentialRequest.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_REQUEST);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                try {
                    ProviderCreateCredentialRequest.Companion companion = ProviderCreateCredentialRequest.Companion;
                    Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_REQUEST);
                    if (bundleExtra == null) {
                        return null;
                    }
                    return companion.fromBundle(bundleExtra);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                try {
                    ProviderGetCredentialRequest.Companion companion = ProviderGetCredentialRequest.Companion;
                    Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_GET_CREDENTIAL_REQUEST);
                    if (bundleExtra == null) {
                        return null;
                    }
                    return companion.fromBundle(bundleExtra);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void setBeginGetCredentialRequest(Intent intent, BeginGetCredentialRequest beginGetCredentialRequest) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(beginGetCredentialRequest, "request");
                intent.putExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_REQUEST, BeginGetCredentialRequest.Companion.asBundle(beginGetCredentialRequest));
            }

            public final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(beginGetCredentialResponse, "response");
                intent.putExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE, BeginGetCredentialResponse.Companion.asBundle(beginGetCredentialResponse));
            }

            public final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(createCredentialException, "exception");
                intent.putExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_EXCEPTION, CreateCredentialException.Companion.asBundle(createCredentialException));
            }

            public final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(createCredentialResponse, "response");
                intent.putExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_RESPONSE, CreateCredentialResponse.Companion.asBundle(createCredentialResponse));
            }

            public final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(getCredentialException, "exception");
                intent.putExtra(Api23Impl.EXTRA_GET_CREDENTIAL_EXCEPTION, GetCredentialException.Companion.asBundle(getCredentialException));
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void setGetCredentialResponse(android.content.Intent r6, androidx.credentials.GetCredentialResponse r7, androidx.credentials.provider.ProviderGetCredentialRequest r8) throws java.io.IOException {
                /*
                    r5 = this;
                    java.lang.String r0 = "intent"
                    h.g.b.x.f(r6, r0)
                    java.lang.String r0 = "response"
                    h.g.b.x.f(r7, r0)
                    androidx.credentials.provider.PendingIntentHandler$Companion r0 = androidx.credentials.provider.PendingIntentHandler.Companion
                    androidx.credentials.Credential r1 = r7.getCredential()
                    android.os.Bundle r1 = r1.getData()
                    boolean r0 = androidx.credentials.provider.PendingIntentHandler.Companion.access$isLargerThan200Kb(r0, r1)
                    if (r0 != 0) goto L24
                    androidx.credentials.GetCredentialResponse$Companion r8 = androidx.credentials.GetCredentialResponse.Companion
                    android.os.Bundle r7 = r8.asBundle(r7)
                    r5.setGetCredentialResponseExtra(r6, r7)
                    return
                L24:
                    r0 = 0
                    if (r8 == 0) goto L50
                    java.util.List r1 = r8.getCredentialOptions()
                    if (r1 == 0) goto L50
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.Iterator r1 = r1.iterator()
                L33:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L50
                    java.lang.Object r2 = r1.next()
                    androidx.credentials.CredentialOption r2 = (androidx.credentials.CredentialOption) r2
                    android.os.Bundle r2 = r2.getRequestData()
                    java.lang.String r3 = "androidx.credentials.provider.EXTRA_LARGE_PAYLOAD_RESULT_RECEIVER"
                    java.lang.Class<android.os.ResultReceiver> r4 = android.os.ResultReceiver.class
                    java.lang.Object r2 = androidx.core.os.BundleCompat.getParcelable(r2, r3, r4)
                    android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2
                    if (r2 == 0) goto L33
                    goto L51
                L50:
                    r2 = r0
                L51:
                    r1 = -1
                    if (r8 == 0) goto L81
                    java.util.List r8 = r8.getCredentialOptions()
                    if (r8 == 0) goto L81
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.Iterator r8 = r8.iterator()
                    boolean r3 = r8.hasNext()
                    if (r3 == 0) goto L7a
                    java.lang.Object r8 = r8.next()
                    androidx.credentials.CredentialOption r8 = (androidx.credentials.CredentialOption) r8
                    android.os.Bundle r8 = r8.getRequestData()
                    java.lang.String r0 = "androidx.credentials.provider.EXTRA_RP_PID"
                    int r8 = r8.getInt(r0)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                L7a:
                    if (r0 == 0) goto L81
                    int r8 = r0.intValue()
                    goto L82
                L81:
                    r8 = r1
                L82:
                    if (r2 != 0) goto L8e
                    androidx.credentials.GetCredentialResponse$Companion r8 = androidx.credentials.GetCredentialResponse.Companion
                    android.os.Bundle r7 = r8.asBundle(r7)
                    r5.setGetCredentialResponseExtra(r6, r7)
                    return
                L8e:
                    androidx.credentials.provider.PendingIntentHandler$Companion r0 = androidx.credentials.provider.PendingIntentHandler.Companion
                    androidx.credentials.GetCredentialResponse$Companion r3 = androidx.credentials.GetCredentialResponse.Companion
                    android.os.Bundle r7 = r3.asBundle(r7)
                    android.os.Bundle r7 = androidx.credentials.provider.PendingIntentHandler.Companion.access$delegateBundleToFd(r0, r7)
                    java.lang.Object r0 = r6.clone()
                    java.lang.String r3 = "null cannot be cast to non-null type android.content.Intent"
                    h.g.b.x.d(r0, r3)
                    android.content.Intent r0 = (android.content.Intent) r0
                    r5.setGetCredentialResponseExtra(r0, r7)
                    java.lang.String r5 = "androidx.credentials.provider.EXTRA_PASS_IT_BY_RESULT_RECEIVER"
                    r3 = 1
                    r6.putExtra(r5, r3)
                    androidx.credentials.provider.PendingIntentHandler$Companion r5 = androidx.credentials.provider.PendingIntentHandler.Companion
                    androidx.credentials.provider.PendingIntentHandler.Companion.access$reportResult(r5, r2, r3, r1, r0)
                    androidx.credentials.provider.PendingIntentHandler$Companion r5 = androidx.credentials.provider.PendingIntentHandler.Companion
                    androidx.credentials.provider.PendingIntentHandler.Companion.access$closePfd(r5, r7, r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.PendingIntentHandler.Api23Impl.Companion.setGetCredentialResponse(android.content.Intent, androidx.credentials.GetCredentialResponse, androidx.credentials.provider.ProviderGetCredentialRequest):void");
            }

            public final void setProviderCreateCredentialRequest(Intent intent, ProviderCreateCredentialRequest providerCreateCredentialRequest) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(providerCreateCredentialRequest, "request");
                intent.putExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_REQUEST, ProviderCreateCredentialRequest.Companion.asBundle(providerCreateCredentialRequest));
            }

            public final void setProviderGetCredentialRequest(Intent intent, ProviderGetCredentialRequest providerGetCredentialRequest) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(providerGetCredentialRequest, "request");
                intent.putExtra(Api23Impl.EXTRA_GET_CREDENTIAL_REQUEST, ProviderGetCredentialRequest.Companion.asBundle(providerGetCredentialRequest));
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Api34Impl {
        public static final Companion Companion = new Companion(null);

        public static final CreateCredentialException extractCreateCredentialException(Intent intent) {
            return Companion.extractCreateCredentialException(intent);
        }

        public static final CreateCredentialResponse extractCreateCredentialResponse(String str, Intent intent) {
            return Companion.extractCreateCredentialResponse(str, intent);
        }

        public static final GetCredentialException extractGetCredentialException(Intent intent) {
            return Companion.extractGetCredentialException(intent);
        }

        public static final GetCredentialResponse extractGetCredentialResponse(Intent intent) {
            return Companion.extractGetCredentialResponse(intent);
        }

        public static final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
            return Companion.retrieveBeginGetCredentialRequest(intent);
        }

        public static final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
            return Companion.retrieveProviderCreateCredentialRequest(intent);
        }

        public static final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
            return Companion.retrieveProviderGetCredentialRequest(intent);
        }

        public static final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
            Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
        }

        public static final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
            Companion.setCreateCredentialException(intent, createCredentialException);
        }

        public static final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
            Companion.setCreateCredentialResponse(intent, createCredentialResponse);
        }

        public static final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
            Companion.setGetCredentialException(intent, getCredentialException);
        }

        public static final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse, ProviderGetCredentialRequest providerGetCredentialRequest) throws IOException {
            Companion.setGetCredentialResponse(intent, getCredentialResponse, providerGetCredentialRequest);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            private final BiometricPromptResult retrieveBiometricPromptResult(Intent intent, String str, String str2, String str3) {
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    x.c(extras);
                    if (extras.containsKey(str)) {
                        Bundle extras2 = intent.getExtras();
                        x.c(extras2);
                        return new BiometricPromptResult(new AuthenticationResult(extras2.getInt(str)));
                    }
                    Bundle extras3 = intent.getExtras();
                    x.c(extras3);
                    if (extras3.containsKey(str2)) {
                        Bundle extras4 = intent.getExtras();
                        x.c(extras4);
                        int i2 = extras4.getInt(str2);
                        Bundle extras5 = intent.getExtras();
                        return new BiometricPromptResult(new AuthenticationError(i2, extras5 != null ? extras5.getCharSequence(str3) : null));
                    }
                }
                return null;
            }

            static /* synthetic */ BiometricPromptResult retrieveBiometricPromptResult$default(Companion companion, Intent intent, String str, String str2, String str3, int i2, Object obj) {
                if ((i2 & 2) != 0) {
                    str = AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE;
                }
                if ((i2 & 4) != 0) {
                    str2 = AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR;
                }
                if ((i2 & 8) != 0) {
                    str3 = AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE;
                }
                return companion.retrieveBiometricPromptResult(intent, str, str2, str3);
            }

            private final BiometricPromptResult retrieveBiometricPromptResultFallback(Intent intent) {
                if (intent.getExtras() == null) {
                    return null;
                }
                Bundle extras = intent.getExtras();
                x.c(extras);
                if (!extras.containsKey(AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK)) {
                    Bundle extras2 = intent.getExtras();
                    x.c(extras2);
                    if (!extras2.containsKey(AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK)) {
                        return null;
                    }
                }
                return retrieveBiometricPromptResult(intent, AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK, AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK, AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK);
            }

            static final CredentialOption retrieveProviderGetCredentialRequest$lambda$0(android.credentials.CredentialOption credentialOption) {
                CredentialOption.Companion companion = CredentialOption.Companion;
                String type = credentialOption.getType();
                x.e(type, "getType(...)");
                Bundle credentialRetrievalData = credentialOption.getCredentialRetrievalData();
                x.e(credentialRetrievalData, "getCredentialRetrievalData(...)");
                Bundle candidateQueryData = credentialOption.getCandidateQueryData();
                x.e(candidateQueryData, "getCandidateQueryData(...)");
                boolean zIsSystemProviderRequired = credentialOption.isSystemProviderRequired();
                Set<ComponentName> allowedProviders = credentialOption.getAllowedProviders();
                x.e(allowedProviders, "getAllowedProviders(...)");
                return companion.createFrom(type, credentialRetrievalData, candidateQueryData, zIsSystemProviderRequired, allowedProviders);
            }

            static final CredentialOption retrieveProviderGetCredentialRequest$lambda$1(l lVar, Object obj) {
                return (CredentialOption) lVar.invoke(obj);
            }

            private final void setGetCredentialResponseExtra(Intent intent, String str, Bundle bundle) {
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", new android.credentials.GetCredentialResponse(new Credential(str, bundle)));
            }

            public final CreateCredentialException extractCreateCredentialException(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                android.credentials.CreateCredentialException createCredentialException = (android.credentials.CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", android.credentials.CreateCredentialException.class);
                if (createCredentialException == null) {
                    return null;
                }
                String type = createCredentialException.getType();
                x.e(type, "getType(...)");
                return ConversionUtilsKt.toJetpackCreateException(type, createCredentialException.getMessage());
            }

            public final CreateCredentialResponse extractCreateCredentialResponse(String str, Intent intent) {
                x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                android.credentials.CreateCredentialResponse createCredentialResponse = (android.credentials.CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", android.credentials.CreateCredentialResponse.class);
                if (createCredentialResponse == null) {
                    return null;
                }
                CreateCredentialResponse.Companion companion = CreateCredentialResponse.Companion;
                Bundle data = createCredentialResponse.getData();
                x.e(data, "getData(...)");
                return companion.createFrom(str, data);
            }

            public final GetCredentialException extractGetCredentialException(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                android.credentials.GetCredentialException getCredentialException = (android.credentials.GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
                if (getCredentialException == null) {
                    return null;
                }
                String type = getCredentialException.getType();
                x.e(type, "getType(...)");
                return ConversionUtilsKt.toJetpackGetException(type, getCredentialException.getMessage());
            }

            public final GetCredentialResponse extractGetCredentialResponse(Intent intent) {
                Credential credential;
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                android.credentials.GetCredentialResponse getCredentialResponse = (android.credentials.GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", android.credentials.GetCredentialResponse.class);
                if (getCredentialResponse == null) {
                    return null;
                }
                if (getCredentialResponse.getCredential().getData().containsKey(LargePayloadSupport.EXTRA_LARGE_PAYLOAD)) {
                    Companion companion = PendingIntentHandler.Companion;
                    Bundle data = getCredentialResponse.getCredential().getData();
                    x.e(data, "getData(...)");
                    Bundle bundleFromFd = companion.readBundleFromFd(data);
                    if (bundleFromFd == null) {
                        return null;
                    }
                    credential = new Credential(getCredentialResponse.getCredential().getType(), bundleFromFd);
                } else {
                    credential = getCredentialResponse.getCredential();
                    x.c(credential);
                }
                return new GetCredentialResponse(androidx.credentials.Credential.Companion.createFrom(credential));
            }

            public final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST", android.service.credentials.BeginGetCredentialRequest.class);
                if (beginGetCredentialRequest != null) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackRequest$credentials(beginGetCredentialRequest);
                }
                return null;
            }

            public final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) throws FrameworkClassParsingException {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                CreateCredentialRequest createCredentialRequest = (CreateCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", CreateCredentialRequest.class);
                if (createCredentialRequest == null) {
                    Log.i(PendingIntentHandler.TAG, "Request not found in pendingIntent");
                    return null;
                }
                BiometricPromptResult biometricPromptResultRetrieveBiometricPromptResult$default = retrieveBiometricPromptResult$default(this, intent, null, null, null, 14, null);
                if (biometricPromptResultRetrieveBiometricPromptResult$default == null) {
                    biometricPromptResultRetrieveBiometricPromptResult$default = retrieveBiometricPromptResultFallback(intent);
                }
                try {
                    CreateCredentialRequest.Companion companion = androidx.credentials.CreateCredentialRequest.Companion;
                    String type = createCredentialRequest.getType();
                    x.e(type, "getType(...)");
                    Bundle data = createCredentialRequest.getData();
                    x.e(data, "getData(...)");
                    Bundle data2 = createCredentialRequest.getData();
                    x.e(data2, "getData(...)");
                    androidx.credentials.CreateCredentialRequest createCredentialRequestCreateFrom = companion.createFrom(type, data, data2, false, createCredentialRequest.getCallingAppInfo().getOrigin());
                    CallingAppInfo.Companion companion2 = CallingAppInfo.Companion;
                    String packageName = createCredentialRequest.getCallingAppInfo().getPackageName();
                    x.e(packageName, "getPackageName(...)");
                    SigningInfo signingInfo = createCredentialRequest.getCallingAppInfo().getSigningInfo();
                    x.e(signingInfo, "getSigningInfo(...)");
                    return new ProviderCreateCredentialRequest(createCredentialRequestCreateFrom, companion2.create(packageName, signingInfo, createCredentialRequest.getCallingAppInfo().getOrigin()), biometricPromptResultRetrieveBiometricPromptResult$default, intent.getExtras());
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }

            public final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", GetCredentialRequest.class);
                if (getCredentialRequest == null) {
                    Log.i(PendingIntentHandler.TAG, "Get request from framework is null");
                    return null;
                }
                BiometricPromptResult biometricPromptResultRetrieveBiometricPromptResult$default = retrieveBiometricPromptResult$default(this, intent, null, null, null, 14, null);
                if (biometricPromptResultRetrieveBiometricPromptResult$default == null) {
                    biometricPromptResultRetrieveBiometricPromptResult$default = retrieveBiometricPromptResultFallback(intent);
                }
                ProviderGetCredentialRequest.Companion companion = ProviderGetCredentialRequest.Companion;
                Stream stream = Collection.EL.stream(getCredentialRequest.getCredentialOptions());
                final l lVar = new l() { // from class: androidx.credentials.provider.PendingIntentHandler$Api34Impl$Companion$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return PendingIntentHandler.Api34Impl.Companion.retrieveProviderGetCredentialRequest$lambda$0((android.credentials.CredentialOption) obj);
                    }
                };
                Object objCollect = stream.map(new Function() { // from class: androidx.credentials.provider.PendingIntentHandler$Api34Impl$Companion$$ExternalSyntheticLambda1
                    public /* synthetic */ Function andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return PendingIntentHandler.Api34Impl.Companion.retrieveProviderGetCredentialRequest$lambda$1(lVar, obj);
                    }

                    public /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toList());
                x.e(objCollect, "collect(...)");
                CallingAppInfo.Companion companion2 = CallingAppInfo.Companion;
                String packageName = getCredentialRequest.getCallingAppInfo().getPackageName();
                x.e(packageName, "getPackageName(...)");
                SigningInfo signingInfo = getCredentialRequest.getCallingAppInfo().getSigningInfo();
                x.e(signingInfo, "getSigningInfo(...)");
                return companion.createFrom$credentials((List) objCollect, companion2.create(packageName, signingInfo, getCredentialRequest.getCallingAppInfo().getOrigin()), biometricPromptResultRetrieveBiometricPromptResult$default, intent.getExtras());
            }

            public final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(beginGetCredentialResponse, "response");
                intent.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", BeginGetCredentialUtil.Companion.convertToFrameworkResponse(beginGetCredentialResponse));
            }

            public final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(createCredentialException, "exception");
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", new android.credentials.CreateCredentialException(createCredentialException.getType(), createCredentialException.getMessage()));
            }

            public final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(createCredentialResponse, "response");
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", new android.credentials.CreateCredentialResponse(createCredentialResponse.getData()));
            }

            public final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
                x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
                x.f(getCredentialException, "exception");
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", new android.credentials.GetCredentialException(getCredentialException.getType(), getCredentialException.getMessage()));
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void setGetCredentialResponse(android.content.Intent r6, androidx.credentials.GetCredentialResponse r7, androidx.credentials.provider.ProviderGetCredentialRequest r8) throws java.io.IOException {
                /*
                    r5 = this;
                    java.lang.String r0 = "intent"
                    h.g.b.x.f(r6, r0)
                    java.lang.String r0 = "response"
                    h.g.b.x.f(r7, r0)
                    androidx.credentials.provider.PendingIntentHandler$Companion r0 = androidx.credentials.provider.PendingIntentHandler.Companion
                    androidx.credentials.Credential r1 = r7.getCredential()
                    android.os.Bundle r1 = r1.getData()
                    boolean r0 = androidx.credentials.provider.PendingIntentHandler.Companion.access$isLargerThan200Kb(r0, r1)
                    if (r0 != 0) goto L2e
                    androidx.credentials.Credential r8 = r7.getCredential()
                    java.lang.String r8 = r8.getType()
                    androidx.credentials.Credential r7 = r7.getCredential()
                    android.os.Bundle r7 = r7.getData()
                    r5.setGetCredentialResponseExtra(r6, r8, r7)
                    return
                L2e:
                    r0 = 0
                    if (r8 == 0) goto L5a
                    java.util.List r1 = r8.getCredentialOptions()
                    if (r1 == 0) goto L5a
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.Iterator r1 = r1.iterator()
                L3d:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L5a
                    java.lang.Object r2 = r1.next()
                    androidx.credentials.CredentialOption r2 = (androidx.credentials.CredentialOption) r2
                    android.os.Bundle r2 = r2.getRequestData()
                    java.lang.String r3 = "androidx.credentials.provider.EXTRA_LARGE_PAYLOAD_RESULT_RECEIVER"
                    java.lang.Class<android.os.ResultReceiver> r4 = android.os.ResultReceiver.class
                    java.lang.Object r2 = androidx.core.os.BundleCompat.getParcelable(r2, r3, r4)
                    android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2
                    if (r2 == 0) goto L3d
                    goto L5b
                L5a:
                    r2 = r0
                L5b:
                    r1 = -1
                    if (r8 == 0) goto L8b
                    java.util.List r8 = r8.getCredentialOptions()
                    if (r8 == 0) goto L8b
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.Iterator r8 = r8.iterator()
                    boolean r3 = r8.hasNext()
                    if (r3 == 0) goto L84
                    java.lang.Object r8 = r8.next()
                    androidx.credentials.CredentialOption r8 = (androidx.credentials.CredentialOption) r8
                    android.os.Bundle r8 = r8.getRequestData()
                    java.lang.String r0 = "androidx.credentials.provider.EXTRA_RP_PID"
                    int r8 = r8.getInt(r0)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                L84:
                    if (r0 == 0) goto L8b
                    int r8 = r0.intValue()
                    goto L8c
                L8b:
                    r8 = r1
                L8c:
                    if (r2 != 0) goto La2
                    androidx.credentials.Credential r8 = r7.getCredential()
                    java.lang.String r8 = r8.getType()
                    androidx.credentials.Credential r7 = r7.getCredential()
                    android.os.Bundle r7 = r7.getData()
                    r5.setGetCredentialResponseExtra(r6, r8, r7)
                    return
                La2:
                    androidx.credentials.provider.PendingIntentHandler$Companion r0 = androidx.credentials.provider.PendingIntentHandler.Companion
                    androidx.credentials.Credential r3 = r7.getCredential()
                    android.os.Bundle r3 = r3.getData()
                    android.os.Bundle r0 = androidx.credentials.provider.PendingIntentHandler.Companion.access$delegateBundleToFd(r0, r3)
                    java.lang.Object r3 = r6.clone()
                    java.lang.String r4 = "null cannot be cast to non-null type android.content.Intent"
                    h.g.b.x.d(r3, r4)
                    android.content.Intent r3 = (android.content.Intent) r3
                    androidx.credentials.Credential r7 = r7.getCredential()
                    java.lang.String r7 = r7.getType()
                    r5.setGetCredentialResponseExtra(r3, r7, r0)
                    java.lang.String r5 = "androidx.credentials.provider.EXTRA_PASS_IT_BY_RESULT_RECEIVER"
                    r7 = 1
                    r6.putExtra(r5, r7)
                    androidx.credentials.provider.PendingIntentHandler$Companion r5 = androidx.credentials.provider.PendingIntentHandler.Companion
                    androidx.credentials.provider.PendingIntentHandler.Companion.access$reportResult(r5, r2, r7, r1, r3)
                    androidx.credentials.provider.PendingIntentHandler$Companion r5 = androidx.credentials.provider.PendingIntentHandler.Companion
                    androidx.credentials.provider.PendingIntentHandler.Companion.access$closePfd(r5, r0, r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.PendingIntentHandler.Api34Impl.Companion.setGetCredentialResponse(android.content.Intent, androidx.credentials.GetCredentialResponse, androidx.credentials.provider.ProviderGetCredentialRequest):void");
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void closePfd(Bundle bundle, int i2) throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) BundleCompat.getParcelable(bundle, LargePayloadSupport.EXTRA_LARGE_PAYLOAD, ParcelFileDescriptor.class);
            if (i2 == Process.myPid() || parcelFileDescriptor == null) {
                return;
            }
            parcelFileDescriptor.close();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle delegateBundleToFd(Bundle bundle) {
            Bundle bundleEncodeBundleToPfd = LargePayloadSupport.encodeBundleToPfd(bundle);
            if (bundleEncodeBundleToPfd != null) {
                return bundleEncodeBundleToPfd;
            }
            Bundle bundle2 = Bundle.EMPTY;
            x.e(bundle2, "EMPTY");
            return bundle2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isLargerThan200Kb(Bundle bundle) {
            Parcel parcelObtain = Parcel.obtain();
            x.e(parcelObtain, "obtain(...)");
            try {
                parcelObtain.writeBundle(bundle);
                return parcelObtain.dataSize() >= PendingIntentHandler.TWO_HUNDRED_KB;
            } catch (Exception e2) {
                Log.e(LargePayloadSupport.TAG, "An exception occurred during payload transfer", e2);
                return false;
            } finally {
                parcelObtain.recycle();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle readBundleFromFd(Bundle bundle) {
            try {
                return LargePayloadSupport.decodeBundleFromPfd(bundle);
            } catch (Throwable th) {
                Log.e(PendingIntentHandler.TAG, "decode exception", th);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void reportResult(ResultReceiver resultReceiver, int i2, int i3, Intent intent) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", i2);
            bundle.putParcelable("RESULT_DATA", intent);
            try {
                resultReceiver.send(i3, bundle);
            } catch (Throwable th) {
                Log.e(PendingIntentHandler.TAG, "send error", th);
            }
        }

        private final void setGetCredentialResponseInternal(Intent intent, GetCredentialResponse getCredentialResponse, ProviderGetCredentialRequest providerGetCredentialRequest) throws IOException {
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setGetCredentialResponse(intent, getCredentialResponse, providerGetCredentialRequest);
            } else {
                Api23Impl.Companion.setGetCredentialResponse(intent, getCredentialResponse, providerGetCredentialRequest);
            }
        }

        public final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.retrieveBeginGetCredentialRequest(intent) : Api23Impl.Companion.retrieveBeginGetCredentialRequest(intent);
        }

        public final CreateCredentialException retrieveCreateCredentialException(Intent intent) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.extractCreateCredentialException(intent) : Api23Impl.Companion.extractCreateCredentialException(intent);
        }

        public final CreateCredentialResponse retrieveCreateCredentialResponse(String str, Intent intent) {
            x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.extractCreateCredentialResponse(str, intent) : Api23Impl.Companion.extractCreateCredentialResponse(intent);
        }

        public final GetCredentialException retrieveGetCredentialException(Intent intent) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.extractGetCredentialException(intent) : Api23Impl.Companion.extractGetCredentialException(intent);
        }

        public final GetCredentialResponse retrieveGetCredentialResponse(Intent intent) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.extractGetCredentialResponse(intent) : Api23Impl.Companion.extractGetCredentialResponse(intent);
        }

        public final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.retrieveProviderCreateCredentialRequest(intent) : Api23Impl.Companion.retrieveProviderCreateCredentialRequest(intent);
        }

        public final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.retrieveProviderGetCredentialRequest(intent) : Api23Impl.Companion.retrieveProviderGetCredentialRequest(intent);
        }

        public final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            x.f(beginGetCredentialResponse, "response");
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
            } else {
                Api23Impl.Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
            }
        }

        public final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            x.f(createCredentialException, "exception");
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setCreateCredentialException(intent, createCredentialException);
            } else {
                Api23Impl.Companion.setCreateCredentialException(intent, createCredentialException);
            }
        }

        public final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            x.f(createCredentialResponse, "response");
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setCreateCredentialResponse(intent, createCredentialResponse);
            } else {
                Api23Impl.Companion.setCreateCredentialResponse(intent, createCredentialResponse);
            }
        }

        public final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            x.f(getCredentialException, "exception");
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setGetCredentialException(intent, getCredentialException);
            } else {
                Api23Impl.Companion.setGetCredentialException(intent, getCredentialException);
            }
        }

        public final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse, ProviderGetCredentialRequest providerGetCredentialRequest) throws IOException {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            x.f(getCredentialResponse, "response");
            x.f(providerGetCredentialRequest, "request");
            setGetCredentialResponseInternal(intent, getCredentialResponse, providerGetCredentialRequest);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse) throws IOException {
            x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
            x.f(getCredentialResponse, "response");
            setGetCredentialResponseInternal(intent, getCredentialResponse, null);
        }
    }

    public static final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse, ProviderGetCredentialRequest providerGetCredentialRequest) throws IOException {
        Companion.setGetCredentialResponse(intent, getCredentialResponse, providerGetCredentialRequest);
    }
}
