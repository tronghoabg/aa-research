package com.waze.sharedui.g;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f38943a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f38944b;

    /* renamed from: c, reason: collision with root package name */
    private String f38945c;

    /* renamed from: d, reason: collision with root package name */
    private String f38946d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38947e;

    public e(i iVar) {
        Objects.requireNonNull(iVar);
        this.f38943a = iVar;
        this.f38947e = false;
    }

    public final void a() {
        this.f38945c = null;
        this.f38944b = null;
        this.f38947e = false;
    }

    public final void b(String str) {
        this.f38946d = str;
    }

    public final void c(String str) {
        this.f38945c = str;
        this.f38947e = true;
    }

    public final void d(String str, Drawable drawable) {
        this.f38944b = drawable;
        c(str);
        this.f38947e = true;
    }

    final boolean e() {
        return this.f38947e;
    }

    public final void f(String str) {
        this.f38944b = ContextCompat.getDrawable(this.f38943a.f38960c, R.drawable.list_icon_message);
        c(str);
        this.f38947e = true;
    }

    final void g(View view, b bVar, int i2) {
        Drawable drawable = this.f38944b;
        if (drawable != null) {
            drawable.setColorFilter(null);
            i.p(view, this.f38944b);
        } else {
            i.p(view, null);
        }
        i.o(view, R.id.bottomSheetItemLabel, this.f38945c);
        i.o(view, R.id.bottomSheetItemSubtitle, null);
        View viewFindViewById = view.findViewById(R.id.bottomSheetItem);
        viewFindViewById.setContentDescription(this.f38946d);
        viewFindViewById.setOnClickListener(new d(this, bVar, i2));
        int[] iArr = {R.id.bottomSheetItemImage, R.id.bottomSheetItemSubtitle, R.id.bottomSheetItemLabel};
        for (int i3 = 0; i3 < 3; i3++) {
            View viewFindViewById2 = view.findViewById(iArr[i3]);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setAlpha(1.0f);
            }
        }
    }
}
