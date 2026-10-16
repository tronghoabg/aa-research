package android.support.v4.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f279a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f280b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f281c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f282d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ArrayList f283e;

    cp(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f279a = i2;
        this.f280b = arrayList;
        this.f281c = arrayList2;
        this.f282d = arrayList3;
        this.f283e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i2 = 0; i2 < this.f279a; i2++) {
            ViewCompat.setTransitionName((View) this.f280b.get(i2), (String) this.f281c.get(i2));
            ViewCompat.setTransitionName((View) this.f282d.get(i2), (String) this.f283e.get(i2));
        }
    }
}
