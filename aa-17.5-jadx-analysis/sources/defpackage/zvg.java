package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.projection.gearhead.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zvg extends eek {
    public static final /* synthetic */ int f = 0;
    private static final Rect g = new Rect(-2, -2, -1, -1);
    public List e;
    private final zwy h;
    private final String i;
    private Map j;

    public zvg(View view, zwy zwyVar, gjt gjtVar) {
        super(view);
        if (adek.c()) {
            this.j = new HashMap();
        }
        this.i = gjtVar.F(R.string.maps_marker_default_on_select_content_description);
        this.h = zwyVar;
    }

    public static String w(zwv zwvVar) {
        if (zwvVar == null) {
            return "";
        }
        String title = zwvVar.getTitle();
        boolean zR = ysi.R(title);
        String snippet = zwvVar.getSnippet();
        String strConcat = zR ? "" : String.valueOf(title).concat(". ");
        if (ysi.R(snippet)) {
            return strConcat;
        }
        return strConcat + snippet + ".";
    }

    private static String x(zwv zwvVar) {
        String title = zwvVar.getTitle();
        return !ysi.R(title) ? title : "";
    }

    @Override // defpackage.eek
    protected final int j(float f2, float f3) {
        if (this.e == null) {
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < this.e.size(); i++) {
            zwv zwvVar = (zwv) this.e.get(i);
            if (!zwvVar.u() && zwvVar.k().contains((int) f2, (int) f3)) {
                return adek.c() ? zwvVar.a.hashCode() : i;
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.eek
    protected final void l(List list) {
        List listC = this.h.c();
        this.e = listC;
        if (listC == null) {
            return;
        }
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (adek.c()) {
                Integer numValueOf = Integer.valueOf(((zwv) this.e.get(i)).a.hashCode());
                list.add(numValueOf);
                this.j.put(numValueOf, (zwv) this.e.get(i));
            } else {
                list.add(Integer.valueOf(i));
            }
        }
    }

    @Override // defpackage.eek
    protected final void n(int i, AccessibilityEvent accessibilityEvent) {
        if (adek.c()) {
            zwv zwvVar = (zwv) this.j.get(Integer.valueOf(i));
            if (zwvVar == null) {
                accessibilityEvent.setContentDescription("");
                return;
            } else {
                accessibilityEvent.setContentDescription(w(zwvVar));
                return;
            }
        }
        List list = this.e;
        if (list == null || i >= list.size()) {
            this.e = this.h.c();
        }
        List list2 = this.e;
        if (list2 == null || i >= list2.size()) {
            accessibilityEvent.setContentDescription("");
        } else {
            accessibilityEvent.setContentDescription(w((zwv) this.e.get(i)));
        }
    }

    @Override // defpackage.eek
    protected final void p(int i, edg edgVar) {
        zwv zwvVar;
        if (adek.c()) {
            zwvVar = (zwv) this.j.get(Integer.valueOf(i));
        } else {
            List list = this.e;
            zwvVar = (list == null || i >= list.size() || ((zwv) this.e.get(i)).u()) ? null : (zwv) this.e.get(i);
        }
        if (zwvVar == null || zwvVar.u()) {
            edgVar.v("");
            edgVar.n(g);
        } else {
            edgVar.v(zwvVar.getContentDescription() != null ? zwvVar.getContentDescription() : !woy.am(x(zwvVar)) ? x(zwvVar) : this.i);
            edgVar.n(zwvVar.k());
            edgVar.z(true);
            edgVar.s(true);
        }
    }

    @Override // defpackage.eek
    public final boolean u(int i, int i2) {
        return false;
    }
}
