package t0;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4056d extends AbstractC3343n implements tf.a {

    /* renamed from: j, reason: collision with root package name */
    public static final C4056d f45459j = new C4056d(0, 0);
    public static final C4056d k = new C4056d(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C4056d f45460l = new C4056d(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f45461i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4056d(int i5, int i10) {
        super(i5);
        this.f45461i = i10;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f45461i) {
            case 0:
                return new LinkedHashMap();
            case 1:
                return new t(false);
            default:
                throw new IllegalStateException("default value for sentinel shouldn't be read");
        }
    }
}
