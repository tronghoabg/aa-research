package com.waze.view.navbar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.sharedui.views.TypingWhileDrivingWarningBarView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends TypingWhileDrivingWarningBarView {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f45099a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Context context) {
        super(context, null, 0);
        Objects.requireNonNull(pVar);
        this.f45099a = pVar;
        setBackground(new ColorDrawable(ContextCompat.getColor(context, R.color.background_default)));
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int dimension = (int) getResources().getDimension(R.dimen.typing_while_driving_bar_height);
        p pVar = this.f45099a;
        if (!pVar.s()) {
            pVar.A(0, 0.0f);
            return;
        }
        pVar.A(dimension, 0.0f);
        ViewGroup.LayoutParams layoutParams = pVar.f45107b.getChildAt(0).getLayoutParams();
        layoutParams.height = dimension;
        pVar.f45107b.getChildAt(0).setLayoutParams(layoutParams);
    }
}
