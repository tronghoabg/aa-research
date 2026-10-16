package V1;

import C6.l;
import N1.D;
import U8.P0;
import W9.q;
import a2.s;
import android.graphics.Bitmap;
import ba.C1521a;
import com.applovin.impl.i5;
import com.applovin.impl.k3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.u3;
import com.applovin.impl.y2;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import flutter.overlay.window.flutter_overlay_window.OverlayService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import k2.C3146c;
import k2.n0;
import k8.InterfaceC3199h;
import l2.C3383h;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import q5.InterfaceC3871f;
import t.InterfaceC4035a;
import uc.InterfaceC4265b;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Q1.g, Continuation, InterfaceC3871f, InterfaceC3199h, L8.e, SuccessContinuation, b6.g, InterfaceC4265b, InterfaceC4035a, s3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12898a;

    public /* synthetic */ c(int i5) {
        this.f12898a = i5;
    }

    public static Bitmap b(int i5, byte[] bArr) throws c2.d {
        try {
            return Ba.c.o(i5, bArr);
        } catch (D e7) {
            throw new c2.d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i5 + ")", e7);
        } catch (IOException e10) {
            throw new c2.d(e10);
        }
    }

    @Override // com.applovin.impl.s3.b
    public Object a(Object obj) {
        return u3.a((Long) obj);
    }

    @Override // q5.InterfaceC3871f, k8.InterfaceC3199h
    public Object apply(Object obj) {
        switch (this.f12898a) {
            case 9:
                X9.e eVar = (X9.e) obj;
                eVar.getClass();
                b7.k kVar = q.f15363a;
                kVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    kVar.s(byteArrayOutputStream, eVar);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 10:
                return AbstractC3409K.n(Integer.valueOf(((C3383h) obj).f39903a));
            case 11:
                Y8.a.f16713b.getClass();
                return V8.a.f13166a.j((P0) obj).getBytes(Charset.forName("UTF-8"));
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return y2.b((i5) obj);
            case 15:
                s sVar = (s) obj;
                sVar.a();
                n0 n0Var = sVar.f17272I;
                return AbstractC3409K.j(AbstractC3437s.v(n0Var.f39129b, new C3146c(3)));
            case 20:
                return k3.a((i5) obj);
            case 21:
                return com.applovin.impl.sdk.ad.b.r((i5) obj);
            case 22:
                return com.applovin.impl.sdk.ad.b.m((i5) obj);
            case 23:
                return com.applovin.impl.sdk.ad.b.n((i5) obj);
            case 24:
                return com.applovin.impl.sdk.ad.b.l((i5) obj);
            case 25:
                return com.applovin.impl.sdk.ad.b.h((i5) obj);
            case 26:
                return com.applovin.impl.sdk.ad.b.q((i5) obj);
            case 27:
                return AppLovinNativeAdImpl.lambda$getCustomTabsSettings$1((i5) obj);
        }
    }

    @Override // uc.InterfaceC4265b
    public void e(Object obj, C1521a c1521a) {
        OverlayService overlayService = OverlayService.f35437q;
        S3.f.f10947f.m(obj, null);
    }

    @Override // Q1.g
    public void invoke(Object obj) {
        ((i) obj).getClass();
    }

    @Override // L8.e
    public Object o(l lVar) {
        Set setB = lVar.B(Y9.a.class);
        Y9.c cVar = Y9.c.f16736c;
        if (cVar == null) {
            synchronized (Y9.c.class) {
                try {
                    cVar = Y9.c.f16736c;
                    if (cVar == null) {
                        cVar = new Y9.c(0);
                        Y9.c.f16736c = cVar;
                    }
                } finally {
                }
            }
        }
        return new Y9.b(setB, cVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f12898a) {
            case 7:
                return Integer.valueOf(TTAdConstant.DEEPLINK_UNAVAILABLE_CODE);
            default:
                return -1;
        }
    }

    @Override // b6.g
    public boolean a(int i5, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f12898a) {
            case 13:
                break;
            default:
                break;
        }
        return Tasks.forResult(null);
    }
}
