package com.waze.design_components.e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.FrameLayout;
import com.waze.R;
import com.waze.design_components.text_view.WazeTextView;
import h.a.r;
import h.g.b.x;
import h.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, b bVar, a aVar) {
        super(context, null);
        x.f(context, "context");
        x.f(bVar, "pinAlignment");
        x.f(aVar, "labelData");
        FrameLayout.inflate(context, R.layout.cavnas_label, this);
        k kVar = new k(b.f23456a, Integer.valueOf(R.id.pin_top_right));
        int i2 = 1;
        b bVar2 = b.f23458c;
        b bVar3 = b.f23457b;
        Map mapK = r.k(new k(b.f23459d, Integer.valueOf(R.id.pin_top_left)), kVar, new k(bVar2, Integer.valueOf(R.id.pin_bottom_left)), new k(bVar3, Integer.valueOf(R.id.pin_bottom_right)));
        Iterator it = mapK.entrySet().iterator();
        while (true) {
            int i3 = 8;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            b bVar4 = (b) entry.getKey();
            View viewFindViewById = findViewById(((Number) entry.getValue()).intValue());
            if (bVar == bVar4) {
                i3 = 0;
            }
            viewFindViewById.setVisibility(i3);
        }
        if (bVar == bVar2 || bVar == bVar3) {
            findViewById(R.id.bottom_spacing).setVisibility(0);
            findViewById(R.id.top_spacing).setVisibility(8);
        } else {
            findViewById(R.id.top_spacing).setVisibility(0);
            findViewById(R.id.bottom_spacing).setVisibility(8);
        }
        Integer[] numArr = {Integer.valueOf(R.id.background)};
        Collection collectionValues = mapK.values();
        x.f(numArr, "<this>");
        x.f(collectionValues, "elements");
        Object[] objArrCopyOf = Arrays.copyOf(numArr, collectionValues.size() + 1);
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            objArrCopyOf[i2] = it2.next();
            i2++;
        }
        x.c(objArrCopyOf);
        for (Integer num : (Integer[]) objArrCopyOf) {
            ((AppCompatImageView) findViewById(num.intValue())).setImageTintList(ColorStateList.valueOf(aVar.a()));
        }
        WazeTextView wazeTextView = (WazeTextView) findViewById(R.id.title);
        wazeTextView.setTextColor(aVar.b());
        wazeTextView.setText(aVar.g());
        WazeTextView wazeTextView2 = (WazeTextView) findViewById(R.id.subtitle);
        String strF = aVar.f();
        if (strF == null || strF.length() == 0 || aVar.e() == null) {
            wazeTextView2.setVisibility(8);
        } else {
            wazeTextView2.setVisibility(0);
            wazeTextView2.setTextColor(aVar.e().intValue());
            wazeTextView2.setText(aVar.f());
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.image);
        if (aVar.c() != null) {
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageDrawable(aVar.c());
        } else {
            appCompatImageView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(R.id.secondaryImage);
        if (aVar.d() == null) {
            appCompatImageView2.setVisibility(8);
        } else {
            appCompatImageView2.setVisibility(0);
            appCompatImageView2.setImageDrawable(aVar.d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, null);
        x.f(context, "context");
        FrameLayout.inflate(context, R.layout.search_result_number_icon_view, this);
    }
}
