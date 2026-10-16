package com.google.n.a.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c implements eh {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f12485a;

    c(int i2) {
        this.f12485a = i2;
    }

    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        if (this.f12485a != 0) {
            if (i2 == 0) {
                return a.ENDPOINT_UNSPECIFIED;
            }
            if (i2 == 1) {
                return a.STUBBY;
            }
            if (i2 == 2) {
                return a.MOBILE;
            }
            if (i2 != 3) {
                return null;
            }
            return a.NON_GOOGLE_PROD;
        }
        switch (i2) {
            case 0:
                return d.PLATFORM_UNSPECIFIED;
            case 1:
                return d.TEST_PLATFORM;
            case 2:
                return d.SERVER;
            case 3:
                return d.ANDROID;
            case 4:
                return d.IOS;
            case 5:
                return d.KAIOS;
            case 6:
                return d.CHROME_OS;
            case 7:
                return d.DESKTOP_CLIENT;
            case 8:
                return d.WEB_CLIENT;
            case 9:
                return d.EXTERNAL_SERVER;
            default:
                return null;
        }
    }
}
