package kd;

import android.webkit.JsResult;
import j$.util.Objects;

/* renamed from: kd.O, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C3304O implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f39595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JsResult f39596c;

    public /* synthetic */ C3304O(P p10, JsResult jsResult, int i5) {
        this.f39594a = i5;
        this.f39595b = p10;
        this.f39596c = jsResult;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C3300K c3300k = (C3300K) obj;
        switch (this.f39594a) {
            case 0:
                P p10 = this.f39595b;
                if (!c3300k.f39580d) {
                    boolean zEquals = Boolean.TRUE.equals(c3300k.f39578b);
                    JsResult jsResult = this.f39596c;
                    if (!zEquals) {
                        jsResult.cancel();
                        break;
                    } else {
                        jsResult.confirm();
                        break;
                    }
                } else {
                    C8.i iVar = p10.f39598b.f39663a;
                    Throwable th = c3300k.f39579c;
                    Objects.requireNonNull(th);
                    iVar.getClass();
                    C8.i.t(th);
                    break;
                }
            default:
                P p11 = this.f39595b;
                if (!c3300k.f39580d) {
                    this.f39596c.confirm();
                    break;
                } else {
                    C8.i iVar2 = p11.f39598b.f39663a;
                    Throwable th2 = c3300k.f39579c;
                    Objects.requireNonNull(th2);
                    iVar2.getClass();
                    C8.i.t(th2);
                    break;
                }
        }
        return null;
    }
}
