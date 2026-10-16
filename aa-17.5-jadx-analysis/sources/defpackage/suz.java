package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class suz extends sla implements sle {
    public suz(Context context, byte[] bArr) {
        super(context, null, srb.a, sku.c, skz.a);
        sxo.b(context.getApplicationContext());
    }

    public static Bitmap b(Activity activity) {
        try {
            return c(activity.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public static Bitmap c(View view) {
        try {
            Picture picture = new Picture();
            Canvas canvasBeginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
            canvasBeginRecording.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight(), new Paint());
            view.draw(canvasBeginRecording);
            picture.endRecording();
            return Bitmap.createBitmap(picture, view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public final svz a() {
        snb snbVar = new snb();
        snbVar.a = new qpz(12);
        snbVar.c = 3901;
        return super.u(0, snbVar.a());
    }

    public final void d(final FeedbackOptions feedbackOptions, final Bundle bundle, final long j) {
        snb snbVar = new snb();
        snbVar.a = new smy() { // from class: src
            @Override // defpackage.smy
            public final void a(Object obj, Object obj2) {
                FeedbackOptions feedbackOptions2 = feedbackOptions;
                Bundle bundle2 = bundle;
                long j2 = j;
                srh srhVar = (srh) obj;
                try {
                    thg.o(bundle2);
                    thg.p(feedbackOptions2);
                    srj srjVar = (srj) srhVar.v();
                    Parcel parcelGh = srjVar.gh();
                    ijp.g(parcelGh, feedbackOptions2);
                    ijp.g(parcelGh, bundle2);
                    parcelGh.writeLong(j2);
                    srjVar.gj(5, parcelGh);
                    ((nok) obj2).e(null);
                } catch (Exception e) {
                    Log.e("gF_FeedbackClient", "Requesting to save the async feedback psbd failed!", e);
                    ((nok) obj2).d(new RemoteException("Internall Error: Failed to start feedback"));
                }
            }
        };
        snbVar.c = 6011;
        super.u(1, snbVar.a());
    }

    public final void e(Bundle bundle, long j) {
        snb snbVar = new snb();
        snbVar.a = new srd(bundle, j, 1);
        snbVar.c = 6010;
        super.u(1, snbVar.a());
    }

    public final svz f(FeedbackOptions feedbackOptions) {
        long jNanoTime = System.nanoTime();
        snb snbVar = new snb();
        snbVar.a = new srd(feedbackOptions, jNanoTime, 0);
        snbVar.c = 6005;
        return super.u(1, snbVar.a());
    }

    public final svz g() {
        snb snbVar = new snb();
        snbVar.a = new qpz(1);
        snbVar.c = 1520;
        return super.u(0, snbVar.a());
    }

    public suz(Context context, byte[] bArr, byte[] bArr2) {
        super(context, null, qoy.a, qoz.a, skz.a);
    }

    public suz(Context context) {
        super(context, null, sux.a, sku.c, skz.a);
    }
}
