package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.lang.reflect.Field;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static final Companion Companion = new Companion(null);
    private static final f<Cleaner> cleaner$delegate = g.a(new a() { // from class: androidx.activity.ImmLeaksCleaner$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return ImmLeaksCleaner.cleaner_delegate$lambda$0();
        }
    });
    private final Activity activity;

    /* compiled from: WazeSource */
    public final class FailedInitialization extends Cleaner {
        public static final FailedInitialization INSTANCE = new FailedInitialization();

        private FailedInitialization() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(InputMethodManager inputMethodManager) {
            x.f(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public Object getLock(InputMethodManager inputMethodManager) {
            x.f(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public View getServedView(InputMethodManager inputMethodManager) {
            x.f(inputMethodManager, "<this>");
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class ValidCleaner extends Cleaner {
        private final Field hField;
        private final Field nextServedViewField;
        private final Field servedViewField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidCleaner(Field field, Field field2, Field field3) {
            super(null);
            x.f(field, "hField");
            x.f(field2, "servedViewField");
            x.f(field3, "nextServedViewField");
            this.hField = field;
            this.servedViewField = field2;
            this.nextServedViewField = field3;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
            x.f(inputMethodManager, "<this>");
            try {
                this.nextServedViewField.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public Object getLock(InputMethodManager inputMethodManager) {
            x.f(inputMethodManager, "<this>");
            try {
                return this.hField.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public View getServedView(InputMethodManager inputMethodManager) {
            x.f(inputMethodManager, "<this>");
            try {
                return (View) this.servedViewField.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        x.f(activity, "activity");
        this.activity = activity;
    }

    static final Cleaner cleaner_delegate$lambda$0() throws NoSuchFieldException {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            x.c(declaredField3);
            x.c(declaredField);
            x.c(declaredField2);
            return new ValidCleaner(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return FailedInitialization.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        x.f(lifecycleOwner, "source");
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        Object systemService = this.activity.getSystemService("input_method");
        x.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        Cleaner cleaner = Companion.getCleaner();
        Object lock = cleaner.getLock(inputMethodManager);
        if (lock != null) {
            synchronized (lock) {
                View servedView = cleaner.getServedView(inputMethodManager);
                if (servedView != null && !servedView.isAttachedToWindow()) {
                    boolean zClearNextServedView = cleaner.clearNextServedView(inputMethodManager);
                    if (zClearNextServedView) {
                        inputMethodManager.isActive();
                    }
                }
            }
        }
    }

    /* compiled from: WazeSource */
    public abstract class Cleaner {
        private Cleaner() {
        }

        public abstract boolean clearNextServedView(InputMethodManager inputMethodManager);

        public abstract Object getLock(InputMethodManager inputMethodManager);

        public abstract View getServedView(InputMethodManager inputMethodManager);

        public /* synthetic */ Cleaner(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Cleaner getCleaner() {
            return (Cleaner) ImmLeaksCleaner.cleaner$delegate.getValue();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
