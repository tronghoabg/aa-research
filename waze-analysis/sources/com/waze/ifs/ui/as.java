package com.waze.ifs.ui;

import android.support.v7.widget.fe;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class as extends fe {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ at f24527a;

    /* renamed from: b, reason: collision with root package name */
    private final View f24528b;

    /* renamed from: c, reason: collision with root package name */
    private int f24529c;

    /* renamed from: d, reason: collision with root package name */
    private aq f24530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(at atVar, View view) {
        super(view);
        Objects.requireNonNull(atVar);
        this.f24527a = atVar;
        this.f24528b = view;
        view.setOnClickListener(new ar(this));
    }

    public final void b(int i2) {
        this.f24529c = i2;
        at atVar = this.f24527a;
        this.f24530d = (aq) atVar.f24539i.get(i2 % atVar.b());
        View view = this.f24528b;
        ((ImageView) view.findViewById(R.id.image)).setImageDrawable(this.f24530d.f24524c);
        ((ImageView) view.findViewById(R.id.selectedImage)).setImageDrawable(this.f24530d.f24525d);
        c(atVar.f24537g == this.f24529c % atVar.b() ? 1.0f : 0.0f);
        ((WazeTextView) view.findViewById(R.id.title)).setText(this.f24530d.f24522a);
    }

    public final void c(float f2) {
        com.waze.shared_infra.i.h.a("SetOpacity at:" + this.f24529c + " to:" + f2);
        at atVar = this.f24527a;
        float f3 = atVar.getContext().getResources().getDisplayMetrics().density;
        View view = this.f24528b;
        ImageView imageView = (ImageView) view.findViewById(R.id.selectedImage);
        if (f2 == 0.0f) {
            imageView.setVisibility(8);
            ViewCompat.setElevation(view.findViewById(R.id.card), f3);
        } else {
            imageView.setVisibility(0);
            imageView.setAlpha(f2);
            ViewCompat.setElevation(view.findViewById(R.id.card), (((true != atVar.f24538h ? 4 : 8) * f2) + 1.0f) * f3);
        }
    }
}
