package com.google.android.libraries.assistant.appintegration;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.assistant.a.a.a;
import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationPublicValueProvider;
import com.google.b.d.b.ah;
import com.google.d.b.aa;
import com.google.d.f.h;
import com.google.d.f.i;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import com.google.v.de;
import com.google.v.eu;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class AssistantConfig {
    private static final String OPA_APP_INTEGRATION_DATA_SEMANTIC_KEY = "opa_app_integration_data";
    private static AssistantConfig assistantConfigForTest;
    private static final i logger = i.l("com/google/android/libraries/assistant/appintegration/AssistantConfig");
    private final aa<String> account;
    private final List<Integer> experimentIds;
    private final aa<Boolean> grpcSupported;
    private final aa<String> language;
    private final aa<Boolean> shouldShowAssistantDisclosure;
    private final List<String> supportedFeatures;
    private final List<Integer> supportedVoicePlateModes;
    private final aa<Boolean> tngMorrisSupported;

    public AssistantConfig(AppIntegrationPublicValueProvider.AppIntegrationData appIntegrationData) {
        this.supportedVoicePlateModes = appIntegrationData.getSupportedVoicePlateModesList();
        this.supportedFeatures = appIntegrationData.getSupportedFeaturesList();
        this.experimentIds = appIntegrationData.getExperimentIdsList();
        this.language = appIntegrationData.hasOpaLanguage() ? aa.i(appIntegrationData.getOpaLanguage()) : aa.g();
        this.account = appIntegrationData.hasOpaAccount() ? aa.i(appIntegrationData.getOpaAccount()) : aa.g();
        this.shouldShowAssistantDisclosure = appIntegrationData.hasShowAssistantDisclosure() ? aa.i(Boolean.valueOf(appIntegrationData.getShowAssistantDisclosure())) : aa.g();
        this.grpcSupported = appIntegrationData.hasIsGrpcSupported() ? aa.i(Boolean.valueOf(appIntegrationData.getIsGrpcSupported())) : aa.g();
        this.tngMorrisSupported = appIntegrationData.hasIsTngMorris() ? aa.i(Boolean.valueOf(appIntegrationData.getIsTngMorris())) : aa.g();
    }

    static bm<AssistantConfig> getCurrentAssistantConfig(final Context context) {
        AssistantConfig assistantConfig = assistantConfigForTest;
        if (assistantConfig != null) {
            return bd.h(assistantConfig);
        }
        return bd.k(ah.e(new Callable() { // from class: com.google.android.libraries.assistant.appintegration.AssistantConfig$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AssistantConfig.lambda$getCurrentAssistantConfig$0(context);
            }
        }), cf.w(Executors.newSingleThreadExecutor()));
    }

    static /* synthetic */ AssistantConfig lambda$getCurrentAssistantConfig$0(Context context) throws eu {
        String strA = a.a(context.getContentResolver());
        if (strA == null) {
            ((h) ((h) logger.g()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "getCurrentAssistantConfig", 130, "AssistantConfig.java")).o("appIntegrationDataInBase64 is null");
            throw new IllegalStateException("Failed to query AGSA value. This is most likely caused by a Google signature check failure. Please make sure both of the AGSA app and the client app are either release or dev builds.");
        }
        try {
            AppIntegrationPublicValueProvider.AppIntegrationData from = AppIntegrationPublicValueProvider.AppIntegrationData.parseFrom(Base64.decode(strA, 0), de.a());
            ((h) ((h) logger.b()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "getCurrentAssistantConfig", 144, "AssistantConfig.java")).p("%s", from);
            return new AssistantConfig(from);
        } catch (eu e2) {
            ((h) ((h) logger.g()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "getCurrentAssistantConfig", 146, "AssistantConfig.java")).o("InvalidProtocolBufferException");
            throw e2;
        }
    }

    public static void setAssistantConfigForTest(AssistantConfig assistantConfig) {
        assistantConfigForTest = assistantConfig;
    }

    public aa<String> getAccount() {
        return this.account;
    }

    public List<Integer> getExperimentIds() {
        return this.experimentIds;
    }

    public aa<String> getLanguage() {
        ((h) ((h) logger.d()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "getLanguage", 81, "AssistantConfig.java")).p("#getLanguage() - language = %s", this.language);
        return this.language;
    }

    public boolean isAvailable(int i2) {
        boolean zContains = this.supportedVoicePlateModes.contains(Integer.valueOf(i2));
        ((h) ((h) logger.d()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "isAvailable", 67, "AssistantConfig.java")).t(i2, zContains);
        return zContains;
    }

    public boolean isFeatureSupported(String str) {
        boolean zContains = this.supportedFeatures.contains(str);
        ((h) ((h) logger.d()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "isFeatureSupported", 96, "AssistantConfig.java")).u(str, zContains);
        return zContains;
    }

    public aa<Boolean> isGrpcSupported() {
        ((h) ((h) logger.d()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "isGrpcSupported", 101, "AssistantConfig.java")).p("#grpcEligible() - grpcEligible = %s", this.grpcSupported);
        return this.grpcSupported;
    }

    public aa<Boolean> isTngMorrisSupported() {
        ((h) ((h) logger.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "isTngMorrisSupported", 106, "AssistantConfig.java")).p("#isTngMorrisSupported = %s", this.tngMorrisSupported);
        return this.tngMorrisSupported;
    }

    public aa<Boolean> shouldShowAssistantDisclosure() {
        ((h) ((h) logger.d()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "shouldShowAssistantDisclosure", 87, "AssistantConfig.java")).p("#shouldShowAssistantDisclosure() - shouldShowAssistantDisclosure = %b", this.shouldShowAssistantDisclosure);
        return this.shouldShowAssistantDisclosure;
    }
}
