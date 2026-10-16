package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1241c;
import com.moloco.sdk.internal.ortb.model.C;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1892f {

    @NotNull
    public static final C.b Companion = new C.b();

    /* renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f28798b = {new C1241c(C1905t.f28862a, 0)};

    /* renamed from: a, reason: collision with root package name */
    public final List f28799a;

    /* renamed from: com.moloco.sdk.internal.ortb.model.f$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1907v.f28870a;
        }
    }

    public C1892f(int i5, List list) {
        if (1 == (i5 & 1)) {
            this.f28799a = list;
        } else {
            AbstractC1240b0.k(i5, 1, C1891e.f28795b);
            throw null;
        }
    }

    public C1892f(ArrayList arrayList) {
        this.f28799a = arrayList;
    }
}
