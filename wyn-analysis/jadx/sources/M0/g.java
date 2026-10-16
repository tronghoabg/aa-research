package M0;

import com.qonversion.android.sdk.internal.QonversionInternal;
import com.vungle.ads.internal.util.y;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.a f7248b;

    public /* synthetic */ g(tf.a aVar, int i5) {
        this.f7247a = i5;
        this.f7248b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7247a) {
            case 0:
                tf.a tmp0 = this.f7248b;
                AbstractC3340k.e(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 1:
                y.b(this.f7248b);
                break;
            case 2:
                QonversionInternal.postToMainThread$lambda$2(this.f7248b);
                break;
            default:
                tf.a tmp02 = this.f7248b;
                AbstractC3340k.e(tmp02, "$tmp0");
                tmp02.invoke();
                break;
        }
    }
}
