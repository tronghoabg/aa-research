package com.bytedance.sdk.component.oa.uef.oa;

import com.applovin.shadow.okio.Segment;

/* loaded from: classes.dex */
final class lw {
    lw ivm;
    boolean lw;
    boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    int f25062oa;
    final byte[] uef;
    lw xs;
    int yo;

    public lw() {
        this.uef = new byte[Segment.SIZE];
        this.lw = true;
        this.moa = false;
    }

    public final lw oa() {
        lw lwVar = this.ivm;
        lw lwVar2 = lwVar != this ? lwVar : null;
        lw lwVar3 = this.xs;
        if (lwVar3 != null) {
            lwVar3.ivm = lwVar;
        }
        lw lwVar4 = this.ivm;
        if (lwVar4 != null) {
            lwVar4.xs = lwVar3;
        }
        this.ivm = null;
        this.xs = null;
        return lwVar2;
    }

    public final lw uef() {
        this.moa = true;
        return new lw(this.uef, this.f25062oa, this.yo, true, false);
    }

    public final lw uef(lw lwVar) {
        lwVar.xs = this;
        lwVar.ivm = this.ivm;
        this.ivm.xs = lwVar;
        this.ivm = lwVar;
        return lwVar;
    }

    public lw(byte[] bArr, int i5, int i10, boolean z2, boolean z10) {
        this.uef = bArr;
        this.f25062oa = i5;
        this.yo = i10;
        this.moa = z2;
        this.lw = z10;
    }
}
