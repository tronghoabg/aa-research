package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.util.Property;
import android.view.View;

/* loaded from: classes2.dex */
public final class omp extends Property {
    public static final omp a = new omp();

    private omp() {
        super(omn.class, "backgroundTint");
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final omn get(View view) {
        view.getClass();
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        return backgroundTintList == null ? new omn(0, 0) : new omn(backgroundTintList.getDefaultColor(), backgroundTintList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_window_focused}, backgroundTintList.getDefaultColor()));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        omn omnVar = (omn) obj2;
        view.getClass();
        omnVar.getClass();
        view.setBackgroundTintList(thg.i(new nzf(omnVar, 6)));
    }
}
