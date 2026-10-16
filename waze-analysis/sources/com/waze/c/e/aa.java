package com.waze.c.e;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.MuxerUtil;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f18486a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18487b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18488c;

    aa(al alVar, Density density, int i2) {
        this.f18488c = i2;
        this.f18487b = alVar;
        this.f18486a = density;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [h.g.a.p, java.lang.Object] */
    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int i2 = this.f18488c;
        if (i2 == 0) {
            h.g.b.x.f((String) obj, "it");
            ((al) this.f18486a).h(((com.waze.ui.b.bc) this.f18487b).i());
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            int iIntValue = ((Number) obj).intValue();
            return this.f18487b.invoke(Integer.valueOf(iIntValue), this.f18486a.get(iIntValue));
        }
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        h.g.b.x.f(layoutCoordinates, "coordinates");
        ((al) this.f18487b).b().setValue(Dp.m11162boximpl(this.f18486a.mo2124toDpu2uoSUM((int) (layoutCoordinates.mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
        return h.ab.f48028a;
    }

    aa(al alVar, com.waze.ui.b.bc bcVar, int i2) {
        this.f18488c = i2;
        this.f18486a = alVar;
        this.f18487b = bcVar;
    }

    public aa(h.g.a.p pVar, List list, int i2) {
        this.f18488c = i2;
        this.f18487b = pVar;
        this.f18486a = list;
    }
}
