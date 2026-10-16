package com.applovin.impl;

import com.applovin.impl.C1667u0;
import com.applovin.impl.s3;
import com.applovin.impl.t4;
import t.InterfaceC4035a;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements t4.b, InterfaceC4035a, C1667u0.c, s3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20776b;

    public /* synthetic */ G(Object obj, int i5) {
        this.f20775a = i5;
        this.f20776b = obj;
    }

    @Override // com.applovin.impl.s3.b
    public Object a(Object obj) {
        return u3.a((Long) this.f20776b, (Long) obj);
    }

    @Override // t.InterfaceC4035a
    public Object apply(Object obj) {
        switch (this.f20775a) {
            case 1:
                return ((p7) this.f20776b).s((i5) obj);
            default:
                return ((y2) this.f20776b).c((i5) obj);
        }
    }

    @Override // com.applovin.impl.C1667u0.c
    public void a(C1667u0.b bVar) {
        ((C1667u0) this.f20776b).a(bVar);
    }

    @Override // com.applovin.impl.t4.b
    public void a(boolean z2, Object obj, Object obj2) {
        switch (this.f20775a) {
            case 0:
                ((d6) this.f20776b).a(z2, (p2) obj, (Exception) obj2);
                break;
            case 1:
            default:
                ((w1) this.f20776b).a(z2, (Void) obj, (Void) obj2);
                break;
            case 2:
                t4.a((t4.a) this.f20776b, z2, obj, obj2);
                break;
            case 3:
                t4.a((Runnable) this.f20776b, z2, obj, obj2);
                break;
        }
    }
}
