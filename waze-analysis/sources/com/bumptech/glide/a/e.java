package com.bumptech.glide.a;

import j$.util.Objects;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f2716a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2717b;

    /* renamed from: c, reason: collision with root package name */
    private final File[] f2718c;

    /* synthetic */ e(f fVar, String str, File[] fileArr) {
        Objects.requireNonNull(fVar);
        this.f2716a = fVar;
        this.f2717b = str;
        this.f2718c = fileArr;
    }

    public final File a() {
        File[] fileArr = this.f2718c;
        if (fileArr != null) {
            return fileArr[0];
        }
        return new File(this.f2716a.f2720b, this.f2717b.concat(".0"));
    }
}
