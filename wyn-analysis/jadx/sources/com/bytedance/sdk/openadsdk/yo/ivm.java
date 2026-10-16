package com.bytedance.sdk.openadsdk.yo;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.af;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ivm extends ScrollView {

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.ivm.lw f26198oa;
    private final zjm uef;

    public ivm(Context context, zjm zjmVar) {
        super(context);
        this.uef = zjmVar;
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        this.f26198oa = lwVar;
        lwVar.setOrientation(1);
        addView(lwVar, new FrameLayout.LayoutParams(-1, -2));
        if (zjmVar.bcc() == 0) {
            uef();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void oa(List<FilterWord> list) {
        this.f26198oa.removeAllViews();
        for (int i5 = 0; i5 < list.size(); i5++) {
            FilterWord filterWord = list.get(i5);
            if (filterWord != null) {
                this.f26198oa.addView(new xs(getContext(), filterWord, this.uef));
            }
            if (i5 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iOa = af.oa(getContext(), this.uef.cz() ? 16.0f : 8.0f);
                layoutParams.topMargin = iOa;
                layoutParams.bottomMargin = iOa;
                this.f26198oa.addView(new dj(getContext()), layoutParams);
            }
        }
    }

    private void uef() {
        if (this.uef.bcc() != 0) {
            return;
        }
        this.uef.uef(af.yo(getContext()), af.lw(getContext()));
    }

    private static List<FilterWord> yo(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i5 = 0;
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).hasSecondOptions()) {
                i10 = i11;
            }
        }
        if (i10 != -1 && i10 <= list.size()) {
            i5 = i10;
        }
        FilterWord filterWord = list.get(i5);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    public void uef(List<FilterWord> list) {
        List<FilterWord> listYo = yo(list);
        if (listYo == null) {
            return;
        }
        oa(listYo);
    }
}
