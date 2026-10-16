package androidx.car.app;

import android.util.Log;
import androidx.car.app.managers.Manager;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class ScreenManager implements Manager {
    private final Lifecycle mAppLifecycle;
    private final CarContext mCarContext;
    private final Deque<Screen> mScreenStack = new ArrayDeque();

    public ScreenManager(CarContext carContext, Lifecycle lifecycle) {
        this.mCarContext = carContext;
        this.mAppLifecycle = lifecycle;
        lifecycle.addObserver(new LifecycleObserverImpl());
    }

    public static ScreenManager create(CarContext carContext, Lifecycle lifecycle) {
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
                Objects.toString(screen);
            }
            stop(screen, true);
        }
        if (Log.isLoggable(LogTags.TAG, 3)) {
            top.toString();
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
            Objects.toString(screen);
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

    public void destroyAndClearScreenStack() {
        Iterator it = new ArrayDeque(this.mScreenStack).iterator();
        while (it.hasNext()) {
            stop((Screen) it.next(), true);
        }
        this.mScreenStack.clear();
    }

    public Collection<Screen> getScreenStack() {
        return new ArrayList(this.mScreenStack);
    }

    public Deque<Screen> getScreenStackInternal() {
        return this.mScreenStack;
    }

    public int getStackSize() {
        return this.mScreenStack.size();
    }

    public Screen getTop() {
        ThreadUtils.checkMainThread();
        Screen screenPeek = this.mScreenStack.peek();
        Objects.requireNonNull(screenPeek);
        return screenPeek;
    }

    public TemplateWrapper getTopTemplate() {
        ThreadUtils.checkMainThread();
        Screen top = getTop();
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Objects.toString(top);
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
            Log.isLoggable(LogTags.TAG, 3);
        } else if (this.mScreenStack.size() > 1) {
            popInternal(Collections.singletonList(this.mScreenStack.pop()));
        }
    }

    public void popTo(String str) {
        ThreadUtils.checkMainThread();
        Objects.requireNonNull(str);
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            Log.isLoggable(LogTags.TAG, 3);
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
            Log.isLoggable(LogTags.TAG, 3);
        } else {
            if (this.mScreenStack.size() <= 1) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            while (this.mScreenStack.size() > 1) {
                arrayList.add(this.mScreenStack.pop());
            }
            popInternal(arrayList);
        }
    }

    public void push(Screen screen) {
        ThreadUtils.checkMainThread();
        Lifecycle.State currentState = this.mAppLifecycle.getCurrentState();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        if (currentState.equals(state)) {
            Log.isLoggable(LogTags.TAG, 3);
        } else {
            if (screen.getLifecycle().getCurrentState().equals(state)) {
                throw new IllegalStateException(String.format(Locale.US, "Failed to push screen (%s), because it has already been destroyed. Please note that screens are single-use, so a fresh instance is required every time you call screenManager.push().", screen));
            }
            pushInternal(screen);
        }
    }

    public void pushForResult(Screen screen, OnScreenResultListener onScreenResultListener) {
        ThreadUtils.checkMainThread();
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            Log.isLoggable(LogTags.TAG, 3);
            return;
        }
        Objects.requireNonNull(screen);
        Objects.requireNonNull(onScreenResultListener);
        screen.setOnScreenResultListener(onScreenResultListener);
        pushInternal(screen);
    }

    public void remove(Screen screen) {
        ThreadUtils.checkMainThread();
        Objects.requireNonNull(screen);
        if (this.mAppLifecycle.getCurrentState().equals(Lifecycle.State.DESTROYED)) {
            Log.isLoggable(LogTags.TAG, 3);
            return;
        }
        if (this.mScreenStack.size() <= 1) {
            return;
        }
        if (screen.equals(getTop())) {
            this.mScreenStack.pop();
            popInternal(Collections.singletonList(screen));
        } else if (this.mScreenStack.remove(screen)) {
            screen.dispatchLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public class LifecycleObserverImpl implements DefaultLifecycleObserver {
        public LifecycleObserverImpl() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            ScreenManager.this.destroyAndClearScreenStack();
            lifecycleOwner.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public void onPause(LifecycleOwner lifecycleOwner) {
            Screen screenPeek = ScreenManager.this.getScreenStackInternal().peek();
            if (screenPeek == null) {
                return;
            }
            screenPeek.dispatchLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            Screen screenPeek = ScreenManager.this.getScreenStackInternal().peek();
            if (screenPeek == null) {
                return;
            }
            screenPeek.dispatchLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public void onStart(LifecycleOwner lifecycleOwner) {
            Screen screenPeek = ScreenManager.this.getScreenStackInternal().peek();
            if (screenPeek == null) {
                return;
            }
            screenPeek.dispatchLifecycleEvent(Lifecycle.Event.ON_START);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public void onStop(LifecycleOwner lifecycleOwner) {
            Screen screenPeek = ScreenManager.this.getScreenStackInternal().peek();
            if (screenPeek == null) {
                return;
            }
            screenPeek.dispatchLifecycleEvent(Lifecycle.Event.ON_STOP);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public void onCreate(LifecycleOwner lifecycleOwner) {
        }
    }
}
