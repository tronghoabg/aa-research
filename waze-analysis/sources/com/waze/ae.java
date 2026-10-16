package com.waze;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ae extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f14038a;

    public ae(BoundService boundService) {
        this.f14038a = new WeakReference(boundService);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 5) {
            String str = AIDLService.f13531b;
            if (str == null || AIDLService.f13530a == null) {
                return;
            }
            if (!str.equals(BoundService.f13534a)) {
                WeakReference weakReference = this.f14038a;
                if (weakReference.get() != null) {
                    BoundService.n();
                }
                BoundService.f13542i = -1;
                BoundService.f13534a = AIDLService.f13531b;
            }
            BoundService.f13543j = AIDLService.f13530a;
            BoundService.f13540g = message.replyTo;
            BoundService.f13535b = (PendingIntent) message.getData().getParcelable("Intent");
            BoundService.f13536c = message.getData().getBoolean("HideIcon");
            BoundService.f13537d = message.getData().getBoolean("DisableRoutePreview");
            BoundService.f13538e = message.getData().getString("CarId");
            BoundService.f13539f = message.getData().getString("VehicleType");
            return;
        }
        switch (i2) {
            case 13:
                PendingIntent pendingIntent = BoundService.f13535b;
                if (pendingIntent != null && BoundService.f13542i >= 0) {
                    com.waze.sdk.bq.b(pendingIntent);
                    break;
                }
                break;
            case 14:
                WeakReference weakReference2 = this.f14038a;
                if (weakReference2.get() != null) {
                    Intent intent = new Intent();
                    intent.addFlags(268435456);
                    intent.setAction("android.intent.action.VIEW");
                    intent.setPackage(((BoundService) weakReference2.get()).getApplicationContext().getPackageName());
                    intent.setData(Uri.parse("waze://"));
                    intent.putExtra("waze.sdkReferrerPackage", BoundService.f13534a);
                    intent.putExtra("waze.sdkType", 1);
                    ((BoundService) weakReference2.get()).startActivity(intent);
                    break;
                }
                break;
            case 15:
                WeakReference weakReference3 = this.f14038a;
                if (weakReference3.get() != null) {
                    Intent intent2 = new Intent();
                    intent2.addFlags(268435456);
                    intent2.setPackage(((BoundService) weakReference3.get()).getApplicationContext().getPackageName());
                    intent2.setData((Uri) message.getData().getParcelable("Deeplink"));
                    intent2.putExtra("waze.sdkReferrerPackage", BoundService.f13534a);
                    intent2.putExtra("waze.sdkType", 1);
                    ((BoundService) weakReference3.get()).startActivity(intent2);
                    break;
                }
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
