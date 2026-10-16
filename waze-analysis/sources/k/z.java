package k;

import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class z extends h.a.g implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public static final y f50879a = new y();

    /* renamed from: b, reason: collision with root package name */
    private final k[] f50880b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f50881c;

    public /* synthetic */ z(k[] kVarArr, int[] iArr) {
        this.f50880b = kVarArr;
        this.f50881c = iArr;
    }

    public final int[] a() {
        return this.f50881c;
    }

    public final k[] b() {
        return this.f50880b;
    }

    @Override // h.a.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof k) {
            return super.contains((k) obj);
        }
        return false;
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return this.f50880b[i2];
    }

    @Override // h.a.g, h.a.a
    public final int getSize() {
        return this.f50880b.length;
    }

    @Override // h.a.g, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof k) {
            return super.indexOf((k) obj);
        }
        return -1;
    }

    @Override // h.a.g, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return super.lastIndexOf((k) obj);
        }
        return -1;
    }
}
