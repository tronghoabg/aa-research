package com.waze;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class iw implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f24835a;

    public /* synthetic */ iw(int i2) {
        this.f24835a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f24835a) {
            case 5:
                int i2 = com.waze.l.s.f25119a;
                break;
            case 6:
                int i3 = com.waze.l.s.f25119a;
                break;
            case 7:
                int i4 = com.waze.l.s.f25119a;
                break;
            case 8:
                int i5 = com.waze.l.s.f25119a;
                break;
            case 9:
                int i6 = com.waze.l.s.f25119a;
                break;
            case 10:
                int i7 = com.waze.l.s.f25119a;
                break;
            case 11:
                int i8 = com.waze.l.s.f25119a;
                break;
            case 12:
                int i9 = com.waze.l.s.f25119a;
                break;
            case 13:
                int i10 = com.waze.l.s.f25119a;
                break;
            case 14:
                int i11 = com.waze.car_lib.z.f22053a;
                Boolean boolB = ConfigValues.CONFIG_VALUE_SIGNUP_AAOS_GUEST_SIGNUP_ENABLED.b();
                h.g.b.x.e(boolB, "getValue(...)");
                boolB.booleanValue();
                break;
            case 15:
                int i12 = com.waze.car_lib.z.f22053a;
                Boolean boolB2 = ConfigValues.CONFIG_VALUE_SIGNUP_AAOS_GUEST_SIGNUP_ENABLED.b();
                h.g.b.x.e(boolB2, "getValue(...)");
                boolB2.booleanValue();
                break;
            case 16:
                int i13 = com.waze.car_lib.z.f22053a;
                Boolean boolB3 = ConfigValues.CONFIG_VALUE_SIGNUP_AAOS_USERNAME_LOGIN_ENABLED.b();
                h.g.b.x.e(boolB3, "getValue(...)");
                boolB3.booleanValue();
                break;
            case 17:
                int i14 = com.waze.car_lib.z.f22053a;
                String strB = ConfigValues.CONFIG_VALUE_QR_LOGIN_FALLBACK_LINK.b();
                h.g.b.x.e(strB, "getValue(...)");
                break;
        }
        return h.ab.f48028a;
    }
}
