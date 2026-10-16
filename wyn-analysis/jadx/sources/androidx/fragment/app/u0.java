package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18552c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18554e;

    public u0(int i5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f18550a = i5;
        this.f18551b = arrayList;
        this.f18552c = arrayList2;
        this.f18553d = arrayList3;
        this.f18554e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i5 = 0; i5 < this.f18550a; i5++) {
            View view = (View) this.f18551b.get(i5);
            String str = (String) this.f18552c.get(i5);
            WeakHashMap weakHashMap = k1.S.f38779a;
            k1.J.m(view, str);
            k1.J.m((View) this.f18553d.get(i5), (String) this.f18554e.get(i5));
        }
    }
}
