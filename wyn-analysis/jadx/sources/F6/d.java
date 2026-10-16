package F6;

import G6.L;
import android.app.Activity;
import android.os.Bundle;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class d extends l {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f3952y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Activity activity, int i5) {
        super(activity);
        this.f3952y = i5;
    }

    @Override // F6.l, com.google.android.gms.internal.ads.zzbzi
    public void zzh(Bundle bundle) throws JSONException, h {
        switch (this.f3952y) {
            case 4:
                L.k("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f3992w = 4;
                this.f3971a.finish();
                break;
            default:
                super.zzh(bundle);
                break;
        }
    }
}
