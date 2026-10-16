package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StringAnnotationKt {
    public static final AnnotatedString.Range<String> unbox(AnnotatedString.Range<? extends AnnotatedString.Annotation> range) {
        AnnotatedString.Annotation item = range.getItem();
        x.d(item, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new AnnotatedString.Range<>(((StringAnnotation) item).m10500unboximpl(), range.getStart(), range.getEnd(), range.getTag());
    }
}
