package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.B;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* renamed from: com.moloco.sdk.internal.ortb.model.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1890d {

    @NotNull
    public static final B.b Companion = new B.b();

    /* renamed from: a, reason: collision with root package name */
    public final String f28782a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28783b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28784c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28785d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28786e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28787f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28788g;

    /* renamed from: h, reason: collision with root package name */
    public final String f28789h;

    /* renamed from: i, reason: collision with root package name */
    public final String f28790i;

    /* renamed from: j, reason: collision with root package name */
    public final String f28791j;

    /* renamed from: com.moloco.sdk.internal.ortb.model.d$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return r.f28858a;
        }
    }

    public /* synthetic */ C1890d(int i5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if ((i5 & 1) == 0) {
            this.f28782a = null;
        } else {
            this.f28782a = str;
        }
        if ((i5 & 2) == 0) {
            this.f28783b = null;
        } else {
            this.f28783b = str2;
        }
        if ((i5 & 4) == 0) {
            this.f28784c = null;
        } else {
            this.f28784c = str3;
        }
        if ((i5 & 8) == 0) {
            this.f28785d = null;
        } else {
            this.f28785d = str4;
        }
        if ((i5 & 16) == 0) {
            this.f28786e = null;
        } else {
            this.f28786e = str5;
        }
        if ((i5 & 32) == 0) {
            this.f28787f = null;
        } else {
            this.f28787f = str6;
        }
        if ((i5 & 64) == 0) {
            this.f28788g = null;
        } else {
            this.f28788g = str7;
        }
        if ((i5 & 128) == 0) {
            this.f28789h = null;
        } else {
            this.f28789h = str8;
        }
        if ((i5 & 256) == 0) {
            this.f28790i = null;
        } else {
            this.f28790i = str9;
        }
        if ((i5 & 512) == 0) {
            this.f28791j = null;
        } else {
            this.f28791j = str10;
        }
    }
}
