package defpackage;

import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes.dex */
public final class adxg extends adlk {
    static final boolean a;
    public static final /* synthetic */ int b = 0;

    static {
        Charset charset = adue.a;
        a = adjw.a("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    }

    @Override // defpackage.adky
    public final adli a(adla adlaVar) {
        return a ? new adxb(adlaVar) : new adxf(adlaVar);
    }

    @Override // defpackage.adlk
    public final admn b(Map map) {
        try {
            Boolean boolR = adqq.r(map, "shuffleAddressList");
            return new admn(a ? new adwx(boolR) : new adxd(boolR));
        } catch (RuntimeException e) {
            return new admn(adnq.m.d(e).e("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.adlk
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.adlk
    public final void d() {
    }

    @Override // defpackage.adlk
    public final void e() {
    }
}
