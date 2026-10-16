package androidx.compose.foundation.lazy;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyListItemInfo {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyListItemInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object $default$getContentType(LazyListItemInfo lazyListItemInfo) {
            return null;
        }
    }

    Object getContentType();

    int getIndex();

    Object getKey();

    int getOffset();

    int getSize();
}
