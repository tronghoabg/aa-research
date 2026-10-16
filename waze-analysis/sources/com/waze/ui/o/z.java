package com.waze.ui.o;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class z implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43177c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f43178d;

    public /* synthetic */ z(Object obj, Object obj2, int i2, int i3) {
        this.f43178d = i3;
        this.f43176b = obj;
        this.f43177c = obj2;
        this.f43175a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f43178d == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f43175a;
            ?? r0 = this.f43177c;
            return aa.c((String) this.f43176b, r0, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f43175a;
        Object obj3 = this.f43177c;
        return aa.e((Drawable) this.f43176b, (Drawable) obj3, i3, (Composer) obj);
    }
}
