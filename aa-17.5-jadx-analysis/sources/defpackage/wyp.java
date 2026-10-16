package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
final class wyp extends lt {
    private final yfq a;
    private final Context e;

    public wyp(Context context, yfq yfqVar) {
        this.e = context;
        this.a = yfqVar;
    }

    @Override // defpackage.lt
    public final int a() {
        return ((yls) this.a).c + 1;
    }

    @Override // defpackage.lt
    public final int d(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // defpackage.lt
    public final /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        return i == 0 ? new mo(LayoutInflater.from(this.e).inflate(R.layout.request_permissions_header, viewGroup, false)) : new wyo(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.request_permissions_list_item, viewGroup, false));
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        if (i == 0) {
            return;
        }
        moVar.C(this.e, (wyq) this.a.get(i - 1));
    }
}
