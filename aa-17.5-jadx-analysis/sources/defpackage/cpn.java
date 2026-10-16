package defpackage;

import android.view.MotionEvent;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class cpn extends afar {
    private MotionEvent a;
    private final int b;
    private List c;

    public cpn(MotionEvent motionEvent, int i) {
        this.a = motionEvent;
        this.b = i;
    }

    private final List b() {
        List list = this.c;
        if (list != null) {
            return list;
        }
        MotionEvent motionEvent = this.a;
        motionEvent.getClass();
        int historySize = motionEvent.getHistorySize();
        ArrayList arrayList = new ArrayList(historySize);
        for (int i = 0; i < historySize; i++) {
            int i2 = this.b;
            float historicalX = motionEvent.getHistoricalX(i2, i);
            float historicalY = motionEvent.getHistoricalY(i2, i);
            if ((Float.floatToRawIntBits(historicalX) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
                arrayList.add(new cqd(motionEvent.getHistoricalEventTime(i), (Float.floatToRawIntBits(historicalX) << 32) | (Float.floatToRawIntBits(historicalY) & 4294967295L), 1.0f, 0L));
            }
        }
        this.c = arrayList;
        this.a = null;
        return arrayList;
    }

    @Override // defpackage.afam
    public final int a() {
        return b().size();
    }

    @Override // defpackage.afam, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof cqd) {
            return super.contains((cqd) obj);
        }
        return false;
    }

    @Override // defpackage.afar, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (cqd) b().get(i);
    }

    @Override // defpackage.afar, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof cqd) {
            return super.indexOf((cqd) obj);
        }
        return -1;
    }

    @Override // defpackage.afar, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof cqd) {
            return super.lastIndexOf((cqd) obj);
        }
        return -1;
    }
}
