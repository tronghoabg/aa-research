package com.waze.rtalerts;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.waze.R;
import com.waze.lm;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f35127a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageView f35128b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ImageView f35129c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l f35130d;

    j(l lVar, View view, ImageView imageView, ImageView imageView2) {
        this.f35127a = view;
        this.f35128b = imageView;
        this.f35129c = imageView2;
        Objects.requireNonNull(lVar);
        this.f35130d = lVar;
    }

    @Override // com.waze.utils.h
    public final void a(final Bitmap bitmap, Object obj) throws Resources.NotFoundException {
        float f2;
        float f3;
        float dimension = lm.d().e().getResources().getDimension(R.dimen.report_comments_image_size);
        int i2 = l.f35132b;
        float f4 = dimension - (i2 + i2);
        if (bitmap.getHeight() > bitmap.getWidth()) {
            float height = bitmap.getHeight() * f4;
            float width = bitmap.getWidth();
            int i3 = l.f35132b;
            int i4 = l.f35132b;
            f3 = f4 + i4 + i4;
            f2 = (height / width) + i3 + i3;
        } else {
            float height2 = bitmap.getHeight();
            int i5 = l.f35132b;
            int i6 = l.f35132b;
            float width2 = ((bitmap.getWidth() * f4) / height2) + i5 + i5;
            f2 = f4 + i6 + i6;
            f3 = width2;
        }
        final ImageView imageView = (ImageView) this.f35127a.findViewById(R.id.rtAlerterCommentsPhoto);
        imageView.setImageBitmap(bitmap);
        imageView.getLayoutParams().height = (int) f2;
        imageView.getLayoutParams().width = (int) f3;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.rtalerts.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.b(this.f35124a.f35130d, imageView, bitmap);
            }
        });
        imageView.setVisibility(0);
        this.f35128b.setVisibility(8);
        this.f35129c.setVisibility(8);
    }

    @Override // com.waze.utils.h
    public final void b() {
    }
}
