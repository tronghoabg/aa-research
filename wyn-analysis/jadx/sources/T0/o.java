package T0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class o extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11343a;

    public o(Context context) {
        super(context);
        this.f11343a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f11343a = z2;
    }

    public void setGuidelineBegin(int i5) {
        d dVar = (d) getLayoutParams();
        if (this.f11343a && dVar.f11173a == i5) {
            return;
        }
        dVar.f11173a = i5;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i5) {
        d dVar = (d) getLayoutParams();
        if (this.f11343a && dVar.f11175b == i5) {
            return;
        }
        dVar.f11175b = i5;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f10) {
        d dVar = (d) getLayoutParams();
        if (this.f11343a && dVar.f11177c == f10) {
            return;
        }
        dVar.f11177c = f10;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
    }
}
