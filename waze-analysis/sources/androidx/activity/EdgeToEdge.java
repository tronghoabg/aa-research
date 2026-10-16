package androidx.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.SystemBarStyle;
import androidx.core.view.ViewGroupKt;
import com.waze.strings.DisplayStrings;
import h.g.a.l;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EdgeToEdge {
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_2, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.activity.EdgeToEdge$enableEdgeToEdge$1$2] */
    public static final void enable(final ComponentActivity componentActivity, final SystemBarStyle systemBarStyle, final SystemBarStyle systemBarStyle2) {
        x.f(componentActivity, "<this>");
        x.f(systemBarStyle, "statusBarStyle");
        x.f(systemBarStyle2, "navigationBarStyle");
        final View decorView = componentActivity.getWindow().getDecorView();
        x.e(decorView, "getDecorView(...)");
        EdgeToEdgeImpl edgeToEdgeApi35 = Impl;
        if (edgeToEdgeApi35 == null) {
            edgeToEdgeApi35 = Build.VERSION.SDK_INT >= 35 ? new EdgeToEdgeApi35() : Build.VERSION.SDK_INT >= 30 ? new EdgeToEdgeApi30() : new EdgeToEdgeApi29();
            Impl = edgeToEdgeApi35;
        }
        final EdgeToEdgeImpl edgeToEdgeImpl = edgeToEdgeApi35;
        final Runnable runnable = new Runnable() { // from class: androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                EdgeToEdge.enableEdgeToEdge$lambda$1(edgeToEdgeImpl, systemBarStyle, systemBarStyle2, componentActivity, decorView);
            }
        };
        ViewGroup viewGroup = (ViewGroup) decorView;
        Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (true) {
            if (!it.hasNext()) {
                final Context context = viewGroup.getContext();
                ?? r8 = new View(context) { // from class: androidx.activity.EdgeToEdge$enableEdgeToEdge$1$2
                    @Override // android.view.View
                    protected void onConfigurationChanged(Configuration configuration) {
                        x.f(configuration, "newConfig");
                        runnable.run();
                    }
                };
                r8.setTag(edgeToEdgeImpl);
                r8.setVisibility(8);
                r8.setWillNotDraw(true);
                viewGroup.addView((View) r8);
                break;
            }
            if (it.next().getTag() instanceof EdgeToEdgeImpl) {
                break;
            }
        }
        runnable.run();
        Window window = componentActivity.getWindow();
        x.e(window, "getWindow(...)");
        edgeToEdgeImpl.adjustLayoutInDisplayCutoutMode(window);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if ((i2 & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    static final void enableEdgeToEdge$lambda$1(EdgeToEdgeImpl edgeToEdgeImpl, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, ComponentActivity componentActivity, View view) {
        Window window = componentActivity.getWindow();
        x.e(window, "getWindow(...)");
        l<Resources, Boolean> detectDarkMode$activity = systemBarStyle.getDetectDarkMode$activity();
        Resources resources = view.getResources();
        x.e(resources, "getResources(...)");
        boolean zBooleanValue = detectDarkMode$activity.invoke(resources).booleanValue();
        l<Resources, Boolean> detectDarkMode$activity2 = systemBarStyle2.getDetectDarkMode$activity();
        Resources resources2 = view.getResources();
        x.e(resources2, "getResources(...)");
        edgeToEdgeImpl.setUp(systemBarStyle, systemBarStyle2, window, view, zBooleanValue, detectDarkMode$activity2.invoke(resources2).booleanValue());
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle systemBarStyle) {
        x.f(componentActivity, "<this>");
        x.f(systemBarStyle, "statusBarStyle");
        enable$default(componentActivity, systemBarStyle, null, 2, null);
    }

    public static final void enable(ComponentActivity componentActivity) {
        x.f(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }
}
