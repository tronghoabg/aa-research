package v9;

import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import java.util.BitSet;
import md.AbstractC3556y;
import md.C3542j;
import md.W;
import md.Y;
import md.b0;
import n9.C3607b;
import n9.C3609d;

/* loaded from: classes4.dex */
public final class i extends AbstractC3556y {

    /* renamed from: c, reason: collision with root package name */
    public static final W f47075c;

    /* renamed from: d, reason: collision with root package name */
    public static final W f47076d;

    /* renamed from: a, reason: collision with root package name */
    public final C3609d f47077a;

    /* renamed from: b, reason: collision with root package name */
    public final C3607b f47078b;

    static {
        C3542j c3542j = b0.f40615d;
        BitSet bitSet = Y.f40606d;
        f47075c = new W(ApiHeadersProvider.AUTHORIZATION, c3542j);
        f47076d = new W("x-firebase-appcheck", c3542j);
    }

    public i(C3609d c3609d, C3607b c3607b) {
        this.f47077a = c3609d;
        this.f47078b = c3607b;
    }
}
