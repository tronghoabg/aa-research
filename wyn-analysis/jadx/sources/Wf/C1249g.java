package Wf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Wf.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1249g extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15599a;

    /* renamed from: b, reason: collision with root package name */
    public int f15600b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f15599a, this.f15600b);
        AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        byte[] bArr = this.f15599a;
        if (bArr.length < i5) {
            int length = bArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
            AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
            this.f15599a = bArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15600b;
    }
}
