package m3;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3485c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f40341a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40342b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40343c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40344d;

    public C3485c(int i5, int i10, String str, String str2) {
        this.f40341a = i5;
        this.f40342b = i10;
        this.f40343c = str;
        this.f40344d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3485c other = (C3485c) obj;
        AbstractC3340k.e(other, "other");
        int i5 = this.f40341a - other.f40341a;
        return i5 == 0 ? this.f40342b - other.f40342b : i5;
    }
}
