package com.google.android.libraries.maps;

/* JADX INFO: loaded from: classes3.dex */
public final class MapsApiSettings {
    public static final java.lang.String a = "MapsApiSettings";

    private MapsApiSettings() {
    }

    public static void addInternalUsageAttributionId(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.libraries.maps.MapsApiSettings$$ExternalSyntheticLambda0 mapsApiSettings$$ExternalSyntheticLambda0 = new com.google.android.libraries.maps.MapsApiSettings$$ExternalSyntheticLambda0(context, str);
            if (defpackage.vjy.a != null) {
                mapsApiSettings$$ExternalSyntheticLambda0.run(defpackage.vjy.a);
            } else {
                defpackage.vjy.b.add(mapsApiSettings$$ExternalSyntheticLambda0);
            }
        } catch (android.os.RemoteException e) {
            android.util.Log.e(a, "Failed to add internal usage attribution id.", e);
        }
    }

    public static void setAppCheckTokenProvider(android.content.Context context, com.google.android.libraries.maps.MapsAppCheckTokenProvider mapsAppCheckTokenProvider) {
        try {
            defpackage.vfa vfaVarA = defpackage.vjy.a(context);
            new defpackage.srg(context);
            vfaVarA.m(new defpackage.vfs(mapsAppCheckTokenProvider));
        } catch (android.os.RemoteException | defpackage.slg e) {
            android.util.Log.e(a, "Failed to set AppCheck token provider.", e);
        }
    }
}
