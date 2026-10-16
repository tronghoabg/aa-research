package com.waze.car_lib.r.d;

import com.waze.modules.c.ar;
import com.waze.sound.al;
import com.waze.sound.an;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21303a;

    public k(int i2) {
        this.f21303a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f21303a) {
            case 0:
                return h.b.a.a(Integer.valueOf(((j) obj).a()), Integer.valueOf(((j) obj2).a()));
            case 1:
                return h.b.a.a(Float.valueOf(((com.waze.av.d.i) obj).a()), Float.valueOf(((com.waze.av.d.i) obj2).a()));
            case 2:
                return h.b.a.a(Float.valueOf(((com.waze.av.d.i) obj).a()), Float.valueOf(((com.waze.av.d.i) obj2).a()));
            case 3:
                Integer numK = ((com.waze.av.d.k) obj).k();
                Integer numValueOf = Integer.valueOf(numK != null ? numK.intValue() : Integer.MAX_VALUE);
                Integer numK2 = ((com.waze.av.d.k) obj2).k();
                return h.b.a.a(numValueOf, Integer.valueOf(numK2 != null ? numK2.intValue() : Integer.MAX_VALUE));
            case 4:
                return h.b.a.a(Long.valueOf(((com.waze.av.d.c) obj).a()), Long.valueOf(((com.waze.av.d.c) obj2).a()));
            case 5:
                return h.b.a.a(Float.valueOf(((com.waze.av.d.f) obj).a()), Float.valueOf(((com.waze.av.d.f) obj2).a()));
            case 6:
                return h.b.a.a(Integer.valueOf(((al) obj2).a()), Integer.valueOf(((al) obj).a()));
            case 7:
                return h.b.a.a(Integer.valueOf(((an) obj2).a()), Integer.valueOf(((an) obj).a()));
            case 8:
                return h.b.a.a(Long.valueOf(((com.waze.av.b.y) ((h.k) obj2).a()).a()), Long.valueOf(((com.waze.av.b.y) ((h.k) obj).a()).a()));
            case 9:
                return h.b.a.a(Long.valueOf(((com.waze.av.b.c) ((h.k) obj).a()).b()), Long.valueOf(((com.waze.av.b.c) ((h.k) obj2).a()).b()));
            case 10:
                return h.b.a.a(Integer.valueOf(((com.waze.av.b.f) obj).c()), Integer.valueOf(((com.waze.av.b.f) obj2).c()));
            case 11:
                return h.b.a.a(Long.valueOf(((com.waze.av.b.y) ((h.k) obj2).a()).a()), Long.valueOf(((com.waze.av.b.y) ((h.k) obj).a()).a()));
            case 12:
                return h.b.a.a(Long.valueOf(((com.waze.av.b.c) ((h.k) obj).a()).b()), Long.valueOf(((com.waze.av.b.c) ((h.k) obj2).a()).b()));
            case 13:
                return h.b.a.a(((ar) obj).j(), ((ar) obj2).j());
            default:
                return h.b.a.a(((k.a.i) obj).i(), ((k.a.i) obj2).i());
        }
    }
}
