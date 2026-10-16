package com.waze.sdk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35343a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f35344b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap f35345c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35346d;

    public bk(boolean z, Drawable drawable, Bitmap bitmap, String str) {
        this.f35343a = z;
        this.f35344b = drawable;
        this.f35345c = bitmap;
        this.f35346d = str;
    }

    public static /* synthetic */ bk e(bk bkVar, Bitmap bitmap) {
        return new bk(bkVar.f35343a, bkVar.f35344b, bitmap, bkVar.f35346d);
    }

    public final Bitmap a() {
        return this.f35345c;
    }

    public final Drawable b() {
        return this.f35344b;
    }

    public final String c() {
        return this.f35346d;
    }

    public final boolean d() {
        return this.f35343a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return this.f35343a == bkVar.f35343a && h.g.b.x.n(this.f35344b, bkVar.f35344b) && h.g.b.x.n(this.f35345c, bkVar.f35345c) && h.g.b.x.n(this.f35346d, bkVar.f35346d);
    }

    public final int hashCode() {
        Drawable drawable = this.f35344b;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        boolean z = this.f35343a;
        Bitmap bitmap = this.f35345c;
        int iHashCode2 = bitmap == null ? 0 : bitmap.hashCode();
        int iA = (a.a.a(z) * 31) + iHashCode;
        String str = this.f35346d;
        return (((iA * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TransportSdkButtonState(show=" + this.f35343a + ", icon=" + this.f35344b + ", bitmap=" + this.f35345c + ", packageName=" + this.f35346d + ")";
    }

    public bk() {
        this(null);
    }

    public /* synthetic */ bk(byte[] bArr) {
        this(false, null, null, null);
    }
}
