package Z7;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes4.dex */
public final class c extends Fe.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f17015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextPaint f17016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fe.b f17017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f17018e;

    public c(d dVar, Context context, TextPaint textPaint, Fe.b bVar) {
        this.f17018e = dVar;
        this.f17015b = context;
        this.f17016c = textPaint;
        this.f17017d = bVar;
    }

    @Override // Fe.b
    public final void K(int i5) {
        this.f17017d.K(i5);
    }

    @Override // Fe.b
    public final void L(Typeface typeface, boolean z2) {
        this.f17018e.g(this.f17015b, this.f17016c, typeface);
        this.f17017d.L(typeface, z2);
    }
}
