package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class eay extends ebb {
    public eay(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.ebb
    public final /* synthetic */ Object a(View view) {
        return ebk.b(view);
    }

    @Override // defpackage.ebb
    public final /* synthetic */ void b(View view, Object obj) {
        ebk.c(view, (CharSequence) obj);
    }

    @Override // defpackage.ebb
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
