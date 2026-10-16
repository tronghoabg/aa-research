package c8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import b8.C1519a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: c8.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1589m extends s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19774c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f19775d;

    public C1589m(ArrayList arrayList, Matrix matrix) {
        this.f19774c = arrayList;
        this.f19775d = matrix;
    }

    @Override // c8.s
    public final void a(Matrix matrix, C1519a c1519a, int i5, Canvas canvas) {
        Iterator it = this.f19774c.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(this.f19775d, c1519a, i5, canvas);
        }
    }
}
