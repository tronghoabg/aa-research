package com.waze.ifs.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class WazeRadioView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final LayoutInflater f24480a;

    public WazeRadioView(Context context) {
        super(context);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f24480a = layoutInflaterFrom;
        layoutInflaterFrom.inflate(R.layout.waze_radio, this);
        a();
    }

    private final void a() {
        int i2 = (int) (getContext().getResources().getDisplayMetrics().density * 3.0f);
        setPadding(i2, i2, i2, i2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return false;
    }

    public WazeRadioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f24480a = layoutInflaterFrom;
        layoutInflaterFrom.inflate(R.layout.waze_radio, this);
        a();
    }
}
