package com.google.android.libraries.assistant.appintegration;

import android.content.Context;
import com.google.android.gms.common.ah;
import com.google.android.libraries.assistant.appintegration.AutoValue_AssistantIntegrationClientConfig;
import com.google.d.b.aa;
import com.google.d.m.a.bn;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class AssistantIntegrationClientConfig {

    /* compiled from: WazeSource */
    public abstract class Builder {
        public abstract AssistantIntegrationClientConfig build();

        abstract Builder setContext(Context context);

        public abstract Builder setForceUsingGrpc(boolean z);

        public abstract Builder setGoogleSignatureVerifier(ah ahVar);

        public abstract Builder setListeningExecutorService(bn bnVar);
    }

    public static Builder builder(Context context) {
        AutoValue_AssistantIntegrationClientConfig.Builder builder = new AutoValue_AssistantIntegrationClientConfig.Builder();
        builder.setContext(context);
        builder.setGoogleSignatureVerifier(null);
        builder.setListeningExecutorService(null);
        builder.setForceUsingGrpc(false);
        return builder;
    }

    public abstract Context context();

    public abstract boolean forceUsingGrpc();

    public abstract aa<ah> googleSignatureVerifier();

    public abstract aa<bn> listeningExecutorService();
}
