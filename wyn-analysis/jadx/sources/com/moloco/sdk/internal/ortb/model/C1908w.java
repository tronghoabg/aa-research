package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.C1892f;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1908w {

    @NotNull
    public static final C1892f.b Companion = new C1892f.b();

    /* renamed from: a, reason: collision with root package name */
    public final h0 f28872a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28873b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f28874c;

    /* renamed from: d, reason: collision with root package name */
    public final C1890d f28875d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f28876e;

    /* renamed from: com.moloco.sdk.internal.ortb.model.w$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return a0.f28770a;
        }
    }

    public /* synthetic */ C1908w(int i5, h0 h0Var, String str, d0 d0Var, C1890d c1890d, b0 b0Var) {
        if ((i5 & 1) == 0) {
            this.f28872a = null;
        } else {
            this.f28872a = h0Var;
        }
        if ((i5 & 2) == 0) {
            this.f28873b = null;
        } else {
            this.f28873b = str;
        }
        if ((i5 & 4) == 0) {
            this.f28874c = null;
        } else {
            this.f28874c = d0Var;
        }
        if ((i5 & 8) == 0) {
            this.f28875d = null;
        } else {
            this.f28875d = c1890d;
        }
        if ((i5 & 16) == 0) {
            this.f28876e = null;
        } else {
            this.f28876e = b0Var;
        }
    }
}
