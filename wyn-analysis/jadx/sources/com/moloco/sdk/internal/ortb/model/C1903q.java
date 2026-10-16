package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.C1889c;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1903q {

    @NotNull
    public static final C1889c.b Companion = new C1889c.b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28855a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28856b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28857c;

    /* renamed from: com.moloco.sdk.internal.ortb.model.q$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return O.f28736a;
        }
    }

    public C1903q(String str, int i5, boolean z2, boolean z10) {
        if (1 != (i5 & 1)) {
            AbstractC1240b0.k(i5, 1, C1902p.f28854b);
            throw null;
        }
        this.f28855a = z2;
        if ((i5 & 2) == 0) {
            this.f28856b = true;
        } else {
            this.f28856b = z10;
        }
        if ((i5 & 4) == 0) {
            this.f28857c = null;
        } else {
            this.f28857c = str;
        }
    }

    public C1903q() {
        this.f28855a = false;
        this.f28856b = true;
        this.f28857c = null;
    }
}
