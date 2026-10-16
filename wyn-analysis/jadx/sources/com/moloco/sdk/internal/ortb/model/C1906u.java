package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.C1891e;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1906u {

    @NotNull
    public static final C1891e.b Companion = new C1891e.b();

    /* renamed from: a, reason: collision with root package name */
    public final String f28864a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28865b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28866c;

    /* renamed from: d, reason: collision with root package name */
    public final C1908w f28867d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28868e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28869f;

    /* renamed from: com.moloco.sdk.internal.ortb.model.u$a */
    public final class a {
        /* JADX WARN: Type inference failed for: r0v0, types: [ef.i, java.lang.Object] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) X.f28752a.getValue();
        }
    }

    public C1906u(int i5, String str, float f10, String str2, C1908w c1908w, String str3, String str4) {
        if (11 != (i5 & 11)) {
            AbstractC1240b0.k(i5, 11, C1905t.f28863b);
            throw null;
        }
        this.f28864a = str;
        this.f28865b = f10;
        if ((i5 & 4) == 0) {
            this.f28866c = null;
        } else {
            this.f28866c = str2;
        }
        this.f28867d = c1908w;
        if ((i5 & 16) == 0) {
            this.f28868e = null;
        } else {
            this.f28868e = str3;
        }
        if ((i5 & 32) == 0) {
            this.f28869f = null;
        } else {
            this.f28869f = str4;
        }
    }

    public C1906u(String str, float f10, String str2, C1908w ext, String str3, String str4) {
        AbstractC3340k.e(ext, "ext");
        this.f28864a = str;
        this.f28865b = f10;
        this.f28866c = str2;
        this.f28867d = ext;
        this.f28868e = str3;
        this.f28869f = str4;
    }
}
