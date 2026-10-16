package A7;

import Va.AbstractC1104pb;
import Va.C1126r8;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c0.C1542g;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2085c;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import x6.C4488s;
import x7.C4490b;

/* loaded from: classes4.dex */
public final /* synthetic */ class R0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ R0 f678b = new R0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f679a;

    public /* synthetic */ R0(int i5) {
        this.f679a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        t0.t tVar;
        t0.t tVar2;
        switch (this.f679a) {
            case 0:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 1:
                List list = C4488s.f47741f;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            case 2:
                zzv zzvVar = Ea.d.f3636a;
                return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
            case 3:
                I9.b bVar = (I9.b) obj;
                I9.b bVar2 = (I9.b) obj2;
                if (bVar.a() > bVar2.a()) {
                    return -1;
                }
                return bVar.a() < bVar2.a() ? 1 : 0;
            case 4:
                return ((O0.f) obj).f8787b - ((O0.f) obj2).f8787b;
            case 5:
                WeakHashMap weakHashMap = k1.S.f38779a;
                float fG = k1.J.g((View) obj);
                float fG2 = k1.J.g((View) obj2);
                if (fG > fG2) {
                    return -1;
                }
                return fG < fG2 ? 1 : 0;
            case 6:
                return AbstractC1104pb.b((String) obj, (String) obj2);
            case 7:
                return ((C1126r8) obj).a() - ((C1126r8) obj2).a();
            case 8:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 9:
                androidx.recyclerview.widget.r rVar = (androidx.recyclerview.widget.r) obj;
                androidx.recyclerview.widget.r rVar2 = (androidx.recyclerview.widget.r) obj2;
                RecyclerView recyclerView = rVar.f18968d;
                if ((recyclerView == null) == (rVar2.f18968d == null)) {
                    boolean z2 = rVar.f18965a;
                    if (z2 == rVar2.f18965a) {
                        int i5 = rVar2.f18966b - rVar.f18966b;
                        if (i5 != 0) {
                            return i5;
                        }
                        int i10 = rVar.f18967c - rVar2.f18967c;
                        if (i10 != 0) {
                            return i10;
                        }
                        return 0;
                    }
                    if (z2) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case 10:
                t0.y yVar = ((C1542g) obj).k;
                Integer numValueOf = null;
                Integer numValueOf2 = (yVar == null || (tVar2 = yVar.f45561e) == null) ? null : Integer.valueOf(tVar2.f45529t);
                t0.y yVar2 = ((C1542g) obj2).k;
                if (yVar2 != null && (tVar = yVar2.f45561e) != null) {
                    numValueOf = Integer.valueOf(tVar.f45529t);
                }
                return android.support.v4.media.session.b.W(numValueOf2, numValueOf);
            case 11:
                return android.support.v4.media.session.b.W(((C2085c) obj).f31475a, ((C2085c) obj2).f31475a);
            case 12:
                return android.support.v4.media.session.b.W(Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj).f32013b), Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj2).f32013b));
            case 13:
                return android.support.v4.media.session.b.W(Integer.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) obj).f32072b), Integer.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) obj2).f32072b));
            case 14:
                return android.support.v4.media.session.b.W(((dg.f) obj).f34302a, ((dg.f) obj2).f34302a);
            case 15:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 16:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                C4490b c4490b = (C4490b) obj;
                C4490b c4490b2 = (C4490b) obj2;
                AbstractC1732v.i(c4490b);
                AbstractC1732v.i(c4490b2);
                int i11 = c4490b.f47762a;
                int i12 = c4490b2.f47762a;
                if (i11 == i12) {
                    int i13 = c4490b.f47763b;
                    int i14 = c4490b2.f47763b;
                    if (i13 == i14) {
                        return 0;
                    }
                    if (i13 < i14) {
                        return -1;
                    }
                } else if (i11 < i12) {
                    return -1;
                }
                return 1;
        }
    }
}
