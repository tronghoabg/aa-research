package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.C1898l;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class F {

    @NotNull
    public static final C1898l.b Companion = new C1898l.b();

    /* renamed from: a, reason: collision with root package name */
    public final String f28704a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28705b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28706c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28707d;

    /* renamed from: e, reason: collision with root package name */
    public final S f28708e;

    /* renamed from: f, reason: collision with root package name */
    public final N f28709f;

    /* renamed from: g, reason: collision with root package name */
    public final H f28710g;

    /* renamed from: h, reason: collision with root package name */
    public final P f28711h;

    /* renamed from: i, reason: collision with root package name */
    public final J f28712i;

    public final class a {
        /* JADX WARN: Type inference failed for: r0v0, types: [ef.i, java.lang.Object] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) EnumC1897k.f28838a.getValue();
        }
    }

    public /* synthetic */ F(int i5, String str, String str2, String str3, String str4, S s10, N n10, H h10, P p10, J j8) {
        if ((i5 & 1) == 0) {
            this.f28704a = null;
        } else {
            this.f28704a = str;
        }
        if ((i5 & 2) == 0) {
            this.f28705b = null;
        } else {
            this.f28705b = str2;
        }
        if ((i5 & 4) == 0) {
            this.f28706c = null;
        } else {
            this.f28706c = str3;
        }
        if ((i5 & 8) == 0) {
            this.f28707d = null;
        } else {
            this.f28707d = str4;
        }
        if ((i5 & 16) == 0) {
            this.f28708e = null;
        } else {
            this.f28708e = s10;
        }
        if ((i5 & 32) == 0) {
            this.f28709f = null;
        } else {
            this.f28709f = n10;
        }
        if ((i5 & 64) == 0) {
            this.f28710g = null;
        } else {
            this.f28710g = h10;
        }
        if ((i5 & 128) == 0) {
            this.f28711h = null;
        } else {
            this.f28711h = p10;
        }
        if ((i5 & 256) == 0) {
            this.f28712i = null;
        } else {
            this.f28712i = j8;
        }
    }
}
