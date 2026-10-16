package com.waze.stats;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class StatsContract$StatContainer {
    private long createdDateMillis;
    private long identifier;
    private byte[] statByteArray;
    private aa type;

    public StatsContract$StatContainer(long j2, byte[] bArr, long j3, aa aaVar) {
        h.g.b.x.f(bArr, "statByteArray");
        h.g.b.x.f(aaVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.identifier = j2;
        this.statByteArray = bArr;
        this.createdDateMillis = j3;
        this.type = aaVar;
    }

    public final long getCreatedDateMillis() {
        return this.createdDateMillis;
    }

    public final long getIdentifier() {
        return this.identifier;
    }

    public final byte[] getStatByteArray() {
        return this.statByteArray;
    }

    public final aa getType() {
        return this.type;
    }

    public final void setCreatedDateMillis(long j2) {
        this.createdDateMillis = j2;
    }

    public final void setIdentifier(long j2) {
        this.identifier = j2;
    }

    public final void setStatByteArray(byte[] bArr) {
        h.g.b.x.f(bArr, "<set-?>");
        this.statByteArray = bArr;
    }

    public final void setType(aa aaVar) {
        h.g.b.x.f(aaVar, "<set-?>");
        this.type = aaVar;
    }

    public /* synthetic */ StatsContract$StatContainer(long j2, byte[] bArr, long j3, aa aaVar, int i2, h.g.b.o oVar) {
        this(1 == (i2 & 1) ? 0L : j2, bArr, j3, aaVar);
    }
}
