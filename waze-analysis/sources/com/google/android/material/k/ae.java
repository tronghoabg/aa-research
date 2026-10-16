package com.google.android.material.k;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.StateSet;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae implements o {

    /* renamed from: a, reason: collision with root package name */
    final int f6642a;

    /* renamed from: b, reason: collision with root package name */
    final r f6643b;

    /* renamed from: c, reason: collision with root package name */
    final int[][] f6644c;

    /* renamed from: d, reason: collision with root package name */
    final r[] f6645d;

    /* synthetic */ ae(ad adVar) {
        this.f6642a = adVar.f6638a;
        this.f6643b = adVar.f6639b;
        this.f6644c = adVar.f6640c;
        this.f6645d = adVar.f6641d;
    }

    public static ae f(Context context, TypedArray typedArray, int i2) {
        int resourceId = typedArray.getResourceId(i2, 0);
        byte[] bArr = null;
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new ad(context, resourceId, bArr).c();
        }
        return null;
    }

    private final int g(int[] iArr) {
        for (int i2 = 0; i2 < this.f6642a; i2++) {
            if (StateSet.stateSetMatches(this.f6644c[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.material.k.o
    public final r a() {
        return this.f6643b;
    }

    @Override // com.google.android.material.k.o
    public final r b(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(StateSet.WILD_CARD);
        }
        return this.f6645d[iG];
    }

    @Override // com.google.android.material.k.o
    public final r c(float f2) {
        return this.f6643b.c(f2);
    }

    @Override // com.google.android.material.k.o
    public final boolean d() {
        return this.f6642a > 1;
    }

    @Override // com.google.android.material.k.o
    public final r[] e() {
        return this.f6645d;
    }
}
