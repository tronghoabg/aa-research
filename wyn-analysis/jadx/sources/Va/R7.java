package Va;

import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
public final class R7 implements View.OnAttachStateChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public static int f13644g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13645h = 1;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1126r8 f13646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1126r8 f13647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f13648c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1203x8 f13650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1214y7 f13651f;

    public R7(C1126r8 c1126r8, C1126r8 c1126r82, List list, boolean z2, C1203x8 c1203x8, C1214y7 c1214y7) {
        this.f13646a = c1126r8;
        this.f13647b = c1126r82;
        this.f13648c = list;
        this.f13649d = z2;
        this.f13650e = c1203x8;
        this.f13651f = c1214y7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r17.f13649d == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(Va.C1126r8 r18, android.view.View r19) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.R7.a(Va.r8, android.view.View):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        f13644g = (f13645h + 21) % 128;
        a(this.f13646a, view);
        f13644g = (f13645h + 79) % 128;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i5 = f13644g + 31;
        f13645h = i5 % 128;
        int i10 = i5 % 2;
        a(this.f13647b, view);
        if (i10 == 0) {
            throw null;
        }
    }
}
