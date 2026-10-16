package Wf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Wf.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1255m extends AbstractC1246e0 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f15615a;

    /* renamed from: b, reason: collision with root package name */
    public int f15616b;

    @Override // Wf.AbstractC1246e0
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f15615a, this.f15616b);
        AbstractC3340k.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // Wf.AbstractC1246e0
    public final void b(int i5) {
        char[] cArr = this.f15615a;
        if (cArr.length < i5) {
            int length = cArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i5);
            AbstractC3340k.d(cArrCopyOf, "copyOf(...)");
            this.f15615a = cArrCopyOf;
        }
    }

    @Override // Wf.AbstractC1246e0
    public final int d() {
        return this.f15616b;
    }
}
