package com.bumptech.glide.load.a.b;

import android.content.Context;
import android.text.format.Formatter;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f3085a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3086b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3087c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3088d;

    l(j jVar) {
        this.f3087c = jVar.f3080a;
        int i2 = true != jVar.f3081b.isLowRamDevice() ? 4194304 : 2097152;
        this.f3088d = i2;
        int iRound = Math.round(r2.getMemoryClass() * 1048576 * (true != jVar.f3081b.isLowRamDevice() ? 0.4f : 0.33f));
        float fB = jVar.f3083d.b() * jVar.f3083d.a() * 4;
        int iRound2 = Math.round(jVar.f3082c * fB);
        int iRound3 = Math.round(fB + fB);
        int i3 = iRound - i2;
        int i4 = iRound3 + iRound2;
        if (i4 <= i3) {
            this.f3086b = iRound3;
            this.f3085a = iRound2;
        } else {
            float f2 = i3 / (jVar.f3082c + 2.0f);
            iRound3 = Math.round(f2 + f2);
            this.f3086b = iRound3;
            iRound2 = Math.round(f2 * jVar.f3082c);
            this.f3085a = iRound2;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String strD = d(iRound3);
            String strD2 = d(iRound2);
            String strD3 = d(i2);
            boolean z = i4 > iRound;
            Log.d("MemorySizeCalculator", "Calculation complete, Calculated memory cache size: " + strD + ", pool size: " + strD2 + ", byte array size: " + strD3 + ", memory class limited? " + z + ", max size: " + d(iRound) + ", memoryClass: " + jVar.f3081b.getMemoryClass() + ", isLowMemoryDevice: " + jVar.f3081b.isLowRamDevice());
        }
    }

    private final String d(int i2) {
        return Formatter.formatFileSize(this.f3087c, i2);
    }

    public final int a() {
        return this.f3088d;
    }

    public final int b() {
        return this.f3085a;
    }

    public final int c() {
        return this.f3086b;
    }
}
