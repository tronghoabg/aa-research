package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.C1910y;
import e0.C2465q;
import ef.C2537u;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class f0 {

    @NotNull
    public static final C1910y.b Companion = new C1910y.b();

    /* renamed from: h, reason: collision with root package name */
    public static final KSerializer[] f28800h = {null, null, X.Companion.serializer(), EnumC1897k.Companion.serializer(), null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28801a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28802b;

    /* renamed from: c, reason: collision with root package name */
    public final X f28803c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC1897k f28804d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28805e;

    /* renamed from: f, reason: collision with root package name */
    public final C2537u f28806f;

    /* renamed from: g, reason: collision with root package name */
    public final C2465q f28807g;

    public f0(int i5, boolean z2, C2537u c2537u, X x5, EnumC1897k enumC1897k, C2465q c2465q, C2537u c2537u2, C2465q c2465q2) {
        if (31 != (i5 & 31)) {
            AbstractC1240b0.k(i5, 31, e0.f28797b);
            throw null;
        }
        this.f28801a = z2;
        this.f28802b = c2537u.f34686a;
        this.f28803c = x5;
        this.f28804d = enumC1897k;
        this.f28805e = c2465q.f34382a;
        if ((i5 & 32) == 0) {
            this.f28806f = null;
        } else {
            this.f28806f = c2537u2;
        }
        if ((i5 & 64) == 0) {
            this.f28807g = null;
        } else {
            this.f28807g = c2465q2;
        }
    }

    public f0(long j8) {
        X x5 = X.f28753b;
        EnumC1897k enumC1897k = EnumC1897k.f28839b;
        this.f28801a = false;
        this.f28802b = 10;
        this.f28803c = x5;
        this.f28804d = enumC1897k;
        this.f28805e = j8;
        this.f28806f = null;
        this.f28807g = null;
    }
}
