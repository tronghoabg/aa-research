package com.bytedance.adsdk.ugeno.lw;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
interface uef {
    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<yo> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int oa(int i5, int i10, int i11);

    View oa(int i5);

    void setFlexLines(List<yo> list);

    int uef(int i5, int i10, int i11);

    int uef(View view);

    int uef(View view, int i5, int i10);

    View uef(int i5);

    void uef(View view, int i5, int i10, yo yoVar);

    void uef(yo yoVar);

    boolean uef();
}
