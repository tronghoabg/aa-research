package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1241c;
import com.moloco.sdk.internal.ortb.model.C1893g;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1910y {

    @NotNull
    public static final C1893g.b Companion = new C1893g.b();

    /* renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f28879b = {new C1241c(C1891e.f28794a, 0)};

    /* renamed from: a, reason: collision with root package name */
    public final List f28880a;

    /* renamed from: com.moloco.sdk.internal.ortb.model.y$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return e0.f28796a;
        }
    }

    public C1910y(int i5, List list) {
        if (1 == (i5 & 1)) {
            this.f28880a = list;
        } else {
            AbstractC1240b0.k(i5, 1, C1909x.f28878b);
            throw null;
        }
    }

    public C1910y(ArrayList arrayList) {
        this.f28880a = arrayList;
    }
}
