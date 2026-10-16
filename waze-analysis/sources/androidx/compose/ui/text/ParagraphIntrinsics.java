package androidx.compose.ui.text;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ParagraphIntrinsics {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.ParagraphIntrinsics$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$getHasStaleResolvedFonts(ParagraphIntrinsics paragraphIntrinsics) {
            return false;
        }
    }

    boolean getHasStaleResolvedFonts();

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();
}
