package com.google.android.libraries.e.b.b;

import com.google.v.de;
import com.google.v.fi;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final fi f5848a;

    /* renamed from: b, reason: collision with root package name */
    private final de f5849b;

    a(fi fiVar, de deVar) {
        if (fiVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.f5848a = fiVar;
        if (deVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.f5849b = deVar;
    }

    @Override // com.google.android.libraries.e.b.b.b, com.google.android.libraries.e.b.m
    public final /* synthetic */ Object a() {
        return this.f5848a;
    }

    @Override // com.google.android.libraries.e.b.b.b
    public final de b() {
        return this.f5849b;
    }

    @Override // com.google.android.libraries.e.b.b.b
    public final fi c() {
        return this.f5848a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5848a.equals(bVar.c()) && this.f5849b.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f5848a.hashCode() ^ 1000003;
        return this.f5849b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        de deVar = this.f5849b;
        return "ProtoSerializer{defaultValue=" + this.f5848a.toString() + ", extensionRegistryLite=" + deVar.toString() + "}";
    }
}
