package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0017\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0002R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDeveloperConsentDataSource;", "Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;", "flattenerRulesUseCase", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "publicStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;Lcom/unity3d/services/core/misc/JsonStorage;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "developerConsent", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "createDeveloperConsentOption", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption;", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "", "developerConsentList", "", "fetchData", "Lorg/json/JSONObject;", "getDeveloperConsentChoice", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "choice", "(Ljava/lang/Boolean;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "getDeveloperConsentType", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;", "type", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {

    @NotNull
    private final FlattenerRulesUseCase flattenerRulesUseCase;

    @NotNull
    private final JsonStorage publicStorage;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidDeveloperConsentDataSource(@NotNull FlattenerRulesUseCase flattenerRulesUseCase, @NotNull JsonStorage publicStorage, @NotNull SessionRepository sessionRepository) {
        AbstractC3340k.e(flattenerRulesUseCase, "flattenerRulesUseCase");
        AbstractC3340k.e(publicStorage, "publicStorage");
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = publicStorage;
        this.sessionRepository = sessionRepository;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(String key, boolean value) {
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.INSTANCE;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setType(getDeveloperConsentType(key));
        if (dsl_create.getType() == DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            dsl_create.setCustomType(key);
        }
        dsl_create.setValue(getDeveloperConsentChoice(Boolean.valueOf(value)));
        return dsl_create._build();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() throws org.json.JSONException {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r9.sessionRepository
            com.unity3d.ads.core.data.model.InitializationConfigurationInternal r1 = r1.getInitializationConfiguration()
            if (r1 == 0) goto L8e
            java.lang.Boolean r1 = com.unity3d.ads.UnityAds.getNonBehavioral()
            java.lang.String r2 = "newBuilder()"
            if (r1 == 0) goto L39
            gatewayprotocol.v1.DeveloperConsentOptionKt$Dsl$Companion r1 = gatewayprotocol.v1.DeveloperConsentOptionKt.Dsl.INSTANCE
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder r3 = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder()
            kotlin.jvm.internal.AbstractC3340k.d(r3, r2)
            gatewayprotocol.v1.DeveloperConsentOptionKt$Dsl r1 = r1._create(r3)
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType r3 = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_NON_BEHAVIORAL
            r1.setType(r3)
            java.lang.Boolean r3 = com.unity3d.ads.UnityAds.getNonBehavioral()
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice r3 = r9.getDeveloperConsentChoice(r3)
            r1.setValue(r3)
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption r1 = r1._build()
            r0.add(r1)
        L39:
            java.lang.Boolean r1 = com.unity3d.ads.UnityAds.getUserConsent()
            if (r1 == 0) goto L63
            gatewayprotocol.v1.DeveloperConsentOptionKt$Dsl$Companion r1 = gatewayprotocol.v1.DeveloperConsentOptionKt.Dsl.INSTANCE
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder r3 = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder()
            kotlin.jvm.internal.AbstractC3340k.d(r3, r2)
            gatewayprotocol.v1.DeveloperConsentOptionKt$Dsl r1 = r1._create(r3)
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType r3 = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_CONSENT
            r1.setType(r3)
            java.lang.Boolean r3 = com.unity3d.ads.UnityAds.getUserConsent()
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice r3 = r9.getDeveloperConsentChoice(r3)
            r1.setValue(r3)
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption r1 = r1._build()
            r0.add(r1)
        L63:
            java.lang.Boolean r1 = com.unity3d.ads.UnityAds.getUserOptOut()
            if (r1 == 0) goto Lf3
            gatewayprotocol.v1.DeveloperConsentOptionKt$Dsl$Companion r1 = gatewayprotocol.v1.DeveloperConsentOptionKt.Dsl.INSTANCE
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption$Builder r3 = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder()
            kotlin.jvm.internal.AbstractC3340k.d(r3, r2)
            gatewayprotocol.v1.DeveloperConsentOptionKt$Dsl r1 = r1._create(r3)
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentType r2 = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_OPT_OUT
            r1.setType(r2)
            java.lang.Boolean r2 = com.unity3d.ads.UnityAds.getUserOptOut()
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentChoice r2 = r9.getDeveloperConsentChoice(r2)
            r1.setValue(r2)
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption r1 = r1._build()
            r0.add(r1)
            return r0
        L8e:
            org.json.JSONObject r1 = r9.fetchData()
            java.util.Iterator r2 = r1.keys()
            java.lang.String r3 = "data.keys()"
            kotlin.jvm.internal.AbstractC3340k.d(r2, r3)
        L9b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lf3
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            boolean r5 = r4 instanceof java.lang.Boolean
            java.lang.String r6 = "storedValue"
            java.lang.String r7 = "key"
            if (r5 == 0) goto Lc4
            kotlin.jvm.internal.AbstractC3340k.d(r3, r7)
            kotlin.jvm.internal.AbstractC3340k.d(r4, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption r3 = r9.createDeveloperConsentOption(r3, r4)
            goto Led
        Lc4:
            boolean r5 = r4 instanceof java.lang.String
            r8 = 0
            if (r5 == 0) goto Le0
            kotlin.jvm.internal.AbstractC3340k.d(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "true"
            r6 = 1
            boolean r5 = Bf.r.c0(r4, r5, r6)
            if (r5 != 0) goto Le2
            java.lang.String r5 = "false"
            boolean r5 = Bf.r.c0(r4, r5, r6)
            if (r5 == 0) goto Le0
            goto Le2
        Le0:
            r3 = r8
            goto Led
        Le2:
            kotlin.jvm.internal.AbstractC3340k.d(r3, r7)
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption r3 = r9.createDeveloperConsentOption(r3, r4)
        Led:
            if (r3 == 0) goto L9b
            r0.add(r3)
            goto L9b
        Lf3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.developerConsentList():java.util.List");
    }

    private final JSONObject fetchData() {
        if (this.publicStorage.getData() == null) {
            return new JSONObject();
        }
        JSONObject jSONObjectFlattenJson = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
        AbstractC3340k.d(jSONObjectFlattenJson, "flattener.flattenJson(\".… flattenerRulesUseCase())");
        return jSONObjectFlattenJson;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(Boolean choice) {
        return AbstractC3340k.a(choice, Boolean.TRUE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE : AbstractC3340k.a(choice, Boolean.FALSE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE : DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(String type) {
        if (type == null) {
            return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
        }
        switch (type.hashCode()) {
            case -1998919769:
                if (type.equals("user.nonbehavioral")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case -1078801183:
                if (type.equals("pipl.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                break;
            case -5454905:
                if (type.equals(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY)) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case 194451659:
                if (type.equals("gdpr.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                break;
            case 519433140:
                if (type.equals("privacy.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                break;
            case 2033752033:
                if (type.equals("privacy.useroveragelimit")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                break;
        }
        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
    }

    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    @NotNull
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.INSTANCE;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllOptions(dsl_create.getOptions(), developerConsentList());
        return dsl_create._build();
    }
}
