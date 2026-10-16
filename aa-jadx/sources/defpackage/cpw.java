package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cpw extends defpackage.afbr {
    private android.view.MotionEvent a;
    private final int b;
    private java.util.List c;

    public cpw(android.view.MotionEvent motionEvent, int i) {
        this.a = motionEvent;
        this.b = i;
    }

    private final java.util.List b() {
        java.util.List list = this.c;
        if (list != null) {
            return list;
        }
        android.view.MotionEvent motionEvent = this.a;
        motionEvent.getClass();
        int historySize = motionEvent.getHistorySize();
        java.util.ArrayList arrayList = new java.util.ArrayList(historySize);
        for (int i = 0; i < historySize; i++) {
            int i2 = this.b;
            float historicalX = motionEvent.getHistoricalX(i2, i);
            float historicalY = motionEvent.getHistoricalY(i2, i);
            if ((java.lang.Float.floatToRawIntBits(historicalX) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 && (java.lang.Float.floatToRawIntBits(historicalY) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
                arrayList.add(new defpackage.cqm(motionEvent.getHistoricalEventTime(i), (((long) java.lang.Float.floatToRawIntBits(historicalX)) << 32) | (((long) java.lang.Float.floatToRawIntBits(historicalY)) & 4294967295L), 1.0f, 0L));
            }
        }
        this.c = arrayList;
        this.a = null;
        return arrayList;
    }

    @Override // defpackage.afbm
    public final int a() {
        return b().size();
    }

    @Override // defpackage.afbm, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof defpackage.cqm) {
            return super.contains((defpackage.cqm) obj);
        }
        return false;
    }

    @Override // defpackage.afbr, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return (defpackage.cqm) b().get(i);
    }

    @Override // defpackage.afbr, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.cqm) {
            return super.indexOf((defpackage.cqm) obj);
        }
        return -1;
    }

    @Override // defpackage.afbr, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.cqm) {
            return super.lastIndexOf((defpackage.cqm) obj);
        }
        return -1;
    }
}
