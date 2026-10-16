package com.google.k.a.a.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ck implements com.google.v.eg {

    /* renamed from: a, reason: collision with root package name */
    public static final ck f11210a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ ck[] f11211b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11212c = 17;

    static {
        ck ckVar = new ck();
        f11210a = ckVar;
        f11211b = new ck[]{ckVar};
    }

    private ck() {
    }

    public static ck a(int i2) {
        if (i2 != 17) {
            return null;
        }
        return f11210a;
    }

    public static ck[] values() {
        return (ck[]) f11211b.clone();
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11212c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11212c);
    }
}
