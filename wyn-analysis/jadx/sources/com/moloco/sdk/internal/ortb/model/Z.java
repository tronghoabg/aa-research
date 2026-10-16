package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.C1907v;
import e0.C2465q;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class Z {

    @NotNull
    public static final C1907v.b Companion = new C1907v.b();

    /* renamed from: a, reason: collision with root package name */
    public final String f28761a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f28762b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28763c;

    /* renamed from: d, reason: collision with root package name */
    public final C2465q f28764d;

    /* renamed from: e, reason: collision with root package name */
    public final C2465q f28765e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f28766f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f28767g;

    public /* synthetic */ Z(int i5, String str, Boolean bool, String str2, C2465q c2465q, C2465q c2465q2, Integer num, Integer num2) {
        if ((i5 & 1) == 0) {
            this.f28761a = null;
        } else {
            this.f28761a = str;
        }
        if ((i5 & 2) == 0) {
            this.f28762b = null;
        } else {
            this.f28762b = bool;
        }
        if ((i5 & 4) == 0) {
            this.f28763c = null;
        } else {
            this.f28763c = str2;
        }
        if ((i5 & 8) == 0) {
            this.f28764d = null;
        } else {
            this.f28764d = c2465q;
        }
        if ((i5 & 16) == 0) {
            this.f28765e = null;
        } else {
            this.f28765e = c2465q2;
        }
        if ((i5 & 32) == 0) {
            this.f28766f = null;
        } else {
            this.f28766f = num;
        }
        if ((i5 & 64) == 0) {
            this.f28767g = null;
        } else {
            this.f28767g = num2;
        }
    }
}
