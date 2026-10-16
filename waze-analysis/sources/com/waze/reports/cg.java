package com.waze.reports;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cg extends PagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cm f33775a;

    cg(cm cmVar) {
        Objects.requireNonNull(cmVar);
        this.f33775a = cmVar;
    }

    final int a(bx bxVar) {
        cm cmVar = this.f33775a;
        if (cmVar.f33787g.contains(bxVar)) {
            return cmVar.f33787g.indexOf(bxVar);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f33775a.f33787g.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return a((bx) ((View) obj).getTag());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        cg cgVar;
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_photo_pager_large_item, viewGroup, false);
        cm cmVar = this.f33775a;
        bx bxVar = (bx) cmVar.f33787g.get(i2);
        cm.m(cmVar, viewInflate, bxVar);
        View viewFindViewById = viewInflate.findViewById(R.id.placePhotoBackground);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.placePhoto);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = bxVar.f33745h;
        layoutParams.width = bxVar.f33744g;
        viewFindViewById.setLayoutParams(layoutParams);
        imageView.setOnClickListener(new cb(this));
        viewInflate.invalidate();
        Bitmap bitmap = bxVar.f33746i;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
            View viewFindViewById2 = viewInflate.findViewById(R.id.placePhotoByFrame);
            String str = bxVar.f33740c;
            if (str == null || str.isEmpty()) {
                viewFindViewById2.setVisibility(8);
            } else {
                viewFindViewById2.setVisibility(0);
            }
            cgVar = this;
        } else {
            imageView.setVisibility(8);
            cgVar = this;
            com.waze.utils.i.a().c(bxVar.f33738a, new cd(cgVar, bxVar, viewInflate, viewFindViewById, imageView));
        }
        viewInflate.setTag(bxVar);
        viewGroup.addView(viewInflate);
        WazeTextView wazeTextView = (WazeTextView) viewInflate.findViewById(R.id.placePhotoBy);
        View viewFindViewById3 = viewInflate.findViewById(R.id.placePhotoSep);
        TextView textView = (TextView) viewInflate.findViewById(R.id.placePhotoFlag);
        textView.setText(cmVar.f33790j.c(R.string.GALLERY_FLAG, new Object[0]));
        String strC = bxVar.f33740c;
        if (bxVar.f33743f) {
            strC = cmVar.f33790j.c(R.string.UPLOADING_DATA___, new Object[0]);
        } else if (strC != null && !strC.isEmpty()) {
            strC = String.format(cmVar.f33790j.c(R.string.PHOTO_BY_PS, new Object[0]), strC);
        }
        String str2 = bxVar.f33738a;
        boolean z = str2 != null && str2.startsWith("file");
        if (bxVar.f33742e || z) {
            if (true != z) {
                strC = "";
            }
            wazeTextView.setText(strC);
            cmVar.findViewById(R.id.placePhotoByFrame).setVisibility(true != z ? 0 : 8);
            viewFindViewById3.setVisibility(8);
            if (z) {
                textView.setVisibility(8);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(cmVar.x(R.drawable.places_delete_pic), (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setText(cmVar.f33790j.c(R.string.GALLERY_DELETE, new Object[0]));
                textView.setOnClickListener(new ce(cgVar, bxVar));
            }
        } else {
            textView.setOnClickListener(new cf(cgVar, bxVar));
            wazeTextView.setText(strC);
        }
        cmVar.findViewById(R.id.placeActionsFrame).setVisibility(true != cmVar.f33783c ? 8 : 0);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
