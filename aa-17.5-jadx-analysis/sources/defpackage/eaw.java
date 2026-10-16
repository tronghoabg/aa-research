package defpackage;

import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class eaw extends ebb {
    public eaw(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls, 0, 28);
    }

    @Override // defpackage.ebb
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(ebi.f(view));
    }

    @Override // defpackage.ebb
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        ebi.d(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.ebb
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
