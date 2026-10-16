package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wp {
    public static final defpackage.wp a = new defpackage.wp(java.util.Collections.EMPTY_LIST);
    public static final defpackage.wp b = new defpackage.wp(java.util.Arrays.asList(androidx.car.app.model.CarIconSpan.class, androidx.car.app.model.ClickableSpan.class, androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class, androidx.car.app.model.ForegroundCarColorSpan.class));
    public static final defpackage.wp c;
    public static final defpackage.wp d;
    public static final defpackage.wp e;
    public static final defpackage.wp f;
    private final java.util.HashSet g;

    static {
        new defpackage.wp(java.util.Arrays.asList(androidx.car.app.model.ClickableSpan.class, androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class));
        c = new defpackage.wp(java.util.Arrays.asList(androidx.car.app.model.ForegroundCarColorSpan.class));
        d = new defpackage.wp(java.util.Arrays.asList(androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class));
        e = new defpackage.wp(java.util.Arrays.asList(androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class, androidx.car.app.model.CarIconSpan.class));
        new defpackage.wp(java.util.Arrays.asList(androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class, androidx.car.app.model.ForegroundCarColorSpan.class));
        f = new defpackage.wp(java.util.Arrays.asList(androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class, androidx.car.app.model.ForegroundCarColorSpan.class, androidx.car.app.model.CarIconSpan.class));
    }

    private wp(java.util.List list) {
        this.g = new java.util.HashSet(list);
    }

    private final void b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Class<?> cls = ((androidx.car.app.model.CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.g.contains(cls)) {
                throw new java.lang.IllegalArgumentException("CarSpan type is not allowed: ".concat(java.lang.String.valueOf(cls.getSimpleName())));
            }
        }
    }

    public final void a(androidx.car.app.model.CarText carText) {
        b(carText.getSpans());
        java.util.Iterator<java.util.List<androidx.car.app.model.CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
