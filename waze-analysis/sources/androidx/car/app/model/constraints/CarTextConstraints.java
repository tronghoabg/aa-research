package androidx.car.app.model.constraints;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarSpan;
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

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarTextConstraints {
    private final HashSet<Class<? extends CarSpan>> mAllowedTypes;
    public static final CarTextConstraints CONSERVATIVE = new CarTextConstraints(Collections.EMPTY_LIST);
    public static final CarTextConstraints UNCONSTRAINED = new CarTextConstraints(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));
    public static final CarTextConstraints CLICKABLE_TEXT_ONLY = new CarTextConstraints(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class, TimerSpan.class));
    public static final CarTextConstraints COLOR_ONLY = new CarTextConstraints(Arrays.asList(ForegroundCarColorSpan.class));
    public static final CarTextConstraints TEXT_ONLY = new CarTextConstraints(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class));
    public static final CarTextConstraints TEXT_AND_ICON = new CarTextConstraints(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, CarIconSpan.class));
    public static final CarTextConstraints TEXT_WITH_COLORS = new CarTextConstraints(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class));
    public static final CarTextConstraints TEXT_WITH_COLORS_AND_ICON = new CarTextConstraints(Arrays.asList(DistanceSpan.class, DurationSpan.class, TimerSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));

    private CarTextConstraints(List<Class<? extends CarSpan>> list) {
        this.mAllowedTypes = new HashSet<>(list);
    }

    private void checkSupportedSpans(List<CarText.SpanWrapper> list) {
        Iterator<CarText.SpanWrapper> it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = it.next().getCarSpan().getClass();
            if (!this.mAllowedTypes.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(String.valueOf(cls.getSimpleName())));
            }
        }
    }

    public void validateOrThrow(CarText carText) {
        checkSupportedSpans(carText.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            checkSupportedSpans(it.next());
        }
    }
}
