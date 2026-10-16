package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lu extends lv {

    /* renamed from: a, reason: collision with root package name */
    private final int f25462a;

    public /* synthetic */ lu(byte[] bArr) {
        this.f25462a = 1;
    }

    @Override // com.waze.lv
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu)) {
            return false;
        }
        int i2 = ((lu) obj).f25462a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "Shutdown(id=1)";
    }

    public lu() {
        this(null);
    }
}
