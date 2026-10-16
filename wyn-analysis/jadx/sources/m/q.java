package M;

import android.content.Context;
import android.view.ViewGroup;
import com.wynauto.wyn.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f7201a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7202b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7203c;

    /* renamed from: d, reason: collision with root package name */
    public final S3.e f7204d;

    /* renamed from: e, reason: collision with root package name */
    public int f7205e;

    public q(Context context) {
        super(context);
        this.f7201a = 5;
        ArrayList arrayList = new ArrayList();
        this.f7202b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f7203c = arrayList2;
        this.f7204d = new S3.e(11);
        setClipChildren(false);
        r rVar = new r(context);
        addView(rVar);
        arrayList.add(rVar);
        arrayList2.add(rVar);
        this.f7205e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
    }
}
