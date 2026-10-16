package Wa;

import A7.W0;
import T3.r;
import android.os.Handler;
import android.os.Looper;
import g5.RunnableC2707d;
import kotlin.jvm.internal.AbstractC3340k;
import uc.InterfaceC4280q;

/* loaded from: classes4.dex */
public final class h implements InterfaceC4280q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15447a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f15448b;

    /* renamed from: c, reason: collision with root package name */
    public final tc.g f15449c;

    public h(tc.g gVar, int i5) {
        this.f15447a = i5;
        switch (i5) {
            case 1:
                this.f15448b = new Handler(Looper.getMainLooper());
                this.f15449c = gVar;
                break;
            case 2:
                this.f15448b = new Handler(Looper.getMainLooper());
                this.f15449c = gVar;
                break;
            default:
                this.f15449c = gVar;
                this.f15448b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // uc.InterfaceC4280q
    public final void a(Object obj) {
        switch (this.f15447a) {
            case 0:
                this.f15448b.post(new r(18, this, obj));
                break;
            case 1:
                this.f15448b.post(new com.applovin.impl.sdk.nativeAd.e(15, this, obj));
                break;
            default:
                this.f15448b.post(new L7.b(this, false, obj, 17));
                break;
        }
    }

    @Override // uc.InterfaceC4280q
    public final void b(String errorCode, String str, Object obj) {
        switch (this.f15447a) {
            case 0:
                AbstractC3340k.e(errorCode, "errorCode");
                this.f15448b.post(new Cb.a(this, errorCode, str, obj, 8));
                break;
            case 1:
                AbstractC3340k.e(errorCode, "errorCode");
                this.f15448b.post(new Cb.a(this, errorCode, str, obj, 22));
                break;
            default:
                this.f15448b.post(new W0((Object) this, errorCode, str, obj, 16));
                break;
        }
    }

    @Override // uc.InterfaceC4280q
    public final void c() {
        switch (this.f15447a) {
            case 0:
                this.f15448b.post(new C8.g(this, 21));
                break;
            case 1:
                this.f15448b.post(new com.applovin.adview.a(this, 23));
                break;
            default:
                this.f15448b.post(new RunnableC2707d(this, 0));
                break;
        }
    }
}
