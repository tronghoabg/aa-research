package androidx.compose.ui.layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Measured {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.Measured$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object $default$getParentData(Measured measured) {
            return null;
        }
    }

    int get(AlignmentLine alignmentLine);

    int getMeasuredHeight();

    int getMeasuredWidth();

    Object getParentData();
}
