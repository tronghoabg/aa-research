package io.flutter.view;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import io.flutter.embedding.engine.FlutterJNI;
import q.b1;

/* loaded from: classes5.dex */
public final class c extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Handler handler, int i5) {
        super(handler);
        this.f37191a = i5;
        this.f37192b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f37191a) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f37191a) {
            case 0:
                l lVar = (l) this.f37192b;
                if (!lVar.f37298u) {
                    if (Settings.Global.getFloat(lVar.f37284f, "transition_animation_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        lVar.f37289l |= 4;
                    } else {
                        lVar.f37289l &= -5;
                    }
                    ((FlutterJNI) lVar.f37280b.f40737b).setAccessibilityFeatures(lVar.f37289l);
                    break;
                }
                break;
            case 3:
                ((Gf.e) this.f37192b).c(C2515C.f34653a);
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b1 b1Var) {
        super(new Handler());
        this.f37191a = 2;
        this.f37192b = b1Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        Cursor cursor;
        switch (this.f37191a) {
            case 0:
                onChange(z2, null);
                break;
            case 1:
                super.onChange(z2);
                kc.r rVar = (kc.r) this.f37192b;
                if (rVar.f39521h != null) {
                    rVar.e();
                    break;
                }
                break;
            case 2:
                b1 b1Var = (b1) this.f37192b;
                if (b1Var.f43965b && (cursor = b1Var.f43966c) != null && !cursor.isClosed()) {
                    b1Var.f43964a = b1Var.f43966c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z2);
                break;
        }
    }
}
