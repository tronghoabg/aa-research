package com.google.android.libraries.assistant.appintegration;

import android.content.Context;
import com.google.android.gms.common.ah;
import com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig;
import com.google.d.b.aa;
import com.google.d.m.a.bn;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class AutoValue_AssistantIntegrationClientConfig extends AssistantIntegrationClientConfig {
    private final Context context;
    private final boolean forceUsingGrpc;
    private final aa<ah> googleSignatureVerifier;
    private final aa<bn> listeningExecutorService;

    /* compiled from: WazeSource */
    final class Builder extends AssistantIntegrationClientConfig.Builder {
        private Context context;
        private boolean forceUsingGrpc;
        private aa<ah> googleSignatureVerifier = aa.g();
        private aa<bn> listeningExecutorService;
        private byte set$0;

        Builder() {
        }

        @Override // com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig.Builder
        public AssistantIntegrationClientConfig build() {
            Context context;
            if (this.set$0 == 1 && (context = this.context) != null) {
                return new AutoValue_AssistantIntegrationClientConfig(this.forceUsingGrpc, context, this.googleSignatureVerifier, this.listeningExecutorService);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.set$0) == 0) {
                sb.append(" forceUsingGrpc");
            }
            if (this.context == null) {
                sb.append(" context");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }

        @Override // com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig.Builder
        AssistantIntegrationClientConfig.Builder setContext(Context context) {
            if (context == null) {
                throw new NullPointerException("Null context");
            }
            this.context = context;
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig.Builder
        public AssistantIntegrationClientConfig.Builder setForceUsingGrpc(boolean z) {
            this.forceUsingGrpc = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig.Builder
        public AssistantIntegrationClientConfig.Builder setGoogleSignatureVerifier(ah ahVar) {
            this.googleSignatureVerifier = aa.h(ahVar);
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig.Builder
        public AssistantIntegrationClientConfig.Builder setListeningExecutorService(bn bnVar) {
            this.listeningExecutorService = aa.h(bnVar);
            return this;
        }
    }

    private AutoValue_AssistantIntegrationClientConfig(boolean z, Context context, aa<ah> aaVar, aa<bn> aaVar2) {
        this.forceUsingGrpc = z;
        this.context = context;
        this.googleSignatureVerifier = aaVar;
        this.listeningExecutorService = aaVar2;
    }

    @Override // com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        aa<bn> aaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssistantIntegrationClientConfig) {
            AssistantIntegrationClientConfig assistantIntegrationClientConfig = (AssistantIntegrationClientConfig) obj;
            if (this.forceUsingGrpc == assistantIntegrationClientConfig.forceUsingGrpc() && this.context.equals(assistantIntegrationClientConfig.context()) && this.googleSignatureVerifier.equals(assistantIntegrationClientConfig.googleSignatureVerifier()) && ((aaVar = this.listeningExecutorService) != null ? aaVar.equals(assistantIntegrationClientConfig.listeningExecutorService()) : assistantIntegrationClientConfig.listeningExecutorService() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig
    public boolean forceUsingGrpc() {
        return this.forceUsingGrpc;
    }

    @Override // com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig
    public aa<ah> googleSignatureVerifier() {
        return this.googleSignatureVerifier;
    }

    public int hashCode() {
        int iHashCode = (((((true != this.forceUsingGrpc ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS) ^ 1000003) * 1000003) ^ this.context.hashCode()) * 1000003) ^ this.googleSignatureVerifier.hashCode();
        aa<bn> aaVar = this.listeningExecutorService;
        return (aaVar == null ? 0 : aaVar.hashCode()) ^ (iHashCode * 1000003);
    }

    @Override // com.google.android.libraries.assistant.appintegration.AssistantIntegrationClientConfig
    public aa<bn> listeningExecutorService() {
        return this.listeningExecutorService;
    }

    public String toString() {
        aa<bn> aaVar = this.listeningExecutorService;
        aa<ah> aaVar2 = this.googleSignatureVerifier;
        return "AssistantIntegrationClientConfig{forceUsingGrpc=" + this.forceUsingGrpc + ", context=" + String.valueOf(this.context) + ", googleSignatureVerifier=" + String.valueOf(aaVar2) + ", listeningExecutorService=" + String.valueOf(aaVar) + "}";
    }
}
