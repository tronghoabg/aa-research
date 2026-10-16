package j$.time.chrono;

import com.waze.strings.DisplayStrings;
import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class x implements l, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final x f49887d;

    /* renamed from: e, reason: collision with root package name */
    public static final x[] f49888e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f49889a;

    /* renamed from: b, reason: collision with root package name */
    public final transient LocalDate f49890b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f49891c;

    static {
        x xVar = new x(-1, LocalDate.of(DisplayStrings.DS_SEARCH_RESULTS_SORT_SHEET_TITLE, 1, 1), "Meiji");
        f49887d = xVar;
        f49888e = new x[]{xVar, new x(0, LocalDate.of(DisplayStrings.DS_CUSTOM_PROMPT_SIXTH, 7, 30), "Taisho"), new x(1, LocalDate.of(DisplayStrings.DS_CUSTOM_PROMPT_HAZARD, 12, 25), "Showa"), new x(2, LocalDate.of(DisplayStrings.DS_AUDIO_SDK_DATA_SHARING_TITLE_PS, 1, 8), "Heisei"), new x(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public x(int i2, LocalDate localDate, String str) {
        this.f49889a = i2;
        this.f49890b = localDate;
        this.f49891c = str;
    }

    public static x e(LocalDate localDate) {
        if (localDate.Q(w.f49883d)) {
            j$.time.f.h("JapaneseDate before Meiji 6 are not supported");
            return null;
        }
        x[] xVarArr = f49888e;
        for (int length = xVarArr.length - 1; length >= 0; length--) {
            x xVar = xVarArr[length];
            if (localDate.compareTo(xVar.f49890b) >= 0) {
                return xVar;
            }
        }
        return null;
    }

    public static x i(int i2) {
        int i3 = i2 + 1;
        if (i3 >= 0) {
            x[] xVarArr = f49888e;
            if (i3 < xVarArr.length) {
                return xVarArr[i3];
            }
        }
        j$.time.f.c("Invalid era: ", i2);
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long D(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.m(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean c(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.p(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int f(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.k(this, mVar);
    }

    public final x g() {
        if (this == f49888e[r0.length - 1]) {
            return null;
        }
        return i(this.f49889a + 1);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return this.f49889a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return mVar == aVar ? u.f49881d.o(aVar) : j$.time.temporal.n.d(this, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }

    public final String toString() {
        return this.f49891c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object x(j$.desugar.sun.nio.fs.n nVar) {
        return j$.com.android.tools.r8.a.t(this, nVar);
    }
}
