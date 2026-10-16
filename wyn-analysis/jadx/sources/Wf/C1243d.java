package Wf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Wf.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1243d extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f15583a;

    /* renamed from: b, reason: collision with root package name */
    public int f15584b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f15583a, this.f15584b);
        AbstractC3340k.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        boolean[] zArr = this.f15583a;
        if (zArr.length < i5) {
            int length = zArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i5);
            AbstractC3340k.d(zArrCopyOf, "copyOf(...)");
            this.f15583a = zArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15584b;
    }
}
