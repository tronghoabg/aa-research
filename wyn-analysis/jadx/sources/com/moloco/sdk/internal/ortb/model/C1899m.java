package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.C1887a;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1899m {

    @NotNull
    public static final C1887a.b Companion = new C1887a.b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28845a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28846b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.m$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return G.f28713a;
        }
    }

    public C1899m(int i5, String str, boolean z2) {
        if (3 != (i5 & 3)) {
            AbstractC1240b0.k(i5, 3, C1898l.f28844b);
            throw null;
        }
        this.f28845a = z2;
        this.f28846b = str;
    }
}
