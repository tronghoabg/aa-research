package defpackage;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.car.app.model.TimerSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class wi {
    public static final wi a = new wi(Collections.EMPTY_LIST);
    public static final wi b = new wi(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));
    public static final wi c;
    public static final wi d;
    public static final wi e;
    public static final wi f;
    private final HashSet g;

    static {
        new wi(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class));
        c = new wi(Arrays.asList(ForegroundCarColorSpan.class));
        d = new wi(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class));
        e = new wi(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, CarIconSpan.class));
        new wi(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));
        f = new wi(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    private wi(List list) {
        this.g = new HashSet(list);
    }

    private final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.g.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(String.valueOf(cls.getSimpleName())));
            }
        }
    }

    public final void a(CarText carText) {
        b(carText.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
