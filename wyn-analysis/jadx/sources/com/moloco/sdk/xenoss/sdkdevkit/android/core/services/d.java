package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f32413a;

    /* renamed from: b, reason: collision with root package name */
    public final g f32414b;

    /* renamed from: c, reason: collision with root package name */
    public final h f32415c;

    public d(c cVar, g gVar, h hVar) {
        this.f32413a = cVar;
        this.f32414b = gVar;
        this.f32415c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f32413a == dVar.f32413a && AbstractC3340k.a(this.f32414b, dVar.f32414b) && AbstractC3340k.a(this.f32415c, dVar.f32415c);
    }

    public final int hashCode() {
        return this.f32415c.hashCode() + ((this.f32414b.hashCode() + (this.f32413a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Button(buttonType=" + this.f32413a + ", position=" + this.f32414b + ", size=" + this.f32415c + ')';
    }
}
