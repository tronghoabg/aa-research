package androidx.compose.ui.text.android;

import android.text.StaticLayout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
interface StaticLayoutFactoryImpl {
    StaticLayout create(StaticLayoutParams staticLayoutParams);

    boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z);
}
