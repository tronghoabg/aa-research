package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.car.app.model.Row;
import com.google.android.projection.gearhead.R;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class kdw extends lt implements oxi {
    public static final /* synthetic */ int g = 0;
    private static final yph h = yph.c("CarApp.H.Tem");
    public List a;
    public geu e;
    public hie f;
    private final Context i;

    public kdw(Context context, List list) {
        this.i = context;
        this.a = list;
    }

    @Override // defpackage.lt
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.lt
    public final int d(int i) {
        hif hifVar = (hif) this.a.get(i);
        if (hifVar.b()) {
            return 0;
        }
        him himVar = hifVar.a;
        return 2;
    }

    @Override // defpackage.lt
    public final mo f(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 0) {
            i2 = R.layout.row_section_header_view;
        } else if (i == 1) {
            leh.a();
            i2 = R.layout.material_row_container_view_action_list_impl;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(String.format(Locale.US, "onCreateViewHolder -- invalid view type: %d", Integer.valueOf(i)));
            }
            leh.a();
            i2 = R.layout.material_row_container_view_row_impl;
        }
        return new mo(LayoutInflater.from(this.i).inflate(i2, viewGroup, false));
    }

    @Override // defpackage.lt
    public final void n(mo moVar, int i) {
        int i2 = moVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ((kdx) moVar.a).d(this.e, this.a, i, this.f);
                return;
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException(String.format(Locale.US, "onBindViewHolder -- invalid view type: %d", Integer.valueOf(i2)));
                }
                ((kdx) moVar.a).d(this.e, this.a, i, this.f);
                return;
            }
        }
        TextView textView = (TextView) moVar.a;
        hif hifVar = (hif) this.a.get(i);
        if (!hifVar.b()) {
            ((ype) ((ype) h.g()).ai((char) 2949)).u("Expecting section header to bind");
            return;
        }
        Object obj = hifVar.a.a;
        hlu hluVar = new hlu();
        hluVar.d = 10;
        hluVar.c = new Rect(0, 0, (int) textView.getTextSize(), (int) textView.getTextSize());
        textView.setText(hlb.e(this.e, ((Row) obj).getTitle(), hluVar.a(), -1), TextView.BufferType.SPANNABLE);
    }

    @Override // defpackage.oxi
    public final void b(int i) {
    }
}
