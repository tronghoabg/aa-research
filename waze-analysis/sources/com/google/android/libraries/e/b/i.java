package com.google.android.libraries.e.b;

import android.net.Uri;
import com.google.d.b.aa;
import com.google.d.d.bn;
import com.google.v.fi;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f5869a;

    /* renamed from: b, reason: collision with root package name */
    private final fi f5870b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f5871c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f5872d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5873e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.libraries.b.c f5874f;

    /* synthetic */ i(Uri uri, fi fiVar, aa aaVar, bn bnVar, com.google.android.libraries.b.c cVar, boolean z) {
        this.f5869a = uri;
        this.f5870b = fiVar;
        this.f5871c = aaVar;
        this.f5872d = bnVar;
        this.f5874f = cVar;
        this.f5873e = z;
    }

    public static h a() {
        h hVar = new h();
        hVar.g(n.e());
        hVar.b();
        hVar.e();
        return hVar;
    }

    public final Uri b() {
        return this.f5869a;
    }

    public final aa c() {
        return this.f5871c;
    }

    public final bn d() {
        return this.f5872d;
    }

    public final fi e() {
        return this.f5870b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f5869a.equals(iVar.f5869a) && this.f5870b.equals(iVar.f5870b) && this.f5871c.equals(iVar.f5871c) && this.f5872d.equals(iVar.f5872d) && this.f5874f.equals(iVar.f5874f) && this.f5873e == iVar.f5873e) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f5873e;
    }

    public final com.google.android.libraries.b.c g() {
        return this.f5874f;
    }

    public final int hashCode() {
        return (((true != this.f5873e ? 1237 : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS) ^ ((((((((((this.f5869a.hashCode() ^ 1000003) * 1000003) ^ this.f5870b.hashCode()) * 1000003) ^ this.f5871c.hashCode()) * 1000003) ^ this.f5872d.hashCode()) * 1000003) ^ this.f5874f.hashCode()) * 1000003)) * 1000003) ^ DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER;
    }

    public final String toString() {
        com.google.android.libraries.b.c cVar = this.f5874f;
        bn bnVar = this.f5872d;
        aa aaVar = this.f5871c;
        fi fiVar = this.f5870b;
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.f5869a) + ", schema=" + String.valueOf(fiVar) + ", handler=" + String.valueOf(aaVar) + ", migrations=" + String.valueOf(bnVar) + ", variantConfig=" + String.valueOf(cVar) + ", useGeneratedExtensionRegistry=" + this.f5873e + ", enableTracing=false}";
    }

    i() {
        throw null;
    }
}
