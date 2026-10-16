package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.wireless.deeplink.DeepLinkResolver;

/* loaded from: classes2.dex */
public final class ozg extends BroadcastReceiver {
    final /* synthetic */ DeepLinkResolver a;

    public ozg(DeepLinkResolver deepLinkResolver) {
        this.a = deepLinkResolver;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null) {
            String action = intent.getAction();
            action.getClass();
            if (action.equals("com.google.android.gms.car.PROJECTION_STARTED")) {
                DeepLinkResolver deepLinkResolver = this.a;
                deepLinkResolver.B(yxi.QR_CODE_HU_PAIRED);
                deepLinkResolver.finish();
                try {
                    deepLinkResolver.getApplicationContext().startActivity(new Intent().setAction("android.intent.action.MAIN").addCategory("android.intent.category.HOME").addFlags(268435456).addFlags(2097152));
                } catch (RuntimeException e) {
                    ((ype) ((ype) ((ype) DeepLinkResolver.n.g()).p(e)).ai((char) 6220)).u("Error starting regular home activity");
                }
            }
        }
    }
}
