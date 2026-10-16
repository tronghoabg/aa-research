package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.C1888b;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1901o {

    @NotNull
    public static final C1888b.C0167b Companion = new C1888b.C0167b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28849a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28850b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28851c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f28852d;

    /* renamed from: com.moloco.sdk.internal.ortb.model.o$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return K.f28722a;
        }
    }

    public C1901o(int i5, boolean z2, String str, String str2, Boolean bool) {
        if (3 != (i5 & 3)) {
            AbstractC1240b0.k(i5, 3, C1900n.f28848b);
            throw null;
        }
        this.f28849a = z2;
        this.f28850b = str;
        if ((i5 & 4) == 0) {
            this.f28851c = null;
        } else {
            this.f28851c = str2;
        }
        if ((i5 & 8) == 0) {
            this.f28852d = Boolean.FALSE;
        } else {
            this.f28852d = bool;
        }
    }
}
