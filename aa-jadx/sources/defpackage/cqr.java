package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cqr {
    private long d;
    private boolean h;
    private boolean i;
    private defpackage.cji j;
    private boolean k;
    private boolean l;
    public final android.util.SparseLongArray a = new android.util.SparseLongArray();
    public final android.util.SparseBooleanArray b = new android.util.SparseBooleanArray();
    private final java.util.List e = new java.util.ArrayList();
    public final defpackage.zz c = new defpackage.zz(10);
    private int f = -1;
    private int g = -1;

    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:65:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0213  */
    /* JADX WARN: Code duplicated, block: B:92:0x017f A[EDGE_INSN: B:92:0x017f->B:63:0x017f BREAK  A[LOOP:0: B:39:0x00d5->B:62:0x0179], SYNTHETIC] */
    private final defpackage.crf g(defpackage.crm crmVar, android.view.MotionEvent motionEvent, defpackage.cji cjiVar, int i, boolean z) {
        char c;
        long j;
        long jL;
        long j2;
        long jFloatToRawIntBits;
        long j3;
        long jM;
        int toolType;
        char c2;
        int i2;
        int historySize;
        int i3;
        long jFloatToRawIntBits2;
        float fFloatValue;
        long jFloatToRawIntBits3;
        boolean z2;
        java.lang.Float f;
        float historicalX;
        long jA = a(motionEvent.getPointerId(i));
        float pressure = motionEvent.getPressure(i);
        long jFloatToRawIntBits4 = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getX(i))) << 32);
        if (i != 0) {
            c = ' ';
            j = 4294967295L;
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                if (cjiVar != null) {
                    jFloatToRawIntBits = cjiVar.a;
                } else {
                    jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawX(i))) << 32) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L);
                }
                j3 = jFloatToRawIntBits;
                jM = crmVar.m(j3);
            } else {
                jL = crmVar.l(jFloatToRawIntBits4);
                j2 = jFloatToRawIntBits4;
            }
            toolType = motionEvent.getToolType(i);
            c2 = c;
            if (toolType != 0) {
                i2 = 2;
                if (toolType == 1) {
                    if (toolType != 2) {
                        i2 = 3;
                    } else if (toolType != 3) {
                        i2 = 4;
                        if (toolType != 4) {
                            i2 = 0;
                        }
                    }
                } else if ((motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.h && !this.i)) {
                }
            } else {
                i2 = 0;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i3 = 0;
            while (true) {
                jFloatToRawIntBits2 = 0;
                fFloatValue = 1.0f;
                if (i3 < historySize) {
                    break;
                }
                historicalX = motionEvent.getHistoricalX(i, i3);
                float historicalY = motionEvent.getHistoricalY(i, i3);
                long j4 = jFloatToRawIntBits4;
                if ((java.lang.Float.floatToRawIntBits(historicalX) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 && (java.lang.Float.floatToRawIntBits(historicalY) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
                    long jFloatToRawIntBits5 = ((long) java.lang.Float.floatToRawIntBits(historicalX)) << c2;
                    long jFloatToRawIntBits6 = ((long) java.lang.Float.floatToRawIntBits(historicalY)) & j;
                    boolean z3 = android.os.Build.VERSION.SDK_INT >= 34 && motionEvent.getClassification() == 3;
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                    java.lang.Float fValueOf = java.lang.Float.valueOf(motionEvent.getHistoricalAxisValue(52, i, i3));
                    f = fValueOf.floatValue() > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? fValueOf : null;
                    float fFloatValue2 = f != null ? f.floatValue() : 1.0f;
                    if (android.os.Build.VERSION.SDK_INT >= 29 && z3) {
                        jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3))) << c2) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3))) & j);
                    }
                    long j5 = jFloatToRawIntBits5 | jFloatToRawIntBits6;
                    arrayList.add(new defpackage.cqm(historicalEventTime, j5, fFloatValue2, jFloatToRawIntBits2, j5));
                }
                i3++;
                jFloatToRawIntBits4 = j4;
            }
            long j6 = jFloatToRawIntBits4;
            if (motionEvent.getActionMasked() == 8) {
                jFloatToRawIntBits3 = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2) | (((long) java.lang.Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) & j);
            } else {
                jFloatToRawIntBits3 = 0;
            }
            if (android.os.Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 5) {
                java.lang.Float fValueOf2 = java.lang.Float.valueOf(motionEvent.getAxisValue(52, i));
                f = fValueOf2.floatValue() > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? fValueOf2 : null;
                if (f != null) {
                    fFloatValue = f.floatValue();
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 34 || !(motionEvent.getClassification() == 3 || this.k)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (android.os.Build.VERSION.SDK_INT < 29 && z2) {
                jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << c2) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j);
            }
            return new defpackage.crf(jA, motionEvent.getEventTime(), jL, j2, z, pressure, i2, this.b.get(motionEvent.getPointerId(i), false), arrayList, jFloatToRawIntBits3, fFloatValue, jFloatToRawIntBits2, j6);
        }
        if (cjiVar != null) {
            j3 = cjiVar.a;
            c = ' ';
            j = 4294967295L;
        } else {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            long jFloatToRawIntBits7 = java.lang.Float.floatToRawIntBits(rawX);
            int iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(rawY);
            c = ' ';
            j = 4294967295L;
            j3 = (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits7 << 32);
        }
        jM = crmVar.m(j3);
        j2 = jM;
        jL = j3;
        toolType = motionEvent.getToolType(i);
        c2 = c;
        if (toolType != 0) {
            i2 = 2;
            if (toolType == 1) {
                i2 = motionEvent.isFromSource(8194) ? 1 : 1;
            } else if (toolType != 2) {
                i2 = 3;
            } else if (toolType != 3) {
                i2 = 4;
                if (toolType != 4) {
                    i2 = 0;
                }
            }
        } else {
            i2 = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        i3 = 0;
        while (true) {
            jFloatToRawIntBits2 = 0;
            fFloatValue = 1.0f;
            if (i3 < historySize) {
                break;
                break;
            }
            historicalX = motionEvent.getHistoricalX(i, i3);
            float historicalY2 = motionEvent.getHistoricalY(i, i3);
            long j7 = jFloatToRawIntBits4;
            if ((java.lang.Float.floatToRawIntBits(historicalX) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
            }
            i3++;
            jFloatToRawIntBits4 = j7;
        }
        long j8 = jFloatToRawIntBits4;
        if (motionEvent.getActionMasked() == 8) {
            jFloatToRawIntBits3 = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2) | (((long) java.lang.Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) & j);
        } else {
            jFloatToRawIntBits3 = 0;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            java.lang.Float fValueOf3 = java.lang.Float.valueOf(motionEvent.getAxisValue(52, i));
            if (fValueOf3.floatValue() > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            }
            if (f != null) {
                fFloatValue = f.floatValue();
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (android.os.Build.VERSION.SDK_INT < 29) {
        }
        return new defpackage.crf(jA, motionEvent.getEventTime(), jL, j2, z, pressure, i2, this.b.get(motionEvent.getPointerId(i), false), arrayList2, jFloatToRawIntBits3, fFloatValue, jFloatToRawIntBits2, j8);
    }

    private final void h() {
        this.h = false;
        this.i = false;
        this.j = null;
        this.k = false;
        this.l = false;
    }

    public final long a(int i) {
        android.util.SparseLongArray sparseLongArray = this.a;
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseLongArray.valueAt(iIndexOfKey);
        }
        long j = this.d;
        this.d = 1 + j;
        sparseLongArray.put(i, j);
        return j;
    }

    public final void b(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            android.util.SparseLongArray sparseLongArray = this.a;
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.d;
                this.d = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        android.util.SparseLongArray sparseLongArray2 = this.a;
        if (sparseLongArray2.indexOfKey(pointerId2) < 0) {
            long j2 = this.d;
            this.d = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.b.put(pointerId2, true);
            }
        }
    }

    public final void c(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (source == 8194 || source == 1048584) {
            if (source == this.g && (toolType == this.f || toolType == 3 || toolType == 1)) {
                return;
            }
        } else if (toolType == this.f && source == this.g) {
            return;
        }
        this.f = toolType;
        this.g = source;
        this.b.clear();
        this.a.clear();
    }

    public final void d(int i) {
        this.b.delete(i);
        this.a.delete(i);
    }

    public final void e(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            android.util.SparseBooleanArray sparseBooleanArray = this.b;
            if (!sparseBooleanArray.get(pointerId, false)) {
                this.a.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        android.util.SparseLongArray sparseLongArray = this.a;
        if (sparseLongArray.size() <= motionEvent.getPointerCount()) {
            return;
        }
        int size = sparseLongArray.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            int iKeyAt = sparseLongArray.keyAt(size);
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (true) {
                if (i >= pointerCount) {
                    sparseLongArray.removeAt(size);
                    this.b.delete(iKeyAt);
                    break;
                } else if (motionEvent.getPointerId(i) == iKeyAt) {
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e0  */
    public final defpackage.to f(android.view.MotionEvent motionEvent, defpackage.crm crmVar) {
        int i;
        boolean z;
        int actionIndex;
        java.util.List list;
        defpackage.cji cjiVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.a.clear();
            this.b.clear();
            h();
            return null;
        }
        c(motionEvent);
        boolean z2 = false;
        if (actionMasked == 0) {
            if (android.os.Build.VERSION.SDK_INT < 34 || (motionEvent.getClassification() != 3 && motionEvent.getClassification() != 5)) {
                h();
            }
            actionMasked = 0;
        }
        if (actionMasked == 0 || actionMasked == 5) {
            this.l = true;
        }
        if (actionMasked == 9 || actionMasked == 7) {
            i = actionMasked;
            z = true;
        } else if (actionMasked == 10) {
            z = true;
            i = 10;
        } else {
            i = actionMasked;
            z = false;
        }
        if ((i == 9 || i == 10 || (i == 7 && !this.l && !this.k)) && (android.os.Build.VERSION.SDK_INT < 34 || (motionEvent.getClassification() != 3 && motionEvent.getClassification() != 5))) {
            h();
        }
        if (android.os.Build.VERSION.SDK_INT >= 34 && motionEvent.getClassification() == 3) {
            this.k = true;
        }
        b(motionEvent);
        if (z && !this.l) {
            this.b.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (i != 1) {
            actionIndex = i != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        java.util.List list2 = this.e;
        list2.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = android.os.Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.h = true;
            }
        }
        boolean z5 = android.os.Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || this.k);
        int i2 = 2;
        if (android.os.Build.VERSION.SDK_INT < 34 || !(z5 || motionEvent.getClassification() == 5)) {
            this.i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i3 = 0;
            while (i3 < pointerCount) {
                boolean z6 = (z || i3 == actionIndex || (i == 8 && motionEvent.getButtonState() == 0)) ? z2 : true;
                java.util.List list3 = list2;
                list3.add(g(crmVar, motionEvent, null, i3, z6));
                i3++;
                list2 = list3;
                pointerCount = pointerCount;
                z2 = false;
            }
            list = list2;
        } else {
            if (motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 1) {
                if (motionEvent.getActionMasked() == 1) {
                    h();
                }
                e(motionEvent);
                return null;
            }
            this.i = true;
            if (motionEvent.getActionMasked() == 5 && motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 2) {
                cjiVar = new defpackage.cji((((long) java.lang.Float.floatToRawIntBits((motionEvent.getRawX(0) + motionEvent.getRawX(1)) / 2.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits((motionEvent.getRawY(0) + motionEvent.getRawY(1)) / 2.0f)) & 4294967295L));
                this.j = cjiVar;
            } else if (motionEvent.getActionMasked() == 0 || (cjiVar = this.j) == null) {
                cjiVar = new defpackage.cji((((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32));
                this.j = cjiVar;
            }
            list2.add(g(crmVar, motionEvent, cjiVar, 0, false));
            list = list2;
        }
        if (this.k) {
            i2 = 5;
        } else if (android.os.Build.VERSION.SDK_INT < 34) {
            i2 = 1;
        } else {
            int classification = motionEvent.getClassification();
            if (classification != 1) {
                if (classification == 2) {
                    i2 = 3;
                } else if (classification == 3) {
                    i2 = 5;
                } else if (classification != 5) {
                    i2 = 1;
                } else {
                    i2 = 4;
                }
            }
        }
        boolean z7 = motionEvent.getActionMasked() == 10 && (android.os.Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3 || z7) {
            h();
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new defpackage.to(list, motionEvent, i2);
    }
}
