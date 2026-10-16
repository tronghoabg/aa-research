package t3;

import android.view.View;
import java.util.ArrayList;

/* renamed from: t3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4090j implements InterfaceC4095o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f45682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f45683b;

    public C4090j(View view, ArrayList arrayList) {
        this.f45682a = view;
        this.f45683b = arrayList;
    }

    @Override // t3.InterfaceC4095o
    public final void d(AbstractC4096p abstractC4096p) {
        abstractC4096p.w(this);
        this.f45682a.setVisibility(8);
        ArrayList arrayList = this.f45683b;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((View) arrayList.get(i5)).setVisibility(0);
        }
    }

    @Override // t3.InterfaceC4095o
    public final void e(AbstractC4096p abstractC4096p) {
        abstractC4096p.w(this);
        abstractC4096p.a(this);
    }

    @Override // t3.InterfaceC4095o
    public final void a() {
    }

    @Override // t3.InterfaceC4095o
    public final void b() {
    }

    @Override // t3.InterfaceC4095o
    public final void c() {
    }
}
