package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public int f18970a;

    /* renamed from: b, reason: collision with root package name */
    public int f18971b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18972c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18973d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18974e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f18975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f18976g;

    public r0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f18976g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f18970a = -1;
        this.f18971b = Integer.MIN_VALUE;
        this.f18972c = false;
        this.f18973d = false;
        this.f18974e = false;
        int[] iArr = this.f18975f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
