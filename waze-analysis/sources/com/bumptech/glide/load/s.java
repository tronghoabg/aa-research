package com.bumptech.glide.load;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s implements o {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayMap f3513b = new com.bumptech.glide.g.d();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        int i2 = 0;
        while (true) {
            ArrayMap arrayMap = this.f3513b;
            if (i2 >= arrayMap.size()) {
                return;
            }
            ((r) arrayMap.keyAt(i2)).e(arrayMap.valueAt(i2), messageDigest);
            i2++;
        }
    }

    public final Object b(r rVar) {
        ArrayMap arrayMap = this.f3513b;
        return arrayMap.containsKey(rVar) ? arrayMap.get(rVar) : rVar.d();
    }

    public final void c(s sVar) {
        this.f3513b.putAll((SimpleArrayMap) sVar.f3513b);
    }

    public final void d(r rVar) {
        this.f3513b.remove(rVar);
    }

    public final void e(r rVar, Object obj) {
        this.f3513b.put(rVar, obj);
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f3513b.equals(((s) obj).f3513b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        return this.f3513b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f3513b.toString() + "}";
    }
}
