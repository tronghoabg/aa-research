package com.google.e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ap extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final ao f8213a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8214b;

    /* renamed from: c, reason: collision with root package name */
    private final an f8215c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.d.m.a.a.b f8216d;

    /* synthetic */ ap(ao aoVar, String str, an anVar, com.google.d.m.a.a.b bVar) {
        this.f8213a = aoVar;
        this.f8214b = str;
        this.f8215c = anVar;
        this.f8216d = bVar;
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8213a != ao.f8211b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return apVar.f8215c.equals(this.f8215c) && apVar.f8216d.equals(this.f8216d) && apVar.f8214b.equals(this.f8214b) && apVar.f8213a.equals(this.f8213a);
    }

    public final ao f() {
        return this.f8213a;
    }

    public final String g() {
        return this.f8214b;
    }

    public final com.google.d.m.a.a.b h() {
        return this.f8216d;
    }

    public final int hashCode() {
        return Objects.hash(ap.class, this.f8214b, this.f8215c, this.f8216d, this.f8213a);
    }

    public final String toString() {
        ao aoVar = this.f8213a;
        com.google.d.m.a.a.b bVar = this.f8216d;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f8214b + ", dekParsingStrategy: " + String.valueOf(this.f8215c) + ", dekParametersForNewKeys: " + String.valueOf(bVar) + ", variant: " + String.valueOf(aoVar) + ")";
    }
}
