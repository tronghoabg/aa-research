package Wf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Wf.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1267z extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f15661a;

    /* renamed from: b, reason: collision with root package name */
    public int f15662b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f15661a, this.f15662b);
        AbstractC3340k.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        float[] fArr = this.f15661a;
        if (fArr.length < i5) {
            int length = fArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i5);
            AbstractC3340k.d(fArrCopyOf, "copyOf(...)");
            this.f15661a = fArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15662b;
    }
}
