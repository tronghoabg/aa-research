package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.core.os.HandlerCompat;
import androidx.core.viewtree.ViewTree;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.waze.R;
import h.ab;
import h.c.g;
import h.c.j;
import h.c.k;
import h.e;
import h.g.b.aq;
import h.g.b.w;
import h.i;
import java.util.Objects;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.b;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {
    private static final MutableScatterMap<Context, ch<Float>> animationScale = ScatterMapKt.mutableScatterMapOf();

    public static final Recomposer createLifecycleAwareWindowRecomposer(final View view, j jVar, Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (jVar.get(g.f48059a) == null || jVar.get(MonotonicFrameClock.Key) == null) {
            jVar = AndroidUiDispatcher.Companion.getCurrentThread().plus(jVar);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) jVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            pausableMonotonicFrameClock = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock.pause();
        } else {
            pausableMonotonicFrameClock = null;
        }
        final aq aqVar = new aq();
        MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScale) jVar.get(MotionDurationScale.Key);
        if (motionDurationScaleImpl == null) {
            MotionDurationScaleImpl motionDurationScaleImpl2 = new MotionDurationScaleImpl(view.getContext().getApplicationContext());
            aqVar.f48105a = motionDurationScaleImpl2;
            motionDurationScaleImpl = motionDurationScaleImpl2;
        }
        j jVarPlus = jVar.plus(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : k.f48060a).plus(motionDurationScaleImpl);
        final Recomposer recomposer = new Recomposer(jVarPlus);
        recomposer.pauseCompositionFrameClock();
        final af afVarE = aj.e(jVarPlus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.cancel();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }
            });
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$WhenMappings */
                public final /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                    switch (event.ordinal()) {
                        case 0:
                            aj.z(afVarE, null, ag.f51345d, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(aqVar, recomposer, lifecycleOwner2, this, null), 1);
                            return;
                        case 1:
                            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = pausableMonotonicFrameClock;
                            if (pausableMonotonicFrameClock2 != null) {
                                pausableMonotonicFrameClock2.resume();
                            }
                            recomposer.resumeCompositionFrameClock();
                            return;
                        case 2:
                        case 3:
                        case 6:
                            return;
                        case 4:
                            recomposer.pauseCompositionFrameClock();
                            return;
                        case 5:
                            recomposer.cancel();
                            return;
                        default:
                            throw new i();
                    }
                }
            });
            return recomposer;
        }
        Objects.toString(view);
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("ViewTreeLifecycleOwner not found from ".concat(String.valueOf(view)));
        throw new e();
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, j jVar, Lifecycle lifecycle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jVar = k.f48060a;
        }
        if ((i2 & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, jVar, lifecycle);
    }

    public static final CompositionContext findViewTreeCompositionContext(View view) {
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        Object parent = view.getParent();
        while (compositionContext == null && (parent instanceof View)) {
            View view2 = (View) parent;
            compositionContext = getCompositionContext(view2);
            parent = ViewTree.getParentOrViewTreeDisjointParent(view2);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final ch<Float> getAnimationScaleFlowFor(Context context) {
        ch<Float> chVar;
        MutableScatterMap<Context, ch<Float>> mutableScatterMap = animationScale;
        synchronized (mutableScatterMap) {
            ch<Float> chVarV = mutableScatterMap.get(context);
            if (chVarV == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                final o oVarC = w.c(-1, null, null, 6);
                final Handler handlerCreateAsync = HandlerCompat.createAsync(Looper.getMainLooper());
                b bVar = new b(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(handlerCreateAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z, Uri uri) {
                        oVarC.i(ab.f48028a);
                    }
                }, oVarC, context, null));
                af afVarF = aj.f();
                int i2 = bz.f51630a;
                chVarV = ai.V(bVar, afVarF, by.a(0L, 3), Float.valueOf(readAnimationScale(context)));
                mutableScatterMap.set(context, chVarV);
            }
            chVar = chVarV;
        }
        return chVar;
    }

    public static final CompositionContext getCompositionContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    public static final View getContentChild(View view) {
        Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
        while (parentOrViewTreeDisjointParent instanceof View) {
            View view2 = (View) parentOrViewTreeDisjointParent;
            if (view2.getId() == 16908290) {
                break;
            }
            parentOrViewTreeDisjointParent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final Recomposer getWindowRecomposer(View view) {
        if (!view.isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View contentChild = getContentChild(view);
        CompositionContext compositionContext = getCompositionContext(contentChild);
        if (compositionContext == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui(contentChild);
        }
        if (compositionContext instanceof Recomposer) {
            return (Recomposer) compositionContext;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float readAnimationScale(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static final void setCompositionContext(View view, CompositionContext compositionContext) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }
}
