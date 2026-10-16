package Cd;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final /* synthetic */ class W implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2039a;

    public /* synthetic */ W(int i5) {
        this.f2039a = i5;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2039a) {
            case 0:
                g0 retryIf = (g0) obj;
                Gd.a response = (Gd.a) obj3;
                AbstractC3340k.e(retryIf, "$this$retryIf");
                AbstractC3340k.e((Fd.b) obj2, "<unused var>");
                AbstractC3340k.e(response, "response");
                int i5 = response.e().f6089a;
                return Boolean.valueOf(500 <= i5 && i5 < 600);
            default:
                String bundleId = (String) obj;
                String str = (String) obj2;
                String caller = (String) obj3;
                AbstractC3340k.e(bundleId, "bundleId");
                AbstractC3340k.e(caller, "caller");
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                String strConcat = "https://play.google.com/d?id=".concat(bundleId);
                if (str != null) {
                    strConcat = strConcat + "&referrer=" + str;
                }
                Uri uri = Uri.parse(strConcat);
                AbstractC3340k.d(uri, "parse(this)");
                intent.setData(uri);
                intent.putExtra("overlay", true);
                intent.putExtra("callerId", caller);
                return intent;
        }
    }
}
