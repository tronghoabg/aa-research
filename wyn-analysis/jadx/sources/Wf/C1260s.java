package Wf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Wf.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1260s extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f15632a;

    /* renamed from: b, reason: collision with root package name */
    public int f15633b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f15632a, this.f15633b);
        AbstractC3340k.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        double[] dArr = this.f15632a;
        if (dArr.length < i5) {
            int length = dArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i5);
            AbstractC3340k.d(dArrCopyOf, "copyOf(...)");
            this.f15632a = dArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15633b;
    }
}
