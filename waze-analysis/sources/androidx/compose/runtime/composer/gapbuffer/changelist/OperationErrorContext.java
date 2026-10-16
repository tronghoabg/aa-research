package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface OperationErrorContext {
    List<ComposeStackTraceFrame> buildStackTrace(Integer num);

    boolean getSourceInformationEnabled();
}
