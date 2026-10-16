package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fs implements fg {

    /* renamed from: a, reason: collision with root package name */
    private final fi f12978a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12979b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f12980c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12981d;

    fs(fi fiVar, String str, Object[] objArr) {
        this.f12978a = fiVar;
        this.f12979b = str;
        this.f12980c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f12981d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f12981d = i2 | (cCharAt2 << i4);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    @Override // com.google.v.fg
    public final fi a() {
        return this.f12978a;
    }

    @Override // com.google.v.fg
    public final boolean b() {
        return (this.f12981d & 2) == 2;
    }

    @Override // com.google.v.fg
    public final int c() {
        int i2 = this.f12981d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }

    final String d() {
        return this.f12979b;
    }

    final Object[] e() {
        return this.f12980c;
    }
}
