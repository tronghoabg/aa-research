package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aaad {
    private List a = new ArrayList();
    private final Set b = new HashSet();
    private Point c = null;

    public final zwv a(List list, float f, float f2) {
        int iRound = Math.round(f);
        int iRound2 = Math.round(f2);
        Point point = this.c;
        if (point == null) {
            this.c = new Point(iRound, iRound2);
        } else {
            int i = iRound - point.x;
            int i2 = iRound2 - this.c.y;
            if ((i * i) + (i2 * i2) > 900) {
                this.c.x = iRound;
                this.c.y = iRound2;
            }
        }
        int i3 = this.c.x;
        int i4 = this.c.y;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aaae aaaeVar = (aaae) it.next();
            if (aaaeVar.a.isVisible()) {
                Rect rectA = aaaeVar.a();
                float fExactCenterX = i3 - rectA.exactCenterX();
                float fExactCenterY = i4 - rectA.exactCenterY();
                if ((fExactCenterX * fExactCenterX) + (fExactCenterY * fExactCenterY) < 900.0f) {
                    arrayList.add(aaaeVar);
                }
            }
        }
        List list2 = this.a;
        if (arrayList.size() != list2.size()) {
            this.a = arrayList;
            this.b.clear();
            break;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (!((aaae) arrayList.get(i5)).equals(list2.get(i5))) {
                this.a = arrayList;
                this.b.clear();
                break;
            }
        }
        aaae aaaeVar2 = null;
        if (this.a.isEmpty()) {
            return null;
        }
        float fH = -3.4028235E38f;
        for (aaae aaaeVar3 : this.a) {
            if (!this.b.contains(aaaeVar3) && Float.compare(aaaeVar3.h(), fH) >= BitmapDescriptorFactory.HUE_RED) {
                fH = aaaeVar3.h();
                aaaeVar2 = aaaeVar3;
            }
        }
        Set set = this.b;
        if (aaaeVar2 == null) {
            set.clear();
            return a(list, iRound, iRound2);
        }
        set.add(aaaeVar2);
        return aaaeVar2.a;
    }
}
