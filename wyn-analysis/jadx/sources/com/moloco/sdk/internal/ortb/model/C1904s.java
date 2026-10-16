package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.C1890d;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1904s {

    @NotNull
    public static final C1890d.b Companion = new C1890d.b();

    /* renamed from: a, reason: collision with root package name */
    public final String f28860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28861b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.s$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return T.f28746a;
        }
    }

    public /* synthetic */ C1904s(int i5, String str, String str2) {
        if ((i5 & 1) == 0) {
            this.f28860a = null;
        } else {
            this.f28860a = str;
        }
        if ((i5 & 2) == 0) {
            this.f28861b = null;
        } else {
            this.f28861b = str2;
        }
    }
}
