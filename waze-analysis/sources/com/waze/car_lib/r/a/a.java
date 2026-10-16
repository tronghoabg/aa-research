package com.waze.car_lib.r.a;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import com.waze.main_screen.p.a.b.a.ab;
import com.waze.map.b.bg;
import com.waze.map.b.cn;
import com.waze.map.b.cr;
import com.waze.map.g.t;
import com.waze.map.g.u;
import com.waze.search.v2.cu;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f20866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20869d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f20870e;

    public /* synthetic */ a(MutableIntState mutableIntState, h.g.a.p pVar, boolean z, Density density, int i2) {
        this.f20870e = i2;
        this.f20869d = mutableIntState;
        this.f20867b = pVar;
        this.f20866a = z;
        this.f20868c = density;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.MutableIntState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f20870e;
        if (i2 == 0) {
            int iIntValue = ((Integer) obj).intValue();
            return p.f(this.f20867b, (p) this.f20868c, (com.waze.c.d.m) this.f20869d, this.f20866a, iIntValue);
        }
        if (i2 == 1) {
            ?? r0 = this.f20869d;
            return ab.e((Ref) this.f20868c, (com.waze.ui.r.a.e.b.a) this.f20867b, this.f20866a, r0, (Context) obj);
        }
        if (i2 == 2) {
            x.f((bg) obj, "it");
            return new bg(null, (com.waze.destination_cell.b.e) (this.f20866a ? this.f20869d : this.f20868c), ((u) this.f20867b).a(), true, 1);
        }
        IntSize intSize = (IntSize) obj;
        boolean z = this.f20866a;
        int i3 = cu.f36302a;
        this.f20869d.setIntValue((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        this.f20867b.invoke(Boolean.valueOf(z), Dp.m11162boximpl(this.f20868c.mo2124toDpu2uoSUM((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
        return h.ab.f48028a;
    }

    public /* synthetic */ a(Ref ref, com.waze.ui.r.a.e.b.a aVar, boolean z, State state, int i2) {
        this.f20870e = i2;
        this.f20868c = ref;
        this.f20867b = aVar;
        this.f20866a = z;
        this.f20869d = state;
    }

    public /* synthetic */ a(List list, p pVar, com.waze.c.d.m mVar, boolean z, int i2) {
        this.f20870e = i2;
        this.f20867b = list;
        this.f20868c = pVar;
        this.f20869d = mVar;
        this.f20866a = z;
    }

    public /* synthetic */ a(boolean z, cn cnVar, cr crVar, t tVar, int i2) {
        this.f20870e = i2;
        this.f20866a = z;
        this.f20869d = cnVar;
        this.f20868c = crVar;
        this.f20867b = tVar;
    }
}
