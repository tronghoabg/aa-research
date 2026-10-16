package com.google.d.l;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final h f7971a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ h[] f7972b;

    static {
        h hVar = new h();
        f7971a = hVar;
        f7972b = new h[]{hVar};
    }

    private h() {
    }

    public static h[] values() {
        return (h[]) f7972b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iD = j.d(bArr[i2]) - j.d(bArr2[i2]);
            if (iD != 0) {
                return iD;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
