package com.waze.sdk;

import android.os.Binder;
import android.os.IInterface;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj extends com.google.android.a.b implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SdkService f35230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(SdkService sdkService) {
        super("com.waze.sdk.ISdkService");
        Objects.requireNonNull(sdkService);
        this.f35230a = sdkService;
    }

    private final String a() {
        return this.f35230a.getApplicationContext().getPackageManager().getNameForUid(Binder.getCallingUid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // com.google.android.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean dispatchTransaction(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r11 = 0
            r0 = 1
            if (r8 == r0) goto L43
            r9 = 2
            if (r8 == r9) goto L8
            return r11
        L8:
            java.lang.String r8 = r7.a()
            com.waze.sdk.au r9 = com.waze.sdk.SdkConfiguration.getAppConfig(r8)
            java.lang.String r1 = "com.spotify.music"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L27
            int r1 = com.waze.config.dj.f22618a
            com.waze.config.dj r1 = com.waze.ni.c()
            com.waze.config.b r2 = com.waze.config.ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_SPOTIFY_WITH_AUDIO_SDK
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto L27
            goto L3a
        L27:
            if (r9 != 0) goto L34
            com.waze.sdk.SdkService r7 = r7.f35230a
            android.content.Context r7 = r7.getApplicationContext()
            int r7 = com.waze.sdk.SdkConfiguration.getCachedPackageScope(r7, r8)
            goto L36
        L34:
            int r7 = r9.f35260c
        L36:
            boolean r11 = com.waze.sdk.SdkConfiguration.isAudioSupported(r7, r8)
        L3a:
            r10.writeNoException()
            int r7 = com.google.android.a.c.f3833a
            r10.writeInt(r11)
            goto L88
        L43:
            java.lang.String r4 = r9.readString()
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = com.google.android.a.c.a(r9, r8)
            r5 = r8
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable$Creator r8 = android.os.Messenger.CREATOR
            android.os.Parcelable r8 = com.google.android.a.c.a(r9, r8)
            r6 = r8
            android.os.Messenger r6 = (android.os.Messenger) r6
            r7.enforceNoDataAvail(r9)
            com.waze.sdk.SdkService r8 = r7.f35230a
            com.waze.sdk.bd r1 = com.waze.sdk.bd.d()
            android.content.res.Resources r2 = r8.getResources()
            r8.getPackageManager()
            java.lang.String r3 = r7.a()
            boolean r7 = r1.P(r2, r3, r4, r5, r6)
            if (r7 == 0) goto L78
            android.os.Messenger r7 = com.waze.sdk.SdkService.a(r8)
            goto L79
        L78:
            r7 = 0
        L79:
            r10.writeNoException()
            if (r7 != 0) goto L82
            r10.writeInt(r11)
            goto L88
        L82:
            r10.writeInt(r0)
            r7.writeToParcel(r10, r0)
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sdk.aj.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
