package com.google.android.libraries.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import defpackage.skk;
import defpackage.sqi;
import defpackage.ved;
import defpackage.vev;
import defpackage.vjb;

/* loaded from: classes3.dex */
public final class MapsApiSettings {
    public static final String a = "MapsApiSettings";

    private MapsApiSettings() {
    }

    public static void addInternalUsageAttributionId(Context context, String str) {
        try {
            MapsApiSettings$$ExternalSyntheticLambda0 mapsApiSettings$$ExternalSyntheticLambda0 = new MapsApiSettings$$ExternalSyntheticLambda0(context, str);
            if (vjb.a != null) {
                mapsApiSettings$$ExternalSyntheticLambda0.run(vjb.a);
            } else {
                vjb.b.add(mapsApiSettings$$ExternalSyntheticLambda0);
            }
        } catch (RemoteException e) {
            Log.e(a, "Failed to add internal usage attribution id.", e);
        }
    }

    public static void setAppCheckTokenProvider(Context context, MapsAppCheckTokenProvider mapsAppCheckTokenProvider) {
        try {
            ved vedVarA = vjb.a(context);
            new sqi(context);
            vedVarA.m(new vev(mapsAppCheckTokenProvider));
        } catch (RemoteException | skk e) {
            Log.e(a, "Failed to set AppCheck token provider.", e);
        }
    }
}
