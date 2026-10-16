package androidx.car.app;

import android.util.Log;
import androidx.car.app.managers.Manager;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ScreenManager implements Manager {
    private final Lifecycle mAppLifecycle;
    private final CarContext mCarContext;
    private final Deque<Screen> mScreenStack = new ArrayDeque();

    protected ScreenManager(CarContext carContext, Lifecycle lifecycle) {
        this.mCarContext = carContext;
        this.mAppLifecycle = lifecycle;
        lifecycle.addObserver(new LifecycleObserverImpl());
    }

    static ScreenManager create(CarContext carContext, Lifecycle lifecycle) {
        return new ScreenManager(carContext, lifecycle);
    }

    private boolean foundMarker(String str) {
        return str.equals(getTop().getMarker());
    }

    private void moveToTop(Screen screen) {
        Screen screenPeek = this.mScreenStack.peek();
        if (screenPeek == null || screenPeek == screen) {
            return;
        }
        this.mScreenStack.remove(screen);
        pushAndStart(screen, false);
        stop(screenPeek, false);
        if (this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    private void popInternal(List<Screen> list) {
        Screen top = getTop();
        top.setUseLastTemplateId(true);
        ((AppManager) this.mCarContext.getCarService(AppManager.class)).invalidate();
        if (this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            top.dispatchLifecycleEvent(Lifecycle.Event.ON_START);
        }
        for (Screen screen : list) {
            if (Log.isLoggable(LogTags.TAG, 3)) {
                Log.d(LogTags.TAG, "Popping screen " + screen + " off the screen stack");
            }
            stop(screen, true);
        }
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Log.d(LogTags.TAG, "Screen " + top + " is at the top of the screen stack");
        }
        if (this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && this.mScreenStack.contains(top)) {
            top.dispatchLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    private void pushAndStart(Screen screen, boolean z) {
        this.mScreenStack.push(screen);
        if (z && this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
        if (screen.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            ((AppManager) this.mCarContext.getCarService(AppManager.class)).invalidate();
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_START);
        }
    }

    private void pushInternal(Screen screen) {
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Log.d(LogTags.TAG, "Pushing screen " + screen + " to the top of the screen stack");
        }
        if (this.mScreenStack.contains(screen)) {
            moveToTop(screen);
            return;
        }
        Screen screenPeek = this.mScreenStack.peek();
        pushAndStart(screen, true);
        if (this.mScreenStack.contains(screen)) {
            if (screenPeek != null) {
                stop(screenPeek, false);
            }
            if (this.mAppLifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                screen.dispatchLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }
        }
    }

    private void stop(Screen screen, boolean z) {
        Lifecycle.State currentState = screen.getLifecycle().getCurrentState();
        if (currentState.isAtLeast(Lifecycle.State.RESUMED)) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
        if (currentState.isAtLeast(Lifecycle.State.STARTED)) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
        if (z) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
    }

    void destroyAndClearScreenStack() {
        Iterator it = new ArrayDeque(this.mScreenStack).iterator();
        while (it.hasNext()) {
            stop((Screen) it.next(), true);
        }
        this.mScreenStack.clear();
    }

    public Collection<Screen> getScreenStack() {
        return new ArrayList(this.mScreenStack);
    }

    protected Deque<Screen> getScreenStackInternal() {
        return this.mScreenStack;
    }

    public int getStackSize() {
        return this.mScreenStack.size();
    }

    public Screen getTop() {
        ThreadUtils.checkMainThread();
        return (Screen) Objects.requireNonNull(this.mScreenStack.peek());
    }

    TemplateWrapper getTopTemplate() {
        ThreadUtils.checkMainThread();
        Screen top = getTop();
        if (Log.isLoggable(LogTags.TAG, 3)) {
            java.util.Objects.toString(top);
            Log.d(LogTags.TAG, "Requesting template from Screen ".concat(String.valueOf(top)));
        }
        TemplateWrapper templateWrapper = top.getTemplateWrapper();
        ArrayList arrayList = new ArrayList();
        Iterator<Screen> it = this.mScreenStack.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getLastTemplateInfo());
        }
        templateWrapper.setTemplateInfosForScreenStack(arrayList);
        return templateWrapper;
    }

    public void pop() {
        ThreadUtils.checkMainThread();
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            if (Log.isLoggable(LogTags.TAG, 3)) {
                Log.d(LogTags.TAG, "Popping screens after the DESTROYED state is a no-op");
            }
        } else if (this.mScreenStack.size() > 1) {
            popInternal(Collections.singletonList(this.mScreenStack.pop()));
        }
    }

    public void popTo(String str) {
        ThreadUtils.checkMainThread();
        Objects.requireNonNull(str);
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            if (Log.isLoggable(LogTags.TAG, 3)) {
                Log.d(LogTags.TAG, "Popping screens after the DESTROYED state is a no-op");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (this.mScreenStack.size() > 1 && !foundMarker(str)) {
            arrayList.add(this.mScreenStack.pop());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        popInternal(arrayList);
    }

    public void popToRoot() {
        ThreadUtils.checkMainThread();
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            if (Log.isLoggable(LogTags.TAG, 3)) {
                Log.d(LogTags.TAG, "Popping screens after the DESTROYED state is a no-op");
            }
        } else if (this.mScreenStack.size() > 1) {
            ArrayList arrayList = new ArrayList();
            while (this.mScreenStack.size() > 1) {
                arrayList.add(this.mScreenStack.pop());
            }
            popInternal(arrayList);
        }
    }

    public void push(Screen screen) {
        ThreadUtils.checkMainThread();
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            if (Log.isLoggable(LogTags.TAG, 3)) {
                Log.d(LogTags.TAG, "Pushing screens after the DESTROYED state is a no-op");
            }
        } else {
            if (screen.getLifecycle().getCurrentState().equals(Lifecycle.State.DESTROYED)) {
                throw new IllegalStateException(String.format(Locale.US, "Failed to push screen (%s), because it has already been destroyed. Please note that screens are single-use, so a fresh instance is required every time you call screenManager.push().", screen));
            }
            pushInternal((Screen) Objects.requireNonNull(screen));
        }
    }

    public void pushForResult(Screen screen, OnScreenResultListener onScreenResultListener) {
        ThreadUtils.checkMainThread();
        if (!this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            ((Screen) Objects.requireNonNull(screen)).setOnScreenResultListener((OnScreenResultListener) Objects.requireNonNull(onScreenResultListener));
            pushInternal(screen);
        } else if (Log.isLoggable(LogTags.TAG, 3)) {
            Log.d(LogTags.TAG, "Pushing screens after the DESTROYED state is a no-op");
        }
    }

    public void remove(Screen screen) {
        ThreadUtils.checkMainThread();
        Objects.requireNonNull(screen);
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            if (Log.isLoggable(LogTags.TAG, 3)) {
                Log.d(LogTags.TAG, "Popping screens after the DESTROYED state is a no-op");
            }
        } else if (this.mScreenStack.size() > 1) {
            boolean zEquals = screen.equals(getTop());
            Deque<Screen> deque = this.mScreenStack;
            if (zEquals) {
                deque.pop();
                popInternal(Collections.singletonList(screen));
            } else if (deque.remove(screen)) {
                screen.dispatchLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            }
        }
    }

    /* compiled from: WazeSource */
    class LifecycleObserverImpl implements DefaultLifecycleObserver {
        LifecycleObserverImpl() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            ScreenManager.this.destroyAndClearScreenStack();
            lifecycleOwner.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner lifecycleOwner) {
            Screen screenPeek = ScreenManager.this.getScreenStackInternal().peek();
            if (screenPeek == null) {
                Log.e(LogTags.TAG, "Screen stack was empty during lifecycle onPause");
            } else {
                screenPeek.dispatchLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            Screen screenPeek = ScreenManager.this.getScreenStackInternal().peek();
            if (screenPeek == null) {
                Log.e(LogTags.TAG, "Screen stack was empty during lifecycle onResume");
            } else {
                screenPeek.dispatchLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner lifecycleOwner) {
            Screen screenPeek = ScreenManager.this.getScreenStackInternal().peek();
            if (screenPeek == null) {
                Log.e(LogTags.TAG, "Screen stack was empty during lifecycle onStart");
            } else {
                screenPeek.dispatchLifecycleEvent(Lifecycle.Event.ON_START);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner lifecycleOwner) {
            Screen screenPeek = ScreenManager.this.getScreenStackInternal().peek();
            if (screenPeek == null) {
                Log.e(LogTags.TAG, "Screen stack was empty during lifecycle onStop");
            } else {
                screenPeek.dispatchLifecycleEvent(Lifecycle.Event.ON_STOP);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(LifecycleOwner lifecycleOwner) {
        }
    }
}
