package androidx.compose.ui.text.font;

import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PlatformFontLoader {
    Object awaitLoad(Font font, e<Object> eVar);

    Object getCacheKey();

    Object loadBlocking(Font font);
}
