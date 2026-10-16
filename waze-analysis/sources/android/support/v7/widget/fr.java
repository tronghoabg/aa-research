package android.support.v7.widget;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fr {

    /* renamed from: a, reason: collision with root package name */
    int f1501a;

    /* renamed from: b, reason: collision with root package name */
    int f1502b;

    /* renamed from: c, reason: collision with root package name */
    boolean f1503c;

    /* renamed from: d, reason: collision with root package name */
    boolean f1504d;

    /* renamed from: e, reason: collision with root package name */
    boolean f1505e;

    /* renamed from: f, reason: collision with root package name */
    int[] f1506f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ StaggeredGridLayoutManager f1507g;

    fr(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f1507g = staggeredGridLayoutManager;
        a();
    }

    final void a() {
        this.f1501a = -1;
        this.f1502b = Integer.MIN_VALUE;
        this.f1503c = false;
        this.f1504d = false;
        this.f1505e = false;
        int[] iArr = this.f1506f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
