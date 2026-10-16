package r0;

import com.applovin.sdk.AppLovinMediationProvider;
import kotlin.jvm.internal.C3338i;
import vf.AbstractC4345a;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3897b extends C3338i implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public static final C3897b f44290a = new C3897b(2, AbstractC4345a.class, AppLovinMediationProvider.MAX, "max(II)I", 1);

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
