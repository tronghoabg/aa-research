package com.google.android.gms.net;

/* JADX INFO: loaded from: classes2.dex */
public class PlayServicesCronetProvider extends org.chromium.net.CronetProvider {
    private static final java.lang.String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final java.lang.String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(android.content.Context context) {
        super(context);
    }

    private static java.lang.Class<? extends org.chromium.net.ICronetEngineBuilder> subclassNativeCronetEngine(java.lang.ClassLoader classLoader) throws java.lang.ClassNotFoundException {
        try {
            return classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(org.chromium.net.ICronetEngineBuilder.class);
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Failed to subclass native cronet engine!, NativeCronetEngineBuilderImpl Classloader: %s, ICronetEngineBuilder Classloader: %s", classLoader, org.chromium.net.ICronetEngineBuilder.class.getClassLoader()), e);
        }
    }

    private void tryToInstallCronetProvider() {
        try {
            defpackage.svb.b(this.mContext);
        } catch (defpackage.slg unused) {
            if (android.util.Log.isLoggable(TAG, 4)) {
                android.util.Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        } catch (defpackage.slh unused2) {
            if (android.util.Log.isLoggable(TAG, 4)) {
                android.util.Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
    }

    @Override // org.chromium.net.CronetProvider
    public org.chromium.net.CronetEngine.Builder createBuilder() {
        try {
            defpackage.svb.b(this.mContext);
            try {
                defpackage.svd svdVar = new defpackage.svd(this.mContext, 37402, 0.01f);
                try {
                    com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton = com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(this.mContext);
                    if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
                        org.chromium.net.CronetEngine.Builder builderCreateBuilder = httpEngineProviderSingleton.getHttpEngineProvider().createBuilder();
                        svdVar.a();
                        svdVar.close();
                        return builderCreateBuilder;
                    }
                    com.google.android.gms.dynamite.DynamiteModule dynamiteModuleA = defpackage.svb.a();
                    defpackage.sqs.aA(dynamiteModuleA);
                    java.lang.ClassLoader classLoader = dynamiteModuleA.c.getClassLoader();
                    defpackage.sqs.aA(classLoader);
                    org.chromium.net.ExperimentalCronetEngine.Builder builder = new org.chromium.net.ExperimentalCronetEngine.Builder(subclassNativeCronetEngine(classLoader).getConstructor(android.content.Context.class).newInstance(this.mContext));
                    svdVar.a();
                    svdVar.close();
                    return builder;
                } catch (java.lang.Throwable th) {
                    try {
                        svdVar.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.ReflectiveOperationException e) {
                throw new java.lang.RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            }
        } catch (defpackage.slg e2) {
            throw new java.lang.IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (defpackage.slh e3) {
            throw new java.lang.IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.net.PlayServicesCronetProvider) && this.mContext.equals(((com.google.android.gms.net.PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public java.lang.String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public java.lang.String getVersion() {
        java.lang.String str;
        com.google.android.gms.net.HttpEngineProviderSingleton httpEngineProviderSingleton = com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(this.mContext);
        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
            return httpEngineProviderSingleton.getHttpEngineProvider().getVersion();
        }
        tryToInstallCronetProvider();
        synchronized (defpackage.svb.a) {
            str = defpackage.svb.b;
        }
        return str;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{com.google.android.gms.net.PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        if (com.google.android.gms.net.HttpEngineProviderSingleton.getInstance(this.mContext).shouldUseHttpEngine()) {
            return true;
        }
        tryToInstallCronetProvider();
        return defpackage.svb.c();
    }
}
