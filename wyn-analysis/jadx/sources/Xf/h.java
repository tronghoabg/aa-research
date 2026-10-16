package Xf;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16270a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16271b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16272c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16273d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16274e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16275f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16276g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16277h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16278i;

    /* renamed from: j, reason: collision with root package name */
    public final a f16279j;

    public h(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String prettyPrintIndent, String classDiscriminator, boolean z15, a classDiscriminatorMode) {
        AbstractC3340k.e(prettyPrintIndent, "prettyPrintIndent");
        AbstractC3340k.e(classDiscriminator, "classDiscriminator");
        AbstractC3340k.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f16270a = z2;
        this.f16271b = z10;
        this.f16272c = z11;
        this.f16273d = z12;
        this.f16274e = z13;
        this.f16275f = z14;
        this.f16276g = prettyPrintIndent;
        this.f16277h = classDiscriminator;
        this.f16278i = z15;
        this.f16279j = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f16270a + ", ignoreUnknownKeys=" + this.f16271b + ", isLenient=" + this.f16272c + ", allowStructuredMapKeys=" + this.f16273d + ", prettyPrint=" + this.f16274e + ", explicitNulls=" + this.f16275f + ", prettyPrintIndent='" + this.f16276g + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f16277h + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f16278i + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f16279j + ')';
    }
}
