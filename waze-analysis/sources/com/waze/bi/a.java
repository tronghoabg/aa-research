package com.waze.bi;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.waze.R;
import com.waze.search.v2.SearchV2Activity;
import com.waze.search.v2.af;
import com.waze.search.v2.ag;
import com.waze.search.v2.ah;
import com.waze.search.v2.ai;
import com.waze.search.v2.aj;
import com.waze.search.v2.as;
import com.waze.search.v2.av;
import com.waze.search.v2.be;
import com.waze.search.v2.ck;
import com.waze.search.v2.cu;
import com.waze.search.v2.df;
import com.waze.search.v2.di;
import com.waze.search.v2.fi;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16802a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f16803b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f16803b = i2;
        this.f16802a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v41, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v43, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v45, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v47, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v49, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v51, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v53, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v55, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v57, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v59, types: [com.waze.location.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v64, types: [com.waze.location.o, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        Bitmap bitmap$default;
        switch (this.f16803b) {
            case 0:
                return b.a((b) this.f16802a);
            case 1:
                Drawable drawable = ResourcesCompat.getDrawable(((SearchV2Activity) this.f16802a).getResources(), R.drawable.search_result_pin, null);
                if (drawable == null || (bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)) == null) {
                    return null;
                }
                return new com.waze.search.v2.g(bitmap$default, new Point(com.waze.shared_infra.i.h.r(22), com.waze.shared_infra.i.h.r(36)), 2);
            case 2:
                Bundle extras = ((SearchV2Activity) this.f16802a).getIntent().getExtras();
                return com.waze.ch.a.a.f.g(extras != null ? (di) extras.getParcelable("params_extra") : null);
            case 3:
                int i2 = SearchV2Activity.f36131f;
                Rect rect = (Rect) ((State) this.f16802a).getValue();
                return Float.valueOf(rect != null ? rect.getBottom() : 0.0f);
            case 4:
                int i3 = SearchV2Activity.f36131f;
                return (com.waze.search.v2.h) ((State) this.f16802a).getValue();
            case 5:
                int i4 = af.f36144a;
                return com.waze.ch.a.a.f.g(this.f16802a);
            case 6:
                ((ck) this.f16802a).i().aa(as.f36161a);
                return ab.f48028a;
            case 7:
                ((ck) this.f16802a).i().aa(av.f36164a);
                return ab.f48028a;
            case 8:
                ((ck) this.f16802a).i().aa(as.f36161a);
                return ab.f48028a;
            case 9:
                int i5 = cu.f36302a;
                this.f16802a.invoke(ai.f36148a);
                return ab.f48028a;
            case 10:
                int i6 = cu.f36302a;
                this.f16802a.invoke(av.f36164a);
                return ab.f48028a;
            case 11:
                int i7 = cu.f36302a;
                this.f16802a.invoke(ai.f36148a);
                return ab.f48028a;
            case 12:
                int i8 = cu.f36302a;
                this.f16802a.invoke(ag.f36146a);
                return ab.f48028a;
            case 13:
                int i9 = cu.f36302a;
                this.f16802a.invoke(new be(false));
                return ab.f48028a;
            case 14:
                int i10 = cu.f36302a;
                this.f16802a.invoke(aj.f36149a);
                return ab.f48028a;
            case 15:
                int i11 = cu.f36302a;
                this.f16802a.invoke(new be(true));
                return ab.f48028a;
            case 16:
                int i12 = cu.f36302a;
                this.f16802a.invoke(ah.f36147a);
                return ab.f48028a;
            case 17:
                int i13 = cu.f36302a;
                this.f16802a.invoke(ag.f36146a);
                return ab.f48028a;
            case 18:
                int i14 = df.f36355a;
                return this.f16802a.lastCoordinate();
            case 19:
                return fi.t((fi) this.f16802a);
            default:
                return this.f16802a.lastCoordinate();
        }
    }
}
