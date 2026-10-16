package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes3.dex */
public final class wkf extends lt {
    private List a;

    @Override // defpackage.lt
    public final int a() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void b(List list) {
        this.a = list;
        g();
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        return new wor(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.survey_system_info_item, viewGroup, false));
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        dzi dziVar = (dzi) this.a.get(i);
        View view = ((wor) moVar).s;
        ((TextView) view.findViewById(R.id.survey_system_info_item_key)).setText((CharSequence) dziVar.a);
        ((TextView) view.findViewById(R.id.survey_system_info_item_value)).setText((CharSequence) dziVar.b);
    }
}
