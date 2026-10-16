package K;

import N.C0718d;
import N.C0725g0;
import N.C0740o;
import ef.C2515C;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class w extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.d f6300j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6301l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(V.d dVar, Object obj, int i5) {
        super(2);
        this.f6299i = 2;
        this.f6300j = dVar;
        this.f6301l = obj;
        this.k = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6299i) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0740o.x()) {
                    c0740o.I();
                } else {
                    I.a(((L) this.f6301l).f6211i, V.e.b(c0740o, 181426554, new v(this.f6300j, this.k, 0)), c0740o, 48);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                C0725g0[] c0725g0Arr = (C0725g0[]) this.f6301l;
                C0725g0[] c0725g0Arr2 = (C0725g0[]) Arrays.copyOf(c0725g0Arr, c0725g0Arr.length);
                int iQ = C0718d.Q(this.k | 1);
                C0718d.a(c0725g0Arr2, this.f6300j, (C0740o) obj, iQ);
                break;
            default:
                ((Number) obj2).intValue();
                int iQ2 = C0718d.Q(this.k) | 1;
                this.f6300j.c(this.f6301l, (C0740o) obj, iQ2);
                break;
        }
        return C2515C.f34653a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, V.d dVar, int i5, int i10) {
        super(2);
        this.f6299i = i10;
        this.f6301l = obj;
        this.f6300j = dVar;
        this.k = i5;
    }
}
