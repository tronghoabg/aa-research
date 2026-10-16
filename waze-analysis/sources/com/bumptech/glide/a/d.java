package com.bumptech.glide.a;

import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    File[] f2709a;

    /* renamed from: b, reason: collision with root package name */
    File[] f2710b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f2711c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2712d;

    /* renamed from: e, reason: collision with root package name */
    private final long[] f2713e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2714f;

    /* renamed from: g, reason: collision with root package name */
    private c f2715g;

    /* synthetic */ d(f fVar, String str) {
        Objects.requireNonNull(fVar);
        this.f2711c = fVar;
        this.f2712d = str;
        this.f2713e = new long[fVar.f2726h];
        if (fVar.f2727i) {
            this.f2709a = new File[fVar.f2726h];
            this.f2710b = new File[fVar.f2726h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < fVar.f2726h; i2++) {
                sb.append(i2);
                this.f2709a[i2] = new File(fVar.f2720b, sb.toString());
                sb.append(".tmp");
                this.f2710b[i2] = new File(fVar.f2720b, sb.toString());
                sb.setLength(length);
            }
        }
    }

    static /* bridge */ /* synthetic */ void e(d dVar, String[] strArr) throws IOException {
        if (strArr.length != dVar.f2711c.f2726h) {
            throw k(strArr);
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            try {
                dVar.f2713e[i2] = Long.parseLong(strArr[i2]);
            } catch (NumberFormatException unused) {
                throw k(strArr);
            }
        }
    }

    private static final IOException k(String[] strArr) throws IOException {
        throw new IOException("unexpected journal line: ".concat(String.valueOf(Arrays.toString(strArr))));
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            long[] jArr = this.f2713e;
            if (i2 >= jArr.length) {
                return sb.toString();
            }
            long j2 = jArr[0];
            sb.append(' ');
            sb.append(j2);
            i2 = 1;
        }
    }

    public final File i() {
        File[] fileArr = this.f2709a;
        if (fileArr != null) {
            return fileArr[0];
        }
        return new File(this.f2711c.f2720b, String.valueOf(this.f2712d).concat(".0"));
    }

    public final File j() {
        File[] fileArr = this.f2710b;
        if (fileArr != null) {
            return fileArr[0];
        }
        return new File(this.f2711c.f2720b, String.valueOf(this.f2712d).concat(".0.tmp"));
    }
}
