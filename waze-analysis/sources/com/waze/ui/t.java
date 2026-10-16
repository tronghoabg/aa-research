package com.waze.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.waze.jn;
import com.waze.ui.af.ap;
import com.waze.ui.m.ar;
import com.waze.ui.m.dj;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class t implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f43400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43401b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f43402c;

    public /* synthetic */ t(Object obj, Object obj2, int i2) {
        this.f43402c = i2;
        this.f43400a = obj;
        this.f43401b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.waze.ui.j.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v39, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        boolean z = false;
        switch (this.f43402c) {
            case 0:
                ?? r0 = this.f43400a;
                int i2 = af.f41795a;
                aj.z(r0, null, null, new ad((f) this.f43401b, (h.c.e) null, 0), 3);
                return h.ab.f48028a;
            case 1:
                int i3 = com.waze.ui.b.n.f42077a;
                return new com.waze.ui.b.p((com.waze.ui.b.o) this.f43401b, false, false, this.f43400a);
            case 2:
                this.f43400a.invoke(this.f43401b);
                return h.ab.f48028a;
            case 3:
                this.f43401b.d();
                this.f43400a.invoke();
                return h.ab.f48028a;
            case 4:
                this.f43400a.invoke(((com.waze.ui.k.h) this.f43401b).c());
                return h.ab.f48028a;
            case 5:
                this.f43400a.invoke(((com.waze.ui.m.a) this.f43401b).c());
                return h.ab.f48028a;
            case 6:
                this.f43400a.invoke(((com.waze.ui.m.j) this.f43401b).a().b());
                return h.ab.f48028a;
            case 7:
                this.f43400a.invoke(((com.waze.ui.m.i) this.f43401b).b().b());
                return h.ab.f48028a;
            case 8:
                this.f43400a.invoke(((com.waze.ui.m.i) this.f43401b).a().b());
                return h.ab.f48028a;
            case 9:
                int i4 = dj.f42972a;
                this.f43400a.invoke(new ar((String) this.f43401b));
                return h.ab.f48028a;
            case 10:
                int i5 = dj.f42972a;
                this.f43400a.invoke(new ar((String) this.f43401b));
                return h.ab.f48028a;
            case 11:
                this.f43400a.invoke(this.f43401b);
                return h.ab.f48028a;
            case 12:
                this.f43400a.invoke(((com.waze.ui.o.v) this.f43401b).a());
                return h.ab.f48028a;
            case 13:
                this.f43400a.invoke(this.f43401b);
                return h.ab.f48028a;
            case 14:
                this.f43400a.invoke(this.f43401b);
                return h.ab.f48028a;
            case 15:
                if (((LazyListState) this.f43401b).getCanScrollForward() && ((com.waze.z.a.b.ab) this.f43400a).i() != com.waze.z.a.b.ad.f45734b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                ?? r02 = this.f43401b;
                int i6 = ap.f41852a;
                this.f43400a.invoke(com.waze.ui.af.g.f41887a);
                r02.setValue(Boolean.valueOf(false));
                return h.ab.f48028a;
            case 17:
                return ap.j(this.f43401b, this.f43400a);
            case 18:
                Object obj = this.f43401b;
                if (obj == null && (obj = this.f43400a) == null) {
                    obj = "";
                }
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            case 19:
                return com.waze.cf.c.l.o((com.waze.cf.c.l) this.f43400a, (jn) this.f43401b);
            default:
                return h.k.n.z((String) this.f43401b, kotlinx.b.a.e.f50910a, new kotlinx.b.a.q[0], new kotlinx.b.g((kotlinx.b.c.b) this.f43400a, 0));
        }
    }

    public /* synthetic */ t(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f43402c = i2;
        this.f43401b = obj;
        this.f43400a = obj2;
    }
}
