package defpackage;

import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.gms.car.RadioProgramSelector;
import j$.util.Comparator;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class miz implements Comparator {
    private final Comparator a;
    private final Comparator b;
    private final Comparator c;

    public miz() {
        int i = 3;
        this.a = Comparator.EL.thenComparingInt(Comparator.EL.thenComparingInt(Comparator.CC.comparingLong(new luz(i)), new mim(2)), new mim(i));
        int i2 = 4;
        int i3 = 5;
        int i4 = 6;
        this.b = Comparator.EL.thenComparingLong(Comparator.EL.thenComparingInt(Comparator.EL.thenComparingInt(Comparator.EL.thenComparingInt(Comparator.CC.comparingLong(new luz(i2)), new mim(i2)), new mim(i3)), new mim(i4)), new luz(i3));
        this.c = Comparator.EL.thenComparingLong(Comparator.CC.comparingInt(new mim(7)), new luz(i4));
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(RadioProgramInfo radioProgramInfo, RadioProgramInfo radioProgramInfo2) {
        RadioProgramSelector radioProgramSelector = radioProgramInfo.a;
        RadioProgramSelector radioProgramSelector2 = radioProgramInfo2.a;
        int i = radioProgramSelector.a.a;
        return (lws.h(i) && lws.h(radioProgramSelector2.a.a)) ? this.a.compare(radioProgramSelector, radioProgramSelector2) : (lws.j(i) && lws.j(radioProgramSelector2.a.a)) ? this.b.compare(radioProgramSelector, radioProgramSelector2) : this.c.compare(radioProgramSelector, radioProgramSelector2);
    }
}
