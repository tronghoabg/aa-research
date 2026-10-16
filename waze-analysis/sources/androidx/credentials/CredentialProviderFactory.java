package androidx.credentials;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;
import androidx.credentials.internal.FormFactorHelper;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CredentialProviderFactory {
    private static final String CREDENTIAL_PROVIDER_KEY = "androidx.credentials.CREDENTIAL_PROVIDER_KEY";
    public static final Companion Companion = new Companion(null);
    private static final int MAX_CRED_MAN_PRE_FRAMEWORK_API_LEVEL = 33;
    private static final String TAG = "CredProviderFactory";
    private final Context context;
    private boolean testMode;
    private CredentialProvider testPostUProvider;
    private CredentialProvider testPreUProvider;

    public CredentialProviderFactory(Context context) {
        x.f(context, "context");
        this.context = context;
    }

    private final List<String> getAllowedProvidersFromManifest(Context context) throws PackageManager.NameNotFoundException {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        if (packageInfo.services != null) {
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            x.c(serviceInfoArr);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.metaData != null && (string = serviceInfo.metaData.getString(CREDENTIAL_PROVIDER_KEY)) != null) {
                    arrayList.add(string);
                }
            }
        }
        return i.ao(arrayList);
    }

    private final CredentialProvider instantiatePreUProvider(List<String> list, Context context) {
        Iterator<String> it = list.iterator();
        CredentialProvider credentialProvider = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                x.d(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                CredentialProvider credentialProvider2 = (CredentialProvider) objNewInstance;
                if (!credentialProvider2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (credentialProvider != null) {
                        Log.i(TAG, "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    credentialProvider = credentialProvider2;
                }
            } catch (Throwable unused) {
            }
        }
        return credentialProvider;
    }

    private final CredentialProvider tryCreateClosedSourceProviderFromManifest() throws PackageManager.NameNotFoundException {
        if (!this.testMode) {
            List<String> allowedProvidersFromManifest = getAllowedProvidersFromManifest(this.context);
            if (allowedProvidersFromManifest.isEmpty()) {
                return null;
            }
            return instantiatePreUProvider(allowedProvidersFromManifest, this.context);
        }
        CredentialProvider credentialProvider = this.testPreUProvider;
        if (credentialProvider != null && credentialProvider.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    private final CredentialProvider tryCreatePostUProvider() {
        if (!this.testMode) {
            CredentialProviderFrameworkImpl credentialProviderFrameworkImpl = new CredentialProviderFrameworkImpl(this.context);
            if (credentialProviderFrameworkImpl.isAvailableOnDevice()) {
                return credentialProviderFrameworkImpl;
            }
            return null;
        }
        CredentialProvider credentialProvider = this.testPostUProvider;
        if (credentialProvider != null && credentialProvider.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }

    public final CredentialProvider getBestAvailableProvider(Object obj, boolean z) {
        x.f(obj, "request");
        if ((obj instanceof CreateRestoreCredentialRequest) || x.n(obj, ClearCredentialStateRequest.TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            return tryCreateClosedSourceProviderFromManifest();
        }
        if (obj instanceof GetCredentialRequest) {
            for (CredentialOption credentialOption : ((GetCredentialRequest) obj).getCredentialOptions()) {
                if ((credentialOption instanceof GetRestoreCredentialOption) || (credentialOption instanceof GetDigitalCredentialOption)) {
                    return tryCreateClosedSourceProviderFromManifest();
                }
            }
        } else {
            if ((obj instanceof SignalCredentialStateRequest) || ((obj instanceof CreatePublicKeyCredentialRequest) && ((CreatePublicKeyCredentialRequest) obj).isConditional())) {
                return tryCreateClosedSourceProviderFromManifest();
            }
            if (obj instanceof CreateDigitalCredentialRequest) {
                return tryCreateClosedSourceProviderFromManifest();
            }
        }
        return getBestAvailableProvider(z);
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean getTestMode() {
        return this.testMode;
    }

    public final CredentialProvider getTestPostUProvider() {
        return this.testPostUProvider;
    }

    public final CredentialProvider getTestPreUProvider() {
        return this.testPreUProvider;
    }

    public final void setTestMode(boolean z) {
        this.testMode = z;
    }

    public final void setTestPostUProvider(CredentialProvider credentialProvider) {
        this.testPostUProvider = credentialProvider;
    }

    public final void setTestPreUProvider(CredentialProvider credentialProvider) {
        this.testPreUProvider = credentialProvider;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final CredentialProvider getBestAvailableProvider(boolean z) {
        if (!FormFactorHelper.isTV(this.context) && !FormFactorHelper.isAuto(this.context)) {
            if (Build.VERSION.SDK_INT >= 34) {
                CredentialProvider credentialProviderTryCreatePostUProvider = tryCreatePostUProvider();
                return (credentialProviderTryCreatePostUProvider == null && z) ? tryCreateClosedSourceProviderFromManifest() : credentialProviderTryCreatePostUProvider;
            }
            if (Build.VERSION.SDK_INT <= 33) {
                return tryCreateClosedSourceProviderFromManifest();
            }
            return null;
        }
        return tryCreateClosedSourceProviderFromManifest();
    }
}
