package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.C1895i;
import e0.C2465q;
import ef.C2537u;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class A {

    @NotNull
    public static final C1895i.b Companion = new C1895i.b();

    /* renamed from: h, reason: collision with root package name */
    public static final KSerializer[] f28681h = {null, null, null, X.Companion.serializer(), EnumC1897k.Companion.serializer(), null, null};

    /* renamed from: a, reason: collision with root package name */
    public final String f28682a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28684c;

    /* renamed from: d, reason: collision with root package name */
    public final X f28685d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1897k f28686e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28687f;

    /* renamed from: g, reason: collision with root package name */
    public final C2465q f28688g;

    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1887a.f28768a;
        }
    }

    public A(int i5, String str, String str2, C2537u c2537u, X x5, EnumC1897k enumC1897k, C2465q c2465q, C2465q c2465q2) {
        if (61 != (i5 & 61)) {
            AbstractC1240b0.k(i5, 61, C1911z.f28882b);
            throw null;
        }
        this.f28682a = str;
        if ((i5 & 2) == 0) {
            this.f28683b = null;
        } else {
            this.f28683b = str2;
        }
        this.f28684c = c2537u.f34686a;
        this.f28685d = x5;
        this.f28686e = enumC1897k;
        this.f28687f = c2465q.f34382a;
        if ((i5 & 64) == 0) {
            this.f28688g = null;
        } else {
            this.f28688g = c2465q2;
        }
    }
}
