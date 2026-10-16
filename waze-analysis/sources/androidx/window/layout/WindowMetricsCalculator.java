package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.window.core.Bounds;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.util.WindowMetricsCompatHelper;
import h.g.a.l;
import h.g.b.x;
import h.j;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.layout.WindowMetricsCalculator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static WindowMetrics $default$computeCurrentWindowMetrics(WindowMetricsCalculator windowMetricsCalculator, Context context) {
            x.f(context, "context");
            throw new j("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
        }

        public static WindowMetrics $default$computeCurrentWindowMetricsOrNull(WindowMetricsCalculator windowMetricsCalculator, Context context) {
            x.f(context, "context");
            try {
                return windowMetricsCalculator.computeCurrentWindowMetrics(context);
            } catch (IllegalArgumentException | NullPointerException unused) {
                return null;
            }
        }

        public static WindowMetrics $default$computeMaximumWindowMetrics(WindowMetricsCalculator windowMetricsCalculator, Context context) {
            x.f(context, "context");
            throw new j("Must override computeMaximumWindowMetrics(context) and provide an implementation.");
        }

        public static WindowMetrics $default$computeMaximumWindowMetricsOrNull(WindowMetricsCalculator windowMetricsCalculator, Context context) {
            x.f(context, "context");
            try {
                return windowMetricsCalculator.computeMaximumWindowMetrics(context);
            } catch (IllegalAccessException | NullPointerException unused) {
                return null;
            }
        }

        static {
            Companion companion = WindowMetricsCalculator.Companion;
        }

        public static WindowMetricsCalculator getOrCreate() {
            return WindowMetricsCalculator.Companion.getOrCreate();
        }

        public static void overrideDecorator(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
            WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator);
        }

        public static void reset() {
            WindowMetricsCalculator.Companion.reset();
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static l<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> decorator = new l() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                WindowMetricsCalculator windowMetricsCalculator = (WindowMetricsCalculator) obj;
                WindowMetricsCalculator.Companion.decorator$lambda$0(windowMetricsCalculator);
                return windowMetricsCalculator;
            }
        };
        private static final WindowMetricsCalculatorCompat windowMetricsCalculatorCompat = new WindowMetricsCalculatorCompat(null, 1, 0 == true ? 1 : 0);

        private Companion() {
        }

        static final WindowMetricsCalculator decorator$lambda$0(WindowMetricsCalculator windowMetricsCalculator) {
            x.f(windowMetricsCalculator, "it");
            return windowMetricsCalculator;
        }

        static final WindowMetricsCalculator reset$lambda$0(WindowMetricsCalculator windowMetricsCalculator) {
            x.f(windowMetricsCalculator, "it");
            return windowMetricsCalculator;
        }

        public final WindowMetrics fromDisplayMetrics$window(DisplayMetrics displayMetrics) {
            x.f(displayMetrics, "displayMetrics");
            return new WindowMetrics(new Bounds(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels), displayMetrics.density);
        }

        public final WindowMetricsCalculator getOrCreate() {
            return decorator.invoke(windowMetricsCalculatorCompat);
        }

        public final void overrideDecorator(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
            x.f(windowMetricsCalculatorDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(windowMetricsCalculatorDecorator);
        }

        public final void reset() {
            decorator = new l() { // from class: androidx.window.layout.WindowMetricsCalculator$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    WindowMetricsCalculator windowMetricsCalculator = (WindowMetricsCalculator) obj;
                    WindowMetricsCalculator.Companion.reset$lambda$0(windowMetricsCalculator);
                    return windowMetricsCalculator;
                }
            };
        }

        public final WindowMetrics translateWindowMetrics$window(android.view.WindowMetrics windowMetrics, float f2) {
            x.f(windowMetrics, "windowMetrics");
            return WindowMetricsCompatHelper.Companion.getInstance().translateWindowMetrics(windowMetrics, f2);
        }
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    WindowMetrics computeCurrentWindowMetrics(Context context);

    WindowMetrics computeCurrentWindowMetricsOrNull(Context context);

    WindowMetrics computeMaximumWindowMetrics(Activity activity);

    WindowMetrics computeMaximumWindowMetrics(Context context);

    WindowMetrics computeMaximumWindowMetricsOrNull(Context context);
}
