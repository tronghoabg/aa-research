package com.moloco.sdk.internal.ortb.model;

import android.graphics.Color;
import com.moloco.sdk.internal.ortb.model.EnumC1897k;
import e0.C2465q;
import ef.C2537u;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class D {

    @NotNull
    public static final EnumC1897k.b Companion = new EnumC1897k.b();

    /* renamed from: i, reason: collision with root package name */
    public static final KSerializer[] f28693i = {null, null, null, null, X.Companion.serializer(), EnumC1897k.Companion.serializer(), null, null};

    /* renamed from: a, reason: collision with root package name */
    public final String f28694a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28696c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f28697d;

    /* renamed from: e, reason: collision with root package name */
    public final X f28698e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC1897k f28699f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28700g;

    /* renamed from: h, reason: collision with root package name */
    public final long f28701h;

    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1893g.f28808a;
        }
    }

    public /* synthetic */ D(int i5, String str, boolean z2, C2537u c2537u, Integer num, X x5, EnumC1897k enumC1897k, C2465q c2465q, C2465q c2465q2) {
        if ((i5 & 1) == 0) {
            this.f28694a = null;
        } else {
            this.f28694a = str;
        }
        if ((i5 & 2) == 0) {
            this.f28695b = true;
        } else {
            this.f28695b = z2;
        }
        this.f28696c = (i5 & 4) == 0 ? 30 : c2537u.f34686a;
        if ((i5 & 8) == 0) {
            this.f28697d = null;
        } else {
            this.f28697d = num;
        }
        if ((i5 & 16) == 0) {
            this.f28698e = X.f28757f;
        } else {
            this.f28698e = x5;
        }
        if ((i5 & 32) == 0) {
            this.f28699f = EnumC1897k.f28839b;
        } else {
            this.f28699f = enumC1897k;
        }
        this.f28700g = (i5 & 64) == 0 ? e0.z.b(Color.parseColor("#FF4285f4")) : c2465q.f34382a;
        if ((i5 & 128) == 0) {
            this.f28701h = e0.z.b(Color.parseColor("#FFFFFFFF"));
        } else {
            this.f28701h = c2465q2.f34382a;
        }
    }
}
